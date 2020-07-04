package com.facebook.imagepipeline.p717d;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.cache.p683a.C13244c;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13318c;
import com.facebook.common.memory.C13319d;
import com.facebook.common.p689f.C13293a;
import com.facebook.common.p689f.C13294b;
import com.facebook.common.p689f.C13294b.C13295a;
import com.facebook.common.p689f.C13296c;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.decoder.C13630c;
import com.facebook.imagepipeline.decoder.C13631d;
import com.facebook.imagepipeline.decoder.C13633f;
import com.facebook.imagepipeline.memory.C13799ab;
import com.facebook.imagepipeline.memory.C13802ac;
import com.facebook.imagepipeline.p715b.C13549d;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13559d;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13570h.C13573a;
import com.facebook.imagepipeline.p716c.C13576i;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p716c.C13578k;
import com.facebook.imagepipeline.p716c.C13583n;
import com.facebook.imagepipeline.p716c.C13586q;
import com.facebook.imagepipeline.p716c.C13590t;
import com.facebook.imagepipeline.p717d.C13617k.C13619a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p724k.C13683ai;
import com.facebook.imagepipeline.p724k.C13768u;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.p726m.C13790c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.d.j */
public final class C13613j {

    /* renamed from: C */
    private static C13616b f36063C = new C13616b();

    /* renamed from: A */
    private final int f36064A;

    /* renamed from: B */
    private final Set<C13653c> f36065B;

    /* renamed from: a */
    public final Config f36066a;

    /* renamed from: b */
    public final C13310j<C13586q> f36067b;

    /* renamed from: c */
    public final C13573a f36068c;

    /* renamed from: d */
    public final C13568f f36069d;

    /* renamed from: e */
    public final Context f36070e;

    /* renamed from: f */
    public final boolean f36071f;

    /* renamed from: g */
    public final C13605h f36072g;

    /* renamed from: h */
    public final C13310j<C13586q> f36073h;

    /* renamed from: i */
    public final C13604g f36074i;

    /* renamed from: j */
    public final C13583n f36075j;

    /* renamed from: k */
    public final C13629b f36076k;

    /* renamed from: l */
    public final C13790c f36077l;

    /* renamed from: m */
    public final Integer f36078m;

    /* renamed from: n */
    public final C13310j<Boolean> f36079n;

    /* renamed from: o */
    public final C13244c f36080o;

    /* renamed from: p */
    public final C13318c f36081p;

    /* renamed from: q */
    public final int f36082q;

    /* renamed from: r */
    public final C13683ai f36083r;

    /* renamed from: s */
    public final C13551f f36084s;

    /* renamed from: t */
    public final C13802ac f36085t;

    /* renamed from: u */
    public final C13631d f36086u;

    /* renamed from: v */
    public final boolean f36087v;

    /* renamed from: w */
    public final C13244c f36088w;

    /* renamed from: x */
    public final C13630c f36089x;

    /* renamed from: y */
    public final C13617k f36090y;

    /* renamed from: z */
    public final boolean f36091z;

    /* renamed from: com.facebook.imagepipeline.d.j$a */
    public static class C13615a {

        /* renamed from: A */
        public final C13619a f36093A;

        /* renamed from: B */
        public boolean f36094B;

        /* renamed from: a */
        public Config f36095a;

        /* renamed from: b */
        public C13310j<C13586q> f36096b;

        /* renamed from: c */
        public C13573a f36097c;

        /* renamed from: d */
        public C13568f f36098d;

        /* renamed from: e */
        public final Context f36099e;

        /* renamed from: f */
        public boolean f36100f;

        /* renamed from: g */
        public C13310j<C13586q> f36101g;

        /* renamed from: h */
        public C13604g f36102h;

        /* renamed from: i */
        public C13583n f36103i;

        /* renamed from: j */
        public C13629b f36104j;

        /* renamed from: k */
        public C13790c f36105k;

        /* renamed from: l */
        public Integer f36106l;

        /* renamed from: m */
        public C13310j<Boolean> f36107m;

        /* renamed from: n */
        public C13244c f36108n;

        /* renamed from: o */
        public C13318c f36109o;

        /* renamed from: p */
        public Integer f36110p;

        /* renamed from: q */
        public C13683ai f36111q;

        /* renamed from: r */
        public C13551f f36112r;

