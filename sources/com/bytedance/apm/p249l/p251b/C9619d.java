package com.bytedance.apm.p249l.p251b;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm.l.b.d */
public final class C9619d {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C9618b> f26314a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static C6268c f26315b;

    /* renamed from: a */
    public static C6268c m28471a() {
        return f26315b;
    }

    /* renamed from: a */
    public static void m28472a(C6268c cVar) {
        f26315b = cVar;
    }

    /* renamed from: a */
    public static void m28473a(String str, C9618b bVar) {
        if (!TextUtils.isEmpty(str) && bVar != null) {
            f26314a.put(str, bVar);
        }
    }

    /* renamed from: a */
    public static boolean m28474a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        C9618b bVar = (C9618b) f26314a.get(str);
        if (bVar == null || bVar.mo23964c()) {
            return false;
        }
        return bVar.mo23962a(str2);
    }
}
