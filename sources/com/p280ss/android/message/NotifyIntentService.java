package com.p280ss.android.message;

import android.app.IntentService;
import android.app.Notification.Builder;
import android.content.Intent;
import android.os.Build.VERSION;
import com.p280ss.android.message.p885a.C19821g;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.message.NotifyIntentService */
public class NotifyIntentService extends IntentService {
    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
    }

    public NotifyIntentService() {
        super("NotifyIntentService");
    }

    public void onDestroy() {
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        try {
            if (VERSION.SDK_INT >= 18 && C20090b.m66187a().mo53748D()) {
                if (!C19821g.m65450c() || !C19821g.m65447b()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    startForeground(1, new Builder(getApplicationContext()).setSmallIcon(R.drawable.status_icon).build());
                }
            }
        } catch (Throwable unused) {
        }
    }
}
