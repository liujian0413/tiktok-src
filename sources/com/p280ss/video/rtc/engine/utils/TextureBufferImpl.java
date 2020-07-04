package com.p280ss.video.rtc.engine.utils;

import android.graphics.Matrix;
import android.graphics.YuvImage;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

/* renamed from: com.ss.video.rtc.engine.utils.TextureBufferImpl */
public class TextureBufferImpl implements EglContextCarrier, TextureBuffer {
    private final int height;

    /* renamed from: id */
    private final int f118911id;
    private Context mEglBaseContext;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final TextureHelper textureHelper;
    private final Matrix transformMatrix;
    private final Type type;
    private final int width;
    private YuvImage yuvImage;

    public Context getEglBaseContext() {
        return this.mEglBaseContext;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.f118911id;
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

    public I420Buffer toI420() {
        return this.textureHelper.textureToYuv(this);
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

    public void setEglBaseContext(Context context) {
        this.mEglBaseContext = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|(3:5|6|7)|8|10|11|12|13|14|15|16) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|(3:5|6|7)|8|10|11|12|13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveMyBitmap(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r9 = "texturebuffer"
            java.lang.String r10 = "saveMyBitmap"
            com.p280ss.video.rtc.engine.utils.LogUtil.m145281i(r9, r10)
            java.io.File r9 = new java.io.File
            r9.<init>(r7)
            r9.createNewFile()     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r7 = 0
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0016 }
            r10.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0016 }
            r7 = r10
        L_0x0016:
            android.graphics.YuvImage r9 = new android.graphics.YuvImage
            r2 = 17
            int r3 = r6.width
            int r4 = r6.height
            r5 = 0
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ Exception -> 0x0033 }
            int r10 = r6.width     // Catch:{ Exception -> 0x0033 }
            int r0 = r6.height     // Catch:{ Exception -> 0x0033 }
            r1 = 0
            r8.<init>(r1, r1, r10, r0)     // Catch:{ Exception -> 0x0033 }
            r10 = 50
            r9.compressToJpeg(r8, r10, r7)     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            r7.flush()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r7.close()     // Catch:{ IOException -> 0x003a }
            return
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.video.rtc.engine.utils.TextureBufferImpl.saveMyBitmap(java.lang.String, byte[], int, int):void");
    }

    public Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        int min = Math.min(i, (getWidth() * i2) / getHeight());
        int min2 = Math.min(i2, (getHeight() * i) / getWidth());
        matrix.preScale(((float) min) / ((float) getWidth()), ((float) min2) / ((float) getHeight()));
        matrix.preTranslate((float) (i3 / i), (float) ((i2 - (i4 + min2)) / i2));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i2, this.type, this.f118911id, matrix, this.textureHelper, new Runnable() {
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        return textureBufferImpl;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.postScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        matrix.postTranslate(((float) i) / ((float) this.width), ((float) i2) / ((float) this.height));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i5, i6, this.type, this.f118911id, matrix, this.textureHelper, new Runnable() {
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i, int i2, Type type2, int i3, Matrix matrix, TextureHelper textureHelper2, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f118911id = i3;
        this.transformMatrix = matrix;
        this.textureHelper = textureHelper2;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }
}
