package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class TextureBufferImpl implements TextureBuffer {
    private final int height;

    /* renamed from: id */
    private final int f123512id;
    private final RefCountDelegate refCountDelegate;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.f123512id;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public Type getType() {
        return this.type;
    }

    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ I420Buffer lambda$toI420$0$TextureBufferImpl() throws Exception {
        return this.yuvConverter.convert(this);
    }

    public void release() {
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountDelegate.retain();
    }

    public I420Buffer toI420() {
        return (I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, (Callable<V>) new TextureBufferImpl$$Lambda$0<V>(this));
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }

    public Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        int min = Math.min(i, (getWidth() * i2) / getHeight());
        int min2 = Math.min(i2, (getHeight() * i) / getWidth());
        matrix.preScale(((float) min) / ((float) getWidth()), ((float) min2) / ((float) getHeight()));
        matrix.preTranslate((float) (i3 / i), (float) ((i2 - (i4 + min2)) / i2));
        return applyTransformMatrix(matrix, i, i2);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        Matrix matrix3 = matrix;
        matrix2.preConcat(matrix);
        retain();
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i2, i3, i4, this.type, this.f123512id, matrix2, this.toI420Handler, this.yuvConverter, new TextureBufferImpl$$Lambda$1(this));
        return textureBufferImpl;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (this.height - (i2 + i4))) / ((float) this.height));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        return applyTransformMatrix(matrix, Math.round(((float) (this.unscaledWidth * i3)) / ((float) this.width)), Math.round(((float) (this.unscaledHeight * i4)) / ((float) this.height)), i5, i6);
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter2, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f123512id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private TextureBufferImpl(int i, int i2, int i3, int i4, Type type2, int i5, Matrix matrix, Handler handler, YuvConverter yuvConverter2, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type2;
        this.f123512id = i5;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
