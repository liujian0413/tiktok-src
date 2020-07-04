package com.p280ss.android.ugc.aweme.crossplatform;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.h */
public final class C25881h {

    /* renamed from: a */
    public static final C25881h f68427a = new C25881h();

    private C25881h() {
    }

    /* renamed from: a */
    public static String m85148a() {
        if (C6399b.m19947w()) {
            Object service = ServiceManager.get().getService(IMainService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…IMainService::class.java)");
            if (((IMainService) service).isTiktokWhite()) {
                return "white";
            }
            return "black";
        } else if (C6399b.m19946v()) {
            return "white";
        } else {
            return "black";
        }
    }
}
