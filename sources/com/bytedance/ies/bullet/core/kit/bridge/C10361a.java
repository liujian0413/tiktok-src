package com.bytedance.ies.bullet.core.kit.bridge;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.kit.bridge.a */
public final class C10361a {

    /* renamed from: a */
    public final String f28070a;

    /* renamed from: b */
    public final JSONObject f28071b;

    /* renamed from: c */
    public final C10360a f28072c;

    /* renamed from: d */
    public final C7562b<Throwable, C7581n> f28073d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f28073d, (java.lang.Object) r3.f28073d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.core.kit.bridge.C10361a
            if (r0 == 0) goto L_0x0031
            com.bytedance.ies.bullet.core.kit.bridge.a r3 = (com.bytedance.ies.bullet.core.kit.bridge.C10361a) r3
            java.lang.String r0 = r2.f28070a
            java.lang.String r1 = r3.f28070a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            org.json.JSONObject r0 = r2.f28071b
            org.json.JSONObject r1 = r3.f28071b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bytedance.ies.bullet.core.kit.bridge.IBridge$a r0 = r2.f28072c
            com.bytedance.ies.bullet.core.kit.bridge.IBridge$a r1 = r3.f28072c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            kotlin.jvm.a.b<java.lang.Throwable, kotlin.n> r0 = r2.f28073d
            kotlin.jvm.a.b<java.lang.Throwable, kotlin.n> r3 = r3.f28073d
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.core.kit.bridge.C10361a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f28070a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f28071b;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        C10360a aVar = this.f28072c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C7562b<Throwable, C7581n> bVar = this.f28073d;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirdgeHandleUnit(funcName=");
        sb.append(this.f28070a);
        sb.append(", params=");
        sb.append(this.f28071b);
        sb.append(", callback=");
        sb.append(this.f28072c);
        sb.append(", reject=");
        sb.append(this.f28073d);
        sb.append(")");
        return sb.toString();
    }

    public C10361a(String str, JSONObject jSONObject, C10360a aVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(str, "funcName");
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "callback");
        C7573i.m23587b(bVar, "reject");
        this.f28070a = str;
        this.f28071b = jSONObject;
        this.f28072c = aVar;
        this.f28073d = bVar;
    }
}
