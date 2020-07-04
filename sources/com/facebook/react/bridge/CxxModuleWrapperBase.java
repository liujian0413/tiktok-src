package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class CxxModuleWrapperBase implements NativeModule {
    private HybridData mHybridData;

    public boolean canOverrideExistingModule() {
        return false;
    }

    public native String getName();

    public void initialize() {
    }

    public void onCatalystInstanceDestroy() {
        this.mHybridData.resetNative();
    }

    protected CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    /* access modifiers changed from: protected */
    public void resetModule(HybridData hybridData) {
        if (hybridData != this.mHybridData) {
            this.mHybridData.resetNative();
            this.mHybridData = hybridData;
        }
    }
}
