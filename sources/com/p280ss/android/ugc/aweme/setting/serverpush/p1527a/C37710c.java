package com.p280ss.android.ugc.aweme.setting.serverpush.p1527a;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.c */
public final class C37710c extends C25652b<C25640a<BaseResponse>, C37708a> {
    public C37710c() {
        mo66536a(new C25640a<BaseResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 2 || objArr.length == 3) {
                    return true;
                }
                return false;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final String str = objArr[0];
                final int intValue = objArr[1].intValue();
                C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        if (objArr.length == 2) {
                            return PushSettingsApiManager.m120592b(str, intValue);
                        }
                        return PushSettingsApiManager.m120589a(str, intValue, (String) objArr[2]);
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        BaseResponse baseResponse;
        if (this.f67571b == null) {
            baseResponse = null;
        } else {
            baseResponse = (BaseResponse) this.f67571b.getData();
        }
        if (baseResponse != null && this.f67572c != null) {
            ((C37708a) this.f67572c).bI_();
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C37708a) this.f67572c).bJ_();
        }
    }
}
