package com.snapchat.kit.sdk.creative.models;

import java.io.File;

public final class SnapLiveCameraContent extends SnapContent {
    public final String getDeeplinkUrlPath() {
        return "camera";
    }

    public final String getIntentType() {
        return "*/*";
    }

    public final File getMediaFile() {
        return null;
    }
}
