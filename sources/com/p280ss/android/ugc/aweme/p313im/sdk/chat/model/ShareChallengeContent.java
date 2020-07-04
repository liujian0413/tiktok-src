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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent */
public class ShareChallengeContent extends BaseContent {
    @C6593c(mo15949a = "challenge_id")
    private String challengeId;
    @C6593c(mo15949a = "cover_url")
    private List<UrlModel> coverUrl;
    @C6593c(mo15949a = "is_commerce")
    private boolean isCommerce;
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "user_count")
    private long userCount;

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public SharePackage generateSharePackage() {
        return PureDataSharePackage.m103267a("challenge");
    }

    public String getMsgHint() {
        return C6399b.m19921a().getResources().getString(R.string.bhk, new Object[]{this.pushDetail});
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = (long) i;
    }

    public static ShareChallengeContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f20186l.getString("challenge_id");
        String string2 = sharePackage.f20186l.getString("challenge_name");
        Boolean valueOf = Boolean.valueOf(sharePackage.f20186l.getBoolean("is_commerce"));
        long j = sharePackage.f20186l.getLong("view_count");
        String string3 = sharePackage.f20186l.getString("cover_thumb");
        ShareChallengeContent shareChallengeContent = new ShareChallengeContent();
        shareChallengeContent.challengeId = string;
        shareChallengeContent.title = string2;
        shareChallengeContent.isCommerce = valueOf.booleanValue();
        shareChallengeContent.userCount = j;
        StringBuilder sb = new StringBuilder("#");
        sb.append(shareChallengeContent.title);
        shareChallengeContent.pushDetail = sb.toString();
        if (!TextUtils.isEmpty(string3)) {
            shareChallengeContent.coverUrl = (List) JSON.parseObject(string3, List.class);
        }
        return shareChallengeContent;
    }
}
