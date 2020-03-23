package com.example.dd;

public class Items {

    public String mImageUrl;
    public String mTitle;
    public String mDescription;
    public String mUrl;
    public int mPublished;
    public String mContent;

    public Items(String mImageUrl, String mTitle, String mDescription, String mUrl, int mPublished, String mContent) {
        this.mImageUrl = mImageUrl;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mUrl = mUrl;
        this.mPublished = mPublished;
        this.mContent = mContent;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmUrl() {
        return mUrl;
    }

    public int getmPublished() {
        return mPublished;
    }

    public String getmContent() {
        return mContent;
    }
}
