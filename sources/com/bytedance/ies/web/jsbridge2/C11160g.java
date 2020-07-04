package com.bytedance.ies.web.jsbridge2;

import com.bytedance.ies.web.jsbridge2.C11152c.C11154b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: com.bytedance.ies.web.jsbridge2.g */
final class C11160g implements C11188a {

    /* renamed from: a */
    public final C11164h f30282a;

    /* renamed from: b */
    public final Set<C11152c> f30283b = new HashSet();

    /* renamed from: c */
    public C11156e f30284c = this.f30322b;

    /* renamed from: d */
    private final C11181u f30285d;

    /* renamed from: e */
    private final Map<String, C11150a> f30286e = new HashMap();

    /* renamed from: f */
    private final Map<String, C11154b> f30287f = new HashMap();

    /* renamed from: g */
    private final List<C11171o> f30288g = new ArrayList();

    /* renamed from: h */
    private final C11169m f30289h;

    /* renamed from: i */
    private final boolean f30290i;

    /* renamed from: com.bytedance.ies.web.jsbridge2.g$a */
    static final class C11163a {

        /* renamed from: a */
        boolean f30296a;

        /* renamed from: b */
        String f30297b;

        private C11163a(boolean z, String str) {
            this.f30296a = z;
            this.f30297b = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> void mo27178a(String str, T t) {
        this.f30284c.mo27169b(str, this.f30282a.mo27182a(t));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27177a(String str, C11155d<?, ?> dVar) {
        dVar.name = str;
        this.f30286e.put(str, dVar);
        new StringBuilder("JsBridge stateless method registered: ").append(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27176a(String str, C11154b bVar) {
        this.f30287f.put(str, bVar);
        new StringBuilder("JsBridge stateful method registered: ").append(str);
    }

    /* renamed from: b */
    public final void mo27179b() {
        for (C11171o a : this.f30288g) {
            this.f30284c.mo27165a(a);
        }
        this.f30288g.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27174a() {
        for (C11152c terminateActual : this.f30283b) {
            terminateActual.terminateActual();
        }
        this.f30283b.clear();
        this.f30286e.clear();
        this.f30287f.clear();
        this.f30285d.mo27223b((C11188a) this);
    }

    /* renamed from: a */
    private static Type[] m32667a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* renamed from: a */
    private Object m32666a(String str, C11150a aVar) throws JSONException {
        return this.f30282a.mo27181a(str, m32667a(aVar)[0]);
    }

    /* renamed from: a */
    private C11163a m32663a(final C11171o oVar, C11151b bVar) throws Exception {
        bVar.mo27154a(oVar, new C11179t(oVar.f30312d, new C11180a() {
            /* renamed from: a */
            public final void mo27180a(String str) {
                if (str != null && C11160g.this.f30284c != null) {
                    C11160g.this.f30284c.mo27166a(oVar.f30314f, str);
                }
            }
        }));
        return new C11163a(false, C11192v.m32754a());
    }

    /* renamed from: b */
    private boolean m32668b(String str, C11150a aVar) {
        if (this.f30290i) {
            return this.f30285d.mo27222a(str, aVar);
        }
        return this.f30285d.mo27225b(str, aVar);
    }

    C11160g(C11166j jVar, C11181u uVar) {
        this.f30282a = C11164h.m32679a(jVar.f30302c);
        this.f30285d = uVar;
        this.f30285d.mo27219a((C11188a) this);
        this.f30289h = jVar.f30307h;
        this.f30290i = jVar.f30306g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C11163a mo27173a(C11171o oVar, CallContext callContext) throws Exception {
        C11150a aVar = (C11150a) this.f30286e.get(oVar.f30312d);
        if (aVar != null) {
            try {
                if (m32668b(callContext.f30266b, aVar)) {
                    if (this.f30289h != null) {
                        this.f30289h.mo27193a(callContext.f30266b, oVar.f30312d, 1);
                    }
                    new StringBuilder("Permission denied, call: ").append(oVar);
                    throw new C11177r(-1);
                } else if (aVar instanceof C11155d) {
                    new StringBuilder("Processing stateless call: ").append(oVar);
                    return m32665a(oVar, (C11155d) aVar, callContext);
                } else if (aVar instanceof C11151b) {
                    new StringBuilder("Processing raw call: ").append(oVar);
                    return m32663a(oVar, (C11151b) aVar);
                }
            } catch (C11189b unused) {
                new StringBuilder("No remote permission config fetched, call pending: ").append(oVar);
                this.f30288g.add(oVar);
                return new C11163a(false, C11192v.m32754a());
            }
        }
        C11154b bVar = (C11154b) this.f30287f.get(oVar.f30312d);
        if (bVar != null) {
            C11152c a = bVar.mo11646a();
            a.name = oVar.f30312d;
            if (!m32668b(callContext.f30266b, a)) {
                new StringBuilder("Processing stateful call: ").append(oVar);
                return m32664a(oVar, a, callContext);
            }
            new StringBuilder("Permission denied, call: ").append(oVar);
            a.onDestroy();
            throw new C11177r(-1);
        }
        if (this.f30289h != null) {
            this.f30289h.mo27193a(callContext.f30266b, oVar.f30312d, 2);
        }
        StringBuilder sb = new StringBuilder("Received call: ");
        sb.append(oVar);
        sb.append(", but not registered.");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27175a(String str, C11151b bVar) {
        bVar.name = str;
        this.f30286e.put(str, bVar);
        new StringBuilder("JsBridge raw method registered: ").append(str);
    }

    /* renamed from: a */
    private C11163a m32664a(final C11171o oVar, final C11152c cVar, CallContext callContext) throws Exception {
        this.f30283b.add(cVar);
        cVar.invokeActual(m32666a(oVar.f30313e, (C11150a) cVar), callContext, new C11153a() {
            /* renamed from: a */
            public final void mo27163a(Throwable th) {
                if (C11160g.this.f30284c != null) {
                    C11160g.this.f30284c.mo27166a(oVar.f30314f, C11192v.m32756a(th));
                    C11160g.this.f30283b.remove(cVar);
                }
            }

            /* renamed from: a */
            public final void mo27162a(Object obj) {
                if (C11160g.this.f30284c != null) {
                    C11160g.this.f30284c.mo27166a(oVar.f30314f, C11192v.m32755a(C11160g.this.f30282a.mo27182a(obj)));
                    C11160g.this.f30283b.remove(cVar);
                }
            }
        });
        return new C11163a(false, C11192v.m32754a());
    }

    /* renamed from: a */
    private C11163a m32665a(C11171o oVar, C11155d dVar, CallContext callContext) throws Exception {
        return new C11163a(true, C11192v.m32755a(this.f30282a.mo27182a(dVar.invoke(m32666a(oVar.f30313e, (C11150a) dVar), callContext))));
    }
}
