package com.bytedance.android.livesdk.rank.model;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p276a.C6593c;

public class PeriodRankExtra extends Extra {
    @C6593c(mo15949a = "gap_description")
    public String gapDescription;
    @C6593c(mo15949a = "self_info")
    public User mUser;
    @C6593c(mo15949a = "self_rank")
    public int selfRank;
    @C6593c(mo15949a = "self_score")
    public long selfScore;
}
