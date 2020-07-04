package com.bef.effectsdk;

import android.content.res.AssetManager;

public final class AssetResourceFinder implements C1942b {

    /* renamed from: a */
    private final AssetManager f6970a;

    /* renamed from: b */
    private final String f6971b;

    private static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j);

    public final synchronized long createNativeResourceFinder(long j) {
        return nativeCreateAssetResourceFinder(j, this.f6970a, this.f6971b);
    }

    public final synchronized void release(long j) {
        nativeReleaseAssetResourceFinder(j);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.f6970a = assetManager;
        this.f6971b = str;
    }
}
