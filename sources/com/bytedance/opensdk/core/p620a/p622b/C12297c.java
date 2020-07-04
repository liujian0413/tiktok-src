package com.bytedance.opensdk.core.p620a.p622b;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.core.a.b.c */
public final class C12297c extends C12295a {

    /* renamed from: a */
    public final String f32651a;

    /* renamed from: b */
    public final String f32652b;

    /* renamed from: c */
    public final String f32653c;

    /* renamed from: d */
    public final String f32654d;

    /* renamed from: e */
    public final int f32655e;

    /* renamed from: f */
    public final String f32656f;

    private C12297c(String str, String str2, String str3, String str4, int i, String str5) {
        C7573i.m23587b(str, "ticketDomain");
        C7573i.m23587b(str2, "codeDomain");
        C7573i.m23587b(str3, "responseType");
        C7573i.m23587b(str4, "scope");
        C7573i.m23587b(str5, "clientKey");
        this.f32651a = str;
        this.f32652b = str2;
        this.f32653c = str3;
        this.f32654d = str4;
        this.f32655e = i;
        this.f32656f = str5;
    }

    public /* synthetic */ C12297c(String str, String str2, String str3, String str4, int i, String str5, int i2, C7571f fVar) {
        this(str, str2, "code", "user_info", i, str5);
    }
}
