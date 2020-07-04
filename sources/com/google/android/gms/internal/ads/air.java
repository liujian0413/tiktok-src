package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;
import java.lang.ref.WeakReference;

final class air implements bgt {

    /* renamed from: a */
    private WeakReference<bgt> f40355a;

    /* renamed from: b */
    private final /* synthetic */ aip f40356b;

    private air(aip aip) {
        this.f40356b = aip;
        this.f40355a = new WeakReference<>(null);
    }

    /* renamed from: a */
    public final void mo39499a(bgt bgt) {
        this.f40355a = new WeakReference<>(bgt);
    }

    /* renamed from: a */
    public final void mo39501a(zzht zzht) {
        this.f40356b.m46026a("AudioTrackInitializationError", zzht.getMessage());
        bgt bgt = (bgt) this.f40355a.get();
        if (bgt != null) {
            bgt.mo39501a(zzht);
        }
    }

    /* renamed from: a */
    public final void mo39502a(zzhu zzhu) {
        this.f40356b.m46026a("AudioTrackWriteError", zzhu.getMessage());
        bgt bgt = (bgt) this.f40355a.get();
        if (bgt != null) {
            bgt.mo39502a(zzhu);
        }
    }

    /* renamed from: a */
    public final void mo39500a(zzgu zzgu) {
        this.f40356b.m46026a("DecoderInitializationError", zzgu.getMessage());
        bgt bgt = (bgt) this.f40355a.get();
        if (bgt != null) {
            bgt.mo39500a(zzgu);
        }
    }

    /* renamed from: a */
    public final void mo39498a(CryptoException cryptoException) {
        this.f40356b.m46026a("CryptoError", cryptoException.getMessage());
        bgt bgt = (bgt) this.f40355a.get();
        if (bgt != null) {
            bgt.mo39498a(cryptoException);
        }
    }

    /* renamed from: a */
    public final void mo39503a(String str, long j, long j2) {
        bgt bgt = (bgt) this.f40355a.get();
        if (bgt != null) {
            bgt.mo39503a(str, j, j2);
        }
    }
}
