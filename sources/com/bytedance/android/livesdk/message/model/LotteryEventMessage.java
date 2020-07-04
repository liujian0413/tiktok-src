package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message.C9500b;
import com.google.gson.p276a.C6593c;

public class LotteryEventMessage extends C8538c {
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_FINISHED = 2;
    public static final int STATUS_ONGOING = 1;
    public static final int STATUS_REJECTED = 5;
    public static final int STATUS_REVIEWING = 4;
    @C6593c(mo15949a = "lottery_current_time")
    public long lotteryCurrentTime;
    @C6593c(mo15949a = "lottery_draw_time")
    public long lotteryDrawTime;
    @C6593c(mo15949a = "lottery_id")
    public long lotteryId;
    @C6593c(mo15949a = "rule_page_scheme")
    public String lotteryRulePageScheme;
    @C6593c(mo15949a = "lottery_start_time")
    public long lotteryStartTime;
    @C6593c(mo15949a = "lottery_status")
    public int lotteryStatus;

    public boolean supportDisplayText() {
        return true;
    }

    LotteryEventMessage() {
    }

    public boolean canText() {
        C9500b bVar = this.baseMessage;
        if (bVar == null || bVar.f26000j == null) {
            return false;
        }
        return true;
    }
}
