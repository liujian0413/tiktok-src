package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31851b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra */
public class UserExtra {
    @C6593c(mo15949a = "is_disable_show_follow_bar")
    private boolean isDisableShowFollowBar;
    private boolean isSayHelloLogger;
    @C6593c(mo15949a = "uid")
    String uid;

    public UserExtra() {
    }

    public boolean getIsDisableShowFollowBar() {
        return this.isDisableShowFollowBar;
    }

    public boolean getIsSayHelloLogger() {
        return this.isSayHelloLogger;
    }

    public String getUid() {
        return this.uid;
    }

    public void setIsDisableShowFollowBar(boolean z) {
        this.isDisableShowFollowBar = z;
    }

    public void setIsSayHelloLogger(boolean z) {
        this.isSayHelloLogger = z;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static boolean isDisableShowFollowBar(String str) {
        UserExtra a = C31851b.m103384a().mo82688a(str);
        if (a == null || !a.isDisableShowFollowBar) {
            return false;
        }
        return true;
    }

    public UserExtra(String str, boolean z, boolean z2) {
        this.uid = str;
        this.isDisableShowFollowBar = z;
        this.isSayHelloLogger = z2;
    }
}
