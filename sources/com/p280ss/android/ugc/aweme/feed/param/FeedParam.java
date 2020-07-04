package com.p280ss.android.ugc.aweme.feed.param;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.param.FeedParam */
public class FeedParam implements Serializable {
    private String accountType;
    private String activityId;
    private String aid;
    private String backendType;
    private String cardType;
    private String carrierType;
    private int cellDetailType;
    private String cellId;
    private String challengeId;
    private String challengeProfileFrom;
    private int channelId;
    private String cid;
    private String cityCode;
    private int commentDeleted;
    private boolean commentForceOpenReply;
    private String contentSource;
    private int count;
    private String creationId;
    private String curPoiLat;
    private String curPoiLng;
    private int cursor;
    private String dataType;
    private String districtCode;
    private String enterFromRequestId;
    private String enterMethodValue = "click";
    private String eventType;
    private String feedsAwemeId;
    private String from;
    private boolean fromAdsActivity;
    private String fromGroupId;
    private String hashTagName;
    private String hotEnterMethod;
    private String hotSearch;
    private String ids;
    private int index;
    private boolean isAdSpot;
    private boolean isChain;
    private boolean isFromHotSearchRanking;
    private boolean isFromPostList;
    private boolean isHotSearch;
    private boolean isMyProfile;
    private boolean isRecommend;
    private Boolean isTrending;
    private String itemIdList;
    private int level1CommentDeleted;
    private String likeEnterMethod;
    private Object mObject;
    private String microAppId;
    private String mixFromOrder;
    private String musicId;
    private String mvId;
    private String newSourceId;
    private String newSourceType;
    private String objectId;
    private String outAwemeId;
    private String pagePoiId;
    private int pageSize;
    private int pageType;
    private int poiClassCode;
    private String poiId;
    private String poiTabType;
    private String previousPage;
    private String previousPagePosition = "other_places";
    private String processId;
    private String productId;
    private String promotionId;
    private String pushParams;
    private String queryAwemeMode;
    private String reactSessionId;
    private String referCommodityId;
    private String referSeedId;
    private String referSeedName;
    private String relatedId;
    private String searchKeyword;
    private String shareUserId;
    private boolean showCommentAfterOpen;
    private boolean showPoiNews;
    private boolean showShareAfterOpen;
    private boolean showVideoRank;
    private boolean showVote;
    private String spuId;
    private String stickerId;
    private Long streetAwemeId;
    private String streetId;
    private double streetLatitude;
    private double streetLongitude;
    private String streetName;
    private String subClass;
    private String tabName;
    private String tabText;
    private int taskType;
    private String topCommentId;
    private String tracker;
    private String tutorialId;
    private int type;
    private String uid;
    private long videoCurrentPosition;
    private int videoType;

    public String getAccountType() {
        return this.accountType;
    }

    public String getActivityId() {
        return this.activityId;
    }

    public String getAid() {
        return this.aid;
    }

