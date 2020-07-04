package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe */
public class AtMe {
    @C6593c(mo15949a = "reply_comment")
    Comment comment;
    @C6593c(mo15949a = "comment_status")
    int commentStatus = -1;
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "sticker")
    Emoji emoji;
    @C6593c(mo15949a = "image_url")
    UrlModel imageUrl;
    @C6593c(mo15949a = "item_status")
    int itemStatus;
    @C6593c(mo15949a = "level1_comment")
    Comment level1Comment;
    @C6593c(mo15949a = "label_text")
    private String mLabelText;
    @C6593c(mo15949a = "label_type")
    private int mLabelType;
    @C6593c(mo15949a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C6593c(mo15949a = "schema_url")
    String schemaUrl;
    @C6593c(mo15949a = "sub_type")
    int subType;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "user_info")
    User user;

    public Comment getComment() {
        return this.comment;
    }

    public int getCommentStatus() {
        return this.commentStatus;
    }

    public String getContent() {
        return this.content;
    }

    public Emoji getEmoji() {
        return this.emoji;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public int getItemStatus() {
        return this.itemStatus;
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

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setCommentStatus(int i) {
        this.commentStatus = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setEmoji(Emoji emoji2) {
        this.emoji = emoji2;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setItemStatus(int i) {
        this.itemStatus = i;
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

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
