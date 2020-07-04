package com.p280ss.android.medialib;

import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.C1942b;
import com.bef.effectsdk.FileResourceFinder;
import com.p280ss.android.medialib.common.C19706c;
import com.p280ss.android.medialib.common.LogInvoker;
import com.p280ss.android.medialib.config.C19712a;
import com.p280ss.android.medialib.p883d.C19715b;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.vesdk.C45372t;

/* renamed from: com.ss.android.medialib.VideoSdkCore */
public final class VideoSdkCore {
    public static Context APPLICATION_CONTEXT = null;
    public static final int PRODUCT_AWEME = 0;
    public static final int PRODUCT_HOTSOON = 1;
    public static final int PRODUCT_OTHER = 2;
    public static final String TAG = "VideoSdkCore";
    private static boolean inited;
    private static C1942b sFinder = new FileResourceFinder("");

    private static native void nativeEnableGLES3(boolean z);

    private static native String nativeGetVersionCode();

    private static native String nativeGetVersionName();

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetAmazingShareDir(String str);

    private static native void nativeSetAssertManagerEnable(boolean z);

    private static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetEffectMaxMemoryCache(int i);

    private static native void nativeSetProduct(int i);

    private static native void nativeSetResourceFinderEnable(boolean z);

    public static String getSdkVersionCode() {
        return nativeGetVersionCode();
    }

    public static String getSdkVersionName() {
        return nativeGetVersionName();
    }

    static {
        TENativeLibsLoader.m67988e();
    }

    public static void enableGLES3(boolean z) {
        nativeEnableGLES3(z);
    }

    public static void setABbUseBuildinAmazing(boolean z) {
        nativeSetABbUseBuildinAmazing(z);
    }

    public static void setAmazingShareDir(String str) {
        nativeSetAmazingShareDir(str);
    }

    public static void setEffectJsonConfig(String str) {
        nativeSetEffectJsonConfig(str);
    }

    public static void setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
    }

    public static void setEffectMaxMemoryCache(int i) {
        nativeSetEffectMaxMemoryCache(i);
    }

    public static void setEnableAssetManager(boolean z) {
        nativeSetAssertManagerEnable(z);
    }

    public static void setProduct(int i) {
        nativeSetProduct(i);
    }

    public static void setLogLevel(int i) {
        C19706c.m64968a((String) null, i);
        LogInvoker.setLogLevel(i);
    }

    public static void setResourceFinder(C1942b bVar) {
        sFinder = bVar;
        nativeSetResourceFinderEnable(true);
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C45372t.m143409d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder == null) {
            C45372t.m143409d(TAG, "错误调用finder相关接口");
        } else {
            sFinder.release(j);
        }
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            C45372t.m143409d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        } else if (sFinder != null) {
            return sFinder.createNativeResourceFinder(j);
        } else {
            C45372t.m143409d(TAG, "错误调用finder相关接口");
            return 0;
        }
    }

    public static void init(final Context context) {
        if (!inited) {
            synchronized (VideoSdkCore.class) {
                if (!inited) {
                    APPLICATION_CONTEXT = context.getApplicationContext();
                    nativeSetAssertManagerFromJava(context.getAssets());
                    new Thread() {
                        public final void run() {
                            try {
                                C19715b.m65003a(context);
                                C19712a.m64999a();
                            } catch (Exception e) {
                                String str = VideoSdkCore.TAG;
                                StringBuilder sb = new StringBuilder("VideoSdkCore init failed: ");
                                sb.append(e.toString());
                                C45372t.m143409d(str, sb.toString());
                            }
                        }
                    }.start();
                    inited = true;
                }
            }
        }
    }
}
