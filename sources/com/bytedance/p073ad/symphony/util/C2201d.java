package com.bytedance.p073ad.symphony.util;

import com.bytedance.p073ad.symphony.p074a.C2092b;
import com.bytedance.p073ad.symphony.provider.AbsInterstitialAdProvider;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;

/* renamed from: com.bytedance.ad.symphony.util.d */
public final class C2201d {
    /* renamed from: a */
    public static boolean m9509a(C2092b bVar) {
        if (bVar.mo7751b() == null || bVar.mo7751b() == null || !AbsNativeAdProvider.isFbNativeAdProvider(bVar.mo7751b().f7301c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9510b(C2092b bVar) {
        if (bVar.mo7751b() == null || bVar.mo7751b() == null || !AbsNativeAdProvider.isFbNativeHbProvider(bVar.mo7751b().f7301c)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m9511c(C2092b bVar) {
        if (bVar.mo7751b() == null || bVar.mo7751b() == null || !AbsInterstitialAdProvider.isFbInterstitialAdProvider(bVar.mo7751b().f7301c)) {
            return false;
        }
        return true;
    }
}
