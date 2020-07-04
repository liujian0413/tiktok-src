package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;
import android.view.Surface;
import java.lang.ref.WeakReference;

final class aiv implements bhj {

    /* renamed from: a */
    private WeakReference<bhj> f40360a;

    /* renamed from: b */
    private final /* synthetic */ aip f40361b;

    private aiv(aip aip) {
        this.f40361b = aip;
        this.f40360a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo39512a(bhj bhj) {
        this.f40360a = new WeakReference<>(bhj);
    }

    /* renamed from: a */
    public final void mo39510a(int i, long j) {
        bhj bhj = (bhj) this.f40360a.get();
        if (bhj != null) {
            bhj.mo39510a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo39509a(int i, int i2, float f) {
        bhj bhj = (bhj) this.f40360a.get();
        if (bhj != null) {
            bhj.mo39509a(i, i2, f);
        }
    }

    /* renamed from: a */
    public final void mo39511a(Surface surface) {
        bhj bhj = (bhj) this.f40360a.get();
        if (bhj != null) {
            bhj.mo39511a(surface);
        }
    }

    /* renamed from: a */
    public final void mo39500a(zzgu zzgu) {
        this.f40361b.m46026a("DecoderInitializationError", zzgu.getMessage());
        bhj bhj = (bhj) this.f40360a.get();
        if (bhj != null) {
            bhj.mo39500a(zzgu);
        }
    }

    /* renamed from: a */
    public final void mo39498a(CryptoException cryptoException) {
        this.f40361b.m46026a("CryptoError", cryptoException.getMessage());
        bhj bhj = (bhj) this.f40360a.get();
        if (bhj != null) {
            bhj.mo39498a(cryptoException);
        }
    }

    /* renamed from: a */
    public final void mo39503a(String str, long j, long j2) {
        bhj bhj = (bhj) this.f40360a.get();
        if (bhj != null) {
            bhj.mo39503a(str, j, j2);
        }
    }
}
