package com.google.android.gms.internal.ads;

public enum zzby implements axx {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    
    private static final axy<zzby> zzef = null;
    private final int value;

    public final int zzac() {
        return this.value;
    }

    public static zzby zzi(int i) {
        if (i == 1000) {
            return ENUM_UNKNOWN;
        }
        switch (i) {
            case 0:
                return ENUM_FALSE;
            case 1:
                return ENUM_TRUE;
            case 2:
                return ENUM_FAILURE;
            default:
                return null;
        }
    }

    public static axz zzad() {
        return auy.f41074a;
    }

    private zzby(int i) {
        this.value = i;
    }

    static {
        zzef = new aul();
    }
}
