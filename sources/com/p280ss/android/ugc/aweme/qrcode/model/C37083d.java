package com.p280ss.android.ugc.aweme.qrcode.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.qrcode.api.RiskApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.model.d */
public final class C37083d extends C34028a<C37082c> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C37082c cVar) {
        super.handleData(cVar);
        this.mData = cVar;
    }

    /* renamed from: a */
    public final void mo93535a(final String str) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return RiskApi.m119050a(str);
            }
        }, 0);
    }
}
