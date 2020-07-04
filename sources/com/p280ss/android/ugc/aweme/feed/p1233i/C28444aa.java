package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.i.aa */
public final class C28444aa extends C25640a<Object> {

    /* renamed from: com.ss.android.ugc.aweme.feed.i.aa$a */
    static final class C28445a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f74996a;

        C28445a(Object[] objArr) {
            this.f74996a = objArr;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m93489a());
        }

        /* renamed from: a */
        private boolean m93489a() {
            Object obj = this.f74996a[0];
            if (obj != null) {
                String str = (String) obj;
                Object obj2 = this.f74996a[1];
                if (obj2 != null) {
                    int intValue = ((Integer) obj2).intValue();
                    Object obj3 = this.f74996a[2];
                    if (obj3 != null) {
                        int intValue2 = ((Integer) obj3).intValue();
                        Object obj4 = this.f74996a[3];
                        if (obj4 != null) {
                            int intValue3 = ((Integer) obj4).intValue();
                            Object obj5 = this.f74996a[4];
                            if (obj5 != null) {
                                int intValue4 = ((Integer) obj5).intValue();
                                Object obj6 = this.f74996a[5];
                                if (obj6 != null) {
                                    AwemeStatsApi.m92731a(str, intValue, intValue2, intValue3, intValue4, ((Long) obj6).longValue());
                                    return true;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 6) {
            C23397p.m76735a().mo60807a(this.mHandler, new C28445a(objArr), 0);
        }
        return true;
    }
}
