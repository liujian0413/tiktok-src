package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.g */
public final class C31812g {

    /* renamed from: a */
    public final String f83227a;

    /* renamed from: b */
    public final Map<String, Boolean> f83228b;

    /* renamed from: c */
    public final Bundle f83229c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f83229c, (java.lang.Object) r3.f83229c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31812g
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.im.sdk.share.a.g r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31812g) r3
            java.lang.String r0 = r2.f83227a
            java.lang.String r1 = r3.f83227a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r2.f83228b
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r3.f83228b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            android.os.Bundle r0 = r2.f83229c
            android.os.Bundle r3 = r3.f83229c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C31812g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f83227a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Boolean> map = this.f83228b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Bundle bundle = this.f83229c;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareState(type=");
        sb.append(this.f83227a);
        sb.append(", conversationMap=");
        sb.append(this.f83228b);
        sb.append(", shareExtra=");
        sb.append(this.f83229c);
        sb.append(")");
        return sb.toString();
    }

    public C31812g(String str, Map<String, Boolean> map, Bundle bundle) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(map, "conversationMap");
        C7573i.m23587b(bundle, "shareExtra");
        this.f83227a = str;
        this.f83228b = map;
        this.f83229c = bundle;
    }
}
