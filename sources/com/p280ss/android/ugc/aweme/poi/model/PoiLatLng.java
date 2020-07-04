package com.p280ss.android.ugc.aweme.poi.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiLatLng */
public class PoiLatLng implements Serializable {
    public String address;
    public double latitude;
    public double longitude;
    public String name;
    public float zoom;

    public PoiLatLng() {
    }

    public PoiLatLng(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }
}
