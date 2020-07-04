package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData */
public class UserHeaderData implements Serializable {
    private int awemeCount;
    private String enterMethod;
    private boolean isFromFeed = true;
    private boolean isFromLive;
    private int isFromRecommendCard;
    private boolean isPrivate;
    private Aweme mAweme;
    private String mAwemeId;
    private String mEnterFrom;
    private String mEnterFromRequestId;
    private String mEventType;
    private int mFollowStatus;
    private int mFollowerStatus;
    private String mFromSearch;
    private String mLivePreviousPage;
    private String mLiveRequestId;
    private String mLiveRoomId;
    private String mLiveRoomOwnerId;
    private String mLiveType;
    private String mMethodFrom;
    private long mPageStartTime = -1;
    private String mPoiId;
    private String mPreviousPage;
    private String mPreviousPagePosition = "other_places";
    private String mProfileFrom;
    private String mRequestId;
    private String mRequestedText;
    private String mSecUserId;
    private String mType;
    private String mUserId;
    private String sceneId;

    public int getAwemeCount() {
        return this.awemeCount;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public int getFromRecommendCard() {
        return this.isFromRecommendCard;
    }

    public String getLivePreviousPage() {
        return this.mLivePreviousPage;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public String getSecUserId() {
        return this.mSecUserId;
    }

    public Aweme getmAweme() {
        return this.mAweme;
    }

    public String getmAwemeId() {
        return this.mAwemeId;
    }

    public String getmEnterFrom() {
        return this.mEnterFrom;
    }

    public String getmEnterFromRequestId() {
        return this.mEnterFromRequestId;
    }

    public String getmEventType() {
        return this.mEventType;
    }

    public int getmFollowStatus() {
        return this.mFollowStatus;
    }

    public int getmFollowerStatus() {
        return this.mFollowerStatus;
    }

    public String getmFromSearch() {
        return this.mFromSearch;
    }

    public String getmLiveRequestId() {
        return this.mLiveRequestId;
    }

    public String getmLiveRoomId() {
        return this.mLiveRoomId;
    }

    public String getmLiveRoomOwnerId() {
        return this.mLiveRoomOwnerId;
    }

    public String getmLiveType() {
        return this.mLiveType;
    }

    public String getmMethodFrom() {
        return this.mMethodFrom;
    }

    public long getmPageStartTime() {
        return this.mPageStartTime;
    }

    public String getmPoiId() {
        return this.mPoiId;
    }

    public String getmPreviousPage() {
        return this.mPreviousPage;
    }

    public String getmPreviousPagePosition() {
        return this.mPreviousPagePosition;
    }

    public String getmProfileFrom() {
        return this.mProfileFrom;
    }

    public String getmRequestId() {
        return this.mRequestId;
    }

    public String getmRequestedText() {
        return this.mRequestedText;
    }

    public String getmType() {
        return this.mType;
    }

    public String getmUserId() {
        return this.mUserId;
    }

    public boolean isFromFeed() {
        return this.isFromFeed;
    }

    public boolean isFromLive() {
        return this.isFromLive;
    }

    public boolean isPrivate() {
        return this.isPrivate;
    }

    public void setAwemeCount(int i) {
        this.awemeCount = i;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setFromFeed(boolean z) {
        this.isFromFeed = z;
    }

    public void setFromLive(boolean z) {
        this.isFromLive = z;
    }

    public void setFromRecommendCard(int i) {
        this.isFromRecommendCard = i;
    }

    public void setLivePreviousPage(String str) {
        this.mLivePreviousPage = str;
    }

    public void setPrivate(boolean z) {
        this.isPrivate = z;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }

    public void setSecUserId(String str) {
        this.mSecUserId = str;
    }

    public void setmAweme(Aweme aweme) {
        this.mAweme = aweme;
    }

    public void setmAwemeId(String str) {
        this.mAwemeId = str;
    }

    public void setmEnterFrom(String str) {
        this.mEnterFrom = str;
    }

    public void setmEnterFromRequestId(String str) {
        this.mEnterFromRequestId = str;
    }

    public void setmEventType(String str) {
        this.mEventType = str;
    }

    public void setmFollowStatus(int i) {
        this.mFollowStatus = i;
    }

    public void setmFollowerStatus(int i) {
        this.mFollowerStatus = i;
    }

    public void setmFromSearch(String str) {
        this.mFromSearch = str;
    }

    public void setmLiveRequestId(String str) {
        this.mLiveRequestId = str;
    }

    public void setmLiveRoomId(String str) {
        this.mLiveRoomId = str;
    }

    public void setmLiveRoomOwnerId(String str) {
        this.mLiveRoomOwnerId = str;
    }

    public void setmLiveType(String str) {
        this.mLiveType = str;
    }

    public void setmMethodFrom(String str) {
        this.mMethodFrom = str;
    }

    public void setmPageStartTime(long j) {
        this.mPageStartTime = j;
    }

    public void setmPoiId(String str) {
        this.mPoiId = str;
    }

    public void setmPreviousPage(String str) {
        this.mPreviousPage = str;
    }

    public void setmPreviousPagePosition(String str) {
        this.mPreviousPagePosition = str;
    }

    public void setmProfileFrom(String str) {
        this.mProfileFrom = str;
    }

    public void setmRequestId(String str) {
        this.mRequestId = str;
    }

    public void setmRequestedText(String str) {
        this.mRequestedText = str;
    }

    public void setmType(String str) {
        this.mType = str;
    }

    public void setmUserId(String str) {
        this.mUserId = str;
    }
}
