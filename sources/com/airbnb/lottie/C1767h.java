package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.view.View;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.layer.C1824b;
import com.airbnb.lottie.p054b.C1705a;
import com.airbnb.lottie.p054b.C1706b;
import com.airbnb.lottie.p055c.C1737s;
import com.airbnb.lottie.p056d.C1748c;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1755c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.airbnb.lottie.h */
public class C1767h extends Drawable implements Animatable, Callback {

    /* renamed from: i */
    private static final String f6355i = "h";

    /* renamed from: a */
    public C1757f f6356a;

    /* renamed from: b */
    public final C1748c f6357b = new C1748c();

    /* renamed from: c */
    public float f6358c = 1.0f;

    /* renamed from: d */
    public String f6359d;

    /* renamed from: e */
    C1704b f6360e;

    /* renamed from: f */
    public C1841q f6361f;

    /* renamed from: g */
    public boolean f6362g;

    /* renamed from: h */
    public C1824b f6363h;

    /* renamed from: j */
    private final Matrix f6364j = new Matrix();

    /* renamed from: k */
    private final Set<Object> f6365k = new HashSet();

    /* renamed from: l */
    private final ArrayList<C1779a> f6366l = new ArrayList<>();

    /* renamed from: m */
    private C1706b f6367m;

    /* renamed from: n */
    private C1707c f6368n;

    /* renamed from: o */
    private C1705a f6369o;

    /* renamed from: p */
    private int f6370p = NormalGiftView.ALPHA_255;

    /* renamed from: q */
    private boolean f6371q;

    /* renamed from: com.airbnb.lottie.h$a */
    interface C1779a {
        /* renamed from: a */
        void mo7272a(C1757f fVar);
    }

    public int getAlpha() {
        return this.f6370p;
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void start() {
        mo7239d();
    }

    public void stop() {
        m8418s();
    }

    /* renamed from: a */
    public final void mo7229a(boolean z) {
        if (this.f6362g != z && VERSION.SDK_INT >= 19) {
            this.f6362g = z;
            if (this.f6356a != null) {
                m8417r();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7230a(C1757f fVar) {
        if (this.f6356a == fVar) {
            return false;
        }
        mo7236c();
        this.f6356a = fVar;
        m8417r();
        this.f6357b.mo7181a(fVar);
        mo7240d(this.f6357b.getAnimatedFraction());
        mo7244e(this.f6358c);
        m8419t();
        Iterator it = new ArrayList(this.f6366l).iterator();
        while (it.hasNext()) {
            ((C1779a) it.next()).mo7272a(fVar);
            it.remove();
        }
        this.f6366l.clear();
        fVar.mo7212a(this.f6371q);
        return true;
    }

    /* renamed from: a */
    public final void mo7227a(C1707c cVar) {
        this.f6368n = cVar;
        if (this.f6367m != null) {
            this.f6367m.f6269a = cVar;
        }
    }

    /* renamed from: a */
    public final void mo7226a(C1704b bVar) {
        this.f6360e = bVar;
        if (this.f6369o != null) {
            this.f6369o.f6262a = bVar;
        }
    }

    /* renamed from: a */
    public final <T> void mo7228a(final C1817e eVar, final T t, final C1755c<T> cVar) {
        if (this.f6363h == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7228a(eVar, t, cVar);
                }
            });
            return;
        }
        boolean z = true;
        if (eVar.f6553a != null) {
            eVar.f6553a.mo7135a(t, cVar);
        } else {
            List a = m8416a(eVar);
            for (int i = 0; i < a.size(); i++) {
                ((C1817e) a.get(i)).f6553a.mo7135a(t, cVar);
            }
            if (a.isEmpty()) {
                z = false;
            }
        }
        if (z) {
            invalidateSelf();
            if (t == C1782k.f6422w) {
                mo7240d(mo7264q());
            }
        }
    }

    /* renamed from: f */
    public final float mo7246f() {
        return this.f6357b.mo7196j();
    }

    /* renamed from: g */
    public final float mo7247g() {
        return this.f6357b.mo7197k();
    }

    /* renamed from: h */
    public final float mo7252h() {
        return this.f6357b.f6293a;
    }

    /* renamed from: i */
    public final void mo7253i() {
        this.f6357b.removeAllListeners();
    }

    public boolean isRunning() {
        return mo7260m();
    }

    /* renamed from: j */
    public final int mo7257j() {
        return (int) this.f6357b.f6294b;
    }

    /* renamed from: k */
    public final int mo7258k() {
        return this.f6357b.getRepeatMode();
    }

    /* renamed from: l */
    public final int mo7259l() {
        return this.f6357b.getRepeatCount();
    }

    /* renamed from: m */
    public final boolean mo7260m() {
        return this.f6357b.isRunning();
    }

    /* renamed from: q */
    public final float mo7264q() {
        return this.f6357b.mo7185d();
    }

    /* renamed from: s */
    private void m8418s() {
        this.f6366l.clear();
        this.f6357b.mo7189g();
    }

    /* renamed from: b */
    public final C1838o mo7231b() {
        if (this.f6356a != null) {
            return this.f6356a.f6332a;
        }
        return null;
    }

    public void invalidateSelf() {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: o */
    public final void mo7262o() {
        this.f6366l.clear();
        this.f6357b.cancel();
    }

    /* renamed from: p */
    public final void mo7263p() {
        this.f6366l.clear();
        this.f6357b.mo7193h();
    }

    /* renamed from: r */
    private void m8417r() {
        this.f6363h = new C1824b(this, C1737s.m8309a(this.f6356a), this.f6356a.f6336e, this.f6356a);
    }

    /* renamed from: v */
    private C1705a m8421v() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f6369o == null) {
            this.f6369o = new C1705a(getCallback(), this.f6360e);
        }
        return this.f6369o;
    }

