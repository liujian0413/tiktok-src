package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30398q;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48008s;
import kotlin.reflect.C7584c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.z */
public final class C30420z<T extends C30398q> {

    /* renamed from: a */
    public final C7584c<T> f79939a;

    /* renamed from: b */
    public final C48008s<Uri, C30379e, String, String, JSONObject, T> f79940b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f79940b, (java.lang.Object) r3.f79940b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.hybrid.monitor.C30420z
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.hybrid.monitor.z r3 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30420z) r3
            kotlin.reflect.c<T> r0 = r2.f79939a
            kotlin.reflect.c<T> r1 = r3.f79939a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.jvm.a.s<android.net.Uri, com.ss.android.ugc.aweme.hybrid.monitor.e, java.lang.String, java.lang.String, org.json.JSONObject, T> r0 = r2.f79940b
            kotlin.jvm.a.s<android.net.Uri, com.ss.android.ugc.aweme.hybrid.monitor.e, java.lang.String, java.lang.String, org.json.JSONObject, T> r3 = r3.f79940b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.C30420z.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C7584c<T> cVar = this.f79939a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C48008s<Uri, C30379e, String, String, JSONObject, T> sVar = this.f79940b;
        if (sVar != null) {
            i = sVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionApi(iApi=");
        sb.append(this.f79939a);
        sb.append(", provider=");
        sb.append(this.f79940b);
        sb.append(")");
        return sb.toString();
    }

    public C30420z(C7584c<T> cVar, C48008s<? super Uri, ? super C30379e, ? super String, ? super String, ? super JSONObject, ? extends T> sVar) {
        C7573i.m23587b(cVar, "iApi");
        C7573i.m23587b(sVar, "provider");
        this.f79939a = cVar;
        this.f79940b = sVar;
    }
}
