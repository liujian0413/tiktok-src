package com.bytedance.scene;

import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.bytedance.scene.v */
public final class C12701v {

    /* renamed from: a */
    private static String f33697a = "SingeProcessMessengerHandler";

    /* renamed from: b */
    private Messenger f33698b;

    private C12701v(Messenger messenger) {
        this.f33698b = messenger;
    }

    /* renamed from: a */
    public static C12701v m36914a(Intent intent) {
        return m36915a(intent, f33697a);
    }

    /* renamed from: a */
    public final void mo31158a(Object obj) {
        Message obtain = Message.obtain();
        obtain.obj = obj;
        try {
            this.f33698b.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    private static C12701v m36915a(Intent intent, String str) {
        Messenger messenger = (Messenger) intent.getParcelableExtra(str);
        if (messenger != null) {
            return new C12701v(messenger);
        }
        return null;
    }
}
