package com.p280ss.android.ugc.aweme.qrcode.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.model.f */
public final class C37086f extends C34028a<C37085e> {

    /* renamed from: com.ss.android.ugc.aweme.qrcode.model.f$a */
    public static final class C37087a implements Callable<C37085e> {
        C37087a() {
        }

        /* renamed from: a */
        private static C37085e m119229a() throws Exception {
            return QRCodeApi.m119049a();
        }

        public final /* synthetic */ Object call() {
            return m119229a();
        }
    }

    /* renamed from: a */
    public final void mo93537a() {
        C23397p.m76735a().mo60807a(this.mHandler, new C37087a(), 0);
    }
}
