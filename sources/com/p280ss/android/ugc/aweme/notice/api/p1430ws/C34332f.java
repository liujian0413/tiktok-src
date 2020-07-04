package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.websocket.internal.C45439a;
import com.p280ss.android.websocket.p344ws.p345b.C45449a;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.f */
public final class C34332f implements C7305b {

    /* renamed from: a */
    private final C7305b f89478a = new C34330d();

    /* renamed from: b */
    private final C7305b f89479b = new C34333g();

    /* renamed from: c */
    private final C7305b f89480c;

    /* renamed from: d */
    private final C7305b f89481d = new C34329c();

    /* renamed from: e */
    private final C7305b f89482e;

    public C34332f() {
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class, false);
        if (iIMService != null) {
            this.f89480c = iIMService.getImParser();
        } else {
            this.f89480c = new C45449a();
        }
        this.f89482e = new C34327a();
    }

    /* renamed from: a */
    public final Object mo18093a(C45439a aVar) {
        if (aVar.getMethod() == 1 && aVar.getService() == 1) {
            return this.f89478a.mo18093a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 5) {
            return this.f89480c.mo18093a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 6) {
            return this.f89479b.mo18093a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 7) {
            return this.f89481d.mo18093a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 1010) {
            return this.f89482e.mo18093a(aVar);
        }
        return null;
    }
}
