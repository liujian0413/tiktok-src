package com.p280ss.android.ugc.aweme.tools.p1665a;

import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.a.a */
public final class C42131a {
    /* renamed from: a */
    public static final JSONObject m134091a(Map<String, String> map) {
        C7573i.m23587b(map, "$this$toAndroidJSONObject");
        C38510bb a = C38510bb.m123095a();
        for (Entry entry : map.entrySet()) {
            a.mo96481a((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject b = a.mo96482b();
        C7573i.m23582a((Object) b, "builder.build()");
        return b;
    }
}
