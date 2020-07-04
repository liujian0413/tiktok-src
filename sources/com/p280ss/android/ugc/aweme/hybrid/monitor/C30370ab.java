package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.ab */
public abstract class C30370ab extends C30364a implements C30401s {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f79848f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30370ab.class), "unitIdentifier", "getUnitIdentifier()Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30370ab.class), "pageIdentifier", "getPageIdentifier()Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;"))};

    /* renamed from: d */
    private final C7541d f79849d = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30372b(this));

    /* renamed from: e */
    private final C7541d f79850e = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C30371a(this));

    /* renamed from: g */
    public final Uri f79851g;

    /* renamed from: h */
    public final C30379e f79852h;

    /* renamed from: i */
    public final String f79853i;

    /* renamed from: j */
    public final String f79854j;

    /* renamed from: k */
    private String f79855k;

    /* renamed from: l */
    private String f79856l;

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.ab$a */
    static final class C30371a extends Lambda implements C7561a<C30403u> {

        /* renamed from: a */
        final /* synthetic */ C30370ab f79857a;

        C30371a(C30370ab abVar) {
            this.f79857a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30403u invoke() {
            return new C30403u(this.f79857a.f79851g, this.f79857a.f79851g, this.f79857a.f79853i, this.f79857a.f79854j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.ab$b */
    static final class C30372b extends Lambda implements C7561a<C30402t> {

        /* renamed from: a */
        final /* synthetic */ C30370ab f79858a;

        C30372b(C30370ab abVar) {
            this.f79858a = abVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30402t invoke() {
            C30402t tVar = new C30402t(this.f79858a.f79851g, null, this.f79858a.f79853i, this.f79858a.f79854j, 2, null);
            return tVar;
        }
    }

    /* renamed from: a */
    public abstract void mo79966a(String str, C30400r rVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: e */
    public final C30402t mo79968e() {
        return (C30402t) this.f79849d.getValue();
    }

    /* renamed from: f */
    public final String mo79969f() {
        return this.f79855k;
    }

    /* renamed from: g */
    public final String mo79970g() {
        return this.f79856l;
    }

    /* renamed from: k */
    public final C30403u mo79976k() {
        return (C30403u) this.f79850e.getValue();
    }

    /* renamed from: h */
    public final C30393m mo79972h() {
        return (C30393m) this.f79852h.mo79983a(C30393m.class);
    }

    /* renamed from: i */
    public final C30392l mo79974i() {
        return (C30392l) this.f79852h.mo79983a(C30392l.class);
    }

    /* renamed from: j */
    public final C30401s mo79975j() {
        return (C30401s) this.f79852h.mo79983a(C30401s.class);
    }

    /* renamed from: l */
    public final C30402t mo79977l() {
        C30401s j = mo79975j();
        if (j == null) {
            return null;
        }
        C30402t tVar = new C30402t(j.mo79968e().f79893a, "original_", null, null, 12, null);
        return tVar;
    }

    /* renamed from: h */
    public final void mo79973h(String str) {
        this.f79856l = str;
    }

    /* renamed from: g */
    public final void mo79971g(String str) {
        this.f79855k = str;
    }

    /* renamed from: a */
    public final void mo79965a(Exception exc, String str, String str2) {
        C7573i.m23587b(exc, "e");
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "type");
        C30392l i = mo79974i();
        if (i != null) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            linkedHashMap.put("type", str2);
            StringBuilder sb = new StringBuilder("hybrid ");
            sb.append(str2);
            sb.append(" report failed");
            i.mo80010a(exc, sb.toString(), linkedHashMap);
        }
    }

    /* renamed from: a */
    public void mo79967a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        C30392l i = mo79974i();
        if (i != null) {
            i.mo80011a(str, num, jSONObject, jSONObject2);
        }
    }

    public C30370ab(Uri uri, C30379e eVar, String str, String str2) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(eVar, "providerFactory");
        C7573i.m23587b(str, "chromeVersion");
        this.f79851g = uri;
        this.f79852h = eVar;
        this.f79853i = str;
        this.f79854j = str2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m99240a(C30370ab abVar, String str, C30400r rVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 4) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 8) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        abVar.mo79966a(str, rVar, jSONObject4, jSONObject5, null);
    }
}
