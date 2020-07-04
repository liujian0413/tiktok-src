package com.p280ss.android.ugc.aweme.feed.model;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24716aj;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24613b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoItemParams */
public class VideoItemParams {
    public String curPoiId;
    public String curPoiLat;
    public String curPoiLng;
    public Fragment fragment;
    public boolean isMyProfile;
    public C24613b mAdOpenCallBack;
    public C24723e mAdViewController;
    public Aweme mAweme;
    public int mAwemeFromPage;
    public String mEnterMethodValue;
    public String mEventType;
    public int mPageType;
    public JSONObject mRequestId;

    public static VideoItemParams newBuilder() {
        return new VideoItemParams();
    }

    public VideoItemParams setAdOpenCallBack(C24613b bVar) {
        this.mAdOpenCallBack = bVar;
        return this;
    }

    public VideoItemParams setAdViewController(C24723e eVar) {
        this.mAdViewController = eVar;
        return this;
    }

    public VideoItemParams setAweme(Aweme aweme) {
        this.mAweme = aweme;
        return this;
    }

    public VideoItemParams setAwemeFromPage(int i) {
        this.mAwemeFromPage = i;
        return this;
    }

    public VideoItemParams setCurPoiId(String str) {
        this.curPoiId = str;
        return this;
    }

    public VideoItemParams setCurPoiLat(String str) {
        this.curPoiLat = str;
        return this;
    }

    public VideoItemParams setCurPoiLng(String str) {
        this.curPoiLng = str;
        return this;
    }

    public VideoItemParams setEnterMethodValue(String str) {
        this.mEnterMethodValue = str;
        return this;
    }

    public VideoItemParams setEventType(String str) {
        this.mEventType = str;
        return this;
    }

    public VideoItemParams setFragment(Fragment fragment2) {
        this.fragment = fragment2;
        return this;
    }

    public VideoItemParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoItemParams setPageType(int i) {
        this.mPageType = i;
        return this;
    }

    public VideoItemParams setRequestId(JSONObject jSONObject) {
        this.mRequestId = jSONObject;
        return this;
    }

    public static VideoItemParams newBuilder(BaseFeedPageParams baseFeedPageParams, C24716aj ajVar, Fragment fragment2, String str) {
        VideoItemParams awemeFromPage = new VideoItemParams().setEventType(baseFeedPageParams.eventType).setMyProfile(baseFeedPageParams.isMyProfile).setPageType(baseFeedPageParams.pageType).setFragment(fragment2).setEnterMethodValue(str).setAwemeFromPage(baseFeedPageParams.awemeFromPage);
        if (baseFeedPageParams.param != null) {
            awemeFromPage.setCurPoiLat(baseFeedPageParams.param.getCurPoiLat()).setCurPoiLng(baseFeedPageParams.param.getCurPoiLng()).setCurPoiId(baseFeedPageParams.param.getPagePoiId());
        }
        if (ajVar != null) {
            awemeFromPage.setAdOpenCallBack(ajVar.mo64583f()).setAdViewController(ajVar.mo64577c());
        }
        return awemeFromPage;
    }
}
