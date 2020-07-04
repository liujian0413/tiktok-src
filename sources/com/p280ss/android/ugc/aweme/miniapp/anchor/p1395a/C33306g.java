package com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.miniapp.anchor.AnchorApi;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33349c;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.g */
public final class C33306g extends C33300b<MediumInfo, C33349c> {

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.g$a */
    static final class C33307a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f86991a;

        C33307a(int i) {
            this.f86991a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33349c call() {
            return AnchorApi.m107704b(this.f86991a, 20);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85439a(int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new C33307a(i), 0);
    }
}
