package com.facebook.imagepipeline.p717d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.C13265a;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.decoder.C13631d;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13568f;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13661a;
import com.facebook.imagepipeline.p724k.C13664aa;
import com.facebook.imagepipeline.p724k.C13665ab;
import com.facebook.imagepipeline.p724k.C13671ad;
import com.facebook.imagepipeline.p724k.C13672ae;
import com.facebook.imagepipeline.p724k.C13673af;
import com.facebook.imagepipeline.p724k.C13681ah;
import com.facebook.imagepipeline.p724k.C13683ai;
import com.facebook.imagepipeline.p724k.C13685aj;
import com.facebook.imagepipeline.p724k.C13689ak;
import com.facebook.imagepipeline.p724k.C13691al;
import com.facebook.imagepipeline.p724k.C13699am;
import com.facebook.imagepipeline.p724k.C13703aq;
import com.facebook.imagepipeline.p724k.C13707as;
import com.facebook.imagepipeline.p724k.C13713av;
import com.facebook.imagepipeline.p724k.C13720ax;
import com.facebook.imagepipeline.p724k.C13723ay;
import com.facebook.imagepipeline.p724k.C13724az;
import com.facebook.imagepipeline.p724k.C13729ba;
import com.facebook.imagepipeline.p724k.C13731bb;
import com.facebook.imagepipeline.p724k.C13733bd;
import com.facebook.imagepipeline.p724k.C13739f;
import com.facebook.imagepipeline.p724k.C13740g;
import com.facebook.imagepipeline.p724k.C13741h;
import com.facebook.imagepipeline.p724k.C13743i;
import com.facebook.imagepipeline.p724k.C13745j;
import com.facebook.imagepipeline.p724k.C13749l;
import com.facebook.imagepipeline.p724k.C13750m;
import com.facebook.imagepipeline.p724k.C13757o;
import com.facebook.imagepipeline.p724k.C13760p;
import com.facebook.imagepipeline.p724k.C13764r;
import com.facebook.imagepipeline.p724k.C13765s;
import com.facebook.imagepipeline.p724k.C13780y;
import com.facebook.imagepipeline.p724k.C13781z;
import com.facebook.imagepipeline.p726m.C13790c;

/* renamed from: com.facebook.imagepipeline.d.n */
public final class C13625n {

    /* renamed from: a */
    private ContentResolver f36180a;

    /* renamed from: b */
    private Resources f36181b;

    /* renamed from: c */
    private AssetManager f36182c;

    /* renamed from: d */
    private final C13316a f36183d;

    /* renamed from: e */
    private final C13629b f36184e;

    /* renamed from: f */
    private final C13631d f36185f;

    /* renamed from: g */
    private final boolean f36186g;

    /* renamed from: h */
    private final boolean f36187h;

    /* renamed from: i */
    private final boolean f36188i;

    /* renamed from: j */
    private final C13604g f36189j;

    /* renamed from: k */
    private final C13322g f36190k;

    /* renamed from: l */
    private final C13561e f36191l;

    /* renamed from: m */
    private final C13561e f36192m;

    /* renamed from: n */
    private final C13585p<C13265a, PooledByteBuffer> f36193n;

    /* renamed from: o */
    private final C13585p<C13265a, C13645c> f36194o;

    /* renamed from: p */
    private final C13568f f36195p;

    /* renamed from: q */
    private final C13551f f36196q;

    /* renamed from: r */
    private final int f36197r;

    /* renamed from: s */
    private final int f36198s;

    /* renamed from: t */
    private boolean f36199t;

    /* renamed from: u */
    private final int f36200u;

    /* renamed from: c */
    public final C13781z mo33219c() {
        return new C13781z(this.f36189j.mo33164a(), this.f36190k, this.f36180a);
    }

    /* renamed from: d */
    public final C13664aa mo33220d() {
        return new C13664aa(this.f36189j.mo33164a(), this.f36190k, this.f36180a);
    }

    /* renamed from: e */
    public final C13665ab mo33222e() {
        return new C13665ab(this.f36189j.mo33164a(), this.f36190k, this.f36180a);
    }

    /* renamed from: f */
    public final C13671ad mo33224f() {
        return new C13671ad(this.f36189j.mo33164a(), this.f36190k);
    }

    /* renamed from: g */
    public final C13703aq mo33226g() {
        return new C13703aq(this.f36189j.mo33164a(), this.f36190k, this.f36180a);
    }

    /* renamed from: h */
    public final C13672ae mo33228h() {
        return new C13672ae(this.f36189j.mo33164a(), this.f36190k, this.f36181b);
    }

    /* renamed from: i */
    public final C13673af mo33230i() {
        return new C13673af(this.f36189j.mo33164a(), this.f36180a);
    }

    /* renamed from: b */
    public final C13780y mo33217b() {
        return new C13780y(this.f36189j.mo33164a(), this.f36190k, this.f36182c);
    }

    /* renamed from: a */
    public final C13749l mo33215a() {
        return new C13749l(this.f36190k);
    }

    /* renamed from: a */
    public static C13661a m40117a(C13699am<C13647e> amVar) {
        return new C13661a(amVar);
    }

