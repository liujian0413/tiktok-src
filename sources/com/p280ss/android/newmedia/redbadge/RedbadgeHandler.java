package com.p280ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.message.C19846k;

/* renamed from: com.ss.android.newmedia.redbadge.RedbadgeHandler */
public class RedbadgeHandler extends Service implements C6310a {

    /* renamed from: a */
    private C6309f f54043a;

    /* renamed from: b */
    private Messenger f54044b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53451a(Intent intent) {
        C19993i.m65907a(this, intent);
    }

    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
        this.f54043a = new C6309f(this);
        this.f54044b = new Messenger(this.f54043a);
    }

    /* renamed from: b */
    public final void mo53452b(Intent intent) {
        if (intent != null) {
            try {
                if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                    C19973b.m65837a((Context) this).mo53463a(intent.getStringExtra("message_data"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public IBinder onBind(final Intent intent) {
        C19846k.m65542a().mo53204a(new Runnable() {
            public final void run() {
                RedbadgeHandler.this.mo53451a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        });
        return this.f54044b.getBinder();
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        C19846k.m65542a().mo53204a(new Runnable() {
            public final void run() {
                RedbadgeHandler.this.mo53451a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        });
        return super.onStartCommand(intent, i, i2);
    }
}
