package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.reflect.C7584c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.i */
public final class C30388i extends C30364a implements C30392l, C30393m {

    /* renamed from: g */
    public static final Map<C7584c<? extends C30398q>, C30420z<? extends C30398q>> f79888g = new LinkedHashMap();

    /* renamed from: h */
    public static final C30389a f79889h = new C30389a(null);

    /* renamed from: d */
    public C30401s f79890d;

    /* renamed from: e */
    public final C30419y f79891e;

    /* renamed from: f */
    public final C30369aa f79892f;

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.i$a */
    public static final class C30389a {
        private C30389a() {
        }

        public /* synthetic */ C30389a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m99320a(C30420z<? extends C30398q> zVar) {
            C30388i.f79888g.put(zVar.f79939a, zVar);
        }
    }

    /* renamed from: b */
    public final void mo79940b() {
        super.mo79940b();
        m99308a((C30401s) null);
    }

    /* renamed from: c */
    public final String mo80013c() {
        return this.f79892f.mo67260e();
    }

    /* renamed from: d */
    public final boolean mo80014d() {
        return this.f79892f.mo67258c();
    }

    /* renamed from: e */
    public final List<String> mo80015e() {
        return this.f79892f.mo67259d();
    }

    /* renamed from: f */
    public final String mo80016f() {
        return this.f79892f.mo67256a();
    }

    /* renamed from: g */
    public final boolean mo80017g() {
        return this.f79892f.mo67257b();
    }

    static {
        C30389a.m99320a(C30380f.m99267a());
        C30389a.m99320a(C30413v.m99380a());
    }

    /* renamed from: a */
    private void m99308a(C30401s sVar) {
        C30401s sVar2 = this.f79890d;
        if (sVar2 != null) {
            sVar2.mo79940b();
        }
        if (sVar != null) {
            sVar.mo79939a(mo79938a(), this.f79799b);
        }
        this.f79890d = sVar;
    }

    /* renamed from: a */
    public final <T extends C30398q> T mo80008a(Class<T> cls) {
        C7573i.m23587b(cls, "iApi");
        T t = this.f79890d;
        if (t != null) {
            if (!cls.isAssignableFrom(t.getClass())) {
                t = null;
            }
            if (t != null) {
                if (t != null) {
                    return (C30398q) t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }
        return null;
    }

    public C30388i(C30419y yVar, C30369aa aaVar) {
        C7573i.m23587b(yVar, "reportor");
        C7573i.m23587b(aaVar, "settings");
        this.f79891e = yVar;
        this.f79892f = aaVar;
    }

    /* renamed from: a */
    public final void mo80012a(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "service");
        C7573i.m23587b(jSONObject, "data");
        try {
            this.f79891e.mo67255a(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo80010a(Exception exc, String str, Map<String, String> map) {
        C7573i.m23587b(exc, "e");
        C7573i.m23587b(str, "message");
        C7573i.m23587b(map, "data");
        try {
            this.f79891e.mo67252a(exc, str, map);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo80011a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            this.f79891e.mo67253a(str, num, jSONObject, jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo80009a(Uri uri, View view, String str, String str2, JSONObject jSONObject) {
        boolean z;
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "chromeVersion");
        C30379e eVar = new C30379e();
        eVar.mo79984a(C30392l.class, new C30374ad(this));
        eVar.mo79984a(C30401s.class, new C30378d(this.f79890d));
        eVar.mo79984a(View.class, new C30374ad(view));
        eVar.mo79984a(C30393m.class, new C30374ad(this));
        C30398q qVar = null;
        for (Entry value : f79888g.entrySet()) {
            qVar = (C30398q) ((C30420z) value.getValue()).f79940b.invoke(uri, eVar, str, str2, jSONObject);
            if (qVar != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (qVar != null) {
            if (!(qVar instanceof C30401s)) {
                qVar = null;
            }
            if (qVar != null) {
                if (qVar != null) {
                    m99308a((C30401s) qVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.hybrid.monitor.IUnitSession");
            }
        }
    }
}
