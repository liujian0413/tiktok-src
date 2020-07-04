package com.p280ss.android.socialbase.downloader.impls;

import com.p280ss.android.socialbase.downloader.downloader.C20288m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.socialbase.downloader.impls.l */
public class C20315l {

    /* renamed from: a */
    private static volatile C20288m f54879a;

    /* renamed from: b */
    private static volatile C20288m f54880b;

    /* renamed from: com.ss.android.socialbase.downloader.impls.l$a */
    static class C20316a implements InvocationHandler {

        /* renamed from: a */
        private volatile C20288m f54881a;

        public C20316a(boolean z) {
            if (!z) {
                this.f54881a = new C20325p();
            } else {
                this.f54881a = new C20323o();
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (this.f54881a != null) {
                    return method.invoke(this.f54881a, objArr);
                }
                return null;
            } catch (InvocationTargetException e) {
                e.getCause();
                throw e.getCause();
            }
        }
    }

    /* renamed from: a */
    public static C20288m m67199a(boolean z) {
        if (z) {
            if (f54880b == null) {
                synchronized (C20315l.class) {
                    if (f54880b == null) {
                        f54880b = (C20288m) Proxy.newProxyInstance(C20315l.class.getClassLoader(), new Class[]{C20288m.class}, new C20316a(true));
                    }
                }
            }
            return f54880b;
        }
        if (f54879a == null) {
            synchronized (C20315l.class) {
                if (f54879a == null) {
                    f54879a = (C20288m) Proxy.newProxyInstance(C20315l.class.getClassLoader(), new Class[]{C20288m.class}, new C20316a(false));
                }
            }
        }
        return f54879a;
    }
}
