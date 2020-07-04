package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.C13307g;
import com.facebook.drawee.drawable.C13408c;
import com.facebook.drawee.drawable.C13411f;
import com.facebook.drawee.drawable.C13412g;
import com.facebook.drawee.drawable.C13413h;
import com.facebook.drawee.drawable.C13420o;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.p698c.C13388c;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.drawee.generic.a */
public class C13438a implements C13388c {

    /* renamed from: a */
    public RoundingParams f35619a;

    /* renamed from: b */
    public final C13411f f35620b;

    /* renamed from: c */
    private final Drawable f35621c = new ColorDrawable(0);

    /* renamed from: d */
    private final Resources f35622d;

    /* renamed from: e */
    private final C13441d f35623e;

    /* renamed from: f */
    private final C13412g f35624f;

    /* renamed from: a */
    public final Drawable mo32722a() {
        return this.f35623e;
    }

    /* renamed from: a */
    public final void mo32725a(Drawable drawable, float f, boolean z) {
        Drawable a = C13442e.m39483a(drawable, this.f35619a, this.f35622d);
        a.mutate();
        this.f35624f.setDrawable(a);
        this.f35620b.mo32810b();
        m39417e();
        m39418e(2);
        m39411a(f);
        if (z) {
            this.f35620b.mo32815e();
        }
        this.f35620b.mo32811c();
    }

    /* renamed from: a */
    public final void mo32726a(Throwable th) {
        this.f35620b.mo32810b();
        m39417e();
        if (this.f35620b.mo32778a(5) != null) {
            m39418e(5);
        } else {
            m39418e(1);
        }
        this.f35620b.mo32811c();
    }

    /* renamed from: a */
    public final void mo32724a(Drawable drawable) {
        this.f35623e.mo32930a(drawable);
    }

    /* renamed from: a */
    public final void mo32896a(C13423b bVar) {
        C13307g.m38940a(bVar);
        m39422h(2).mo32863a(bVar);
    }

    /* renamed from: a */
    public final void mo32895a(Drawable drawable, C13423b bVar) {
        m39412a(1, drawable);
        m39422h(1).mo32863a(bVar);
    }

    /* renamed from: a */
    public final void mo32897a(RoundingParams roundingParams) {
        this.f35619a = roundingParams;
        C13442e.m39486a((C13408c) this.f35623e, this.f35619a);
        for (int i = 0; i < this.f35620b.mo32777a(); i++) {
            C13442e.m39487a(m39421g(i), this.f35619a, this.f35622d);
        }
    }

    /* renamed from: c */
    private void m39414c() {
        this.f35624f.setDrawable(this.f35621c);
    }

    /* renamed from: b */
    public final void mo32727b() {
        m39414c();
        m39415d();
    }

    /* renamed from: d */
    private void m39415d() {
        if (this.f35620b != null) {
            this.f35620b.mo32810b();
            this.f35620b.mo32813d();
            m39417e();
            m39418e(1);
            this.f35620b.mo32815e();
            this.f35620b.mo32811c();
        }
    }

    /* renamed from: e */
    private void m39417e() {
        m39419f(1);
        m39419f(2);
        m39419f(3);
        m39419f(4);
        m39419f(5);
    }

    /* renamed from: e */
    private void m39418e(int i) {
        if (i >= 0) {
            this.f35620b.mo32814d(i);
        }
    }

    /* renamed from: f */
    private void m39419f(int i) {
        if (i >= 0) {
            this.f35620b.mo32816e(i);
        }
    }

    /* renamed from: d */
    public final void mo32906d(Drawable drawable) {
        m39412a(3, drawable);
    }

    /* renamed from: f */
    private void m39420f(Drawable drawable) {
        m39412a(4, drawable);
    }

    /* renamed from: a */
    public final void mo32890a(int i) {
        this.f35620b.mo32812c(i);
    }

    /* renamed from: b */
    public final void mo32898b(int i) {
        mo32900b(this.f35622d.getDrawable(i));
    }

    /* renamed from: e */
    public final void mo32907e(Drawable drawable) {
        m39412a(0, drawable);
    }

    /* renamed from: h */
    private C13420o m39422h(int i) {
        C13408c g = m39421g(i);
        if (g instanceof C13420o) {
            return (C13420o) g;
        }
        return C13442e.m39485a(g, C13423b.f35593a);
    }

    /* renamed from: c */
    public final void mo32902c(int i) {
        mo32904c(this.f35622d.getDrawable(i));
    }

