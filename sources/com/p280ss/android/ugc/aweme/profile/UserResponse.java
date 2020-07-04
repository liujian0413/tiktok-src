package com.p280ss.android.ugc.aweme.profile;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.UserResponse */
public class UserResponse extends BaseResponse {
    public static final int UPDATE_FAIL_TOAST_AND_BACK = 1;
    public static final int UPDATE_FAIL_TOAST_NOT_BACK = 2;
    @C6593c(mo15949a = "toast_back")
    private int action;
    private User user;

    public int getAction() {
        return this.action;
    }

    public User getUser() {
        return this.user;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
