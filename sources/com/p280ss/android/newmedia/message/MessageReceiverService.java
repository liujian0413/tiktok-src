package com.p280ss.android.newmedia.message;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.message.C19846k;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.client.MessageAppManager;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.pushmanager.thirdparty.PushManager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.newmedia.message.MessageReceiverService */
public abstract class MessageReceiverService extends IntentService implements C6310a {

    /* renamed from: a */
    private C6309f f54035a;

    /* renamed from: b */
    private Messenger f54036b;

    /* renamed from: a */
    public abstract void mo53444a(Context context, int i, String str, int i2, String str2);

    public void handleMsg(Message message) {
    }

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    public void onCreate() {
        super.onCreate();
        C20074g.m66102a();
    }

    /* renamed from: a */
    private Handler m65787a() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private Messenger m65790b() {
        if (this.f54036b == null) {
            this.f54035a = new C6309f(this);
            this.f54036b = new Messenger(this.f54035a);
        }
        return this.f54036b;
    }

    /* renamed from: c */
    private void m65791c() {
        boolean z;
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (C20090b.m66187a().mo53746B()) {
            if (VERSION.SDK_INT >= 20) {
                z = powerManager.isInteractive();
            } else {
                z = powerManager.isScreenOn();
            }
            if (!z) {
                powerManager.newWakeLock(268435462, "MessageReceiverService").acquire((long) C20090b.m66187a().mo53747C());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            m65789a(this, intent);
        } catch (Throwable unused) {
        }
    }

    public IBinder onBind(final Intent intent) {
        if (intent != null) {
            C19846k.m65542a().mo53204a(new Runnable() {
                public final void run() {
                    MessageReceiverService.this.onHandleIntent(intent);
                    MessageReceiverService.this.stopSelf();
                }
            });
        }
        return m65790b().getBinder();
    }

    /* renamed from: a */
    private void m65789a(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (C20090b.m66187a().mo53768c()) {
                try {
                    if ("com.ss.android.message".equals(action)) {
                        String handleMySelfPushIntent = MessageAppManager.inst().handleMySelfPushIntent(intent);
                        if (!C6319n.m19593a(handleMySelfPushIntent)) {
                            mo53444a(context, 1, handleMySelfPushIntent, 2, null);
                            m65791c();
                        }
                    } else {
                        if ("com.ss.android.xiaomi.message".equals(action) || "com.ss.android.umeng.message".equals(action) || "com.ss.android.gcm.message".equals(action) || "com.ss.android.hw.message".equals(action) || "com.ss.android.mz.message".equals(action) || "com.ss.android.aliyun.message".equals(action) || "com.ss.android.vivo.message".equals(action) || "com.ss.android.oppo.message".equals(action) || "com.ss.android.adm.message".equals(action) || "com.ss.android.fcm.message".equals(action)) {
                            int intExtra = intent.getIntExtra("message_type", -1);
                            String stringExtra = intent.getStringExtra("message_obj");
                            int intExtra2 = intent.getIntExtra("message_from", -1);
                            String stringExtra2 = intent.getStringExtra("message_extra");
                            if (intExtra != 0) {
                                if (intExtra != 2) {
                                    mo53444a(context, intExtra, stringExtra, intExtra2, stringExtra2);
                                    m65791c();
                                }
                            }
                            m65788a(context, intExtra, stringExtra, intExtra2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public int onStartCommand(final Intent intent, int i, final int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException unused) {
            if (m65787a() == null) {
                C19846k.m65542a().mo53204a(new Runnable() {
                    public final void run() {
                        try {
                            MessageReceiverService.this.onHandleIntent(intent);
                            MessageReceiverService.this.stopSelf(i2);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            return 2;
        } catch (Throwable unused2) {
            return 2;
        }
    }

    /* renamed from: a */
    private static void m65788a(Context context, int i, String str, int i2) {
        if (context != null && ((i == 0 || i == 2) && i == 0)) {
            try {
                C20090b.m66187a();
                if (!TextUtils.isEmpty(C20090b.m66190r())) {
                    PushManager inst = PushManager.inst();
                    Context applicationContext = context.getApplicationContext();
                    C20090b.m66187a();
                    inst.setAlias(applicationContext, C20090b.m66190r(), i2);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
