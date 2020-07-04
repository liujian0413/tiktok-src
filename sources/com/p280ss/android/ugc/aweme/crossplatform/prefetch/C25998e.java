package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43469a;
import com.p280ss.android.ugc.aweme.web.jsbridge.p1706a.C43468a.C43471c;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.e */
public final class C25998e {

    /* renamed from: a */
    public final C43469a f68723a;

    /* renamed from: b */
    public final C43471c f68724b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f68724b, (java.lang.Object) r3.f68724b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.crossplatform.prefetch.e r3 = (com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e) r3
            com.ss.android.ugc.aweme.web.jsbridge.a.a$a r0 = r2.f68723a
            com.ss.android.ugc.aweme.web.jsbridge.a.a$a r1 = r3.f68723a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.web.jsbridge.a.a$c r0 = r2.f68724b
            com.ss.android.ugc.aweme.web.jsbridge.a.a$c r3 = r3.f68724b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25998e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C43469a aVar = this.f68723a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C43471c cVar = this.f68724b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsRequestAndResponse(jsRequest=");
        sb.append(this.f68723a);
        sb.append(", jsResponse=");
        sb.append(this.f68724b);
        sb.append(")");
        return sb.toString();
    }

    public C25998e(C43469a aVar, C43471c cVar) {
        this.f68723a = aVar;
        this.f68724b = cVar;
    }
}
