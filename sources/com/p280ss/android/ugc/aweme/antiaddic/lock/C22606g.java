package com.p280ss.android.ugc.aweme.antiaddic.lock;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.g */
public final class C22606g implements C22594b {
    /* renamed from: a */
    public final boolean mo59240a() {
        return TimeLockRuler.isTeenModeON();
    }

    /* renamed from: b */
    public final boolean mo59242b() {
        return TimeLockRuler.isContentFilterOn();
    }

    /* renamed from: c */
    public final boolean mo59243c() {
        return TimeLockRuler.isInTeenagerModeNewVersion();
    }

    /* renamed from: d */
    public final int mo59244d() {
        return TimeLockRuler.getContentFilterFlag();
    }

    /* renamed from: e */
    public final int mo59245e() {
        return TimeLockRuler.getLockTimeInMin();
    }

    /* renamed from: f */
    public final TimeLockUserSetting mo59246f() {
        return TimeLockRuler.getUserSetting();
    }

    /* renamed from: a */
    public final void mo59239a(Activity activity) {
        TimeLockRuler.disableStartActivityIfNeeded(activity);
    }

    /* renamed from: a */
    public final boolean mo59241a(int i) {
        return TimeLockRuler.isEnableShowTeenageTip(i);
    }
}
