package com.ttnet.org.chromium.base;

import p000J.C0000N;

final class AnimationFrameTimeHistogramJni implements Natives {
    public static final JniStaticTestMocker<Natives> TEST_HOOKS = new JniStaticTestMocker<Natives>() {
        public void setInstanceForTesting(Natives natives) {
            AnimationFrameTimeHistogramJni.testInstance = natives;
        }
    };
    public static Natives testInstance;

    AnimationFrameTimeHistogramJni() {
    }

    public static Natives get() {
        if (C0000N.f0a) {
            if (testInstance != null) {
                return testInstance;
            }
            if (C0000N.f1b) {
                throw new UnsupportedOperationException("No mock found for the native implementation for com.ttnet.org.chromium.base.AnimationFrameTimeHistogram.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        return new AnimationFrameTimeHistogramJni();
    }

    public final void saveHistogram(String str, long[] jArr, int i) {
        C0000N.M5pix5sa(str, jArr, i);
    }
}
