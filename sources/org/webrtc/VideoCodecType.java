package org.webrtc;

enum VideoCodecType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc"),
    H265("video/hevc");
    
    private final String mimeType;

    /* access modifiers changed from: 0000 */
    public final String mimeType() {
        return this.mimeType;
    }

    private VideoCodecType(String str) {
        this.mimeType = str;
    }
}
