package com.bytedance.lighten.core;

import android.content.Context;
import android.graphics.Bitmap.Config;
import com.bytedance.lighten.core.p610a.C12094c.C12095a;
import com.bytedance.lighten.core.p612c.C12116n;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.lighten.core.o */
public final class C12134o {

    /* renamed from: a */
    public Context f32223a;

    /* renamed from: b */
    public Config f32224b;

    /* renamed from: c */
    public int f32225c;

    /* renamed from: d */
    public C12130k f32226d;

    /* renamed from: e */
    public File f32227e;

    /* renamed from: f */
    public long f32228f;

    /* renamed from: g */
    public long f32229g;

    /* renamed from: h */
    public long f32230h;

    /* renamed from: i */
    public long f32231i;

    /* renamed from: j */
    public int f32232j;

    /* renamed from: k */
    public boolean f32233k;

    /* renamed from: l */
    public C12095a f32234l;

    /* renamed from: m */
    public boolean f32235m;

    /* renamed from: n */
    public boolean f32236n;

    /* renamed from: o */
    public C12116n f32237o;

    /* renamed from: p */
    public List<C12091a> f32238p;

    /* renamed from: q */
    public boolean f32239q;

    /* renamed from: r */
    public C12129j f32240r;

    /* renamed from: com.bytedance.lighten.core.o$a */
    public static final class C12136a {

        /* renamed from: a */
        public Context f32241a;

        /* renamed from: b */
        public C12130k f32242b;

        /* renamed from: c */
        public File f32243c;

        /* renamed from: d */
        public long f32244d;

        /* renamed from: e */
        public long f32245e;

        /* renamed from: f */
        public long f32246f;

        /* renamed from: g */
        public long f32247g;

        /* renamed from: h */
        public int f32248h = 5;

        /* renamed from: i */
        public C12095a f32249i;

        /* renamed from: j */
        public Config f32250j;

        /* renamed from: k */
        public int f32251k = -1;

        /* renamed from: l */
        public boolean f32252l;

        /* renamed from: m */
        public boolean f32253m;

        /* renamed from: n */
        public C12116n f32254n;

        /* renamed from: o */
        public boolean f32255o;

        /* renamed from: p */
        public List<C12091a> f32256p;

        /* renamed from: q */
        public boolean f32257q = true;

        /* renamed from: r */
        public C12129j f32258r;

        /* renamed from: a */
        public final C12134o mo29831a() {
            return new C12134o(this);
        }

        /* renamed from: a */
        public final C12136a mo29822a(int i) {
            this.f32248h = i;
            return this;
        }

        /* renamed from: b */
        public final C12136a mo29832b(int i) {
            this.f32251k = 1;
            return this;
        }

        /* renamed from: c */
        public final C12136a mo29834c(boolean z) {
            this.f32255o = true;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29823a(long j) {
            this.f32244d = j;
            return this;
        }

        /* renamed from: b */
        public final C12136a mo29833b(boolean z) {
            this.f32253m = z;
            return this;
        }

        C12136a(Context context) {
            this.f32241a = context;
        }

        /* renamed from: a */
        public final C12136a mo29824a(Config config) {
            this.f32250j = config;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29825a(C12095a aVar) {
            this.f32249i = aVar;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29826a(C12116n nVar) {
            this.f32254n = nVar;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29827a(C12130k kVar) {
            this.f32242b = kVar;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29828a(File file) {
            this.f32243c = file;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29829a(List<C12091a> list) {
            this.f32256p = list;
            return this;
        }

        /* renamed from: a */
        public final C12136a mo29830a(boolean z) {
            this.f32252l = true;
            return this;
        }
    }

    /* renamed from: a */
    public static C12136a m35308a(Context context) {
        return new C12136a(context);
    }

    private C12134o(C12136a aVar) {
        this.f32223a = aVar.f32241a;
        this.f32226d = aVar.f32242b;
        this.f32227e = aVar.f32243c;
        this.f32230h = aVar.f32244d;
        this.f32228f = aVar.f32245e;
        this.f32229g = aVar.f32246f;
        this.f32231i = aVar.f32247g;
        this.f32232j = aVar.f32248h;
        this.f32234l = aVar.f32249i;
        this.f32224b = aVar.f32250j;
        this.f32225c = aVar.f32251k;
        this.f32235m = aVar.f32252l;
        this.f32237o = aVar.f32254n;
        this.f32233k = aVar.f32255o;
        this.f32236n = aVar.f32253m;
        this.f32238p = aVar.f32256p;
        this.f32239q = aVar.f32257q;
        this.f32240r = aVar.f32258r;
    }
}
