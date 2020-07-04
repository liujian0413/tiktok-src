package com.google.android.gms.internal.measurement;

public enum zzxs {
    DOUBLE(zzxx.DOUBLE, 1),
    FLOAT(zzxx.FLOAT, 5),
    INT64(zzxx.LONG, 0),
    UINT64(zzxx.LONG, 0),
    INT32(zzxx.INT, 0),
    FIXED64(zzxx.LONG, 1),
    FIXED32(zzxx.INT, 5),
    BOOL(zzxx.BOOLEAN, 0),
    STRING(zzxx.STRING, 2),
    GROUP(zzxx.MESSAGE, 3),
    MESSAGE(zzxx.MESSAGE, 2),
    BYTES(zzxx.BYTE_STRING, 2),
    UINT32(zzxx.INT, 0),
    ENUM(zzxx.ENUM, 0),
    SFIXED32(zzxx.INT, 5),
    SFIXED64(zzxx.LONG, 1),
    SINT32(zzxx.INT, 0),
    SINT64(zzxx.LONG, 0);
    
    private final zzxx zzcdz;
    private final int zzcea;

    private zzxs(zzxx zzxx, int i) {
        this.zzcdz = zzxx;
        this.zzcea = i;
    }

    public final zzxx zzyv() {
        return this.zzcdz;
    }

    public final int zzyw() {
        return this.zzcea;
    }
}
