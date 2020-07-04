package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent */
public class ShareAwemeContent extends BaseContent {
    private static String AWEME_MSG_HINT = "";
    int awemeType;
    @C6593c(mo15949a = "content_name")
    String contentName;
    @C6593c(mo15949a = "content_thumb")
    UrlModel contentThumb;
    @C6593c(mo15949a = "cover_url")
    UrlModel coverUrl;
    @C6593c(mo15949a = "diamond_game_id")
    String diamondGameId;
    @C6593c(mo15949a = "cover_height")
    float height;
    @C6593c(mo15949a = "itemId")
    String itemId;
    @C6593c(mo15949a = "secUID")
    String secUid;
    @C6593c(mo15949a = "content_title")
    String title;
    @C6593c(mo15949a = "uid")
    String user;
    @C6593c(mo15949a = "cover_width")
    float width;

    public int getAwemeType() {
        return this.awemeType;
    }

    public String getContentName() {
        return this.contentName;
    }

    public UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getDiamondGameId() {
        return this.diamondGameId;
    }

    public float getHeight() {
        return this.height;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser() {
        return this.user;
    }

    public float getWidth() {
        return this.width;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return AWEME_MSG_HINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(AWEME_MSG_HINT)) {
            Context a = C6399b.m19921a();
            if (a != null) {
                AWEME_MSG_HINT = a.getString(R.string.bpg);
            }
        }
    }

    public SharePackage generateSharePackage() {
        PureDataSharePackage a = PureDataSharePackage.m103267a("aweme");
        Bundle bundle = a.f20186l;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putString("diamond_game_id", getDiamondGameId());
        return a;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setContentName(String str) {
        this.contentName = str;
    }

    public void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setDiamondGameId(String str) {
        this.diamondGameId = str;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public static ShareAwemeContent fromSharePackage(SharePackage sharePackage) {
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(sharePackage.f20186l.getString("uid_for_share"));
        shareAwemeContent.setSecUid(sharePackage.f20186l.getString("sec_user_id"));
        shareAwemeContent.setItemId(sharePackage.f20186l.getString("item_id_string"));
        shareAwemeContent.setCoverUrl((UrlModel) sharePackage.f20186l.getSerializable("video_cover"));
        shareAwemeContent.setContentThumb((UrlModel) sharePackage.f20186l.getSerializable("thumb_for_share"));
        shareAwemeContent.setContentName(sharePackage.f20186l.getString("author_name"));
        shareAwemeContent.setWidth((float) sharePackage.f20186l.getInt("aweme_width"));
        shareAwemeContent.setHeight((float) sharePackage.f20186l.getInt("aweme_height"));
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        shareAwemeContent.setTitle(sharePackage.f20186l.getString("desc"));
        shareAwemeContent.setDiamondGameId(sharePackage.f20186l.getString("diamond_game_id"));
        return shareAwemeContent;
    }
}
