package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {

    /* renamed from: a */
    private C10728b f28670a;

    public void onCreate() {
        this.f28670a = new C10728b(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f28670a.getIBinder();
    }
}
