package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.XPlanCardSubTitleResponse */
public class XPlanCardSubTitleResponse extends BaseResponse {
    @C6593c(mo15949a = "subtitle")
    String subtitle;
    @C6593c(mo15949a = "sub_head_list")
    List<UrlModel> urlModels;

    public String getSubTitle() {
        return this.subtitle;
    }

    public List<UrlModel> getUrlModels() {
        return this.urlModels;
    }
}
