package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.GeneralPermission */
public class GeneralPermission implements Serializable {
    @C6593c(mo15949a = "following_follower_list_toast")
    public int followingFollowerListToast;
    @C6593c(mo15949a = "follow_toast")
    public int mFollowToast;
    @C6593c(mo15949a = "follow_toast_type")
    public int mFollowToastType;
    @C6593c(mo15949a = "original_list")
    public int mOriginalList;
    @C6593c(mo15949a = "profile_toast")
    public String mProfileToast;
    @C6593c(mo15949a = "share_profile_toast")
    public String mShareProfileToast;
    @C6593c(mo15949a = "share_toast")
    public int mShareToast;
    @C6593c(mo15949a = "shop_toast")
    public int mShopToast;

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getFollowToastType() {
        return this.mFollowToastType;
    }

    public int getFollowingFollowerListToast() {
        return this.followingFollowerListToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public String getProfileToast() {
        return this.mProfileToast;
    }

    public String getShareProfileToast() {
        return this.mShareProfileToast;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }
}
