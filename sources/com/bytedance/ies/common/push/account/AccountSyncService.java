package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountSyncService extends Service {

    /* renamed from: a */
    private static C10729c f28668a;

    /* renamed from: b */
    private static final Object f28669b = new Object();

    public void onCreate() {
        synchronized (f28669b) {
            if (f28668a == null) {
                f28668a = new C10729c(getApplicationContext(), true);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return f28668a.getSyncAdapterBinder();
    }
}
