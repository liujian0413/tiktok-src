package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.commercialize.model.C24990c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.av */
public final class C25251av {

    /* renamed from: a */
    public static final C25251av f66589a = new C25251av();

    /* renamed from: b */
    private static final LinkedHashMap<Integer, C24990c> f66590b = new LinkedHashMap<>();

    private C25251av() {
    }

    /* renamed from: a */
    public static C24990c m83001a() {
        if (!f66590b.isEmpty()) {
            return (C24990c) f66590b.values().iterator().next();
        }
        return null;
    }

    /* renamed from: a */
    public static void m83002a(int i) {
        if (f66590b.containsKey(Integer.valueOf(i))) {
            f66590b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m83003a(int i, C24990c cVar) {
        C7573i.m23587b(cVar, "adInfo");
        f66590b.put(Integer.valueOf(i), cVar);
    }
}
