package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.SecUidInterceptorTTNet */
public class SecUidInterceptorTTNet implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34085o.m109749a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m109731b(C12470a aVar) throws Exception {
        String[] strArr;
        C12462c a = aVar.mo30456a();
        HttpUrl parse = HttpUrl.parse(a.f33098b);
        if (parse != null) {
            Builder newBuilder = parse.newBuilder();
            for (String str : C43077dz.f111686a) {
                String queryParameter = parse.queryParameter(str);
                StringBuilder sb = new StringBuilder("sec_");
                sb.append(str);
                if (TextUtils.isEmpty(parse.queryParameter(sb.toString()))) {
                    String b = C43077dz.m136657a().mo104734b(queryParameter, parse.url().toString());
                    if (!TextUtils.isEmpty(b)) {
                        if (C43077dz.m136657a().mo104732a(parse.toString())) {
                            newBuilder.removeAllQueryParameters(str);
                        }
                        StringBuilder sb2 = new StringBuilder("sec_");
                        sb2.append(str);
                        newBuilder.setQueryParameter(sb2.toString(), b);
                    }
                }
            }
            a = a.mo30443a().mo30447a(newBuilder.build().toString()).mo30449a();
        }
        return aVar.mo30457a(a);
    }
}
