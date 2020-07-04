package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.lighten.core.C12125f;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p716c.C13559d;
import com.facebook.imagepipeline.p716c.C13570h;
import com.facebook.imagepipeline.p716c.C13576i;
import com.facebook.imagepipeline.p716c.C13586q;
import com.facebook.imagepipeline.p716c.C13592v;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p720g.C13643a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.loader.a */
public final class C12143a {

    /* renamed from: a */
    public C13570h<C13265a, C13645c> f32358a;

    /* renamed from: b */
    public int f32359b;

    /* renamed from: c */
    private C12157j f32360c;

    /* renamed from: com.bytedance.lighten.loader.a$a */
    static final class C12147a {

        /* renamed from: a */
        public static final C12143a f32366a = new C12143a();
    }

    /* renamed from: b */
    public static C12143a m35367b() {
        return C12147a.f32366a;
    }

    /* renamed from: a */
    public final void mo29874a() {
        if (this.f32358a != null) {
            try {
                this.f32358a.mo33131a();
            } catch (Exception unused) {
            }
        }
    }

    private C12143a() {
        this.f32359b = C12190x.m35445a(C12125f.m35294a());
        m35368c();
        m35369d();
    }

    /* renamed from: d */
    private void m35369d() {
        this.f32360c = new C12157j(C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("bitmap-cache").mo18996a()), 10);
    }

    /* renamed from: c */
    private void m35368c() {
        this.f32358a = new C13570h<>(new C13592v<C13645c>() {
            /* renamed from: a */
            private static int m35373a(C13645c cVar) {
                return cVar.mo33259b();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo29877a(Object obj) {
                return m35373a((C13645c) obj);
            }
        }, new C13559d(), new C13576i((ActivityManager) C12125f.m35294a().getSystemService("activity")) {
            /* renamed from: a */
            public final C13586q mo29879b() {
                C13586q qVar = new C13586q(C12143a.this.f32359b, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                return qVar;
            }
        });
    }

    /* renamed from: a */
    public final C13326a<Bitmap> mo29873a(String str) {
        C13326a a = this.f32358a.mo33128a(new C13270f(str));
        if (a != null) {
            return m35366a(a);
        }
        return null;
    }

    /* renamed from: a */
    private static C13326a<Bitmap> m35366a(C13326a<C13645c> aVar) {
        try {
            if (C13326a.m38999a(aVar) && (aVar.mo32609a() instanceof C13646d)) {
                C13646d dVar = (C13646d) aVar.mo32609a();
                if (dVar != null) {
                    return dVar.mo33268f();
                }
            }
            C13326a.m39001c(aVar);
            return null;
        } finally {
            C13326a.m39001c(aVar);
        }
    }

    /* renamed from: a */
    public final void mo29875a(final String str, C13643a aVar) {
        if (!(TextUtils.isEmpty(str) || aVar == null || aVar.mo33262d() == null)) {
            final C13326a a = aVar.mo33262d().mo33082a();
            if (a != null && a.mo32614d()) {
                C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                    public final Object call() throws Exception {
                        if (a.mo32614d()) {
                            C13326a a = C13622l.m40095a().mo33209e().mo33096a((Bitmap) a.mo32609a());
                            C13326a a2 = C13326a.m38995a(new C13646d(a, C13649g.f36269a, 0));
                            C13326a a3 = C12143a.this.f32358a.mo33129a(new C13270f(str), a2);
                            C13326a.m39001c(a);
                            C13326a.m39001c(a3);
                            C13326a.m39001c(a2);
                        }
                        return null;
                    }
                }, (Executor) this.f32360c);
            }
        }
    }
}
