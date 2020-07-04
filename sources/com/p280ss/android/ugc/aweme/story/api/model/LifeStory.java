package com.p280ss.android.ugc.aweme.story.api.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.story.api.model.redpackage.LifeActivity;
import com.p280ss.android.ugc.aweme.story.api.model.redpackage.ThirdPlatformInfo;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.LifeStory */
public class LifeStory implements Serializable {
    @C6593c(mo15949a = "author")
    User author;
    @C6593c(mo15949a = "author_user_id")
    long authorUserId;
    @C6593c(mo15949a = "aweme_type")
    int awemeType;
    @C6593c(mo15949a = "cmt_swt")
    boolean cmtSwt;
    @C6593c(mo15949a = "create_time")
    long createTime;
    @C6593c(mo15949a = "duration")
    int duration;
    @C6593c(mo15949a = "group_id")
    String groupId;
    @C6593c(mo15949a = "image_info")
    ImageInfo imageInfo;
    @C6593c(mo15949a = "interaction_stickers")
    List<InteractStickerStruct> interactStickerStructs;
    @C6593c(mo15949a = "label_large")
    UrlModel labelLarge;
    @C6593c(mo15949a = "label_thumb")
    UrlModel labelThumb;
    @C6593c(mo15949a = "life_activity_info")
    LifeActivity lifeActivityInfo;
    @C6593c(mo15949a = "share_url")
    String shareUrl;
    @C6593c(mo15949a = "stickers")
    String stickers;
    @C6593c(mo15949a = "story_id")
    String storyId;
    @C6593c(mo15949a = "third_platform_info")
    ThirdPlatformInfo thirdPlatformInfo;
    @C6593c(mo15949a = "video")
    Video video;

    public User getAuthor() {
        return this.author;
    }

    public long getAuthorUserId() {
        return this.authorUserId;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public LifeActivity getLifeActivityInfo() {
        return this.lifeActivityInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getStickers() {
        return this.stickers;
    }

    public String getStoryId() {
        return this.storyId;
    }

    public ThirdPlatformInfo getThirdPlatformInfo() {
        return this.thirdPlatformInfo;
    }

    public Video getVideo() {
        return this.video;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAuthorUserId(long j) {
        this.authorUserId = j;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setImageInfo(ImageInfo imageInfo2) {
        this.imageInfo = imageInfo2;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLifeActivityInfo(LifeActivity lifeActivity) {
        this.lifeActivityInfo = lifeActivity;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStickers(String str) {
        this.stickers = str;
    }

    public void setStoryId(String str) {
        this.storyId = str;
    }

    public void setThirdPlatformInfo(ThirdPlatformInfo thirdPlatformInfo2) {
        this.thirdPlatformInfo = thirdPlatformInfo2;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }
}
