package com.p280ss.android.ugc.aweme.setting.serverpush.p1527a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.f */
public final class C37719f extends C25652b<C25640a<BaseResponse>, C37708a> {
    public C37719f() {
        mo66536a(new C25640a<BaseResponse>() {

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.f$1$a */
            static final class C37721a<V> implements Callable<Object> {

                /* renamed from: a */
                final /* synthetic */ Object[] f98239a;

                C37721a(Object[] objArr) {
                    this.f98239a = objArr;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public BaseResponse call() {
                    Object obj = this.f98239a[0];
                    if (obj != null) {
                        String str = (String) obj;
                        Object obj2 = this.f98239a[1];
                        if (obj2 != null) {
                            return PushSettingsApiManager.m120590a(str, (String) obj2);
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
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
                C23397p.m76735a().mo60807a(this.mHandler, new C37721a(objArr), 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        C37708a aVar = (C37708a) this.f67572c;
        if (aVar != null) {
            aVar.bI_();
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        C37708a aVar = (C37708a) this.f67572c;
        if (aVar != null) {
            aVar.bJ_();
        }
    }
}
