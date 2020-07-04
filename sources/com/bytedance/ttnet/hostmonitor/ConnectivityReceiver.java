package com.bytedance.ttnet.hostmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConnectivityReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        try {
            Logger.m37870c("HostMonitor", "onReceive");
            ConnectionType b = HostMonitor.m37854b(context);
            String str2 = "HostMonitor";
            if (b == ConnectionType.NONE) {
                str = "connection unavailable";
            } else {
                StringBuilder sb = new StringBuilder("connection available via ");
                sb.append(b);
                str = sb.toString();
            }
            Logger.m37870c(str2, str);
        } catch (Throwable unused) {
        }
    }
}
