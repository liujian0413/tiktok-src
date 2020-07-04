package com.p280ss.android.ugc.aweme.setting.p1512b;

import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.b.a */
public final class C37584a implements C37704a {
    /* renamed from: a */
    public final void mo59220a(Exception exc) {
        C7573i.m23587b(exc, "e");
        C41530am.m132280a("EnablePreUploadByUser onFailed");
    }

    /* renamed from: a */
    public final void mo59219a(C37723b bVar) {
        C7573i.m23587b(bVar, "settings");
        C41530am.m132280a("EnablePreUploadByUser onSuccess");
        C6711m mVar = new C6711m();
        mVar.mo16146a("enable_pre_upload", (Number) Integer.valueOf(bVar.f98254L));
        ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().updateUserSettings(mVar);
    }
}
