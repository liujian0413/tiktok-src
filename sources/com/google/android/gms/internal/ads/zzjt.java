package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzjt extends IOException {
    private final String zzaqg;

    public zzjt(String str) {
        String str2 = "Unsupported URI scheme: ";
        String valueOf = String.valueOf(str);
        super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.zzaqg = str;
    }
}
