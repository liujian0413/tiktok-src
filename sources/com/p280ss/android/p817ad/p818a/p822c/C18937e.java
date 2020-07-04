package com.p280ss.android.p817ad.p818a.p822c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ad.a.c.e */
public final class C18937e {

    /* renamed from: a */
    public static C18939f f51039a;

    /* renamed from: b */
    private static Handler f51040b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m61801a(Context context, int i) {
        m61802a(context, i, 0);
    }

    /* renamed from: a */
    private static void m61802a(Context context, int i, int i2) {
        m61803a(context, i, 0, 1500);
    }

    /* renamed from: a */
    private static void m61803a(Context context, int i, int i2, int i3) {
        String str;
        Drawable drawable;
        if (context != null) {
            if (i > 0) {
                str = context.getString(i);
            } else {
                str = "";
            }
            if (i2 > 0) {
                drawable = context.getResources().getDrawable(i2);
            } else {
                drawable = null;
            }
            m61804a(context, str, drawable, 1500);
        }
    }

    /* renamed from: a */
    private static void m61804a(Context context, final String str, final Drawable drawable, final int i) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            f51040b.post(new Runnable() {
                public final void run() {
                    try {
                        if (C18937e.f51039a != null) {
                            C18937e.f51039a.cancel();
                        }
                        C18939f a = C18939f.m61805a(applicationContext, str, i);
                        C18937e.f51039a = a;
                        a.mo50326a(17);
                        C18937e.f51039a.mo50327a(drawable);
                        C18937e.f51039a.show();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
