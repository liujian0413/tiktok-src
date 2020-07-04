package com.p280ss.android.ugc.aweme.profile.fansshake;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.fansshake.FansUrgeApi */
public interface FansUrgeApi {
    @C7739o(mo20429a = "/aweme/v1/commit/urge/")
    C1592h<BaseResponse> urge(@C7744t(mo20436a = "user_id") String str);
}
