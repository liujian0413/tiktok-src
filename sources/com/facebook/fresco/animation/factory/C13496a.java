package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.references.C13326a;
import com.facebook.common.time.C13331b;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p702a.C13462c;
import com.facebook.fresco.animation.p703b.C13466a;
import com.facebook.fresco.animation.p703b.C13470b;
import com.facebook.fresco.animation.p703b.C13476c;
import com.facebook.fresco.animation.p703b.p704a.C13467a;
import com.facebook.fresco.animation.p703b.p704a.C13468b;
import com.facebook.fresco.animation.p703b.p704a.C13469c;
import com.facebook.fresco.animation.p703b.p705b.C13471a;
import com.facebook.fresco.animation.p703b.p705b.C13472b;
import com.facebook.fresco.animation.p703b.p705b.C13473c;
import com.facebook.fresco.animation.p703b.p705b.C13475d;
import com.facebook.fresco.animation.p703b.p706c.C13477a;
import com.facebook.fresco.animation.p703b.p706c.C13478b;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.imagepipeline.animated.base.C13538a;
import com.facebook.imagepipeline.animated.base.C13541d;
import com.facebook.imagepipeline.animated.base.C13543f;
import com.facebook.imagepipeline.animated.p713b.C13529b;
import com.facebook.imagepipeline.animated.p713b.C13530c;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13570h;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13643a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.facebook.fresco.animation.factory.a */
public final class C13496a implements C13642a {

    /* renamed from: a */
    private final C13529b f35781a;

    /* renamed from: b */
    private final ScheduledExecutorService f35782b;

    /* renamed from: c */
    private final ExecutorService f35783c;

    /* renamed from: d */
    private final C13331b f35784d;

    /* renamed from: e */
    private final C13551f f35785e;

    /* renamed from: f */
    private final C13570h<C13265a, C13645c> f35786f;

    /* renamed from: g */
    private final C13310j<Integer> f35787g;

    /* renamed from: h */
    private final C13310j<Integer> f35788h;

    /* renamed from: com.facebook.fresco.animation.factory.a$a */
    public static class C13497a implements C13265a {

        /* renamed from: a */
        private final String f35789a;

        /* renamed from: a */
        public final String mo32489a() {
            return this.f35789a;
        }

        public final String toString() {
            return this.f35789a;
        }

        public final int hashCode() {
            if (this.f35789a != null) {
                return this.f35789a.hashCode();
            }
            return 0;
        }

        /* renamed from: a */
        public final boolean mo32490a(Uri uri) {
            return uri.toString().startsWith(this.f35789a);
        }

        public C13497a(int i) {
            StringBuilder sb = new StringBuilder("anim://");
            sb.append(i);
            this.f35789a = sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C13497a aVar = (C13497a) obj;
            if (this.f35789a != null) {
                return this.f35789a.equals(aVar.f35789a);
            }
            if (aVar.f35789a == null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo32678a(C13645c cVar) {
        return cVar instanceof C13643a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C13480a mo32679b(C13645c cVar) {
        C13643a aVar = (C13643a) cVar;
        return new C13480a(m39689a(aVar), aVar.f36251a.f36012k);
    }

    /* renamed from: a */
    private C13538a m39691a(C13543f fVar) {
        C13541d dVar = fVar.f35911a;
        return this.f35781a.mo33043a(fVar, new Rect(0, 0, dVar.getWidth(), dVar.getHeight()));
    }

    /* renamed from: b */
    private C13470b m39693b(C13543f fVar) {
        switch (((Integer) this.f35787g.mo29879b()).intValue()) {
            case 1:
                return new C13467a(m39695c(fVar), true);
            case 2:
                return new C13467a(m39695c(fVar), false);
            case 3:
                return new C13468b();
            default:
                return new C13469c();
        }
    }

    /* renamed from: c */
    private C13530c m39695c(C13543f fVar) {
        C13530c cVar = new C13530c(new C13497a(fVar.hashCode()), this.f35786f);
        int c = fVar.mo33086c();
        if (c > 0) {
            for (int i = 0; i < c; i++) {
                if (fVar.mo33085b(i)) {
                    m39692a(cVar, i, fVar.mo33083a(i));
                }
            }
        }
        return cVar;
    }

    /* renamed from: a */
    private C13460a m39689a(C13643a aVar) {
        C13472b bVar;
        C13471a aVar2;
        C13543f d = aVar.mo33262d();
        C13538a a = m39691a(d);
        C13470b b = m39693b(d);
        C13478b bVar2 = new C13478b(b, a);
        int i = aVar.f36251a.f36004c;
        if (i <= 0) {
            i = ((Integer) this.f35788h.mo29879b()).intValue();
        }
        if (i > 0) {
            C13475d dVar = new C13475d(i);
            bVar = m39690a(bVar2, aVar.f36251a.f36009h);
            aVar2 = dVar;
        } else {
            aVar2 = null;
            bVar = null;
        }
        C13466a aVar3 = new C13466a(this.f35785e, b, new C13477a(a), bVar2, aVar2, bVar);
        aVar3.f35708b = aVar.f36251a.f36009h;
        return C13462c.m39575a(aVar3, this.f35784d, this.f35782b);
    }

    /* renamed from: a */
    private C13472b m39690a(C13476c cVar, Config config) {
        return new C13473c(this.f35785e, cVar, config, this.f35783c);
    }

    /* renamed from: a */
    private static void m39692a(C13530c cVar, int i, C13326a<Bitmap> aVar) {
        C13326a aVar2 = null;
        try {
            C13326a a = C13326a.m38995a(new C13646d(aVar, C13649g.f36269a, 0));
            try {
                cVar.mo33072a(i, a);
                C13326a.m39001c(a);
            } catch (Throwable th) {
                th = th;
                aVar2 = a;
                C13326a.m39001c(aVar2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C13326a.m39001c(aVar2);
            throw th;
        }
    }

    public C13496a(C13529b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C13331b bVar2, C13551f fVar, C13570h<C13265a, C13645c> hVar, C13310j<Integer> jVar, C13310j<Integer> jVar2) {
        this.f35781a = bVar;
        this.f35782b = scheduledExecutorService;
        this.f35783c = executorService;
        this.f35784d = bVar2;
        this.f35785e = fVar;
        this.f35786f = hVar;
        this.f35787g = jVar;
        this.f35788h = jVar2;
    }
}
