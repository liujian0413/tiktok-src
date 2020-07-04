package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.i18n.checkprofile.api.CheckProfileManager;
import com.p280ss.android.ugc.aweme.i18n.checkprofile.api.CheckProfileManager.Response;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.c */
public final class C30443c extends C25640a<Response> {
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CheckProfileManager.m99445a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
            }
        }, 0);
        return true;
    }
}
