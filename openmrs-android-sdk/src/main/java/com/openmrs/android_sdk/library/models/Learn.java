package com.openmrs.android_sdk.library.models;

public class Learn {

    int title;
    int definition;

    public Learn(int title, int definition) {
        this.title = title;
        this.definition = definition;
    }

    public int getTitle() {
        return title;
    }

    public int getDefinition() {
        return definition;
    }
}
