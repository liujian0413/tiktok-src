package com.p280ss.video.rtc.engine.mediaio;

import java.nio.ByteBuffer;

/* renamed from: com.ss.video.rtc.engine.mediaio.IVideoFrameConsumer */
public interface IVideoFrameConsumer {
    void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j);

    void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr);

    void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j);
}
