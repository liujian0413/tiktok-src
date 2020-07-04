package p1896pl.droidsonroids.gif;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.MediaController.MediaPlayerControl;
import com.C1642a;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p1896pl.droidsonroids.gif.p1897a.C48428a;

/* renamed from: pl.droidsonroids.gif.a */
public final class C48425a extends Drawable implements Animatable, MediaPlayerControl {

    /* renamed from: a */
    final ScheduledThreadPoolExecutor f123520a;

    /* renamed from: b */
    volatile boolean f123521b;

    /* renamed from: c */
    long f123522c;

    /* renamed from: d */
    public final Paint f123523d;

    /* renamed from: e */
    final Bitmap f123524e;

    /* renamed from: f */
    final GifInfoHandle f123525f;

    /* renamed from: g */
    final ConcurrentLinkedQueue<Object> f123526g;

    /* renamed from: h */
    final boolean f123527h;

    /* renamed from: i */
    final C48432c f123528i;

    /* renamed from: j */
    ScheduledFuture<?> f123529j;

    /* renamed from: k */
    public C48428a f123530k;

    /* renamed from: l */
    private final Rect f123531l;

    /* renamed from: m */
    private ColorStateList f123532m;

    /* renamed from: n */
    private PorterDuffColorFilter f123533n;

    /* renamed from: o */
    private Mode f123534o;

    /* renamed from: p */
    private final C48435f f123535p;

    /* renamed from: q */
    private final Rect f123536q;

    /* renamed from: r */
    private int f123537r;

    /* renamed from: s */
    private int f123538s;

    public final boolean canPause() {
        return true;
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        return 100;
    }

    public final int getIntrinsicHeight() {
        return this.f123538s;
    }

    public final int getIntrinsicWidth() {
        return this.f123537r;
    }

    public final boolean isPlaying() {
        return this.f123521b;
    }

    public final boolean isRunning() {
        return this.f123521b;
    }

    public final void pause() {
        stop();
    }

    /* renamed from: b */
    public final boolean mo123217b() {
        return this.f123525f.mo123208m();
    }

    /* renamed from: d */
    public final int mo123222d() {
        return this.f123525f.mo123211p();
    }

    /* renamed from: f */
    public final int mo123225f() {
        return this.f123525f.mo123204i();
    }

    public final int getAlpha() {
        return this.f123523d.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f123523d.getColorFilter();
    }

    public final int getCurrentPosition() {
        return this.f123525f.mo123203h();
    }

    public final int getDuration() {
        return this.f123525f.mo123202g();
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        m150092j();
    }

    /* renamed from: h */
    private void m150090h() {
        this.f123521b = false;
        this.f123528i.removeMessages(-1);
        this.f123525f.mo123194a();
    }

    /* renamed from: a */
    public final void mo123216a() {
        m150090h();
        this.f123524e.recycle();
    }

    /* renamed from: c */
    public final void mo123218c() {
        this.f123520a.execute(new C48436g(this) {
            /* renamed from: a */
            public final void mo123254a() {
                if (C48425a.this.f123525f.mo123197c()) {
                    C48425a.this.start();
                }
            }
        });
    }

    public final boolean canSeekBackward() {
        if (mo123222d() > 1) {
            return true;
        }
        return false;
    }

