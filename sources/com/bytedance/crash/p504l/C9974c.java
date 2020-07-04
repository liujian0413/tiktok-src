package com.bytedance.crash.p504l;

import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;

/* renamed from: com.bytedance.crash.l.c */
public final class C9974c {

    /* renamed from: a */
    static final C9976a f27214a;

    /* renamed from: com.bytedance.crash.l.c$a */
    static class C9976a {
        private C9976a() {
        }

        /* renamed from: a */
        public int mo24605a(MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: b */
        public int mo24606b(MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: c */
        public int mo24607c(MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* renamed from: com.bytedance.crash.l.c$b */
    static class C9977b extends C9976a {
        private C9977b() {
            super();
        }

        /* renamed from: a */
        public final int mo24605a(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        /* renamed from: b */
        public final int mo24606b(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        /* renamed from: c */
        public final int mo24607c(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f27214a = new C9977b();
        } else {
            f27214a = new C9976a();
        }
    }

    /* renamed from: a */
    public static int m29513a(MemoryInfo memoryInfo) {
        return f27214a.mo24605a(memoryInfo);
    }

    /* renamed from: b */
    public static int m29514b(MemoryInfo memoryInfo) {
        return f27214a.mo24606b(memoryInfo);
    }

    /* renamed from: c */
    public static int m29515c(MemoryInfo memoryInfo) {
        return f27214a.mo24607c(memoryInfo);
    }
}
