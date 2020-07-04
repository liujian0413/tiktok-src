package com.p280ss.android.message.sswo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.p254b.C6304f;

/* renamed from: com.ss.android.message.sswo.SswoReceiver */
public class SswoReceiver extends BroadcastReceiver {
    public void onReceive(final Context context, final Intent intent) {
        C6304f.submitRunnable(new Runnable() {
            public final void run() {
                SswoReceiver.m65684a(intent, context);
            }
        });
    }

    /* renamed from: a */
    public static void m65684a(Intent intent, Context context) {
        try {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                C19894a.m65685a(context).mo53315c();
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(action) || "android.intent.action.SCREEN_ON".equals(action)) {
                C19894a.m65685a(context).mo53316d();
            }
        } catch (Throwable unused) {
        }
    }
}
