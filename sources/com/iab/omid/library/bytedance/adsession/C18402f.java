package com.iab.omid.library.bytedance.adsession;

import com.iab.omid.library.bytedance.p791d.C18426d;
import java.net.URL;

/* renamed from: com.iab.omid.library.bytedance.adsession.f */
public final class C18402f {

    /* renamed from: a */
    public final String f49920a;

    /* renamed from: b */
    public final URL f49921b;

    /* renamed from: c */
    public final String f49922c;

    private C18402f(String str, URL url, String str2) {
        this.f49920a = str;
        this.f49921b = url;
        this.f49922c = str2;
    }

    /* renamed from: a */
    public static C18402f m60558a(String str, URL url, String str2) {
        C18426d.m60670a(str, "VendorKey is null or empty");
        C18426d.m60669a((Object) url, "ResourceURL is null");
        C18426d.m60670a(str2, "VerificationParameters is null or empty");
        return new C18402f(str, url, str2);
    }
}
