package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.FriendTabStruct */
public class FriendTabStruct {
    @C6593c(mo15949a = "default_follow_tab")
    public boolean defaultFollowTab;
    @C6593c(mo15949a = "friend_tab_desc")
    public String friendTabDesc;

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
