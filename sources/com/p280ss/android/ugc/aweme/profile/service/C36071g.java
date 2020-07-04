package com.p280ss.android.ugc.aweme.profile.service;

import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1708y.C43579c;
import com.p280ss.android.ugc.aweme.services.IBusinessComponentService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.service.g */
public final class C36071g implements C43579c {

    /* renamed from: a */
    public static final C36071g f94309a = new C36071g();

    /* renamed from: b */
    private final /* synthetic */ C43579c f94310b;

    /* renamed from: a */
    public final void mo91800a() {
        this.f94310b.mo91800a();
    }

    /* renamed from: a */
    public final void mo91801a(String str) {
        this.f94310b.mo91801a(str);
    }

    /* renamed from: a */
    public final void mo91802a(String str, String str2, View view, View view2, Context context) {
        this.f94310b.mo91802a(str, str2, view, view2, context);
    }

    private C36071g() {
        Object service = ServiceManager.get().getService(IBusinessComponentService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…onentService::class.java)");
        C43579c labService = ((IBusinessComponentService) service).getLabService();
        C7573i.m23582a((Object) labService, "ServiceManager.get().get…e::class.java).labService");
        this.f94310b = labService;
    }
}
