package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class bmd extends Thread {

    /* renamed from: a */
    private final /* synthetic */ AudioTrack f42607a;

    /* renamed from: b */
    private final /* synthetic */ bmc f42608b;

    bmd(bmc bmc, AudioTrack audioTrack) {
        this.f42608b = bmc;
        this.f42607a = audioTrack;
    }

    public final void run() {
        try {
            this.f42607a.flush();
            this.f42607a.release();
        } finally {
            this.f42608b.f42587g.open();
        }
    }
}
