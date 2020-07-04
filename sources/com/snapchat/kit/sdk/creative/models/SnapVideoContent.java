package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapVideoFile;
import java.io.File;

public final class SnapVideoContent extends SnapContent {

    /* renamed from: b */
    private SnapVideoFile f50532b;

    public final String getDeeplinkUrlPath() {
        return "preview";
    }

    public final String getIntentType() {
        return "snapvideo/*";
    }

    public final File getMediaFile() {
        return this.f50532b.getVideoFile();
    }

    public SnapVideoContent(SnapVideoFile snapVideoFile) {
        this.f50532b = snapVideoFile;
    }
}
