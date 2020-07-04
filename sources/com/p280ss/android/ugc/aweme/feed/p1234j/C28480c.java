package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.feed.helper.C28417e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.j.c */
public final class C28480c {
    /* renamed from: a */
    public static JSONObject m93600a(Aweme aweme, int i, String str, String str2) {
        return C28417e.m93410a(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, i), str, str2, aweme);
    }
}
