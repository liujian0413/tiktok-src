package com.p280ss.video.rtc.engine.utils;

import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.JavaI420Buffer;
import org.webrtc.NV21Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

/* renamed from: com.ss.video.rtc.engine.utils.ExtVideoFrame */
public class ExtVideoFrame {
    public byte[] buf;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public EGLContext eglContext11;
    public android.opengl.EGLContext eglContext14;
    public int format = 10;
    public int height;
    public int rotation;
    public int stride;
    public boolean syncMode = true;
    public int textureID;
    public long timeStamp;
    public float[] transform;

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtVideoFrame{format=");
        sb.append(this.format);
        sb.append(", timeStamp=");
        sb.append(this.timeStamp);
        sb.append(", stride=");
        sb.append(this.stride);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", textureID=");
        sb.append(this.textureID);
        sb.append(", syncMode=");
        sb.append(this.syncMode);
        sb.append(", cropLeft=");
        sb.append(this.cropLeft);
        sb.append(", cropTop=");
        sb.append(this.cropTop);
        sb.append(", cropRight=");
        sb.append(this.cropRight);
        sb.append(", cropBottom=");
        sb.append(this.cropBottom);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append('}');
        return sb.toString();
    }

    public VideoFrame getVideoFrame() {
        if (this.buf == null) {
            return null;
        }
        int i = this.format;
        if (i == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.stride, this.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            dataY.put(this.buf, 0, this.stride * this.height);
            dataU.put(this.buf, this.stride * this.height, (this.stride * this.height) / 4);
            dataV.put(this.buf, (this.stride * this.height) + ((this.stride * this.height) / 4), (this.stride * this.height) / 4);
            return new VideoFrame(allocate, this.rotation, this.timeStamp);
        } else if (i == 3) {
            return new VideoFrame(new NV21Buffer(this.buf, this.stride, this.height, null), this.rotation, this.timeStamp);
        } else {
            switch (i) {
                case 10:
                case 11:
                    break;
                default:
                    LogUtil.m145282w("ExtVideoFrame", "picture format is not support");
                    break;
            }
            return null;
        }
    }

    public VideoFrame getVideoFrame(TextureHelper textureHelper) {
        int i = this.format;
        if (i == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.stride, this.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            dataY.put(this.buf, 0, this.stride * this.height);
            dataU.put(this.buf, this.stride * this.height, this.stride);
            dataV.put(this.buf, (this.stride * this.height) + this.stride, this.stride);
            return new VideoFrame(allocate, this.rotation, this.timeStamp);
        } else if (i == 3) {
            return new VideoFrame(new NV21Buffer(this.buf, this.stride, this.height, null), this.rotation, this.timeStamp);
        } else {
            switch (i) {
                case 10:
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.stride, this.height, Type.RGB, this.textureID, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.transform), textureHelper, null);
                    return new VideoFrame(textureBufferImpl.toI420(), this.rotation, this.timeStamp);
                case 11:
                    TextureBufferImpl textureBufferImpl2 = new TextureBufferImpl(this.stride, this.height, Type.OES, this.textureID, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.transform), textureHelper, null);
                    return new VideoFrame(textureBufferImpl2.toI420(), this.rotation, this.timeStamp);
                default:
                    LogUtil.m145282w("ExtVideoFrame", "texture or yuv picture format is not support");
                    return null;
            }
        }
    }

    public VideoFrame getVideoFrame(int i, int i2) {
        Buffer buffer;
        Buffer buffer2;
        VideoFrame videoFrame = null;
        if (this.buf == null) {
            return null;
        }
        int i3 = this.format;
        if (i3 == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.stride, this.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            dataY.put(this.buf, 0, this.stride * this.height);
            dataU.put(this.buf, this.stride * this.height, (this.stride * this.height) / 4);
            dataV.put(this.buf, (this.stride * this.height) + ((this.stride * this.height) / 4), (this.stride * this.height) / 4);
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2;
            if (((float) this.stride) / ((float) this.height) >= f3) {
                buffer = allocate.cropAndScale((this.stride - ((int) (((float) this.height) * f3))) / 2, 0, (int) (f3 * ((float) this.height)), this.height, i, i2);
            } else {
                float f4 = f2 / f;
                buffer = allocate.cropAndScale(0, (this.height - ((int) (((float) this.stride) * f4))) / 2, this.stride, (int) (f4 * ((float) this.stride)), i, i2);
            }
            videoFrame = new VideoFrame(buffer, this.rotation, this.timeStamp);
            allocate.release();
        } else if (i3 != 3) {
            switch (i3) {
                case 10:
                case 11:
                    break;
                default:
                    LogUtil.m145282w("ExtVideoFrame", "texture or yuv picture format is not support");
                    break;
            }
        } else {
            NV21Buffer nV21Buffer = new NV21Buffer(this.buf, this.stride, this.height, null);
            float f5 = (float) i;
            float f6 = (float) i2;
            float f7 = f5 / f6;
            if (((float) this.stride) / ((float) this.height) >= f7) {
                buffer2 = nV21Buffer.cropAndScale((this.stride - ((int) (((float) this.height) * f7))) / 2, 0, (int) (f7 * ((float) this.height)), this.height, i, i2);
            } else {
                float f8 = f6 / f5;
                buffer2 = nV21Buffer.cropAndScale(0, (this.height - ((int) (((float) this.stride) * f8))) / 2, this.stride, (int) (f8 * ((float) this.stride)), i, i2);
            }
            videoFrame = new VideoFrame(buffer2, this.rotation, this.timeStamp);
            nV21Buffer.release();
        }
        return videoFrame;
    }

    public VideoFrame getVideoFrame(TextureHelper textureHelper, int i, int i2, Runnable runnable) {
        TextureBufferImpl textureBufferImpl;
        TextureBufferImpl textureBufferImpl2;
        int i3 = i;
        int i4 = i2;
        int i5 = this.format;
        if (i5 == 1) {
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.stride, this.height);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            dataY.put(this.buf, 0, this.stride * this.height);
            dataU.put(this.buf, this.stride * this.height, this.stride);
            dataV.put(this.buf, (this.stride * this.height) + this.stride, this.stride);
            return new VideoFrame(allocate, this.rotation, this.timeStamp);
        } else if (i5 == 3) {
            return new VideoFrame(new NV21Buffer(this.buf, this.stride, this.height, null), this.rotation, this.timeStamp);
        } else {
            switch (i5) {
                case 10:
                    float f = ((float) i3) / ((float) i4);
                    if (((float) this.stride) / ((float) this.height) >= f) {
                        textureBufferImpl = new TextureBufferImpl(this.stride, this.height, Type.RGB, this.textureID, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.transform), textureHelper, runnable);
                    } else {
                        int i6 = this.stride;
                        int i7 = this.height;
                        int i8 = i7;
                        TextureBufferImpl textureBufferImpl3 = new TextureBufferImpl(i6, i8, Type.RGB, this.textureID, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.transform), textureHelper, runnable);
                        textureBufferImpl = textureBufferImpl3;
                    }
                    Buffer cropAndScale = textureBufferImpl.cropAndScale((this.stride - ((int) (((float) this.height) * f))) / 2, 0, (int) (f * ((float) this.height)), this.height, i, i2);
                    ((TextureBufferImpl) cropAndScale).setEglBaseContext(textureHelper.getEglBaseContext());
                    VideoFrame videoFrame = new VideoFrame(cropAndScale, this.rotation, this.timeStamp);
                    textureBufferImpl.release();
                    return videoFrame;
                case 11:
                    float f2 = ((float) i3) / ((float) i4);
                    if (((float) this.stride) / ((float) this.height) >= f2) {
                        textureBufferImpl2 = new TextureBufferImpl(this.stride, this.height, Type.OES, this.textureID, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.transform), textureHelper, runnable);
                    } else {
                        int i9 = this.stride;
                        int i10 = this.height;
                        int i11 = i10;
                        TextureBufferImpl textureBufferImpl4 = new TextureBufferImpl(i9, i11, Type.RGB, this.textureID, RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.transform), textureHelper, runnable);
                        textureBufferImpl2 = textureBufferImpl4;
                    }
                    Buffer cropAndScale2 = textureBufferImpl2.cropAndScale((this.stride - ((int) (((float) this.height) * f2))) / 2, 0, (int) (f2 * ((float) this.height)), this.height, i, i2);
                    ((TextureBufferImpl) cropAndScale2).setEglBaseContext(textureHelper.getEglBaseContext());
                    VideoFrame videoFrame2 = new VideoFrame(cropAndScale2, this.rotation, this.timeStamp);
                    textureBufferImpl2.release();
                    return videoFrame2;
                default:
                    LogUtil.m145282w("ExtVideoFrame", "texture or yuv picture format is not support");
                    return null;
            }
        }
    }
}
