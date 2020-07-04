package com.p280ss.android.ugc.aweme.feed.api;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.p638c.C12469a;
import com.p280ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.api.f */
public final class C28218f {

    /* renamed from: a */
    public static final C28218f f74333a = new C28218f();

    private C28218f() {
    }

    /* renamed from: a */
    public static List<C12469a> m92758a() {
        ArrayList arrayList = new ArrayList();
        if (C6399b.m19944t()) {
            arrayList.add(new FeedRetryInterceptorTTNet());
        }
        arrayList.add(new DetectInterceptor());
        arrayList.add(new FetchNetworkInfoInterceptor());
        return arrayList;
    }
}
