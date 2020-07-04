package com.p280ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils;
import java.util.HashMap;
import java.util.Map.Entry;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.TokenSdkCommonParamsInterceptorTTNet */
public class TokenSdkCommonParamsInterceptorTTNet implements C12469a {

    /* renamed from: a */
    String f88847a;

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34087q.m109751a(this, aVar);
    }

    public TokenSdkCommonParamsInterceptorTTNet(String str) {
        this.f88847a = str;
    }

    /* renamed from: b */
    public final C12534t mo86747b(C12470a aVar) throws Exception {
        int serverTime = NetworkUtils.getServerTime();
        C12462c a = aVar.mo30456a();
        String str = a.f33098b;
        if (str != null && (str.contains("/passport/token/beat/") || str.contains("/passport/token/change/") || str.contains("/passport/user/logout/"))) {
            Builder addQueryParameter = HttpUrl.parse(a.f33098b).newBuilder().addQueryParameter("ts", String.valueOf(serverTime)).addQueryParameter("app_type", this.f88847a);
            HashMap hashMap = new HashMap();
            NetUtil.putCommonParams(hashMap, true);
            for (Entry entry : hashMap.entrySet()) {
                addQueryParameter.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            a = a.mo30443a().mo30447a(addQueryParameter.build().toString()).mo30449a();
        }
        return aVar.mo30457a(a);
    }
}
