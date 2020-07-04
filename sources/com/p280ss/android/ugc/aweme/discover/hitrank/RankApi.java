package com.p280ss.android.ugc.aweme.discover.hitrank;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.RankApi */
public interface RankApi {
    @C7730f(mo20420a = "aweme/v1/spotpoint/set/hitrank/")
    C18253l<BaseResponse> finishHitRankTask(@C7744t(mo20436a = "to_userid") String str, @C7744t(mo20436a = "rank_type") int i, @C7744t(mo20436a = "action_type") int i2, @C7744t(mo20436a = "hashtag_names") List<String> list, @C7744t(mo20436a = "sec_to_userid") String str2);

    @C7730f(mo20420a = "aweme/v1/spotpoint/hit/notice/star/list/")
    C18253l<HitNotice> getActivityInfo(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2);
}
