package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.n */
final class C18344n {

    /* renamed from: a */
    private final Messenger f49833a;

    /* renamed from: b */
    private final zzl f49834b;

    C18344n(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f49833a = new Messenger(iBinder);
            this.f49834b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f49834b = new zzl(iBinder);
            this.f49833a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47261a(Message message) throws RemoteException {
        if (this.f49833a != null) {
            this.f49833a.send(message);
        } else if (this.f49834b != null) {
            this.f49834b.mo47281a(message);
        } else {
            throw new IllegalStateException("Both messengers are null");
        }
    }
}
