package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.C6709k;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel */
public final class AbTestCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private C6709k abTestResponse;

    public static /* synthetic */ AbTestCombineModel copy$default(AbTestCombineModel abTestCombineModel, C6709k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = abTestCombineModel.abTestResponse;
        }
        return abTestCombineModel.copy(kVar);
    }

    public final C6709k component1() {
        return this.abTestResponse;
    }

    public final AbTestCombineModel copy(C6709k kVar) {
        C7573i.m23587b(kVar, "abTestResponse");
        return new AbTestCombineModel(kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.abTestResponse, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel) r2).abTestResponse) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel) r2
            com.google.gson.k r0 = r1.abTestResponse
            com.google.gson.k r2 = r2.abTestResponse
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel.equals(java.lang.Object):boolean");
    }

    public final C6709k getAbTestResponse() {
        return this.abTestResponse;
    }

    public final int hashCode() {
        C6709k kVar = this.abTestResponse;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbTestCombineModel(abTestResponse=");
        sb.append(this.abTestResponse);
        sb.append(")");
        return sb.toString();
    }

    public final void setAbTestResponse(C6709k kVar) {
        C7573i.m23587b(kVar, "<set-?>");
        this.abTestResponse = kVar;
    }

    public AbTestCombineModel(C6709k kVar) {
        C7573i.m23587b(kVar, "abTestResponse");
        this.abTestResponse = kVar;
    }
}
