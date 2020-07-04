package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel */
public final class UserSettingCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private C37723b userSetting;

    public static /* synthetic */ UserSettingCombineModel copy$default(UserSettingCombineModel userSettingCombineModel, C37723b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = userSettingCombineModel.userSetting;
        }
        return userSettingCombineModel.copy(bVar);
    }

    public final C37723b component1() {
        return this.userSetting;
    }

    public final UserSettingCombineModel copy(C37723b bVar) {
        C7573i.m23587b(bVar, "userSetting");
        return new UserSettingCombineModel(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.userSetting, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel) r2).userSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel) r2
            com.ss.android.ugc.aweme.setting.serverpush.model.b r0 = r1.userSetting
            com.ss.android.ugc.aweme.setting.serverpush.model.b r2 = r2.userSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C37723b getUserSetting() {
        return this.userSetting;
    }

    public final int hashCode() {
        C37723b bVar = this.userSetting;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettingCombineModel(userSetting=");
        sb.append(this.userSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setUserSetting(C37723b bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.userSetting = bVar;
    }

    public UserSettingCombineModel(C37723b bVar) {
        C7573i.m23587b(bVar, "userSetting");
        this.userSetting = bVar;
    }
}
