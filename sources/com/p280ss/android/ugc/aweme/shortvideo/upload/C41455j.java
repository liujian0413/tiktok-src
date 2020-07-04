package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.j */
public final class C41455j {
    @C6593c(mo15949a = "type")

    /* renamed from: a */
    public final String f107840a;
    @C6593c(mo15949a = "data")

    /* renamed from: b */
    public final C41454i f107841b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f107841b, (java.lang.Object) r3.f107841b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.upload.C41455j
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.upload.j r3 = (com.p280ss.android.ugc.aweme.shortvideo.upload.C41455j) r3
            java.lang.String r0 = r2.f107840a
            java.lang.String r1 = r3.f107840a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.upload.i r0 = r2.f107841b
            com.ss.android.ugc.aweme.shortvideo.upload.i r3 = r3.f107841b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.upload.C41455j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f107840a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C41454i iVar = this.f107841b;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExemptionReportParam(type=");
        sb.append(this.f107840a);
        sb.append(", data=");
        sb.append(this.f107841b);
        sb.append(")");
        return sb.toString();
    }

    private C41455j(String str, C41454i iVar) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(iVar, "data");
        this.f107840a = str;
        this.f107841b = iVar;
    }

    public /* synthetic */ C41455j(String str, C41454i iVar, int i, C7571f fVar) {
        this("faceu_sticker", iVar);
    }
}
