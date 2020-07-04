package com.p280ss.android.ugc.aweme.account.log;

import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.log.c */
public final class C21252c extends C21250b {

    /* renamed from: a */
    public static final C21252c f57080a = new C21252c();

    private C21252c() {
    }

    /* renamed from: a */
    public final String mo57172a() {
        return "Captcha";
    }

    /* renamed from: b */
    public static final void m71533b() {
        f57080a.mo57173c("on refresh captcha");
    }

    /* renamed from: a */
    public static final void m71531a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on ok");
        String str3 = "captcha";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "scenario";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21252c cVar = f57080a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        cVar.mo57173c(hashMap2);
    }

    /* renamed from: b */
    public static final void m71534b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on refresh captcha success");
        String str3 = "captcha";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "scenario";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21252c cVar = f57080a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        cVar.mo57173c(hashMap2);
    }

    /* renamed from: c */
    public static final void m71535c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on refresh captcha error");
        String str3 = "errCode";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "errorMsg";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21252c cVar = f57080a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        cVar.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71532a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on show captcha");
        String str4 = "captcha";
        if (str == null) {
            str = "";
        }
        hashMap.put(str4, str);
        String str5 = "scenario";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str5, str2);
        String str6 = "errorMsg";
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(str6, str3);
        C21252c cVar = f57080a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        cVar.mo57173c(hashMap2);
    }
}
