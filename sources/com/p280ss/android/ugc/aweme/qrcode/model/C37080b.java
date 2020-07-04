package com.p280ss.android.ugc.aweme.qrcode.model;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.model.b */
public class C37080b extends C34028a<C37079a> {
    /* renamed from: a */
    public void mo93531a(String str) {
    }

    /* renamed from: a */
    public boolean mo93532a() {
        return false;
    }

    /* renamed from: b */
    public File mo93533b() {
        return null;
    }

    /* renamed from: a */
    public final void mo93530a(final int i, final String str, String str2) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable(null) {
            public final Object call() throws Exception {
                return QRCodeApi.m119048a(i, str, null);
            }
        }, 0);
    }
}
