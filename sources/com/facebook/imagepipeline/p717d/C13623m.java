package com.facebook.imagepipeline.p717d;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.imagepipeline.d.m */
public final class C13623m implements ThreadFactory {

    /* renamed from: a */
    public final int f36174a = 10;

    /* renamed from: b */
    private final String f36175b;

    /* renamed from: c */
    private final boolean f36176c;

    /* renamed from: d */
    private final AtomicInteger f36177d = new AtomicInteger(1);

    public final Thread newThread(final Runnable runnable) {
        String str;
        C136241 r0 = new Runnable() {
            public final void run() {
                try {
                    Process.setThreadPriority(C13623m.this.f36174a);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.f36176c) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f36175b);
            sb.append("-");
            sb.append(this.f36177d.getAndIncrement());
            str = sb.toString();
        } else {
            str = this.f36175b;
        }
        return new Thread(r0, str);
    }

    public C13623m(int i, String str, boolean z) {
        this.f36175b = str;
        this.f36176c = true;
    }
}
