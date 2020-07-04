package com.p280ss.android.ugc.aweme.sticker.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.CommerceSticker */
public class CommerceSticker implements Serializable {
    @C6593c(mo15949a = "ad_owner_id")
    public String adOwnerId;
    @C6593c(mo15949a = "ad_owner_name")
    public String adOwnerName;
    @C6593c(mo15949a = "challenge_id")
    public String challengeId;
    @C6593c(mo15949a = "unlock_info")
    public CommerceStickerUnlockInfo commerceStickerUnlockInfo;
    @C6593c(mo15949a = "detail_desc")
    public String detailDesc;
    @C6593c(mo15949a = "detail_letters")
    public String detailLetters;
    @C6593c(mo15949a = "detail_open_url")
    public String detailOpenUrl;
    @C6593c(mo15949a = "detail_web_url")
    public String detailWebUrl;
    @C6593c(mo15949a = "detail_web_url_title")
    public String detailWebUrlTitle;
    @C6593c(mo15949a = "expire_time")
    public long expireTime;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public String f108862id;
    @C6593c(mo15949a = "music_id")
    public String musicId;
    @C6593c(mo15949a = "screen_desc")
    public String screenDesc;
    @C6593c(mo15949a = "screen_icon")
    public UrlModel screenIcon;

    public String getAdOwnerId() {
        return this.adOwnerId;
    }

    public String getAdOwnerName() {
        return this.adOwnerName;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public CommerceStickerUnlockInfo getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getDetailLetters() {
        return this.detailLetters;
    }

    public String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getId() {
        return this.f108862id;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getScreenDesc() {
        return this.screenDesc;
    }

    public UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerceStickerUnlockInfo(CommerceStickerUnlockInfo commerceStickerUnlockInfo2) {
        this.commerceStickerUnlockInfo = commerceStickerUnlockInfo2;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setId(String str) {
        this.f108862id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }
}
