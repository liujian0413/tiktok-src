package com.p280ss.android.ugc.aweme.services.upload;

/* renamed from: com.ss.android.ugc.aweme.services.upload.UploadVideoType */
public enum UploadVideoType {
    AWEME(0),
    STORY(1);
    
    private final int videoType;

    public final int getVideoType() {
        return this.videoType;
    }

    private UploadVideoType(int i) {
        this.videoType = i;
    }
}
