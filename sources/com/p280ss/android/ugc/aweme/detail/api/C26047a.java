package com.p280ss.android.ugc.aweme.detail.api;

import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.tools.AVApi;

/* renamed from: com.ss.android.ugc.aweme.detail.api.a */
public final class C26047a {

    /* renamed from: a */
    private static final String f68851a;

    /* renamed from: b */
    private static final String f68852b;

    /* renamed from: a */
    public static C26048b m85569a() throws Exception {
        return (C26048b) ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(new C19290j(f68852b).toString(), C26048b.class, null);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());
        sb.append("/aweme/v1/aweme/react_duet/set/limit/");
        f68851a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());
        sb2.append("/aweme/v1/aweme/react_duet/limit/reference/");
        f68852b = sb2.toString();
    }

    /* renamed from: a */
    public static Void m85570a(String str, String str2, String str3) throws Exception {
        C19290j jVar = new C19290j(f68851a);
        jVar.mo51188a("aweme_id", str);
        jVar.mo51188a("item_duet", str3);
        jVar.mo51188a("item_react", str2);
        ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(jVar.toString(), BaseResponse.class, null);
        return null;
    }
}
