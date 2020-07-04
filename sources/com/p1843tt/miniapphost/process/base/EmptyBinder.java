package com.p1843tt.miniapphost.process.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.tt.miniapphost.process.base.EmptyBinder */
public class EmptyBinder extends Binder implements IInterface {
    public IBinder asBinder() {
        return this;
    }

    public EmptyBinder() {
        attachInterface(this, "com.tt.miniapphost.process.base.EmptyBinder");
    }
}
