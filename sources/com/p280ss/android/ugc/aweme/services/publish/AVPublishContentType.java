package com.p280ss.android.ugc.aweme.services.publish;

/* renamed from: com.ss.android.ugc.aweme.services.publish.AVPublishContentType */
public enum AVPublishContentType {
    Video("video"),
    PhotoMovie("video"),
    Photo("photo");
    
    private final String contentType;

    public final String getContentType() {
        return this.contentType;
    }

    private AVPublishContentType(String str) {
        this.contentType = str;
    }
}
