package com.google.android.gms.internal.ads;

public final class zzlx extends Exception {
    public zzlx(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(78);
        sb.append("Unhandled format: ");
        sb.append(i);
        sb.append(" Hz, ");
        sb.append(i2);
        sb.append(" channels in encoding ");
        sb.append(i3);
        super(sb.toString());
    }
}
