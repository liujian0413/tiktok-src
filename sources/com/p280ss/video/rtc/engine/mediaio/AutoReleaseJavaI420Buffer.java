package com.p280ss.video.rtc.engine.mediaio;

import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

/* renamed from: com.ss.video.rtc.engine.mediaio.AutoReleaseJavaI420Buffer */
public class AutoReleaseJavaI420Buffer implements I420Buffer {
    private JavaI420Buffer buffer;

    public ByteBuffer getDataU() {
        return this.buffer.getDataU();
    }

    public ByteBuffer getDataV() {
        return this.buffer.getDataV();
    }

    public ByteBuffer getDataY() {
        return this.buffer.getDataY();
    }

    public int getHeight() {
        return this.buffer.getHeight();
    }

    public int getStrideU() {
        return this.buffer.getStrideU();
    }

    public int getStrideV() {
        return this.buffer.getStrideV();
    }

    public int getStrideY() {
        return this.buffer.getStrideY();
    }

    public int getWidth() {
        return this.buffer.getWidth();
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    public I420Buffer toI420() {
        return this.buffer.toI420();
    }

    static final /* synthetic */ void lambda$new$0$AutoReleaseJavaI420Buffer(TextureEglRenderer textureEglRenderer) {
        if (textureEglRenderer != null) {
            Runnable onFrameCompleteRunnable = textureEglRenderer.getOnFrameCompleteRunnable();
            if (onFrameCompleteRunnable != null) {
                onFrameCompleteRunnable.run();
            }
        }
    }

    public Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return this.buffer.scaleAndFill(i, i2, i3, i4);
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.buffer.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    private AutoReleaseJavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, TextureEglRenderer textureEglRenderer) {
        this.buffer = JavaI420Buffer.wrap(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, new AutoReleaseJavaI420Buffer$$Lambda$0(textureEglRenderer));
    }

    public static AutoReleaseJavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, TextureEglRenderer textureEglRenderer) {
        AutoReleaseJavaI420Buffer autoReleaseJavaI420Buffer = new AutoReleaseJavaI420Buffer(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, textureEglRenderer);
        return autoReleaseJavaI420Buffer;
    }
}
