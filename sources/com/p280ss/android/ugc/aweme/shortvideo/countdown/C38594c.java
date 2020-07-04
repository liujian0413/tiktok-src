package com.p280ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.c */
public final class C38594c {

    /* renamed from: a */
    MediaPlayer f100266a;

    /* renamed from: b */
    final Context f100267b;

    /* renamed from: c */
    final Uri f100268c;

    /* renamed from: d */
    Handler f100269d = new Handler();

    /* renamed from: e */
    public C38596a f100270e;

    /* renamed from: f */
    boolean f100271f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.c$a */
    public interface C38596a {
        /* renamed from: a */
        void mo96571a(int i);
    }

    /* renamed from: a */
    public final void mo96600a() {
        if (this.f100266a != null) {
            try {
                this.f100266a.pause();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo96603b() {
        if (this.f100266a != null) {
            try {
                this.f100266a.start();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo96604c() {
        if (!this.f100271f) {
            this.f100271f = true;
            if (this.f100266a != null) {
                this.f100266a.release();
            }
        }
    }

    /* renamed from: a */
    public final void mo96601a(int i) {
        if (this.f100270e != null) {
            this.f100270e.mo96571a(i);
        }
    }

    public C38594c(Context context, Uri uri) {
        this.f100267b = context;
        this.f100268c = uri;
        this.f100266a = MediaPlayer.create(context, uri);
    }

    /* renamed from: a */
    public final void mo96602a(int i, final int i2) {
        if (this.f100266a != null) {
            this.f100266a.seekTo(i);
            this.f100266a.start();
            this.f100269d.post(new Runnable() {
                public final void run() {
                    if (!C38594c.this.f100271f && C38594c.this.f100266a.isPlaying()) {
                        int currentPosition = C38594c.this.f100266a.getCurrentPosition();
                        if (currentPosition < i2) {
                            C38594c.this.mo96601a(currentPosition);
                            C38594c.this.f100269d.post(this);
                            return;
                        }
                        C38594c.this.f100266a.stop();
                        C38594c.this.mo96604c();
                    }
                }
            });
        }
    }
}
