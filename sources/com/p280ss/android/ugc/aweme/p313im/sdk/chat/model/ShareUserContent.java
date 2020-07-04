package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent */
public class ShareUserContent extends BaseContent {
    @C6593c(mo15949a = "avatar")
    private UrlModel avatar;
    @C6593c(mo15949a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "secUID")
    String secUid;
    @C6593c(mo15949a = "uid")
    private String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUid() {
        return this.uid;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("user");
        a.f20186l.putSerializable("video_cover", getAvatar());
        return a;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getString(R.string.brh, new Object[]{getName()});
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static ShareUserContent fromSharePackage(SharePackage sharePackage) {
        ShareUserContent shareUserContent = new ShareUserContent();
        shareUserContent.uid = sharePackage.f20186l.getString("uid");
        shareUserContent.secUid = sharePackage.f20186l.getString("sec_user_id");
        shareUserContent.name = sharePackage.f20186l.getString("name");
        shareUserContent.desc = sharePackage.f20186l.getString("desc");
        Serializable serializable = sharePackage.f20186l.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareUserContent.avatar = (UrlModel) serializable;
        }
        shareUserContent.pushDetail = sharePackage.f20186l.getString("name");
        String string = sharePackage.f20186l.getString("aweme_cover_list");
        if (!TextUtils.isEmpty(string)) {
            shareUserContent.awemeCoverList = (List) JSON.parseObject(string, List.class);
        }
        return shareUserContent;
    }
}
