package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.location.C32639p;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.model.Address;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.aa */
public final class C35441aa {
    /* renamed from: a */
    public static boolean m114459a(Context context, PoiStruct poiStruct) {
        String str;
        if (poiStruct == null || context == null) {
            return false;
        }
        LocationResult a = C32640a.m105721a().mo84021a();
        if (a == null || !a.isValid()) {
            return false;
        }
        Address address = poiStruct.getAddress();
        String poiLatitude = poiStruct.getPoiLatitude();
        String poiLongitude = poiStruct.getPoiLongitude();
        if (address == null) {
            str = "";
        } else {
            str = address.getCity();
        }
        return m114460a(a, poiLatitude, poiLongitude, str);
    }

    /* renamed from: a */
    public static boolean m114462a(PoiStruct poiStruct, LocationResult locationResult) {
        String str;
        if (poiStruct == null || locationResult == null || !locationResult.isValid()) {
            return false;
        }
        Address address = poiStruct.getAddress();
        String poiLatitude = poiStruct.getPoiLatitude();
        String poiLongitude = poiStruct.getPoiLongitude();
        if (address == null) {
            str = "";
        } else {
            str = address.getCity();
        }
        return m114460a(locationResult, poiLatitude, poiLongitude, str);
    }

    /* renamed from: a */
    public static boolean m114463a(PoiStruct poiStruct, LocationBundle locationBundle) {
        String str;
        if (poiStruct == null || locationBundle == null || !locationBundle.isValid()) {
            return false;
        }
        Address address = poiStruct.getAddress();
        String poiLatitude = poiStruct.getPoiLatitude();
        String poiLongitude = poiStruct.getPoiLongitude();
        if (address == null) {
            str = "";
        } else {
            str = address.getCity();
        }
        return m114461a(locationBundle, poiLatitude, poiLongitude, str);
    }

    /* renamed from: a */
    public static boolean m114460a(LocationResult locationResult, String str, String str2, String str3) {
        String str4;
        if (!C32640a.m105723a(C6399b.m19921a())) {
            return false;
        }
        if (locationResult == null) {
            str4 = "";
        } else {
            str4 = locationResult.getCity();
        }
        if (!C6399b.m19944t() && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            String lowerCase = str4.toLowerCase();
            String lowerCase2 = str3.toLowerCase();
            if (lowerCase.length() > lowerCase2.length()) {
                return lowerCase.contains(lowerCase2);
            }
            return lowerCase2.contains(lowerCase);
        } else if (locationResult == null || !locationResult.isValid() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            try {
                if (C35442b.m114465a(Double.parseDouble(str), Double.parseDouble(str2), locationResult.getLatitude(), locationResult.getLongitude()) < 50.0d) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    private static boolean m114461a(LocationBundle locationBundle, String str, String str2, String str3) {
        String str4;
        if (!C32639p.m105712a(C6399b.m19921a())) {
            return false;
        }
        if (locationBundle == null) {
            str4 = "";
        } else {
            str4 = locationBundle.city;
        }
        if (!C6399b.m19944t() && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
            String lowerCase = str4.toLowerCase();
            String lowerCase2 = str3.toLowerCase();
            if (lowerCase.length() > lowerCase2.length()) {
                return lowerCase.contains(lowerCase2);
            }
            return lowerCase2.contains(lowerCase);
        } else if (locationBundle == null || !locationBundle.isValid() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        } else {
            try {
                if (C35442b.m114465a(Double.parseDouble(str), Double.parseDouble(str2), locationBundle.latitude, locationBundle.longitude) < 50.0d) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
