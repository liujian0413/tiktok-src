package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice */
public class FollowNotice {
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C6593c(mo15949a = "from_user")
    User user;

    public String getContent() {
        return this.content;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public User getUser() {
        return this.user;
    }

    public FollowNotice clone() {
        User user2;
        FollowNotice followNotice = new FollowNotice();
        if (this.user == null) {
            user2 = null;
        } else {
            user2 = this.user.clone();
        }
        followNotice.user = user2;
        followNotice.content = this.content;
        followNotice.relationLabel = this.relationLabel;
        return followNotice;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
