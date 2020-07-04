package com.p280ss.android.ugc.aweme.miniapp.p1396n;

import com.p1843tt.miniapp.manager.UserStatusUpdateManager;
import com.p280ss.android.ugc.aweme.C7162m;

/* renamed from: com.ss.android.ugc.aweme.miniapp.n.a */
public final class C33411a implements C7162m {
    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        UserStatusUpdateManager.getInstance().notifyEnterForeground();
    }

    /* renamed from: b */
    public final void mo18612b() {
        UserStatusUpdateManager.getInstance().notifyEnterBackground();
    }

    public C33411a() {
        UserStatusUpdateManager.getInstance().registerService(new C33412b());
    }
}
