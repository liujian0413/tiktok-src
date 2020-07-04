package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse */
public class ActivityLinkResponse extends BaseResponse {
    @C6593c(mo15949a = "link_info")
    public LinkInfo linkInfo;

    /* renamed from: com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse$LinkInfo */
    public class LinkInfo {
        @C6593c(mo15949a = "background_style")
        public String backgroundUrl;
        @C6593c(mo15949a = "close_after")
        public int closeAfter;
        @C6593c(mo15949a = "click_disappear")
        public boolean disappearAfterClicked;
        @C6593c(mo15949a = "font_color")
        public String fontColor;
        @C6593c(mo15949a = "text")
        public String text;
        @C6593c(mo15949a = "h5_url")
        public String url;

        public LinkInfo() {
        }
    }
}
