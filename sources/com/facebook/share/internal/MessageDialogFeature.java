package com.facebook.share.internal;

import com.facebook.internal.C13906e;

public enum MessageDialogFeature implements C13906e {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    
    private int minVersion;

    public final String getAction() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    private MessageDialogFeature(int i) {
        this.minVersion = i;
    }
}
