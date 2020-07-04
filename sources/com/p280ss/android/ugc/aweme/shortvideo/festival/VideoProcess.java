package com.p280ss.android.ugc.aweme.shortvideo.festival;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.VideoProcess */
public enum VideoProcess {
    VIDEO_DOWNLOAD_TYPE(50),
    VIDEO_WATER_TYPE(50);
    
    private final int weight;

    public final int getWeight() {
        return this.weight;
    }

    private VideoProcess(int i) {
        this.weight = i;
    }
}
