package com.bytedance.ies.web.p583b;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.p */
public final class C11136p {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f30230a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11136p.class), "str", "getStr()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11136p.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11136p.class), "hashCode", "getHashCode()I"))};

    /* renamed from: g */
    public static final C11137a f30231g = new C11137a(null);

    /* renamed from: b */
    public final String f30232b;

    /* renamed from: c */
    public final String f30233c;

    /* renamed from: d */
    public final SortedMap<String, String> f30234d;

    /* renamed from: e */
    public final SortedMap<String, String> f30235e;

    /* renamed from: f */
    public final SortedMap<String, String> f30236f;

    /* renamed from: h */
    private final C7541d f30237h = C7546e.m23569a(new C11140d(this));

    /* renamed from: i */
    private final C7541d f30238i = C7546e.m23569a(new C11139c(this));

    /* renamed from: j */
    private final C7541d f30239j = C7546e.m23569a(new C11138b(this));

    /* renamed from: com.bytedance.ies.web.b.p$a */
    public static final class C11137a {
        private C11137a() {
        }

        public /* synthetic */ C11137a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C11136p m32601a(JSONObject jSONObject) {
            SortedMap sortedMap;
            C7573i.m23587b(jSONObject, "jsonObject");
            String string = jSONObject.getString("url");
            C7573i.m23582a((Object) string, "jsonObject.getString(\"url\")");
            String string2 = jSONObject.getString("method");
            C7573i.m23582a((Object) string2, "jsonObject.getString(\"method\")");
            SortedMap a = C11145u.m32625a(jSONObject.optJSONObject("headers"));
            SortedMap a2 = C11145u.m32625a(jSONObject.optJSONObject("params"));
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                sortedMap = C11145u.m32625a(optJSONObject);
            } else {
                sortedMap = null;
            }
            C11136p pVar = new C11136p(string, string2, a, a2, sortedMap);
            return pVar;
        }
    }

    /* renamed from: com.bytedance.ies.web.b.p$b */
    static final class C11138b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C11136p f30240a;

        C11138b(C11136p pVar) {
            this.f30240a = pVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m32602a());
        }

        /* renamed from: a */
        private int m32602a() {
            int i;
            int hashCode = ((((((this.f30240a.f30232b.hashCode() * 31) + this.f30240a.f30233c.hashCode()) * 31) + this.f30240a.f30234d.hashCode()) * 31) + this.f30240a.f30235e.hashCode()) * 31;
            SortedMap<String, String> sortedMap = this.f30240a.f30236f;
            if (sortedMap != null) {
                i = sortedMap.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.bytedance.ies.web.b.p$c */
    static final class C11139c extends Lambda implements C7561a<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ C11136p f30241a;

        C11139c(C11136p pVar) {
            this.f30241a = pVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject invoke() {
            return new JSONObject().put("url", this.f30241a.f30232b).put("method", this.f30241a.f30233c).put("headers", C11145u.m32626a((Map<String, String>) this.f30241a.f30234d)).put("params", C11145u.m32626a((Map<String, String>) this.f30241a.f30235e)).put("data", C11145u.m32626a((Map<String, String>) this.f30241a.f30236f));
        }
    }

    /* renamed from: com.bytedance.ies.web.b.p$d */
    static final class C11140d extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ C11136p f30242a;

        C11140d(C11136p pVar) {
            this.f30242a = pVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(C11145u.m32624a(this.f30242a.f30232b, this.f30242a.f30235e));
            sb.append(',');
            SortedMap<String, String> sortedMap = this.f30242a.f30236f;
            if (sortedMap == null) {
                sortedMap = new TreeMap<>();
            }
            sb.append(sortedMap);
            return sb.toString();
        }
    }

    /* renamed from: b */
    private final String m32597b() {
        return (String) this.f30237h.getValue();
    }

    /* renamed from: c */
    private final JSONObject m32598c() {
        return (JSONObject) this.f30238i.getValue();
    }

    /* renamed from: d */
    private final int m32599d() {
        return ((Number) this.f30239j.getValue()).intValue();
    }

    /* renamed from: a */
    public final JSONObject mo27116a() {
        return m32598c();
    }

    public final int hashCode() {
        return m32599d();
    }

    public final String toString() {
        return m32597b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11136p)) {
            return false;
        }
        C11136p pVar = (C11136p) obj;
        if (!C7573i.m23585a((Object) this.f30232b, (Object) pVar.f30232b) || !C7573i.m23585a((Object) this.f30233c, (Object) pVar.f30233c) || !C7573i.m23585a((Object) this.f30234d, (Object) pVar.f30234d) || !C7573i.m23585a((Object) this.f30235e, (Object) pVar.f30235e) || !C7573i.m23585a((Object) this.f30236f, (Object) pVar.f30236f)) {
            return false;
        }
        return true;
    }

    public C11136p(String str, String str2, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, SortedMap<String, String> sortedMap3) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "method");
        C7573i.m23587b(sortedMap, "headerMap");
        C7573i.m23587b(sortedMap2, "paramMap");
        this.f30232b = str;
        this.f30233c = str2;
        this.f30234d = sortedMap;
        this.f30235e = sortedMap2;
        this.f30236f = sortedMap3;
    }
}
