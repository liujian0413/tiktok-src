package com.p280ss.android.ugc.aweme.setting.p1520h;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.h.k */
public final class C37645k extends C25640a {

    /* renamed from: a */
    public static final String f98112a;

    /* renamed from: b */
    public CommonApi f98113b = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class));

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/contact/shield/");
        f98112a = sb.toString();
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
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
                HashMap hashMap = new HashMap();
                hashMap.put("type", String.valueOf(objArr[0]));
                String str = (String) C37645k.this.f98113b.doGet(C37645k.f98112a, (Map<String, String>) hashMap).execute().f33302b;
                Api.m75214a(str, C37645k.f98112a);
                return str;
            }
        }, 0);
        return true;
    }
}
