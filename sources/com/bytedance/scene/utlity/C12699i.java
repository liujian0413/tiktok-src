package com.bytedance.scene.utlity;

import android.os.Looper;

/* renamed from: com.bytedance.scene.utlity.i */
public final class C12699i {
    /* renamed from: a */
    public static void m36905a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This method must call on main thread");
        }
    }
}
