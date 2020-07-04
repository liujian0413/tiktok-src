package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;

final class ajm implements bgt {

    /* renamed from: a */
    private final /* synthetic */ aiw f40416a;

    ajm(aiw aiw) {
        this.f40416a = aiw;
    }

    /* renamed from: a */
    public final void mo39503a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo39501a(zzht zzht) {
        this.f40416a.m46061b("AudioTrackInitializationError", zzht.getMessage());
    }

    /* renamed from: a */
    public final void mo39502a(zzhu zzhu) {
        this.f40416a.m46061b("AudioTrackWriteError", zzhu.getMessage());
    }

    /* renamed from: a */
    public final void mo39500a(zzgu zzgu) {
        this.f40416a.m46061b("DecoderInitializationError", zzgu.getMessage());
    }

    /* renamed from: a */
    public final void mo39498a(CryptoException cryptoException) {
        this.f40416a.m46061b("CryptoError", cryptoException.getMessage());
    }
}
