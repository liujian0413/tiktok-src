package com.facebook.imagepipeline.p717d;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.p683a.C13259i;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13311k;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p686c.C13286a;
import com.facebook.imageformat.C13511d;
import com.facebook.imagepipeline.animated.p712a.C13519a;
import com.facebook.imagepipeline.animated.p712a.C13520b;
import com.facebook.imagepipeline.decoder.C13627a;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.memory.C13802ac;
import com.facebook.imagepipeline.p715b.C13546a;
import com.facebook.imagepipeline.p715b.C13547b;
import com.facebook.imagepipeline.p715b.C13548c;
import com.facebook.imagepipeline.p715b.C13550e;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13554a;
import com.facebook.imagepipeline.p716c.C13556b;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13570h;
import com.facebook.imagepipeline.p716c.C13579l;
import com.facebook.imagepipeline.p716c.C13581m;
import com.facebook.imagepipeline.p716c.C13584o;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p722i.C13654a;
import com.facebook.imagepipeline.p722i.C13656c;
import com.facebook.imagepipeline.p722i.C13657d;
import com.facebook.imagepipeline.p722i.C13658e;
import com.facebook.imagepipeline.p722i.C13659f;
import com.facebook.imagepipeline.p724k.C13723ay;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.p726m.C13790c;
import com.facebook.imagepipeline.p726m.C13792e;
import com.facebook.imagepipeline.p726m.C13794g;

/* renamed from: com.facebook.imagepipeline.d.l */
public class C13622l {

    /* renamed from: a */
    private static final Class<?> f36153a = C13622l.class;

    /* renamed from: b */
    private static C13622l f36154b;

    /* renamed from: u */
    private static C13629b f36155u;

    /* renamed from: c */
    private final C13723ay f36156c;

    /* renamed from: d */
    private final C13613j f36157d;

    /* renamed from: e */
    private C13570h<C13265a, C13645c> f36158e;

    /* renamed from: f */
    private C13584o<C13265a, C13645c> f36159f;

    /* renamed from: g */
    private C13570h<C13265a, PooledByteBuffer> f36160g;

    /* renamed from: h */
    private C13584o<C13265a, PooledByteBuffer> f36161h;

    /* renamed from: i */
    private C13561e f36162i;

    /* renamed from: j */
    private C13259i f36163j;

    /* renamed from: k */
    private C13629b f36164k;

    /* renamed from: l */
    private C13606i f36165l;

    /* renamed from: m */
    private C13790c f36166m;

    /* renamed from: n */
    private C13625n f36167n;

    /* renamed from: o */
    private C13626o f36168o;

    /* renamed from: p */
    private C13561e f36169p;

    /* renamed from: q */
    private C13259i f36170q;

    /* renamed from: r */
    private C13551f f36171r;

    /* renamed from: s */
    private C13659f f36172s;

    /* renamed from: t */
    private C13519a f36173t;

