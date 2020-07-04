package com.bytedance.ies.dmt.p262ui.p564d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.bytedance.ies.dmt.ui.d.a */
public final class C10787a {
    /* renamed from: a */
    public static Activity m31499a(Context context) {
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
}
