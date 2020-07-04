package com.p280ss.android.ugc.aweme.journey;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.journey.h */
public final class C32244h extends BaseResponse {
    @C6593c(mo15949a = "new_user_interest_page")

    /* renamed from: a */
    public final C32245i f84273a;
    @C6593c(mo15949a = "new_user_content_language_page")

    /* renamed from: b */
    public final C32243g f84274b = null;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f84274b, (java.lang.Object) r3.f84274b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.journey.C32244h
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.h r3 = (com.p280ss.android.ugc.aweme.journey.C32244h) r3
            com.ss.android.ugc.aweme.journey.i r0 = r2.f84273a
            com.ss.android.ugc.aweme.journey.i r1 = r3.f84273a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.g r0 = r2.f84274b
            com.ss.android.ugc.aweme.journey.g r3 = r3.f84274b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.C32244h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C32245i iVar = this.f84273a;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        C32243g gVar = this.f84274b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyResponse(new_user_interest_page=");
        sb.append(this.f84273a);
        sb.append(", new_user_content_language_page=");
        sb.append(this.f84274b);
        sb.append(")");
        return sb.toString();
    }

    public C32244h(C32245i iVar, C32243g gVar) {
        this.f84273a = iVar;
    }
}
