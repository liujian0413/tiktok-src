package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse */
public final class CreateAwemeResponse extends C38455ap implements C6866d, Serializable {
    @C6593c(mo15949a = "aweme")
    public Aweme aweme;
    @C6593c(mo15949a = "coupon_info")
    public CouponInfo couponInfo;
    @C6593c(mo15949a = "has_sticker_red_packet")
    public boolean hasStickerRedPacket;
    @C6593c(mo15949a = "is_review_video")
    public int isReviewVideo;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPbBean;
    @C6593c(mo15949a = "notify")
    public String[] notify;
    @C6593c(mo15949a = "notify_extra")
    public NotifyExtra notifyExtra;
    public String requestId;
    @C6593c(mo15949a = "share_tip_duration")
    public int shareTipDuration;
    @C6593c(mo15949a = "token")
    public String stickerToken;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$NotifyExtra */
    public static final class NotifyExtra implements Serializable {
        @C6593c(mo15949a = "button_text")
        public String btnText;
        @C6593c(mo15949a = "text")
        public String text;
        @C6593c(mo15949a = "type")
        public int type;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
