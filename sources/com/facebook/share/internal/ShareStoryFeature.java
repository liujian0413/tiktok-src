package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum ShareStoryFeature implements C13906e {
    SHARE_STORY_ASSET(20170417);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private ShareStoryFeature(int i) {
        this.minVersion = i;
    }
}
