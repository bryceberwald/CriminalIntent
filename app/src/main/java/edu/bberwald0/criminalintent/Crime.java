package edu.bberwald0.criminalintent;

import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;


    public Crime() {
        //Generate a unique identifier
        mId = UUID.randomUUID();
    }

    //Getters and Setters
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


}
