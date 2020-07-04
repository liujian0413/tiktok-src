package com.p280ss.android.ugc.aweme.report.model;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.report.api.ReportApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.report.model.a */
public final class C37197a extends C25640a {

    /* renamed from: a */
    public ReportApi f97319a = ((ReportApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(ReportApi.class));

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C37197a.this.f97319a.voteForCommunityDiscipline((String) objArr[0], ((Integer) objArr[1]).intValue()).get();
                return null;
            }
        }, 0);
        return true;
    }
}
