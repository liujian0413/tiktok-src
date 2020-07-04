package com.iab.omid.library.bytedance.adsession;

import com.iab.omid.library.bytedance.p791d.C18426d;

/* renamed from: com.iab.omid.library.bytedance.adsession.e */
public final class C18401e {

    /* renamed from: a */
    public final String f49918a;

    /* renamed from: b */
    public final String f49919b;

    private C18401e(String str, String str2) {
        this.f49918a = str;
        this.f49919b = str2;
    }

    /* renamed from: a */
    public static C18401e m60557a(String str, String str2) {
        C18426d.m60670a(str, "Name is null or empty");
        C18426d.m60670a(str2, "Version is null or empty");
        return new C18401e(str, str2);
    }
}
