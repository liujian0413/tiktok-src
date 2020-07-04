package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent */
public class SharePoiContent extends BaseContent {
    @C6593c(mo15949a = "cover_url")
    private List<UrlModel> coverUrl;
    @C6593c(mo15949a = "map_url")
    private UrlModel mapUrl;
    @C6593c(mo15949a = "poi_icon_url")
    private UrlModel poiIconUrl;
    @C6593c(mo15949a = "poi_id")
    private String poiId;
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "subtitle")
    private String subtitle;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "user_count")
    private int userCount;

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public UrlModel getMapUrl() {
        return this.mapUrl;
    }

    public UrlModel getPoiIconUrl() {
        return this.poiIconUrl;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("poi");
        a.f20186l.putSerializable("video_cover", getMapUrl());
        return a;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getResources().getString(R.string.bo3, new Object[]{this.pushDetail});
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setMapUrl(UrlModel urlModel) {
        this.mapUrl = urlModel;
    }

    public void setPoiIconUrl(UrlModel urlModel) {
        this.poiIconUrl = urlModel;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public static SharePoiContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f20186l.getString("poi_id");
        String string2 = sharePackage.f20186l.getString("poi_name");
        String string3 = sharePackage.f20186l.getString("simple_addr");
        int i = sharePackage.f20186l.getInt("user_count");
        String string4 = sharePackage.f20186l.getString("subtitle");
        String string5 = sharePackage.f20186l.getString("map_url");
        String string6 = sharePackage.f20186l.getString("cover_url");
        String string7 = sharePackage.f20186l.getString("poi_icon_url");
        SharePoiContent sharePoiContent = new SharePoiContent();
        sharePoiContent.poiId = string;
        sharePoiContent.title = string2;
        sharePoiContent.pushDetail = string3;
        sharePoiContent.userCount = i;
        sharePoiContent.subtitle = string4;
        if (!TextUtils.isEmpty(string5)) {
            sharePoiContent.mapUrl = (UrlModel) JSON.parseObject(string5, UrlModel.class);
        }
        if (!TextUtils.isEmpty(string6)) {
            sharePoiContent.coverUrl = (List) JSON.parseObject(string6, List.class);
        }
        if (!TextUtils.isEmpty(string7)) {
            sharePoiContent.poiIconUrl = (UrlModel) JSON.parseObject(string7, UrlModel.class);
        }
        sharePoiContent.type = 0;
        return sharePoiContent;
    }
}
