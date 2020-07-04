package com.fasterxml.jackson.core.p736c;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fasterxml.jackson.core.c.a */
public final class C14662a {

    /* renamed from: a */
    protected final C14662a f37881a;

    /* renamed from: b */
    protected final AtomicReference<C14664b> f37882b;

    /* renamed from: c */
    public final int f37883c;

    /* renamed from: d */
    protected final boolean f37884d;

    /* renamed from: e */
    protected int f37885e;

    /* renamed from: f */
    public int f37886f;

    /* renamed from: g */
    protected int f37887g;

    /* renamed from: h */
    protected int[] f37888h;

    /* renamed from: i */
    protected C14667c[] f37889i;

    /* renamed from: j */
    protected C14663a[] f37890j;

    /* renamed from: k */
    public int f37891k;

    /* renamed from: l */
    protected int f37892l;

    /* renamed from: m */
    private boolean f37893m;

    /* renamed from: n */
    private boolean f37894n;

    /* renamed from: o */
    private boolean f37895o;

    /* renamed from: com.fasterxml.jackson.core.c.a$a */
    static final class C14663a {
    }

    /* renamed from: com.fasterxml.jackson.core.c.a$b */
    static final class C14664b {

        /* renamed from: a */
        public final int f37896a;

        /* renamed from: b */
        public final int f37897b;

        /* renamed from: c */
        public final int[] f37898c;

        /* renamed from: d */
        public final C14667c[] f37899d;

        /* renamed from: e */
        public final C14663a[] f37900e;

        /* renamed from: f */
        public final int f37901f;

        /* renamed from: g */
        public final int f37902g;

        /* renamed from: h */
        public final int f37903h;

        public C14664b(C14662a aVar) {
            this.f37896a = aVar.f37885e;
            this.f37897b = aVar.f37887g;
            this.f37898c = aVar.f37888h;
            this.f37899d = aVar.f37889i;
            this.f37900e = aVar.f37890j;
            this.f37901f = aVar.f37891k;
            this.f37902g = aVar.f37892l;
            this.f37903h = aVar.f37886f;
        }

        public C14664b(int i, int i2, int[] iArr, C14667c[] cVarArr, C14663a[] aVarArr, int i3, int i4, int i5) {
            this.f37896a = 0;
            this.f37897b = i2;
            this.f37898c = iArr;
            this.f37899d = cVarArr;
            this.f37900e = null;
            this.f37901f = 0;
            this.f37902g = 0;
            this.f37903h = 0;
        }
    }

    /* renamed from: c */
    private boolean m42420c() {
        if (!this.f37893m) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo37157b() {
        if (this.f37881a != null && m42420c()) {
            this.f37881a.m42418a(new C14664b(this));
            this.f37893m = true;
            this.f37894n = true;
            this.f37895o = true;
        }
    }

    /* renamed from: a */
    public static C14662a m42417a() {
        long currentTimeMillis = System.currentTimeMillis();
        return m42419b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: b */
    private static C14662a m42419b(int i) {
        return new C14662a(64, true, i);
    }

    /* renamed from: a */
    private static C14664b m42416a(int i) {
        C14664b bVar = new C14664b(0, i - 1, new int[i], new C14667c[i], null, 0, 0, 0);
        return bVar;
    }

    /* renamed from: a */
    private void m42418a(C14664b bVar) {
        int i = bVar.f37896a;
        C14664b bVar2 = (C14664b) this.f37882b.get();
        if (i > bVar2.f37896a) {
            if (i > 6000 || bVar.f37903h > 63) {
                bVar = m42416a(64);
            }
            this.f37882b.compareAndSet(bVar2, bVar);
        }
    }

    /* renamed from: a */
    public final C14662a mo37156a(boolean z, boolean z2) {
        return new C14662a(this, z2, this.f37883c, (C14664b) this.f37882b.get());
    }

    private C14662a(int i, boolean z, int i2) {
        this.f37883c = i2;
        this.f37884d = true;
        this.f37882b = new AtomicReference<>(m42416a(64));
    }

    private C14662a(C14662a aVar, boolean z, int i, C14664b bVar) {
        this.f37881a = aVar;
        this.f37883c = i;
        this.f37884d = z;
        this.f37885e = bVar.f37896a;
        this.f37887g = bVar.f37897b;
        this.f37888h = bVar.f37898c;
        this.f37889i = bVar.f37899d;
        this.f37890j = bVar.f37900e;
        this.f37891k = bVar.f37901f;
        this.f37892l = bVar.f37902g;
        this.f37886f = bVar.f37903h;
        this.f37893m = true;
        this.f37894n = true;
        this.f37895o = true;
    }
}
