package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent */
public class ShareWebContent extends BaseContent {
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "cover_url")
    private String image;
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "link_url")
    private String url;

    public String getDesc() {
        return this.desc;
    }

    public String getImage() {
        return this.image;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("web");
        a.f20186l.putSerializable("thumb_url", getImage());
        return a;
    }

    public String getMsgHint() {
        return C6399b.m19921a().getString(R.string.brn, new Object[]{getTitle()});
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public static ShareWebContent fromSharePackage(SharePackage sharePackage) {
        ShareWebContent shareWebContent = new ShareWebContent();
        shareWebContent.setTitle(sharePackage.f20183i);
        shareWebContent.setDesc(sharePackage.f20184j);
        shareWebContent.setImage(sharePackage.f20186l.getString("thumb_url"));
        String string = sharePackage.f20186l.getString("url_for_im_share");
        if (TextUtils.isEmpty(string)) {
            string = sharePackage.f20185k;
        }
        shareWebContent.setUrl(string);
        shareWebContent.setPushDetail(sharePackage.f20183i);
        return shareWebContent;
    }
}
