package com.bytedance.ies.bullet.core.monitor;

import android.net.Uri;
import com.bytedance.ies.bullet.core.common.C10350d;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.p543b.C10406a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.monitor.a */
public abstract class C10420a extends C10424b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f28161a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C10420a.class), "unitIdentifier", "getUnitIdentifier()Lcom/bytedance/ies/bullet/core/monitor/Identifier;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C10420a.class), "pageIdentifier", "getPageIdentifier()Lcom/bytedance/ies/bullet/core/monitor/PageIdentifier;"))};

    /* renamed from: e */
    public static final C10421a f28162e = new C10421a(null);

    /* renamed from: b */
    public final C10427e f28163b;

    /* renamed from: c */
    public final Uri f28164c;

    /* renamed from: d */
    public final C10403b f28165d;

    /* renamed from: h */
    private final C7541d f28166h = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C10423c(this));

    /* renamed from: i */
    private final C7541d f28167i = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C10422b(this));

    /* renamed from: com.bytedance.ies.bullet.core.monitor.a$a */
    public static final class C10421a {
        private C10421a() {
        }

        public /* synthetic */ C10421a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.monitor.a$b */
    static final class C10422b extends Lambda implements C7561a<C10428f> {

        /* renamed from: a */
        final /* synthetic */ C10420a f28168a;

        C10422b(C10420a aVar) {
            this.f28168a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C10428f invoke() {
            return new C10428f(this.f28168a.f28164c, this.f28168a.f28164c);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.monitor.a$c */
    static final class C10423c extends Lambda implements C7561a<C10427e> {

        /* renamed from: a */
        final /* synthetic */ C10420a f28169a;

        C10423c(C10420a aVar) {
            this.f28169a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C10427e invoke() {
            return new C10427e(this.f28169a.f28164c, null, 2, null);
        }
    }

    /* renamed from: a */
    public abstract String mo25208a();

    /* renamed from: b */
    public final C10427e mo25209b() {
        return (C10427e) this.f28166h.getValue();
    }

    /* renamed from: c */
    public final C10428f mo25210c() {
        return (C10428f) this.f28167i.getValue();
    }

    /* renamed from: d */
    private final C10425c mo25271d() {
        return (C10425c) this.f28165d.mo25202b(C10425c.class);
    }

    /* renamed from: e */
    private final Uri mo25272e() {
        return (Uri) this.f28165d.mo25202b(Uri.class);
    }

    public C10420a(Uri uri, C10403b bVar) {
        C10427e eVar;
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "providerFactory");
        this.f28164c = uri;
        this.f28165d = bVar;
        Uri e = mo25272e();
        if (e != null) {
            eVar = new C10427e(e, "original");
        } else {
            eVar = null;
        }
        this.f28163b = eVar;
    }

    /* renamed from: a */
    private void m30804a(String str, String str2, C10406a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str3;
        JSONObject jSONObject4;
        C7573i.m23587b(str, "logType");
        C7573i.m23587b(str2, "service");
        C7573i.m23587b(aVar, "identifier");
        C10425c d = mo25271d();
        if (d != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject5 = jSONObject;
            jSONObject5.put("type", mo25208a());
            String str4 = "is_fallback";
            if (mo25272e() == null) {
                str3 = "origin";
            } else {
                str3 = "fallback";
            }
            jSONObject5.put(str4, str3);
            C10350d.m30638a(jSONObject5, aVar.getFormatData());
            C10427e eVar = this.f28163b;
            if (eVar != null) {
                C10350d.m30638a(jSONObject5, eVar.getFormatData());
            }
            JSONObject jSONObject6 = new JSONObject();
            if (jSONObject2 != null) {
                C10350d.m30638a(jSONObject6, jSONObject2);
            }
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ts", System.currentTimeMillis());
            if (jSONObject3 != null) {
                jSONObject4 = new JSONObject();
                C10350d.m30638a(jSONObject4, jSONObject3);
            } else {
                jSONObject4 = null;
            }
            d.mo25212a(str, str2, jSONObject5, jSONObject6, jSONObject7, jSONObject4);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m30803a(C10420a aVar, String str, String str2, C10406a aVar2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 8) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 16) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        aVar.m30804a(str, str2, aVar2, jSONObject4, jSONObject5, null);
    }
}
