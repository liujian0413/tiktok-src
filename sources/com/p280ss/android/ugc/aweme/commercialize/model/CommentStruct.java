package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.CommentStruct */
public class CommentStruct extends Comment implements Serializable {
    private static final long serialVersionUID = 1075399560205544614L;
    private String aid;
    @C6593c(mo15949a = "avatar_icon")
    private UrlModel avatarIcon;
    private AwemeRawAd awemeRawAd;
    @C6593c(mo15949a = "button_text")
    private String buttonText;
    @C6593c(mo15949a = "comment_info")
    private String commentInfo;
    @C6593c(mo15949a = "comment_nickname")
    private String commentNickName;
    @C6593c(mo15949a = "comment_time")
    private long commentTime;
    private boolean isAdFake;
    @C6593c(mo15949a = "show_button_number")
    private int showButtonNumber;
    @C6593c(mo15949a = "source")
    private String source;
    @C6593c(mo15949a = "tag_text")
    private String tagText;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "type")
    private int type;

    public String getAid() {
        return this.aid;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getCommentInfo() {
        return this.commentInfo;
    }

    public String getCommentNickName() {
        return this.commentNickName;
    }

    public long getCommentTime() {
        return this.commentTime;
    }

    public int getShowButtonNumber() {
        return this.showButtonNumber;
    }

    public String getSource() {
        return this.source;
    }

    public String getTagText() {
        return this.tagText;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public boolean isAdFake() {
        return this.isAdFake;
    }

    public CommentStruct setAdFake(boolean z) {
        this.isAdFake = z;
        return this;
    }

    public CommentStruct setAid(String str) {
        this.aid = str;
        return this;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public CommentStruct setAwemeRawAd(AwemeRawAd awemeRawAd2) {
        this.awemeRawAd = awemeRawAd2;
        return this;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCommentInfo(String str) {
        this.commentInfo = str;
    }

    public void setCommentNickName(String str) {
        this.commentNickName = str;
    }

    public void setCommentTime(long j) {
        this.commentTime = j;
    }

    public void setShowButtonNumber(int i) {
        this.showButtonNumber = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
