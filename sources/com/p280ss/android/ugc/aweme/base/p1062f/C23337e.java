package com.p280ss.android.ugc.aweme.base.p1062f;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.f.e */
public final class C23337e {

    /* renamed from: a */
    private static HashMap<String, C23339g> f61411a = new HashMap<>();

    /* renamed from: a */
    public static C23339g m76561a(Context context, String str) {
        C23339g gVar = (C23339g) f61411a.get(str);
        if (gVar != null) {
            return gVar;
        }
        C23339g gVar2 = new C23339g(context.getApplicationContext(), str);
        f61411a.put(str, gVar2);
        return gVar2;
    }
}
