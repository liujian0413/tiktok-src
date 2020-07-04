package com.p280ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel */
public final class SettingCombineModel extends BaseResponse {
    @C6593c(mo15949a = "data")
    private SettingCombineDataModel data;

    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public final void setData(SettingCombineDataModel settingCombineDataModel) {
        C7573i.m23587b(settingCombineDataModel, "<set-?>");
        this.data = settingCombineDataModel;
    }

    public SettingCombineModel(SettingCombineDataModel settingCombineDataModel) {
        C7573i.m23587b(settingCombineDataModel, "data");
        this.data = settingCombineDataModel;
    }
}
