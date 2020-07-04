package com.bytedance.common.wschannel.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.wschannel.C9758c;

public abstract class AbsMessengerService extends Service implements C6310a {

    /* renamed from: a */
    protected C6309f f26528a;

    /* renamed from: b */
    private Messenger f26529b;

    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    private void m28757a() {
        C9758c.m28776a(getApplication(), (C9752a) null);
    }

    public void onCreate() {
        m28757a();
        this.f26528a = new C6309f(this);
        this.f26529b = new Messenger(this.f26528a);
    }

    public IBinder onBind(Intent intent) {
        return this.f26529b.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
