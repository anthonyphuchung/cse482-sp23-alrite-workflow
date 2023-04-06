package com.ug.air.alrite.Models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Patient {
    @SerializedName("uuid")
    private String uuid;

    @SerializedName("display")
    private String display;

    @SerializedName("person")
    private Person person;

    // Add any other fields as necessary
    private String age;
    private String sex;
    private String initial;
    private String parent;
    private String date;
    private String filename;

    private boolean reassess;

    // Add getters and setters for the fields
    public Patient(String age, String sex, String initial, String parent, String date, String filename, boolean reassess) {
        this.age = age;
        this.sex = sex;
        this.initial = initial;
        this.parent = parent;
        this.date = date;
        this.filename = filename;
        this.reassess = reassess;
    }

    public String getUuid() {
        return uuid;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getInitial() {
        return initial;
    }

    public String getParent() {
        return parent;
    }

    public String getDate() {
        return date;
    }
    public String getFilename() {
        return filename;
    }

    public boolean getReassess() {
        return reassess;
    }
}

class Person {
    @SerializedName("uuid")
    private String uuid;

    @SerializedName("display")
    private String display;

    @SerializedName("gender")
    private String gender;

    @SerializedName("age")
    private int age;

    @SerializedName("birthdate")
    private String birthdate;

    @SerializedName("birthdateEstimated")
    private boolean birthdateEstimated;

    @SerializedName("dead")
    private boolean dead;

    @SerializedName("deathDate")
    private String deathDate;

    @SerializedName("causeOfDeath")
    private Object causeOfDeath;

    @SerializedName("preferredName")
    private PreferredName preferredName;

    @SerializedName("preferredAddress")
    private PreferredAddress preferredAddress;

    @SerializedName("attributes")
    private List<Attribute> attributes;

    // Add any other fields as necessary

    // Add getters and setters for the fields
}

class PreferredName {
    @SerializedName("uuid")
    private String uuid;

    @SerializedName("display")
    private String display;

    // Add any other fields as necessary

    // Add getters and setters for the fields
}

class PreferredAddress {
    @SerializedName("uuid")
    private String uuid;

    @SerializedName("display")
    private String display;

    // Add any other fields as necessary

    // Add getters and setters for the fields
}

class Attribute {
    @SerializedName("uuid")
    private String uuid;

    @SerializedName("display")
    private String display;

    // Add any other fields as necessary

    // Add getters and setters for the fields
}
