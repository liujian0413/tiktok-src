package com.p280ss.android.ugc.aweme.util;

import android.app.Application;
import com.p280ss.android.ugc.aweme.conan.IConanService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.util.f */
public final class C42877f {

    /* renamed from: a */
    public static final C42877f f111375a = new C42877f();

    private C42877f() {
    }

    /* renamed from: a */
    public static void m136146a() {
        IConanService iConanService = (IConanService) ServiceManager.get().getService(IConanService.class);
        if (iConanService != null) {
            iConanService.stop();
        }
    }

    /* renamed from: a */
    public static void m136147a(Application application, boolean z) {
        C7573i.m23587b(application, "application");
        IConanService iConanService = (IConanService) ServiceManager.get().getService(IConanService.class);
        if (iConanService != null) {
            iConanService.init(application, false);
        }
        if (iConanService != null) {
            iConanService.start();
        }
    }
}
