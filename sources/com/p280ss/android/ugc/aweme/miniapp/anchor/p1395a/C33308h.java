package com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.miniapp.anchor.AnchorApi;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33350d;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.h */
public final class C33308h extends C33301c<MediumInfo, C33350d> {

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.h$a */
    static final class C33309a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f86992a;

        /* renamed from: b */
        final /* synthetic */ int f86993b;

        C33309a(Object[] objArr, int i) {
            this.f86992a = objArr;
            this.f86993b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33350d call() {
            return AnchorApi.m107705b(String.valueOf(this.f86992a[1]), 20, this.f86993b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85440a(int i, Object... objArr) {
        C7573i.m23587b(objArr, "params");
        C23397p.m76735a().mo60807a(this.mHandler, new C33309a(objArr, i), 0);
    }
}
