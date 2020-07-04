package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent */
public class ShareMiniAppContent extends BaseContent {
    @C6593c(mo15949a = "app_id")
    private String appId;
    @C6593c(mo15949a = "app_name")
    private String appName;
    @C6593c(mo15949a = "extra")
    private Extra extra;
    @C6593c(mo15949a = "image_url")
    private String imageUrl;
    @C6593c(mo15949a = "is_game")
    private boolean isGame;
    @C6593c(mo15949a = "push_detail")
    private String pushDetail;
    @C6593c(mo15949a = "query")
    private String query;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "token")
    private String token;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent$Extra */
    public static class Extra implements Serializable {
        @C6593c(mo15949a = "channel")
        String channel;

        public String getChannel() {
            return this.channel;
        }

        public void setChannel(String str) {
            this.channel = str;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getQuery() {
        return this.query;
    }

    public String getTitle() {
        return this.title;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isGame() {
        return this.isGame;
    }

    public String getExtraStr() {
        return new C6600e().mo15979b((Object) this.extra);
    }

    public String getMsgHint() {
        if (this.isGame) {
            return C6399b.m19921a().getResources().getString(R.string.bmy, new Object[]{this.appName});
        }
        return C6399b.m19921a().getResources().getString(R.string.bmw, new Object[]{this.appName});
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setGame(boolean z) {
        this.isGame = z;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public static ShareMiniAppContent fromSharePackage(SharePackage sharePackage) {
        ShareMiniAppContent shareMiniAppContent = new ShareMiniAppContent();
        shareMiniAppContent.appName = sharePackage.f20186l.getString("app_name");
        shareMiniAppContent.title = sharePackage.f20183i;
        shareMiniAppContent.imageUrl = sharePackage.f20186l.getString("thumb_url");
        shareMiniAppContent.pushDetail = sharePackage.f20186l.getString("app_name");
        shareMiniAppContent.isGame = sharePackage.f20186l.getBoolean("is_game", false);
        shareMiniAppContent.query = sharePackage.f20186l.getString("query");
        shareMiniAppContent.appId = sharePackage.f20186l.getString("app_id");
        shareMiniAppContent.token = sharePackage.f20186l.getString("token");
        shareMiniAppContent.extra = (Extra) new C6600e().mo15974a(sharePackage.f20186l.getString("extra"), Extra.class);
        if (shareMiniAppContent.isGame) {
            shareMiniAppContent.setType(2401);
        } else {
            shareMiniAppContent.setType(2402);
        }
        return shareMiniAppContent;
    }
}
