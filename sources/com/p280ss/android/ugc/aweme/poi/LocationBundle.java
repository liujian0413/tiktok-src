package com.p280ss.android.ugc.aweme.poi;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.LocationBundle */
public class LocationBundle implements Serializable {
    public float accuracy;
    public String address;
    public String city;
    public String country;
    public String district;
    public boolean isGaode;
    public double latitude;
    public double longitude;
    public String province;
    public long time;

    public boolean isValid() {
        if (this.latitude == 0.0d || this.longitude == 0.0d) {
            return false;
        }
        return true;
    }
}
