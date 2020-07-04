package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class bhs extends Thread {

    /* renamed from: a */
    private final /* synthetic */ AudioTrack f42064a;

    /* renamed from: b */
    private final /* synthetic */ bhr f42065b;

    bhs(bhr bhr, AudioTrack audioTrack) {
        this.f42065b = bhr;
        this.f42064a = audioTrack;
    }

    public final void run() {
        try {
            this.f42064a.release();
        } finally {
            this.f42065b.f42038a.open();
        }
    }
}
