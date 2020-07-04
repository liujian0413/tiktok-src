package com.p280ss.android.ugc.aweme.services;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.account.network.C22207b;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.InterceptorService */
public final class InterceptorService extends BaseInterceptorService {
    public final boolean shouldIntercept(C12462c cVar) {
        C7573i.m23587b(cVar, "request");
        return false;
    }

    public final Map<String, String> interceptAndGetNewParams(int i, String str, String str2) {
        Map<String, String> a = C22207b.m73671a(i, str, str2);
        C7573i.m23582a((Object) a, "InterceptorHelper.interc…errorCode, url, response)");
        return a;
    }

    public final Map<String, String> interceptAndGetNewParams(int i, C12462c cVar, C12534t<Object> tVar) {
        String str;
        T t = null;
        if (cVar != null) {
            str = cVar.f33098b;
        } else {
            str = null;
        }
        if (tVar != null) {
            t = tVar.f33302b;
        }
        return interceptAndGetNewParams(i, str, String.valueOf(t));
    }
}
