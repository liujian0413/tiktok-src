package com.p280ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.ss.android.ugc.aweme.base.activity.g */
public final class C23264g {

    /* renamed from: com.ss.android.ugc.aweme.base.activity.g$a */
    static class C23265a implements InvocationHandler {

        /* renamed from: a */
        private WeakReference<C23266b> f61293a;

        C23265a(WeakReference<C23266b> weakReference) {
            this.f61293a = weakReference;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (objArr[0].booleanValue() && this.f61293a.get() != null) {
                    ((C23266b) this.f61293a.get()).mo60533a();
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.activity.g$b */
    interface C23266b {
        /* renamed from: a */
        void mo60533a();
    }

    /* renamed from: a */
    public static void m76364a(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m76366b(Activity activity) {
        Class[] declaredClasses;
        try {
            Class cls = null;
            for (Class cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Method declaredMethod = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[]{null});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m76365a(Activity activity, C23266b bVar) {
        if (VERSION.SDK_INT >= 21) {
            m76367b(activity, bVar);
        } else {
            m76366b(activity);
        }
    }

    /* renamed from: b */
    private static void m76367b(Activity activity, C23266b bVar) {
        Class[] declaredClasses;
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(activity, new Object[0]);
            Class cls = null;
            for (Class cls2 : Activity.class.getDeclaredClasses()) {
                if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                    cls = cls2;
                }
            }
            Object newProxyInstance = Proxy.newProxyInstance(Activity.class.getClassLoader(), new Class[]{cls}, new C23265a(new WeakReference(bVar)));
            Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls, ActivityOptions.class});
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(activity, new Object[]{newProxyInstance, invoke});
        } catch (Throwable unused) {
        }
    }
}
