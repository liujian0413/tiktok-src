package com.p280ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.p759ac.C15461d;
import java.util.HashMap;
import java.util.Map.Entry;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.CommonParamsInterceptorTTNet */
public class CommonParamsInterceptorTTNet implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34077g.m109745a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m109719b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        HttpUrl parse = HttpUrl.parse(a.f33098b);
        if (parse != null) {
            Builder newBuilder = parse.newBuilder();
            HashMap hashMap = new HashMap();
            NetUtil.putCommonParams(hashMap, true);
            for (Entry entry : hashMap.entrySet()) {
                newBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String httpUrl = newBuilder.build().toString();
            C15461d.m45272a(httpUrl);
            a = a.mo30443a().mo30447a(httpUrl).mo30449a();
        }
        return aVar.mo30457a(a);
    }
}
