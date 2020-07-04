package com.p280ss.avframework.livestreamv2.interact.vendor.bytertc;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.p280ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.livestreamv2.RenderView;
import com.p280ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoOutputFormat;
import com.p280ss.avframework.livestreamv2.interact.statistic.LogReporter.LogReportCallback;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics;
import com.p280ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics.IRenderVideoStallCallback;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.video.rtc.engine.mediaio.IVideoSink;
import com.p280ss.video.rtc.engine.p1833ui.VideoFrameRender;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;

/* renamed from: com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink */
public class ByteVideoSink extends SurfaceView implements ToI420Interface, IVideoSink {
    private boolean isFirstRenderFrame = true;
    private boolean isRelease = true;
    private int mBufferType;
    private EngineCallback mCallback;
    private EglBase mEglBase;
    public EGLContext mEglContext;
    private int mInteractId;
    private boolean mIsStart;
    private LogReportCallback mLogReportCallback;
    private RenderVideoFpsStatistics mRenderVideoFpsStatistics;
    private RenderVideoStallStatistics mRenderVideoStallStatistics;
    private RenderView mTexRender;
    private VideoFrameRender mYuvRender;

    public int getBufferType() {
        return this.mBufferType;
    }

    public EGLContext getEGLContextHandle() {
        return this.mEglContext;
    }

    /* access modifiers changed from: protected */
    public Looper getTextureFrameProcessLooper() {
        return null;
    }

    public boolean onInitialize() {
        return true;
    }

    public void onStop() {
        this.mIsStart = false;
    }

    public boolean onStart() {
        this.mIsStart = true;
        this.isFirstRenderFrame = true;
        return true;
    }

    public void stopRenderVideoStallStatistics() {
        this.mRenderVideoStallStatistics.stopStatistics();
    }

    private void onFirstRenderFrameReport() {
        if (this.mLogReportCallback != null) {
            this.mLogReportCallback.onFirstRemoteVideoRender(this.mInteractId);
        }
    }

    public void disableFpsReduction() {
        if (this.mYuvRender != null) {
            this.mYuvRender.disableFpsReduction();
        }
    }

    public int getPixelFormat() {
        if (getBufferType() == 1) {
            return 2;
        }
        return 0;
    }

    public RenderVideoFpsStatisticsReport getVideoFpsReport() {
        if (this.mRenderVideoFpsStatistics != null) {
            return this.mRenderVideoFpsStatistics.getAvgRenderFps();
        }
        return null;
    }

