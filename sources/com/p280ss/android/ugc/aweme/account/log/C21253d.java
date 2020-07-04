package com.p280ss.android.ugc.aweme.account.log;

import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.log.d */
public final class C21253d extends C21250b {

    /* renamed from: a */
    public static final C21253d f57081a = new C21253d();

    private C21253d() {
    }

    /* renamed from: a */
    public final String mo57172a() {
        return "VerifyCode";
    }

    /* renamed from: b */
    public static final void m71539b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code success");
        C21253d dVar = f57081a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        dVar.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71537a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code error");
        String str3 = "errorCode";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        String str4 = "errorMsg";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        C21253d dVar = f57081a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        dVar.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71538a(boolean z, String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "send code");
        String str3 = "isVoiceCode";
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        hashMap.put(str3, str2);
        String str4 = "mobile";
        if (str == null) {
            str = "";
        }
        hashMap.put(str4, str);
        C21253d dVar = f57081a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        dVar.mo57173c(hashMap2);
    }
}
