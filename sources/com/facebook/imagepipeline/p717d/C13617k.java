package com.facebook.imagepipeline.p717d;

import android.content.Context;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p689f.C13294b;
import com.facebook.common.p689f.C13294b.C13295a;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.decoder.C13631d;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p717d.C13613j.C13615a;
import com.facebook.imagepipeline.p720g.C13645c;

/* renamed from: com.facebook.imagepipeline.d.k */
public final class C13617k {

    /* renamed from: a */
    public final boolean f36122a;

    /* renamed from: b */
    public final C13295a f36123b;

    /* renamed from: c */
    public final boolean f36124c;

    /* renamed from: d */
    public final C13294b f36125d;

    /* renamed from: e */
    public final boolean f36126e;

    /* renamed from: f */
    public final boolean f36127f;

    /* renamed from: g */
    public final int f36128g;

    /* renamed from: h */
    public final int f36129h;

    /* renamed from: i */
    public boolean f36130i;

    /* renamed from: j */
    public final int f36131j;

    /* renamed from: k */
    public final boolean f36132k;

    /* renamed from: l */
    public final boolean f36133l;

    /* renamed from: m */
    public final C13621c f36134m;

    /* renamed from: n */
    public final C13310j<Boolean> f36135n;

    /* renamed from: o */
    public final boolean f36136o;

    /* renamed from: com.facebook.imagepipeline.d.k$a */
    public static class C13619a {

        /* renamed from: a */
        public boolean f36137a;

        /* renamed from: b */
        public C13295a f36138b;

        /* renamed from: c */
        public boolean f36139c;

        /* renamed from: d */
        public C13294b f36140d;

        /* renamed from: e */
        public boolean f36141e;

        /* renamed from: f */
        public boolean f36142f;

        /* renamed from: g */
        public int f36143g;

        /* renamed from: h */
        public int f36144h;

        /* renamed from: i */
        public boolean f36145i;

        /* renamed from: j */
        public int f36146j = 2048;

        /* renamed from: k */
        public boolean f36147k;

        /* renamed from: l */
        public boolean f36148l;

        /* renamed from: m */
        public C13621c f36149m;

        /* renamed from: n */
        public C13310j<Boolean> f36150n;

        /* renamed from: o */
        public boolean f36151o;

        /* renamed from: p */
        private final C13615a f36152p;

        /* renamed from: a */
        public final C13617k mo33203a() {
            return new C13617k(this);
        }

        public C13619a(C13615a aVar) {
            this.f36152p = aVar;
        }
    }

    /* renamed from: com.facebook.imagepipeline.d.k$b */
    public static class C13620b implements C13621c {
        /* renamed from: a */
        public final C13625n mo33204a(Context context, C13316a aVar, C13629b bVar, C13631d dVar, boolean z, boolean z2, boolean z3, C13604g gVar, C13322g gVar2, C13585p<C13265a, C13645c> pVar, C13585p<C13265a, PooledByteBuffer> pVar2, C13561e eVar, C13561e eVar2, C13568f fVar, C13551f fVar2, int i, int i2, boolean z4, int i3) {
            C13625n nVar = new C13625n(context, aVar, bVar, dVar, z, z2, z3, gVar, gVar2, pVar, pVar2, eVar, eVar2, fVar, fVar2, i, i2, z4, i3);
            return nVar;
        }
    }

    /* renamed from: com.facebook.imagepipeline.d.k$c */
    public interface C13621c {
        /* renamed from: a */
        C13625n mo33204a(Context context, C13316a aVar, C13629b bVar, C13631d dVar, boolean z, boolean z2, boolean z3, C13604g gVar, C13322g gVar2, C13585p<C13265a, C13645c> pVar, C13585p<C13265a, PooledByteBuffer> pVar2, C13561e eVar, C13561e eVar2, C13568f fVar, C13551f fVar2, int i, int i2, boolean z4, int i3);
    }

    private C13617k(C13619a aVar) {
        this.f36122a = aVar.f36137a;
        this.f36123b = aVar.f36138b;
        this.f36124c = aVar.f36139c;
        this.f36125d = aVar.f36140d;
        this.f36126e = aVar.f36141e;
        this.f36127f = aVar.f36142f;
        this.f36128g = aVar.f36143g;
        this.f36129h = aVar.f36144h;
        this.f36130i = aVar.f36145i;
        this.f36131j = aVar.f36146j;
        this.f36132k = aVar.f36147k;
        this.f36133l = aVar.f36148l;
        if (aVar.f36149m == null) {
            this.f36134m = new C13620b();
        } else {
            this.f36134m = aVar.f36149m;
        }
        this.f36135n = aVar.f36150n;
        this.f36136o = aVar.f36151o;
    }
}
