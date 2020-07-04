package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent */
public class ShareGoodWindowContent extends BaseContent {
    @C6593c(mo15949a = "avatar")
    private UrlModel avatar;
    @C6593c(mo15949a = "entrance_location")
    private String entranceLocation = "message";
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "sec_user_id")
    private String secUserId = "";
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "user_id")
    private String userId;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getEntranceLocation() {
        return this.entranceLocation;
    }

    public String getName() {
        return this.name;
    }

    public String getSecUserId() {
        return this.secUserId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getMsgHint() {
        return C1642a.m8035a(Locale.getDefault(), C6399b.m19921a().getString(R.string.bjw), new Object[]{getName()});
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("good_window");
        Bundle bundle = a.f20186l;
        bundle.putSerializable("video_cover", getAvatar());
        bundle.putString("user_id", getUserId());
        if (!TextUtils.isEmpty(getSecUserId())) {
            a.f20186l.putString("sec_user_id", getSecUserId());
        }
        a.f20186l.putString("name", getName());
        return a;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setEntranceLocation(String str) {
        this.entranceLocation = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSecUserId(String str) {
        this.secUserId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public static ShareGoodWindowContent fromSharePackage(SharePackage sharePackage) {
        ShareGoodWindowContent shareGoodWindowContent = new ShareGoodWindowContent();
        String string = sharePackage.f20186l.getString("user_id");
        String string2 = sharePackage.f20186l.getString("sec_user_id");
        sharePackage.f20186l.getString("user_count");
        sharePackage.f20186l.getString("promotion_id");
        sharePackage.f20186l.getString("product_id");
        String string3 = sharePackage.f20186l.getString("name");
        Serializable serializable = sharePackage.f20186l.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareGoodWindowContent.avatar = (UrlModel) serializable;
        }
        shareGoodWindowContent.name = string3;
        shareGoodWindowContent.userId = string;
        if (!TextUtils.isEmpty(string2)) {
            shareGoodWindowContent.secUserId = string2;
        }
        shareGoodWindowContent.type = 0;
        return shareGoodWindowContent;
    }
}
