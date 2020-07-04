package com.google.android.gms.internal.measurement;

public enum zzbt {
    NONE,
    GZIP;

    public static zzbt zzaa(String str) {
        if ("GZIP".equalsIgnoreCase(str)) {
            return GZIP;
        }
        return NONE;
    }
}
