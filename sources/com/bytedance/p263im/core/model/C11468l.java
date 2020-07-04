package com.bytedance.p263im.core.model;

/* renamed from: com.bytedance.im.core.model.l */
public final class C11468l implements Cloneable {

    /* renamed from: a */
    public String f31021a;

    /* renamed from: b */
    public long f31022b;

    /* renamed from: c */
    public long f31023c = Long.MIN_VALUE;

    /* renamed from: d */
    public long f31024d;

    /* renamed from: e */
    public long f31025e = -1;

    /* renamed from: a */
    public final C11468l mo27676a() {
        this.f31025e = -1;
        return this;
    }

    /* renamed from: b */
    public final boolean mo27680b() {
        if (this.f31025e > -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo27682c() {
        if (this.f31023c < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C11468l clone() {
        C11468l lVar = new C11468l();
        lVar.f31021a = this.f31021a;
        lVar.f31022b = this.f31022b;
        lVar.mo27677a(this.f31023c);
        lVar.mo27679b(this.f31024d);
        lVar.mo27681c(this.f31025e);
        return lVar;
    }

    /* renamed from: a */
    public final C11468l mo27677a(long j) {
        if (this.f31023c < j) {
            this.f31023c = j;
        }
        return this;
    }

    /* renamed from: b */
    public final C11468l mo27679b(long j) {
        if (this.f31024d < j) {
            this.f31024d = j;
        }
        return this;
    }

    /* renamed from: c */
    public final C11468l mo27681c(long j) {
        if (this.f31025e < j) {
            this.f31025e = j;
        }
        return this;
    }

    /* renamed from: a */
    public final C11468l mo27678a(C11468l lVar) {
        if (lVar != null) {
            this.f31021a = lVar.f31021a;
            this.f31022b = lVar.f31022b;
            mo27677a(lVar.f31023c);
            mo27679b(lVar.f31024d);
            mo27681c(lVar.f31025e);
        }
        return this;
    }
}
