package com.p280ss.android.ugc.aweme.p1711z;

import android.content.Context;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.z.b */
public final class C43582b implements C43581a {
    /* renamed from: a */
    public final String mo105517a(Context context) {
        return ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getLocalLanguage(context);
    }
}
