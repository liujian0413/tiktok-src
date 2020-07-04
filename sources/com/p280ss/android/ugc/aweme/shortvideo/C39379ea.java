package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ea */
public final class C39379ea {
    /* renamed from: a */
    public static boolean m125809a() {
        if (C30538p.m99745a() || C35563c.f93260w.mo57090c() || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
            return false;
        }
        return true;
    }
}
