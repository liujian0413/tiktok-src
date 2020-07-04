package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.TrendingSource */
public enum TrendingSource {
    CLICK_VIDEO_BACK("click_video_back"),
    VIDEO_AUTOPLAY("video_autoplay");
    
    private final String key;

    public final String getKey() {
        return this.key;
    }

    private TrendingSource(String str) {
        this.key = str;
    }
}
