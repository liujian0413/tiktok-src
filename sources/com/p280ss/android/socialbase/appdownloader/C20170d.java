package com.p280ss.android.socialbase.appdownloader;

import android.content.Context;

/* renamed from: com.ss.android.socialbase.appdownloader.d */
public final class C20170d {
    /* renamed from: a */
    public static int m66430a(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "layout", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m66432b(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static int m66434c(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "style", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static int m66435d(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "id", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public static int m66436e(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "color", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static int m66431a(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, "drawable", str2);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m66433b(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, "attr", str2);
        } catch (Exception unused) {
            return 0;
        }
    }
}
