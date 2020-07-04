package com.p280ss.android.ugc.aweme.comment.param;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.feed.C28201af;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.param.VideoCommentPageParam */
public class VideoCommentPageParam extends CommentPageParam<VideoCommentPageParam> {
    private static final long serialVersionUID = -8706130331733501305L;
    private CommentStruct adCommentStruct;
    private String creationId;
    private boolean enterFullScreen;
    private String enterMethod;
    private String eventType;
    private boolean forceOpenReply;
    private boolean forceRefresh;
    private String hintCids;
    private String insertCids;
    private String insertCidsString;
    private boolean isCommentClose;
    private boolean isCommentLimited;
    private boolean isEnableComment;
    private int isLongItem;
    private boolean isMyProfile;
    private boolean isPrivateAweme;
    private boolean isShowLikeUsers;
    private List<User> mLikeUsers;
    private String mPlayListId;
    private String mPlayListIdKey;
    private String mPlayListType;
    private String mTabName;
    private transient C28201af onShowHeightChangeListener;
    private int pageType;
    private String poiId;
    private String poiObjectId;
    private String poiRegionType;
    private String previousPage;
    private String requestId;
    private boolean scrollToTop;
    private boolean showReplyWithInsert;
    private int source;

    public String getCreationId() {
        return this.creationId;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getHintCids() {
        return this.hintCids;
    }

    public String getInsertCids() {
        return this.insertCids;
    }

    public int getIsLongItem() {
        return this.isLongItem;
    }

    public List<User> getLikeUsers() {
        return this.mLikeUsers;
    }

    public C28201af getOnShowHeightChangeListener() {
        return this.onShowHeightChangeListener;
    }

    public int getPageType() {
        return this.pageType;
    }

    public String getPlayListId() {
        return this.mPlayListId;
    }

    public String getPlayListIdKey() {
        return this.mPlayListIdKey;
    }

    public String getPlayListType() {
        return this.mPlayListType;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiObjectId() {
        return this.poiObjectId;
    }

    public String getPoiRegionType() {
        return this.poiRegionType;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getSource() {
        return this.source;
    }

    public String getTabName() {
        return this.mTabName;
    }

    public boolean isCommentClose() {
        return this.isCommentClose;
    }

    public boolean isCommentLimited() {
        return this.isCommentLimited;
    }

    public boolean isEnableComment() {
        return this.isEnableComment;
    }

    public boolean isEnterFullScreen() {
        return this.enterFullScreen;
    }

    public boolean isForceOpenReply() {
        return this.forceOpenReply;
    }

    public boolean isForceRefresh() {
        return this.forceRefresh;
    }

    public boolean isMyProfile() {
        return this.isMyProfile;
    }

    public boolean isPrivateAweme() {
        return this.isPrivateAweme;
    }

    public boolean isScrollToTop() {
        return this.scrollToTop;
    }

    public boolean isShowLikeUsers() {
        return this.isShowLikeUsers;
    }

    public boolean showReplyWithInsertCid() {
        return this.showReplyWithInsert;
    }

    public CommentStruct getAdCommentStruct() {
        if (this.adCommentStruct == null) {
            return null;
        }
        this.adCommentStruct.setAwemeId(this.aid);
        User user = new User();
        user.setUid(this.authorUid);
        user.setAvatarThumb(this.adCommentStruct.getAvatarIcon());
        this.adCommentStruct.setUser(user);
        this.adCommentStruct.setCommentType(10);
        return this.adCommentStruct;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getCommentTag() {
        /*
            r3 = this;
            java.lang.String r0 = r3.eventType
            int r1 = r0.hashCode()
            r2 = -1741312354(0xffffffff9835ae9e, float:-2.348186E-24)
            if (r1 == r2) goto L_0x001b
            r2 = 3418175(0x34283f, float:4.789883E-39)
            if (r1 == r2) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r1 = "opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r1 = "collection"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = -1
        L_0x0026:
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x002c;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r0 = r3.eventType
            return r0
        L_0x002c:
            boolean r0 = r3.isMyProfile()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "personal_homepage"
            return r0
        L_0x0035:
            java.lang.String r0 = "others_homepage"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam.getCommentTag():java.lang.String");
    }

    public String getEnterFrom() {
        switch (this.pageType) {
            case 1000:
                return "personal_homepage";
            case 1001:
                return "personal_collection";
            case AdError.SERVER_ERROR_CODE /*2000*/:
                return "others_homepage";
            case AdError.INTERNAL_ERROR_CODE /*2001*/:
                return "others_collection";
            default:
                return this.eventType;
        }
    }

    public VideoCommentPageParam(String str) {
        super(str);
    }

    public VideoCommentPageParam forceRefresh(boolean z) {
        this.forceRefresh = z;
        return this;
    }

    public VideoCommentPageParam setAdCommentStruct(CommentStruct commentStruct) {
        this.adCommentStruct = commentStruct;
        return this;
    }

    public VideoCommentPageParam setCommentClose(boolean z) {
        this.isCommentClose = z;
        return this;
    }

    public VideoCommentPageParam setCommentLimited(boolean z) {
        this.isCommentLimited = z;
        return this;
    }

    public VideoCommentPageParam setCreationId(String str) {
        this.creationId = str;
        return this;
    }

    public VideoCommentPageParam setEnableComment(boolean z) {
        this.isEnableComment = z;
        return this;
    }

    public VideoCommentPageParam setEnterFullScreen(boolean z) {
        this.enterFullScreen = z;
        return this;
    }

    public VideoCommentPageParam setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public VideoCommentPageParam setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public VideoCommentPageParam setHintCids(String str) {
        this.hintCids = str;
        return this;
    }

    public VideoCommentPageParam setIsLongItem(int i) {
        this.isLongItem = i;
        return this;
    }

    public VideoCommentPageParam setLikeUsers(List<User> list) {
        this.mLikeUsers = list;
        return this;
    }

    public VideoCommentPageParam setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoCommentPageParam setOnShowHeightChangeListener(C28201af afVar) {
        this.onShowHeightChangeListener = afVar;
        return this;
    }

    public VideoCommentPageParam setPageType(int i) {
        this.pageType = i;
        return this;
    }

    public VideoCommentPageParam setPlayListId(String str) {
        this.mPlayListId = str;
        return this;
    }

    public VideoCommentPageParam setPlayListIdKey(String str) {
        this.mPlayListIdKey = str;
        return this;
    }

    public VideoCommentPageParam setPlayListType(String str) {
        this.mPlayListType = str;
        return this;
    }

    public VideoCommentPageParam setPoiId(String str) {
        this.poiId = str;
        return this;
    }

    public VideoCommentPageParam setPoiObjectId(String str) {
        this.poiObjectId = str;
        return this;
    }

    public VideoCommentPageParam setPoiRegionType(String str) {
        this.poiRegionType = str;
        return this;
    }

    public VideoCommentPageParam setPreviousPage(String str) {
        this.previousPage = str;
        return this;
    }

    public VideoCommentPageParam setPrivateAweme(boolean z) {
        this.isPrivateAweme = z;
        return this;
    }

    public VideoCommentPageParam setRequestId(String str) {
        this.requestId = str;
        return this;
    }

    public VideoCommentPageParam setScrollToTop(boolean z) {
        this.scrollToTop = z;
        return this;
    }

    public VideoCommentPageParam setShowLikeUsers(boolean z) {
        this.isShowLikeUsers = z;
        return this;
    }

    public VideoCommentPageParam setSource(int i) {
        this.source = i;
        return this;
    }

    public VideoCommentPageParam setTabName(String str) {
        this.mTabName = str;
        return this;
    }

    public VideoCommentPageParam setInsertCids(String str, boolean z, boolean z2) {
        this.insertCids = str;
        this.showReplyWithInsert = z;
        this.forceOpenReply = z2;
        return this;
    }
}
