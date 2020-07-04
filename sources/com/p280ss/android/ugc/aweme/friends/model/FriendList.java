package com.p280ss.android.ugc.aweme.friends.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.FriendList */
public class FriendList<T extends User> {
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "social_users", mo15950b = {"user_list"})
    public List<T> friends;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "register_count")
    public int registerCount;
    @C6593c(mo15949a = "total_count")
    public int total;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "unregistered_user")
    public List<UnRegisteredUser> unregisteredUser;
}
