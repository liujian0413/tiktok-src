package com.p280ss.android.ugc.aweme.qrcode.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.model.g */
public final class C37088g extends C34028a<ScanMaterialResponse> {

    /* renamed from: com.ss.android.ugc.aweme.qrcode.model.g$a */
    public static final class C37089a implements Callable<ScanMaterialResponse> {

        /* renamed from: a */
        final /* synthetic */ String f97044a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ScanMaterialResponse call() throws Exception {
            return QRCodeApi.m119047a(this.f97044a);
        }

        C37089a(String str) {
            this.f97044a = str;
        }
    }

    /* renamed from: a */
    public final void mo93539a(String str) {
        C7573i.m23587b(str, "materialId");
        C23397p.m76735a().mo60807a(this.mHandler, new C37089a(str), 0);
    }
}
