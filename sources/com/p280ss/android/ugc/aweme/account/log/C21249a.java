package com.p280ss.android.ugc.aweme.account.log;

import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.log.a */
public final class C21249a extends C21250b {

    /* renamed from: a */
    public static final C21249a f57077a = new C21249a();

    /* renamed from: c */
    private static final String f57078c = f57078c;

    private C21249a() {
    }

    /* renamed from: a */
    public final String mo57172a() {
        return f57078c;
    }

    /* renamed from: b */
    public static final void m71527b() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account successfully");
        C21249a aVar = f57077a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        aVar.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71525a(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "switch account failed");
        hashMap.put("errorCode", String.valueOf(num));
        String str2 = "errorMsg";
        if (str == null) {
            str = "";
        }
        hashMap.put(str2, str);
        C21249a aVar = f57077a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        aVar.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71526a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "fromUid");
        C7573i.m23587b(str2, "switchToUid");
        C7573i.m23587b(str4, "from");
        HashMap hashMap = new HashMap();
        hashMap.put("event", "start switch account");
        hashMap.put("from", str4);
        StringBuilder sb = new StringBuilder("from ");
        sb.append(str);
        sb.append(" to ");
        sb.append(str2);
        sb.append(" with ");
        sb.append(str3);
        hashMap.put("extra", sb.toString());
        C21249a aVar = f57077a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        aVar.mo57173c(hashMap2);
    }
}
