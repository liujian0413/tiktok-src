package com.bytedance.ies.geckoclient.debug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.debug.b */
public final class C10859b {

    /* renamed from: a */
    private static final Map<String, List<Pair<Long, String>>> f29390a = new HashMap();

    /* renamed from: a */
    public static void m31866a(String str, String... strArr) {
        if (C10858a.m31865a()) {
            synchronized (f29390a) {
                List list = (List) f29390a.get(str);
                if (list == null) {
                    list = new ArrayList();
                    f29390a.put(str, list);
                }
                StringBuilder sb = new StringBuilder();
                for (String append : strArr) {
                    sb.append(append);
                }
                list.add(new Pair(Long.valueOf(System.currentTimeMillis()), sb.toString()));
            }
        }
    }
}