        /* renamed from: s */
        public C13802ac f36113s;

        /* renamed from: t */
        public C13631d f36114t;

        /* renamed from: u */
        public Set<C13653c> f36115u;

        /* renamed from: v */
        public boolean f36116v;

        /* renamed from: w */
        public C13244c f36117w;

        /* renamed from: x */
        public C13605h f36118x;

        /* renamed from: y */
        public C13630c f36119y;

        /* renamed from: z */
        public int f36120z;

        /* renamed from: a */
        public final C13613j mo33200a() {
            return new C13613j(this);
        }

        /* renamed from: a */
        public final C13615a mo33192a(Config config) {
            this.f36095a = config;
            return this;
        }

        /* renamed from: b */
        public final C13615a mo33201b(C13244c cVar) {
            this.f36117w = cVar;
            return this;
        }

        /* renamed from: a */
        public final C13615a mo33193a(C13244c cVar) {
            this.f36108n = cVar;
            return this;
        }

        /* renamed from: a */
        public final C13615a mo33194a(C13310j<C13586q> jVar) {
            this.f36096b = (C13310j) C13307g.m38940a(jVar);
            return this;
        }

        /* renamed from: b */
        public final C13615a mo33202b(C13310j<C13586q> jVar) {
            this.f36101g = (C13310j) C13307g.m38940a(jVar);
            return this;
        }

        private C13615a(Context context) {
            this.f36116v = true;
            this.f36120z = -1;
            this.f36093A = new C13619a(this);
            this.f36094B = true;
            this.f36099e = (Context) C13307g.m38940a(context);
        }

        /* renamed from: a */
        public final C13615a mo33195a(C13318c cVar) {
            this.f36109o = cVar;
            return this;
        }

        /* renamed from: a */
        public final C13615a mo33196a(C13683ai aiVar) {
            this.f36111q = aiVar;
            return this;
        }

        /* renamed from: a */
        public final C13615a mo33197a(C13802ac acVar) {
            this.f36113s = acVar;
            return this;
        }

        /* renamed from: a */
        public final C13615a mo33198a(Set<C13653c> set) {
            this.f36115u = set;
            return this;
        }

        /* renamed from: a */
        public final C13615a mo33199a(boolean z) {
            this.f36100f = z;
            return this;
        }
    }

    /* renamed from: com.facebook.imagepipeline.d.j$b */
    public static class C13616b {

        /* renamed from: a */
        public boolean f36121a;

        private C13616b() {
        }
    }

    /* renamed from: a */
    public static C13616b m40073a() {
        return f36063C;
    }

    /* renamed from: b */
    public final Set<C13653c> mo33191b() {
        return Collections.unmodifiableSet(this.f36065B);
    }

    /* renamed from: a */
    public static C13615a m40072a(Context context) {
        return new C13615a(context);
    }

