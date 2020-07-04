package com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.miniapp.anchor.AnchorApi;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33347a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.f */
public final class C33304f extends C33301c<GameInfo, C33347a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85440a(final int i, final Object... objArr) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return AnchorApi.m107701a(String.valueOf(objArr[1]), i, 20);
            }
        }, 0);
    }
}
