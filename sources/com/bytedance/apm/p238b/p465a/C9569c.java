package com.bytedance.apm.p238b.p465a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.apm.b.a.c */
public final class C9569c implements InvocationHandler {

    /* renamed from: a */
    IBinder f26142a;

    /* renamed from: b */
    IBinder f26143b;

    /* renamed from: c */
    C9570d f26144c;

    /* renamed from: d */
    Class<?> f26145d;

    /* renamed from: e */
    Class<?> f26146e;

    /* renamed from: a */
    public final C9569c mo23881a(IBinder iBinder) {
        this.f26143b = iBinder;
        return this;
    }

    public C9569c(IBinder iBinder, C9570d dVar) {
        this.f26142a = iBinder;
        this.f26144c = dVar;
        try {
            String a = dVar.mo23883a();
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("$Stub");
            this.f26145d = Class.forName(sb.toString());
            this.f26146e = Class.forName(a);
        } catch (ClassNotFoundException unused) {
        }
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"queryLocalInterface".equals(method.getName())) {
            return method.invoke(this.f26142a, objArr);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{this.f26146e}, new C9567a(this.f26142a, this.f26145d, this.f26144c, this.f26143b));
    }
}
