package com.p280ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.C21656ap;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.BaseInterceptorService */
public class BaseInterceptorService implements C21656ap {
    public boolean shouldIntercept(C12462c cVar) {
        C7573i.m23587b(cVar, "request");
        return false;
    }

    public Map<String, String> interceptAndGetNewParams(int i, C12462c cVar, C12534t<Object> tVar) {
        return Collections.emptyMap();
    }

    public Map<String, String> interceptAndGetNewParams(int i, String str, String str2) {
        return Collections.emptyMap();
    }

    public void promptIfNeededOrToast(Context context, String str, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "errorMsg");
        C22344s.m73953a(context, str, i);
    }
}
