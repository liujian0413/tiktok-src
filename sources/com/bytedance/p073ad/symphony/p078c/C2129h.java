package com.bytedance.p073ad.symphony.p078c;

import com.bytedance.common.utility.C6319n;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.p074a.C2092b;
import com.bytedance.p073ad.symphony.p074a.C2093c;
import com.bytedance.p073ad.symphony.p079d.C2136b;
import com.bytedance.p073ad.symphony.p079d.C2137c;
import com.bytedance.p073ad.symphony.p081e.C2141a;
import com.bytedance.p073ad.symphony.p081e.C2148b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.util.C2199b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.c.h */
public class C2129h {

    /* renamed from: a */
    private static final String f7248a = "h";

    /* renamed from: b */
    private static C2136b f7249b;

    /* renamed from: c */
    private static C2137c f7250c;

    /* renamed from: a */
    public static boolean m9345a() {
        return (f7249b == null && f7250c == null) ? false : true;
    }

    /* renamed from: a */
    public static void m9344a(String str, String str2, C2141a aVar, Map<String, Object> map) {
        if (aVar != null) {
            m9342a(str, str2, aVar.f7275d, aVar.f7274c, map);
        }
    }

    /* renamed from: a */
    public static void m9343a(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map, boolean z) {
        JSONObject jSONObject2 = jSONObject;
        Map<String, Object> map2 = map;
        if (f7249b != null) {
            JSONObject jSONObject3 = new JSONObject();
            HashMap hashMap = map2 != null ? new HashMap(map2) : new HashMap();
            try {
                JSONObject jSONObject4 = new JSONObject();
                for (String str3 : hashMap.keySet()) {
                    jSONObject4.put(str3, hashMap.get(str3));
                }
                jSONObject3.put("ad_extra_data", jSONObject4.toString());
                jSONObject3.put("is_ad_event", 1);
                String str4 = str;
                try {
                    if (!"ad_slot_receive".equals(str)) {
                        jSONObject3.put("is_i18n_sdk", 1);
                        jSONObject3.put("refer", "sdk");
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put("log_extra", jSONObject.toString());
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                String str5 = str;
            }
            f7249b.mo7821a(str2, str, j, 0, jSONObject3);
        }
        if (f7250c != null && !z) {
            HashMap hashMap2 = map2 != null ? new HashMap(map2) : new HashMap();
            hashMap2.put("_ad_flag", Integer.valueOf(1));
            hashMap2.put("ad_id", Long.valueOf(j));
            if (jSONObject2 != null) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str6 = (String) keys.next();
                    hashMap2.put(str6, jSONObject2.opt(str6));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9338a(C2136b bVar) {
        f7249b = bVar;
    }

    /* renamed from: a */
    public static void m9339a(C2137c cVar) {
        f7250c = cVar;
    }

    /* renamed from: a */
    public static void m9333a(C2092b bVar) {
        if (m9345a() && bVar != null) {
            m9341a("ad_sdk_slot_fill", bVar);
        }
    }

    /* renamed from: a */
    public static void m9340a(String str) {
        if (m9345a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_placement_type_prefix", str);
            m9342a("ad_request_chain_fail_reset", "", 0, null, hashMap);
        }
    }

    /* renamed from: a */
    public static void m9334a(C2116a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("hb_ad", Integer.valueOf(aVar.f7228a));
        hashMap.put("non_hb_ad", Integer.valueOf(aVar.f7229b));
        m9342a("ad_sdk_bid_upload", "sdk_ad", 0, null, hashMap);
    }

    /* renamed from: a */
    public static void m9336a(C2126e eVar) {
        if (m9345a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("request_status", eVar.f7239a);
            hashMap.put("error_message", eVar.f7240b);
            hashMap.put("ad_placement_id", eVar.f7241c);
            hashMap.put("ad_placement_type_prefix", C2143b.m9367a(eVar.f7242d));
            hashMap.put("ad_placement_type", eVar.f7242d);
            hashMap.put("ad_request_time", Double.valueOf(eVar.f7243e));
            hashMap.put("ad_provider_id", Integer.valueOf(eVar.f7244f));
            m9342a("ad_sdk_request", "sdk_ad", 0, null, hashMap);
        }
    }

    /* renamed from: a */
    public static void m9335a(C2117b bVar) {
        if (f7249b != null && (C2140e.m9361b() == null || C2140e.m9361b().f7294a)) {
            HashMap hashMap = new HashMap();
            if (!C6319n.m19593a(bVar.f7230a)) {
                hashMap.put("request_status", bVar.f7230a);
            }
            if (!C6319n.m19593a(bVar.f7231b)) {
                hashMap.put("error_message", bVar.f7231b);
            }
            if (!C6319n.m19593a(bVar.f7232c)) {
                hashMap.put("ad_placement_id", bVar.f7232c);
            }
            if (!C6319n.m19593a(bVar.f7233d)) {
                hashMap.put("ad_placement_type_prefix", C2143b.m9367a(bVar.f7233d));
                hashMap.put("ad_placement_type", bVar.f7233d);
            }
            if (bVar.f7234e != 0) {
                hashMap.put("ad_provider_id", Integer.valueOf(bVar.f7234e));
            }
            if (!C6319n.m19593a(bVar.f7235f)) {
                hashMap.put("bid_id", bVar.f7235f);
            }
            m9346b(bVar.mo7810a(), "sdk_ad", 0, null, hashMap, true);
        }
    }

    /* renamed from: a */
    public static void m9337a(C2127f fVar) {
        if (m9345a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_placement_id", fVar.f7245a);
            hashMap.put("ad_placement_type_prefix", C2143b.m9367a(fVar.f7246b));
            hashMap.put("ad_placement_type", fVar.f7246b);
            hashMap.put("ad_provider_id", Integer.valueOf(fVar.f7247c));
            m9342a("ad_request_timeout", "sdk_ad", 0, null, hashMap);
        }
    }

    /* renamed from: a */
    public static void m9341a(String str, C2092b bVar) {
        if (bVar != null && bVar.mo7751b() != null && !(bVar instanceof C2093c)) {
            C2148b b = bVar.mo7751b();
            b.mo7829a();
            m9342a(str, b.f7305g, b.f7302d, b.f7303e, b.mo7829a());
        }
    }

    /* renamed from: a */
    private static void m9342a(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map) {
        m9346b(str, str2, j, jSONObject, map, false);
    }

    /* renamed from: b */
    private static void m9346b(String str, String str2, long j, JSONObject jSONObject, Map<String, Object> map, boolean z) {
        if (m9345a()) {
            final String str3 = str;
            final String str4 = str2;
            final long j2 = j;
            final JSONObject jSONObject2 = jSONObject;
            final Map<String, Object> map2 = map;
            final boolean z2 = z;
            C21301 r1 = new Runnable() {
                public final void run() {
                    try {
                        C2129h.m9343a(str3, str4, j2, jSONObject2, map2, z2);
                    } catch (Exception e) {
                        C2140e.m9360a(e);
                    }
                }
            };
            C2199b.m9504a((Runnable) r1);
        }
    }
}
