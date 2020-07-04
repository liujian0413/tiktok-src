package com.bytedance.apm.util;

import android.app.Application;
import android.content.Context;

/* renamed from: com.bytedance.apm.util.a */
public final class C6290a {
    /* renamed from: a */
    public static Application m19516a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        return (Application) context.getApplicationContext();
    }
}
