package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32027e;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.XPlanAwemeBannerConfig */
public final class XPlanAwemeBannerConfig extends BaseResponse {
    @C6593c(mo15949a = "background_icon")
    private C32027e backgroundIcon;
    @C6593c(mo15949a = "body_text")
    private String bodyText = "";
    @C6593c(mo15949a = "logo_icon")
    private C32027e logoIcon;
    @C6593c(mo15949a = "open_schema")
    private String openSchema = "";
    @C6593c(mo15949a = "sub_head_list")
    private List<? extends UrlModel> subHeadList;

    public final C32027e getBackgroundIcon() {
        return this.backgroundIcon;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final C32027e getLogoIcon() {
        return this.logoIcon;
    }

    public final String getOpenSchema() {
        return this.openSchema;
    }

    public final List<UrlModel> getSubHeadList() {
        return this.subHeadList;
    }

    public final void setBackgroundIcon(C32027e eVar) {
        this.backgroundIcon = eVar;
    }

    public final void setLogoIcon(C32027e eVar) {
        this.logoIcon = eVar;
    }

    public final void setSubHeadList(List<? extends UrlModel> list) {
        this.subHeadList = list;
    }

    public final void setBodyText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.bodyText = str;
    }

    public final void setOpenSchema(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.openSchema = str;
    }
}
