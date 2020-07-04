package com.p280ss.android.account.token;

import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;

/* renamed from: com.ss.android.account.token.IGetTokenApi */
public interface IGetTokenApi {
    @C6457h(mo15740a = "/passport/user/logout/")
    C12466b<String> logout(@C6474y(mo15757a = "logout_from") String str);

    @C6468s(mo15750a = "/passport/token/change/")
    C12466b<String> requestChangeToken(@C6451b String str);

    @C6468s(mo15750a = "/passport/token/beat/")
    C12466b<String> requestToken(@C6451b String str);
}
