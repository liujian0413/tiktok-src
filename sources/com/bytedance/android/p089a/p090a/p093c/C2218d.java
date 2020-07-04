package com.bytedance.android.p089a.p090a.p093c;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.a.a.c.d */
abstract class C2218d implements Runnable {

    /* renamed from: a */
    private static final AtomicInteger f7454a = new AtomicInteger(1);

    C2218d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7939a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract String mo7952b();

    public final void run() {
        String name = Thread.currentThread().getName();
        try {
            String b = mo7952b();
            if (TextUtils.isEmpty(b)) {
                b = "track_task";
            }
            Thread currentThread = Thread.currentThread();
            StringBuilder sb = new StringBuilder("ByteAdTracker#");
            sb.append(b);
            sb.append("_");
            sb.append(f7454a.getAndIncrement());
            currentThread.setName(sb.toString());
        } catch (Throwable unused) {
        }
        mo7939a();
        try {
            Thread.currentThread().setName(name);
        } catch (Throwable unused2) {
        }
    }
}
