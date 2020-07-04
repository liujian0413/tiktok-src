package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;
import android.view.Surface;

final class ajl implements bhj {

    /* renamed from: a */
    private final /* synthetic */ aiw f40415a;

    ajl(aiw aiw) {
        this.f40415a = aiw;
    }

    /* renamed from: a */
    public final void mo39511a(Surface surface) {
    }

    /* renamed from: a */
    public final void mo39503a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo39510a(int i, long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dropped frames. Count: ");
        sb.append(i);
        sb.append(" Elapsed: ");
        sb.append(j);
        acd.m45777b(sb.toString());
    }

    /* renamed from: a */
    public final void mo39509a(int i, int i2, float f) {
        this.f40415a.f40386w = i;
        this.f40415a.f40387x = i2;
        this.f40415a.f40388y = f;
        this.f40415a.m46055a(this.f40415a.f40386w, this.f40415a.f40387x, this.f40415a.f40388y);
    }

    /* renamed from: a */
    public final void mo39500a(zzgu zzgu) {
        this.f40415a.m46061b("DecoderInitializationError", zzgu.getMessage());
    }

    /* renamed from: a */
    public final void mo39498a(CryptoException cryptoException) {
        this.f40415a.m46061b("CryptoError", cryptoException.getMessage());
    }
}
