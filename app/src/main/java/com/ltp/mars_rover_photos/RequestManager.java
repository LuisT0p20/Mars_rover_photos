package com.ltp.mars_rover_photos;

import android.content.Context;

import com.ltp.mars_rover_photos.Model.PhotosApiResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RequestManager {
    Context context;
    Retrofit retrofit = new Retrofit.Builder().
            baseUrl("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public RequestManager(Context context) {
        this.context = context;
    }

    public interface CallMarsApi{
        @GET("photos")
        Call<PhotosApiResponse> CallMarsDates(
                @Query("sol") String sol,
                @Query("camera") String camera,
                @Query("page") String page,
                @Query("api_key") String api_key
        );
    }
}
