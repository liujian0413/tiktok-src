package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet */
public class DevicesNullInterceptorTTNet implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34079i.m109746a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m109721b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        HttpUrl parse = HttpUrl.parse(a.f33098b);
        Builder newBuilder = parse.newBuilder();
        if (TextUtils.equals("", parse.queryParameter("device_id"))) {
            newBuilder.removeAllQueryParameters("device_id");
            parse = newBuilder.build();
        }
        return aVar.mo30457a(a.mo30443a().mo30447a(parse.toString()).mo30449a());
    }
}
