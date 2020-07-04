package org.webrtc;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.VideoFrame.TextureBuffer.Type;

public class SurfaceTextureHelper {
    private final EglBase eglBase;
    private int frameRotation;
    private final Handler handler;
    public boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    public VideoSink listener;
    private final int oesTextureId;
    public VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$stopListening$1$SurfaceTextureHelper() {
        this.listener = null;
        this.pendingListener = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: returnTextureFrame */
    public void bridge$lambda$0$SurfaceTextureHelper() {
        this.handler.post(new SurfaceTextureHelper$$Lambda$4(this));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$dispose$5$SurfaceTextureHelper() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$returnTextureFrame$4$SurfaceTextureHelper() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        Logging.m150047d("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new SurfaceTextureHelper$$Lambda$5(this));
    }

    public void stopListening() {
        Logging.m150047d("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, (Runnable) new SurfaceTextureHelper$$Lambda$1(this));
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.isTextureInUse || !this.isQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            this.yuvConverter.release();
            GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
            this.surfaceTexture.release();
            this.eglBase.release();
            this.handler.getLooper().quit();
            if (this.timestampAligner != null) {
                this.timestampAligner.dispose();
            }
        }
    }

    private void tryDeliverTextureFrame() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (!this.isQuitting && this.hasPendingTexture && !this.isTextureInUse && this.listener != null) {
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            if (this.timestampAligner != null) {
                timestamp = this.timestampAligner.translateTimestamp(timestamp);
            }
            if (this.textureWidth == 0 || this.textureHeight == 0) {
                throw new RuntimeException("Texture size has not been set.");
            }
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new SurfaceTextureHelper$$Lambda$6(this));
            VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setFrameRotation$3$SurfaceTextureHelper(int i) {
        this.frameRotation = i;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$new$0$SurfaceTextureHelper(SurfaceTexture surfaceTexture2) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public I420Buffer textureToYuv(TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public void setFrameRotation(int i) {
        this.handler.post(new SurfaceTextureHelper$$Lambda$3(this, i));
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public static SurfaceTextureHelper create(String str, Context context) {
        return create(str, context, false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$setTextureSize$2$SurfaceTextureHelper(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
    }

    public void setTextureSize(int i, int i2) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Texture width must be positive, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > 0) {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new SurfaceTextureHelper$$Lambda$2(this, i, i2));
        } else {
            StringBuilder sb2 = new StringBuilder("Texture height must be positive, but was ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture2, OnFrameAvailableListener onFrameAvailableListener, Handler handler2) {
        if (VERSION.SDK_INT >= 21) {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener, handler2);
        } else {
            surfaceTexture2.setOnFrameAvailableListener(onFrameAvailableListener);
        }
    }

    public static SurfaceTextureHelper create(final String str, final Context context, final boolean z) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler2 = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler2, (Callable<V>) new Callable<SurfaceTextureHelper>() {
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(Context.this, handler2, z);
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" create failure");
                    Logging.m150049e("SurfaceTextureHelper", sb.toString(), e);
                    return null;
                }
            }
        });
    }

    private SurfaceTextureHelper(Context context, Handler handler2, boolean z) {
        TimestampAligner timestampAligner2;
        this.yuvConverter = new YuvConverter();
        this.setListenerRunnable = new Runnable() {
            public void run() {
                StringBuilder sb = new StringBuilder("Setting listener to ");
                sb.append(SurfaceTextureHelper.this.pendingListener);
                Logging.m150047d("SurfaceTextureHelper", sb.toString());
                SurfaceTextureHelper.this.listener = SurfaceTextureHelper.this.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler2.getLooper().getThread() == Thread.currentThread()) {
            this.handler = handler2;
            if (z) {
                timestampAligner2 = new TimestampAligner();
            } else {
                timestampAligner2 = null;
            }
            this.timestampAligner = timestampAligner2;
            this.eglBase = EglBase$$CC.create$$STATIC$$(context, EglBase.CONFIG_PIXEL_BUFFER);
            try {
                this.eglBase.createDummyPbufferSurface();
                this.eglBase.makeCurrent();
                this.oesTextureId = GlUtil.generateTexture(36197);
                this.surfaceTexture = new SurfaceTexture(this.oesTextureId);
                setOnFrameAvailableListener(this.surfaceTexture, new SurfaceTextureHelper$$Lambda$0(this), handler2);
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler2.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
        }
    }
}
