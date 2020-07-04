package com.google.android.gms.internal.ads;

public enum zzbl implements axx {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    
    private static final axy<zzbl> zzef = null;
    private final int value;

    public final int zzac() {
        return this.value;
    }

    public static zzbl zzd(int i) {
        switch (i) {
            case 0:
                return ENUM_SIGNAL_SOURCE_UNKNOWN;
            case 1:
                return ENUM_SIGNAL_SOURCE_DISABLE;
            case 2:
                return ENUM_SIGNAL_SOURCE_ADSHIELD;
            case 3:
                return ENUM_SIGNAL_SOURCE_GASS;
            case 4:
                return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
            default:
                return null;
        }
    }

    public static axz zzad() {
        return alw.f40614a;
    }

    private zzbl(int i) {
        this.value = i;
    }

    static {
        zzef = new akv();
    }
}
