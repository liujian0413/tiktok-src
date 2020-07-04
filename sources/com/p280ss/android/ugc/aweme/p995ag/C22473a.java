package com.p280ss.android.ugc.aweme.p995ag;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.ag.a */
public class C22473a {

    /* renamed from: a */
    private static final String f59920a = "a";

    /* renamed from: b */
    private static Application f59921b;

    /* renamed from: b */
    private static void m74360b(Context context) {
        try {
            f59921b = (Application) Class.forName(context.getApplicationInfo().className).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static void m74361c(Context context) {
        if (f59921b != null) {
            try {
                m74356a(Application.class, (Object) f59921b, "attach", new Class[]{Context.class}, new Object[]{context});
            } catch (Exception unused) {
            }
            f59921b.onCreate();
        }
    }

    /* renamed from: a */
    public static void m74358a(Context context) {
        if (AwemeApplication.m21344c() == null && AwemeApplication.m21341a() == null && context != null && context.getApplicationContext() != null && context.getApplicationInfo() != null && TextUtils.equals(Application.class.getName(), context.getApplicationInfo().className)) {
            Application application = (Application) context.getApplicationContext();
            try {
                m74360b(context);
                m74359a(application, application, f59921b, null);
                m74361c(application.getBaseContext());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static Object m74355a(Context context, Class<?> cls) {
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke(null, new Object[0]);
        if (invoke == null && context != null) {
            Field field = context.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            invoke = declaredField.get(obj);
        }
        return invoke;
    }

    /* renamed from: a */
    private static void m74359a(Context context, Application application, Application application2, String str) {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object a = m74355a(context, cls);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            Application application3 = (Application) declaredField.get(a);
            if (application2 != null && application3 == application) {
                declaredField.set(a, application2);
            }
            if (application2 != null) {
                Field declaredField2 = cls.getDeclaredField("mAllApplications");
                declaredField2.setAccessible(true);
                List list = (List) declaredField2.get(a);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == application) {
                        list.set(i, application2);
                    }
                }
            }
            m74357a(application, application2, (String) null, cls, a);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    /* renamed from: a */
    private static Object m74356a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Exception {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }

    /* renamed from: a */
    private static void m74357a(Application application, Application application2, String str, Class<?> cls, Object obj) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class cls2;
        try {
            cls2 = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls2.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        Field declaredField2 = cls2.getDeclaredField("mResDir");
        declaredField2.setAccessible(true);
        Field field = null;
        try {
            field = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException unused2) {
        }
        String[] strArr = {"mPackages", "mResourcePackages"};
        for (int i = 0; i < 2; i++) {
            Field declaredField3 = cls.getDeclaredField(strArr[i]);
            declaredField3.setAccessible(true);
            for (Entry value : ((Map) declaredField3.get(obj)).entrySet()) {
                Object obj2 = ((WeakReference) value.getValue()).get();
                if (obj2 != null && declaredField.get(obj2) == application) {
                    if (application2 != null) {
                        declaredField.set(obj2, application2);
                    }
                    if (str != null) {
                        declaredField2.set(obj2, str);
                    }
                    if (!(application2 == null || field == null)) {
                        field.set(application2, obj2);
                    }
                }
            }
        }
    }
}
