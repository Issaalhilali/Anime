package com.issa.anime.network;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient {
    private static int REQUEST_TIMEOUT = 60;

    private static OkHttpClient okHttpClient;

    private static Retrofit retrofit;

    static  {

    }

    public static Retrofit getClient(Context paramContext) {
        if (okHttpClient == null)
            initOkHttp(paramContext);
        if (retrofit == null)
            retrofit = (new Retrofit.Builder()).baseUrl("http://mohannadapp.com/WorldCartoonsAnime/API/").client(okHttpClient).addConverterFactory(ScalarsConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

    private static void initOkHttp(Context paramContext) {
        OkHttpClient.Builder builder = (new OkHttpClient()).newBuilder().connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS).readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS).writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(httpLoggingInterceptor);
        builder.addInterceptor(new Interceptor() {
            public Response intercept(Chain param1Chain) throws IOException { return param1Chain.proceed(param1Chain.request().newBuilder().addHeader("Accept", "application/json").addHeader("Content-Type", "application/json").build()); }
        });
        okHttpClient = builder.build();
    }
}
