package com.openmrs.android_sdk.library.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PatientSearchResponse {
    @SerializedName("results")
    private List<Patient> patients;

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}

