package com.p280ss.android.push.window.oppo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.ss.android.push.window.oppo.ScreenReceiver */
public class ScreenReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C20025c.m65968a(context).mo53617a() && C20025c.m65968a(context).f54196k) {
                C20025c.m65968a(context).mo53621d();
            }
        } catch (Exception unused) {
        }
    }
}
