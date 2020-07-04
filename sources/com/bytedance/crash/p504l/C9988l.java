package com.bytedance.crash.p504l;

import android.app.ActivityManager.MemoryInfo;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.crash.l.l */
public final class C9988l {

    /* renamed from: a */
    static final C9990a f27229a;

    /* renamed from: com.bytedance.crash.l.l$a */
    static class C9990a {
        private C9990a() {
        }

        /* renamed from: a */
        public long mo24610a(MemoryInfo memoryInfo) {
            return 0;
        }
    }

    /* renamed from: com.bytedance.crash.l.l$b */
    static class C9991b extends C9990a {
        private C9991b() {
            super();
        }

        /* renamed from: a */
        public final long mo24610a(MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f27229a = new C9991b();
        } else {
            f27229a = new C9990a();
        }
    }

    /* renamed from: a */
    public static long m29587a(MemoryInfo memoryInfo) {
        return f27229a.mo24610a(memoryInfo);
    }
}
