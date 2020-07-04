package com.p280ss.avframework.livestreamv2;

import com.p280ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.IInputVideoStream */
public interface IInputVideoStream {
    int fps();

    int getHeight();

    VideoMixerDescription getMixerDescription();

    int getWidth();

    String name();

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void release();

    void setMixerDescription(VideoMixerDescription videoMixerDescription);

    int start();

    int stop();
}
