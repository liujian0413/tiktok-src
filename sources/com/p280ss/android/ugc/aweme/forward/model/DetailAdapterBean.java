package com.p280ss.android.ugc.aweme.forward.model;

import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.forward.model.DetailAdapterBean */
public class DetailAdapterBean implements Serializable {
    private Aweme mAweme;
    private Comment mComment;
    private int mType;

    public Aweme getAweme() {
        return this.mAweme;
    }

    public Comment getComment() {
        return this.mComment;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void setAweme(Aweme aweme) {
        this.mAweme = aweme;
    }

    public void setComment(Comment comment) {
        this.mComment = comment;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public DetailAdapterBean(int i) {
        this.mType = i;
    }

    public DetailAdapterBean(Comment comment) {
        this.mType = 1;
        this.mComment = comment;
    }

    public DetailAdapterBean(Aweme aweme) {
        this.mAweme = aweme;
    }

    public boolean equals(Object obj) {
        if (this.mType != 1 || this.mComment == null || !(obj instanceof DetailAdapterBean)) {
            return super.equals(obj);
        }
        return this.mComment.equals(((DetailAdapterBean) obj).getComment());
    }
}
