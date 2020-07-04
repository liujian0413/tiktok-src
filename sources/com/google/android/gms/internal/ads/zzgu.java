package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public final class zzgu extends Exception {
    private final String zzaer;
    private final String zzaes;

    public zzgu(bhl bhl, Throwable th, int i) {
        String valueOf = String.valueOf(bhl);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.zzaer = null;
        String str = i < 0 ? "neg_" : "";
        int abs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
        sb2.append("com.google.android.gms.ads.exoplayer1.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(abs);
        this.zzaes = sb2.toString();
    }

    public zzgu(bhl bhl, Throwable th, String str) {
        String valueOf = String.valueOf(bhl);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(valueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.zzaer = str;
        String str2 = null;
        if (bkn.f42386a >= 21 && (th instanceof CodecException)) {
            str2 = ((CodecException) th).getDiagnosticInfo();
        }
        this.zzaes = str2;
    }
}
