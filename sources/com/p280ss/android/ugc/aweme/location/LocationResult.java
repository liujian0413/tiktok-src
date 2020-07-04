package com.p280ss.android.ugc.aweme.location;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.location.LocationResult */
public final class LocationResult implements Serializable {
    private float accuracy;
    private String address;
    private String city;
    private String country;
    private String district;
    private boolean isGaode;
    private double latitude;
    private double longitude;
    private String province;
    private long time;

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getProvince() {
        return this.province;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean isGaode() {
        return this.isGaode;
    }

    public final boolean isValid() {
        if (this.latitude == 0.0d || this.longitude == 0.0d) {
            return false;
        }
        return true;
    }

    public final void setAccuracy(float f) {
        this.accuracy = f;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final void setGaode(boolean z) {
        this.isGaode = z;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setProvince(String str) {
        this.province = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
