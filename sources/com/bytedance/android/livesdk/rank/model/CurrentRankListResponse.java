package com.bytedance.android.livesdk.rank.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

public class CurrentRankListResponse {
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "music_wave")
    public String musicWave;
    @C6593c(mo15949a = "ranks")
    public List<C8857f> ranks;
    @C6593c(mo15949a = "seats")
    public List<C8857f> seats;
    @C6593c(mo15949a = "self_info")
    public C8857f selfInfo;
    @C6593c(mo15949a = "total")
    public long total;
}
