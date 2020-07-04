package com.p280ss.android.ugc.trill.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p280ss.android.ugc.trill.abtest.C44974b;

/* renamed from: com.ss.android.ugc.trill.receiver.HomeWatcherReceiver */
public class HomeWatcherReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            if ("homekey".equals(intent.getStringExtra("reason"))) {
                C44974b.m141917a().mo107495b("attract_user_without_login_home");
            }
        }
    }
}
