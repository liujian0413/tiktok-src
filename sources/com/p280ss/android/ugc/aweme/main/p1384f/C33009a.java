package com.p280ss.android.ugc.aweme.main.p1384f;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.PublishDialogFragment;

/* renamed from: com.ss.android.ugc.aweme.main.f.a */
public final class C33009a {
    /* renamed from: a */
    public static boolean m106660a() {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m106659a(FragmentActivity fragmentActivity) {
        if (m106660a() && fragmentActivity != null) {
            Fragment a = fragmentActivity.getSupportFragmentManager().mo2644a("publish");
            if (a instanceof PublishDialogFragment) {
                ((PublishDialogFragment) a).mo96122a();
            }
        }
    }

    /* renamed from: b */
    public static void m106661b(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            Fragment a = fragmentActivity.getSupportFragmentManager().mo2644a("publish");
            if (a instanceof PublishDialogFragment) {
                ((PublishDialogFragment) a).mo96124b();
            }
        }
    }
}
