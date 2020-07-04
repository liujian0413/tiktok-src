package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.utils.d */
public final class C43041d {
    /* renamed from: a */
    public static Activity m136566a(Context context) {
        while (context != null && !(context instanceof Application)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m136567a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
