package com.p280ss.android.ugc.awemepushlib.p1715os.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.common.C6906g;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra("type", -1);
            if (intExtra != -1) {
                ((NotificationManager) context.getSystemService("notification")).cancel(intExtra);
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("contentIntentURI");
            if ("notification_clicked".equals(action) && intent2 != null) {
                try {
                    intent2.getDataString();
                    context.startActivity(intent2);
                } catch (Exception unused) {
                }
            }
            if ("notification_cancelled".equals(action)) {
                Map map = null;
                if (intent2 != null) {
                    map = (Map) intent2.getSerializableExtra("log_data_extra_to_adsapp");
                }
                C6906g.m21515a("push_clear", map);
            }
        }
    }
}
