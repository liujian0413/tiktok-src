package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum CameraEffectFeature implements C13906e {
    SHARE_CAMERA_EFFECT(20170417);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private CameraEffectFeature(int i) {
        this.minVersion = i;
    }
}
