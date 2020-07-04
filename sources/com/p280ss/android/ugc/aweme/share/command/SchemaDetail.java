package com.p280ss.android.ugc.aweme.share.command;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.share.command.SchemaDetail */
public class SchemaDetail implements Serializable {
    @C6593c(mo15949a = "author_username")
    private String authorUserName;
    @C6593c(mo15949a = "coupon_info")
    public CouponInfo couponInfo;
    @C6593c(mo15949a = "follow_status")
    private int followStatus;
    @C6593c(mo15949a = "forward_username")
    private String forwardUserName;
    @C6593c(mo15949a = "goods_name")
    private String goodsName = "";
    @C6593c(mo15949a = "live_room_data")
    private String liveRoomData;
    @C6593c(mo15949a = "live_username")
    private String liveUserName = "";
    @C6593c(mo15949a = "mix_name")
    private String mixName;
    @C6593c(mo15949a = "music_title")
    private String musicTitle = "";
    @C6593c(mo15949a = "user_nickname")
    private String nickName = "";
    @C6593c(mo15949a = "poi_name")
    private String poiName = "";
    @C6593c(mo15949a = "sticker_name")
    private String stickerName;
    @C6593c(mo15949a = "challenge")
    private CommandTransChallenge transChallenge;
    @C6593c(mo15949a = "avatar_url")
    private UrlModel userAvartar;
    @C6593c(mo15949a = "video")
    private CommandTransVideo video;

    public String getAuthorUserName() {
        return this.authorUserName;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public String getForwardUserName() {
        return this.forwardUserName;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public String getLiveRoomData() {
        return this.liveRoomData;
    }

    public String getLiveUserName() {
        return this.liveUserName;
    }

    public String getMixName() {
        return this.mixName;
    }

    public String getMusicTitle() {
        return this.musicTitle;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getStickerName() {
        return this.stickerName;
    }

    public CommandTransChallenge getTransChallenge() {
        return this.transChallenge;
    }

    public UrlModel getUserAvartar() {
        return this.userAvartar;
    }

    public CommandTransVideo getVideo() {
        return this.video;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setGoodsName(String str) {
        this.goodsName = str;
    }

    public void setLiveUserName(String str) {
        this.liveUserName = str;
    }

    public void setMusicTitle(String str) {
        this.musicTitle = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public void setTransChallenge(CommandTransChallenge commandTransChallenge) {
        this.transChallenge = commandTransChallenge;
    }

    public void setVideo(CommandTransVideo commandTransVideo) {
        this.video = commandTransVideo;
    }
}
