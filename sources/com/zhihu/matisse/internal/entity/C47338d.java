package com.zhihu.matisse.internal.entity;

import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.p1853a.C47322a;
import com.zhihu.matisse.p1854b.C47324a;
import com.zhihu.matisse.p1854b.C47326c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.internal.entity.d */
public final class C47338d {

    /* renamed from: a */
    public Set<MimeType> f121445a;

    /* renamed from: b */
    public boolean f121446b;

    /* renamed from: c */
    public boolean f121447c;

    /* renamed from: d */
    public int f121448d;

    /* renamed from: e */
    public int f121449e;

    /* renamed from: f */
    public boolean f121450f;

    /* renamed from: g */
    public int f121451g;

    /* renamed from: h */
    public int f121452h;

    /* renamed from: i */
    public int f121453i;

    /* renamed from: j */
    public List<C47322a> f121454j;

    /* renamed from: k */
    public boolean f121455k;

    /* renamed from: l */
    public C47335a f121456l;

    /* renamed from: m */
    public int f121457m;

    /* renamed from: n */
    public int f121458n;

    /* renamed from: o */
    public float f121459o;

    /* renamed from: p */
    public boolean f121460p;

    /* renamed from: q */
    public C47326c f121461q;

    /* renamed from: r */
    public boolean f121462r;

    /* renamed from: s */
    public boolean f121463s;

    /* renamed from: t */
    public int f121464t;

    /* renamed from: u */
    public C47324a f121465u;

    /* renamed from: com.zhihu.matisse.internal.entity.d$a */
    static final class C47340a {

        /* renamed from: a */
        public static final C47338d f121466a = new C47338d();
    }

    private C47338d() {
    }

    /* renamed from: a */
    public static C47338d m147803a() {
        return C47340a.f121466a;
    }

    /* renamed from: b */
    public static C47338d m147804b() {
        C47338d a = m147803a();
        a.m147805g();
        return a;
    }

    /* renamed from: d */
    public final boolean mo119364d() {
        if (this.f121449e != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo119363c() {
        if (this.f121450f || (this.f121451g != 1 && (this.f121452h != 1 || this.f121453i != 1))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo119365e() {
        if (!this.f121447c || !MimeType.ofImage().containsAll(this.f121445a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo119366f() {
        if (!this.f121447c || !MimeType.ofVideo().containsAll(this.f121445a)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m147805g() {
        this.f121445a = null;
        this.f121446b = true;
        this.f121447c = false;
        this.f121448d = R.style.gw;
        this.f121449e = 0;
        this.f121450f = false;
        this.f121451g = 1;
        this.f121452h = 0;
        this.f121453i = 0;
        this.f121454j = null;
        this.f121455k = false;
        this.f121456l = null;
        this.f121457m = 3;
        this.f121458n = 0;
        this.f121459o = 0.5f;
        this.f121460p = true;
        this.f121462r = false;
        this.f121463s = false;
        this.f121464t = Integer.MAX_VALUE;
    }
}
