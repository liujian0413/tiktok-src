package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.VideoModel.CoverType;
import com.bytedance.android.live.base.model.share.ShareSourceInfo;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p276a.C6593c;
import java.util.List;

public class Media implements C2358d {
    public static final int CELL_STYLE_A = 1;
    public static final int CELL_STYLE_B = 2;
    public static final int CELL_STYLE_C = 3;
    public static final int MEDIA_DETAIL_TYPE_AD = 1;
    public static final int MEDIA_DETAIL_TYPE_MEDIA = 0;
    @C6593c(mo15949a = "ad_info")
    private MediaAdInfo adInfo;
    @C6593c(mo15949a = "at_users")
    private List<TextExtraStruct> aiteUserItems;
    @C6593c(mo15949a = "allow_comment")
    private boolean allowComment;
    @C6593c(mo15949a = "allow_dislike")
    private boolean allowDislike;
    @C6593c(mo15949a = "allow_share")
    private boolean allowShare;
    private long apiTime;
    @C6593c(mo15949a = "author")
    private User author;
    @C6593c(mo15949a = "auto_play")
    private int autoPlay;
    @C6593c(mo15949a = "cell_height")
    private int cellHeight;
    @C6593c(mo15949a = "cell_style")
    private int cellStyle;
    @C6593c(mo15949a = "cell_width")
    private int cellWidth;
    @C6593c(mo15949a = "comment_delay")
    private int commentDelay;
    @C6593c(mo15949a = "comment_prompts")
    private String commentPrompts;
    @C6593c(mo15949a = "commerce")
    private C2355a commerce;
    @C6593c(mo15949a = "create_time")
    private long createTime;
    private long danmakuShowTime;
    @C6593c(mo15949a = "private_info")
    private MediaDebugInfo debugInfo;
    @C6593c(mo15949a = "description")
    private String description;
    @C6593c(mo15949a = "display_style")
    private int displayStyle;
    @C6593c(mo15949a = "enable_send_flame")
    private boolean enableSendFlame;
    @C6593c(mo15949a = "feed_tips")
    private String feedTips;
    @C6593c(mo15949a = "feed_tips_type")
    private int feedTipsType;
    @C6593c(mo15949a = "from_ad")
    private boolean fromAd;
    @C6593c(mo15949a = "guide_card_id")
    private int guideCardId;
    @C6593c(mo15949a = "has_free_flame")
    private boolean hasFreeFlame;
    @C6593c(mo15949a = "has_sync_aweme")
    private boolean hasSyncAweme;
    @C6593c(mo15949a = "hashtag")
    private C2357c hashTag;
    @C6593c(mo15949a = "hide_nickname")
    private boolean hideNickName;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f7727id;
    private boolean isDeleted;
    @C6593c(mo15949a = "is_rich")
    private int isRich;
    @C6593c(mo15949a = "stats")
    private MediaItemStats itemStats;
    @C6593c(mo15949a = "location")
    private String location;
    private int mDetailType;
    @C6593c(mo15949a = "mark")
    private VideoMark mark;
    @C6593c(mo15949a = "recommend_reason")
    private MediaRecommendReason mediaRecommendReason;
    @C6593c(mo15949a = "media_type")
    private int mediaType;
    @C6593c(mo15949a = "song")
    private C2359e music;
    @C6593c(mo15949a = "new_cell_style")
    private int newCellStyle;
    private boolean noNeedQuery;
    @C6593c(mo15949a = "position")
    private String position;
    @C6593c(mo15949a = "share_description")
    private String shareDesc;
    @C6593c(mo15949a = "share_enable")
    private boolean shareEnable;
    @C6593c(mo15949a = "share_prompts")
    private String sharePrompts;
    @C6593c(mo15949a = "share_source_info")
    private ShareSourceInfo shareSourceInfo;
    @C6593c(mo15949a = "share_strong_guide")
    private int shareStrongGuide;
    @C6593c(mo15949a = "share_text")
    private String shareText;
    @C6593c(mo15949a = "share_tips")
    private String shareTips;
    @C6593c(mo15949a = "share_title")
    private String shareTitle;
    @C6593c(mo15949a = "share_url")
    private String shareUrl;
    @C6593c(mo15949a = "status")
    private int status;
    @C6593c(mo15949a = "title")
    private String text;
    @C6593c(mo15949a = "tips")
    private String tips;
    @C6593c(mo15949a = "tips_url")
    private String tipsUrl;
    @C6593c(mo15949a = "user_bury")
    private int userBury;
    @C6593c(mo15949a = "user_digg")
    private int userDigg;
    @C6593c(mo15949a = "video")
    private VideoModel videoModel;
    @C6593c(mo15949a = "video_pic_num")
    private int videoPicNum;
    @C6593c(mo15949a = "weibo_share_title")
    private String weiboShareTitle;

