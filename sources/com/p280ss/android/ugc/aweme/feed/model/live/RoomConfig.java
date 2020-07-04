package com.p280ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomConfig */
public class RoomConfig implements Serializable {
    private static final int LANDSCAPE_MASK = 2;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 0;
    private static final int PORTRAIT_MASK = 1;
    @C6593c(mo15949a = "enable_emoji")
    public int enableEmoji;
    @C6593c(mo15949a = "enable_fans_club")
    public int enableFansClub;
    @C6593c(mo15949a = "enable_hourly_list")
    public int enableHourRank;
    @C6593c(mo15949a = "enable_send_barrage")
    public int enableSendBarrage;
    @C6593c(mo15949a = "enable_send_comment")
    public int enableSendComment;
    @C6593c(mo15949a = "enable_send_gift")
    public int enableSendGift;
    @C6593c(mo15949a = "enable_send_gift_guide")
    public int enableSendGiftGuide;
    @C6593c(mo15949a = "enable_send_shortcut_gift")
    public int enableSendShortcutGift;
    @C6593c(mo15949a = "enable_share")
    public int enableShare;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomConfig$ORIENTATION */
    public @interface ORIENTATION {
    }

    private boolean calc(int i, int i2) {
        int i3 = i2 == 0 ? 1 : 2;
        return (i & i3) == i3;
    }

    public boolean enableHourRank(int i) {
        return calc(this.enableHourRank, i);
    }

    public boolean isEnableEmoji(int i) {
        return calc(this.enableEmoji, i);
    }

    public boolean isEnableFansClub(int i) {
        return calc(this.enableFansClub, i);
    }

    public boolean isEnableSendBarrage(int i) {
        return calc(this.enableSendBarrage, i);
    }

    public boolean isEnableSendComment(int i) {
        return calc(this.enableSendComment, i);
    }

    public boolean isEnableSendGift(int i) {
        return calc(this.enableSendGift, i);
    }

    public boolean isEnableSendGiftGuide(int i) {
        return calc(this.enableSendGiftGuide, i);
    }

    public boolean isEnableShare(int i) {
        return calc(this.enableShare, i);
    }

    public boolean isEnableShortcutGift(int i) {
        return calc(this.enableSendShortcutGift, i);
    }
}
