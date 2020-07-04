package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice */
public class FriendNotice {
    @C6593c(mo15949a = "content")
    private String content;
    @C6593c(mo15949a = "schema_url")
    private String openUrl;
    @C6593c(mo15949a = "type")
    private int type;
    @C6593c(mo15949a = "from_user")
    private User user;

    public String getContent() {
        return this.content;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
