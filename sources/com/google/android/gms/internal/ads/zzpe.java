package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public final class zzpe extends Exception {
    private final String mimeType;
    private final String zzaer;
    private final String zzaes;
    private final boolean zzbhp;

    public zzpe(zzlg zzlg, Throwable th, boolean z, int i) {
        String valueOf = String.valueOf(zzlg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.mimeType = zzlg.f45713c;
        this.zzbhp = false;
        this.zzaer = null;
        String str = i < 0 ? "neg_" : "";
        int abs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(abs);
        this.zzaes = sb2.toString();
    }

    public zzpe(zzlg zzlg, Throwable th, boolean z, String str) {
        String valueOf = String.valueOf(zzlg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(valueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.mimeType = zzlg.f45713c;
        this.zzbhp = false;
        this.zzaer = str;
        String str2 = null;
        if (bsf.f43399a >= 21 && (th instanceof CodecException)) {
            str2 = ((CodecException) th).getDiagnosticInfo();
        }
        this.zzaes = str2;
    }
}
