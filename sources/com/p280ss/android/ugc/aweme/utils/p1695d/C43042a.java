package com.p280ss.android.ugc.aweme.utils.p1695d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.d.a */
public final class C43042a {

    /* renamed from: a */
    private static final String[] f111633a = {"mCurRootView", "mServedView", "mNextServedView"};

    /* renamed from: a */
    private static List<String> m136568a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(f111633a));
        if (C43045c.m136571a() && VERSION.SDK_INT >= 23) {
            arrayList.add("mLastSrvView");
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m136569a(Application application) {
        if (VERSION.SDK_INT >= 19 && VERSION.SDK_INT <= 25) {
            final List a = m136568a((Context) application);
            application.registerActivityLifecycleCallbacks(new C43044b() {
                public final void onActivityDestroyed(Activity activity) {
                    super.onActivityDestroyed(activity);
                    C43042a.m136570a(activity, a);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m136570a(Context context, List<String> list) {
        Object obj;
        if (context != null && list != null) {
            try {
                obj = (InputMethodManager) context.getApplicationContext().getSystemService("input_method");
            } catch (Throwable unused) {
                obj = null;
            }
            if (obj != null) {
                for (String declaredField : list) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField(declaredField);
                        if (declaredField2 != null) {
                            if (!declaredField2.isAccessible()) {
                                declaredField2.setAccessible(true);
                            }
                            Object obj2 = declaredField2.get(obj);
                            if (obj2 != null) {
                                if (obj2 instanceof View) {
                                    if (((View) obj2).getContext() == context) {
                                        declaredField2.set(obj, null);
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }
}
