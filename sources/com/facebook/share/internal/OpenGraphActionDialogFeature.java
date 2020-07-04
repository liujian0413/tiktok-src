package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum OpenGraphActionDialogFeature implements C13906e {
    OG_ACTION_DIALOG(20130618);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private OpenGraphActionDialogFeature(int i) {
        this.minVersion = i;
    }
}