    public String getBackendType() {
        return this.backendType;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCarrierType() {
        return this.carrierType;
    }

    public int getCellDetailType() {
        return this.cellDetailType;
    }

    public String getCellId() {
        return this.cellId;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public String getChallengeProfileFrom() {
        return this.challengeProfileFrom;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public String getCid() {
        return this.cid;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public int getCommentDeleted() {
        return this.commentDeleted;
    }

    public String getContentSource() {
        return this.contentSource;
    }

    public int getCount() {
        return this.count;
    }

    public String getCreationId() {
        return this.creationId;
    }

    public String getCurPoiLat() {
        return this.curPoiLat;
    }

    public String getCurPoiLng() {
        return this.curPoiLng;
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getDistrictCode() {
        return this.districtCode;
    }

    public String getEnterFromRequestId() {
        return this.enterFromRequestId;
    }

    public String getEnterMethodValue() {
        return this.enterMethodValue;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getFeedsAwemeId() {
        return this.feedsAwemeId;
    }

    public String getFrom() {
        return this.from;
    }

    public String getFromGroupId() {
        return this.fromGroupId;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public String getHotEnterMethod() {
        return this.hotEnterMethod;
    }

    public String getHotSearch() {
        return this.hotSearch;
    }

    public String getIds() {
        return this.ids;
    }

    public int getIndex() {
        return this.index;
    }

    public String getItemIdList() {
        return this.itemIdList;
    }

    public int getLevel1CommentDeleted() {
        return this.level1CommentDeleted;
    }

    public String getLikeEnterMethod() {
        return this.likeEnterMethod;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMixFromOrder() {
        return this.mixFromOrder;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getNewSourceId() {
        return this.newSourceId;
    }

    public String getNewSourceType() {
        return this.newSourceType;
    }

    public Object getObject() {
        return this.mObject;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getOutAwemeId() {
        return this.outAwemeId;
    }

    public String getPagePoiId() {
        return this.pagePoiId;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPageType() {
        return this.pageType;
    }

    public int getPoiClassCode() {
        return this.poiClassCode;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiTabType() {
        return this.poiTabType;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public String getPreviousPagePosition() {
        return this.previousPagePosition;
    }

    public String getProcessId() {
        return this.processId;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getPushParams() {
        return this.pushParams;
    }

    public String getQueryAwemeMode() {
        return this.queryAwemeMode;
    }

    public String getReactSessionId() {
        return this.reactSessionId;
    }

    public String getReferCommodityId() {
        return this.referCommodityId;
    }

    public String getReferSeedId() {
        return this.referSeedId;
    }

    public String getReferSeedName() {
        return this.referSeedName;
    }

    public String getRelatedId() {
        return this.relatedId;
    }

    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public String getShareUserId() {
        return this.shareUserId;
    }

    public String getSpuId() {
        return this.spuId;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public Long getStreetAwemeId() {
        return this.streetAwemeId;
    }

    public String getStreetId() {
        return this.streetId;
    }

    public double getStreetLatitude() {
        return this.streetLatitude;
    }

    public double getStreetLongitude() {
        return this.streetLongitude;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getSubClass() {
        return this.subClass;
    }

    public String getTabName() {
        return this.tabName;
    }

    public String getTabText() {
        return this.tabText;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public String getTopCommentId() {
        return this.topCommentId;
    }

    public String getTracker() {
        return this.tracker;
    }

    public Boolean getTrending() {
        return this.isTrending;
    }

    public String getTutorialId() {
        return this.tutorialId;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public long getVideoCurrentPosition() {
        return this.videoCurrentPosition;
    }

    public int getVideoType() {
        return this.videoType;
    }

    public boolean isAdSpot() {
        return this.isAdSpot;
    }

    public boolean isChain() {
        return this.isChain;
    }

    public boolean isCommentForceOpenReply() {
        return this.commentForceOpenReply;
    }

    public boolean isFromAdsActivity() {
        return this.fromAdsActivity;
    }

    public boolean isFromHotSearchRanking() {
        return this.isFromHotSearchRanking;
    }

    public boolean isFromPostList() {
        return this.isFromPostList;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public boolean isRecommend() {
        return this.isRecommend;
    }

    public boolean isShowCommentAfterOpen() {
        return this.showCommentAfterOpen;
    }

    public boolean isShowPoiNews() {
        return this.showPoiNews;
    }

    public boolean isShowShareAfterOpen() {
        return this.showShareAfterOpen;
    }

    public boolean isShowVideoRank() {
        return this.showVideoRank;
    }

    public boolean isShowVote() {
        return this.showVote;
    }

    public boolean hasTask() {
        if (this.taskType != 0) {
            return true;
        }
        return false;
    }

    public boolean isHotSpot() {
        if (!TextUtils.isEmpty(this.hotSearch) || this.isFromHotSearchRanking) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedParam{aid='");
        sb.append(this.aid);
        sb.append('\'');
        sb.append(", ids='");
        sb.append(this.ids);
        sb.append('\'');
        sb.append(", from='");
        sb.append(this.from);
        sb.append('\'');
        sb.append(", cid='");
        sb.append(this.cid);
        sb.append('\'');
        sb.append(", poiId='");
        sb.append(this.poiId);
        sb.append('\'');
        sb.append(", enterFromRequestId='");
        sb.append(this.enterFromRequestId);
        sb.append('\'');
        sb.append(", previousPage='");
        sb.append(this.previousPage);
        sb.append('\'');
        sb.append(", isMyProfile=");
        sb.append(this.isMyProfile);
        sb.append(", isFromPostList=");
        sb.append(this.isFromPostList);
        sb.append(", shareUserId='");
        sb.append(this.shareUserId);
        sb.append('\'');
        sb.append(", challengeProfileFrom='");
        sb.append(this.challengeProfileFrom);
        sb.append('\'');
        sb.append(", likeEnterMethod='");
        sb.append(this.likeEnterMethod);
        sb.append('\'');
        sb.append(", contentSource='");
        sb.append(this.contentSource);
        sb.append('\'');
        sb.append(", previousPagePosition='");
        sb.append(this.previousPagePosition);
        sb.append('\'');
        sb.append(", searchKeyword='");
        sb.append(this.searchKeyword);
        sb.append('\'');
        sb.append(", pageType=");
        sb.append(this.pageType);
        sb.append(", eventType='");
        sb.append(this.eventType);
        sb.append('\'');
        sb.append(", uid='");
        sb.append(this.uid);
        sb.append('\'');
        sb.append(", musicId='");
        sb.append(this.musicId);
        sb.append('\'');
        sb.append(", challengeId='");
        sb.append(this.challengeId);
        sb.append('\'');
        sb.append(", enterMethodValue='");
        sb.append(this.enterMethodValue);
        sb.append('\'');
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", queryAwemeMode='");
        sb.append(this.queryAwemeMode);
        sb.append('\'');
        sb.append(", accountType='");
        sb.append(this.accountType);
        sb.append('\'');
        sb.append(", tabName='");
        sb.append(this.tabName);
        sb.append('\'');
        sb.append(", pushParams='");
        sb.append(this.pushParams);
        sb.append('\'');
        sb.append(", promotionId='");
        sb.append(this.promotionId);
        sb.append('\'');
        sb.append(", productId='");
        sb.append(this.productId);
        sb.append('\'');
        sb.append(", relatedId='");
        sb.append(this.relatedId);
        sb.append('\'');
        sb.append(", videoCurrentPosition='");
        sb.append(this.videoCurrentPosition);
        sb.append('\'');
        sb.append(", activityId='");
        sb.append(this.activityId);
        sb.append('\'');
        sb.append(", newSourceType='");
        sb.append(this.newSourceType);
        sb.append('\'');
        sb.append(", newSourceId='");
        sb.append(this.newSourceId);
        sb.append('\'');
        sb.append(", reactSessionId='");
        sb.append(this.reactSessionId);
        sb.append('\'');
        sb.append(", carrierType='");
        sb.append(this.carrierType);
        sb.append('\'');
        sb.append(", referSeedId='");
        sb.append(this.referSeedId);
        sb.append('\'');
        sb.append(", referSeedName='");
        sb.append(this.referSeedName);
        sb.append('\'');
        sb.append(", dataType='");
        sb.append(this.dataType);
        sb.append('\'');
        sb.append(", backendType='");
        sb.append(this.backendType);
        sb.append('\'');
        sb.append(", streetId='");
        sb.append(this.streetId);
        sb.append('\'');
        sb.append(", commentForceOpenReply='");
        sb.append(this.commentForceOpenReply);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public FeedParam setAccountType(String str) {
        this.accountType = str;
        return this;
    }

    public FeedParam setActivityId(String str) {
        this.activityId = str;
        return this;
    }

    public FeedParam setAdSpot(boolean z) {
        this.isAdSpot = z;
        return this;
    }

    public FeedParam setAid(String str) {
        this.aid = str;
        return this;
    }

    public FeedParam setBackendType(String str) {
        this.backendType = str;
        return this;
    }

    public FeedParam setCardType(String str) {
        this.cardType = str;
        return this;
    }

    public FeedParam setCarrierType(String str) {
        this.carrierType = str;
        return this;
    }

    public FeedParam setCellDetailType(int i) {
        this.cellDetailType = i;
        return this;
    }

    public FeedParam setCellId(String str) {
        this.cellId = str;
        return this;
    }

    public FeedParam setChain(boolean z) {
        this.isChain = z;
        return this;
    }

    public FeedParam setChallengeId(String str) {
        this.challengeId = str;
        return this;
    }

    public FeedParam setChallengeProfileFrom(String str) {
        this.challengeProfileFrom = str;
        return this;
    }

    public FeedParam setChannelId(int i) {
        this.channelId = i;
        return this;
    }

    public FeedParam setCid(String str) {
        this.cid = str;
        return this;
    }

    public FeedParam setCityCode(String str) {
        this.cityCode = str;
        return this;
    }

    public FeedParam setCommentDeleted(int i) {
        this.commentDeleted = i;
        return this;
    }

    public FeedParam setCommentForceOpenReply(boolean z) {
        this.commentForceOpenReply = z;
        return this;
    }

    public FeedParam setContentSource(String str) {
        this.contentSource = str;
        return this;
    }

    public FeedParam setCount(int i) {
        this.count = i;
        return this;
    }

    public FeedParam setCreationId(String str) {
        this.creationId = str;
        return this;
    }

    public FeedParam setCurPoiLat(String str) {
        this.curPoiLat = str;
        return this;
    }

    public FeedParam setCurPoiLng(String str) {
        this.curPoiLng = str;
        return this;
    }

    public FeedParam setCursor(int i) {
        this.cursor = i;
        return this;
    }

    public FeedParam setDataType(String str) {
        this.dataType = str;
        return this;
    }

    public FeedParam setDistrictCode(String str) {
        this.districtCode = str;
        return this;
    }

    public FeedParam setEnterFromRequestId(String str) {
        this.enterFromRequestId = str;
        return this;
    }

    public FeedParam setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public FeedParam setFeedsAwemeId(String str) {
        this.feedsAwemeId = str;
        return this;
    }

    public FeedParam setFrom(String str) {
        this.from = str;
        return this;
    }

    public FeedParam setFromAdsActivity(boolean z) {
        this.fromAdsActivity = z;
        return this;
    }

    public FeedParam setFromGroupId(String str) {
        this.fromGroupId = str;
        return this;
    }

    public FeedParam setFromHotSearchRanking(boolean z) {
        this.isFromHotSearchRanking = z;
        return this;
    }

    public FeedParam setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public FeedParam setHashTagName(String str) {
        this.hashTagName = str;
        return this;
    }

    public FeedParam setHotEnterMethod(String str) {
        this.hotEnterMethod = str;
        return this;
    }

    public FeedParam setHotSearch(String str) {
        this.hotSearch = str;
        return this;
    }

    public FeedParam setIds(String str) {
        this.ids = str;
        return this;
    }

    public FeedParam setIndex(int i) {
        this.index = i;
        return this;
    }

    public FeedParam setItemIdList(String str) {
        this.itemIdList = str;
        return this;
    }

    public FeedParam setLevel1CommentDeleted(int i) {
        this.level1CommentDeleted = i;
        return this;
    }

    public FeedParam setLikeEnterMethod(String str) {
        this.likeEnterMethod = str;
        return this;
    }

    public FeedParam setMicroAppId(String str) {
        this.microAppId = str;
        return this;
    }

    public FeedParam setMixFromOrder(String str) {
        this.mixFromOrder = str;
        return this;
    }

    public FeedParam setMusicId(String str) {
        this.musicId = str;
        return this;
    }

    public FeedParam setMvId(String str) {
        this.mvId = str;
        return this;
    }

    public FeedParam setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public FeedParam setNewSourceId(String str) {
        this.newSourceId = str;
        return this;
    }

    public FeedParam setNewSourceType(String str) {
        this.newSourceType = str;
        return this;
    }

    public FeedParam setObject(Object obj) {
        this.mObject = obj;
        return this;
    }

    public FeedParam setObjectId(String str) {
        this.objectId = str;
        return this;
    }

    public FeedParam setOutAwemeId(String str) {
        this.outAwemeId = str;
        return this;
    }

    public FeedParam setPagePoiId(String str) {
        this.pagePoiId = str;
        return this;
    }

    public FeedParam setPageSize(int i) {
        this.pageSize = i;
        return this;
    }

    public FeedParam setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public FeedParam setPoiClassCode(int i) {
        this.poiClassCode = i;
        return this;
    }

    public FeedParam setPoiId(String str) {
        this.poiId = str;
        return this;
    }

    public FeedParam setPoiTabType(String str) {
        this.poiTabType = str;
        return this;
    }

    public FeedParam setPreviousPage(String str) {
        this.previousPage = str;
        return this;
    }

    public FeedParam setPreviousPagePosition(String str) {
        this.previousPagePosition = str;
        return this;
    }

    public FeedParam setProcessId(String str) {
        this.processId = str;
        return this;
    }

    public FeedParam setProductId(String str) {
        this.productId = str;
        return this;
    }

    public FeedParam setPromotionId(String str) {
        this.promotionId = str;
        return this;
    }

    public FeedParam setPushParams(String str) {
        this.pushParams = str;
        return this;
    }

    public FeedParam setQueryAwemeMode(String str) {
        this.queryAwemeMode = str;
        return this;
    }

    public FeedParam setReactSessionId(String str) {
        this.reactSessionId = str;
        return this;
    }

    public FeedParam setRecommend(boolean z) {
        this.isRecommend = z;
        return this;
    }

    public FeedParam setReferCommodityId(String str) {
        this.referCommodityId = str;
        return this;
    }

    public FeedParam setReferSeedId(String str) {
        this.referSeedId = str;
        return this;
    }

    public FeedParam setReferSeedName(String str) {
        this.referSeedName = str;
        return this;
    }

    public FeedParam setRelatedId(String str) {
        this.relatedId = str;
        return this;
    }

    public FeedParam setSearchKeyword(String str) {
        this.searchKeyword = str;
        return this;
    }

    public FeedParam setShareUserId(String str) {
        this.shareUserId = str;
        return this;
    }

    public FeedParam setShowCommentAfterOpen(boolean z) {
        this.showCommentAfterOpen = z;
        return this;
    }

    public FeedParam setShowPoiNews(boolean z) {
        this.showPoiNews = z;
        return this;
    }

    public FeedParam setShowShareAfterOpen(boolean z) {
        this.showShareAfterOpen = z;
        return this;
    }

    public FeedParam setShowVideoRank(boolean z) {
        this.showVideoRank = z;
        return this;
    }

    public FeedParam setShowVote(boolean z) {
        this.showVote = z;
        return this;
    }

    public FeedParam setSpuId(String str) {
        this.spuId = str;
        return this;
    }

    public FeedParam setStickerId(String str) {
        this.stickerId = str;
        return this;
    }

    public FeedParam setStreetAwemeId(Long l) {
        this.streetAwemeId = l;
        return this;
    }

    public FeedParam setStreetId(String str) {
        this.streetId = str;
        return this;
    }

    public FeedParam setStreetLatitude(double d) {
        this.streetLatitude = d;
        return this;
    }

    public FeedParam setStreetLongitude(double d) {
        this.streetLongitude = d;
        return this;
    }

    public FeedParam setStreetName(String str) {
        this.streetName = str;
        return this;
    }

    public FeedParam setSubClass(String str) {
        this.subClass = str;
        return this;
    }

    public FeedParam setTabName(String str) {
        this.tabName = str;
        return this;
    }

    public FeedParam setTabText(String str) {
        this.tabText = str;
        return this;
    }

    public FeedParam setTaskType(int i) {
        this.taskType = i;
        return this;
    }

    public FeedParam setTopCommentId(String str) {
        this.topCommentId = str;
        return this;
    }

    public FeedParam setTracker(String str) {
        this.tracker = str;
        return this;
    }

    public FeedParam setTrending(Boolean bool) {
        this.isTrending = bool;
        return this;
    }

    public FeedParam setTutorialId(String str) {
        this.tutorialId = str;
        return this;
    }

    public FeedParam setType(int i) {
        this.type = i;
        return this;
    }

    public FeedParam setUid(String str) {
        this.uid = str;
        return this;
    }

    public FeedParam setVideoCurrentPosition(long j) {
        this.videoCurrentPosition = j;
        return this;
    }

    public FeedParam setVideoType(int i) {
        this.videoType = i;
        return this;
    }

    public FeedParam setEnterMethodValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.enterMethodValue = str;
        }
        return this;
    }
}
