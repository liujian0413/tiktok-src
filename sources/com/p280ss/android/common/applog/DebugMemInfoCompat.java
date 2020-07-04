package com.p280ss.android.common.applog;

import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;

/* renamed from: com.ss.android.common.applog.DebugMemInfoCompat */
public class DebugMemInfoCompat {
    static final BaseImpl IMPL;

    /* renamed from: com.ss.android.common.applog.DebugMemInfoCompat$BaseImpl */
    static class BaseImpl {
        private BaseImpl() {
        }

        public int getTotalPrivateClean(MemoryInfo memoryInfo) {
            return -1;
        }

        public int getTotalSharedClean(MemoryInfo memoryInfo) {
            return -1;
        }

        public int getTotalSwappablePss(MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* renamed from: com.ss.android.common.applog.DebugMemInfoCompat$KitkatImpl */
    static class KitkatImpl extends BaseImpl {
        private KitkatImpl() {
            super();
        }

        public int getTotalPrivateClean(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        public int getTotalSharedClean(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        public int getTotalSwappablePss(MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            IMPL = new KitkatImpl();
        } else {
            IMPL = new BaseImpl();
        }
    }

    public static int getTotalPrivateClean(MemoryInfo memoryInfo) {
        return IMPL.getTotalPrivateClean(memoryInfo);
    }

    public static int getTotalSharedClean(MemoryInfo memoryInfo) {
        return IMPL.getTotalSharedClean(memoryInfo);
    }

    public static int getTotalSwappablePss(MemoryInfo memoryInfo) {
        return IMPL.getTotalSwappablePss(memoryInfo);
    }
}
