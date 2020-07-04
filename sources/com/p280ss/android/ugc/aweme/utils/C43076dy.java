package com.p280ss.android.ugc.aweme.utils;

import android.app.KeyguardManager;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.utils.dy */
public final class C43076dy {
    /* renamed from: a */
    public static boolean m136656a() {
        boolean z = false;
        try {
            KeyguardManager keyguardManager = (KeyguardManager) C6399b.m19921a().getSystemService("keyguard");
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
