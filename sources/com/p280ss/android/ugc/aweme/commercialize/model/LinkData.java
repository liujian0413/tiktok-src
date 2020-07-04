package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.LinkData */
public class LinkData implements Serializable {
    @C6593c(mo15949a = "avatar_icon")
    public UrlModel avatarIcon;
    @C6593c(mo15949a = "background_type")
    public int backgroundType;
    @C6593c(mo15949a = "button_style")
    public int buttonStyle;
    @C6593c(mo15949a = "button_text")
    public String buttonText;
    @C6593c(mo15949a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @C6593c(mo15949a = "comment_area")
    public CommentStruct commentArea;
    @C6593c(mo15949a = "creative_id")
    public String creativeId;
    @C6593c(mo15949a = "description")
    public String description;
    @C6593c(mo15949a = "download_url")
    public String downloadUrl;
    @C6593c(mo15949a = "feed_show_type")
    public int feedShowType;
    public boolean hasDislike;
    @C6593c(mo15949a = "image_list")
    List<UrlModel> imageList;
    @C6593c(mo15949a = "is_preview")
    public boolean isPreview;
    @C6593c(mo15949a = "label")
    public String label;
    @C6593c(mo15949a = "label_type")
    public int labelType;
    public int linkType;
    @C6593c(mo15949a = "log_extra")
    public String logExtra;
    private User mUser;
    @C6593c(mo15949a = "mp_url")
    public String mpUrl;
    @C6593c(mo15949a = "open_url")
    public String openUrl;
    @C6593c(mo15949a = "package")
    public String packageName;
    @C6593c(mo15949a = "report_enable")
    public boolean reportEnabled = true;
    @C6593c(mo15949a = "show_close_tips")
    public boolean showCloseTips;
    @C6593c(mo15949a = "show_type")
    public int showType;
    @C6593c(mo15949a = "source")
    public String source;
    @C6593c(mo15949a = "tips_schema")
    public String tipsSchema;
    @C6593c(mo15949a = "tips_text")
    public String tipsText;
    @C6593c(mo15949a = "tips_type")
    public int tipsType;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "track_url_list")
    public UrlModel trackUrlList;
    @C6593c(mo15949a = "type")
    public String type;
    @C6593c(mo15949a = "web_title")
    public String webTitle;
    @C6593c(mo15949a = "web_url")
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.LinkData$CommentStruct */
    public static class CommentStruct implements Serializable {
        @C6593c(mo15949a = "avatar_icon")
        public UrlModel avatarIcon;
        @C6593c(mo15949a = "feature_label")
        public String featureLabel;
        @C6593c(mo15949a = "title")
        public String title;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public User getUser() {
        return this.mUser;
    }

    public boolean isHasDislike() {
        return this.hasDislike;
    }

    public boolean showOnFeed() {
        if (this.showType == 0 || this.showType == 1) {
            return true;
        }
        return false;
    }

    public UrlModel getCommentAvatarIcon() {
        if (this.commentArea == null || this.commentArea.avatarIcon == null) {
            return this.avatarIcon;
        }
        return this.commentArea.avatarIcon;
    }

    public boolean showOnComment() {
        if ((this.showType != 0 && this.showType != 2) || this.commentArea == null || this.commentArea.title == null || this.commentArea.featureLabel == null) {
            return false;
        }
        return true;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setHasDislike(boolean z) {
        this.hasDislike = z;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setUser(User user) {
        this.mUser = user;
    }
}
