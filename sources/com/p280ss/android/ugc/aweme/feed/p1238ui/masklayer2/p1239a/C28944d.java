package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.api.AwemeApi;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d */
public final class C28944d extends C25640a<String> {

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$a */
    static final class C28945a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f76288a;

        C28945a(Object[] objArr) {
            this.f76288a = objArr;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            Object obj = this.f76288a[0];
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                Object obj2 = this.f76288a[1];
                if (obj2 != null) {
                    return AwemeApi.m115431a(aweme, (String) obj2);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new C28945a(objArr), 0);
        return true;
    }
}
