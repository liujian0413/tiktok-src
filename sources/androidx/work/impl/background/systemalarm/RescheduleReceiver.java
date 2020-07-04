package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.impl.C1544f;

public class RescheduleReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 23) {
            C1544f c = C1544f.m7577c();
            if (c != null) {
                c.mo6800a(goAsync());
            }
            return;
        }
        context.startService(C1522b.m7521b(context));
    }
}
