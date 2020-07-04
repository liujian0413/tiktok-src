package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class bmf extends bme {

    /* renamed from: b */
    private final AudioTimestamp f42618b = new AudioTimestamp();

    /* renamed from: c */
    private long f42619c;

    /* renamed from: d */
    private long f42620d;

    /* renamed from: e */
    private long f42621e;

    public bmf() {
        super(null);
    }

    /* renamed from: a */
    public final void mo40957a(AudioTrack audioTrack, boolean z) {
        super.mo40957a(audioTrack, z);
        this.f42619c = 0;
        this.f42620d = 0;
        this.f42621e = 0;
    }

    /* renamed from: d */
    public final boolean mo40960d() {
        boolean timestamp = this.f42609a.getTimestamp(this.f42618b);
        if (timestamp) {
            long j = this.f42618b.framePosition;
            if (this.f42620d > j) {
                this.f42619c++;
            }
            this.f42620d = j;
            this.f42621e = j + (this.f42619c << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo40961e() {
        return this.f42618b.nanoTime;
    }

    /* renamed from: f */
    public final long mo40962f() {
        return this.f42621e;
    }
}
