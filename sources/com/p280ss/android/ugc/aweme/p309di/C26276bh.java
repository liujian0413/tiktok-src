package com.p280ss.android.ugc.aweme.p309di;

import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import javax.p1876a.C47883a;

/* renamed from: com.ss.android.ugc.aweme.di.bh */
public final class C26276bh implements C47373d<IIMService> {

    /* renamed from: a */
    private final C47883a<AwemeApplication> f69270a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public IIMService get() {
        return m86371b(this.f69270a);
    }

    private C26276bh(C47883a<AwemeApplication> aVar) {
        this.f69270a = aVar;
    }

    /* renamed from: a */
    public static C26276bh m86368a(C47883a<AwemeApplication> aVar) {
        return new C26276bh(aVar);
    }

    /* renamed from: b */
    private static IIMService m86371b(C47883a<AwemeApplication> aVar) {
        return m86370a((AwemeApplication) aVar.get());
    }

    /* renamed from: a */
    private static IIMService m86370a(AwemeApplication awemeApplication) {
        return (IIMService) C47375f.m147940a(C26275bg.m86366a(awemeApplication), "Cannot return null from a non-@Nullable @Provides method");
    }
}
