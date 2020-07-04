package com.facebook.ads.internal.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

public class AdsProcessPriorityService extends Service {
    private Messenger mMessenger;

    public void onCreate() {
        super.onCreate();
        this.mMessenger = new Messenger(new Handler());
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }
}
