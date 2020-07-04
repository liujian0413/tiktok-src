package com.p280ss.android.ugc.aweme.services.cutvideo;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.ICutVideo */
public interface ICutVideo {
    void attachDisplayView(DisplayVideoView displayVideoView);

    void compile();

    void init(String str, String str2, long j, long j2);

    void restore();

    void setListener(ICutVideoListener iCutVideoListener);
}
