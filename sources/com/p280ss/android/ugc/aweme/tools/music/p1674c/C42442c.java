package com.p280ss.android.ugc.aweme.tools.music.p1674c;

import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import java.io.IOException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.c.c */
public final class C42442c {

    /* renamed from: a */
    public static final C42443a f110337a = new C42443a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.c.c$a */
    public static final class C42443a {
        private C42443a() {
        }

        public /* synthetic */ C42443a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m134900a(String str) throws Exception {
            C7573i.m23587b(str, "url");
            Object service = ServiceManager.get().getService(IAVServiceProxy.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
            C35578o applicationService = ((IAVServiceProxy) service).getApplicationService();
            C7573i.m23582a((Object) applicationService, "ServiceManager.get().get…       applicationService");
            if (C42444d.m134901a(applicationService.mo83136c())) {
                String executeGet = NetworkUtils.executeGet(0, str);
                C7573i.m23582a((Object) executeGet, "NetworkUtils.executeGet(0, url)");
                return executeGet;
            }
            throw new IOException();
        }
    }
}
