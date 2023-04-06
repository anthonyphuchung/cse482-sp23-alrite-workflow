package com.ug.air.alrite.APIs;

import com.ug.air.alrite.Models.Patient;
import com.ug.air.alrite.Models.PatientSearchResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface OpenMRSAPI {
    @GET("ws/rest/v1/patient/{uuid}")
    Call<Patient> getPatient(@Path("uuid") String uuid);

    @GET("ws/rest/v1/patient")
    Call<PatientSearchResponse> searchPatients(@Query("q") String query);
}
