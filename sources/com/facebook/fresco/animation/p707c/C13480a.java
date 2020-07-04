package com.facebook.fresco.animation.p707c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.p686c.C13286a;
import com.facebook.drawable.p691a.C13360a;
import com.facebook.drawee.drawable.C13409d;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p709d.C13487a;
import com.facebook.fresco.animation.p709d.C13488b;
import com.facebook.fresco.animation.p709d.C13489c;

/* renamed from: com.facebook.fresco.animation.c.a */
public class C13480a extends Drawable implements Animatable, C13360a {

    /* renamed from: i */
    private static final Class<?> f35746i = C13480a.class;

    /* renamed from: j */
    private static final C13485b f35747j = new C13486c();

    /* renamed from: k */
    private static C13488b f35748k;

    /* renamed from: a */
    public C13460a f35749a;

    /* renamed from: b */
    public long f35750b;

    /* renamed from: c */
    public long f35751c;

    /* renamed from: d */
    public long f35752d;

    /* renamed from: e */
    public volatile C13482a f35753e;

    /* renamed from: f */
    public final Runnable f35754f;

    /* renamed from: g */
    private int f35755g;

    /* renamed from: h */
    private boolean f35756h;

    /* renamed from: l */
    private C13487a f35757l;

    /* renamed from: m */
    private volatile boolean f35758m;

    /* renamed from: n */
    private long f35759n;

    /* renamed from: o */
    private long f35760o;

    /* renamed from: p */
    private int f35761p;

    /* renamed from: q */
    private int f35762q;

    /* renamed from: r */
    private volatile C13485b f35763r;

    /* renamed from: s */
    private C13409d f35764s;

    /* renamed from: com.facebook.fresco.animation.c.a$a */
    public interface C13482a {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f35758m;
    }

    public C13480a() {
        this(null, null);
    }

    /* renamed from: e */
    private static long m39655e() {
        return SystemClock.uptimeMillis();
    }

    public int getIntrinsicHeight() {
        if (this.f35749a == null) {
            return super.getIntrinsicHeight();
        }
        return this.f35749a.mo32991b();
    }

    public int getIntrinsicWidth() {
        if (this.f35749a == null) {
            return super.getIntrinsicWidth();
        }
        return this.f35749a.mo32986a();
    }

    /* renamed from: d */
    private void m39654d() {
        this.f35762q++;
        if (C13286a.m38846a(2)) {
            C13286a.m38835a(f35746i, "Dropped a frame. Count: %s", (Object) Integer.valueOf(this.f35762q));
        }
    }

    /* renamed from: c */
    public final int mo33019c() {
        if (this.f35756h) {
            return this.f35755g;
        }
        if (this.f35749a == null) {
            return 0;
        }
        return this.f35749a.mo32996e();
    }

    /* renamed from: a */
    public final void mo32663a() {
        if (this.f35749a != null) {
            this.f35749a.mo32993c();
        }
    }

    /* renamed from: b */
    public final long mo33018b() {
        if (this.f35749a == null) {
            return 0;
        }
        if (this.f35757l != null) {
            return this.f35757l.mo29883a();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f35749a.mo32995d(); i2++) {
            i += this.f35749a.mo32994c(i2);
        }
        return (long) i;
    }

    public void start() {
        if (!this.f35758m && this.f35749a != null && this.f35749a.mo32995d() > 1) {
            this.f35758m = true;
            this.f35750b = m39655e();
            this.f35760o = this.f35750b;
            this.f35759n = -1;
            this.f35761p = -1;
            invalidateSelf();
            this.f35763r.mo33033a(this);
        }
    }

    public void stop() {
        if (this.f35758m) {
            this.f35758m = false;
            this.f35750b = 0;
            this.f35760o = this.f35750b;
            this.f35759n = -1;
            this.f35761p = -1;
            unscheduleSelf(this.f35754f);
            this.f35763r.mo33035b(this);
        }
    }

    /* renamed from: a */
    public static void m39653a(C13488b bVar) {
        f35748k = bVar;
    }

    /* renamed from: a */
    public final void mo33015a(int i) {
        this.f35755g = 2;
        this.f35756h = true;
    }

    /* renamed from: a */
    private void m39652a(long j) {
        this.f35760o = this.f35750b + j;
        scheduleSelf(this.f35754f, this.f35760o);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f35749a != null) {
            this.f35749a.mo32989a(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f35758m) {
            return false;
        }
        long j = (long) i;
        if (this.f35759n == j) {
            return false;
        }
        this.f35759n = j;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        if (this.f35764s == null) {
            this.f35764s = new C13409d();
        }
        this.f35764s.f35517a = i;
        if (this.f35749a != null) {
            this.f35749a.mo32987a(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f35764s == null) {
            this.f35764s = new C13409d();
        }
        this.f35764s.mo32806a(colorFilter);
        if (this.f35749a != null) {
            this.f35749a.mo32988a(colorFilter);
        }
    }

    /* renamed from: a */
    public final void mo33016a(C13460a aVar) {
        this.f35749a = aVar;
        if (this.f35749a != null) {
            this.f35757l = new C13489c(this.f35749a);
            this.f35749a.mo32989a(getBounds());
            if (this.f35764s != null) {
                this.f35764s.mo32807a((Drawable) this);
            }
        }
        this.f35757l = m39651a(this.f35749a, null);
        stop();
    }

    /* renamed from: a */
    public final void mo33017a(C13485b bVar) {
        this.f35763r = bVar;
    }

    public void draw(Canvas canvas) {
        long j;
        if (this.f35749a != null && this.f35757l != null) {
            long e = m39655e();
            if (this.f35758m) {
                j = (e - this.f35750b) + this.f35752d;
            } else {
                j = Math.max(this.f35759n, 0);
            }
            int a = this.f35757l.mo29882a(j, this.f35759n);
            if (a == -1) {
                a = this.f35749a.mo32995d() - 1;
                this.f35763r.mo33035b(this);
                this.f35758m = false;
            } else if (a == 0 && this.f35761p != -1 && e >= this.f35760o) {
                this.f35763r.mo33036c(this);
            }
            boolean a2 = this.f35749a.mo32990a(this, canvas, a);
            if (a2) {
                this.f35763r.mo33034a(this, a);
                this.f35761p = a;
            }
            if (!a2) {
                m39654d();
            }
            long e2 = m39655e();
            if (this.f35758m) {
                long a3 = this.f35757l.mo29884a(e2 - this.f35750b);
                if (a3 != -1) {
                    m39652a(a3 + this.f35751c);
                }
            }
            if (this.f35753e != null) {
                boolean z = this.f35758m;
            }
            this.f35759n = j;
        }
    }

    /* renamed from: a */
    private static C13487a m39651a(C13460a aVar, Object obj) {
        if (aVar == null) {
            return null;
        }
        if (f35748k != null) {
            C13487a a = f35748k.mo29906a(aVar, obj);
            if (a != null) {
                return a;
            }
        }
        return new C13489c(aVar);
    }

    public C13480a(C13460a aVar, Object obj) {
        this.f35755g = -1000;
        this.f35751c = 8;
        this.f35763r = f35747j;
        this.f35754f = new Runnable() {
            public final void run() {
                C13480a.this.unscheduleSelf(C13480a.this.f35754f);
                C13480a.this.invalidateSelf();
            }
        };
        this.f35749a = aVar;
        this.f35757l = m39651a(this.f35749a, obj);
    }
}
