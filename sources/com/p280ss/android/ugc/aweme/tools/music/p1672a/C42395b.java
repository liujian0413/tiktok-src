package com.p280ss.android.ugc.aweme.tools.music.p1672a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.settings.IAVSettingsService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.b */
public final class C42395b {
    /* renamed from: a */
    public static final int m134788a() {
        if (C6399b.m19944t()) {
            return 1;
        }
        IAVSettingsService avSettingsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService();
        C7573i.m23582a((Object) avSettingsService, "ServiceManager.get().get…java).avSettingsService()");
        return avSettingsService.getEditPageMusicPanelOptimization();
    }
}
