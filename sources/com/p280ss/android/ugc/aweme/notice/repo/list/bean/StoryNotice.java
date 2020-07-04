package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.api.model.LifeStory;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.StoryNotice */
public class StoryNotice {
    @C6593c(mo15949a = "comment")
    Comment comment;
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "is_expired")
    boolean isExpired;
    @C6593c(mo15949a = "story")
    LifeStory lifeStory;
    @C6593c(mo15949a = "merge_count")
    int mergeCount;
    @C6593c(mo15949a = "from_user")
    List<User> users;

    public Comment getComment() {
        return this.comment;
    }

    public String getContent() {
        return this.content;
    }

    public LifeStory getLifeStory() {
        return this.lifeStory;
    }

    public int getMergeCount() {
        return this.mergeCount;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public boolean isExpired() {
        return this.isExpired;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setExpired(boolean z) {
        this.isExpired = z;
    }

    public void setLifeStory(LifeStory lifeStory2) {
        this.lifeStory = lifeStory2;
    }

    public void setMergeCount(int i) {
        this.mergeCount = i;
    }

    public void setUsers(List<User> list) {
        this.users = list;
    }
}
