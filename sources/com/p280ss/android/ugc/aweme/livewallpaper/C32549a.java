package com.p280ss.android.ugc.aweme.livewallpaper;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.livewallpaper.egl.C32589j;
import com.p280ss.android.ugc.aweme.livewallpaper.egl.C32591k;
import com.p280ss.android.ugc.aweme.video.C7276d;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a */
public final class C32549a {

    /* renamed from: a */
    public String f84878a;

    /* renamed from: b */
    private C32553a f84879b;

    /* renamed from: c */
    private C32591k f84880c;

    /* renamed from: d */
    private MediaPlayer f84881d;

    /* renamed from: e */
    private C32589j f84882e;

    /* renamed from: f */
    private SurfaceHolder f84883f;

    /* renamed from: g */
    private Surface f84884g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a$a */
    public interface C32553a {
        /* renamed from: a */
        void mo83799a(boolean z, String str, String str2);
    }

    public C32549a(C32553a aVar) {
        this.f84879b = aVar;
    }

    /* renamed from: a */
    public final void mo83819a(SurfaceHolder surfaceHolder) {
        if (this.f84881d != null) {
            this.f84881d.release();
            this.f84881d = null;
        }
        if (this.f84884g != null) {
            this.f84884g.release();
            this.f84884g = null;
        }
        if (this.f84882e != null) {
            this.f84882e.mo83910f();
        }
        if (this.f84880c != null) {
            this.f84880c.release();
        }
        this.f84883f = null;
    }

    /* renamed from: a */
    public final void mo83823a(boolean z) {
        if (this.f84881d != null) {
            if (!z || this.f84881d.isPlaying()) {
                if (!z && this.f84881d.isPlaying()) {
                    this.f84881d.pause();
                }
                return;
            }
            this.f84881d.start();
        }
    }

    /* renamed from: a */
    public final void mo83824a(boolean z, String str) {
        if (this.f84879b != null) {
            this.f84879b.mo83799a(z, this.f84878a, str);
        }
    }

    /* renamed from: a */
    public final void mo83820a(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f84883f = surfaceHolder;
        if (this.f84882e != null) {
            this.f84882e.mo83905b(i2, i3);
        }
    }

    /* renamed from: a */
    public final void mo83822a(String str, int i, int i2, boolean z) {
        if (!C7276d.m22812b(str)) {
            mo83824a(false, "onRefresh video is not exists");
        } else if (this.f84883f != null) {
            Surface surface = this.f84883f.getSurface();
            Rect surfaceFrame = this.f84883f.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a = m105404a(width, height, i, i2, true);
            if (this.f84881d != null) {
                this.f84881d.release();
                this.f84881d = null;
            }
            if (this.f84884g != null) {
                this.f84884g.release();
                this.f84884g = null;
            }
            if (this.f84882e != null) {
                this.f84882e.mo83910f();
            }
            if (this.f84880c != null) {
                this.f84880c.release();
            }
            this.f84882e = new C32589j(surface, null);
            this.f84882e.f84957d = a;
            this.f84882e.mo83911g();
            this.f84880c = this.f84882e.mo83912h();
            if (this.f84880c != null) {
                this.f84880c.setDefaultBufferSize(width, height);
                surface = new Surface(this.f84880c);
            }
            this.f84884g = surface;
            this.f84881d = new MediaPlayer();
            try {
                this.f84881d.setSurface(surface);
                this.f84881d.setDataSource(str);
                this.f84881d.setLooping(true);
                this.f84881d.setVolume(0.0f, 0.0f);
                this.f84881d.prepare();
                this.f84881d.start();
                this.f84881d.setOnInfoListener(new OnInfoListener() {
                    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                        if (i == 3) {
                            C32549a.this.mo83824a(true, "");
                        }
                        return false;
                    }
                });
                this.f84881d.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        C32549a aVar = C32549a.this;
                        StringBuilder sb = new StringBuilder("media play error what = ");
                        sb.append(i);
                        sb.append(" extra = ");
                        sb.append(i2);
                        aVar.mo83824a(false, sb.toString());
                        return false;
                    }
                });
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("media play exception ");
                sb.append(e.getMessage());
                mo83824a(false, sb.toString());
                C6921a.m21559a((Throwable) new Exception("WallPaperPlayerEngine", e));
            }
        }
    }

    /* renamed from: a */
    private static Pair<Float, Float> m105404a(int i, int i2, int i3, int i4, boolean z) {
        float f;
        float f2;
        float f3 = 1.0f;
        if (i4 <= 0 || i3 <= 0 || i2 <= 0 || i <= 0) {
            return new Pair<>(Float.valueOf(1.0f), Float.valueOf(1.0f));
        }
        float f4 = ((float) i3) / ((float) i4);
        float f5 = ((float) i) / ((float) i2);
        if (!z) {
            if (f4 > f5) {
                f2 = f5 / f4;
            } else {
                f = f4 / f5;
                return new Pair<>(Float.valueOf(f), Float.valueOf(f3));
            }
        } else if (f4 < f5) {
            f2 = f5 / f4;
        } else {
            f = f4 / f5;
            return new Pair<>(Float.valueOf(f), Float.valueOf(f3));
        }
        f3 = f2;
        f = 1.0f;
        return new Pair<>(Float.valueOf(f), Float.valueOf(f3));
    }

    /* renamed from: a */
    public final void mo83821a(SurfaceHolder surfaceHolder, String str, int i, int i2, boolean z) {
        this.f84883f = surfaceHolder;
        if (this.f84883f != null) {
            Surface surface = this.f84883f.getSurface();
            Rect surfaceFrame = this.f84883f.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a = m105404a(width, height, i, i2, true);
            if (this.f84881d != null) {
                this.f84881d.release();
                this.f84881d = null;
            }
            if (this.f84884g != null) {
                this.f84884g.release();
                this.f84884g = null;
            }
            if (this.f84882e != null) {
                this.f84882e.mo83910f();
            }
            if (this.f84880c != null) {
                this.f84880c.release();
            }
            this.f84882e = new C32589j(surface, null);
            this.f84882e.f84957d = a;
            this.f84882e.mo83911g();
            this.f84880c = this.f84882e.mo83912h();
            if (this.f84880c != null) {
                this.f84880c.setDefaultBufferSize(width, height);
                surface = new Surface(this.f84880c);
            }
            this.f84884g = surface;
            this.f84881d = new MediaPlayer();
            try {
                this.f84881d.setSurface(surface);
                this.f84881d.setDataSource(str);
                this.f84881d.setLooping(true);
                this.f84881d.setVolume(0.0f, 0.0f);
                this.f84881d.prepare();
                this.f84881d.start();
                this.f84881d.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        C32549a aVar = C32549a.this;
                        StringBuilder sb = new StringBuilder("onSurfaceCreated media play error what = ");
                        sb.append(i);
                        sb.append(" extra = ");
                        sb.append(i2);
                        aVar.mo83824a(false, sb.toString());
                        return false;
                    }
                });
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("onSurfaceCreated media play exception ");
                sb.append(e.getMessage());
                mo83824a(false, sb.toString());
            }
        }
    }
}
