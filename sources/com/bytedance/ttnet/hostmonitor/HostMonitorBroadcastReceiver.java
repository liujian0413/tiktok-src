package com.bytedance.ttnet.hostmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class HostMonitorBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public final void mo31505a(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(new C12988c(context).mo31526b());
            context.registerReceiver(this, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo31425a(HostStatus hostStatus) {
        StringBuilder sb = new StringBuilder("host status changed: ");
        sb.append(hostStatus);
        Logger.m37869b("HostMonitorBR", sb.toString());
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String b = new C12988c(context).mo31526b();
            if (!(intent == null || b == null)) {
                if (intent.getAction().equals(b)) {
                    mo31425a((HostStatus) intent.getParcelableExtra("HostStatus"));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
