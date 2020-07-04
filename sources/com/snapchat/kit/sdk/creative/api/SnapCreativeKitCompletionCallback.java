package com.snapchat.kit.sdk.creative.api;

public interface SnapCreativeKitCompletionCallback {
    void onSendFailed(SnapCreativeKitSendError snapCreativeKitSendError);

    void onSendSuccess();
}
