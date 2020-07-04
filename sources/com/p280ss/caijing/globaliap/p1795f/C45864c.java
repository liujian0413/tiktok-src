package com.p280ss.caijing.globaliap.p1795f;

import com.p280ss.caijing.globaliap.C45801b;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.f.c */
public final class C45864c {

    /* renamed from: a */
    public static C45801b f117278a;

    /* renamed from: a */
    public static void m143930a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(":");
            sb.append((String) map.get(str2));
        }
        if (f117278a != null) {
            f117278a.mo11056a(str, map);
        }
    }
}
