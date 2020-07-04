package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum AppInviteDialogFeature implements C13906e {
    APP_INVITES_DIALOG(20140701);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.APPINVITES_DIALOG";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private AppInviteDialogFeature(int i) {
        this.minVersion = i;
    }
}
