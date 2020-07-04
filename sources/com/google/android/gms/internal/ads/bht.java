package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

class bht {

    /* renamed from: a */
    protected AudioTrack f42066a;

    /* renamed from: b */
    private boolean f42067b;

    /* renamed from: c */
    private int f42068c;

    /* renamed from: d */
    private long f42069d;

    /* renamed from: e */
    private long f42070e;

    /* renamed from: f */
    private long f42071f;

    private bht() {
    }

    /* renamed from: d */
    public boolean mo40720d() {
        return false;
    }

    /* renamed from: a */
    public void mo40716a(AudioTrack audioTrack, boolean z) {
        this.f42066a = audioTrack;
        this.f42067b = z;
        this.f42069d = 0;
        this.f42070e = 0;
        this.f42071f = 0;
        if (audioTrack != null) {
            this.f42068c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: a */
    public final boolean mo40717a() {
        return bkn.f42386a <= 22 && this.f42067b && this.f42066a.getPlayState() == 2 && this.f42066a.getPlaybackHeadPosition() == 0;
    }

    /* renamed from: b */
    public final long mo40718b() {
        long playbackHeadPosition = ((long) this.f42066a.getPlaybackHeadPosition()) & 4294967295L;
        if (bkn.f42386a <= 22 && this.f42067b) {
            if (this.f42066a.getPlayState() == 1) {
                this.f42069d = playbackHeadPosition;
            } else if (this.f42066a.getPlayState() == 2 && playbackHeadPosition == 0) {
                this.f42071f = this.f42069d;
            }
            playbackHeadPosition += this.f42071f;
        }
        if (this.f42069d > playbackHeadPosition) {
            this.f42070e++;
        }
        this.f42069d = playbackHeadPosition;
        return playbackHeadPosition + (this.f42070e << 32);
    }

    /* renamed from: c */
    public final long mo40719c() {
        return (mo40718b() * 1000000) / ((long) this.f42068c);
    }

    /* renamed from: e */
    public long mo40721e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo40722f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ bht(bhs bhs) {
        this();
    }
}
