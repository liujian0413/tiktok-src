package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.profile.p1482c.C35739a;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask */
public final class CommerceChallengeTask implements Serializable {
    @C6593c(mo15949a = "commerce_challenge_task_type")
    private final String commerceChallengeTaskType;
    @C6593c(mo15949a = "desc")
    private final String desc;
    @C6592b(mo15947a = C35739a.class)
    @C6593c(mo15949a = "example_awemes")
    private final String exampleAwemes;
    @C6593c(mo15949a = "gift_reward")
    private final String giftReward;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private final String f70738id;
    @C6593c(mo15949a = "name")
    private final String name;
    @C6593c(mo15949a = "requirement")
    private final String requirement;
    @C6593c(mo15949a = "reward_type")
    private final Integer rewardType;
    @C6593c(mo15949a = "schema")
    private final String schema;
    @C6593c(mo15949a = "share_reward")
    private final ShareReward shareReward;

    public CommerceChallengeTask() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CommerceChallengeTask copy$default(CommerceChallengeTask commerceChallengeTask, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, ShareReward shareReward2, int i, Object obj) {
        CommerceChallengeTask commerceChallengeTask2 = commerceChallengeTask;
        int i2 = i;
        return commerceChallengeTask.copy((i2 & 1) != 0 ? commerceChallengeTask2.f70738id : str, (i2 & 2) != 0 ? commerceChallengeTask2.commerceChallengeTaskType : str2, (i2 & 4) != 0 ? commerceChallengeTask2.name : str3, (i2 & 8) != 0 ? commerceChallengeTask2.desc : str4, (i2 & 16) != 0 ? commerceChallengeTask2.exampleAwemes : str5, (i2 & 32) != 0 ? commerceChallengeTask2.schema : str6, (i2 & 64) != 0 ? commerceChallengeTask2.requirement : str7, (i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? commerceChallengeTask2.rewardType : num, (i2 & 256) != 0 ? commerceChallengeTask2.giftReward : str8, (i2 & 512) != 0 ? commerceChallengeTask2.shareReward : shareReward2);
    }

    public final String component1() {
        return this.f70738id;
    }

    public final ShareReward component10() {
        return this.shareReward;
    }

    public final String component2() {
        return this.commerceChallengeTaskType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.desc;
    }

    public final String component5() {
        return this.exampleAwemes;
    }

    public final String component6() {
        return this.schema;
    }

    public final String component7() {
        return this.requirement;
    }

    public final Integer component8() {
        return this.rewardType;
    }

    public final String component9() {
        return this.giftReward;
    }

    public final CommerceChallengeTask copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, ShareReward shareReward2) {
        CommerceChallengeTask commerceChallengeTask = new CommerceChallengeTask(str, str2, str3, str4, str5, str6, str7, num, str8, shareReward2);
        return commerceChallengeTask;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.shareReward, (java.lang.Object) r3.shareReward) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x006f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeTask
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r3 = (com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeTask) r3
            java.lang.String r0 = r2.f70738id
            java.lang.String r1 = r3.f70738id
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.commerceChallengeTaskType
            java.lang.String r1 = r3.commerceChallengeTaskType
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.desc
            java.lang.String r1 = r3.desc
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.exampleAwemes
            java.lang.String r1 = r3.exampleAwemes
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.schema
            java.lang.String r1 = r3.schema
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.requirement
            java.lang.String r1 = r3.requirement
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r2.rewardType
            java.lang.Integer r1 = r3.rewardType
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = r2.giftReward
            java.lang.String r1 = r3.giftReward
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.discover.model.ShareReward r0 = r2.shareReward
            com.ss.android.ugc.aweme.discover.model.ShareReward r3 = r3.shareReward
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            return r3
        L_0x006f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.CommerceChallengeTask.equals(java.lang.Object):boolean");
    }

    public final String getCommerceChallengeTaskType() {
        return this.commerceChallengeTaskType;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExampleAwemes() {
        return this.exampleAwemes;
    }

    public final String getGiftReward() {
        return this.giftReward;
    }

    public final String getId() {
        return this.f70738id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequirement() {
        return this.requirement;
    }

    public final Integer getRewardType() {
        return this.rewardType;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final ShareReward getShareReward() {
        return this.shareReward;
    }

    public final int hashCode() {
        String str = this.f70738id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.commerceChallengeTaskType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.desc;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.exampleAwemes;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.schema;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.requirement;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num = this.rewardType;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        String str8 = this.giftReward;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        ShareReward shareReward2 = this.shareReward;
        if (shareReward2 != null) {
            i = shareReward2.hashCode();
        }
        return hashCode9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceChallengeTask(id=");
        sb.append(this.f70738id);
        sb.append(", commerceChallengeTaskType=");
        sb.append(this.commerceChallengeTaskType);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", exampleAwemes=");
        sb.append(this.exampleAwemes);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", requirement=");
        sb.append(this.requirement);
        sb.append(", rewardType=");
        sb.append(this.rewardType);
        sb.append(", giftReward=");
        sb.append(this.giftReward);
        sb.append(", shareReward=");
        sb.append(this.shareReward);
        sb.append(")");
        return sb.toString();
    }

    public CommerceChallengeTask(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, ShareReward shareReward2) {
        this.f70738id = str;
        this.commerceChallengeTaskType = str2;
        this.name = str3;
        this.desc = str4;
        this.exampleAwemes = str5;
        this.schema = str6;
        this.requirement = str7;
        this.rewardType = num;
        this.giftReward = str8;
        this.shareReward = shareReward2;
    }

    public /* synthetic */ CommerceChallengeTask(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, ShareReward shareReward2, int i, C7571f fVar) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Integer num2;
        String str16;
        int i2 = i;
        ShareReward shareReward3 = null;
        if ((i2 & 1) != 0) {
            str9 = null;
        } else {
            str9 = str;
        }
        if ((i2 & 2) != 0) {
            str10 = null;
        } else {
            str10 = str2;
        }
        if ((i2 & 4) != 0) {
            str11 = null;
        } else {
            str11 = str3;
        }
        if ((i2 & 8) != 0) {
            str12 = null;
        } else {
            str12 = str4;
        }
        if ((i2 & 16) != 0) {
            str13 = null;
        } else {
            str13 = str5;
        }
        if ((i2 & 32) != 0) {
            str14 = null;
        } else {
            str14 = str6;
        }
        if ((i2 & 64) != 0) {
            str15 = null;
        } else {
            str15 = str7;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 256) != 0) {
            str16 = null;
        } else {
            str16 = str8;
        }
        if ((i2 & 512) == 0) {
            shareReward3 = shareReward2;
        }
        this(str9, str10, str11, str12, str13, str14, str15, num2, str16, shareReward3);
    }
}
