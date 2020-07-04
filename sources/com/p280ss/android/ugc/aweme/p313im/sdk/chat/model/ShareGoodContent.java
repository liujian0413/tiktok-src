package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31820a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent */
public class ShareGoodContent extends BaseContent {
    @C6593c(mo15949a = "avatar")
    private UrlModel avatar;
    @C6593c(mo15949a = "enter_method")
    private String enterMethod = "click_message";
    @C6593c(mo15949a = "product_id")
    private String productId;
    @C6593c(mo15949a = "promotion_id")
    private String promotionId;
    @C6593c(mo15949a = "sec_user_id")
    private String secUserId = "";
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "user_count")
    private long userCount;
    @C6593c(mo15949a = "user_id")
    private String userId;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getSecUserId() {
        return this.secUserId;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getMsgHint() {
        return C1642a.m8035a(Locale.getDefault(), C6399b.m19921a().getString(R.string.bjs), new Object[]{getTitle()});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = new C31820a().mo18868d("good").mo18870f(getTitle()).mo18866a();
        Bundle bundle = a.f20186l;
        bundle.putSerializable("video_cover", getAvatar());
        bundle.putString("user_id", getUserId());
        bundle.putString("user_count", String.valueOf(getUserCount()));
        bundle.putString("promotion_id", getPromotionId());
        bundle.putString("product_id", getProductId());
        if (!TextUtils.isEmpty(getSecUserId())) {
            bundle.putString("sec_user_id", getSecUserId());
        }
        return a;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    public void setSecUserId(String str) {
        this.secUserId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(long j) {
        this.userCount = j;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public static ShareGoodContent fromSharePackage(SharePackage sharePackage) {
        ShareGoodContent shareGoodContent = new ShareGoodContent();
        shareGoodContent.title = sharePackage.f20183i;
        Serializable serializable = sharePackage.f20186l.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareGoodContent.avatar = (UrlModel) serializable;
        }
        String string = sharePackage.f20186l.getString("user_id");
        String string2 = sharePackage.f20186l.getString("sec_user_id");
        int i = sharePackage.f20186l.getInt("user_count");
        String string3 = sharePackage.f20186l.getString("promotion_id");
        String string4 = sharePackage.f20186l.getString("product_id");
        shareGoodContent.userId = string;
        if (!TextUtils.isEmpty(string2)) {
            shareGoodContent.secUserId = string2;
        }
        shareGoodContent.userCount = (long) i;
        shareGoodContent.promotionId = string3;
        shareGoodContent.productId = string4;
        shareGoodContent.type = 0;
        return shareGoodContent;
    }
}
