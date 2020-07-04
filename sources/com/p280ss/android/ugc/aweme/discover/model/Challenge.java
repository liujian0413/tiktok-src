package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.base.api.C6891b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1482c.C35739a;
import com.p280ss.android.ugc.aweme.utils.C43065do;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Challenge */
public class Challenge extends C23268a implements Serializable {
    @C6593c(mo15949a = "allow_upload_cover")
    public int allowUploadCover;
    @C6593c(mo15949a = "cha_attrs")
    public List<String> attrs;
    @C6593c(mo15949a = "author")
    public User author;
    @C6593c(mo15949a = "background_image_url")
    public UrlModel backgroundImageUrl;
    @C6593c(mo15949a = "category_cover_info")
    public CategoryCoverStruct categoryCover;
    @C6593c(mo15949a = "announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;
    @C6593c(mo15949a = "cover_photo")
    public String challengeBgUrl;
    @C6593c(mo15949a = "disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;
    @C6593c(mo15949a = "cha_name")
    public String challengeName;
    @C6593c(mo15949a = "hashtag_profile")
    public String challengeProfileUrl;
    @C6592b(mo15947a = C35739a.class)
    @C6593c(mo15949a = "sticker_detail")
    public String challengeStickerDetail;
    @C6891b
    @C6593c(mo15949a = "cid")
    public String cid;
    @C6593c(mo15949a = "collect_stat")
    public int collectStatus;
    @C6593c(mo15949a = "banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;
    @C6593c(mo15949a = "commerce_challenge_task")
    public CommerceChallengeTask commerceChallengeTask;
    @C6593c(mo15949a = "commerce_sub_type")
    public int commerceSubType = 0;
    @C6593c(mo15949a = "connect_music")
    public List<Music> connectMusics;
    @C6593c(mo15949a = "content_type")
    public int contentType;
    @C6593c(mo15949a = "cover_item")
    public UrlModel coverItem;
    @C6592b(mo15947a = C43065do.class)
    @C6593c(mo15949a = "desc")
    public String desc;
    @C6593c(mo15949a = "inquiry")
    public InquiryStruct inquiryStruct;
    @C6593c(mo15949a = "is_challenge")
    public int isChallenge;
    @C6593c(mo15949a = "is_commerce")
    public boolean isCommerceAndValid;
    @C6593c(mo15949a = "is_hot_search")
    public int isHotSearch;
    @C6593c(mo15949a = "link_action")
    public String linkAction;
    @C6593c(mo15949a = "link_text")
    public String linkText;
    @C6593c(mo15949a = "link_title")
    public String linkTitle;
    @C6593c(mo15949a = "link_type")
    public int linkType;
    @C6593c(mo15949a = "is_status")
    public int mStatus;
    @C6593c(mo15949a = "module_type")
    public int moduleType;
    @C6593c(mo15949a = "mv_id")
    public String mvId;
    @C6593c(mo15949a = "label_origin_author")
    public String originAuthor;
    @C6593c(mo15949a = "is_pgcshow")
    public boolean pgcshow;
    @C6593c(mo15949a = "profile_tag")
    public String profileTagUrl;
    @C6593c(mo15949a = "related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();
    public String requestId;
    @C6593c(mo15949a = "schema")
    public String schema;
    @C6593c(mo15949a = "share_info")
    public ShareInfo shareInfo;
    @C6593c(mo15949a = "show_items")
    public List<ShowItemsStruct> showItems;
    @C6593c(mo15949a = "spring_game_id")
    public String springGameId;
    @C6593c(mo15949a = "sticker_id")
    public String stickerId;
    @C6593c(mo15949a = "sub_type")
    public int subType;
    @C6593c(mo15949a = "tag")
    public int tag;
    @C6593c(mo15949a = "button")
    public ChallengeTransform transfrom;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "user_count")
    public int userCount;
    @C6593c(mo15949a = "view_count")
    public long viewCount = -1;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Challenge$ChallengeSubType */
    public interface ChallengeSubType {
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public CategoryCoverStruct getCategoryCover() {
        return this.categoryCover;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public CommerceChallengeTask getCommerceChallengeTask() {
        return this.commerceChallengeTask;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getSpringGameId() {
        return this.springGameId;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getTag() {
        return this.tag;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean allowUploadCover() {
        if (this.allowUploadCover == 1) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.isChallenge == 1) {
            return true;
        }
        return false;
    }

    public boolean isCommerce() {
        if (this.subType == 1) {
            return true;
        }
        return false;
    }

    public boolean isTrending() {
        if (this.isHotSearch == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.cid != null) {
            return this.cid.hashCode();
        }
        return 0;
    }

    public boolean isLinkActionAsOpenUrl() {
        if (this.linkType == 7) {
            return true;
        }
        return false;
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement2) {
        this.challengeAnnouncement = challengeAnnouncement2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setCommerceChallengeTask(CommerceChallengeTask commerceChallengeTask2) {
        this.commerceChallengeTask = commerceChallengeTask2;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Challenge) obj).cid);
    }
}
