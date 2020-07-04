package com.bytedance.p073ad.symphony.p078c;

import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p081e.C2141a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.util.C2203f;
import com.bytedance.p073ad.symphony.util.SafeConcurrentHashMap;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ad.symphony.c.g */
public final class C2128g {
    /* renamed from: a */
    public static void m9330a(C2087d dVar) {
        if (C2129h.m9345a() && dVar != null) {
            C2129h.m9341a("show", dVar);
        }
    }

    /* renamed from: a */
    public static void m9332a(String str, C2087d dVar) {
        C2129h.m9341a(str, dVar);
    }

    /* renamed from: a */
    public static void m9331a(C2141a aVar, String str, Map<String, Object> map) {
        SafeConcurrentHashMap safeConcurrentHashMap;
        if (aVar != null && !C2203f.m9514a(aVar.f7273b) && C2129h.m9345a()) {
            try {
                safeConcurrentHashMap = new SafeConcurrentHashMap(map);
            } catch (ConcurrentModificationException e) {
                C2140e.m9360a((Exception) e);
                safeConcurrentHashMap = new SafeConcurrentHashMap();
            }
            List<String> list = aVar.f7273b;
            safeConcurrentHashMap.put("ad_placement_type", list);
            if (!C2203f.m9514a(list)) {
                safeConcurrentHashMap.put("ad_placement_type_prefix", C2143b.m9367a((String) list.get(0)));
            }
            C2129h.m9344a("ad_slot_receive", str, aVar, safeConcurrentHashMap);
        }
    }
}
