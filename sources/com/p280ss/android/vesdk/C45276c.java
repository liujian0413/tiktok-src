package com.p280ss.android.vesdk;

import android.content.Context;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.medialib.VideoSdkCore;

/* renamed from: com.ss.android.vesdk.c */
public final class C45276c {
    /* renamed from: a */
    public static void m142924a(int i) {
        VideoSdkCore.setLogLevel(i);
    }

    /* renamed from: b */
    public static void m142929b(String str) {
        VideoSdkCore.setEffectJsonConfig(str);
    }

    /* renamed from: a */
    public static void m142925a(Context context) {
        VideoSdkCore.init(context);
    }

    /* renamed from: b */
    public static void m142930b(boolean z) {
        VideoSdkCore.enableGLES3(z);
    }

    /* renamed from: a */
    public static void m142926a(C1942b bVar) {
        VideoSdkCore.setResourceFinder(bVar);
    }

    /* renamed from: a */
    public static void m142927a(String str) {
        VideoSdkCore.setAmazingShareDir(str);
    }

    /* renamed from: a */
    public static void m142928a(boolean z) {
        VideoSdkCore.setABbUseBuildinAmazing(z);
    }
}
