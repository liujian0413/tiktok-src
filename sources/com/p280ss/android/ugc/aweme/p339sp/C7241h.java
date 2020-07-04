package com.p280ss.android.ugc.aweme.p339sp;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.sp.h */
public final class C7241h extends Instrumentation {

    /* renamed from: a */
    private static Field f20250a;

    /* renamed from: b */
    private Instrumentation f20251b;

    static {
        try {
            Field declaredField = Class.forName("android.content.ContextWrapper").getDeclaredField("mBase");
            f20250a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        } catch (ClassNotFoundException unused2) {
        }
    }

    public C7241h(Instrumentation instrumentation) {
        this.f20251b = instrumentation;
    }

    public final void callActivityOnDestroy(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    public final void callActivityOnPause(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    public final void callActivityOnRestart(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    public final void callActivityOnResume(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    public final void callActivityOnStart(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    public final void callActivityOnStop(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    public final void callActivityOnUserLeaving(Activity activity) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    public final void callApplicationOnCreate(Application application) {
        if (this.f20251b != null) {
            this.f20251b.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    /* renamed from: a */
    private static void m22679a(Activity activity) {
        try {
            if (f20250a != null && !(((Context) f20250a.get(activity)) instanceof C7240g)) {
                f20250a.set(activity, new C7240g(activity.getBaseContext()));
            }
        } catch (Exception unused) {
        }
    }

    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        if (this.f20251b != null) {
            this.f20251b.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        if (this.f20251b != null) {
            return this.f20251b.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        m22679a(activity);
        if (this.f20251b != null) {
            this.f20251b.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f20251b == null) {
            return super.newActivity(classLoader, str, intent);
        }
        return this.f20251b.newActivity(classLoader, str, intent);
    }

    public final Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        if (this.f20251b != null) {
            return this.f20251b.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws IllegalAccessException, InstantiationException {
        if (this.f20251b != null) {
            return this.f20251b.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
