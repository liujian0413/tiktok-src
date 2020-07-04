package com.p280ss.avframework.recorder;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.recorder.MediaRecorder */
public interface MediaRecorder {
    int addTrack(MediaFormat mediaFormat);

    void release();

    int start();

    int stop();

    int writeSampleData(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo);
}
