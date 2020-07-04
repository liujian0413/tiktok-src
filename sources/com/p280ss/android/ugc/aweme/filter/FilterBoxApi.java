package com.p280ss.android.ugc.aweme.filter;

import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import p346io.reactivex.C7319aa;
import retrofit2.p363b.C7725a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxApi */
public interface FilterBoxApi {
    @C7730f(mo20420a = "/effect/api/filterbox/list")
    C7319aa<C29320m> listFilterBox(@C7744t(mo20436a = "access_key") String str, @C7744t(mo20436a = "sdk_version") String str2, @C7744t(mo20436a = "app_version") String str3, @C7744t(mo20436a = "region") String str4, @C7744t(mo20436a = "panel") String str5);

    @C7739o(mo20429a = "/effect/api/filterbox/update")
    C7319aa<BaseNetResponse> updateFilterBox(@C7725a C29268bv bvVar);
}
