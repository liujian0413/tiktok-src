package com.google.android.gms.internal.ads;

public final class zzmo extends Exception {
    private final int errorCode;

    public zzmo(int i) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.errorCode = i;
    }
}
