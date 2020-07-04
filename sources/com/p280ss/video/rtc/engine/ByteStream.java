package com.p280ss.video.rtc.engine;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.video.rtc.engine.ByteStream */
public class ByteStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public String streamId;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    public ByteStream() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ByteStream{streamId='");
        sb.append(this.streamId);
        sb.append('\'');
        sb.append(", userId='");
        sb.append(this.userId);
        sb.append('\'');
        sb.append(", isScreen=");
        sb.append(this.isScreen);
        sb.append(", hasVideo=");
        sb.append(this.hasVideo);
        sb.append(", hasAudio=");
        sb.append(this.hasAudio);
        sb.append(", videoStreamDescriptions=");
        sb.append(this.videoStreamDescriptions);
        sb.append('}');
        return sb.toString();
    }

    private static ByteStream create(String str, String str2, boolean z, boolean z2, boolean z3) {
        ByteStream byteStream = new ByteStream(str, str2, z, z2, z3, null);
        return byteStream;
    }

    public ByteStream(String str, String str2, boolean z, boolean z2, boolean z3, List<VideoStreamDescription> list) {
        this.streamId = str;
        this.userId = str2;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    private static ByteStream createWithStreamDescriptions(String str, String str2, boolean z, boolean z2, boolean z3, VideoStreamDescription[] videoStreamDescriptionArr) {
        ByteStream byteStream = new ByteStream(str, str2, z, z2, z3, Arrays.asList(videoStreamDescriptionArr));
        return byteStream;
    }
}
