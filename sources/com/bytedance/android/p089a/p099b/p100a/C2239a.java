package com.bytedance.android.p089a.p099b.p100a;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.C2219d;
import com.bytedance.android.p089a.p090a.p096f.C2223a;
import com.bytedance.android.p089a.p090a.p098h.C2234e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.a.a */
public abstract class C2239a {
    /* renamed from: a */
    private static String m9626a() {
        return "";
    }

    /* renamed from: b */
    private static String m9627b() {
        return "";
    }

    /* renamed from: c */
    private static String m9628c() {
        return "";
    }

    /* renamed from: d */
    private static String m9629d() {
        return "";
    }

    /* renamed from: e */
    private static String m9630e() {
        return "";
    }

    /* renamed from: f */
    private static String m9631f() {
        return "0";
    }

    /* renamed from: g */
    private static String m9632g() {
        return "";
    }

    /* renamed from: i */
    private static String m9634i() {
        return "";
    }

    /* renamed from: j */
    private static String m9635j() {
        return "";
    }

    /* renamed from: k */
    private static String m9636k() {
        return "Android";
    }

    /* renamed from: h */
    private static String m9633h() {
        C2223a aVar = C2219d.m9560c().f7458c;
        if (aVar != null) {
            return aVar.f7478d;
        }
        return "";
    }

    /* renamed from: a */
    public final Map<String, String> mo7976a(List<String> list) {
        HashMap hashMap = new HashMap();
        if (list == null || list.isEmpty()) {
            return hashMap;
        }
        for (String str : list) {
            try {
                if ((TextUtils.equals("__MAC__", str) || TextUtils.equals("{MAC}", str)) && !TextUtils.isEmpty(m9626a())) {
                    String a = C2234e.m9612a(m9626a().replace(":", "").toUpperCase());
                    if (!TextUtils.isEmpty(a)) {
                        hashMap.put(str, a);
                    }
                } else if ((TextUtils.equals("__MAC1__", str) || TextUtils.equals("{MAC1}", str)) && !TextUtils.isEmpty(m9626a())) {
                    String a2 = C2234e.m9612a(m9626a().toUpperCase());
                    if (!TextUtils.isEmpty(a2)) {
                        hashMap.put(str, a2);
                    }
                } else if ((TextUtils.equals("__ANDROIDID__", str) || TextUtils.equals("{ANDROIDID}", str)) && !TextUtils.isEmpty(m9627b())) {
                    String a3 = C2234e.m9612a(m9627b());
                    if (!TextUtils.isEmpty(a3)) {
                        hashMap.put(str, a3);
                    }
                } else if ((TextUtils.equals("__ANDROIDID1__", str) || TextUtils.equals("{ANDROIDID1}", str)) && !TextUtils.isEmpty(m9627b())) {
                    hashMap.put(str, m9627b());
                } else if ((TextUtils.equals("__IMEI__", str) || TextUtils.equals("{IMEI}", str)) && !TextUtils.isEmpty(m9628c())) {
                    String a4 = C2234e.m9612a(m9628c());
                    if (!TextUtils.isEmpty(a4)) {
                        hashMap.put(str, a4);
                    }
                } else if ((TextUtils.equals("__AAID__", str) || TextUtils.equals("{AAID}", str)) && !TextUtils.isEmpty(m9629d())) {
                    hashMap.put(str, m9629d());
                } else if ((TextUtils.equals("__OPENUDID__", str) || TextUtils.equals("{OPENUDID}", str)) && !TextUtils.isEmpty(m9630e())) {
                    hashMap.put(str, m9630e());
                } else if ((TextUtils.equals("__OS__", str) || TextUtils.equals("{OS}", str)) && !TextUtils.isEmpty(m9631f())) {
                    hashMap.put(str, m9631f());
                } else if ((TextUtils.equals("__IP__", str) || TextUtils.equals("{IP}", str)) && !TextUtils.isEmpty(m9632g())) {
                    hashMap.put(str, m9632g());
                } else if (!TextUtils.equals("__LBS__", str)) {
                    if (!TextUtils.equals("{LBS}", str)) {
                        if (!TextUtils.equals("__GEO__", str)) {
                            if (!TextUtils.equals("{GEO}", str)) {
                                if ((TextUtils.equals("__UA__", str) || TextUtils.equals("{UA}", str)) && !TextUtils.isEmpty(m9633h())) {
                                    String b = C2234e.m9613b(m9633h());
                                    if (!TextUtils.isEmpty(b)) {
                                        hashMap.put(str, b);
                                    }
                                }
                                if ((TextUtils.equals("__UOO__", str) || TextUtils.equals("{UOO}", str)) && !TextUtils.isEmpty(m9634i())) {
                                    hashMap.put(str, m9634i());
                                }
                                if ((TextUtils.equals("__DEVICE_ID__", str) || TextUtils.equals("{DEVICE_ID}", str)) && !TextUtils.isEmpty(m9635j())) {
                                    hashMap.put(str, m9635j());
                                }
                                if ((TextUtils.equals("__OS_STR__", str) || TextUtils.equals("{OS_STR}", str)) && !TextUtils.isEmpty(m9636k())) {
                                    hashMap.put(str, m9636k());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }
}
