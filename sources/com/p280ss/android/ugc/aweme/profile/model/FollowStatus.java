package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.FollowStatus */
public class FollowStatus extends BaseResponse {
    public static final int STATUS_CODE_CHEATING = 2149;
    public static final int STATUS_FOLLOW = 1;
    public static final int STATUS_FOLLOW_REQUEST = 4;
    public static final int STATUS_FOLLOW_TWOWAY = 2;
    public static final int STATUS_UNFOLLOW = 0;
    @C6593c(mo15949a = "contact_name")
    public String contactName;
    @C6593c(mo15949a = "follow_status")
    public int followStatus;
    public int followerStatus = -1;
    @C6593c(mo15949a = "is_enterprise")
    int isEnterprise;
    public boolean isFollowChange = true;
    public boolean isFollowSucess = true;
    public String userId;
    @C6593c(mo15949a = "watch_status")
    public int watchStatus;

    public boolean getIsEnterprise() {
        if (this.isEnterprise == 1) {
            return true;
        }
        return false;
    }

    public FollowStatus() {
    }

    public boolean isCheating() {
        if (this.status_code == 2149) {
            return true;
        }
        return false;
    }

    public WatchStatus cpoyToWatchStatus() {
        WatchStatus watchStatus2 = new WatchStatus();
        watchStatus2.userId = this.userId;
        watchStatus2.followStatus = this.followStatus;
        watchStatus2.watchStatus = this.watchStatus;
        return watchStatus2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FollowStatus{watchStatus=");
        sb.append(this.watchStatus);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", userId='");
        sb.append(this.userId);
        sb.append('\'');
        sb.append(", isFollowSucess=");
        sb.append(this.isFollowSucess);
        sb.append(", contactName=");
        sb.append(this.contactName);
        sb.append(", isEnterprise=");
        sb.append(this.isEnterprise);
        sb.append('}');
        return sb.toString();
    }

    public FollowStatus(String str, int i) {
        this.userId = str;
        this.followStatus = i;
    }

    public FollowStatus(String str, int i, int i2) {
        this.userId = str;
        this.followStatus = i;
        this.status_code = i2;
    }
}
