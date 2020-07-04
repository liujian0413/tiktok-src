package com.bytedance.jirafast.net;

import com.bytedance.jirafast.utils.C12068a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.bytedance.jirafast.net.a */
public final class C12013a {
    /* renamed from: a */
    public static JIRAApi m35082a() {
        return (JIRAApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C12068a.m35194a().mo29742a(C12068a.f32149x)).create(JIRAApi.class);
    }
}