    public MediaAdInfo getAdInfo() {
        return this.adInfo;
    }

    public List<TextExtraStruct> getAiteUserItems() {
        return this.aiteUserItems;
    }

    public long getApiTime() {
        return this.apiTime;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAutoPlay() {
        return this.autoPlay;
    }

    public int getCellHeight() {
        return this.cellHeight;
    }

    public int getCellStyle() {
        return this.cellStyle;
    }

    public int getCellWidth() {
        return this.cellWidth;
    }

    public int getCommentDelay() {
        return this.commentDelay;
    }

    public String getCommentPrompts() {
        return this.commentPrompts;
    }

    public C2355a getCommerce() {
        return this.commerce;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDanmakuShowTime() {
        return this.danmakuShowTime;
    }

    public MediaDebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDetailType() {
        return this.mDetailType;
    }

    public int getDisplayStyle() {
        return this.displayStyle;
    }

    public String getFeedTips() {
        return this.feedTips;
    }

    public int getFeedTipsType() {
        return this.feedTipsType;
    }

    public int getGuideCardId() {
        return this.guideCardId;
    }

    public C2357c getHashTag() {
        return this.hashTag;
    }

    public long getId() {
        return this.f7727id;
    }

    public int getIsRich() {
        return this.isRich;
    }

    public MediaItemStats getItemStats() {
        return this.itemStats;
    }

    public String getLocation() {
        return this.location;
    }

    public VideoMark getMark() {
        return this.mark;
    }

    public MediaRecommendReason getMediaRecommendReason() {
        return this.mediaRecommendReason;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public C2359e getMusic() {
        return this.music;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public String getPlayKey() {
        return null;
    }

    public String getPosition() {
        return this.position;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public boolean getShareEnable() {
        return this.shareEnable;
    }

    public String getSharePrompts() {
        return this.sharePrompts;
    }

    public ShareSourceInfo getShareSourceInfo() {
        return this.shareSourceInfo;
    }

    public int getShareStrongGuide() {
        return this.shareStrongGuide;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareTips() {
        return this.shareTips;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTipsUrl() {
        return this.tipsUrl;
    }

    public int getUserBury() {
        return this.userBury;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public int getVideoPicNum() {
        return this.videoPicNum;
    }

    public String getWeiboShareTitle() {
        return this.weiboShareTitle;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowDislike() {
        return this.allowDislike;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public boolean isEnableSendFlame() {
        return this.enableSendFlame;
    }

    public boolean isFromAd() {
        return this.fromAd;
    }

    public boolean isHasFreeFlame() {
        return this.hasFreeFlame;
    }

    public boolean isHasSyncAweme() {
        return this.hasSyncAweme;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isNativeAd() {
        return false;
    }

    public boolean isNoNeedQuery() {
        return this.noNeedQuery;
    }

    public boolean isShareEnable() {
        return this.shareEnable;
    }

    public String getAdStatus() {
        if (isNativeAd()) {
            return "ad";
        }
        if (isFromAd()) {
            return "normal";
        }
        return "";
    }

    public ImageModel getVideoCoverImage() {
        if (this.videoModel == null) {
            return null;
        }
        if (this.videoModel.getCoverType() != CoverType.MEDIUM) {
            return this.videoModel.getCoverModel();
        }
        return this.videoModel.getCoverMediumModel();
    }

    public boolean isBitRate() {
        if (getVideoModel() == null || getVideoModel().getQualityInfo() == null || getVideoModel().getQualityInfo().size() <= 1) {
            return false;
        }
        return true;
    }

    public void setAdInfo(MediaAdInfo mediaAdInfo) {
        this.adInfo = mediaAdInfo;
    }

    public void setAiteUserItems(List<TextExtraStruct> list) {
        this.aiteUserItems = list;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowDislike(boolean z) {
        this.allowDislike = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setApiTime(long j) {
        this.apiTime = j;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAutoPlay(int i) {
        this.autoPlay = i;
    }

    public void setCellHeight(int i) {
        this.cellHeight = i;
    }

    public void setCellWidth(int i) {
        this.cellWidth = i;
    }

    public void setCommentDelay(int i) {
        this.commentDelay = i;
    }

    public void setCommentPrompts(String str) {
        this.commentPrompts = str;
    }

    public void setCommerce(C2355a aVar) {
        this.commerce = aVar;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDanmakuShowTime(long j) {
        this.danmakuShowTime = j;
    }

    public void setDebugInfo(MediaDebugInfo mediaDebugInfo) {
        this.debugInfo = mediaDebugInfo;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailType(int i) {
        this.mDetailType = i;
    }

    public void setDisplayStyle(int i) {
        this.displayStyle = i;
    }

    public void setEnableSendFlame(boolean z) {
        this.enableSendFlame = z;
    }

    public void setFeedTips(String str) {
        this.feedTips = str;
    }

    public void setFeedTipsType(int i) {
        this.feedTipsType = i;
    }

    public void setFromAd(boolean z) {
        this.fromAd = z;
    }

    public void setGuideCardId(int i) {
        this.guideCardId = i;
    }

    public void setHasFreeFlame(boolean z) {
        this.hasFreeFlame = z;
    }

    public void setHasSyncAweme(boolean z) {
        this.hasSyncAweme = z;
    }

    public void setHashTag(C2357c cVar) {
        this.hashTag = cVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setId(long j) {
        this.f7727id = j;
    }

    public void setIsRich(int i) {
        this.isRich = i;
    }

    public void setItemStats(MediaItemStats mediaItemStats) {
        this.itemStats = mediaItemStats;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMark(VideoMark videoMark) {
        this.mark = videoMark;
    }

    public void setMediaRecommendReason(MediaRecommendReason mediaRecommendReason2) {
        this.mediaRecommendReason = mediaRecommendReason2;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public void setMusic(C2359e eVar) {
        this.music = eVar;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setNoNeedQuery(boolean z) {
        this.noNeedQuery = z;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareEnable(boolean z) {
        this.shareEnable = z;
    }

    public void setSharePrompts(String str) {
        this.sharePrompts = str;
    }

    public void setShareSourceInfo(ShareSourceInfo shareSourceInfo2) {
        this.shareSourceInfo = shareSourceInfo2;
    }

    public void setShareStrongGuide(int i) {
        this.shareStrongGuide = i;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTipsUrl(String str) {
        this.tipsUrl = str;
    }

    public void setUserBury(int i) {
        this.userBury = i;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideoModel(VideoModel videoModel2) {
        this.videoModel = videoModel2;
    }

    public void setVideoPicNum(int i) {
        this.videoPicNum = i;
    }

    public void setWeiboShareTitle(String str) {
        this.weiboShareTitle = str;
    }

    public void setCellStyle(int i) {
        if (!(i == 1 || i == 2 || i == 3)) {
            i = 1;
        }
        this.cellStyle = i;
    }

    public void updateItemStats(MediaItemStats mediaItemStats) {
        if (mediaItemStats != null) {
            if (this.itemStats == null) {
                this.itemStats = mediaItemStats;
                return;
            }
            this.itemStats.setCommentCount(mediaItemStats.getCommentCount());
            this.itemStats.setDiggCount(Math.max(mediaItemStats.getDiggCount(), this.itemStats.getDiggCount()));
            this.itemStats.setPlayCount(Math.max(mediaItemStats.getPlayCount(), this.itemStats.getPlayCount()));
            this.itemStats.setShareCount(Math.max(mediaItemStats.getShareCount(), this.itemStats.getShareCount()));
        }
    }

    public void update(Media media) {
        if (media != null && media.getId() == this.f7727id) {
            this.text = media.text;
            this.createTime = media.createTime;
            this.userDigg = media.userDigg;
            this.userBury = media.userBury;
            this.mediaType = media.mediaType;
            this.status = media.status;
            updateItemStats(media.itemStats);
            if (media.author != null) {
                this.author = media.author;
            }
            if (media.videoModel != null) {
                this.videoModel = media.videoModel;
            }
            this.shareUrl = media.shareUrl;
            this.shareTitle = media.shareTitle;
            this.shareDesc = media.shareDesc;
            this.shareEnable = media.shareEnable;
            this.allowShare = media.allowShare;
            this.allowComment = media.allowComment;
            this.allowDislike = media.allowDislike;
            this.cellStyle = media.cellStyle;
            this.tips = media.tips;
            this.tipsUrl = media.tipsUrl;
            if (media.debugInfo != null) {
                this.debugInfo = media.debugInfo;
            }
            if (media.mark != null) {
                this.mark = media.mark;
            }
            this.shareText = media.shareText;
            this.cellHeight = media.cellHeight;
            this.cellWidth = media.cellWidth;
            this.feedTipsType = media.feedTipsType;
            this.feedTips = media.feedTips;
            this.location = media.location;
            this.displayStyle = media.displayStyle;
            this.commentDelay = media.commentDelay;
            this.guideCardId = media.guideCardId;
            this.sharePrompts = media.sharePrompts;
            this.commentPrompts = media.commentPrompts;
            this.weiboShareTitle = media.weiboShareTitle;
            this.shareTips = media.shareTips;
            this.enableSendFlame = media.enableSendFlame;
            this.hideNickName = media.hideNickName;
            this.music = media.music;
            this.videoPicNum = media.videoPicNum;
            this.apiTime = media.getApiTime();
            this.noNeedQuery = media.noNeedQuery;
            if (media.commerce != null) {
                this.commerce = media.commerce;
            }
        }
    }
}
