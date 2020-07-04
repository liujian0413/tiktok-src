package com.p280ss.android.p817ad.splash.core.video.p832a;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.core.video.a.b */
public final class C19066b extends C19065a {

    /* renamed from: a */
    public final MediaPlayer f51530a;

    /* renamed from: b */
    private final C19067a f51531b;

    /* renamed from: c */
    private MediaDataSource f51532c;

    /* renamed from: d */
    private final Object f51533d = new Object();

    /* renamed from: e */
    private boolean f51534e;

    /* renamed from: com.ss.android.ad.splash.core.video.a.b$a */
    class C19067a implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener {

        /* renamed from: a */
        public final WeakReference<C19066b> f51535a;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (((C19066b) this.f51535a.get()) != null) {
                C19066b.this.mo50671c();
            }
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (((C19066b) this.f51535a.get()) != null) {
                C19066b.this.mo50669b();
            }
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            if (((C19066b) this.f51535a.get()) != null) {
                C19066b.this.mo50672d();
            }
        }

        public C19067a(C19066b bVar) {
            this.f51535a = new WeakReference<>(bVar);
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            if (((C19066b) this.f51535a.get()) != null) {
                C19066b.this.mo50661a(i);
            }
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (((C19066b) this.f51535a.get()) != null) {
            }
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (((C19066b) this.f51535a.get()) == null || !C19066b.this.mo50668a(i, i2)) {
                return false;
            }
            return true;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (((C19066b) this.f51535a.get()) == null || !C19066b.this.mo50670b(i, i2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void mo50681e() throws IllegalStateException {
        this.f51530a.start();
    }

    /* renamed from: f */
    public final void mo50682f() throws IllegalStateException {
        this.f51530a.stop();
    }

    /* renamed from: g */
    public final void mo50683g() throws IllegalStateException {
        this.f51530a.pause();
    }

    /* renamed from: l */
    private void m62443l() {
        if (this.f51532c != null) {
            try {
                this.f51532c.close();
            } catch (IOException unused) {
            }
            this.f51532c = null;
        }
    }

    /* renamed from: h */
    public final long mo50684h() {
        try {
            return (long) this.f51530a.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    /* renamed from: i */
    public final long mo50685i() {
        try {
            return (long) this.f51530a.getDuration();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    /* renamed from: k */
    public final void mo50687k() {
        try {
            this.f51530a.reset();
        } catch (IllegalStateException unused) {
        }
        m62443l();
        mo50660a();
        m62444m();
    }

    /* renamed from: j */
    public final void mo50686j() {
        this.f51534e = true;
        this.f51530a.release();
        m62443l();
        mo50660a();
        m62444m();
    }

    public C19066b() {
        synchronized (this.f51533d) {
            this.f51530a = new MediaPlayer();
        }
        this.f51530a.setAudioStreamType(3);
        this.f51531b = new C19067a(this);
        m62444m();
    }

    /* renamed from: m */
    private void m62444m() {
        this.f51530a.setOnPreparedListener(this.f51531b);
        this.f51530a.setOnBufferingUpdateListener(this.f51531b);
        this.f51530a.setOnCompletionListener(this.f51531b);
        this.f51530a.setOnSeekCompleteListener(this.f51531b);
        this.f51530a.setOnVideoSizeChangedListener(this.f51531b);
        this.f51530a.setOnErrorListener(this.f51531b);
        this.f51530a.setOnInfoListener(this.f51531b);
    }

    /* renamed from: a */
    public final void mo50674a(long j) throws IllegalStateException {
        this.f51530a.seekTo((int) j);
    }

    /* renamed from: b */
    public final void mo50680b(boolean z) {
        this.f51530a.setLooping(z);
    }

    /* renamed from: a */
    public final void mo50676a(Surface surface) {
        this.f51530a.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo50677a(SurfaceHolder surfaceHolder) {
        synchronized (this.f51533d) {
            if (!this.f51534e) {
                this.f51530a.setDisplay(surfaceHolder);
            }
        }
    }

    /* renamed from: a */
    public final void mo50678a(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f51530a.setDataSource(str);
        } else {
            this.f51530a.setDataSource(parse.getPath());
        }
    }

    /* renamed from: a */
    public final void mo50679a(boolean z) {
        this.f51530a.setScreenOnWhilePlaying(true);
    }

    /* renamed from: a */
    public final void mo50675a(Context context, int i) {
        this.f51530a.setWakeMode(context, 10);
    }

    /* renamed from: a */
    public final void mo50673a(float f, float f2) {
        if (this.f51530a != null && !this.f51534e && this.f51530a.isPlaying()) {
            this.f51530a.setVolume(f, f2);
        }
    }
}
