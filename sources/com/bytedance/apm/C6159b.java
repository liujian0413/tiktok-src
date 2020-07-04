package com.bytedance.apm;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p236a.C6153c;
import com.bytedance.apm.p236a.C6154d;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.p241f.p242a.C6191a;
import com.bytedance.apm.p241f.p242a.C6195c;
import com.bytedance.apm.p241f.p243b.C6199b;
import com.bytedance.apm.p241f.p243b.C9597a;
import com.bytedance.apm.p241f.p243b.C9598c;
import com.bytedance.apm.p241f.p243b.C9599d;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.p241f.p243b.C9601f;
import com.bytedance.apm.p241f.p243b.C9602g;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C6291h;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b */
public final class C6159b {
    /* renamed from: a */
    public static void m19112a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, JSONObject jSONObject3) {
        final JSONObject a = m19100a(jSONObject3);
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6191a b = C6191a.m19218b();
                C9601f fVar = new C9601f(str, 0, null, jSONObject, jSONObject2, a);
                b.mo14915a((C6201d) fVar);
            }
        });
    }

    /* renamed from: a */
    public static void m19111a(final String str, final JSONObject jSONObject, JSONObject jSONObject2) {
        final JSONObject a = m19100a(jSONObject2);
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6191a b = C6191a.m19218b();
                C9601f fVar = new C9601f(str, 0, jSONObject, null, null, a);
                b.mo14915a((C6201d) fVar);
            }
        });
    }

    /* renamed from: a */
    public static void m19110a(String str, JSONObject jSONObject) {
        m19113a(str, jSONObject, false);
    }

    /* renamed from: a */
    private static void m19113a(final String str, JSONObject jSONObject, boolean z) {
        final JSONObject a = m19100a(jSONObject);
        C6273b.m19475a().mo15066a((Runnable) new Runnable(false) {
            public final void run() {
                C6191a.m19218b().mo14915a((C6201d) new C6199b(str, a, false));
            }
        });
    }

    /* renamed from: a */
    public static boolean m19115a(String str) {
        return ApmDelegate.getInstance().getServiceNameSwitch(str);
    }

    /* renamed from: a */
    public static void m19114a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            m19109a("page_load", "page_load", jSONObject, jSONObject2, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m19109a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            final JSONObject a = C6291h.m19517a(jSONObject2);
            final JSONObject a2 = C6291h.m19517a(jSONObject);
            final JSONObject a3 = m19100a(jSONObject3);
            C6273b a4 = C6273b.m19475a();
            final String str3 = str;
            final String str4 = str2;
            C61643 r0 = new Runnable() {
                public final void run() {
                    C9600e eVar = new C9600e(str3, str4, a2, a, a3);
                    C6191a.m19218b().mo14915a((C6201d) eVar);
                }
            };
            a4.mo15066a((Runnable) r0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static JSONObject m19100a(JSONObject jSONObject) {
        try {
            JSONObject a = C6291h.m19517a(jSONObject);
            if (a == null) {
                a = new JSONObject();
            }
            if (a.isNull("timestamp")) {
                a.put("timestamp", System.currentTimeMillis());
            }
            return a;
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static void m19117b(final String str, JSONObject jSONObject) {
        final JSONObject a = m19100a(jSONObject);
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6191a.m19218b().mo14915a((C6201d) new C9598c(str, a));
            }
        });
    }

    /* renamed from: a */
    public static void m19107a(String str, String str2, JSONObject jSONObject) {
        m19108a(str, str2, jSONObject, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m19102a(final String str, final int i, JSONObject jSONObject) {
        final JSONObject a = m19100a(jSONObject);
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6191a b = C6191a.m19218b();
                C9601f fVar = new C9601f(str, i, null, null, null, a);
                b.mo14915a((C6201d) fVar);
            }
        });
    }

    /* renamed from: a */
    public static void m19106a(final String str, final String str2, final float f) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6191a.m19218b().mo14915a((C6201d) new C9599d(str, str2, f));
            }
        });
    }

    /* renamed from: b */
    public static void m19118b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m19109a(str, "", jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public static void m19103a(final String str, final int i, final JSONObject jSONObject, JSONObject jSONObject2) {
        final JSONObject a = m19100a(jSONObject2);
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6191a b = C6191a.m19218b();
                C9601f fVar = new C9601f(str, i, jSONObject, null, null, a);
                b.mo14915a((C6201d) fVar);
            }
        });
    }

    /* renamed from: a */
    private static void m19108a(final String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            final JSONObject a = C6291h.m19517a(jSONObject);
            final JSONObject a2 = m19100a((JSONObject) null);
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    C6191a.m19218b().mo14915a((C6201d) new C9602g(str, str2, a, a2));
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m19104a(String str, long j, long j2, String str2, C6154d dVar) {
        m19105a(str, j, j2, str2, dVar, null);
    }

    /* renamed from: a */
    private static void m19105a(String str, long j, long j2, String str2, C6154d dVar, C6153c cVar) {
        ApmDelegate.getInstance().activeUploadAlog(str, j, j2, str2, dVar, null);
    }

    /* renamed from: b */
    public static void m19116b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        final JSONObject a = m19100a(jSONObject);
        C6273b a2 = C6273b.m19475a();
        final long j3 = j;
        final long j4 = j2;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final int i2 = i;
        C61665 r0 = new Runnable() {
            public final void run() {
                C6195c b = C6195c.m19233b();
                C9597a aVar = new C9597a("api_error", j3, j4, str4, str5, str6, i2, a);
                b.mo14915a((C6201d) aVar);
            }
        };
        a2.mo15066a((Runnable) r0);
    }

    /* renamed from: a */
    public static void m19101a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        final JSONObject a = m19100a(jSONObject);
        C6273b a2 = C6273b.m19475a();
        final long j3 = j;
        final long j4 = j2;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final int i2 = i;
        C61601 r0 = new Runnable() {
            public final void run() {
                C6195c b = C6195c.m19233b();
                C9597a aVar = new C9597a("api_all", j3, j4, str4, str5, str6, i2, a);
                b.mo14915a((C6201d) aVar);
            }
        };
        a2.mo15066a((Runnable) r0);
    }
}
