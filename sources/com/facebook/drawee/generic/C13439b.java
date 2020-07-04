package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.internal.C13307g;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.drawee.generic.b */
public final class C13439b {

    /* renamed from: a */
    public static final C13423b f35625a = C13423b.f35598f;

    /* renamed from: b */
    public static final C13423b f35626b = C13423b.f35599g;

    /* renamed from: c */
    public Resources f35627c;

    /* renamed from: d */
    public int f35628d;

    /* renamed from: e */
    public float f35629e;

    /* renamed from: f */
    public Drawable f35630f;

    /* renamed from: g */
    public C13423b f35631g;

    /* renamed from: h */
    public Drawable f35632h;

    /* renamed from: i */
    public C13423b f35633i;

    /* renamed from: j */
    public Drawable f35634j;

    /* renamed from: k */
    public C13423b f35635k;

    /* renamed from: l */
    public Drawable f35636l;

    /* renamed from: m */
    public C13423b f35637m;

    /* renamed from: n */
    public C13423b f35638n;

    /* renamed from: o */
    public PointF f35639o;

    /* renamed from: p */
    public ColorFilter f35640p;

    /* renamed from: q */
    public Drawable f35641q;

    /* renamed from: r */
    public List<Drawable> f35642r;

    /* renamed from: s */
    public Drawable f35643s;

    /* renamed from: t */
    public RoundingParams f35644t;

    /* renamed from: u */
    private Matrix f35645u;

    /* renamed from: a */
    public final C13438a mo32908a() {
        m39450c();
        return new C13438a(this);
    }

    /* renamed from: c */
    private void m39450c() {
        if (this.f35642r != null) {
            for (Drawable a : this.f35642r) {
                C13307g.m38940a(a);
            }
        }
    }

    /* renamed from: b */
    private void m39449b() {
        this.f35628d = C34943c.f91128x;
        this.f35629e = 0.0f;
        this.f35630f = null;
        this.f35631g = f35625a;
        this.f35632h = null;
        this.f35633i = f35625a;
        this.f35634j = null;
        this.f35635k = f35625a;
        this.f35636l = null;
        this.f35637m = f35625a;
        this.f35638n = f35626b;
        this.f35645u = null;
        this.f35639o = null;
        this.f35640p = null;
        this.f35641q = null;
        this.f35642r = null;
        this.f35643s = null;
        this.f35644t = null;
    }

    /* renamed from: a */
    public final C13439b mo32909a(float f) {
        this.f35629e = f;
        return this;
    }

    /* renamed from: b */
    public final C13439b mo32918b(Drawable drawable) {
        this.f35632h = drawable;
        return this;
    }

    /* renamed from: c */
    public final C13439b mo32921c(Drawable drawable) {
        this.f35634j = drawable;
        return this;
    }

    /* renamed from: d */
    public final C13439b mo32924d(Drawable drawable) {
        this.f35636l = drawable;
        return this;
    }

    /* renamed from: e */
    public final C13439b mo32926e(Drawable drawable) {
        this.f35641q = drawable;
        return this;
    }

    /* renamed from: a */
    public static C13439b m39448a(Resources resources) {
        return new C13439b(resources);
    }

    /* renamed from: b */
    public final C13439b mo32919b(C13423b bVar) {
        this.f35633i = bVar;
        return this;
    }

    /* renamed from: c */
    public final C13439b mo32922c(C13423b bVar) {
        this.f35635k = bVar;
        return this;
    }

    /* renamed from: d */
    public final C13439b mo32925d(C13423b bVar) {
        this.f35637m = bVar;
        return this;
    }

    /* renamed from: e */
    public final C13439b mo32927e(C13423b bVar) {
        this.f35638n = bVar;
        this.f35645u = null;
        return this;
    }

    public C13439b(Resources resources) {
        this.f35627c = resources;
        m39449b();
    }

    /* renamed from: b */
    public final C13439b mo32917b(int i) {
        this.f35630f = this.f35627c.getDrawable(i);
        return this;
    }

    /* renamed from: c */
    public final C13439b mo32920c(int i) {
        this.f35632h = this.f35627c.getDrawable(i);
        return this;
    }

    /* renamed from: d */
    public final C13439b mo32923d(int i) {
        this.f35634j = this.f35627c.getDrawable(i);
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32910a(int i) {
        this.f35628d = i;
        return this;
    }

    /* renamed from: f */
    public final C13439b mo32928f(Drawable drawable) {
        if (drawable == null) {
            this.f35642r = null;
        } else {
            this.f35642r = Arrays.asList(new Drawable[]{drawable});
        }
        return this;
    }

    /* renamed from: g */
    public final C13439b mo32929g(Drawable drawable) {
        if (drawable == null) {
            this.f35643s = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f35643s = stateListDrawable;
        }
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32911a(ColorFilter colorFilter) {
        this.f35640p = colorFilter;
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32912a(PointF pointF) {
        this.f35639o = pointF;
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32913a(Drawable drawable) {
        this.f35630f = drawable;
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32914a(C13423b bVar) {
        this.f35631g = bVar;
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32915a(RoundingParams roundingParams) {
        this.f35644t = roundingParams;
        return this;
    }

    /* renamed from: a */
    public final C13439b mo32916a(List<Drawable> list) {
        this.f35642r = list;
        return this;
    }
}
