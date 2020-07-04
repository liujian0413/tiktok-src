package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.setting.model.ShareSettings;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel */
public final class ShareSettingCombineModel extends BaseCombineMode {
    @C6593c(mo15949a = "body")
    private ShareSettings shareSetting;

    public static /* synthetic */ ShareSettingCombineModel copy$default(ShareSettingCombineModel shareSettingCombineModel, ShareSettings shareSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            shareSettings = shareSettingCombineModel.shareSetting;
        }
        return shareSettingCombineModel.copy(shareSettings);
    }

    public final ShareSettings component1() {
        return this.shareSetting;
    }

    public final ShareSettingCombineModel copy(ShareSettings shareSettings) {
        C7573i.m23587b(shareSettings, "shareSetting");
        return new ShareSettingCombineModel(shareSettings);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.shareSetting, (java.lang.Object) ((com.p280ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel) r2).shareSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel r2 = (com.p280ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel) r2
            com.ss.android.ugc.aweme.setting.model.ShareSettings r0 = r1.shareSetting
            com.ss.android.ugc.aweme.setting.model.ShareSettings r2 = r2.shareSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final ShareSettings getShareSetting() {
        return this.shareSetting;
    }

    public final int hashCode() {
        ShareSettings shareSettings = this.shareSetting;
        if (shareSettings != null) {
            return shareSettings.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareSettingCombineModel(shareSetting=");
        sb.append(this.shareSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setShareSetting(ShareSettings shareSettings) {
        C7573i.m23587b(shareSettings, "<set-?>");
        this.shareSetting = shareSettings;
    }

    public ShareSettingCombineModel(ShareSettings shareSettings) {
        C7573i.m23587b(shareSettings, "shareSetting");
        this.shareSetting = shareSettings;
    }
}
