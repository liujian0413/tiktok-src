package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CryptoException;

final class bgw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ CryptoException f41971a;

    /* renamed from: b */
    private final /* synthetic */ bgu f41972b;

    bgw(bgu bgu, CryptoException cryptoException) {
        this.f41972b = bgu;
        this.f41971a = cryptoException;
    }

    public final void run() {
        this.f41972b.f41954l.mo39498a(this.f41971a);
    }
}
