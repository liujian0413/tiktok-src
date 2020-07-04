package com.p280ss.android.ugc.aweme.emoji.p1207e;

import com.p280ss.android.ugc.iesdownload.C44854e;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.k */
final class C27567k {

    /* renamed from: a */
    private static HashMap<String, C44854e> f72642a = new HashMap<>();

    /* renamed from: b */
    public static void m90346b(String str) {
        f72642a.remove(str);
    }

    /* renamed from: a */
    public static C44854e m90344a(String str) {
        return (C44854e) f72642a.get(str);
    }

    /* renamed from: a */
    public static void m90345a(String str, C44854e eVar) {
        f72642a.put(str, eVar);
    }
}
