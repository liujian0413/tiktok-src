package com.google.android.gms.internal.ads;

public enum zzxt implements axx {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final axy<zzxt> zzef = null;
    private final int value;

    public final int zzac() {
        return this.value;
    }

    public static zzxt zzcc(int i) {
        if (i == 1000) {
            return ENUM_UNKNOWN;
        }
        switch (i) {
            case 0:
                return ENUM_FALSE;
            case 1:
                return ENUM_TRUE;
            default:
                return null;
        }
    }

    public static axz zzad() {
        return bwy.f44072a;
    }

    private zzxt(int i) {
        this.value = i;
    }

    static {
        zzef = new bwx();
    }
}
