package com.p280ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.CurPlayVideoRecord */
public enum CurPlayVideoRecord {
    INSTANCE;
    
    private String videoId;

    public final String getVideoId() {
        if (this.videoId == null) {
            return "";
        }
        return this.videoId;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
