package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ShareReward */
public final class ShareReward implements Serializable {
    @C6593c(mo15949a = "highest_profit")
    private final String highestProfit;
    @C6593c(mo15949a = "reward_consume_percent")
    private final Integer rewardConsumePercent;

    public ShareReward() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ShareReward copy$default(ShareReward shareReward, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shareReward.rewardConsumePercent;
        }
        if ((i & 2) != 0) {
            str = shareReward.highestProfit;
        }
        return shareReward.copy(num, str);
    }

    public final Integer component1() {
        return this.rewardConsumePercent;
    }

    public final String component2() {
        return this.highestProfit;
    }

    public final ShareReward copy(Integer num, String str) {
        return new ShareReward(num, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.highestProfit, (java.lang.Object) r3.highestProfit) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.ShareReward
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.ShareReward r3 = (com.p280ss.android.ugc.aweme.discover.model.ShareReward) r3
            java.lang.Integer r0 = r2.rewardConsumePercent
            java.lang.Integer r1 = r3.rewardConsumePercent
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.highestProfit
            java.lang.String r3 = r3.highestProfit
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.ShareReward.equals(java.lang.Object):boolean");
    }

    public final String getHighestProfit() {
        return this.highestProfit;
    }

    public final Integer getRewardConsumePercent() {
        return this.rewardConsumePercent;
    }

    public final int hashCode() {
        Integer num = this.rewardConsumePercent;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.highestProfit;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareReward(rewardConsumePercent=");
        sb.append(this.rewardConsumePercent);
        sb.append(", highestProfit=");
        sb.append(this.highestProfit);
        sb.append(")");
        return sb.toString();
    }

    public ShareReward(Integer num, String str) {
        this.rewardConsumePercent = num;
        this.highestProfit = str;
    }

    public /* synthetic */ ShareReward(Integer num, String str, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        this(num, str);
    }
}
