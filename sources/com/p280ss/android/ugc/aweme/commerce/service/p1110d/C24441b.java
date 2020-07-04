package com.p280ss.android.ugc.aweme.commerce.service.p1110d;

import android.content.Context;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23217c;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.d.b */
public final class C24441b {

    /* renamed from: a */
    public static final C24441b f64501a = new C24441b();

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.d.b$a */
    public static final class C24442a extends C6597a<HashMap<String, Long>> {
        C24442a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.d.b$b */
    public static final class C24443b extends C6597a<HashMap<String, Boolean>> {
        C24443b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.d.b$c */
    public static final class C24444c extends C6597a<HashMap<String, Long>> {
        C24444c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.d.b$d */
    public static final class C24445d extends C6597a<HashMap<String, Boolean>> {
        C24445d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.d.b$e */
    public static final class C24446e extends C6597a<HashMap<String, Boolean>> {
        C24446e() {
        }
    }

    private C24441b() {
    }

    /* renamed from: a */
    public static C24440a m80369a(Context context) {
        if (context == null) {
            return null;
        }
        return (C24440a) C23217c.m76236a(context, C24440a.class);
    }

    /* renamed from: a */
    public static long m80368a(C24440a aVar, String str) {
        C7573i.m23587b(aVar, "commercePreferences");
        C7573i.m23587b(str, "userId");
        try {
            HashMap hashMap = (HashMap) new C6600e().mo15975a(aVar.mo60415a(""), new C24442a().type);
            if (hashMap == null) {
                return 0;
            }
            Long l = (Long) hashMap.get(str);
            if (l != null) {
                return l.longValue();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m80373b(C24440a aVar, String str) {
        C7573i.m23587b(aVar, "commercePreferences");
        C7573i.m23587b(str, "userId");
        try {
            HashMap hashMap = (HashMap) new C6600e().mo15975a(aVar.mo60419c(""), new C24443b().type);
            if (hashMap == null) {
                return false;
            }
            Boolean bool = (Boolean) hashMap.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m80370a(C24440a aVar, String str, long j) {
        C7573i.m23587b(aVar, "commercePreferences");
        C7573i.m23587b(str, "userId");
        try {
            String a = aVar.mo60415a("");
            C6600e eVar = new C6600e();
            HashMap hashMap = (HashMap) eVar.mo15975a(a, new C24444c().type);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, Long.valueOf(j));
            String b = eVar.mo15979b((Object) hashMap);
            C7573i.m23582a((Object) b, "gson.toJson(map)");
            aVar.mo60417b(b);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m80372b(C24440a aVar, String str, boolean z) {
        C7573i.m23587b(aVar, "commercePreferences");
        C7573i.m23587b(str, "userId");
        try {
            String e = aVar.mo60423e("");
            C6600e eVar = new C6600e();
            HashMap hashMap = (HashMap) eVar.mo15975a(e, new C24446e().type);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, Boolean.valueOf(true));
            String b = eVar.mo15979b((Object) hashMap);
            C7573i.m23582a((Object) b, "gson.toJson(map)");
            aVar.mo60424f(b);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m80371a(C24440a aVar, String str, boolean z) {
        C7573i.m23587b(aVar, "commercePreferences");
        C7573i.m23587b(str, "userId");
        try {
            String c = aVar.mo60419c("");
            C6600e eVar = new C6600e();
            HashMap hashMap = (HashMap) eVar.mo15975a(c, new C24445d().type);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, Boolean.valueOf(z));
            String b = eVar.mo15979b((Object) hashMap);
            C7573i.m23582a((Object) b, "gson.toJson(map)");
            aVar.mo60421d(b);
        } catch (Exception unused) {
        }
    }
}
