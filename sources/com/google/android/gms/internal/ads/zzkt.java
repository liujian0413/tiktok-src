package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzkt extends Exception {
    private final int type;
    private final int zzarn;

    public static zzkt zza(Exception exc, int i) {
        return new zzkt(1, null, exc, i);
    }

    public static zzkt zza(IOException iOException) {
        return new zzkt(0, null, iOException, -1);
    }

    static zzkt zza(RuntimeException runtimeException) {
        return new zzkt(2, null, runtimeException, -1);
    }

    private zzkt(int i, String str, Throwable th, int i2) {
        super(null, th);
        this.type = i;
        this.zzarn = i2;
    }
}
