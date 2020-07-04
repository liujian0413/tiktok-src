package com.bytedance.apm.p238b.p465a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.apm.b.a.a */
public final class C9567a implements InvocationHandler {

    /* renamed from: a */
    Object f26138a;

    /* renamed from: b */
    C9570d f26139b;

    /* renamed from: c */
    public IBinder f26140c;

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (this.f26140c != null && method.getName().equals("asBinder")) {
            return this.f26140c;
        }
        this.f26139b.mo23884a(obj, method, objArr);
        return method.invoke(this.f26138a, objArr);
    }

    public C9567a(IBinder iBinder, Class<?> cls, C9570d dVar, IBinder iBinder2) {
        try {
            this.f26138a = cls.getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{iBinder});
            this.f26139b = dVar;
            this.f26140c = iBinder2;
        } catch (Exception unused) {
        }
    }
}
