package com.snapchat.kit.sdk.creative.models;

import com.snapchat.kit.sdk.creative.media.SnapSticker;
import java.io.File;

public abstract class SnapContent {

    /* renamed from: a */
    protected SnapSticker f50528a;

    /* renamed from: b */
    private String f50529b;

    /* renamed from: c */
    private String f50530c;

    public String getAttachmentUrl() {
        return this.f50529b;
    }

    public String getCaptionText() {
        return this.f50530c;
    }

    public abstract String getDeeplinkUrlPath();

    public abstract String getIntentType();

    public abstract File getMediaFile();

    public SnapSticker getSnapSticker() {
        return this.f50528a;
    }

    public void setAttachmentUrl(String str) {
        this.f50529b = str;
    }

    public void setCaptionText(String str) {
        this.f50530c = str;
    }

    public void setSnapSticker(SnapSticker snapSticker) {
        this.f50528a = snapSticker;
    }
}
