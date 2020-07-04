package com.p280ss.android.ugc.network.observer.p1749b;

import com.p280ss.android.ugc.network.observer.bean.C44895c;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.network.observer.b.a */
public final class C44890a {

    /* renamed from: a */
    public static final C44890a f115434a = new C44890a();

    private C44890a() {
    }

    /* renamed from: a */
    public static HashMap<String, Object> m141625a(String str, C44895c cVar) {
        C7573i.m23587b(cVar, "localParam");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str != null) {
            hashMap.put("unknown_reason", str);
        }
        String str2 = cVar.f115442a;
        if (str2 != null) {
            hashMap.put("top_activity", str2);
        }
        String str3 = cVar.f115443b;
        if (str3 != null) {
            hashMap.put("top_page", str3);
        }
        return hashMap;
    }
}
