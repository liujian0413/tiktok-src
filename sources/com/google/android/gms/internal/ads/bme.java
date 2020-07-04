package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

class bme {

    /* renamed from: a */
    protected AudioTrack f42609a;

    /* renamed from: b */
    private boolean f42610b;

    /* renamed from: c */
    private int f42611c;

    /* renamed from: d */
    private long f42612d;

    /* renamed from: e */
    private long f42613e;

    /* renamed from: f */
    private long f42614f;

    /* renamed from: g */
    private long f42615g;

    /* renamed from: h */
    private long f42616h;

    /* renamed from: i */
    private long f42617i;

    private bme() {
    }

    /* renamed from: d */
    public boolean mo40960d() {
        return false;
    }

    /* renamed from: a */
    public void mo40957a(AudioTrack audioTrack, boolean z) {
        this.f42609a = audioTrack;
        this.f42610b = z;
        this.f42615g = -9223372036854775807L;
        this.f42612d = 0;
        this.f42613e = 0;
        this.f42614f = 0;
        if (audioTrack != null) {
            this.f42611c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: a */
    public final void mo40956a(long j) {
        this.f42616h = mo40958b();
        this.f42615g = SystemClock.elapsedRealtime() * 1000;
        this.f42617i = j;
        this.f42609a.stop();
    }

    /* renamed from: a */
    public final void mo40955a() {
        if (this.f42615g == -9223372036854775807L) {
            this.f42609a.pause();
        }
    }

    /* renamed from: b */
    public final long mo40958b() {
        if (this.f42615g != -9223372036854775807L) {
            return Math.min(this.f42617i, this.f42616h + ((((SystemClock.elapsedRealtime() * 1000) - this.f42615g) * ((long) this.f42611c)) / 1000000));
        }
        int playState = this.f42609a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f42609a.getPlaybackHeadPosition());
        if (this.f42610b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f42614f = this.f42612d;
            }
            playbackHeadPosition += this.f42614f;
        }
        if (this.f42612d > playbackHeadPosition) {
            this.f42613e++;
        }
        this.f42612d = playbackHeadPosition;
        return playbackHeadPosition + (this.f42613e << 32);
    }

    /* renamed from: c */
    public final long mo40959c() {
        return (mo40958b() * 1000000) / ((long) this.f42611c);
    }

    /* renamed from: e */
    public long mo40961e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo40962f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ bme(bmd bmd) {
        this();
    }
}
