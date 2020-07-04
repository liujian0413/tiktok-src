package p1904uk.p1905co.senab.photoview;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: uk.co.senab.photoview.a */
public final class C48873a {
    /* renamed from: b */
    private static int m150813b(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: c */
    private static int m150815c(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: a */
    public static int m150811a(int i) {
        if (VERSION.SDK_INT >= 11) {
            return m150815c(i);
        }
        return m150813b(i);
    }

    /* renamed from: b */
    private static void m150814b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m150812a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            m150814b(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
