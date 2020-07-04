package com.google.android.gms.internal.ads;

public enum zzbv implements axx {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);
    
    private static final axy<zzbv> zzef = null;
    private final int value;

    public final int zzac() {
        return this.value;
    }

    public static zzbv zzh(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENCRYPTION_METHOD;
            case 1:
                return BITSLICER;
            case 2:
                return TINK_HYBRID;
            case 3:
                return UNENCRYPTED;
            default:
                return null;
        }
    }

    public static axz zzad() {
        return auc.f41033a;
    }

    private zzbv(int i) {
        this.value = i;
    }

    static {
        zzef = new ate();
    }
}
