package com.p280ss.android.ugc.aweme.poi.utils;

import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.e */
public final class C35445e {

    /* renamed from: a */
    public static final C35445e f92954a = new C35445e();

    private C35445e() {
    }

    /* renamed from: a */
    public static LocationBundle m114497a(LocationResult locationResult) {
        if (locationResult == null) {
            return null;
        }
        LocationBundle locationBundle = new LocationBundle();
        locationBundle.time = locationResult.getTime();
        locationBundle.isGaode = locationResult.isGaode();
        locationBundle.latitude = locationResult.getLatitude();
        locationBundle.longitude = locationResult.getLongitude();
        locationBundle.country = locationResult.getCountry();
        locationBundle.province = locationResult.getProvince();
        locationBundle.city = locationResult.getCity();
        locationBundle.district = locationResult.getDistrict();
        locationBundle.address = locationResult.getAddress();
        locationBundle.accuracy = locationResult.getAccuracy();
        return locationBundle;
    }
}
