package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class bhu extends bht {

    /* renamed from: b */
    private final AudioTimestamp f42072b = new AudioTimestamp();

    /* renamed from: c */
    private long f42073c;

    /* renamed from: d */
    private long f42074d;

    /* renamed from: e */
    private long f42075e;

    public bhu() {
        super(null);
    }

    /* renamed from: a */
    public final void mo40716a(AudioTrack audioTrack, boolean z) {
        super.mo40716a(audioTrack, z);
        this.f42073c = 0;
        this.f42074d = 0;
        this.f42075e = 0;
    }

    /* renamed from: d */
    public final boolean mo40720d() {
        boolean timestamp = this.f42066a.getTimestamp(this.f42072b);
        if (timestamp) {
            long j = this.f42072b.framePosition;
            if (this.f42074d > j) {
                this.f42073c++;
            }
            this.f42074d = j;
            this.f42075e = j + (this.f42073c << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo40721e() {
        return this.f42072b.nanoTime;
    }

    /* renamed from: f */
    public final long mo40722f() {
        return this.f42075e;
    }
}
