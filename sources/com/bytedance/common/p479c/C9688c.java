package com.bytedance.common.p479c;

import android.app.ActivityManager.MemoryInfo;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: com.bytedance.common.c.c */
public final class C9688c {

    /* renamed from: a */
    static final C9690a f26428a;

    /* renamed from: com.bytedance.common.c.c$a */
    static class C9690a {
        private C9690a() {
        }

        /* renamed from: a */
        public long mo24055a(MemoryInfo memoryInfo) {
            return 0;
        }

        /* renamed from: a */
        public void mo24056a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: com.bytedance.common.c.c$b */
    static class C9691b extends C9690a {
        private C9691b() {
            super();
        }

        /* renamed from: a */
        public final long mo24055a(MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        /* renamed from: a */
        public final void mo24056a(View view, Drawable drawable) {
            try {
                view.setBackground(drawable);
            } catch (Throwable unused) {
                view.setBackgroundDrawable(drawable);
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f26428a = new C9691b();
        } else {
            f26428a = new C9690a();
        }
    }

    /* renamed from: a */
    public static long m28621a(MemoryInfo memoryInfo) {
        return f26428a.mo24055a(memoryInfo);
    }

    /* renamed from: a */
    public static void m28622a(View view, Drawable drawable) {
        f26428a.mo24056a(view, drawable);
    }
}
