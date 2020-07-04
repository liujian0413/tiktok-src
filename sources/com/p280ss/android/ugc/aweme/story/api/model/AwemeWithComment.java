package com.p280ss.android.ugc.aweme.story.api.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C6891b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.AwemeWithComment */
public class AwemeWithComment implements Serializable {
    @C6593c(mo15949a = "comment_hasmore")
    C41978c commentHasMore;
    boolean isRead;
    @C6593c(mo15949a = "log_pb")
    LogPbBean logPb;
    @C6891b
    @C6593c(mo15949a = "story")
    LifeStory mLifeStory;
    @C6593c(mo15949a = "recommend_reason")
    String reason;
    @C6593c(mo15949a = "view_user_list")
    C41980e viewUserList;

    public C41978c getCommentHasMore() {
        return this.commentHasMore;
    }

    public LifeStory getLifeStory() {
        return this.mLifeStory;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public String getReason() {
        return this.reason;
    }

    public C41980e getViewUserList() {
        return this.viewUserList;
    }

    public boolean isRead() {
        return this.isRead;
    }

    public String getStoryId() {
        return this.mLifeStory.getStoryId();
    }

    public int getAwemeType() {
        if (this.mLifeStory != null) {
            return this.mLifeStory.awemeType;
        }
        return 0;
    }

    public void setCommentHasMore(C41978c cVar) {
        this.commentHasMore = cVar;
    }

    public void setLifeStory(LifeStory lifeStory) {
        this.mLifeStory = lifeStory;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRead(boolean z) {
        this.isRead = z;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setViewUserList(C41980e eVar) {
        this.viewUserList = eVar;
    }
}
