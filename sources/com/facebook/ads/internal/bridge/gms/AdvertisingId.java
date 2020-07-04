package com.facebook.ads.internal.bridge.gms;

import android.content.Context;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;

public class AdvertisingId {
    private final String mId;
    private final boolean mLimitAdTracking;

    public String getId() {
        return this.mId;
    }

    public boolean isLimitAdTracking() {
        return this.mLimitAdTracking;
    }

    public static AdvertisingId getAdvertisingIdInfoDirectly(Context context) {
        try {
            C14734a a = C14733a.m42585a(context);
            if (a != null) {
                return new AdvertisingId(a.f38079a, a.f38080b);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public AdvertisingId(String str, boolean z) {
        this.mId = str;
        this.mLimitAdTracking = z;
    }
}
