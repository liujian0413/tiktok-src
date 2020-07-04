package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.live.settings.C32545c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel */
public final class LiveSettingCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private C32545c liveSetting;

    public static /* synthetic */ LiveSettingCombineModel copy$default(LiveSettingCombineModel liveSettingCombineModel, C32545c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = liveSettingCombineModel.liveSetting;
        }
        return liveSettingCombineModel.copy(cVar);
    }

    public final C32545c component1() {
        return this.liveSetting;
    }

    public final LiveSettingCombineModel copy(C32545c cVar) {
        C7573i.m23587b(cVar, "liveSetting");
        return new LiveSettingCombineModel(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.liveSetting, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel) r2).liveSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel) r2
            com.ss.android.ugc.aweme.live.settings.c r0 = r1.liveSetting
            com.ss.android.ugc.aweme.live.settings.c r2 = r2.liveSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C32545c getLiveSetting() {
        return this.liveSetting;
    }

    public final int hashCode() {
        C32545c cVar = this.liveSetting;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveSettingCombineModel(liveSetting=");
        sb.append(this.liveSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setLiveSetting(C32545c cVar) {
        C7573i.m23587b(cVar, "<set-?>");
        this.liveSetting = cVar;
    }

    public LiveSettingCombineModel(C32545c cVar) {
        C7573i.m23587b(cVar, "liveSetting");
        this.liveSetting = cVar;
    }
}
