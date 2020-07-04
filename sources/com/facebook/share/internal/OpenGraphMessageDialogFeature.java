package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum OpenGraphMessageDialogFeature implements C13906e {
    OG_MESSAGE_DIALOG(20140204);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private OpenGraphMessageDialogFeature(int i) {
        this.minVersion = i;
    }
}
