package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.taobao.android.dexposed.ClassUtils;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.Context;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.RendererCommon.ScalingType;

public class EglRenderer implements VideoSink {
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private final Matrix drawMatrix = new Matrix();
    private GlDrawer drawer;
    public EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object frameLock = new Object();
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    public final Object handlerLock = new Object();
    private float layoutAspectRatio;
    private final Object layoutLock = new Object();
    public final Runnable logStatisticsRunnable = new Runnable() {
        public void run() {
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                if (EglRenderer.this.renderThreadHandler != null) {
                    EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                    EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
                }
            }
        }
    };
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private ScalingType renderModel = ScalingType.SCALE_ASPECT_FILL;
    private long renderSwapBufferTimeNs;
    public Handler renderThreadHandler;
    private long renderTimeNs;
    private final Object statisticsLock = new Object();
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;

    class EglSurfaceCreation implements Runnable {
        private Object surface;

        public synchronized void run() {
            if (!(this.surface == null || EglRenderer.this.eglBase == null || EglRenderer.this.eglBase.hasSurface())) {
                if (this.surface instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (this.surface instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    StringBuilder sb = new StringBuilder("Invalid surface: ");
                    sb.append(this.surface);
                    throw new IllegalStateException(sb.toString());
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        private EglSurfaceCreation() {
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.m150049e("EglRenderer", "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                thread = null;
            } else {
                thread = this.renderThreadHandler.getLooper().getThread();
            }
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        org.webrtc.ThreadUtils.awaitUninterruptibly(r0);
        r0 = r5.frameLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r5.pendingFrame == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r5.pendingFrame.release();
        r5.pendingFrame = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        logD("Releasing done.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r5 = this;
            java.lang.String r0 = "Releasing."
            r5.logD(r0)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            java.lang.Object r1 = r5.handlerLock
            monitor-enter(r1)
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x0019
            java.lang.String r0 = "Already released"
            r5.logD(r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return
        L_0x0019:
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0059 }
            java.lang.Runnable r3 = r5.logStatisticsRunnable     // Catch:{ all -> 0x0059 }
            r2.removeCallbacks(r3)     // Catch:{ all -> 0x0059 }
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0059 }
            org.webrtc.EglRenderer$$Lambda$1 r3 = new org.webrtc.EglRenderer$$Lambda$1     // Catch:{ all -> 0x0059 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0059 }
            r2.postAtFrontOfQueue(r3)     // Catch:{ all -> 0x0059 }
            android.os.Handler r2 = r5.renderThreadHandler     // Catch:{ all -> 0x0059 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ all -> 0x0059 }
            android.os.Handler r3 = r5.renderThreadHandler     // Catch:{ all -> 0x0059 }
            org.webrtc.EglRenderer$$Lambda$2 r4 = new org.webrtc.EglRenderer$$Lambda$2     // Catch:{ all -> 0x0059 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0059 }
            r3.post(r4)     // Catch:{ all -> 0x0059 }
            r2 = 0
            r5.renderThreadHandler = r2     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            java.lang.Object r0 = r5.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r1 = r5.pendingFrame     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x004f
            org.webrtc.VideoFrame r1 = r5.pendingFrame     // Catch:{ all -> 0x0056 }
            r1.release()     // Catch:{ all -> 0x0056 }
            r5.pendingFrame = r2     // Catch:{ all -> 0x0056 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "Releasing done."
            r5.logD(r0)
            return
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0059:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.release():void");
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j > 0) {
                float nanos = ((float) (((long) this.framesRendered) * TimeUnit.SECONDS.toNanos(1))) / ((float) j);
                StringBuilder sb = new StringBuilder("Duration: ");
                sb.append(TimeUnit.NANOSECONDS.toMillis(j));
                sb.append(" ms. Frames received: ");
                sb.append(this.framesReceived);
                sb.append(". Dropped: ");
                sb.append(this.framesDropped);
                sb.append(". Rendered: ");
                sb.append(this.framesRendered);
                sb.append(". Render fps: ");
                sb.append(decimalFormat.format((double) nanos));
                sb.append(". Average render time: ");
                sb.append(averageTimeAsString(this.renderTimeNs, this.framesRendered));
                sb.append(". Average swapBuffer time: ");
                sb.append(averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered));
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                logD(sb.toString());
                resetStatistics(nanoTime);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r14.eglBase == null) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r14.eglBase.hasSurface() != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = r14.fpsReductionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r14.minRenderPeriodNs != Long.MAX_VALUE) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r14.minRenderPeriodNs > 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        r2 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r2 >= r14.nextFrameTimeNs) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        logD("Skipping frame rendering - fps reduction is active.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r14.nextFrameTimeNs += r14.minRenderPeriodNs;
        r14.nextFrameTimeNs = java.lang.Math.max(r14.nextFrameTimeNs, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r12 = java.lang.System.nanoTime();
        r0 = ((float) r1.getRotatedWidth()) / ((float) r1.getRotatedHeight());
        r2 = r14.layoutLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r14.layoutAspectRatio == 0.0f) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        r3 = r14.layoutAspectRatio;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        r5 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        switch(r14.renderModel) {
            case org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT :org.webrtc.RendererCommon$ScalingType: goto L_0x0098;
            case org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL :org.webrtc.RendererCommon$ScalingType: goto L_0x008f;
            case org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED :org.webrtc.RendererCommon$ScalingType: goto L_0x0098;
            default: goto L_0x0088;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r0 <= r3) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        r0 = r3 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r0 <= r3) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        r0 = r3 / r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        r0 = r0 / r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009d, code lost:
        r0 = r0 / r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009e, code lost:
        r2 = r0;
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        r14.drawMatrix.reset();
        r14.drawMatrix.preTranslate(0.5f, 0.5f);
        r3 = r14.drawMatrix;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
        if (r14.mirrorHorizontally == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b5, code lost:
        r6 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b8, code lost:
        r6 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        if (r14.mirrorVertically == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        r5 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
        r3.preScale(r6, r5);
        r14.drawMatrix.preScale(r0, r2);
        r14.drawMatrix.preTranslate(-0.5f, -0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (r11 == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        switch(r14.renderModel) {
            case org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT :org.webrtc.RendererCommon$ScalingType: goto L_0x0134;
            case org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL :org.webrtc.RendererCommon$ScalingType: goto L_0x011a;
            case org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED :org.webrtc.RendererCommon$ScalingType: goto L_0x0100;
            default: goto L_0x00e6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e6, code lost:
        r14.frameDrawer.drawFrame(r1, r14.drawer, r14.drawMatrix, 0, 0, r14.eglBase.surfaceWidth(), r14.eglBase.surfaceHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0100, code lost:
        r14.frameDrawer.drawFrame(r1, r14.drawer, r14.drawMatrix, 0, 0, r14.eglBase.surfaceWidth(), r14.eglBase.surfaceHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        r14.frameDrawer.drawFrame(r1, r14.drawer, r14.drawMatrix, 0, 0, r14.eglBase.surfaceWidth(), r14.eglBase.surfaceHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0158, code lost:
        if ((((float) r14.eglBase.surfaceWidth()) / ((float) r14.eglBase.surfaceHeight())) >= (((float) r1.getBuffer().getWidth()) / ((float) r1.getBuffer().getHeight()))) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r14.frameDrawer.drawFrame(r1, r14.drawer, r14.drawMatrix, 0, (r14.eglBase.surfaceHeight() - ((int) ((((float) r14.eglBase.surfaceWidth()) * ((float) r1.getBuffer().getHeight())) / ((float) r1.getBuffer().getWidth())))) / 2, r14.eglBase.surfaceWidth(), (int) ((((float) r14.eglBase.surfaceWidth()) * ((float) r1.getBuffer().getHeight())) / ((float) r1.getBuffer().getWidth())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01af, code lost:
        r14.frameDrawer.drawFrame(r1, r14.drawer, r14.drawMatrix, (r14.eglBase.surfaceWidth() - ((int) ((((float) r14.eglBase.surfaceHeight()) * ((float) r1.getBuffer().getWidth())) / ((float) r1.getBuffer().getHeight())))) / 2, 0, (int) ((((float) r14.eglBase.surfaceHeight()) * ((float) r1.getBuffer().getWidth())) / ((float) r1.getBuffer().getHeight())), r14.eglBase.surfaceHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0203, code lost:
        r2 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0209, code lost:
        if (r14.usePresentationTimeStamp == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x020b, code lost:
        r14.eglBase.swapBuffers(r1.getTimestampNs());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0215, code lost:
        r14.eglBase.swapBuffers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021a, code lost:
        r4 = java.lang.System.nanoTime();
        r0 = r14.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0220, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r14.framesRendered++;
        r14.renderTimeNs += r4 - r12;
        r14.renderSwapBufferTimeNs += r4 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0235, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023a, code lost:
        notifyCallbacks(r1, r11);
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0240, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0247, code lost:
        logD("Dropping frame - No surface");
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x024f, code lost:
        return;
     */
    /* renamed from: renderFrameOnRenderThread */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bridge$lambda$0$EglRenderer() {
        /*
            r14 = this;
            java.lang.Object r0 = r14.frameLock
            monitor-enter(r0)
            org.webrtc.VideoFrame r1 = r14.pendingFrame     // Catch:{ all -> 0x0250 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0250 }
            return
        L_0x0009:
            org.webrtc.VideoFrame r1 = r14.pendingFrame     // Catch:{ all -> 0x0250 }
            r2 = 0
            r14.pendingFrame = r2     // Catch:{ all -> 0x0250 }
            monitor-exit(r0)     // Catch:{ all -> 0x0250 }
            org.webrtc.EglBase r0 = r14.eglBase
            if (r0 == 0) goto L_0x0247
            org.webrtc.EglBase r0 = r14.eglBase
            boolean r0 = r0.hasSurface()
            if (r0 != 0) goto L_0x001d
            goto L_0x0247
        L_0x001d:
            java.lang.Object r0 = r14.fpsReductionLock
            monitor-enter(r0)
            long r2 = r14.minRenderPeriodNs     // Catch:{ all -> 0x0244 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
            r10 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
        L_0x002d:
            r11 = 0
            goto L_0x005a
        L_0x002f:
            long r2 = r14.minRenderPeriodNs     // Catch:{ all -> 0x0244 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0039
        L_0x0037:
            r11 = 1
            goto L_0x005a
        L_0x0039:
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0244 }
            long r4 = r14.nextFrameTimeNs     // Catch:{ all -> 0x0244 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0049
            java.lang.String r2 = "Skipping frame rendering - fps reduction is active."
            r14.logD(r2)     // Catch:{ all -> 0x0244 }
            goto L_0x002d
        L_0x0049:
            long r4 = r14.nextFrameTimeNs     // Catch:{ all -> 0x0244 }
            long r6 = r14.minRenderPeriodNs     // Catch:{ all -> 0x0244 }
            r8 = 0
            long r4 = r4 + r6
            r14.nextFrameTimeNs = r4     // Catch:{ all -> 0x0244 }
            long r4 = r14.nextFrameTimeNs     // Catch:{ all -> 0x0244 }
            long r2 = java.lang.Math.max(r4, r2)     // Catch:{ all -> 0x0244 }
            r14.nextFrameTimeNs = r2     // Catch:{ all -> 0x0244 }
            goto L_0x0037
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0244 }
            long r12 = java.lang.System.nanoTime()
            int r0 = r1.getRotatedWidth()
            float r0 = (float) r0
            int r2 = r1.getRotatedHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            java.lang.Object r2 = r14.layoutLock
            monitor-enter(r2)
            float r3 = r14.layoutAspectRatio     // Catch:{ all -> 0x0241 }
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0077
            float r3 = r14.layoutAspectRatio     // Catch:{ all -> 0x0241 }
            goto L_0x0078
        L_0x0077:
            r3 = r0
        L_0x0078:
            monitor-exit(r2)     // Catch:{ all -> 0x0241 }
            int[] r2 = org.webrtc.EglRenderer.C483843.$SwitchMap$org$webrtc$RendererCommon$ScalingType
            org.webrtc.RendererCommon$ScalingType r5 = r14.renderModel
            int r5 = r5.ordinal()
            r2 = r2[r5]
            r5 = 1065353216(0x3f800000, float:1.0)
            switch(r2) {
                case 1: goto L_0x0098;
                case 2: goto L_0x008f;
                case 3: goto L_0x0098;
                default: goto L_0x0088;
            }
        L_0x0088:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x009d
            float r0 = r3 / r0
            goto L_0x009a
        L_0x008f:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            float r0 = r3 / r0
            goto L_0x009a
        L_0x0096:
            float r0 = r0 / r3
            goto L_0x009e
        L_0x0098:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x009a:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a1
        L_0x009d:
            float r0 = r0 / r3
        L_0x009e:
            r2 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00a1:
            android.graphics.Matrix r3 = r14.drawMatrix
            r3.reset()
            android.graphics.Matrix r3 = r14.drawMatrix
            r6 = 1056964608(0x3f000000, float:0.5)
            r3.preTranslate(r6, r6)
            android.graphics.Matrix r3 = r14.drawMatrix
            boolean r6 = r14.mirrorHorizontally
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r6 == 0) goto L_0x00b8
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00ba
        L_0x00b8:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00ba:
            boolean r8 = r14.mirrorVertically
            if (r8 == 0) goto L_0x00c0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00c0:
            r3.preScale(r6, r5)
            android.graphics.Matrix r3 = r14.drawMatrix
            r3.preScale(r0, r2)
            android.graphics.Matrix r0 = r14.drawMatrix
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            r0.preTranslate(r2, r2)
            if (r11 == 0) goto L_0x023a
            android.opengl.GLES20.glClearColor(r4, r4, r4, r4)
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)
            int[] r0 = org.webrtc.EglRenderer.C483843.$SwitchMap$org$webrtc$RendererCommon$ScalingType
            org.webrtc.RendererCommon$ScalingType r2 = r14.renderModel
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L_0x0134;
                case 2: goto L_0x011a;
                case 3: goto L_0x0100;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            org.webrtc.VideoFrameDrawer r2 = r14.frameDrawer
            org.webrtc.RendererCommon$GlDrawer r4 = r14.drawer
            android.graphics.Matrix r5 = r14.drawMatrix
            r6 = 0
            r7 = 0
            org.webrtc.EglBase r0 = r14.eglBase
            int r8 = r0.surfaceWidth()
            org.webrtc.EglBase r0 = r14.eglBase
            int r9 = r0.surfaceHeight()
            r3 = r1
            r2.drawFrame(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0203
        L_0x0100:
            org.webrtc.VideoFrameDrawer r2 = r14.frameDrawer
            org.webrtc.RendererCommon$GlDrawer r4 = r14.drawer
            android.graphics.Matrix r5 = r14.drawMatrix
            r6 = 0
            r7 = 0
            org.webrtc.EglBase r0 = r14.eglBase
            int r8 = r0.surfaceWidth()
            org.webrtc.EglBase r0 = r14.eglBase
            int r9 = r0.surfaceHeight()
            r3 = r1
            r2.drawFrame(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0203
        L_0x011a:
            org.webrtc.VideoFrameDrawer r2 = r14.frameDrawer
            org.webrtc.RendererCommon$GlDrawer r4 = r14.drawer
            android.graphics.Matrix r5 = r14.drawMatrix
            r6 = 0
            r7 = 0
            org.webrtc.EglBase r0 = r14.eglBase
            int r8 = r0.surfaceWidth()
            org.webrtc.EglBase r0 = r14.eglBase
            int r9 = r0.surfaceHeight()
            r3 = r1
            r2.drawFrame(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0203
        L_0x0134:
            org.webrtc.EglBase r0 = r14.eglBase
            int r0 = r0.surfaceWidth()
            float r0 = (float) r0
            org.webrtc.EglBase r2 = r14.eglBase
            int r2 = r2.surfaceHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            org.webrtc.VideoFrame$Buffer r2 = r1.getBuffer()
            int r2 = r2.getWidth()
            float r2 = (float) r2
            org.webrtc.VideoFrame$Buffer r3 = r1.getBuffer()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01af
            org.webrtc.VideoFrameDrawer r2 = r14.frameDrawer
            org.webrtc.RendererCommon$GlDrawer r4 = r14.drawer
            android.graphics.Matrix r5 = r14.drawMatrix
            r6 = 0
            org.webrtc.EglBase r0 = r14.eglBase
            int r0 = r0.surfaceHeight()
            org.webrtc.EglBase r3 = r14.eglBase
            int r3 = r3.surfaceWidth()
            float r3 = (float) r3
            org.webrtc.VideoFrame$Buffer r7 = r1.getBuffer()
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r3 = r3 * r7
            org.webrtc.VideoFrame$Buffer r7 = r1.getBuffer()
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r3 = r3 / r7
            int r3 = (int) r3
            int r0 = r0 - r3
            int r7 = r0 / 2
            org.webrtc.EglBase r0 = r14.eglBase
            int r8 = r0.surfaceWidth()
            org.webrtc.EglBase r0 = r14.eglBase
            int r0 = r0.surfaceWidth()
            float r0 = (float) r0
            org.webrtc.VideoFrame$Buffer r3 = r1.getBuffer()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r0 = r0 * r3
            org.webrtc.VideoFrame$Buffer r3 = r1.getBuffer()
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r9 = (int) r0
            r3 = r1
            r2.drawFrame(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0203
        L_0x01af:
            org.webrtc.VideoFrameDrawer r2 = r14.frameDrawer
            org.webrtc.RendererCommon$GlDrawer r4 = r14.drawer
            android.graphics.Matrix r5 = r14.drawMatrix
            org.webrtc.EglBase r0 = r14.eglBase
            int r0 = r0.surfaceWidth()
            org.webrtc.EglBase r3 = r14.eglBase
            int r3 = r3.surfaceHeight()
            float r3 = (float) r3
            org.webrtc.VideoFrame$Buffer r6 = r1.getBuffer()
            int r6 = r6.getWidth()
            float r6 = (float) r6
            float r3 = r3 * r6
            org.webrtc.VideoFrame$Buffer r6 = r1.getBuffer()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            int r3 = (int) r3
            int r0 = r0 - r3
            int r6 = r0 / 2
            r7 = 0
            org.webrtc.EglBase r0 = r14.eglBase
            int r0 = r0.surfaceHeight()
            float r0 = (float) r0
            org.webrtc.VideoFrame$Buffer r3 = r1.getBuffer()
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r0 = r0 * r3
            org.webrtc.VideoFrame$Buffer r3 = r1.getBuffer()
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r8 = (int) r0
            org.webrtc.EglBase r0 = r14.eglBase
            int r9 = r0.surfaceHeight()
            r3 = r1
            r2.drawFrame(r3, r4, r5, r6, r7, r8, r9)
        L_0x0203:
            long r2 = java.lang.System.nanoTime()
            boolean r0 = r14.usePresentationTimeStamp
            if (r0 == 0) goto L_0x0215
            org.webrtc.EglBase r0 = r14.eglBase
            long r4 = r1.getTimestampNs()
            r0.swapBuffers(r4)
            goto L_0x021a
        L_0x0215:
            org.webrtc.EglBase r0 = r14.eglBase
            r0.swapBuffers()
        L_0x021a:
            long r4 = java.lang.System.nanoTime()
            java.lang.Object r0 = r14.statisticsLock
            monitor-enter(r0)
            int r6 = r14.framesRendered     // Catch:{ all -> 0x0237 }
            int r6 = r6 + r10
            r14.framesRendered = r6     // Catch:{ all -> 0x0237 }
            long r6 = r14.renderTimeNs     // Catch:{ all -> 0x0237 }
            r8 = 0
            long r8 = r4 - r12
            long r6 = r6 + r8
            r14.renderTimeNs = r6     // Catch:{ all -> 0x0237 }
            long r6 = r14.renderSwapBufferTimeNs     // Catch:{ all -> 0x0237 }
            r8 = 0
            long r4 = r4 - r2
            long r6 = r6 + r4
            r14.renderSwapBufferTimeNs = r6     // Catch:{ all -> 0x0237 }
            monitor-exit(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x023a
        L_0x0237:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0237 }
            throw r1
        L_0x023a:
            r14.notifyCallbacks(r1, r11)
            r1.release()
            return
        L_0x0241:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0241 }
            throw r0
        L_0x0244:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0244 }
            throw r1
        L_0x0247:
            java.lang.String r0 = "Dropping frame - No surface"
            r14.logD(r0)
            r1.release()
            return
        L_0x0250:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0250 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.bridge$lambda$0$EglRenderer():void");
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void setRenderModel(ScalingType scalingType) {
        this.renderModel = scalingType;
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$release$2$EglRenderer(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    private void logD(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(str);
        Logging.m150047d("EglRenderer", sb.toString());
    }

    private void logW(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(str);
        Logging.m150051w("EglRenderer", sb.toString());
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.post(runnable);
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0;
            this.renderSwapBufferTimeNs = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$releaseEglSurface$5$EglRenderer(Runnable runnable) {
        if (this.eglBase != null) {
            this.eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    public void setLayoutAspectRatio(float f) {
        StringBuilder sb = new StringBuilder("setLayoutAspectRatio: ");
        sb.append(f);
        logD(sb.toString());
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        StringBuilder sb = new StringBuilder("setMirrorHorizontally: ");
        sb.append(z);
        logD(sb.toString());
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        StringBuilder sb = new StringBuilder("setMirrorVertically: ");
        sb.append(z);
        logD(sb.toString());
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$release$1$EglRenderer(CountDownLatch countDownLatch) {
        GLES20.glUseProgram(0);
        if (this.drawer != null) {
            this.drawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public void releaseEglSurface(Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new EglRenderer$$Lambda$6(this, runnable));
                return;
            }
            runnable.run();
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                if (Thread.currentThread() != this.renderThreadHandler.getLooper().getThread()) {
                    postToRenderThread(new EglRenderer$$Lambda$4(this, countDownLatch, frameListener));
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                    return;
                }
                throw new RuntimeException("removeFrameListener must not be called on the render thread.");
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        if (r3 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        r6 = r5.statisticsLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.framesDropped++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.statisticsLock
            monitor-enter(r0)
            int r1 = r5.framesReceived     // Catch:{ all -> 0x0052 }
            r2 = 1
            int r1 = r1 + r2
            r5.framesReceived = r1     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r5.handlerLock
            monitor-enter(r1)
            android.os.Handler r0 = r5.renderThreadHandler     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x0018
            java.lang.String r6 = "Dropping frame - Not initialized or already released."
            r5.logD(r6)     // Catch:{ all -> 0x004f }
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            return
        L_0x0018:
            java.lang.Object r0 = r5.frameLock     // Catch:{ all -> 0x004f }
            monitor-enter(r0)     // Catch:{ all -> 0x004f }
            org.webrtc.VideoFrame r3 = r5.pendingFrame     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 == 0) goto L_0x0029
            org.webrtc.VideoFrame r4 = r5.pendingFrame     // Catch:{ all -> 0x004c }
            r4.release()     // Catch:{ all -> 0x004c }
        L_0x0029:
            r5.pendingFrame = r6     // Catch:{ all -> 0x004c }
            org.webrtc.VideoFrame r6 = r5.pendingFrame     // Catch:{ all -> 0x004c }
            r6.retain()     // Catch:{ all -> 0x004c }
            android.os.Handler r6 = r5.renderThreadHandler     // Catch:{ all -> 0x004c }
            org.webrtc.EglRenderer$$Lambda$5 r4 = new org.webrtc.EglRenderer$$Lambda$5     // Catch:{ all -> 0x004c }
            r4.<init>(r5)     // Catch:{ all -> 0x004c }
            r6.post(r4)     // Catch:{ all -> 0x004c }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x004b
            java.lang.Object r6 = r5.statisticsLock
            monitor-enter(r6)
            int r0 = r5.framesDropped     // Catch:{ all -> 0x0048 }
            int r0 = r0 + r2
            r5.framesDropped = r0     // Catch:{ all -> 0x0048 }
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            throw r0
        L_0x004b:
            return
        L_0x004c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r6     // Catch:{ all -> 0x004f }
        L_0x004f:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            throw r6
        L_0x0052:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void setFpsReduction(float f) {
        StringBuilder sb = new StringBuilder("setFpsReduction: ");
        sb.append(f);
        logD(sb.toString());
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TimeUnit.NANOSECONDS.toMicros(j / ((long) i)));
        sb.append(" us");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$init$0$EglRenderer(Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = EglBase$$CC.createEgl10$$STATIC$$(iArr);
            return;
        }
        logD("EglBase.create shared context");
        this.eglBase = EglBase$$CC.create$$STATIC$$(context, iArr);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$removeFrameListener$4$EglRenderer(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                it.remove();
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f;
        float f2;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            Matrix matrix = this.drawMatrix;
            if (this.mirrorHorizontally) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (this.mirrorVertically) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            matrix.preScale(f, f2);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams frameListenerAndParams = (FrameListenerAndParams) it.next();
                if (z || !frameListenerAndParams.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (frameListenerAndParams.scale * ((float) videoFrame.getRotatedWidth()));
                    int rotatedHeight = (int) (frameListenerAndParams.scale * ((float) videoFrame.getRotatedHeight()));
                    if (rotatedWidth == 0 || rotatedHeight == 0) {
                        frameListenerAndParams.listener.onFrame(null);
                    } else {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        this.frameDrawer.drawFrame(videoFrame, frameListenerAndParams.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        frameListenerAndParams.listener.onFrame(createBitmap);
                    }
                }
            }
        }
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$addFrameListener$3$EglRenderer(GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread */
    public void lambda$clearImage$6$EglRenderer(float f, float f2, float f3, float f4) {
        if (this.eglBase != null && this.eglBase.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers();
        }
    }

    public void addFrameListener(FrameListener frameListener, float f, GlDrawer glDrawer, boolean z) {
        EglRenderer$$Lambda$3 eglRenderer$$Lambda$3 = new EglRenderer$$Lambda$3(this, glDrawer, frameListener, f, z);
        postToRenderThread(eglRenderer$$Lambda$3);
    }

    public void clearImage(float f, float f2, float f3, float f4) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                Handler handler = this.renderThreadHandler;
                EglRenderer$$Lambda$7 eglRenderer$$Lambda$7 = new EglRenderer$$Lambda$7(this, f, f2, f3, f4);
                handler.postAtFrontOfQueue(eglRenderer$$Lambda$7);
            }
        }
    }

    public void init(Context context, int[] iArr, GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                StringBuilder sb = new StringBuilder();
                sb.append(this.name);
                sb.append("EglRenderer");
                HandlerThread handlerThread = new HandlerThread(sb.toString());
                handlerThread.start();
                this.renderThreadHandler = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() {
                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, (Runnable) new EglRenderer$$Lambda$0(this, context, iArr));
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.name);
                sb2.append("Already initialized");
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
