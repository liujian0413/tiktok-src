package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice */
public class CommentNotice implements Serializable {
    @C6593c(mo15949a = "aweme")
    Aweme aweme;
    @C6593c(mo15949a = "comment")
    Comment comment;
    @C6593c(mo15949a = "comment_type")
    int commentType;
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "forward_id")
    String forwardId;
    @C6593c(mo15949a = "level1_comment")
    Comment level1Comment;
    @C6593c(mo15949a = "label_text")
    private String mLabelText;
    @C6593c(mo15949a = "label_type")
    private int mLabelType;
    @C6593c(mo15949a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C6593c(mo15949a = "reply_comment")
    Comment replyComment;

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentType() {
        return this.commentType;
    }

    public String getContent() {
        return this.content;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelText() {
        return this.mLabelText;
    }

    public int getLabelType() {
        return this.mLabelType;
    }

    public Comment getLevel1Comment() {
        return this.level1Comment;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public Comment getReplyComment() {
        return this.replyComment;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentType(int i) {
        this.commentType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelText(String str) {
        this.mLabelText = str;
    }

    public void setLabelType(int i) {
        this.mLabelType = i;
    }

    public void setLevel1Comment(Comment comment2) {
        this.level1Comment = comment2;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyComment(Comment comment2) {
        this.replyComment = comment2;
    }
}
