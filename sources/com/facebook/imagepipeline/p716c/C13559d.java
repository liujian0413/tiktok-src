package com.facebook.imagepipeline.p716c;

import android.os.Build.VERSION;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.p686c.C13286a;
import com.facebook.imagepipeline.p716c.C13570h.C13573a;

/* renamed from: com.facebook.imagepipeline.c.d */
public final class C13559d implements C13573a {
    /* renamed from: a */
    public final double mo33099a(MemoryTrimType memoryTrimType) {
        switch (memoryTrimType) {
            case OnCloseToDalvikHeapLimit:
                if (VERSION.SDK_INT >= 21) {
                    return MemoryTrimType.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
                }
                return 0.0d;
            case OnAppBackgrounded:
            case OnSystemMemoryCriticallyLowWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInForeground:
            case OnSystemLowMemoryWhileAppInBackground:
                return 1.0d;
            default:
                C13286a.m38865d("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", memoryTrimType);
                return 0.0d;
        }
    }
}
