package com.p280ss.avframework.livestreamv2.interact.callback;

import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoOutputFormat;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.callback.DataCallback */
public interface DataCallback {
    void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void onReceiveTextureFrame(int i, int i2, VideoOutputFormat videoOutputFormat, int i3, int i4, int i5, long j, float[] fArr);

    void onReceiveVideoBufferFrame(int i, ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, long j);
}
