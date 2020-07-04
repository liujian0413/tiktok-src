package com.bytedance.apm.util;

import android.os.Looper;

/* renamed from: com.bytedance.apm.util.q */
public final class C9653q {
    /* renamed from: a */
    public static boolean m28546a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
