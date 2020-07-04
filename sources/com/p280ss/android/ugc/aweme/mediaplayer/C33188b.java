package com.p280ss.android.ugc.aweme.mediaplayer;

import android.content.Context;
import android.view.Surface;
import com.p280ss.android.medialib.player.IESMediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.b */
public final class C33188b implements C33187a {

    /* renamed from: a */
    private IESMediaPlayer f86364a;

    /* renamed from: b */
    private Context f86365b;

    /* renamed from: d */
    public final void mo84948d() {
        if (this.f86364a != null) {
            this.f86364a.release();
            this.f86364a = null;
        }
    }

    /* renamed from: e */
    public final long mo84949e() {
        if (this.f86364a != null) {
            return this.f86364a.getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo84950f() {
        if (this.f86364a != null) {
            return this.f86364a.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo84944b() {
        if (this.f86364a != null) {
            this.f86364a.resume();
        }
    }

    /* renamed from: c */
    public final void mo84947c() {
        if (this.f86364a != null) {
            this.f86364a.stop();
        }
    }

    /* renamed from: a */
    public final void mo84938a() {
        if (this.f86364a != null) {
            this.f86364a.pause();
        }
    }

    public C33188b(Context context) {
        this.f86365b = context;
        this.f86364a = new IESMediaPlayer(context);
    }

    /* renamed from: a */
    public final int mo84936a(long j) {
        if (this.f86364a != null) {
            return this.f86364a.seek(j);
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo84943b(long j) {
        if (this.f86364a != null) {
            return this.f86364a.seekLeft(j);
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo84946c(long j) {
        if (this.f86364a != null) {
            return this.f86364a.seekRight(j);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo84937a(String str) {
        if (this.f86364a == null) {
            this.f86364a = new IESMediaPlayer(this.f86365b);
        }
        return this.f86364a.prepare(str);
    }

    /* renamed from: b */
    public final void mo84945b(double d) {
        if (this.f86364a != null) {
            this.f86364a.setSpeed(d);
        }
    }

    /* renamed from: a */
    public final void mo84939a(double d) {
        if (this.f86364a != null) {
            this.f86364a.setVolume(d);
        }
    }

    /* renamed from: a */
    public final void mo84941a(boolean z) {
        if (this.f86364a != null) {
            this.f86364a.setLoop(z);
        }
    }

    /* renamed from: a */
    public final boolean mo84942a(Surface surface) {
        if (this.f86364a == null) {
            return false;
        }
        this.f86364a.start(surface);
        return true;
    }

    /* renamed from: a */
    public final void mo84940a(long j, long j2) {
        if (this.f86364a != null) {
            this.f86364a.setBoundary(j, j2);
        }
    }
}
