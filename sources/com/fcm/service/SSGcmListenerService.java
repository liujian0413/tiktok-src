package com.fcm.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.p280ss.android.message.p885a.C19821g;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.pushmanager.C20074g;

public class SSGcmListenerService extends FirebaseMessagingService {
    public static void handleMessage(Context context, int i, String str, int i2, String str2) {
        C14688a.m42503a(context, i, str, i2, str2);
    }

    public void onNewToken(String str) {
        super.onNewToken(str);
        sendToken(str);
    }

    private void sendToken(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this, FcmRegistrationJobIntentService.class);
                intent.putExtra("key_token", str);
                FcmRegistrationJobIntentService.enqueueWork(this, intent);
            }
        } catch (Throwable th) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb = new StringBuilder("Error = ");
                sb.append(th.getMessage());
                PushDependManager.inst().loggerD("SSGcmListenerService", sb.toString());
            }
        }
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            handleMessage(this, 1, (String) remoteMessage.mo47290a().get(C20074g.m66106b().mo53676a()), 5);
        } catch (Exception e) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("SSGcmListenerService", e.getMessage());
            }
        }
    }

    public static void handleMessage(Context context, int i, String str, int i2) {
        handleMessage(context, i, str, i2, null);
    }

    public static void handleMessage$___twin___(Context context, int i, String str, int i2, String str2) {
        if (context != null && !C6319n.m19593a(str)) {
            try {
                Intent intent = new Intent("com.ss.android.fcm.message");
                intent.setPackage(context.getPackageName());
                intent.putExtra("message_type", i);
                intent.putExtra("message_obj", str);
                intent.putExtra("message_from", i2);
                intent.putExtra("message_extra", str2);
                C19821g.m65443a(context, intent);
            } catch (Exception unused) {
            }
        }
    }
}
