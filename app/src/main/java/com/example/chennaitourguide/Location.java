package com.example.chennaitourguide;

public class Location {
    private int mImageResourceId;
    private int mNameStringId;
    private int mAddressStringId;


    Location(int mImageResourceId, int mNameStringId, int mAddressStringIdd) {
        this.mImageResourceId = mImageResourceId;
        this.mNameStringId = mNameStringId;
        this.mAddressStringId = mAddressStringId;
    }
    public int getContext() {
       return mAddressStringId;

    }

    public int getItem(int position) {
      return mAddressStringId;
    }
    int getImageResourceId() {
        return mImageResourceId;
    }

    int getNameStringId() {
        return mNameStringId;
    }

    int getAddressStringId() {
        return mAddressStringId;
    }

}
