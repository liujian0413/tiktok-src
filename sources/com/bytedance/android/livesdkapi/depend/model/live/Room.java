package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.C2343f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.google.gson.p276a.C6593c;
import java.util.List;
import java.util.Map;

public class Room implements C2343f {
    public static final int ROOM_FINISH = 4;
    public static final int ROOM_FINISH_REASON_FORCE_FINISH_OF_ILLEGAL = 8;
    public static final int ROOM_FINISH_REASON_NORMAL = 1;
    public static final int ROOM_FINISH_REASON_STREAM_PUSH_FAILED = 6;
    public static final int ROOM_PAUSE = 3;
    public static final int ROOM_PLAYING = 2;
    public static final int ROOM_PREPARE = 1;
    public static final long ROOM_TYPE_KOI_ACTIVITY = 3;
    public static final long ROOM_TYPE_NORMAL = 0;
    public static final long ROOM_TYPE_OFFICIAL_ACTIVITY = 1;
    public static final long ROOM_TYPE_STAR_ACTIVITY = 2;
    public static final long USER_FROM_FOLLOW = 2;
    public static final long USER_FROM_LIVE_FEED_FOLLOW = 2001;
    public static final long USER_FROM_PROFILE = 3;
    public static final long USER_FROM_PUSH = 4;
    public static final long USER_FROM_RECOMMEND = 1;
    public static final long USER_FROM_TIMELINE = 0;
    public static final long USER_FROM_WEB = 5;
    @C6593c(mo15949a = "admin_user_ids")
    List<Long> adminUserIds;
    @C6593c(mo15949a = "anchor_share_text")
    String anchorShareText;
    @C6593c(mo15949a = "background")
    public ImageModel background;
    @C6593c(mo15949a = "burst")
    C9365h burstInfo;
    @C6593c(mo15949a = "cell_style")
    long cellStyle;
    @C6593c(mo15949a = "client_version")
    String clientVersion;
    @C6593c(mo15949a = "cover")
    ImageModel cover;
    @C6593c(mo15949a = "create_time")
    long createTime;
    @C6593c(mo15949a = "sun_daily_icon_content")
    String dailyRankContent;
    @C6593c(mo15949a = "deco_list")
    List<C9379p> decorationList;
    @C6593c(mo15949a = "distance")
    String distance;
    @C6593c(mo15949a = "distance_city")
    String distanceCity;
    @C6593c(mo15949a = "distance_km")
    String distanceKm;
    @C6593c(mo15949a = "dynamic_cover")
    ImageModel dynamicCover;
    @C6593c(mo15949a = "dynamic_cover_dict")
    Map<Long, String> dynamicCoverDict;
    @C6593c(mo15949a = "dynamic_cover_low")
    ImageModel dynamicCoverLow;
    @C6593c(mo15949a = "dynamic_cover_uri")
    String dynamicCoverUri;
    @C6593c(mo15949a = "enable_room_perspective")
    boolean enableRoomPerspective;
    @C6593c(mo15949a = "feed_room_label")
    ImageModel feedRoomLabel;
    @C6593c(mo15949a = "finish_time")
    long finishTime;
    @C6593c(mo15949a = "finish_url")
    public String finish_url;
    @C6593c(mo15949a = "gift_msg_style")
    public int giftMessageStyle;
    @C6593c(mo15949a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @C6593c(mo15949a = "health_score")
    C9387w healthScoreInfo;
    @C6593c(mo15949a = "hide_nickname")
    boolean hideNickName;
    @C6593c(mo15949a = "hide_status_tag")
    boolean hideStatusTag;
    @C6593c(mo15949a = "hide_title")
    boolean hideTitle;
    @C6593c(mo15949a = "hide_user_count")
    boolean hideUserCount;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    long f25600id;
    @C6593c(mo15949a = "id_str")
    String idStr;
    @C6593c(mo15949a = "introduction")
    public String introduction;
    public boolean isDouPlusPromotion;
    public boolean isFromRecommendCard;
    @C6593c(mo15949a = "is_replay")
    public boolean isReplay;
    @C6593c(mo15949a = "live_type_screenshot")
    public boolean isScreenshot;
    @C6593c(mo15949a = "live_type_third_party")
    public boolean isThirdParty;
    @C6593c(mo15949a = "common_label_list")
    String labels;
    @C6593c(mo15949a = "last_ping_time")
    long lastPingTime;
    @C6593c(mo15949a = "layout")
    public long layout;
    @C6593c(mo15949a = "link_mic")
    C9380q linkMicInfoGson;
    @C6593c(mo15949a = "linkmic_layout")
    long linkMicLayout;
    private transient int linkmicLayout;
    @C6593c(mo15949a = "live_id")
    long liveId;
    @C6593c(mo15949a = "live_type_audio")
    boolean liveTypeAudio;
    @C6593c(mo15949a = "live_type_linkmic")
    boolean liveTypeLinkmic;
    @C6593c(mo15949a = "live_type_normal")
    boolean liveTypeNormal;
    @C6593c(mo15949a = "live_type_sandbox")
    boolean liveTypeSandbox;
    @C6593c(mo15949a = "living_room_attrs")
    C9382s livingRoomAttrs;
    @C6593c(mo15949a = "location")
    String location;
    private String logPb;
    @C6593c(mo15949a = "group_id")
    public long mGroupId;
    @C6593c(mo15949a = "group_source")
    public int mGroupSource;
    @C6593c(mo15949a = "guide_button")
    public ImageModel mGuideButton;
    @C6593c(mo15949a = "lottery_finish_time")
    public long mLotteryFinishTime;
    @C6593c(mo15949a = "activity_tag")
    public C9372l mPlayTagInfo;
    @C6593c(mo15949a = "portrait_cover")
    public ImageModel mPortraitCover;
    @C6593c(mo15949a = "preview_copy")
    public String mPreviewCopy;
    private String mRequestId;
    @C6593c(mo15949a = "room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    @C6593c(mo15949a = "room_tabs")
    public List<C9381r> mRoomTabs;
    private long mUserFrom;
    @C6593c(mo15949a = "wait_copy")
    public String mWaitCopy;
    @C6593c(mo15949a = "match_info")
    public C9373m matchInfo;
    @C6593c(mo15949a = "message")
    public String message;
    @C6593c(mo15949a = "mosaic_status")
    int mosaicStatus;
    @C6593c(mo15949a = "mosaic_tip")
    String mosaicTip;
    @C6593c(mo15949a = "new_cell_style")
    int newCellStyle;
    public long nowTime;
    @C6593c(mo15949a = "official_room_info")
    public C9378o officialRoomInfo;
    @C6593c(mo15949a = "orientation")
    int orientation;
    @C6593c(mo15949a = "owner")
    User owner;
    @C6593c(mo15949a = "owner_user_id")
    long ownerUserId;
    @C6593c(mo15949a = "os_type")
    int platform;
    @C6593c(mo15949a = "popularity")
    public long popularity;
    @C6593c(mo15949a = "popularity_str")
    public String popularityStr;
    @C6593c(mo15949a = "private_info")
    String privateInfo;
    @C6593c(mo15949a = "prompts")
    public String prompts;
    @C6593c(mo15949a = "real_distance")
    String realDistance;
    @C6593c(mo15949a = "luckymoney_num")
    public int redEnvelopeNumber;
    @C6593c(mo15949a = "share_url")
    String shareUrl;
    @C6593c(mo15949a = "is_show_inquiry_ball")
    public boolean showInquiryBall;
    @C6593c(mo15949a = "source_type")
    String sourceType;
    @C6593c(mo15949a = "stats")
    RoomStats stats;
    @C6593c(mo15949a = "status")
    int status;
    @C6593c(mo15949a = "stream_id")
    long streamId;
    @C6593c(mo15949a = "stream_id_str")
    String streamIdStr;
    @C6593c(mo15949a = "stream_provider")
    long streamProvider;
    @C6593c(mo15949a = "stream_url")
    StreamUrl streamUrl;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "top_fans")
    List<C9385u> topFanTickets;
    @C6593c(mo15949a = "top_users")
    List<User> topUsers;
    @C6593c(mo15949a = "use_filter")
    public boolean unusedEffect;
    @C6593c(mo15949a = "user_count")
    int userCount;
    @C6593c(mo15949a = "user_share_text")
    String userShareText;
    @C6593c(mo15949a = "vid")
    public String vid;
    @C6593c(mo15949a = "with_linkmic")
    boolean withLinkMic;

    public IUser author() {
        return this.owner;
    }

    public ImageModel cover() {
        return this.cover;
    }

    public List<Long> getAdminUserIds() {
        return this.adminUserIds;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public C9365h getBurstInfo() {
        return this.burstInfo;
    }

    public long getCellStyle() {
        return this.cellStyle;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDailyRankContent() {
        return this.dailyRankContent;
    }

    public List<C9379p> getDecorationList() {
        return this.decorationList;
    }

    public List<Object> getDislikeReason() {
        return null;
    }

    public String getDistance() {
        return this.distance;
    }

    public String getDistanceCity() {
        return this.distanceCity;
    }

    public String getDistanceKm() {
        return this.distanceKm;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public Map<Long, String> getDynamicCoverDict() {
        return this.dynamicCoverDict;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public String getDynamicCoverUri() {
        return this.dynamicCoverUri;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public C9387w getHealthScoreInfo() {
        return this.healthScoreInfo;
    }

    public long getId() {
        return this.f25600id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLastPingTime() {
        return this.lastPingTime;
    }

    public C9380q getLinkMicInfo() {
        return this.linkMicInfoGson;
    }

    public long getLinkMicLayout() {
        return this.linkMicLayout;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public C9382s getLivingRoomAttrs() {
        return this.livingRoomAttrs;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public String getMosaicTip() {
        return this.mosaicTip;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public String getRealDistance() {
        return this.realDistance;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public String getStreamIdStr() {
        return this.streamIdStr;
    }

    public long getStreamProvider() {
        return this.streamProvider;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<C9385u> getTopFanTickets() {
        return this.topFanTickets;
    }

    public List<User> getTopUsers() {
        return this.topUsers;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public String getVideoUrl() {
        return "";
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isEnableRoomPerspective() {
        return this.enableRoomPerspective;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isHideStatusTag() {
        return this.hideStatusTag;
    }

    public boolean isHideTitle() {
        return this.hideTitle;
    }

    public boolean isHideUserCount() {
        return this.hideUserCount;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isLiveTypeLinkmic() {
        return this.liveTypeLinkmic;
    }

    public boolean isLiveTypeNormal() {
        return this.liveTypeNormal;
    }

    public boolean isLiveTypeSandbox() {
        return this.liveTypeSandbox;
    }

    public boolean isUnusedEffect() {
        return this.unusedEffect;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String subtitle() {
        return "";
    }

    public String title() {
        return this.title;
    }

    public String getMixId() {
        return String.valueOf(this.f25600id);
    }

    public String buildPullUrl() {
        if (this.streamUrl == null) {
            return null;
        }
        return buildPullUrl(this.streamUrl.f25619r);
    }

    public String getSdkParams() {
        if (this.streamUrl == null) {
            return null;
        }
        return getSdkParams(this.streamUrl.f25619r);
    }

    public C9384a getStreamSrConfig() {
        C9383t streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.f25790n;
    }

    public C9383t getStreamUrlExtra() {
        if (this.streamUrl == null) {
            return null;
        }
        return this.streamUrl.f25613l;
    }

    public C9383t getStreamUrlExtraSafely() {
        C9383t streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new C9383t();
        }
        return streamUrlExtra;
    }

    public boolean isKoiRoom() {
        if (this.layout == 3) {
            return true;
        }
        return false;
    }

    public boolean isMultiPullDataValid() {
        if (this.streamUrl == null || !this.streamUrl.mo23055f()) {
            return false;
        }
        return true;
    }

    public boolean isOfficial() {
        if (this.layout == 1) {
            return true;
        }
        return false;
    }

    public boolean isPullUrlValid() {
        if (this.streamUrl == null || !this.streamUrl.mo23053d()) {
            return false;
        }
        return true;
    }

    public boolean isStar() {
        if (this.layout == 2) {
            return true;
        }
        return false;
    }

    public void init() {
        if (this.streamUrl != null) {
            this.streamUrl.mo23051b();
            if (this.streamUrl.f25616o != null) {
                this.streamUrl.mo23052c();
            }
        }
    }

    public String getMultiStreamData() {
        if (this.streamUrl == null || this.streamUrl.f25616o == null || this.streamUrl.f25616o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.f25616o.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.streamUrl == null || this.streamUrl.f25616o == null || this.streamUrl.f25616o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.f25616o.getDefaultQuality().sdkKey;
    }

    public LiveMode getStreamType() {
        if (this.layout == 1) {
            return LiveMode.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        return LiveMode.VIDEO;
    }

    public void setAdminUserIds(List<Long> list) {
        this.adminUserIds = list;
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    public void setCellStyle(long j) {
        this.cellStyle = j;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    @C6593c(mo15949a = "cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDailyRankContent(String str) {
        this.dailyRankContent = str;
    }

    public void setDecorationList(List<C9379p> list) {
        this.decorationList = list;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistanceCity(String str) {
        this.distanceCity = str;
    }

    public void setDistanceKm(String str) {
        this.distanceKm = str;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverDict(Map<Long, String> map) {
        this.dynamicCoverDict = map;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setDynamicCoverUri(String str) {
        this.dynamicCoverUri = str;
    }

    public void setEnableRoomPerspective(boolean z) {
        this.enableRoomPerspective = z;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setHealthScoreInfo(C9387w wVar) {
        this.healthScoreInfo = wVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setHideStatusTag(boolean z) {
        this.hideStatusTag = z;
    }

    public void setHideTitle(boolean z) {
        this.hideTitle = z;
    }

    public void setHideUserCount(boolean z) {
        this.hideUserCount = z;
    }

    public void setId(long j) {
        this.f25600id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLastPingTime(long j) {
        this.lastPingTime = j;
    }

    public void setLinkMicLayout(long j) {
        this.linkMicLayout = j;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLiveTypeLinkmic(boolean z) {
        this.liveTypeLinkmic = z;
    }

    public void setLiveTypeNormal(boolean z) {
        this.liveTypeNormal = z;
    }

    public void setLiveTypeSandbox(boolean z) {
        this.liveTypeSandbox = z;
    }

    public void setLivingRoomAttrs(C9382s sVar) {
        this.livingRoomAttrs = sVar;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setMosaicTip(String str) {
        this.mosaicTip = str;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setRealDistance(String str) {
        this.realDistance = str;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStreamId(long j) {
        this.streamId = j;
    }

    public void setStreamIdStr(String str) {
        this.streamIdStr = str;
    }

    public void setStreamProvider(long j) {
        this.streamProvider = j;
    }

    @C6593c(mo15949a = "stream_url")
    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<C9385u> list) {
        this.topFanTickets = list;
    }

    public void setTopUsers(List<User> list) {
        this.topUsers = list;
    }

    public void setUnusedEffect(boolean z) {
        this.unusedEffect = z;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }

    public static boolean isValid(Room room) {
        if (room == null || room.getId() <= 0 || room.getOwner() == null) {
            return false;
        }
        return true;
    }

    public String getSdkParams(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        return (String) this.streamUrl.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        String str2 = (String) this.streamUrl.qualityMap.get(str);
        if (str2 == null) {
            return null;
        }
        C9494e eVar = new C9494e(str2);
        eVar.mo23523a("anchor_device_platform", this.platform);
        eVar.mo23525a("anchor_version", this.clientVersion);
        eVar.mo23524a("room_id", this.f25600id);
        eVar.mo23524a("anchor_id", this.ownerUserId);
        return eVar.mo23522a();
    }
}
