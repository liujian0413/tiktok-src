package com.p280ss.avframework.livestreamv2.interact.video;

/* renamed from: com.ss.avframework.livestreamv2.interact.video.VideoClientFactory */
public interface VideoClientFactory {
    VideoClient create();

    void destroy(VideoClient videoClient);
}