    /* renamed from: a */
    public static C13622l m40095a() {
        return (C13622l) C13307g.m38941a(f36154b, (Object) "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: g */
    private C13519a m40099g() {
        if (this.f36173t == null) {
            this.f36173t = C13520b.m39768a(mo33209e(), this.f36157d.f36074i, m40100h());
        }
        return this.f36173t;
    }

    /* renamed from: h */
    private C13570h<C13265a, C13645c> m40100h() {
        if (this.f36158e == null) {
            this.f36158e = C13554a.m39886a(this.f36157d.f36067b, this.f36157d.f36081p, this.f36157d.f36068c);
        }
        return this.f36158e;
    }

    /* renamed from: i */
    private C13570h<C13265a, PooledByteBuffer> m40101i() {
        if (this.f36160g == null) {
            this.f36160g = C13579l.m39974a(this.f36157d.f36073h, this.f36157d.f36081p);
        }
        return this.f36160g;
    }

    /* renamed from: j */
    private C13584o<C13265a, PooledByteBuffer> m40102j() {
        if (this.f36161h == null) {
            this.f36161h = C13581m.m39977a(m40101i(), this.f36157d.f36075j);
        }
        return this.f36161h;
    }

    /* renamed from: m */
    private C13659f m40105m() {
        if (this.f36172s == null) {
            this.f36172s = m40096a(this.f36157d.f36085t, this.f36157d.f36090y.f36136o);
        }
        return this.f36172s;
    }

    /* renamed from: b */
    public final C13584o<C13265a, C13645c> mo33205b() {
        if (this.f36159f == null) {
            this.f36159f = C13556b.m39889a(m40100h(), this.f36157d.f36075j);
        }
        return this.f36159f;
    }

    /* renamed from: c */
    public final C13259i mo33207c() {
        if (this.f36163j == null) {
            this.f36163j = this.f36157d.f36072g.mo33169a(this.f36157d.f36080o);
        }
        return this.f36163j;
    }

    /* renamed from: e */
    public final C13551f mo33209e() {
        if (this.f36171r == null) {
            this.f36171r = m40094a(this.f36157d.f36085t, m40105m());
        }
        return this.f36171r;
    }

    /* renamed from: f */
    public final C13259i mo33210f() {
        if (this.f36170q == null) {
            this.f36170q = this.f36157d.f36072g.mo33169a(this.f36157d.f36088w);
        }
        return this.f36170q;
    }

    /* renamed from: l */
    private C13561e m40104l() {
        if (this.f36162i == null) {
            C13561e eVar = new C13561e(mo33207c(), this.f36157d.f36085t.mo33427a(this.f36157d.f36082q), this.f36157d.f36085t.mo33432e(), this.f36157d.f36074i.mo33164a(), this.f36157d.f36074i.mo33165b(), this.f36157d.f36075j);
            this.f36162i = eVar;
        }
        return this.f36162i;
    }

    /* renamed from: p */
    private C13561e m40108p() {
        if (this.f36169p == null) {
            C13561e eVar = new C13561e(mo33210f(), this.f36157d.f36085t.mo33427a(this.f36157d.f36082q), this.f36157d.f36085t.mo33432e(), this.f36157d.f36074i.mo33164a(), this.f36157d.f36074i.mo33165b(), this.f36157d.f36075j);
            this.f36169p = eVar;
        }
        return this.f36169p;
    }

    /* renamed from: r */
    private C13629b m40110r() {
        if (f36155u == null) {
            try {
                f36155u = (C13629b) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(new Class[]{C13322g.class}).newInstance(new Object[]{this.f36157d.f36085t.mo33431d()});
            } catch (Throwable unused) {
                return null;
            }
        }
        return f36155u;
    }

    /* renamed from: k */
    private C13629b m40103k() {
        C13629b bVar;
        C13629b bVar2;
        if (this.f36164k == null) {
            if (this.f36157d.f36076k != null) {
                this.f36164k = this.f36157d.f36076k;
            } else {
                C13519a g = m40099g();
                C13629b r = m40110r();
                if (g != null) {
                    C13629b gifDecoder = g.getGifDecoder(Config.RGB_565);
                    bVar = g.getWebPDecoder(Config.RGB_565);
                    bVar2 = gifDecoder;
                } else {
                    bVar2 = null;
                    bVar = null;
                }
                if (this.f36157d.f36089x == null) {
                    this.f36164k = new C13627a(bVar2, bVar, r, m40105m());
                } else {
                    C13627a aVar = new C13627a(bVar2, bVar, r, m40105m(), this.f36157d.f36089x.f36237a);
                    this.f36164k = aVar;
                    C13511d.m39758a().mo33050a(this.f36157d.f36089x.f36238b);
                }
            }
        }
        return this.f36164k;
    }

    /* renamed from: o */
    private C13626o m40107o() {
        boolean z;
        if (VERSION.SDK_INT < 24 || !this.f36157d.f36090y.f36127f) {
            z = false;
        } else {
            z = true;
        }
        if (this.f36168o == null) {
            C13626o oVar = new C13626o(this.f36157d.f36070e.getApplicationContext().getContentResolver(), m40106n(), this.f36157d.f36083r, this.f36157d.f36087v, this.f36157d.f36090y.f36122a, this.f36156c, this.f36157d.f36071f, z, this.f36157d.f36090y.f36133l, this.f36157d.f36091z, m40109q());
            this.f36168o = oVar;
        }
        return this.f36168o;
    }

    /* renamed from: q */
    private C13790c m40109q() {
        if (this.f36166m == null) {
            if (this.f36157d.f36077l == null && this.f36157d.f36078m == null && this.f36157d.f36090y.f36132k) {
                this.f36166m = new C13794g(this.f36157d.f36090y.f36131j);
            } else {
                this.f36166m = new C13792e(this.f36157d.f36090y.f36131j, this.f36157d.f36090y.f36126e, this.f36157d.f36077l, this.f36157d.f36078m);
            }
        }
        return this.f36166m;
    }

    /* renamed from: d */
    public final C13606i mo33208d() {
        if (this.f36165l == null) {
            C13606i iVar = new C13606i(m40107o(), this.f36157d.mo33191b(), this.f36157d.f36079n, mo33205b(), m40102j(), m40104l(), m40108p(), this.f36157d.f36069d, this.f36156c, C13311k.m38954a(Boolean.valueOf(false)), this.f36157d.f36090y.f36135n);
            this.f36165l = iVar;
        }
        return this.f36165l;
    }

    /* renamed from: n */
    private C13625n m40106n() {
        if (this.f36167n == null) {
            this.f36167n = this.f36157d.f36090y.f36134m.mo33204a(this.f36157d.f36070e, this.f36157d.f36085t.mo33433f(), m40103k(), this.f36157d.f36086u, this.f36157d.f36071f, this.f36157d.f36087v, this.f36157d.f36090y.f36124c, this.f36157d.f36074i, this.f36157d.f36085t.mo33427a(this.f36157d.f36082q), mo33205b(), m40102j(), m40104l(), m40108p(), this.f36157d.f36069d, mo33209e(), this.f36157d.f36090y.f36128g, this.f36157d.f36090y.f36129h, this.f36157d.f36090y.f36130i, this.f36157d.f36090y.f36131j);
        }
        return this.f36167n;
    }

    /* renamed from: b */
    public final C13642a mo33206b(Context context) {
        C13519a g = m40099g();
        if (g == null) {
            return null;
        }
        return g.getAnimatedDrawableFactory(context);
    }

    /* renamed from: a */
    public static synchronized void m40098a(C13613j jVar) {
        synchronized (C13622l.class) {
            if (f36154b != null) {
                C13286a.m38848b(f36153a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f36154b = new C13622l(jVar);
        }
    }

    private C13622l(C13613j jVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ImagePipelineConfig()");
        }
        this.f36157d = (C13613j) C13307g.m38940a(jVar);
        this.f36156c = new C13723ay(jVar.f36074i.mo33168e());
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: a */
    public static synchronized void m40097a(Context context) {
        synchronized (C13622l.class) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ImagePipelineFactory#initialize");
            }
            m40098a(C13613j.m40072a(context).mo33200a());
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: a */
    private static C13551f m40094a(C13802ac acVar, C13659f fVar) {
        if (VERSION.SDK_INT >= 21) {
            return new C13546a(acVar.mo33428a());
        }
        if (VERSION.SDK_INT >= 11) {
            return new C13550e(new C13547b(acVar.mo33431d()), fVar);
        }
        return new C13548c();
    }

    /* renamed from: a */
    private static C13659f m40096a(C13802ac acVar, boolean z) {
        if (VERSION.SDK_INT >= 26) {
            int c = acVar.mo33430c();
            return new C13658e(acVar.mo33428a(), c, new SynchronizedPool(c));
        } else if (VERSION.SDK_INT >= 21) {
            int c2 = acVar.mo33430c();
            return new C13654a(acVar.mo33428a(), c2, new SynchronizedPool(c2));
        } else if (!z || VERSION.SDK_INT >= 19) {
            return new C13657d(acVar.mo33429b());
        } else {
            return new C13656c();
        }
    }
}
