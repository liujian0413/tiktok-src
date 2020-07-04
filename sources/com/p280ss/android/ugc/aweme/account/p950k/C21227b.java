package com.p280ss.android.ugc.aweme.account.p950k;

import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.k.b */
public final class C21227b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f57030a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21227b.class), "REGION_SERVICE", "getREGION_SERVICE()Lcom/ss/android/ugc/aweme/main/service/IRegionService;"))};

    /* renamed from: b */
    public static final C21227b f57031b = new C21227b();

    /* renamed from: c */
    private static final C7541d f57032c = C7546e.m23569a(C21228a.f57033a);

    /* renamed from: com.ss.android.ugc.aweme.account.k.b$a */
    static final class C21228a extends Lambda implements C7561a<C33034t> {

        /* renamed from: a */
        public static final C21228a f57033a = new C21228a();

        C21228a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m71453a();
        }

        /* renamed from: a */
        private static C33034t m71453a() {
            return (C33034t) C21084a.m71113a(C33034t.class);
        }
    }

    private C21227b() {
    }

    /* renamed from: a */
    private final C33034t m71449a() {
        return (C33034t) f57032c.getValue();
    }

    /* renamed from: a */
    public static final void m71452a(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "logType");
        C7573i.m23587b(jSONObject, "extraJson");
        jSONObject.put("carrier_region", f57031b.m71449a().mo60003c());
        C6893q.m21447a(str, jSONObject);
    }

    /* renamed from: a */
    public static final void m71450a(String str, int i, JSONObject jSONObject) {
        C7573i.m23587b(str, "serviceName");
        C7573i.m23587b(jSONObject, "extraJson");
        jSONObject.put("carrier_region", f57031b.m71449a().mo60003c());
        C6893q.m21444a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static final void m71451a(String str, String str2, JSONObject jSONObject) {
        C7573i.m23587b(str, "logType");
        C7573i.m23587b(str2, "serviceName");
        C7573i.m23587b(jSONObject, "extraJson");
        jSONObject.put("carrier_region", f57031b.m71449a().mo60003c());
        C6893q.m21452b(str, str2, jSONObject);
    }
}
