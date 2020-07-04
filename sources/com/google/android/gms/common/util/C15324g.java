package com.google.android.gms.common.util;

import android.content.Context;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.common.util.g */
public final class C15324g {

    /* renamed from: a */
    private static final String[] f39593a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static int f39594b = -1;

    /* renamed from: a */
    public static boolean m44572a(Context context, Throwable th) {
        return m44573a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m44573a(Context context, Throwable th, int i) {
        try {
            C15267r.m44384a(context);
            C15267r.m44384a(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
