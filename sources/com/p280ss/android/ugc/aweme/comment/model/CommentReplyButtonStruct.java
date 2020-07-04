package com.p280ss.android.ugc.aweme.comment.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct */
public class CommentReplyButtonStruct extends Comment {
    private String mCommentId;
    private long mCursor;
    private int mExpandSize;
    private boolean mHasMore = true;
    private int mStatus;
    private String mTopIds = "";
    private int mTopSize;

    public int getButtonStatus() {
        return this.mStatus;
    }

    public String getCommentId() {
        return this.mCommentId;
    }

    public long getCursor() {
        return this.mCursor;
    }

    public int getExpandSize() {
        return this.mExpandSize;
    }

    public String getTopIds() {
        return this.mTopIds;
    }

    public int getTopSize() {
        return this.mTopSize;
    }

    public boolean isHasMore() {
        return this.mHasMore;
    }

    public void setButtonStatus(int i) {
        this.mStatus = i;
    }

    public void setCursor(long j) {
        this.mCursor = j;
    }

    public void setHasMore(boolean z) {
        this.mHasMore = z;
    }

    public void setReplyCommentTotal(int i) {
        this.replyCommentTotal = i;
    }

    public void addExpandSize(int i) {
        this.mExpandSize += i;
    }

    public void setExpandSize(int i) {
        this.mExpandSize = Math.max(i, 0);
    }

    public void setTopSize(int i) {
        this.mTopSize = Math.max(i, 0);
    }

    public void setReplyComments(List<Comment> list) {
        if (this.replyComments == null) {
            this.replyComments = new ArrayList();
        } else {
            this.replyComments.clear();
        }
        this.replyComments.addAll(list);
    }

    public CommentReplyButtonStruct(Comment comment, int i, boolean z) {
        setCommentType(11);
        this.mCommentId = comment.getCid();
        this.cid = String.valueOf(i);
        if (comment.getReplyComments() != null) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < comment.getReplyComments().size(); i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(((Comment) comment.getReplyComments().get(i2)).getCid());
            }
            this.mTopIds = sb.toString();
            this.mTopSize = comment.getReplyComments().size();
            if (z) {
                this.mCursor = (long) comment.getReplyComments().size();
            }
            this.mExpandSize = this.mTopSize;
        }
        setReplyCommentTotal(comment.getReplyCommentTotal());
    }
}
