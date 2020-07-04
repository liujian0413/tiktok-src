package com.p280ss.android.ugc.aweme.commerce;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct */
public class AwemeCommerceStruct implements Serializable {
    @C6593c(mo15949a = "ad_auth_status")
    public int ad_auth_status;
    @C6593c(mo15949a = "ad_source")
    public int ad_source;
    @C6593c(mo15949a = "avoid_global_pendant")
    public boolean avoid_global_pendant;
    @C6593c(mo15949a = "show_share_link")
    public boolean show_share_link;

    public int getAdSource() {
        return this.ad_source;
    }

    public int getAuthStatus() {
        return this.ad_auth_status;
    }

    public boolean isAvoidGlobalPendant() {
        return this.avoid_global_pendant;
    }

    public boolean isShowShareLink() {
        return this.show_share_link;
    }
}
