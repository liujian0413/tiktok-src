package com.facebook.common.p685b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.common.b.i */
public final class C13285i extends C13281e {

    /* renamed from: a */
    private static C13285i f35180a;

    private C13285i() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static C13285i m38830b() {
        if (f35180a == null) {
            f35180a = new C13285i();
        }
        return f35180a;
    }

    public final void execute(Runnable runnable) {
        if (mo32508a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
