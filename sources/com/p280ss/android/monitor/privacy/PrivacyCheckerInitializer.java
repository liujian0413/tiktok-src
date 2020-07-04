package com.p280ss.android.monitor.privacy;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.monitor.privacy.PrivacyCheckerInitializer */
public class PrivacyCheckerInitializer implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        PrivacyCheckerService privacyCheckerService = (PrivacyCheckerService) ServiceManager.get().getService(PrivacyCheckerService.class);
        Application application = (Application) context.getApplicationContext();
        String valueOf = String.valueOf(C6781d.m20986d());
        C6399b bVar = C6399b.f18694b;
        bVar.getClass();
        Callable a = C19908a.m65713a(bVar);
        C6399b bVar2 = C6399b.f18694b;
        bVar2.getClass();
        privacyCheckerService.init(application, valueOf, a, C19909b.m65714a(bVar2), C19910c.f53964a, new C19911d(context), C19912e.f53966a);
    }
}
