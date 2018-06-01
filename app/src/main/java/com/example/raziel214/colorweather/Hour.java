package com.example.raziel214.colorweather;

import android.os.Parcel;
import android.os.Parcelable;

public class Hour implements Parcelable {

    private String title;
    private String wheaterDescription;


    public Hour(){}

    protected Hour(Parcel in) {
        title = in.readString();
        wheaterDescription = in.readString();
    }

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel in) {
            return new Hour(in);
        }

        @Override
        public Hour[] newArray(int size) {
            return new Hour[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWheaterDescription() {
        return wheaterDescription;
    }

    public void setWheaterDescription(String wheaterDescription) {
        this.wheaterDescription = wheaterDescription;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(title);
        dest.writeString(wheaterDescription);

    }
}
