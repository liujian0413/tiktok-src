package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.poi.bean.C35072d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel */
public final class SameCityCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private C35072d sameCityModel;

    public static /* synthetic */ SameCityCombineModel copy$default(SameCityCombineModel sameCityCombineModel, C35072d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = sameCityCombineModel.sameCityModel;
        }
        return sameCityCombineModel.copy(dVar);
    }

    public final C35072d component1() {
        return this.sameCityModel;
    }

    public final SameCityCombineModel copy(C35072d dVar) {
        C7573i.m23587b(dVar, "sameCityModel");
        return new SameCityCombineModel(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.sameCityModel, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel) r2).sameCityModel) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel) r2
            com.ss.android.ugc.aweme.poi.bean.d r0 = r1.sameCityModel
            com.ss.android.ugc.aweme.poi.bean.d r2 = r2.sameCityModel
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel.equals(java.lang.Object):boolean");
    }

    public final C35072d getSameCityModel() {
        return this.sameCityModel;
    }

    public final int hashCode() {
        C35072d dVar = this.sameCityModel;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SameCityCombineModel(sameCityModel=");
        sb.append(this.sameCityModel);
        sb.append(")");
        return sb.toString();
    }

    public final void setSameCityModel(C35072d dVar) {
        C7573i.m23587b(dVar, "<set-?>");
        this.sameCityModel = dVar;
    }

    public SameCityCombineModel(C35072d dVar) {
        C7573i.m23587b(dVar, "sameCityModel");
        this.sameCityModel = dVar;
    }
}
