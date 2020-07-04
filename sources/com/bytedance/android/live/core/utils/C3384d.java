package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.p022v4.app.FragmentActivity;

/* renamed from: com.bytedance.android.live.core.utils.d */
public final class C3384d {
    /* renamed from: a */
    public static Activity m12589a(Context context) {
        while (context != null) {
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

    /* renamed from: b */
    public static FragmentActivity m12590b(Context context) {
        while (context != null) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
