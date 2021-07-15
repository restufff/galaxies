package com.rf.galaxy.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Galaxy implements Parcelable {

    private String name, scale, photo, descrption, distance, year, cons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public static Creator<Galaxy> getCREATOR() {
        return CREATOR;
    }

    public Galaxy() {
    }

    protected Galaxy(Parcel in) {
        name = in.readString();
        scale = in.readString();
        photo = in.readString();
        descrption = in.readString();
        distance = in.readString();
        year = in.readString();
        cons = in.readString();
    }

    public static final Creator<Galaxy> CREATOR = new Creator<Galaxy>() {
        @Override
        public Galaxy createFromParcel(Parcel in) {
            return new Galaxy(in);
        }

        @Override
        public Galaxy[] newArray(int size) {
            return new Galaxy[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(scale);
        parcel.writeString(photo);
        parcel.writeString(descrption);
        parcel.writeString(distance);
        parcel.writeString(year);
        parcel.writeString(cons);
    }
}
