package com.p280ss.android.ugc.aweme.comment.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.model.Comment */
public class Comment extends C23268a implements Serializable, Cloneable {
    private static final long serialVersionUID = -8417684736500467488L;
    @C6593c(mo15949a = "aweme_id")
    String awemeId;
    @C6593c(mo15949a = "cid")
    String cid;
    @C6593c(mo15949a = "create_time")
    int createTime;
    @C6593c(mo15949a = "digg_count")
    int diggCount;
    @C6593c(mo15949a = "sticker")
    Emoji emoji;
    private transient String fakeId = "";
    @C6593c(mo15949a = "forward_id")
    String forwardId;
    @C6593c(mo15949a = "is_author_digged")
    public boolean isAuthorDigged;
    boolean isTranslated;
    @C6593c(mo15949a = "label_info")
    String labelInfo;
    @C6593c(mo15949a = "label_text")
    String labelText;
    @C6593c(mo15949a = "label_type")
    int labelType;
    private int mCommentType;
    private boolean mNeedHint;
    public String mTimeDesc;
    public String mUserNamePrefix;
    public transient int offset;
    @C6593c(mo15949a = "relation_label")
    RelationDynamicLabel relationLabel;
    @C6593c(mo15949a = "reply_comment_total")
    int replyCommentTotal;
    @C6593c(mo15949a = "reply_comment")
    List<Comment> replyComments;
    @C6593c(mo15949a = "reply_id")
    String replyId;
    @C6593c(mo15949a = "reply_to_reply_id")
    String replyToReplyId;
    @C6593c(mo15949a = "reply_to_userid")
    String replyToUserId;
    @C6593c(mo15949a = "reply_to_username")
    String replyToUserName;
    @C6593c(mo15949a = "status")
    int status = -1;
    @C6593c(mo15949a = "stick_position")
    int stickPosition;
    @C6593c(mo15949a = "text")
    String text;
    @C6593c(mo15949a = "text_extra")
    List<TextExtraStruct> textExtra;
    @C6593c(mo15949a = "user")
    User user;
    @C6593c(mo15949a = "user_digged")
    int userDigged;

    /* renamed from: com.ss.android.ugc.aweme.comment.model.Comment$LabelType */
    public interface LabelType {
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCommentType() {
        return this.mCommentType;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public Emoji getEmoji() {
        return this.emoji;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public int getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyCommentId() {
        return this.replyToReplyId;
    }

    public String getReplyToUserId() {
        return this.replyToUserId;
    }

    public String getReplyToUserName() {
        return this.replyToUserName;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStickPosition() {
        return this.stickPosition;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public User getUser() {
        return this.user;
    }

    public int getUserDigged() {
        return this.userDigged;
    }

    public boolean isAuthorDigged() {
        return this.isAuthorDigged;
    }

    public boolean isNeedHint() {
        return this.mNeedHint;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public boolean isUserDigged() {
        if (this.userDigged == 1) {
            return true;
        }
        return false;
    }

    public String getFakeId() {
        if (this.fakeId == null) {
            return "";
        }
        return this.fakeId;
    }

    public int hashCode() {
        if (this.cid != null) {
            return this.cid.hashCode();
        }
        return 0;
    }

    public Comment clone() {
        C241931 r1;
        Comment comment = new Comment();
        comment.cid = this.cid;
        comment.text = this.text;
        comment.awemeId = this.awemeId;
        comment.createTime = this.createTime;
        comment.diggCount = this.diggCount;
        comment.status = this.status;
        comment.user = this.user;
        comment.replyId = this.replyId;
        comment.userDigged = this.userDigged;
        if (this.replyComments != null) {
            ArrayList arrayList = new ArrayList(this.replyComments.size());
            for (Comment clone : this.replyComments) {
                arrayList.add(clone.clone());
            }
            comment.replyComments = arrayList;
        }
        if (this.textExtra != null) {
            ArrayList arrayList2 = new ArrayList(this.textExtra.size());
            for (TextExtraStruct clone2 : this.textExtra) {
                arrayList2.add(clone2.clone());
            }
            comment.textExtra = arrayList2;
        }
        comment.labelText = this.labelText;
        comment.labelType = this.labelType;
        if (this.relationLabel == null) {
            r1 = null;
        } else {
            r1 = new RelationDynamicLabel() {
                {
                    setNickname(Comment.this.relationLabel.getNickname());
                    setLabelInfo(Comment.this.relationLabel.getLabelInfo());
                    setUserId(Comment.this.relationLabel.getUserId());
                    setCount(Comment.this.relationLabel.getCount());
                }
            };
        }
        comment.relationLabel = r1;
        comment.forwardId = this.forwardId;
        comment.replyCommentTotal = this.replyCommentTotal;
        comment.replyToReplyId = this.replyToReplyId;
        comment.replyToUserName = this.replyToUserName;
        comment.replyToUserId = this.replyToUserId;
        comment.mCommentType = this.mCommentType;
        comment.emoji = this.emoji;
        comment.stickPosition = this.stickPosition;
        return comment;
    }

    public void setAuthorDigged(boolean z) {
        this.isAuthorDigged = z;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCommentType(int i) {
        this.mCommentType = i;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setEmoji(Emoji emoji2) {
        this.emoji = emoji2;
    }

    public void setFakeId(String str) {
        this.fakeId = str;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setNeedHint(boolean z) {
        this.mNeedHint = z;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyCommentTotal(int i) {
        this.replyCommentTotal = i;
    }

    public void setReplyComments(List<Comment> list) {
        this.replyComments = list;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setReplyToUserId(String str) {
        this.replyToUserId = str;
    }

    public void setReplyToUserName(String str) {
        this.replyToUserName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickPosition(int i) {
        this.stickPosition = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public void setUserDigged(int i) {
        this.userDigged = i;
    }

    public static String getAuthorUid(Comment comment) {
        if (comment == null) {
            return "";
        }
        User user2 = comment.getUser();
        if (user2 == null) {
            return "";
        }
        return user2.getUid();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Comment) obj).cid);
    }
}
