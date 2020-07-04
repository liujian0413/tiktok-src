package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzkc extends IOException {
    public zzkc(Exception exc) {
        String valueOf = String.valueOf(exc.getClass().getSimpleName());
        String valueOf2 = String.valueOf(exc.getMessage());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append("Unexpected ");
        sb.append(valueOf);
        sb.append(": ");
        sb.append(valueOf2);
        super(sb.toString(), exc);
    }
}
