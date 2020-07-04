package com.p280ss.android.ugc.aweme.comment.model;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentReplyListItem */
public class CommentReplyListItem {
    public CommentReplyButtonStruct mButtonStruct;
    public Comment mComment;
    public List<Comment> mReplyComments = new ArrayList();

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CommentReplyListItem) || this.mComment == null) {
            return super.equals(obj);
        }
        return this.mComment.equals(((CommentReplyListItem) obj).mComment);
    }
}