    /* renamed from: a */
    private void m39411a(float f) {
        Drawable a = this.f35620b.mo32778a(3);
        if (a != null) {
            if (f >= 0.999f) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                m39419f(3);
            } else {
                if (a instanceof Animatable) {
                    ((Animatable) a).start();
                }
                m39418e(3);
            }
            a.setLevel(Math.round(f * 10000.0f));
        }
    }

    /* renamed from: g */
    private C13408c m39421g(int i) {
        C13408c b = this.f35620b.mo32780b(i);
        if (b.getDrawable() instanceof C13413h) {
            b = (C13413h) b.getDrawable();
        }
        if (b.getDrawable() instanceof C13420o) {
            return (C13420o) b.getDrawable();
        }
        return b;
    }

    /* renamed from: b */
    public final void mo32900b(Drawable drawable) {
        m39412a(1, drawable);
    }

    /* renamed from: d */
    public final void mo32905d(int i) {
        m39420f(this.f35622d.getDrawable(i));
    }

    /* renamed from: c */
    public final void mo32904c(Drawable drawable) {
        m39412a(5, drawable);
    }

    C13438a(C13439b bVar) {
        int i;
        int i2;
        if (C13783b.m40665b()) {
            C13783b.m40664a("GenericDraweeHierarchy()");
        }
        this.f35622d = bVar.f35627c;
        this.f35619a = bVar.f35644t;
        this.f35624f = new C13412g(this.f35621c);
        int i3 = 1;
        if (bVar.f35642r != null) {
            i = bVar.f35642r.size();
        } else {
            i = 1;
        }
        if (bVar.f35643s != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        Drawable[] drawableArr = new Drawable[(i4 + 6)];
        drawableArr[0] = m39413c(bVar.f35641q, (C13423b) null);
        drawableArr[1] = m39413c(bVar.f35630f, bVar.f35631g);
        drawableArr[2] = m39410a(this.f35624f, bVar.f35638n, bVar.f35639o, bVar.f35640p);
        drawableArr[3] = m39413c(bVar.f35636l, bVar.f35637m);
        drawableArr[4] = m39413c(bVar.f35632h, bVar.f35633i);
        drawableArr[5] = m39413c(bVar.f35634j, bVar.f35635k);
        if (i4 > 0) {
            if (bVar.f35642r != null) {
                i3 = 0;
                for (Drawable c : bVar.f35642r) {
                    int i5 = i3 + 1;
                    drawableArr[i3 + 6] = m39413c(c, (C13423b) null);
                    i3 = i5;
                }
            }
            if (bVar.f35643s != null) {
                drawableArr[i3 + 6] = m39413c(bVar.f35643s, (C13423b) null);
            }
        }
        this.f35620b = new C13411f(drawableArr);
        this.f35620b.mo32812c(bVar.f35628d);
        this.f35623e = new C13441d(C13442e.m39482a((Drawable) this.f35620b, this.f35619a));
        this.f35623e.mutate();
        m39415d();
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: b */
    public final void mo32728b(Throwable th) {
        this.f35620b.mo32810b();
        m39417e();
        if (this.f35620b.mo32778a(4) != null) {
            m39418e(4);
        } else {
            m39418e(1);
        }
        this.f35620b.mo32811c();
    }

    /* renamed from: a */
    public final void mo32892a(ColorFilter colorFilter) {
        this.f35624f.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final void mo32893a(PointF pointF) {
        C13307g.m38940a(pointF);
        m39422h(2).mo32862a(pointF);
    }

    /* renamed from: a */
    public final void mo32894a(RectF rectF) {
        this.f35624f.getTransformedBounds(rectF);
    }

    /* renamed from: c */
    private Drawable m39413c(Drawable drawable, C13423b bVar) {
        return C13442e.m39480a(C13442e.m39483a(drawable, this.f35619a, this.f35622d), bVar);
    }

    /* renamed from: d */
    private void m39416d(Drawable drawable, C13423b bVar) {
        m39412a(4, drawable);
        m39422h(4).mo32863a(bVar);
    }

    /* renamed from: a */
    private void m39412a(int i, Drawable drawable) {
        if (drawable == null) {
            this.f35620b.mo32779a(i, null);
            return;
        }
        m39421g(i).setDrawable(C13442e.m39483a(drawable, this.f35619a, this.f35622d));
    }

    /* renamed from: b */
    public final void mo32899b(int i, C13423b bVar) {
        mo32901b(this.f35622d.getDrawable(i), bVar);
    }

    /* renamed from: c */
    public final void mo32903c(int i, C13423b bVar) {
        m39416d(this.f35622d.getDrawable(i), bVar);
    }

    /* renamed from: a */
    public final void mo32723a(float f, boolean z) {
        if (this.f35620b.mo32778a(3) != null) {
            this.f35620b.mo32810b();
            m39411a(f);
            if (z) {
                this.f35620b.mo32815e();
            }
            this.f35620b.mo32811c();
        }
    }

    /* renamed from: b */
    public final void mo32901b(Drawable drawable, C13423b bVar) {
        m39412a(5, drawable);
        m39422h(5).mo32863a(bVar);
    }

    /* renamed from: a */
    public final void mo32891a(int i, C13423b bVar) {
        mo32895a(this.f35622d.getDrawable(i), bVar);
    }

    /* renamed from: a */
    private static Drawable m39410a(Drawable drawable, C13423b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C13442e.m39481a(drawable, bVar, pointF);
    }
}
