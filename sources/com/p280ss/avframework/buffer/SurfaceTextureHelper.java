package com.p280ss.avframework.buffer;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.opengl.YuvConverter;
import com.p280ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: com.ss.avframework.buffer.SurfaceTextureHelper */
public class SurfaceTextureHelper {
    private final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public OnTextureFrameAvailableListener listener;
    private final int oesTextureId;
    private OnFrameAvailableListener onFrameAvailableListener = new OnFrameAvailableListener() {
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            SurfaceTextureHelper.this.hasPendingTexture = true;
            SurfaceTextureHelper.this.tryDeliverTextureFrame();
        }
    };
    public OnTextureFrameAvailableListener pendingListener;
    final Runnable setListenerRunnable = new Runnable() {
        public void run() {
            SurfaceTextureHelper.this.listener = SurfaceTextureHelper.this.pendingListener;
            SurfaceTextureHelper.this.pendingListener = null;
            if (SurfaceTextureHelper.this.hasPendingTexture) {
                SurfaceTextureHelper.this.updateTexImage();
                SurfaceTextureHelper.this.hasPendingTexture = false;
            }
        }
    };
    private final SurfaceTexture surfaceTexture;
    public YuvConverter yuvConverter;

    /* renamed from: com.ss.avframework.buffer.SurfaceTextureHelper$OnTextureFrameAvailableListener */
    public interface OnTextureFrameAvailableListener {
        void onTextureFrameAvailable(int i, float[] fArr, long j);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public int getTextureId() {
        return this.oesTextureId;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void updateTexImage() {
        this.surfaceTexture.updateTexImage();
    }

    public void dispose() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new Runnable() {
            public void run() {
                SurfaceTextureHelper.this.isQuitting = true;
                if (!SurfaceTextureHelper.this.isTextureInUse) {
                    SurfaceTextureHelper.this.release();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void handlerExit() {
        this.handler.getLooper().quit();
    }

    public void returnTextureFrame() {
        this.handler.post(new Runnable() {
            public void run() {
                SurfaceTextureHelper.this.isTextureInUse = false;
                if (SurfaceTextureHelper.this.isQuitting) {
                    SurfaceTextureHelper.this.release();
                } else {
                    SurfaceTextureHelper.this.tryDeliverTextureFrame();
                }
            }
        });
    }

    public void stopListening() {
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new Runnable() {
            public void run() {
                SurfaceTextureHelper.this.listener = null;
                SurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    public void insertTextureFrameIfNeed() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            long currentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, currentTimeMillis);
        }
    }

    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            if (this.yuvConverter != null) {
                this.yuvConverter.release();
            }
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            handlerExit();
        }
    }

    public void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            long currentTimeMillis = System.currentTimeMillis() * 1000 * 1000;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            this.listener.onTextureFrameAvailable(this.oesTextureId, fArr, currentTimeMillis);
        }
    }

    public static SurfaceTextureHelper create(String str) {
        GLThread gLThread = new GLThread(str);
        gLThread.start();
        final Handler handler2 = new Handler(gLThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, (Callable<V>) new Callable<SurfaceTextureHelper>() {
            public final SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(handler2);
                } catch (RuntimeException unused) {
                    return null;
                }
            }
        });
    }

    public void startListening(OnTextureFrameAvailableListener onTextureFrameAvailableListener) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = onTextureFrameAvailableListener;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public I420Buffer textureToYuv(final TextureBuffer textureBuffer) {
        final I420Buffer[] i420BufferArr = new I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new Runnable() {
            public void run() {
                if (SurfaceTextureHelper.this.yuvConverter == null) {
                    SurfaceTextureHelper.this.yuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = SurfaceTextureHelper.this.yuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public SurfaceTextureHelper(Handler handler2) {
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            this.oesTextureId = GlUtil.generateTexture(36197);
            this.surfaceTexture = new SurfaceTexture(this.oesTextureId);
            setOnFrameAvailableListener(this.surfaceTexture, this.onFrameAvailableListener, handler2);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, OnFrameAvailableListener onFrameAvailableListener2, Handler handler2) {
        if (VERSION.SDK_INT >= 21) {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener2, handler2);
        } else {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener2);
        }
    }

    public TextureBuffer createTextureBuffer(int i, int i2, Matrix matrix) {
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i2, Type.OES, this.oesTextureId, matrix, this, (Runnable) new Runnable() {
            public void run() {
                SurfaceTextureHelper.this.returnTextureFrame();
            }
        });
        return textureBufferImpl;
    }

    /* access modifiers changed from: 0000 */
    public void textureToYUV(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        if (i4 == this.oesTextureId) {
            Handler handler2 = this.handler;
            final ByteBuffer byteBuffer2 = byteBuffer;
            final int i5 = i;
            final int i6 = i2;
            final int i7 = i3;
            final int i8 = i4;
            final float[] fArr2 = fArr;
            C454687 r0 = new Runnable() {
                public void run() {
                    if (SurfaceTextureHelper.this.yuvConverter == null) {
                        SurfaceTextureHelper.this.yuvConverter = new YuvConverter();
                    }
                    SurfaceTextureHelper.this.yuvConverter.convert(byteBuffer2, i5, i6, i7, i8, fArr2);
                }
            };
            ThreadUtils.invokeAtFrontUninterruptibly(handler2, (Runnable) r0);
            return;
        }
        throw new IllegalStateException("textureToByteBuffer called with unexpected textureId");
    }
}
