package com.p280ss.android.ugc.aweme.translation.p1680a;

import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34028a;
import com.p280ss.android.ugc.aweme.translation.api.TranslationApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.translation.a.b */
public final class C42618b extends C34028a<C42620c> {
    /* renamed from: a */
    public final void mo104212a(String str, String str2, String str3, String str4, int i) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final int i2 = i;
        C426191 r2 = new Callable() {
            public final Object call() throws Exception {
                return TranslationApi.m135414a(str5, str6, str7, str8, i2);
            }
        };
        a.mo60807a(fVar, r2, 0);
    }
}