    /* renamed from: a */
    private static C13790c m40074a(C13615a aVar) {
        if (aVar.f36105k != null && aVar.f36106l != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        } else if (aVar.f36105k != null) {
            return aVar.f36105k;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private static C13244c m40076b(Context context) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return C13244c.m38715a(context).mo32458a();
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    private C13613j(C13615a aVar) {
        C13310j<C13586q> jVar;
        C13573a aVar2;
        Config config;
        C13568f fVar;
        C13605h hVar;
        C13310j<C13586q> jVar2;
        C13583n nVar;
        C13310j<Boolean> jVar3;
        C13244c cVar;
        C13318c cVar2;
        int i;
        C13683ai aiVar;
        C13802ac acVar;
        C13631d dVar;
        Set<C13653c> set;
        C13244c cVar3;
        C13604g gVar;
        if (C13783b.m40665b()) {
            C13783b.m40664a("ImagePipelineConfig()");
        }
        this.f36090y = aVar.f36093A.mo33203a();
        if (aVar.f36096b == null) {
            jVar = new C13576i<>((ActivityManager) aVar.f36099e.getSystemService("activity"));
        } else {
            jVar = aVar.f36096b;
        }
        this.f36067b = jVar;
        if (aVar.f36097c == null) {
            aVar2 = new C13559d();
        } else {
            aVar2 = aVar.f36097c;
        }
        this.f36068c = aVar2;
        if (aVar.f36095a == null) {
            config = Config.ARGB_8888;
        } else {
            config = aVar.f36095a;
        }
        this.f36066a = config;
        if (aVar.f36098d == null) {
            fVar = C13577j.m39966a();
        } else {
            fVar = aVar.f36098d;
        }
        this.f36069d = fVar;
        this.f36070e = (Context) C13307g.m38940a(aVar.f36099e);
        if (aVar.f36118x == null) {
            hVar = new C13600c(new C13603f());
        } else {
            hVar = aVar.f36118x;
        }
        this.f36072g = hVar;
        this.f36071f = aVar.f36100f;
        if (aVar.f36101g == null) {
            jVar2 = new C13578k<>();
        } else {
            jVar2 = aVar.f36101g;
        }
        this.f36073h = jVar2;
        if (aVar.f36103i == null) {
            nVar = C13590t.m39987a();
        } else {
            nVar = aVar.f36103i;
        }
        this.f36075j = nVar;
        this.f36076k = aVar.f36104j;
        this.f36077l = m40074a(aVar);
        this.f36078m = aVar.f36106l;
        if (aVar.f36107m == null) {
            jVar3 = new C13310j<Boolean>() {
                /* renamed from: a */
                private static Boolean m40078a() {
                    return Boolean.valueOf(true);
                }

                /* renamed from: b */
                public final /* synthetic */ Object mo29879b() {
                    return m40078a();
                }
            };
        } else {
            jVar3 = aVar.f36107m;
        }
        this.f36079n = jVar3;
        if (aVar.f36108n == null) {
            cVar = m40076b(aVar.f36099e);
        } else {
            cVar = aVar.f36108n;
        }
        this.f36080o = cVar;
        if (aVar.f36109o == null) {
            cVar2 = C13319d.m38972a();
        } else {
            cVar2 = aVar.f36109o;
        }
        this.f36081p = cVar2;
        this.f36082q = m40071a(aVar, this.f36090y);
        if (aVar.f36120z < 0) {
            i = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        } else {
            i = aVar.f36120z;
        }
        this.f36064A = i;
        if (C13783b.m40665b()) {
            C13783b.m40664a("ImagePipelineConfig->mNetworkFetcher");
        }
        if (aVar.f36111q == null) {
            aiVar = new C13768u(this.f36064A);
        } else {
            aiVar = aVar.f36111q;
        }
        this.f36083r = aiVar;
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        this.f36084s = aVar.f36112r;
        if (aVar.f36113s == null) {
            acVar = new C13802ac(C13799ab.m40732a().mo33426a());
        } else {
            acVar = aVar.f36113s;
        }
        this.f36085t = acVar;
        if (aVar.f36114t == null) {
            dVar = new C13633f();
        } else {
            dVar = aVar.f36114t;
        }
        this.f36086u = dVar;
        if (aVar.f36115u == null) {
            set = new HashSet<>();
        } else {
            set = aVar.f36115u;
        }
        this.f36065B = set;
        this.f36087v = aVar.f36116v;
        if (aVar.f36117w == null) {
            cVar3 = this.f36080o;
        } else {
            cVar3 = aVar.f36117w;
        }
        this.f36088w = cVar3;
        this.f36089x = aVar.f36119y;
        int c = this.f36085t.mo33430c();
        if (aVar.f36102h == null) {
            gVar = new C13598a(c);
        } else {
            gVar = aVar.f36102h;
        }
        this.f36074i = gVar;
        this.f36091z = aVar.f36094B;
        C13294b bVar = this.f36090y.f36125d;
        if (bVar != null) {
            m40075a(bVar, this.f36090y, new C13549d(this.f36085t));
        } else if (this.f36090y.f36122a && C13296c.f35194a) {
            C13294b a = C13296c.m38897a();
            if (a != null) {
                m40075a(a, this.f36090y, new C13549d(this.f36085t));
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: a */
    private static int m40071a(C13615a aVar, C13617k kVar) {
        if (aVar.f36110p != null) {
            return aVar.f36110p.intValue();
        }
        if (kVar.f36132k) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static void m40075a(C13294b bVar, C13617k kVar, C13293a aVar) {
        C13296c.f35197d = bVar;
        C13295a aVar2 = kVar.f36123b;
        if (aVar2 != null) {
            bVar.setWebpErrorLogger(aVar2);
        }
        bVar.setBitmapCreator(aVar);
    }
}
