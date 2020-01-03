package com.example.MyMovie.networking;

import com.example.MyMovie.BuildConfig;
import com.example.MyMovie.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ApiService {

    @GET("search/movie?api_key="+ BuildConfig.API_KEY)
    Call<MovieResponse> getItemSearch(@Query("query") String movie_name);

    @GET("movie/now_playing")
    Call<MovieResponse> getNowPlaying(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<MovieResponse> getUpcoming(@Query("api_key") String apiKey);

//    @GET("movie/top_rated")
//    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
//    @GET("movie/{id}")
//    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

}
