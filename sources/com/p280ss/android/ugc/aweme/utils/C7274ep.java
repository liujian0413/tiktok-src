package com.p280ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.ep */
public final class C7274ep implements C7162m {

    /* renamed from: a */
    private static Field f20341a;

    /* renamed from: b */
    private static long f20342b;

    /* renamed from: c */
    private static volatile boolean f20343c;

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        if (VERSION.SDK_INT < 26) {
            m22780f();
        }
    }

    /* renamed from: b */
    public final void mo18612b() {
        if (VERSION.SDK_INT < 26) {
            m22779e();
        }
    }

    /* renamed from: f */
    private static void m22780f() {
        if (f20342b > 0) {
            try {
                if (f20341a == null) {
                    Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
                    f20341a = declaredField;
                    declaredField.setAccessible(true);
                }
                f20341a.set(null, Long.valueOf(f20342b));
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: e */
    private static void m22779e() {
        try {
            if (f20341a == null) {
                Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
                f20341a = declaredField;
                declaredField.setAccessible(true);
            }
            f20342b = ((Long) f20341a.get(null)).longValue();
            f20341a.set(null, Long.valueOf(Long.MAX_VALUE));
        } catch (Exception e) {
            if (VERSION.SDK_INT < 21) {
                StringBuilder sb = new StringBuilder();
                try {
                    for (Field field : Class.forName("java.lang.Daemons").getDeclaredFields()) {
                        sb.append(field.toString());
                        sb.append(", ");
                    }
                } catch (ClassNotFoundException unused) {
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    C6921a.m21562b("SystemCrashManager", sb.toString());
                }
            }
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: d */
    public static void m22778d() {
        Class cls;
        Object obj;
        if (VERSION.SDK_INT >= 28) {
            C6921a.m21562b("WatchDogKiller", "stopWatchDog, do not support after Android P, just return");
        } else if (f20343c) {
            C6921a.m21562b("WatchDogKiller", "stopWatchDog, already stopped, just return");
        } else {
            f20343c = true;
            C6921a.m21562b("WatchDogKiller", "stopWatchDog, try to stop watchdog");
            try {
                cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
                Field declaredField = cls.getDeclaredField("INSTANCE");
                declaredField.setAccessible(true);
                obj = declaredField.get(null);
                Field declaredField2 = cls.getSuperclass().getDeclaredField("thread");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, null);
            } catch (Throwable th) {
                String str = "WatchDogKiller";
                StringBuilder sb = new StringBuilder("stopWatchDog, stop occur error:");
                sb.append(th);
                C6921a.m21562b(str, sb.toString());
                C6921a.m21559a(th);
            }
        }
    }
}
