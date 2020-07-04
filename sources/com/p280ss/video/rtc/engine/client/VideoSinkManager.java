package com.p280ss.video.rtc.engine.client;

import com.C1642a;
import com.p280ss.video.rtc.engine.adapter.VideoSinkAdapter;
import com.p280ss.video.rtc.engine.mediaio.IVideoSink;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.video.rtc.engine.client.VideoSinkManager */
public class VideoSinkManager {
    private Map<String, VideoSinkAdapter> mVideoSinkMap = new HashMap();

    public void release() {
        for (Entry value : this.mVideoSinkMap.entrySet()) {
            release((VideoSinkAdapter) value.getValue());
        }
    }

    private void release(VideoSinkAdapter videoSinkAdapter) {
        if (videoSinkAdapter != null) {
            if (!videoSinkAdapter.isStop()) {
                videoSinkAdapter.onStop();
            }
            videoSinkAdapter.onDispose();
        }
    }

    private int getRefCountByView(IVideoSink iVideoSink) {
        int i = 0;
        for (VideoSinkAdapter videoSinkAdapter : this.mVideoSinkMap.values()) {
            if (iVideoSink == videoSinkAdapter.getmIVideoSinkImpl()) {
                i++;
            }
        }
        return i;
    }

    private void checkAndUpdateVideoCanvasStateByUid(String str, boolean z) {
        VideoSinkAdapter videoSinkAdapter = get(str, z);
        if (videoSinkAdapter != null) {
            release(videoSinkAdapter);
        }
    }

    public VideoSinkAdapter get(String str, boolean z) {
        return (VideoSinkAdapter) this.mVideoSinkMap.get(buildKey(str, z));
    }

    private String buildKey(String str, boolean z) {
        String str2;
        String str3 = "%s:%s";
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (z) {
            str2 = "screen";
        } else {
            str2 = "video";
        }
        objArr[1] = str2;
        return C1642a.m8034a(str3, objArr);
    }

    private void checkAndUpdateVideoCanvasStateByView(String str, boolean z) {
        VideoSinkAdapter videoSinkAdapter = get(str, z);
        if (videoSinkAdapter != null && getRefCountByView(videoSinkAdapter.getmIVideoSinkImpl()) == 1) {
            release(videoSinkAdapter);
        }
    }

    public void add(String str, boolean z, VideoSinkAdapter videoSinkAdapter) {
        String buildKey = buildKey(str, z);
        checkAndUpdateVideoCanvasStateByUid(str, z);
        this.mVideoSinkMap.put(buildKey, videoSinkAdapter);
    }
}
