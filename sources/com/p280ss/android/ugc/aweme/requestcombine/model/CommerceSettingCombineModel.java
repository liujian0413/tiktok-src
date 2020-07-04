package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel */
public final class CommerceSettingCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private C25000i combineModel;

    public static /* synthetic */ CommerceSettingCombineModel copy$default(CommerceSettingCombineModel commerceSettingCombineModel, C25000i iVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = commerceSettingCombineModel.combineModel;
        }
        return commerceSettingCombineModel.copy(iVar);
    }

    public final C25000i component1() {
        return this.combineModel;
    }

    public final CommerceSettingCombineModel copy(C25000i iVar) {
        C7573i.m23587b(iVar, "combineModel");
        return new CommerceSettingCombineModel(iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.combineModel, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel) r2).combineModel) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel) r2
            com.ss.android.ugc.aweme.commercialize.model.i r0 = r1.combineModel
            com.ss.android.ugc.aweme.commercialize.model.i r2 = r2.combineModel
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C25000i getCombineModel() {
        return this.combineModel;
    }

    public final int hashCode() {
        C25000i iVar = this.combineModel;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceSettingCombineModel(combineModel=");
        sb.append(this.combineModel);
        sb.append(")");
        return sb.toString();
    }

    public final void setCombineModel(C25000i iVar) {
        C7573i.m23587b(iVar, "<set-?>");
        this.combineModel = iVar;
    }

    public CommerceSettingCombineModel(C25000i iVar) {
        C7573i.m23587b(iVar, "combineModel");
        this.combineModel = iVar;
    }
}
