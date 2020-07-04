package com.p280ss.android.ugc.aweme.app.api;

import com.bytedance.frameworks.baselib.network.http.retrofit.C10180c;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12516p.C12518a;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.p280ss.android.ugc.aweme.app.api.p1022a.C22806a;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor;
import com.p280ss.android.ugc.aweme.services.TTRetrofit;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.app.api.j */
public final class C22838j {
    /* renamed from: a */
    public static RuntimeException m75277a(ExecutionException executionException) throws Exception {
        return C23268a.getCompatibleException(executionException);
    }

    /* renamed from: a */
    public static C12516p m75274a(String str) {
        return m75275a(str, RetrofitFactory.allCommonConvertFactories(), RetrofitFactory.allCommonCallAdapters(), RetrofitFactory.allCommonInterceptor(null));
    }

    /* renamed from: b */
    public static C12516p m75278b(String str) {
        return m75275a(str, RetrofitFactory.allCommonConvertFactories(), RetrofitFactory.allCommonCallAdapters(), Arrays.asList(new C12469a[]{new SsInterceptor(), new TTNetInitInterceptor()}));
    }

    /* renamed from: a */
    public static IRetrofit m75276a(String str, List<C12469a> list) {
        return new TTRetrofit(str, list);
    }

    /* renamed from: b */
    public static C12516p m75279b(String str, List<C12469a> list) {
        return m75275a(str, RetrofitFactory.allCommonConvertFactories(), RetrofitFactory.allCommonCallAdapters(), RetrofitFactory.allCommonInterceptor(list));
    }

    /* renamed from: a */
    private static C12516p m75275a(String str, List<C12476a> list, List<C12468a> list2, List<C12469a> list3) {
        C12518a aVar = new C12518a();
        List<C12476a> sortConverterFactory = RetrofitFactory.sortConverterFactory(RetrofitFactory.sortConverterFactory(list, C22856r.class), C22806a.class);
        if (!C23477d.m77081a((Collection<T>) sortConverterFactory)) {
            for (C12476a a : sortConverterFactory) {
                aVar.mo30501a(a);
            }
        }
        if (!C23477d.m77081a((Collection<T>) list2)) {
            for (C12468a a2 : list2) {
                aVar.mo30499a(a2);
            }
        }
        aVar.mo30503a((Executor) new C10180c());
        aVar.mo30502a(str);
        if (!C23477d.m77081a((Collection<T>) list3)) {
            for (C12469a a3 : list3) {
                aVar.mo30500a(a3);
            }
        }
        aVar.mo30498a((C12460a) new C22853o());
        return aVar.mo30504a();
    }
}
