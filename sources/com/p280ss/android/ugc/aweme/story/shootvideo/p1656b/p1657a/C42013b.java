package com.p280ss.android.ugc.aweme.story.shootvideo.p1656b.p1657a;

import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.tools.AVApi;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.b.a.b */
public final class C42013b {

    /* renamed from: a */
    private static final String f109138a;

    /* renamed from: b */
    private static final String f109139b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());
        sb.append("/aweme/v2/user/recommend/");
        f109138a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());
        sb2.append("/aweme/v1/friends/");
        f109139b = sb2.toString();
    }

    /* renamed from: a */
    public static C42012a m133557a(int i, int i2) throws Exception {
        C19290j jVar = new C19290j(f109139b);
        jVar.mo51186a("count", i);
        jVar.mo51186a("cursor", i2);
        return (C42012a) ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(jVar.toString(), C42012a.class, null);
    }
}
