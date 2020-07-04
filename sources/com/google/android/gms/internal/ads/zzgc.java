package com.google.android.gms.internal.ads;

public final class zzgc extends Exception {
    private final boolean zzabs;

    public zzgc(String str) {
        super(str);
    }

    public zzgc(Throwable th) {
        super(th);
    }

    zzgc(Throwable th, boolean z) {
        super(th);
        this.zzabs = true;
    }
}
