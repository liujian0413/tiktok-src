package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.ShareStateResponse */
public class ShareStateResponse extends BaseResponse {
    @C6593c(mo15949a = "share_user")
    public ShareUserStruct[] mShareUserStructs;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.model.ShareStateResponse$ShareUserStruct */
    public static class ShareUserStruct implements Serializable {
        @C6593c(mo15949a = "follow_status")
        int mFollowStatus = -1;
        @C6593c(mo15949a = "share_status")
        int mShareStatus = 2;
        @C6593c(mo15949a = "user_id")
        String mUserId;

        public int getFollowStatus() {
            return this.mFollowStatus;
        }

        public int getShareStatus() {
            return this.mShareStatus;
        }

        public String getUserId() {
            return this.mUserId;
        }

        public String toUidString() {
            StringBuilder sb = new StringBuilder("ShareUserStruct{user_id=");
            sb.append(this.mUserId);
            sb.append(", follow_status=");
            sb.append(this.mFollowStatus);
            sb.append(", share_status=");
            sb.append(this.mShareStatus);
            sb.append('}');
            return sb.toString();
        }
    }
}