    /* renamed from: m */
    public static <T> C13713av<T> m40121m(C13699am<T> amVar) {
        return new C13713av<>(amVar);
    }

    /* renamed from: c */
    public final C13740g mo33218c(C13699am<C13326a<C13645c>> amVar) {
        return new C13740g(this.f36195p, amVar);
    }

    /* renamed from: i */
    public final C13764r mo33231i(C13699am<C13647e> amVar) {
        return new C13764r(this.f36195p, amVar);
    }

    /* renamed from: b */
    public final C13739f mo33216b(C13699am<C13326a<C13645c>> amVar) {
        return new C13739f(this.f36194o, this.f36195p, amVar);
    }

    /* renamed from: j */
    public final C13765s mo33232j(C13699am<C13647e> amVar) {
        return new C13765s(this.f36193n, this.f36195p, amVar);
    }

    /* renamed from: k */
    public final C13689ak mo33233k(C13699am<C13326a<C13645c>> amVar) {
        return new C13689ak(this.f36194o, this.f36195p, amVar);
    }

    /* renamed from: l */
    public final C13691al mo33234l(C13699am<C13326a<C13645c>> amVar) {
        return new C13691al(amVar, this.f36196q, this.f36189j.mo33167d());
    }

    /* renamed from: n */
    public final <T> C13724az<T> mo33235n(C13699am<T> amVar) {
        return new C13724az<>(5, this.f36189j.mo33168e(), amVar);
    }

    /* renamed from: o */
    public final C13733bd mo33236o(C13699am<C13647e> amVar) {
        return new C13733bd(this.f36189j.mo33167d(), this.f36190k, amVar);
    }

    /* renamed from: p */
    public final C13743i mo33237p(C13699am<C13326a<C13645c>> amVar) {
        return new C13743i(amVar, this.f36197r, this.f36198s, this.f36199t);
    }

    /* renamed from: a */
    public static C13729ba m40119a(C13731bb<C13647e>[] bbVarArr) {
        return new C13729ba(bbVarArr);
    }

    /* renamed from: d */
    public final C13741h mo33221d(C13699am<C13326a<C13645c>> amVar) {
        return new C13741h(this.f36194o, this.f36195p, amVar);
    }

    /* renamed from: e */
    public final C13750m mo33223e(C13699am<C13647e> amVar) {
        C13750m mVar = new C13750m(this.f36183d, this.f36189j.mo33166c(), this.f36184e, this.f36185f, this.f36186g, this.f36187h, this.f36188i, amVar, this.f36200u);
        return mVar;
    }

    /* renamed from: f */
    public final C13757o mo33225f(C13699am<C13647e> amVar) {
        return new C13757o(this.f36191l, this.f36192m, this.f36195p, amVar);
    }

    /* renamed from: g */
    public final C13760p mo33227g(C13699am<C13647e> amVar) {
        return new C13760p(this.f36191l, this.f36192m, this.f36195p, amVar);
    }

    /* renamed from: h */
    public final C13685aj mo33229h(C13699am<C13647e> amVar) {
        C13685aj ajVar = new C13685aj(this.f36191l, this.f36195p, this.f36190k, this.f36183d, amVar);
        return ajVar;
    }

    /* renamed from: a */
    public final C13681ah mo33213a(C13683ai aiVar) {
        return new C13681ah(this.f36190k, this.f36183d, aiVar);
    }

    /* renamed from: a */
    public static <T> C13720ax<T> m40118a(C13699am<T> amVar, C13723ay ayVar) {
        return new C13720ax<>(amVar, ayVar);
    }

    /* renamed from: a */
    public static C13745j m40120a(C13699am<C13647e> amVar, C13699am<C13647e> amVar2) {
        return new C13745j(amVar, amVar2);
    }

    /* renamed from: a */
    public final C13707as mo33214a(C13699am<C13647e> amVar, boolean z, C13790c cVar) {
        C13707as asVar = new C13707as(this.f36189j.mo33167d(), this.f36190k, amVar, z, cVar);
        return asVar;
    }

    public C13625n(Context context, C13316a aVar, C13629b bVar, C13631d dVar, boolean z, boolean z2, boolean z3, C13604g gVar, C13322g gVar2, C13585p<C13265a, C13645c> pVar, C13585p<C13265a, PooledByteBuffer> pVar2, C13561e eVar, C13561e eVar2, C13568f fVar, C13551f fVar2, int i, int i2, boolean z4, int i3) {
        this.f36180a = context.getApplicationContext().getContentResolver();
        this.f36181b = context.getApplicationContext().getResources();
        this.f36182c = context.getApplicationContext().getAssets();
        this.f36183d = aVar;
        this.f36184e = bVar;
        this.f36185f = dVar;
        this.f36186g = z;
        this.f36187h = z2;
        this.f36188i = z3;
        this.f36189j = gVar;
        this.f36190k = gVar2;
        this.f36194o = pVar;
        this.f36193n = pVar2;
        this.f36191l = eVar;
        this.f36192m = eVar2;
        this.f36195p = fVar;
        this.f36196q = fVar2;
        this.f36197r = i;
        this.f36198s = i2;
        this.f36199t = z4;
        this.f36200u = i3;
    }
}
