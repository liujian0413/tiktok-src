package com.p280ss.android.ugc.aweme.account.login.forgetpsw.p959a;

import com.p280ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.a.b */
public final class C21366b extends C25640a<FindPswByEmailResponse> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean sendRequest(Object... objArr) {
        boolean sendRequest = super.sendRequest(objArr);
        if (sendRequest) {
            final String valueOf = String.valueOf(objArr[0]);
            C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
                public final Object call() throws Exception {
                    return C21365a.m71846a(valueOf);
                }
            }, 0);
        }
        return sendRequest;
    }
}
