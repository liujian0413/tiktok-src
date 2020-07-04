package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12467c;
import java.lang.reflect.Type;
import p346io.reactivex.BackpressureStrategy;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7499z;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.f */
final class C12530f implements C12467c<Object> {

    /* renamed from: a */
    private final Type f33234a;

    /* renamed from: b */
    private final C7499z f33235b;

    /* renamed from: c */
    private final boolean f33236c;

    /* renamed from: d */
    private final boolean f33237d;

    /* renamed from: e */
    private final boolean f33238e;

    /* renamed from: f */
    private final boolean f33239f;

    /* renamed from: g */
    private final boolean f33240g;

    /* renamed from: h */
    private final boolean f33241h;

    /* renamed from: i */
    private final boolean f33242i;

    /* renamed from: a */
    public final Type mo30454a() {
        return this.f33234a;
    }

    /* renamed from: a */
    public final <R> Object mo30453a(C12466b<R> bVar) {
        C7492s sVar;
        C7492s sVar2;
        if (this.f33236c) {
            sVar = new C12523b(bVar);
        } else {
            sVar = new C12525c(bVar);
        }
        if (this.f33237d) {
            sVar2 = new C12528e(sVar);
        } else if (this.f33238e) {
            sVar2 = new C12521a(sVar);
        } else {
            sVar2 = sVar;
        }
        if (this.f33235b != null) {
            sVar2 = sVar2.mo19304b(this.f33235b);
        }
        if (this.f33239f) {
            return sVar2.mo19283a(BackpressureStrategy.LATEST);
        }
        if (this.f33240g) {
            return sVar2.mo19332k();
        }
        if (this.f33241h) {
            return sVar2.mo19331j();
        }
        if (this.f33242i) {
            return sVar2.mo19329h();
        }
        return sVar2;
    }

    C12530f(Type type, C7499z zVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f33234a = type;
        this.f33235b = zVar;
        this.f33236c = z;
        this.f33237d = z2;
        this.f33238e = z3;
        this.f33239f = z4;
        this.f33240g = z5;
        this.f33241h = z6;
        this.f33242i = z7;
    }
}
