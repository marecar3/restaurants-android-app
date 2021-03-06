package com.markosolutions.googleplace.restaurant.data.entity;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

public class ReviewEntity extends RealmObject {

    @SerializedName("author_name")
    private String mAuthorName;

    @SerializedName("rating")
    private int mRating;

    @SerializedName("text")
    private String mText;

    public String getAuthorName() {
        return mAuthorName;
    }

    public int getRating() {
        return mRating;
    }

    public String getText() {
        return mText;
    }
}
