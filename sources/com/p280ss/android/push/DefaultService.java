package com.p280ss.android.push;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: com.ss.android.push.DefaultService */
public class DefaultService extends IntentService {
    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public DefaultService() {
        super("DefaultService");
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }
}
