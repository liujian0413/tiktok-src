package com.p280ss.avframework.capture.video;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjection.Callback;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import com.p280ss.avframework.buffer.SurfaceTextureHelper;
import com.p280ss.avframework.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.avframework.capture.video.ScreenVideoCapturer */
public class ScreenVideoCapturer extends VideoCapturer implements OnTextureFrameAvailableListener {
    private int fps;
    private int height;
    private boolean isDisposed;
    public final Runnable mDupFrameTask = new Runnable() {
        public void run() {
            if (ScreenVideoCapturer.this.surfaceTextureHelper != null && ScreenVideoCapturer.this.mStat == 1) {
                ScreenVideoCapturer.this.surfaceTextureHelper.insertTextureFrameIfNeed();
            }
        }
    };
    public final VideoCapturerObserver mObserver;
    public int mStat;
    public MediaProjection mediaProjection;
    public final Callback mediaProjectionCallback = new Callback() {
        public void onStop() {
            if (ScreenVideoCapturer.this.mObserver != null) {
                ScreenVideoCapturer.this.mObserver.onVideoCapturerStoped();
            }
            super.onStop();
        }
    };
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    public SurfaceTextureHelper surfaceTextureHelper;
    public VirtualDisplay virtualDisplay;
    private int width;

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    public boolean isScreenCast() {
        return true;
    }

    public int status() {
        return this.mStat;
    }

    public void stop() {
        stopCapture();
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private synchronized void dispose() {
        this.isDisposed = true;
    }

    public void release() {
        dispose();
        super.release();
        this.mStat = 2;
    }

    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), (Runnable) new Runnable() {
            public void run() {
                ScreenVideoCapturer.this.surfaceTextureHelper.getHandler().removeCallbacks(ScreenVideoCapturer.this.mDupFrameTask);
                ScreenVideoCapturer.this.surfaceTextureHelper.stopListening();
                if (ScreenVideoCapturer.this.virtualDisplay != null) {
                    ScreenVideoCapturer.this.virtualDisplay.release();
                    ScreenVideoCapturer.this.virtualDisplay = null;
                }
                if (ScreenVideoCapturer.this.mediaProjection != null) {
                    ScreenVideoCapturer.this.mediaProjection.unregisterCallback(ScreenVideoCapturer.this.mediaProjectionCallback);
                    ScreenVideoCapturer.this.mediaProjection.stop();
                    ScreenVideoCapturer.this.mediaProjection = null;
                }
                ScreenVideoCapturer.this.mStat = 0;
            }
        });
    }

    public void createVirtualDisplay() {
        this.surfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    public ScreenVideoCapturer(Intent intent, VideoCapturerObserver videoCapturerObserver) {
        this.mediaProjectionPermissionResultData = intent;
        this.mObserver = videoCapturerObserver;
        this.mStat = 2;
    }

    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper2, Context context) {
        checkNotDisposed();
        if (surfaceTextureHelper2 != null) {
            this.surfaceTextureHelper = surfaceTextureHelper2;
            this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
            this.mStat = 0;
        } else {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
    }

    public void start(int i, int i2, int i3) {
        startCapture(i, i2, i3);
    }

    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), (Runnable) new Runnable() {
                public void run() {
                    ScreenVideoCapturer.this.virtualDisplay.release();
                    ScreenVideoCapturer.this.createVirtualDisplay();
                }
            });
        }
    }

    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        this.surfaceTextureHelper.getHandler().removeCallbacks(this.mDupFrameTask);
        this.surfaceTextureHelper.getHandler().postDelayed(this.mDupFrameTask, 200);
        this.numCapturedFrames++;
        TextureBuffer createTextureBuffer = this.surfaceTextureHelper.createTextureBuffer(this.width, this.height, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
        onFrame(createTextureBuffer, this.width, this.height, 0, j / 1000);
        createTextureBuffer.release();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void startCapture(int r2, int r3, int r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            r1.checkNotDisposed()     // Catch:{ all -> 0x0052 }
            r1.width = r2     // Catch:{ all -> 0x0052 }
            r1.height = r3     // Catch:{ all -> 0x0052 }
            r1.fps = r4     // Catch:{ all -> 0x0052 }
            r2 = -1
            android.media.projection.MediaProjectionManager r3 = r1.mediaProjectionManager     // Catch:{ Exception -> 0x004a }
            android.content.Intent r4 = r1.mediaProjectionPermissionResultData     // Catch:{ Exception -> 0x004a }
            android.media.projection.MediaProjection r3 = r3.getMediaProjection(r2, r4)     // Catch:{ Exception -> 0x004a }
            r1.mediaProjection = r3     // Catch:{ Exception -> 0x004a }
            android.media.projection.MediaProjection r3 = r1.mediaProjection     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x0027
            com.ss.avframework.capture.video.VideoCapturer$VideoCapturerObserver r3 = r1.mObserver     // Catch:{ all -> 0x0052 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "mediaProjection is null, please check permission"
            r4.<init>(r0)     // Catch:{ all -> 0x0052 }
            r3.onVideoCapturerError(r2, r4)     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return
        L_0x0027:
            android.media.projection.MediaProjection r2 = r1.mediaProjection     // Catch:{ all -> 0x0052 }
            android.media.projection.MediaProjection$Callback r3 = r1.mediaProjectionCallback     // Catch:{ all -> 0x0052 }
            com.ss.avframework.buffer.SurfaceTextureHelper r4 = r1.surfaceTextureHelper     // Catch:{ all -> 0x0052 }
            android.os.Handler r4 = r4.getHandler()     // Catch:{ all -> 0x0052 }
            r2.registerCallback(r3, r4)     // Catch:{ all -> 0x0052 }
            r1.createVirtualDisplay()     // Catch:{ all -> 0x0052 }
            com.ss.avframework.buffer.SurfaceTextureHelper r2 = r1.surfaceTextureHelper     // Catch:{ all -> 0x0052 }
            r2.startListening(r1)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r1.mStat = r2     // Catch:{ all -> 0x0052 }
            com.ss.avframework.capture.video.VideoCapturer$VideoCapturerObserver r2 = r1.mObserver     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0048
            com.ss.avframework.capture.video.VideoCapturer$VideoCapturerObserver r2 = r1.mObserver     // Catch:{ all -> 0x0052 }
            r2.onVideoCapturerStarted()     // Catch:{ all -> 0x0052 }
        L_0x0048:
            monitor-exit(r1)
            return
        L_0x004a:
            r3 = move-exception
            com.ss.avframework.capture.video.VideoCapturer$VideoCapturerObserver r4 = r1.mObserver     // Catch:{ all -> 0x0052 }
            r4.onVideoCapturerError(r2, r3)     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return
        L_0x0052:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.capture.video.ScreenVideoCapturer.startCapture(int, int, int):void");
    }
}
