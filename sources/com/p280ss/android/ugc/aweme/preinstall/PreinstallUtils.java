package com.p280ss.android.ugc.aweme.preinstall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.splash.C41736a;

/* renamed from: com.ss.android.ugc.aweme.preinstall.PreinstallUtils */
public final class PreinstallUtils {

    /* renamed from: com.ss.android.ugc.aweme.preinstall.PreinstallUtils$KillApplicationReceiver */
    public static class KillApplicationReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            new Handler().post(new Runnable() {
                public final void run() {
                    Process.killProcess(Process.myPid());
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m115082a(Context context) {
        return false;
    }

    /* renamed from: b */
    public static void m115083b(Context context) {
        ServiceManager.get().getService(C41736a.class);
    }
}
