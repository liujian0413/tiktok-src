package com.p280ss.android.push.daemon;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p280ss.android.push.daemon.C20019g.C20020a;

/* renamed from: com.ss.android.push.daemon.PushService */
public class PushService extends Service {
    public void onCreate() {
        super.onCreate();
        C20016d.m65947a(this);
    }

    public IBinder onBind(Intent intent) {
        return new C20020a() {
        };
    }
}
