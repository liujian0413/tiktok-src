package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.qt */
public class C15988qt {
    /* renamed from: a */
    public static C15983qo m51996a(String str) throws RemoteException {
        try {
            return new C15989qu((aop) Class.forName(str, false, C15988qt.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
