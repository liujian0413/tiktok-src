package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.i */
public final class C41454i {
    @C6593c(mo15949a = "faceu_product")

    /* renamed from: a */
    public final String f107838a;
    @C6593c(mo15949a = "faceu_stickerIds")

    /* renamed from: b */
    public final List<Integer> f107839b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f107839b, (java.lang.Object) r3.f107839b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.upload.C41454i
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.upload.i r3 = (com.p280ss.android.ugc.aweme.shortvideo.upload.C41454i) r3
            java.lang.String r0 = r2.f107838a
            java.lang.String r1 = r3.f107838a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.lang.Integer> r0 = r2.f107839b
            java.util.List<java.lang.Integer> r3 = r3.f107839b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.upload.C41454i.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f107838a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Integer> list = this.f107839b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExemptionReportData(faceu_product=");
        sb.append(this.f107838a);
        sb.append(", faceu_stickerIds=");
        sb.append(this.f107839b);
        sb.append(")");
        return sb.toString();
    }

    public C41454i(String str, List<Integer> list) {
        C7573i.m23587b(str, "faceu_product");
        C7573i.m23587b(list, "faceu_stickerIds");
        this.f107838a = str;
        this.f107839b = list;
    }
}
