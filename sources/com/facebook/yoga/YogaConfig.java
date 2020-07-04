package com.facebook.yoga;

public class YogaConfig {
    public static int SPACING_TYPE = 1;
    private YogaLogger mLogger;
    long mNativePointer = jni_YGConfigNew();
    private YogaNodeClonedFunction mNodeClonedFunction;

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasNodeClonedFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    public YogaLogger getLogger() {
        return this.mLogger;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            jni_YGConfigFree(this.mNativePointer);
        } finally {
            super.finalize();
        }
    }

    public YogaConfig() {
        if (this.mNativePointer == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public void setLogger(YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        jni_YGConfigSetLogger(this.mNativePointer, yogaLogger);
    }

    public void setPointScaleFactor(float f) {
        jni_YGConfigSetPointScaleFactor(this.mNativePointer, f);
    }

    public void setUseLegacyStretchBehaviour(boolean z) {
        jni_YGConfigSetUseLegacyStretchBehaviour(this.mNativePointer, z);
    }

    public void setUseWebDefaults(boolean z) {
        jni_YGConfigSetUseWebDefaults(this.mNativePointer, z);
    }

    public void setOnNodeCloned(YogaNodeClonedFunction yogaNodeClonedFunction) {
        boolean z;
        this.mNodeClonedFunction = yogaNodeClonedFunction;
        long j = this.mNativePointer;
        if (yogaNodeClonedFunction != null) {
            z = true;
        } else {
            z = false;
        }
        jni_YGConfigSetHasNodeClonedFunc(j, z);
    }

    public void setExperimentalFeatureEnabled(YogaExperimentalFeature yogaExperimentalFeature, boolean z) {
        jni_YGConfigSetExperimentalFeatureEnabled(this.mNativePointer, yogaExperimentalFeature.intValue(), z);
    }

    public final void onNodeCloned(YogaNode yogaNode, YogaNode yogaNode2, YogaNode yogaNode3, int i) {
        this.mNodeClonedFunction.onNodeCloned(yogaNode, yogaNode2, yogaNode3, i);
    }
}
