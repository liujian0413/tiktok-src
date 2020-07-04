package com.google.android.gms.internal.ads;

public enum zzbwh implements axx {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final axy<zzbwh> zzef = null;
    private final int value;

    public final int zzac() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzbwh zzek(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    private zzbwh(int i) {
        this.value = i;
    }

    static {
        zzef = new atl();
    }
}
