package com.p280ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.ugc.aweme.net.C34103w;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet */
public final class ApiCheckInterceptorTTNet implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34072b.m109743a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t<?> m109715b(C12470a aVar) throws Exception {
        C7573i.m23587b(aVar, "chain");
        C12462c a = aVar.mo30456a();
        C34103w wVar = C34103w.f88868a;
        C7573i.m23582a((Object) a, "request");
        String str = a.f33098b;
        C7573i.m23582a((Object) str, "request.url");
        wVar.mo86756a(str);
        C12534t<?> a2 = aVar.mo30457a(a);
        C7573i.m23582a((Object) a2, "chain.proceed(request)");
        return a2;
    }
}
