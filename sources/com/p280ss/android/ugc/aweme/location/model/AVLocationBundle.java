package com.p280ss.android.ugc.aweme.location.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.location.model.AVLocationBundle */
public final class AVLocationBundle implements Serializable {
    private final float accuracy;
    private final double latitude;
    private final long locateTime;
    private final double longitude;

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final long getLocateTime() {
        return this.locateTime;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean isValid() {
        if (this.latitude == 0.0d || this.longitude == 0.0d) {
            return false;
        }
        return true;
    }

    public AVLocationBundle(double d, double d2, long j, float f) {
        this.latitude = d;
        this.longitude = d2;
        this.locateTime = j;
        this.accuracy = f;
    }
}