    private VideoOutputFormat getByteVideoOutputFormat() {
        if (getBufferType() == 0) {
            return VideoOutputFormat.PIXEL_FORMAT_I420;
        }
        if (getBufferType() == 1) {
            return VideoOutputFormat.TEXTURE_2D;
        }
        return VideoOutputFormat.PIXEL_FORMAT_UNKNOWN;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$init$0$ByteVideoSink() {
        this.mEglBase = EglBase$$CC.create$$STATIC$$();
        this.mYuvRender.init(this.mEglBase.getEglBaseContext());
        this.mYuvRender.setProcessTextureLopper(getTextureFrameProcessLooper());
        this.mYuvRender.onStart();
    }

    public synchronized void onDispose() {
        if (!this.isRelease) {
            this.isRelease = true;
            if (this.mYuvRender != null) {
                this.mYuvRender.release();
            }
            if (this.mEglBase != null) {
                this.mEglBase.release();
            }
            if (this.mTexRender != null) {
                this.mTexRender.release();
                this.mTexRender = null;
            }
            this.mEglContext = null;
            this.mRenderVideoStallStatistics.stopStatistics();
        }
    }

    public I420Buffer toI420(TextureBuffer textureBuffer) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    public void setEnableHardwareScaler(boolean z) {
        if (this.mYuvRender != null) {
            this.mYuvRender.setEnableHardwareScaler(z);
        }
    }

    public void setFpsReduction(float f) {
        if (this.mYuvRender != null) {
            this.mYuvRender.setFpsReduction(f);
        }
    }

    private void init(int i, EngineCallback engineCallback, LogReportCallback logReportCallback, IRenderVideoStallCallback iRenderVideoStallCallback, Handler handler) {
        this.mInteractId = i;
        this.mCallback = engineCallback;
        this.mLogReportCallback = logReportCallback;
        this.mRenderVideoStallStatistics = new RenderVideoStallStatistics(this.mInteractId, iRenderVideoStallCallback, handler);
        this.mRenderVideoStallStatistics.startStatistics();
        this.mRenderVideoFpsStatistics = new RenderVideoFpsStatistics(this.mInteractId);
        if (getBufferType() == 1) {
            this.mTexRender = new RenderView(this);
            ThreadUtils.invokeAtFrontUninterruptibly(this.mTexRender.getGlThreadHandler(), (Runnable) new Runnable() {
                public void run() {
                    if (VERSION.SDK_INT >= 17) {
                        ByteVideoSink.this.mEglContext = EGL14.eglGetCurrentContext();
                    }
                }
            });
            if (this.mEglContext == null) {
                this.mTexRender.release();
                this.mTexRender = null;
                this.mBufferType = 0;
            }
        }
        if (getBufferType() == 0) {
            this.mYuvRender = new VideoFrameRender("ByteSurfaceViewRender");
            this.mYuvRender.setRenderView((SurfaceView) this, (Callback) null);
            new Handler(Looper.getMainLooper()).post(new ByteVideoSink$$Lambda$0(this));
        }
        this.isRelease = false;
    }

    public ByteVideoSink(int i, EngineCallback engineCallback, LogReportCallback logReportCallback, IRenderVideoStallCallback iRenderVideoStallCallback, Handler handler, Context context) {
        super(context);
        init(i, engineCallback, logReportCallback, iRenderVideoStallCallback, handler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void consumeByteArrayFrame(byte[] r18, int r19, int r20, int r21, int r22, long r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r10 = r20
            r11 = r21
            monitor-enter(r17)
            boolean r2 = r1.mIsStart     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00ca
            com.ss.video.rtc.engine.ui.VideoFrameRender r2 = r1.mYuvRender     // Catch:{ all -> 0x00cc }
            if (r2 != 0) goto L_0x0013
            goto L_0x00ca
        L_0x0013:
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics r2 = r1.mRenderVideoStallStatistics     // Catch:{ all -> 0x00cc }
            r2.rendVideoFrame()     // Catch:{ all -> 0x00cc }
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics r2 = r1.mRenderVideoFpsStatistics     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0021
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics r2 = r1.mRenderVideoFpsStatistics     // Catch:{ all -> 0x00cc }
            r2.rendVideoFrame()     // Catch:{ all -> 0x00cc }
        L_0x0021:
            boolean r2 = r1.isFirstRenderFrame     // Catch:{ all -> 0x00cc }
            r14 = 0
            if (r2 == 0) goto L_0x002b
            r1.isFirstRenderFrame = r14     // Catch:{ all -> 0x00cc }
            r17.onFirstRenderFrameReport()     // Catch:{ all -> 0x00cc }
        L_0x002b:
            com.ss.video.rtc.engine.ui.VideoFrameRender r2 = r1.mYuvRender     // Catch:{ all -> 0x00cc }
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r2.consumeByteArrayFrame(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00cc }
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00c8
            int r2 = r10 % 8
            r3 = 1000000(0xf4240, double:4.940656E-318)
            if (r2 != 0) goto L_0x0067
            int r2 = r0.length     // Catch:{ all -> 0x00cc }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r2)     // Catch:{ all -> 0x00cc }
            r5.put(r0)     // Catch:{ all -> 0x00cc }
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x00cc }
            int r0 = r1.mInteractId     // Catch:{ all -> 0x00cc }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r6 = r17.getByteVideoOutputFormat()     // Catch:{ all -> 0x00cc }
            r8 = 0
            long r12 = r23 / r3
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r20
            r7 = r21
            r9 = r12
            r2.onReceiveVideoBufferFrame(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cc }
            monitor-exit(r17)
            return
        L_0x0067:
            int r2 = r10 + 7
            int r2 = r2 / 8
            int r6 = r2 * 8
            int r2 = r6 / 2
            int r5 = r6 * r11
            int r5 = r5 * 3
            int r5 = r5 / 2
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)     // Catch:{ all -> 0x00cc }
            int r7 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x00cc }
            r8 = 0
            r9 = 0
        L_0x007f:
            if (r8 >= r11) goto L_0x0095
            r5.put(r0, r9, r7)     // Catch:{ all -> 0x00cc }
            int r9 = r9 + r10
            if (r6 <= r7) goto L_0x0092
            int r15 = r5.position()     // Catch:{ all -> 0x00cc }
            int r16 = r6 - r7
            int r15 = r15 + r16
            r5.position(r15)     // Catch:{ all -> 0x00cc }
        L_0x0092:
            int r8 = r8 + 1
            goto L_0x007f
        L_0x0095:
            int r7 = r10 / 2
            int r7 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x00cc }
            r8 = 0
        L_0x009c:
            if (r8 >= r11) goto L_0x00b5
            r5.put(r0, r9, r7)     // Catch:{ all -> 0x00cc }
            int r15 = r10 / 2
            int r9 = r9 + r15
            r15 = 0
        L_0x00a5:
            int r14 = r2 - r7
            if (r15 >= r14) goto L_0x00b1
            r14 = -128(0xffffffffffffff80, float:NaN)
            r5.put(r14)     // Catch:{ all -> 0x00cc }
            int r15 = r15 + 1
            goto L_0x00a5
        L_0x00b1:
            int r8 = r8 + 1
            r14 = 0
            goto L_0x009c
        L_0x00b5:
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x00cc }
            int r0 = r1.mInteractId     // Catch:{ all -> 0x00cc }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r7 = r17.getByteVideoOutputFormat()     // Catch:{ all -> 0x00cc }
            r8 = 0
            long r9 = r23 / r3
            r3 = r0
            r4 = r5
            r5 = r7
            r7 = r21
            r2.onReceiveVideoBufferFrame(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cc }
        L_0x00c8:
            monitor-exit(r17)
            return
        L_0x00ca:
            monitor-exit(r17)
            return
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink.consumeByteArrayFrame(byte[], int, int, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void consumeByteBufferFrame(java.nio.ByteBuffer r18, int r19, int r20, int r21, int r22, long r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r10 = r20
            r11 = r21
            monitor-enter(r17)
            boolean r2 = r1.mIsStart     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x00ec
            com.ss.video.rtc.engine.ui.VideoFrameRender r2 = r1.mYuvRender     // Catch:{ all -> 0x00ee }
            if (r2 != 0) goto L_0x0013
            goto L_0x00ec
        L_0x0013:
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics r2 = r1.mRenderVideoStallStatistics     // Catch:{ all -> 0x00ee }
            r2.rendVideoFrame()     // Catch:{ all -> 0x00ee }
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics r2 = r1.mRenderVideoFpsStatistics     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x0021
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics r2 = r1.mRenderVideoFpsStatistics     // Catch:{ all -> 0x00ee }
            r2.rendVideoFrame()     // Catch:{ all -> 0x00ee }
        L_0x0021:
            r14 = 0
            r0.position(r14)     // Catch:{ all -> 0x00ee }
            com.ss.video.rtc.engine.ui.VideoFrameRender r2 = r1.mYuvRender     // Catch:{ all -> 0x00ee }
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r2.consumeByteBufferFrame(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ee }
            boolean r2 = r1.isFirstRenderFrame     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x003f
            r1.isFirstRenderFrame = r14     // Catch:{ all -> 0x00ee }
            r17.onFirstRenderFrameReport()     // Catch:{ all -> 0x00ee }
        L_0x003f:
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x00ea
            r0.position(r14)     // Catch:{ all -> 0x00ee }
            int r2 = r10 % 8
            r3 = 1000000(0xf4240, double:4.940656E-318)
            if (r2 != 0) goto L_0x0066
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x00ee }
            int r5 = r1.mInteractId     // Catch:{ all -> 0x00ee }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r6 = r17.getByteVideoOutputFormat()     // Catch:{ all -> 0x00ee }
            r8 = 0
            long r12 = r23 / r3
            r3 = r5
            r4 = r18
            r5 = r6
            r6 = r20
            r7 = r21
            r9 = r12
            r2.onReceiveVideoBufferFrame(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ee }
            monitor-exit(r17)
            return
        L_0x0066:
            int r2 = r10 + 7
            int r2 = r2 / 8
            int r6 = r2 * 8
            int r2 = r6 / 2
            int r5 = r6 * r11
            int r5 = r5 * 3
            int r5 = r5 / 2
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)     // Catch:{ all -> 0x00ee }
            int r7 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x00ee }
            byte[] r8 = new byte[r7]     // Catch:{ all -> 0x00ee }
            r9 = 0
        L_0x007f:
            if (r9 >= r11) goto L_0x00a4
            r0.get(r8)     // Catch:{ all -> 0x00ee }
            if (r10 <= r7) goto L_0x0091
            int r15 = r18.position()     // Catch:{ all -> 0x00ee }
            int r16 = r10 - r7
            int r15 = r15 + r16
            r0.position(r15)     // Catch:{ all -> 0x00ee }
        L_0x0091:
            r5.put(r8)     // Catch:{ all -> 0x00ee }
            if (r6 <= r7) goto L_0x00a1
            int r15 = r5.position()     // Catch:{ all -> 0x00ee }
            int r16 = r6 - r7
            int r15 = r15 + r16
            r5.position(r15)     // Catch:{ all -> 0x00ee }
        L_0x00a1:
            int r9 = r9 + 1
            goto L_0x007f
        L_0x00a4:
            int r7 = r10 / 2
            int r7 = java.lang.Math.min(r2, r7)     // Catch:{ all -> 0x00ee }
            byte[] r8 = new byte[r7]     // Catch:{ all -> 0x00ee }
            r9 = 0
        L_0x00ad:
            if (r9 >= r11) goto L_0x00d7
            r0.get(r8)     // Catch:{ all -> 0x00ee }
            int r15 = r10 / 2
            if (r15 <= r7) goto L_0x00c3
            int r15 = r18.position()     // Catch:{ all -> 0x00ee }
            int r16 = r10 / 2
            int r16 = r16 - r7
            int r15 = r15 + r16
            r0.position(r15)     // Catch:{ all -> 0x00ee }
        L_0x00c3:
            r5.put(r8)     // Catch:{ all -> 0x00ee }
            r15 = 0
        L_0x00c7:
            int r14 = r2 - r7
            if (r15 >= r14) goto L_0x00d3
            r14 = -128(0xffffffffffffff80, float:NaN)
            r5.put(r14)     // Catch:{ all -> 0x00ee }
            int r15 = r15 + 1
            goto L_0x00c7
        L_0x00d3:
            int r9 = r9 + 1
            r14 = 0
            goto L_0x00ad
        L_0x00d7:
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x00ee }
            int r0 = r1.mInteractId     // Catch:{ all -> 0x00ee }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r7 = r17.getByteVideoOutputFormat()     // Catch:{ all -> 0x00ee }
            r8 = 0
            long r9 = r23 / r3
            r3 = r0
            r4 = r5
            r5 = r7
            r7 = r21
            r2.onReceiveVideoBufferFrame(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ee }
        L_0x00ea:
            monitor-exit(r17)
            return
        L_0x00ec:
            monitor-exit(r17)
            return
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink.consumeByteBufferFrame(java.nio.ByteBuffer, int, int, int, int, long):void");
    }

    public ByteVideoSink(int i, EngineCallback engineCallback, LogReportCallback logReportCallback, IRenderVideoStallCallback iRenderVideoStallCallback, Handler handler, Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(i, engineCallback, logReportCallback, iRenderVideoStallCallback, handler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void consumeTextureFrame(int r21, int r22, int r23, int r24, int r25, long r26, float[] r28) {
        /*
            r20 = this;
            r9 = r20
            r10 = r26
            monitor-enter(r20)
            boolean r0 = r9.mIsStart     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0091
            com.ss.avframework.livestreamv2.RenderView r0 = r9.mTexRender     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0091
            android.opengl.EGLContext r0 = r20.getEGLContextHandle()     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0015
            goto L_0x0091
        L_0x0015:
            android.opengl.GLES20.glFlush()     // Catch:{ all -> 0x0093 }
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics r0 = r9.mRenderVideoStallStatistics     // Catch:{ all -> 0x0093 }
            r0.rendVideoFrame()     // Catch:{ all -> 0x0093 }
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics r0 = r9.mRenderVideoFpsStatistics     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0026
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoFpsStatistics r0 = r9.mRenderVideoFpsStatistics     // Catch:{ all -> 0x0093 }
            r0.rendVideoFrame()     // Catch:{ all -> 0x0093 }
        L_0x0026:
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ all -> 0x0093 }
            r6.<init>()     // Catch:{ all -> 0x0093 }
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r6.preTranslate(r1, r0)     // Catch:{ all -> 0x0093 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.preScale(r0, r2)     // Catch:{ all -> 0x0093 }
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            r6.preTranslate(r1, r0)     // Catch:{ all -> 0x0093 }
            com.ss.avframework.buffer.TextureBufferImpl r0 = new com.ss.avframework.buffer.TextureBufferImpl     // Catch:{ all -> 0x0093 }
            com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type r4 = com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ all -> 0x0093 }
            com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink$2 r8 = new com.ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink$2     // Catch:{ all -> 0x0093 }
            r8.<init>()     // Catch:{ all -> 0x0093 }
            r1 = r0
            r2 = r23
            r3 = r24
            r5 = r21
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0093 }
            com.ss.avframework.buffer.VideoFrame r1 = new com.ss.avframework.buffer.VideoFrame     // Catch:{ all -> 0x0093 }
            r2 = r25
            r1.<init>(r0, r2, r10)     // Catch:{ all -> 0x0093 }
            com.ss.avframework.livestreamv2.RenderView r0 = r9.mTexRender     // Catch:{ all -> 0x0093 }
            r0.onFrame(r1)     // Catch:{ all -> 0x0093 }
            boolean r0 = r9.isFirstRenderFrame     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0068
            r0 = 0
            r9.isFirstRenderFrame = r0     // Catch:{ all -> 0x0093 }
            r20.onFirstRenderFrameReport()     // Catch:{ all -> 0x0093 }
        L_0x0068:
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r0 = r9.mCallback     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x008f
            android.graphics.Matrix r0 = new android.graphics.Matrix     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            float[] r19 = com.p280ss.avframework.opengl.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(r0)     // Catch:{ all -> 0x0093 }
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r0 = r9.mCallback     // Catch:{ all -> 0x0093 }
            int r1 = r9.mInteractId     // Catch:{ all -> 0x0093 }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r13 = r20.getByteVideoOutputFormat()     // Catch:{ all -> 0x0093 }
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r17 = r10 / r3
            r10 = r0
            r11 = r1
            r12 = r21
            r14 = r23
            r15 = r24
            r16 = r25
            r10.onReceiveTextureFrame(r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r20)
            return
        L_0x0091:
            monitor-exit(r20)
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink.consumeTextureFrame(int, int, int, int, int, long, float[]):void");
    }

    public ByteVideoSink(int i, EngineCallback engineCallback, LogReportCallback logReportCallback, IRenderVideoStallCallback iRenderVideoStallCallback, Handler handler, Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(i, engineCallback, logReportCallback, iRenderVideoStallCallback, handler);
    }

    public ByteVideoSink(int i, EngineCallback engineCallback, LogReportCallback logReportCallback, IRenderVideoStallCallback iRenderVideoStallCallback, Handler handler, Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(i, engineCallback, logReportCallback, iRenderVideoStallCallback, handler);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void consumeYUVByteArrayFrame(byte[] r17, byte[] r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r14 = r18
            r15 = r19
            monitor-enter(r16)
            boolean r2 = r1.mIsStart     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0067
            com.ss.video.rtc.engine.ui.VideoFrameRender r2 = r1.mYuvRender     // Catch:{ all -> 0x0069 }
            if (r2 != 0) goto L_0x0012
            goto L_0x0067
        L_0x0012:
            com.ss.avframework.livestreamv2.interact.statistic.RenderVideoStallStatistics r2 = r1.mRenderVideoStallStatistics     // Catch:{ all -> 0x0069 }
            r2.rendVideoFrame()     // Catch:{ all -> 0x0069 }
            com.ss.video.rtc.engine.ui.VideoFrameRender r2 = r1.mYuvRender     // Catch:{ all -> 0x0069 }
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r2.consumeYUVByteArrayFrame(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0069 }
            boolean r2 = r1.isFirstRenderFrame     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x003a
            r2 = 0
            r1.isFirstRenderFrame = r2     // Catch:{ all -> 0x0069 }
            r16.onFirstRenderFrameReport()     // Catch:{ all -> 0x0069 }
        L_0x003a:
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r1.mCallback     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x0065
            int r2 = r0.length     // Catch:{ all -> 0x0069 }
            int r3 = r14.length     // Catch:{ all -> 0x0069 }
            int r2 = r2 + r3
            int r3 = r15.length     // Catch:{ all -> 0x0069 }
            int r2 = r2 + r3
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r2)     // Catch:{ all -> 0x0069 }
            r5.put(r0)     // Catch:{ all -> 0x0069 }
            r5.put(r14)     // Catch:{ all -> 0x0069 }
            r5.put(r15)     // Catch:{ all -> 0x0069 }
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r3 = r1.mCallback     // Catch:{ all -> 0x0069 }
            int r4 = r1.mInteractId     // Catch:{ all -> 0x0069 }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r6 = r16.getByteVideoOutputFormat()     // Catch:{ all -> 0x0069 }
            r9 = 0
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r26 / r7
            r7 = r20
            r8 = r24
            r3.onReceiveVideoBufferFrame(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0069 }
        L_0x0065:
            monitor-exit(r16)
            return
        L_0x0067:
            monitor-exit(r16)
            return
        L_0x0069:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.interact.vendor.bytertc.ByteVideoSink.consumeYUVByteArrayFrame(byte[], byte[], byte[], int, int, int, int, int, int, long):void");
    }
}
