package com.p280ss.avframework.livestreamv2.interact.video;

/* renamed from: com.ss.avframework.livestreamv2.interact.video.VideoClient */
public interface VideoClient {
    void prepare(VideoCallback videoCallback);

    void release();

    void start();

    void stop();
}