    public final boolean canSeekForward() {
        if (mo123222d() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo123224e() {
        return this.f123524e.getRowBytes() * this.f123524e.getHeight();
    }

    /* renamed from: i */
    private void m150091i() {
        if (this.f123529j != null) {
            this.f123529j.cancel(false);
        }
        this.f123528i.removeMessages(-1);
    }

    /* renamed from: g */
    public final int mo123226g() {
        int j = this.f123525f.mo123205j();
        if (j == 0 || j < this.f123525f.mo123199e()) {
            return j;
        }
        return j - 1;
    }

    public final int getOpacity() {
        if (!this.f123525f.mo123212q() || this.f123523d.getAlpha() < 255) {
            return -2;
        }
        return -1;
    }

    public final boolean isStateful() {
        if (super.isStateful() || (this.f123532m != null && this.f123532m.isStateful())) {
            return true;
        }
        return false;
    }

    public final void start() {
        synchronized (this) {
            if (!this.f123521b) {
                this.f123521b = true;
                m150089a(this.f123525f.mo123196b());
            }
        }
    }

    public final void stop() {
        synchronized (this) {
            if (this.f123521b) {
                this.f123521b = false;
                m150091i();
                this.f123525f.mo123198d();
            }
        }
    }

    /* renamed from: j */
    private void m150092j() {
        if (this.f123527h && this.f123521b && this.f123522c != Long.MIN_VALUE) {
            long max = Math.max(0, this.f123522c - SystemClock.uptimeMillis());
            this.f123522c = Long.MIN_VALUE;
            this.f123520a.remove(this.f123535p);
            this.f123529j = this.f123520a.schedule(this.f123535p, max, TimeUnit.MILLISECONDS);
        }
    }

    public final String toString() {
        return C1642a.m8035a(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", new Object[]{Integer.valueOf(this.f123525f.mo123209n()), Integer.valueOf(this.f123525f.mo123210o()), Integer.valueOf(this.f123525f.mo123211p()), Integer.valueOf(this.f123525f.mo123200f())});
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f123531l.set(rect);
    }

    public final void setAlpha(int i) {
        this.f123523d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f123523d.setColorFilter(colorFilter);
    }

    public C48425a(String str) throws IOException {
        this(new GifInfoHandle(str), null, null, true);
    }

    public final void setDither(boolean z) {
        this.f123523d.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.f123523d.setFilterBitmap(z);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f123532m = colorStateList;
        this.f123533n = m150088a(colorStateList, this.f123534o);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.f123534o = mode;
        this.f123533n = m150088a(this.f123532m, mode);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f123532m == null || this.f123534o == null) {
            return false;
        }
        this.f123533n = m150088a(this.f123532m, this.f123534o);
        return true;
    }

    public final void seekTo(final int i) {
        if (i >= 0) {
            this.f123520a.execute(new C48436g(this) {
                /* renamed from: a */
                public final void mo123254a() {
                    C48425a.this.f123525f.mo123195a(i, C48425a.this.f123524e);
                    this.f123545c.f123528i.sendEmptyMessageAtTime(-1, 0);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    /* renamed from: a */
    private void m150089a(long j) {
        if (this.f123527h) {
            this.f123522c = 0;
            this.f123528i.sendEmptyMessageAtTime(-1, 0);
            return;
        }
        m150091i();
        this.f123529j = this.f123520a.schedule(this.f123535p, Math.max(j, 0), TimeUnit.MILLISECONDS);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f123533n == null || this.f123523d.getColorFilter() != null) {
            z = false;
        } else {
            this.f123523d.setColorFilter(this.f123533n);
            z = true;
        }
        if (this.f123530k == null) {
            canvas.drawBitmap(this.f123524e, this.f123536q, this.f123531l, this.f123523d);
        }
        if (z) {
            this.f123523d.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m150088a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f123527h) {
            if (z) {
                if (z2) {
                    mo123218c();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    private C48425a(GifInfoHandle gifInfoHandle, C48425a aVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f123521b = true;
        this.f123522c = Long.MIN_VALUE;
        this.f123531l = new Rect();
        this.f123523d = new Paint(6);
        this.f123526g = new ConcurrentLinkedQueue<>();
        this.f123535p = new C48435f(this);
        this.f123527h = true;
        this.f123520a = C48429b.m150102a();
        this.f123525f = gifInfoHandle;
        this.f123524e = Bitmap.createBitmap(this.f123525f.mo123209n(), this.f123525f.mo123210o(), Config.ARGB_8888);
        this.f123524e.setHasAlpha(!gifInfoHandle.mo123212q());
        this.f123536q = new Rect(0, 0, this.f123525f.mo123209n(), this.f123525f.mo123210o());
        this.f123528i = new C48432c(this);
        this.f123535p.mo123254a();
        this.f123537r = this.f123525f.mo123209n();
        this.f123538s = this.f123525f.mo123210o();
    }
}
