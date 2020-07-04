package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiOkInterceptorTTNet */
public class ApiOkInterceptorTTNet implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34074d.m109744a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m109717b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        String str = a.f33098b;
        if (!TextUtils.isEmpty(str) && str.contains("maya/user/registered/")) {
            return aVar.mo30457a(a);
        }
        try {
            C12534t a2 = aVar.mo30457a(a);
            if (a2 == null || a2.mo30510a() != 200) {
                C6806b.m21144a().mo16630a(str, (Exception) null);
            } else {
                C6806b.m21144a().mo16631b(str);
            }
            return a2;
        } catch (Exception e) {
            if (e instanceof ApiServerException) {
                throw e;
            }
            C6806b.m21144a().mo16630a(str, e);
            throw e;
        }
    }
}
