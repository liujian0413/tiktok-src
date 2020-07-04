package com.p280ss.android.ugc.aweme.newfollow.model;

import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.model.b */
public abstract class C34145b extends BaseResponse implements C6866d {
    private String requestId;

    public Aweme getAweme() {
        return null;
    }

    public List<Comment> getCommentList() {
        return null;
    }

    public abstract int getFeedType();

    public List<User> getLikeList() {
        return null;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean needUpdateComment() {
        return false;
    }

    public void setAweme(Aweme aweme) {
    }

    public void setCommentList(List<Comment> list) {
    }

    public abstract void setFeedType(int i);

    public String getAwemeAuthorId() {
        if (getAweme() != null) {
            return getAweme().getAuthorUid();
        }
        return null;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
