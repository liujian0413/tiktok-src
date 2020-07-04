package com.airbnb.lottie.model;

import android.support.p022v4.util.C0894f;
import com.airbnb.lottie.C1757f;

/* renamed from: com.airbnb.lottie.model.g */
public final class C1819g {

    /* renamed from: a */
    private static final C1819g f6555a = new C1819g();

    /* renamed from: b */
    private final C0894f<String, C1757f> f6556b = new C0894f<>(10485760);

    /* renamed from: a */
    public static C1819g m8529a() {
        return f6555a;
    }

    C1819g() {
    }

    /* renamed from: a */
    public final C1757f mo7314a(int i) {
        return mo7315a(Integer.toString(i));
    }

    /* renamed from: a */
    public final C1757f mo7315a(String str) {
        return (C1757f) this.f6556b.mo3341a(str);
    }

    /* renamed from: a */
    public final void mo7316a(int i, C1757f fVar) {
        mo7317a(Integer.toString(i), fVar);
    }

    /* renamed from: a */
    public final void mo7317a(String str, C1757f fVar) {
        if (str != null) {
            this.f6556b.mo3342a(str, fVar);
        }
    }
}
