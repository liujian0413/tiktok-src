package com.p280ss.android.vesdk.runtime;

import android.content.res.AssetManager;
import com.bef.effectsdk.C1942b;
import com.bef.effectsdk.FileResourceFinder;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.vesdk.C45372t;
import com.p280ss.android.vesdk.VEException;

/* renamed from: com.ss.android.vesdk.runtime.VEEffectConfig */
public class VEEffectConfig {
    private static final String TAG = VEEffectConfig.class.getSimpleName();
    private static AssetManager sEffectAssetManager = null;
    private static C1942b sFinder = new FileResourceFinder("");

    private static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    private static native void nativeEnableEffectRT(boolean z);

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetEffectAsynAPI(boolean z);

    private static native void nativeSetEffectForceDetectFace(boolean z);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetEffectMaxMemoryCache(int i);

    private static native void nativeSetEffectSyncTimeDomain(boolean z);

    private static native void nativeSetEnableStickerAmazing(boolean z);

    private static native void nativeSetShareDir(String str);

    private static native void nativeUseNewEffectAlgorithmApi(boolean z);

    static {
        TENativeLibsLoader.m67986c();
    }

    public static boolean enableAssetManager(AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void setEffectAsynAPI(boolean z) {
        nativeSetEffectAsynAPI(z);
    }

    public static void setEffectForceDetectFace(boolean z) {
        nativeSetEffectForceDetectFace(z);
    }

    public static void setEffectSyncTimeDomain(boolean z) {
        nativeSetEffectSyncTimeDomain(z);
    }

    public static void setEnableStickerAmazing(boolean z) {
        nativeSetEnableStickerAmazing(z);
    }

    public static void setResourceFinder(C1942b bVar) {
        sFinder = bVar;
    }

    public static void setUseNewEffectAlgorithmApi(boolean z) {
        nativeUseNewEffectAlgorithmApi(z);
    }

    public static boolean enableEffectRT(boolean z) {
        nativeEnableEffectRT(z);
        return true;
    }

    public static boolean setABbUseBuildinAmazing(boolean z) {
        nativeSetABbUseBuildinAmazing(z);
        return true;
    }

    public static boolean setEffectJsonConfig(String str) {
        nativeSetEffectJsonConfig(str);
        return true;
    }

    public static boolean setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
        return true;
    }

    public static boolean setEffectMaxMemoryCache(int i) {
        nativeSetEffectMaxMemoryCache(i);
        return true;
    }

    public static boolean setShareDir(String str) {
        nativeSetShareDir(str);
        return true;
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            C45372t.m143409d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        } else if (sFinder != null) {
            return sFinder.createNativeResourceFinder(j);
        } else {
            throw new VEException(-1, "错误调用finder相关接口");
        }
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C45372t.m143409d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder != null) {
            sFinder.release(j);
        } else {
            throw new VEException(-1, "错误调用finder相关接口");
        }
    }

    public static void configEffect(String str, String str2) {
        boolean z;
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
    }
}
