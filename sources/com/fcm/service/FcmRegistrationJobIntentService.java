package com.fcm.service;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.FcmJobIntentService;
import com.fcm.p738a.C14685a;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import org.json.JSONObject;

public class FcmRegistrationJobIntentService extends FcmJobIntentService {
    public void onHandleWork(Intent intent) {
        String stringExtra = intent.getStringExtra("key_token");
        StringBuilder sb = new StringBuilder("getToken = ");
        sb.append(stringExtra);
        PushDependManager.inst().loggerD("FcmRegistrationJobIntentService", sb.toString());
        try {
            SSGcmListenerService.handleMessage(this, 0, stringExtra, 5);
            C14685a.m42500a((Context) this, stringExtra, 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "get_token");
            jSONObject.put("type", 5);
            jSONObject.put("token", stringExtra);
            PushDependManager.inst().sendMonitor(this, "ss_push", jSONObject);
        } catch (Throwable th) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb2 = new StringBuilder("Error = ");
                sb2.append(th.getMessage());
                PushDependManager.inst().loggerD("FcmRegistrationJobIntentService", sb2.toString());
            }
        }
    }

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, FcmRegistrationJobIntentService.class, (int) BaseNotice.HASHTAG, intent);
    }
}
