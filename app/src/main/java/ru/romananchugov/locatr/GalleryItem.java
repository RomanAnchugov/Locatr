package ru.romananchugov.locatr;

import android.net.Uri;

/**
 * Created by romananchugov on 27.12.2017.
 */

public class GalleryItem {
    private String title;
    private String id;
    private String url_s;
    private String mOwner;
    private double mLat;
    private double mLon;

    @Override
    public String toString() {
        return title;
    }

    public String getmCaption() {
        return title;
    }

    public void setmCaption(String mCaption) {
        this.title = mCaption;
    }

    public String getmId() {
        return id;
    }

    public void setmId(String mId) {
        this.id = mId;
    }

    public String getmUri() {
        return url_s;
    }

    public void setmUri(String mUri) {
        this.url_s = mUri;
    }

    public String getmOwner() {
        return mOwner;
    }
    public void setmOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public Uri getPhotoPageUri(){
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(id)
                .build();
    }

    public double getmLat() {
        return mLat;
    }

    public void setmLat(double mLat) {
        this.mLat = mLat;
    }

    public double getmLon() {
        return mLon;
    }

    public void setmLon(double mLon) {
        this.mLon = mLon;
    }
}
