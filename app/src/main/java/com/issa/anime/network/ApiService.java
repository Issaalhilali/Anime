package com.issa.anime.network;

import com.issa.anime.model.Admob;
import com.issa.anime.model.Cartoon;
import com.issa.anime.model.Episode;
import com.issa.anime.model.Playlist;
import com.issa.anime.model.Report;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @POST("report/create.php")
    Single<String> createReport(@Body Report paramReport);

    @GET("admob/readOne.php")
    Single<Admob> getAdmob();

    @GET("cartoon/readPaging.php")
    Single<List<Cartoon>> getCartoons(@Query("page") int paramInt);

    @GET("cartoon/readPagingByType.php")
    Single<List<Cartoon>> getCartoonsByType(@Query("page") int paramInt1, @Query("type") int paramInt2);

    @FormUrlEncoded
    @POST("episode/readPaging.php")
    Single<List<Episode>> getEpisodes(@Field("playlist_id") int paramInt1, @Query("page") int paramInt2);

    @FormUrlEncoded
    @POST("playlist/read.php")
    Single<List<Playlist>> getPlaylists(@Field("cartoon_id") int paramInt);

    @GET("cartoon/search.php")
    Single<List<Cartoon>> searchCartoons(@Query("s") String paramString);
}
