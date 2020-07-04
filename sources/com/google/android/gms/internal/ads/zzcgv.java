package com.google.android.gms.internal.ads;

public enum zzcgv {
    DOUBLE(zzcha.DOUBLE, 1),
    FLOAT(zzcha.FLOAT, 5),
    INT64(zzcha.LONG, 0),
    UINT64(zzcha.LONG, 0),
    INT32(zzcha.INT, 0),
    FIXED64(zzcha.LONG, 1),
    FIXED32(zzcha.INT, 5),
    BOOL(zzcha.BOOLEAN, 0),
    STRING(zzcha.STRING, 2),
    GROUP(zzcha.MESSAGE, 3),
    MESSAGE(zzcha.MESSAGE, 2),
    BYTES(zzcha.BYTE_STRING, 2),
    UINT32(zzcha.INT, 0),
    ENUM(zzcha.ENUM, 0),
    SFIXED32(zzcha.INT, 5),
    SFIXED64(zzcha.LONG, 1),
    SINT32(zzcha.INT, 0),
    SINT64(zzcha.LONG, 0);
    
    private final zzcha zzgew;
    private final int zzgex;

    private zzcgv(zzcha zzcha, int i) {
        this.zzgew = zzcha;
        this.zzgex = i;
    }

    public final zzcha zzawa() {
        return this.zzgew;
    }

    public final int zzawb() {
        return this.zzgex;
    }
}
