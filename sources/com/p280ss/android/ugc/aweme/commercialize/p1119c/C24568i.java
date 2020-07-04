package com.p280ss.android.ugc.aweme.commercialize.p1119c;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.i */
public final class C24568i {

    /* renamed from: e */
    public static final C24569a f64809e = new C24569a(null);

    /* renamed from: a */
    public final String f64810a;

    /* renamed from: b */
    public final JSONObject f64811b;

    /* renamed from: c */
    public final String f64812c;

    /* renamed from: d */
    public final Object f64813d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.c.i$a */
    public static final class C24569a {
        private C24569a() {
        }

        public /* synthetic */ C24569a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a(r2.f64813d, r3.f64813d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.c.i r3 = (com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i) r3
            java.lang.String r0 = r2.f64810a
            java.lang.String r1 = r3.f64810a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            org.json.JSONObject r0 = r2.f64811b
            org.json.JSONObject r1 = r3.f64811b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f64812c
            java.lang.String r1 = r3.f64812c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r2.f64813d
            java.lang.Object r3 = r3.f64813d
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f64810a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f64811b;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str2 = this.f64812c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Object obj = this.f64813d;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsBridgeEvent(funcName=");
        sb.append(this.f64810a);
        sb.append(", params=");
        sb.append(this.f64811b);
        sb.append(", callbackId=");
        sb.append(this.f64812c);
        sb.append(", jsBridge=");
        sb.append(this.f64813d);
        sb.append(")");
        return sb.toString();
    }

    public C24568i(String str, JSONObject jSONObject, String str2, Object obj) {
        C7573i.m23587b(str, "funcName");
        this.f64810a = str;
        this.f64811b = jSONObject;
        this.f64812c = str2;
        this.f64813d = obj;
    }

    public /* synthetic */ C24568i(String str, JSONObject jSONObject, String str2, Object obj, int i, C7571f fVar) {
        this(str, jSONObject, null, null);
    }
}
