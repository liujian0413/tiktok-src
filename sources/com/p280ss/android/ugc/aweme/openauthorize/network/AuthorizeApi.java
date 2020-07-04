package com.p280ss.android.ugc.aweme.openauthorize.network;

import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.openauthorize.p1447a.C34659a;
import p346io.reactivex.C7319aa;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.network.AuthorizeApi */
public interface AuthorizeApi {
    @C6457h(mo15740a = "/passport/open/check_login/")
    C7319aa<C34659a> getLoginStatus(@C6474y(mo15757a = "client_key") String str);
}
