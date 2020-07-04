package com.bytedance.ies.web.p583b;

import com.bytedance.ies.web.p583b.C11110e.C11111a;
import com.bytedance.ies.web.p583b.C11110e.C11112b;
import com.bytedance.ies.web.p583b.C11136p.C11137a;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C48038d;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.n */
public final class C11126n implements C11111a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f30206a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11126n.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"))};

    /* renamed from: g */
    public static final C11127a f30207g = new C11127a(null);

    /* renamed from: b */
    public C11112b f30208b;

    /* renamed from: c */
    public int f30209c;

    /* renamed from: d */
    public final C11136p f30210d;

    /* renamed from: e */
    public final long f30211e;

    /* renamed from: f */
    public final long f30212f;

    /* renamed from: h */
    private final HashSet<C11128b> f30213h;

    /* renamed from: i */
    private Throwable f30214i;

    /* renamed from: j */
    private final C7541d f30215j;

    /* renamed from: com.bytedance.ies.web.b.n$a */
    public static final class C11127a {
        private C11127a() {
        }

        public /* synthetic */ C11127a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C11126n m32581a(JSONObject jSONObject) {
            C7573i.m23587b(jSONObject, "requestObject");
            JSONObject jSONObject2 = jSONObject.getJSONObject("request");
            C7573i.m23582a((Object) jSONObject2, "requestObject.getJSONObject(\"request\")");
            C11126n nVar = new C11126n(C11137a.m32601a(jSONObject2), jSONObject.getLong("timestamp"), jSONObject.getLong("expires"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("response");
            C11112b bVar = new C11112b();
            bVar.mo27092a((Map<String, String>) C11145u.m32625a(jSONObject3.optJSONObject("headers")));
            String string = jSONObject3.getString("body");
            C7573i.m23582a((Object) string, "getString(\"body\")");
            Charset charset = C48038d.f122880a;
            if (string != null) {
                byte[] bytes = string.getBytes(charset);
                C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                bVar.mo27093a(bytes);
                nVar.f30208b = bVar;
                return nVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: com.bytedance.ies.web.b.n$b */
    public interface C11128b {
        /* renamed from: a */
        void mo27102a(C11112b bVar);

        /* renamed from: a */
        void mo27103a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.web.b.n$c */
    static final class C11129c extends Lambda implements C7561a<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C11126n f30216a;

        C11129c(C11126n nVar) {
            this.f30216a = nVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject invoke() {
            JSONObject jSONObject;
            JSONObject put = new JSONObject().put("request", this.f30216a.f30210d.mo27116a()).put("timestamp", this.f30216a.f30211e).put("expires", this.f30216a.f30212f);
            String str = "response";
            C11112b bVar = this.f30216a.f30208b;
            if (bVar == null) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                String str2 = "headers";
                JSONObject jSONObject3 = new JSONObject();
                for (Entry entry : bVar.mo27091a().entrySet()) {
                    jSONObject3.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject = jSONObject2.put(str2, jSONObject3).put("body", new String(bVar.mo27094b(), C48038d.f122880a));
            }
            return put.put(str, jSONObject);
        }
    }

    /* renamed from: b */
    private final JSONObject m32575b() {
        return (JSONObject) this.f30215j.getValue();
    }

    /* renamed from: a */
    public final JSONObject mo27107a() {
        return m32575b();
    }

    /* renamed from: a */
    public final void mo27089a(C11112b bVar) {
        C7573i.m23587b(bVar, "response");
        this.f30208b = bVar;
        for (C11128b a : this.f30213h) {
            a.mo27102a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo27109b(C11128b bVar) {
        C7573i.m23587b(bVar, "processListener");
        this.f30213h.remove(bVar);
    }

    /* renamed from: a */
    public final void mo27108a(C11128b bVar) {
        C7573i.m23587b(bVar, "processListener");
        this.f30213h.add(bVar);
        C11112b bVar2 = this.f30208b;
        if (bVar2 != null) {
            bVar.mo27102a(bVar2);
        }
        Throwable th = this.f30214i;
        if (th != null) {
            bVar.mo27103a(th);
        }
    }

    /* renamed from: a */
    public final void mo27090a(Throwable th) {
        C7573i.m23587b(th, "throwable");
        this.f30214i = th;
        for (C11128b a : this.f30213h) {
            a.mo27103a(th);
        }
    }

    public C11126n(C11136p pVar, long j) {
        C7573i.m23587b(pVar, "request");
        this(pVar, System.currentTimeMillis(), j);
    }

    public C11126n(C11136p pVar, long j, long j2) {
        C7573i.m23587b(pVar, "request");
        this.f30210d = pVar;
        this.f30211e = j;
        this.f30212f = j2;
        this.f30213h = new HashSet<>();
        this.f30209c = 2;
        this.f30215j = C7546e.m23569a(new C11129c(this));
    }
}
