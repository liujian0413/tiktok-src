package com.p280ss.android.ugc.aweme.account.network;

import com.p280ss.android.common.util.C19290j;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.network.e */
public final class C22215e {
    /* renamed from: a */
    public static final String m73691a(C19290j jVar, Map<String, String> map) {
        C7573i.m23587b(jVar, "$this$createUrl");
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                jVar.mo51188a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String a = jVar.mo51184a();
        C7573i.m23582a((Object) a, "build()");
        return a;
    }
}
