package com.p280ss.android.ugc.aweme.journey;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.g */
public final class C32243g {
    @C6593c(mo15949a = "content_languages")

    /* renamed from: a */
    public final List<C32232e> f84271a;
    @C6593c(mo15949a = "content_lang_dialog")

    /* renamed from: b */
    public final C32233f f84272b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f84272b, (java.lang.Object) r3.f84272b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.journey.C32243g
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.g r3 = (com.p280ss.android.ugc.aweme.journey.C32243g) r3
            java.util.List<com.ss.android.ugc.aweme.journey.e> r0 = r2.f84271a
            java.util.List<com.ss.android.ugc.aweme.journey.e> r1 = r3.f84271a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.f r0 = r2.f84272b
            com.ss.android.ugc.aweme.journey.f r3 = r3.f84272b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.C32243g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C32232e> list = this.f84271a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C32233f fVar = this.f84272b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyContentLanguageWrapper(content_languages=");
        sb.append(this.f84271a);
        sb.append(", content_lang_dialog=");
        sb.append(this.f84272b);
        sb.append(")");
        return sb.toString();
    }
}
