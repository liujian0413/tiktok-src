package com.p280ss.android.ugc.aweme.utils.permission;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.permission.PermissionStateReporter.ReportPermissionApi;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.d */
public abstract /* synthetic */ class C43160d {
    /* renamed from: a */
    public static ReportPermissionApi m136881a() {
        return (ReportPermissionApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(ReportPermissionApi.class);
    }
}
