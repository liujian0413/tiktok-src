package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum LikeDialogFeature implements C13906e {
    LIKE_DIALOG(20140701);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.LIKE_DIALOG";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private LikeDialogFeature(int i) {
        this.minVersion = i;
    }
}
