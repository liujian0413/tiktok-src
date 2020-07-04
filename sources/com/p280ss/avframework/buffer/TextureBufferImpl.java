package com.p280ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;

/* renamed from: com.ss.avframework.buffer.TextureBufferImpl */
public class TextureBufferImpl implements TextureBuffer {
    private final int height;

    /* renamed from: id */
    private final int f117076id;
    private stRoiInfo mROIInfo;
    private ToI420Interface mToI420Interface;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final Matrix transformMatrix;
    private final Type type;
    private final int width;

    /* renamed from: com.ss.avframework.buffer.TextureBufferImpl$ToI420Interface */
    public interface ToI420Interface {
        I420Buffer toI420(TextureBuffer textureBuffer);
    }

    public int getHeight() {
        return this.height;
    }

    public stRoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    public int getTextureId() {
        return this.f117076id;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public Type getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && this.releaseCallback != null) {
                this.releaseCallback.run();
            }
        }
    }

    public I420Buffer toI420() {
        if (this.surfaceTextureHelper != null) {
            return this.surfaceTextureHelper.textureToYuv(this);
        }
        if (this.mToI420Interface != null) {
            return this.mToI420Interface.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    public void setROIInfo(stRoiInfo stroiinfo) {
        this.mROIInfo = stroiinfo;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) i2) / ((float) this.height));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i5, i6, this.type, this.f117076id, matrix, this.surfaceTextureHelper, (Runnable) new Runnable() {
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        textureBufferImpl.mToI420Interface = this.mToI420Interface;
        textureBufferImpl.mROIInfo = this.mROIInfo;
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f117076id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.releaseCallback = runnable;
        this.mToI420Interface = null;
        this.refCount = 1;
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f117076id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = null;
        this.releaseCallback = runnable;
        this.mToI420Interface = toI420Interface;
        this.refCount = 1;
    }
}
