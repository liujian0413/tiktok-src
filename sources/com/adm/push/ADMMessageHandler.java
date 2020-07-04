package com.adm.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.message.p885a.C19821g;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.monitor.C20084d;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static long sLastSendTokenTimeStamp;
    private static String sLastToken;
    private Handler mHandler;

    public static class Receiver extends ADMMessageReceiver {
        public Receiver() {
            super(ADMMessageHandler.class);
        }
    }

    /* renamed from: com.adm.push.ADMMessageHandler$a */
    static class C1651a extends Handler {

        /* renamed from: a */
        private final Context f6075a;

        C1651a(Context context) {
            super(Looper.getMainLooper());
            this.f6075a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    try {
                        String str = (String) message.obj;
                        ADMMessageHandler.handleMessage(this.f6075a, 0, str, 14);
                        C1652a.m8054a(this.f6075a, str, 2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("label", "get_token");
                        jSONObject.put("type", 14);
                        jSONObject.put("token", str);
                        PushDependManager.inst().sendMonitor(this.f6075a, "ss_push", jSONObject);
                        return;
                    } catch (Throwable th) {
                        if (PushDependManager.inst().loggerDebug()) {
                            StringBuilder sb = new StringBuilder("Error = ");
                            sb.append(th.getMessage());
                            PushDependManager.inst().loggerD("AdmPush", sb.toString());
                        }
                        return;
                    }
                case 2:
                    try {
                        String str2 = (String) message.obj;
                        C20084d.m66144a(14, 102, (String) message.obj, "注册通道时，通道返回ERROR");
                        ADMMessageHandler.handleMessage(this.f6075a, 2, str2, 14);
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("label", "onRegistrationError");
                            jSONObject2.put("type", 14);
                            jSONObject2.put("errorId", str2);
                            PushDependManager.inst().sendMonitor(this.f6075a, "ss_push", jSONObject2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable unused2) {
                        break;
                    }
            }
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new C1651a(getApplicationContext());
        }
        return this.mHandler;
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp >= 2000 || !C6319n.m19594a(str, sLastToken)) {
            sLastSendTokenTimeStamp = currentTimeMillis;
            sLastToken = str;
            sendToken(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onRegistrationError: ");
            sb.append(str);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
        getHandler().obtainMessage(2, str).sendToTarget();
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("unregisterPush: ");
            sb.append(str);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
    }

    private void sendToken(String str) {
        try {
            StringBuilder sb = new StringBuilder("getToken = ");
            sb.append(str);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
            if (TextUtils.isEmpty(str)) {
                C20084d.m66144a(14, 102, "0", "token 为空");
            } else {
                getHandler().obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb2 = new StringBuilder("Error = ");
                sb2.append(th.getMessage());
                PushDependManager.inst().loggerD("AdmPush", sb2.toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.adm.push.ADMMessageHandler] */
    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        if (intent != null) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb = new StringBuilder("onMessage: ");
                sb.append(intent);
                PushDependManager.inst().loggerD("AdmPush", sb.toString());
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    handleMessage(this, 1, extras.getString(C20074g.m66106b().mo53676a()), 14);
                } catch (Exception e) {
                    if (PushDependManager.inst().loggerDebug()) {
                        PushDependManager.inst().loggerD("AdmPush", e.getMessage());
                    }
                }
            }
        }
    }

    public void onStart(Intent intent, int i) {
        if (intent == null) {
            intent = new Intent();
            intent.setAction("");
        }
        ADMMessageHandler.super.onStart(intent, i);
    }

    public static void handleMessage(Context context, int i, String str, int i2) {
        handleMessage(context, i, str, i2, null);
    }

    public static void handleMessage(Context context, int i, String str, int i2, String str2) {
        if (context != null && !C6319n.m19593a(str)) {
            try {
                Intent intent = new Intent("com.ss.android.adm.message");
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
