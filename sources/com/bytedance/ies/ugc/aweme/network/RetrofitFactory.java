package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.frameworks.baselib.network.http.retrofit.C10180c;
import com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a.C10176a;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12516p.C12518a;
import com.bytedance.retrofit2.p637a.C12459a.C12460a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.rxjava2.adapter.C12531g;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.p280ss.android.account.token.AuthTokenInterceptor;
import com.p280ss.android.ugc.aweme.app.api.C22809b;
import com.p280ss.android.ugc.aweme.app.api.C22817c;
import com.p280ss.android.ugc.aweme.app.api.C22825e;
import com.p280ss.android.ugc.aweme.app.api.C22828f;
import com.p280ss.android.ugc.aweme.app.api.C22853o;
import com.p280ss.android.ugc.aweme.app.api.C22856r;
import com.p280ss.android.ugc.aweme.app.api.p1022a.C22806a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.net.cache.IesCacheInterceptpr;
import com.p280ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.ApiOkInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.CommonParamsInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.LinkSelectorInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.SecUidInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public class RetrofitFactory implements IRetrofitFactory {
    public static List<C12468a> allCommonCallAdapters() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C22809b.m75234a());
        arrayList.add(C22828f.m75266a());
        arrayList.add(C22825e.m75260a());
        arrayList.add(C12531g.m36395a());
        return arrayList;
    }

    public static List<C12476a> allCommonConvertFactories() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C22806a.m75225a());
        arrayList.add(C22856r.m75313a(C10944e.m32113a()));
        arrayList.add(C10176a.m30238a(C10944e.m32113a()));
        return arrayList;
    }

    public C10942c createBuilder(String str) {
        return new C10941b(str);
    }

    public C10943d create(String str) {
        return createBuilder(str).mo26430a();
    }

    public static List<C12469a> allCommonInterceptor(List<C12469a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SsInterceptor());
        arrayList.add(new IesCacheInterceptpr());
        arrayList.add(new ApiAlisgInterceptorTTNet());
        arrayList.add(new LinkSelectorInterceptorTTNet());
        arrayList.add(new ApiOkInterceptorTTNet());
        arrayList.add(new DevicesNullInterceptorTTNet());
        if (C10944e.m32115b() != null && !C23477d.m77081a((Collection<T>) C10944e.m32115b().f29630l)) {
            arrayList.addAll(C10944e.m32115b().f29630l);
        }
        arrayList.add(new CommonParamsInterceptorTTNet());
        arrayList.add(new SecUidInterceptorTTNet());
        arrayList.add(new AuthTokenInterceptor());
        arrayList.add(new TTNetInitInterceptor());
        if (!C23477d.m77081a((Collection<T>) list)) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    static C12516p createRetrofit(C10941b bVar) {
        if (bVar == null) {
            return null;
        }
        C12518a aVar = new C12518a();
        List<C12476a> sortConverterFactory = sortConverterFactory(sortConverterFactory(bVar.f29610f, C22856r.class), C22806a.class);
        if (!C23477d.m77081a((Collection<T>) sortConverterFactory)) {
            for (C12476a a : sortConverterFactory) {
                aVar.mo30501a(a);
            }
        }
        if (!C23477d.m77081a((Collection<T>) bVar.f29611g)) {
            for (C12468a a2 : bVar.f29611g) {
                aVar.mo30499a(a2);
            }
        }
        aVar.mo30503a((Executor) new C10180c());
        aVar.mo30502a(bVar.f29605a);
        if (!bVar.f29608d || C23477d.m77081a((Collection<T>) bVar.f29609e)) {
            aVar.mo30500a((C12469a) new TTNetInitInterceptor());
        } else {
            for (C12469a aVar2 : bVar.f29609e) {
                if (!(aVar2 instanceof CommonParamsInterceptorTTNet) || bVar.f29607c) {
                    aVar.mo30500a(aVar2);
                }
            }
        }
        if (bVar.f29606b) {
            aVar.mo30498a((C12460a) new C22817c());
        } else {
            aVar.mo30498a((C12460a) new C22853o());
        }
        return aVar.mo30504a();
    }

    public static List<C12476a> sortConverterFactory(List<C12476a> list, Class cls) {
        if (C23477d.m77081a((Collection<T>) list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        for (C12476a aVar : list) {
            if (cls.isInstance(aVar)) {
                obj = aVar;
            } else if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (obj != null) {
            arrayList.add(0, obj);
        }
        return arrayList;
    }
}
