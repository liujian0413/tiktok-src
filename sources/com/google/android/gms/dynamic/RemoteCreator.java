package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.common.internal.C15267r;

public abstract class RemoteCreator<T> {

    /* renamed from: a */
    private final String f39624a;

    /* renamed from: b */
    private T f39625b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(String str) {
        this.f39624a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo38690a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo38689a(Context context) throws RemoteCreatorException {
        if (this.f39625b == null) {
            C15267r.m44384a(context);
            Context f = C15181e.m44177f(context);
            if (f != null) {
                try {
                    this.f39625b = mo38690a((IBinder) f.getClassLoader().loadClass(this.f39624a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f39625b;
    }
}