    /* renamed from: w */
    private Context m8422w() {
        Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo7236c() {
        mo7221a();
        if (this.f6357b.isRunning()) {
            this.f6357b.cancel();
        }
        this.f6356a = null;
        this.f6363h = null;
        this.f6367m = null;
        this.f6357b.mo7187e();
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo7239d() {
        if (this.f6363h == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7239d();
                }
            });
        } else {
            this.f6357b.mo7188f();
        }
    }

    /* renamed from: e */
    public final void mo7243e() {
        if (this.f6363h == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7243e();
                }
            });
        } else {
            this.f6357b.mo7194i();
        }
    }

    public int getIntrinsicHeight() {
        if (this.f6356a == null) {
            return -1;
        }
        return (int) (((float) this.f6356a.f6337f.height()) * this.f6358c);
    }

    public int getIntrinsicWidth() {
        if (this.f6356a == null) {
            return -1;
        }
        return (int) (((float) this.f6356a.f6337f.width()) * this.f6358c);
    }

    /* renamed from: n */
    public final boolean mo7261n() {
        if (this.f6361f != null || this.f6356a.f6335d.mo3435b() <= 0) {
            return false;
        }
        return true;
    }

    public C1767h() {
        this.f6357b.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (C1767h.this.f6363h != null) {
                    C1767h.this.f6363h.mo7325a(C1767h.this.f6357b.mo7185d());
                }
            }
        });
    }

    /* renamed from: t */
    private void m8419t() {
        if (this.f6356a != null) {
            float f = this.f6358c;
            setBounds(0, 0, (int) (((float) this.f6356a.f6337f.width()) * f), (int) (((float) this.f6356a.f6337f.height()) * f));
        }
    }

    /* renamed from: u */
    private C1706b m8420u() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f6367m != null && !this.f6367m.mo7161a(m8422w())) {
            this.f6367m.mo7160a();
            this.f6367m = null;
        }
        if (this.f6367m == null) {
            this.f6367m = new C1706b(getCallback(), this.f6359d, this.f6368n, this.f6356a.f6333b);
        }
        return this.f6367m;
    }

    /* renamed from: a */
    public final void mo7221a() {
        if (this.f6367m != null) {
            this.f6367m.mo7160a();
        }
    }

    public void setAlpha(int i) {
        this.f6370p = i;
    }

    /* renamed from: a */
    public final void mo7225a(AnimatorListener animatorListener) {
        this.f6357b.addListener(animatorListener);
    }

    /* renamed from: b */
    public final void mo7234b(AnimatorListener animatorListener) {
        this.f6357b.removeListener(animatorListener);
    }

    /* renamed from: c */
    public final void mo7237c(float f) {
        this.f6357b.f6293a = f;
    }

    /* renamed from: d */
    public final void mo7241d(int i) {
        this.f6357b.setRepeatMode(i);
    }

    /* renamed from: e */
    public final void mo7244e(float f) {
        this.f6358c = f;
        m8419t();
    }

    /* renamed from: a */
    public final Bitmap mo7219a(String str) {
        C1706b u = m8420u();
        if (u != null) {
            return u.mo7159a(str);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo7245e(int i) {
        this.f6357b.setRepeatCount(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* renamed from: a */
    private List<C1817e> m8416a(C1817e eVar) {
        if (this.f6363h == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f6363h.mo7134a(eVar, 0, (List<C1817e>) arrayList, new C1817e(new String[0]));
        return arrayList;
    }

    /* renamed from: b */
    public final void mo7232b(final float f) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7232b(f);
                }
            });
        } else {
            mo7233b((int) C1750e.m8356a(this.f6356a.f6338g, this.f6356a.f6339h, f));
        }
    }

    /* renamed from: a */
    private float m8415a(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f6356a.f6337f.width()), ((float) canvas.getHeight()) / ((float) this.f6356a.f6337f.height()));
    }

    /* renamed from: b */
    public final void mo7233b(final int i) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7233b(i);
                }
            });
        } else {
            this.f6357b.mo7183c(i);
        }
    }

    /* renamed from: c */
    public final void mo7238c(final int i) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7238c(i);
                }
            });
        } else {
            this.f6357b.mo7179a(i);
        }
    }

    /* renamed from: d */
    public final void mo7240d(final float f) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7240d(f);
                }
            });
        } else {
            mo7238c((int) C1750e.m8356a(this.f6356a.f6338g, this.f6356a.f6339h, f));
        }
    }

    /* renamed from: b */
    public final void mo7235b(boolean z) {
        this.f6371q = z;
        if (this.f6356a != null) {
            this.f6356a.mo7212a(z);
        }
    }

    public void draw(Canvas canvas) {
        float f;
        C1745d.m8324b("Drawable#draw");
        if (this.f6363h != null) {
            float f2 = this.f6358c;
            float a = m8415a(canvas);
            if (f2 > a) {
                f = this.f6358c / a;
            } else {
                a = f2;
                f = 1.0f;
            }
            if (f > 1.0f) {
                canvas.save();
                float width = ((float) this.f6356a.f6337f.width()) / 2.0f;
                float height = ((float) this.f6356a.f6337f.height()) / 2.0f;
                float f3 = width * a;
                float f4 = height * a;
                canvas.translate((this.f6358c * width) - f3, (this.f6358c * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.f6364j.reset();
            this.f6364j.preScale(a, a);
            this.f6363h.mo7132a(canvas, this.f6364j, this.f6370p);
            C1745d.m8325c("Drawable#draw");
            if (f > 1.0f) {
                canvas.restore();
            }
        }
    }

    /* renamed from: a */
    public final void mo7222a(final float f) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7222a(f);
                }
            });
        } else {
            mo7223a((int) C1750e.m8356a(this.f6356a.f6338g, this.f6356a.f6339h, f));
        }
    }

    /* renamed from: a */
    public final void mo7223a(final int i) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7223a(i);
                }
            });
        } else {
            this.f6357b.mo7182b(i);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public final Typeface mo7220a(String str, String str2) {
        C1705a v = m8421v();
        if (v != null) {
            return v.mo7158a(str, str2);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo7224a(final int i, final int i2) {
        if (this.f6356a == null) {
            this.f6366l.add(new C1779a() {
                /* renamed from: a */
                public final void mo7272a(C1757f fVar) {
                    C1767h.this.mo7224a(i, i2);
                }
            });
        } else {
            this.f6357b.mo7180a(i, i2);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }
}
