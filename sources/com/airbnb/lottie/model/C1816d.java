package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.C1814j;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.d */
public final class C1816d {

    /* renamed from: a */
    public final List<C1814j> f6547a;

    /* renamed from: b */
    public final double f6548b;

    /* renamed from: c */
    public final double f6549c;

    /* renamed from: d */
    public final String f6550d;

    /* renamed from: e */
    private final char f6551e;

    /* renamed from: f */
    private final String f6552f;

    public final int hashCode() {
        return m8518a(this.f6551e, this.f6552f, this.f6550d);
    }

    /* renamed from: a */
    public static int m8518a(char c, String str, String str2) {
        return ((((c + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C1816d(List<C1814j> list, char c, double d, double d2, String str, String str2) {
        this.f6547a = list;
        this.f6551e = c;
        this.f6548b = d;
        this.f6549c = d2;
        this.f6550d = str;
        this.f6552f = str2;
    }
}
