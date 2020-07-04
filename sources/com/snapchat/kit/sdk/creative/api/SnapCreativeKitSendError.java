package com.snapchat.kit.sdk.creative.api;

public enum SnapCreativeKitSendError {
    GENERIC_ERROR(1),
    SNAPCHAT_NOT_INSTALLED(2),
    SNAPCHAT_CANNOT_SHARE_CONTENT(3);
    
    private int mCode;

    private SnapCreativeKitSendError(int i) {
        this.mCode = i;
    }
}
