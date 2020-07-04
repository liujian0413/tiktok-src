package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.C6709k;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel */
public final class AwemeSettingCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private C6709k awemeSetting;

    public static /* synthetic */ AwemeSettingCombineModel copy$default(AwemeSettingCombineModel awemeSettingCombineModel, C6709k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = awemeSettingCombineModel.awemeSetting;
        }
        return awemeSettingCombineModel.copy(kVar);
    }

    public final C6709k component1() {
        return this.awemeSetting;
    }

    public final AwemeSettingCombineModel copy(C6709k kVar) {
        C7573i.m23587b(kVar, "awemeSetting");
        return new AwemeSettingCombineModel(kVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.awemeSetting, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel) r2).awemeSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel) r2
            com.google.gson.k r0 = r1.awemeSetting
            com.google.gson.k r2 = r2.awemeSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C6709k getAwemeSetting() {
        return this.awemeSetting;
    }

    public final int hashCode() {
        C6709k kVar = this.awemeSetting;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeSettingCombineModel(awemeSetting=");
        sb.append(this.awemeSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setAwemeSetting(C6709k kVar) {
        C7573i.m23587b(kVar, "<set-?>");
        this.awemeSetting = kVar;
    }

    public AwemeSettingCombineModel(C6709k kVar) {
        C7573i.m23587b(kVar, "awemeSetting");
        this.awemeSetting = kVar;
    }
}
