package com.uas.si6tj.edosen;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface EDosenJsonPlaceHolderAPI {
    @GET("edosen.php")
    Call<List<EDosenPost>> getPosts(

    );
    @GET("edosen.php")
    Call<List<EDosenPost>> getPosts(@QueryMap Map<String, String> parameters);
}
