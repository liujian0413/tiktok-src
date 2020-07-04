package com.p280ss.avframework.livestreamv2.capture;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ttvecamera.C20621g;
import com.p280ss.android.ttvecamera.C20621g.C20622a;
import com.p280ss.android.ttvecamera.C20632i;
import com.p280ss.android.ttvecamera.C20632i.C20633a;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.capture.video.ExternalVideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl.Range;
import com.p280ss.avframework.opengl.GlRenderDrawer;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.avframework.utils.ThreadUtils.ThreadChecker;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer */
public class CameraVideoCapturer extends ExternalVideoCapturer implements C20622a, IVideoCapturerControl {
    private int mCameraCaptureHeight;
    private int mCameraCaptureWidth;
    private C20621g mCapture;
    private Context mContext;
    public int mDisplayRotation;
    private int mFront;
    public Handler mHandler;
    public boolean mISPExposureStatus;
    public boolean mISPFocuseStatus;
    public boolean mISPToggleStatus;
    public boolean mIsCameraV2;
    public boolean mNewTexture;
    private Object mObject;
    private VideoCapturerObserver mObserver;
    public int mOesTex;
    public int mRotation;
    private boolean mSkipFirstFrame;
    public SurfaceTexture mSurfaceTexture;
    public float[] mTexMatrix;
    public ThreadChecker mThreadChecker;

    /* renamed from: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$CameraObserver */
    class CameraObserver implements C20622a {
        private WeakReference<C20622a> mCameraObserverWeakReference;

        public void onCaptureStopped(int i) {
            if (this.mCameraObserverWeakReference.get() != null) {
                ((C20622a) this.mCameraObserverWeakReference.get()).onCaptureStopped(i);
            }
        }

        public CameraObserver(WeakReference<C20622a> weakReference) {
            this.mCameraObserverWeakReference = weakReference;
        }

        public void onCaptureStarted(int i, int i2) {
            if (this.mCameraObserverWeakReference.get() != null) {
                ((C20622a) this.mCameraObserverWeakReference.get()).onCaptureStarted(i, i2);
            }
        }

        public void onError(int i, String str) {
            if (this.mCameraObserverWeakReference.get() != null) {
                ((C20622a) this.mCameraObserverWeakReference.get()).onError(i, str);
            }
        }

        public void onInfo(int i, int i2, String str) {
            if (this.mCameraObserverWeakReference.get() != null) {
                ((C20622a) this.mCameraObserverWeakReference.get()).onInfo(i, i2, str);
            }
        }
    }

    public boolean currentSupportISPControl() {
        return true;
    }

    public boolean isBackCam() {
        if (this.mFront == 0) {
            return true;
        }
        return false;
    }

    public void cancelAudioFocus() {
        if (this.mCapture != null) {
            try {
                this.mCapture.mo55786d();
            } catch (Throwable unused) {
            }
        }
    }

    public Range getExposureCompensationRange() {
        if (this.mCapture != null) {
            C20633a e = this.mCapture.mo55787e();
            if (e != null) {
                Range range = new Range();
                range.max = (float) e.f55748a;
                range.min = (float) e.f55750c;
                return range;
            }
        }
        return null;
    }

    public synchronized void release() {
        if (this.mHandler != null) {
            stop();
            this.mHandler.post(new Runnable() {
                public void run() {
                    if (CameraVideoCapturer.this.mSurfaceTexture != null) {
                        CameraVideoCapturer.this.mSurfaceTexture.release();
                        CameraVideoCapturer.this.mSurfaceTexture = null;
                    }
                    if (CameraVideoCapturer.this.mOesTex > 0) {
                        GLES20.glDeleteTextures(0, new int[]{CameraVideoCapturer.this.mOesTex}, 0);
                        CameraVideoCapturer.this.mOesTex = 0;
                    }
                }
            });
        }
        this.mContext = null;
        super.release();
    }

    public void returnTexture() {
        this.mThreadChecker.checkIsOnValidThread();
        this.mBufferAlreadyReturn = true;
        if (this.mStatus == 1 && this.mNewTexture) {
            tryDeliverFrame();
        }
    }

    public synchronized void stop() {
        this.mThreadChecker.checkIsOnValidThread();
        synchronized (this.mObject) {
            C20621g gVar = this.mCapture;
            this.mCapture = null;
            if (gVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    gVar.mo55769a();
                    gVar.mo55784c();
                } catch (Throwable unused) {
                }
                String str = "CameraVideoCapturer";
                StringBuilder sb = new StringBuilder("Close TECamera cost time ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append(" ms");
                AVLog.iod(str, sb.toString());
                StringBuilder sb2 = new StringBuilder("Close TECamera cost time ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                sb2.append(" ms");
                AVLog.logKibana(6, "CameraVideoCapturer", sb2.toString(), null);
            }
        }
    }

    public void switchCamera() {
        try {
            this.mThreadChecker.checkIsOnValidThread();
            AVLog.ioi("CameraVideoCapturer", "switchCamera");
            if (this.mCapture == null) {
                this.mObserver.onVideoCapturerError(-1, new Exception("Capture already release"));
                return;
            }
            int i = 1;
            if (status() != 1) {
                AVLog.ioe("CameraVideoCapturer", "Camera no ready.");
                return;
            }
            if (this.mFront != 0) {
                i = 0;
            }
            this.mFront = i;
            this.mCapture.mo55771a(this.mFront);
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    CameraVideoCapturer.this.switchCamera();
                }
            });
        }
    }

    public void tryDeliverFrame() {
        float f;
        if (this.mStatus != 1 || !this.mNewTexture || !this.mBufferAlreadyReturn) {
            StringBuilder sb = new StringBuilder("mStatus ");
            sb.append(this.mStatus);
            sb.append(", !mNewTexture ");
            sb.append(!this.mNewTexture);
            sb.append(", !mBufferAlreadyReturn");
            sb.append(true ^ this.mBufferAlreadyReturn);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("CameraVideoCapturer.tryDeliverFrame return: ");
            sb3.append(sb2);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder("CameraVideoCapturer.java:tryDeliverFrame1: ");
            sb5.append(sb2);
            AVLog.logToIODevice2(5, "CameraVideoCapturer", sb4, null, sb5.toString(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            return;
        }
        this.mNewTexture = false;
        try {
            this.mSurfaceTexture.updateTexImage();
            if (!this.mSkipFirstFrame || this.mIsCameraV2) {
                this.mSurfaceTexture.getTransformMatrix(this.mTexMatrix);
                if (this.mIsCameraV2) {
                    Matrix matrix = new Matrix();
                    this.mRotation = 0;
                    if (this.mDisplayRotation == 1 || this.mDisplayRotation == 3) {
                        this.mRotation = (this.mDisplayRotation - 2) * 90;
                    } else if (this.mDisplayRotation == 2) {
                        this.mRotation = NormalGiftView.ALPHA_180;
                    }
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preRotate((float) this.mRotation);
                    float f2 = 1.0f;
                    if (this.mHorizontalMirror) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (this.mVerticalMirror) {
                        f2 = -1.0f;
                    }
                    matrix.preScale(f, f2);
                    matrix.preTranslate(-0.5f, -0.5f);
                    matrix.postConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.mTexMatrix));
                    pushVideoFrame(this.mOesTex, true, this.mOutWidth, this.mOutHeight, matrix, this.mSurfaceTexture.getTimestamp() / 1000, null);
                    return;
                }
                pushVideoFrame(this.mOesTex, true, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mRotation, this.mTexMatrix, this.mSurfaceTexture.getTimestamp() / 1000, null);
                return;
            }
            this.mSkipFirstFrame = false;
        } catch (Throwable th) {
            AVLog.logToIODevice2(6, "CameraVideoCapturer", th.getMessage(), null, "CameraVideoCapturer.java:tryDeliverFrame2", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        }
    }

    public void onCaptureStopped(final int i) {
        try {
            this.mThreadChecker.checkIsOnValidThread();
            StringBuilder sb = new StringBuilder("onCaptureStopped ");
            sb.append(i);
            AVLog.ioi("CameraVideoCapturer", sb.toString());
            super.stop();
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    CameraVideoCapturer.this.onCaptureStopped(i);
                }
            });
        }
    }

    public int setExposureCompensation(float f) {
        final int[] iArr = {-1};
        Range exposureCompensationRange = getExposureCompensationRange();
        if (exposureCompensationRange != null && ((f <= exposureCompensationRange.max || f >= exposureCompensationRange.min) && this.mCapture != null)) {
            try {
                this.mISPExposureStatus = true;
                this.mCapture.mo55783b((int) f);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPExposureStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    public int toggleFlashLight(boolean z) {
        final int[] iArr = {-1};
        if (this.mCapture != null) {
            try {
                this.mISPToggleStatus = true;
                this.mCapture.mo55777a(z);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPToggleStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return iArr[0];
            }
        }
        return iArr[0];
    }

    public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (CameraVideoCapturer.this.mOesTex > 0 && glRenderDrawer != null && glTextureFrameBuffer != null && glTextureFrameBuffer.getFrameBufferId() > 0) {
                    if (!(glTextureFrameBuffer.getWidth() == CameraVideoCapturer.this.mOutWidth && glTextureFrameBuffer.getHeight() == CameraVideoCapturer.this.mOutHeight)) {
                        try {
                            glTextureFrameBuffer.setSize(CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder("frameBuffer setSize failed (");
                            sb.append(e.getMessage());
                            sb.append(") w ");
                            sb.append(CameraVideoCapturer.this.mOutWidth);
                            sb.append(" h ");
                            sb.append(CameraVideoCapturer.this.mOutHeight);
                            AVLog.m143697e("CameraVideoCapturer", sb.toString());
                            return;
                        }
                    }
                    Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix);
                    if (CameraVideoCapturer.this.mIsCameraV2) {
                        CameraVideoCapturer.this.mRotation = 0;
                        if (CameraVideoCapturer.this.mDisplayRotation == 1 || CameraVideoCapturer.this.mDisplayRotation == 3) {
                            CameraVideoCapturer.this.mRotation = (CameraVideoCapturer.this.mDisplayRotation - 2) * 90;
                            CameraVideoCapturer.this.mRotation = (CameraVideoCapturer.this.mRotation + NormalGiftView.ALPHA_180) % 360;
                        } else if (CameraVideoCapturer.this.mDisplayRotation == 2) {
                            CameraVideoCapturer.this.mRotation = NormalGiftView.ALPHA_180;
                        }
                    }
                    if (CameraVideoCapturer.this.mRotation != 0) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        matrix.preTranslate(0.5f, 0.5f);
                        matrix.preRotate((float) (-CameraVideoCapturer.this.mRotation));
                        matrix.preTranslate(-0.5f, -0.5f);
                        if (convertMatrixToAndroidGraphicsMatrix != null) {
                            if (CameraVideoCapturer.this.mIsCameraV2) {
                                matrix.postConcat(convertMatrixToAndroidGraphicsMatrix);
                            } else {
                                matrix.preConcat(convertMatrixToAndroidGraphicsMatrix);
                            }
                        }
                        convertMatrixToAndroidGraphicsMatrix = matrix;
                    }
                    StringBuilder sb2 = new StringBuilder("CopyFrame CameraV2 ");
                    sb2.append(CameraVideoCapturer.this.mIsCameraV2);
                    sb2.append(" mRotation ");
                    sb2.append(CameraVideoCapturer.this.mRotation);
                    sb2.append(" dpyRotation ");
                    sb2.append(CameraVideoCapturer.this.mDisplayRotation);
                    AVLog.iod("CameraVideoCapturer", sb2.toString());
                    float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
                    try {
                        GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                        glRenderDrawer.drawOes(CameraVideoCapturer.this.mOesTex, null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        GLES20.glFlush();
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("CameraVideoCapturer.copyCurrentFrame");
                        zArr[0] = true;
                    } catch (Exception e2) {
                        StringBuilder sb3 = new StringBuilder("copyCurrentFrame error: ");
                        sb3.append(e2.toString());
                        AVLog.ioe("CameraVideoCapturer", sb3.toString());
                    }
                }
            }
        });
        return zArr[0];
    }

    public void onError(final int i, final String str) {
        if (Thread.currentThread() == this.mHandler.getLooper().getThread()) {
            onErrorOnHandler(i, str);
        } else {
            this.mHandler.post(new Runnable() {
                public void run() {
                    CameraVideoCapturer.this.onErrorOnHandler(i, str);
                }
            });
        }
    }

    public void onErrorOnHandler(int i, String str) {
        switch (i) {
            case -417:
            case -416:
                this.mISPToggleStatus = false;
                return;
            case -415:
            case -414:
            case -413:
                this.mISPExposureStatus = false;
                return;
            case -412:
            case -411:
                this.mISPFocuseStatus = false;
                return;
            default:
                this.mStatus = 2;
                Exception exc = new Exception(str);
                StringBuilder sb = new StringBuilder("TECapture error (");
                sb.append(i);
                sb.append(") Cause:");
                sb.append(str);
                AVLog.ioe("CameraVideoCapturer", sb.toString());
                StringBuilder sb2 = new StringBuilder("return:");
                sb2.append(i);
                sb2.append(",CameraV2:");
                sb2.append(this.mIsCameraV2);
                AVLog.logKibana(6, "CameraVideoCapturer", sb2.toString(), exc);
                this.mObserver.onVideoCapturerError(i, exc);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r12 == 0) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCaptureStarted(final int r11, int r12) {
        /*
            r10 = this;
            com.ss.android.ttvecamera.g r0 = r10.mCapture
            if (r0 != 0) goto L_0x000c
            java.lang.String r11 = "CameraVideoCapturer"
            java.lang.String r12 = "onCaptureStarted after stop"
            com.p280ss.avframework.utils.AVLog.iow(r11, r12)
            return
        L_0x000c:
            if (r12 == 0) goto L_0x003b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "What happen? Maybe the size("
            r11.<init>(r0)
            int r0 = r10.mFps
            r11.append(r0)
            java.lang.String r0 = "@"
            r11.append(r0)
            int r0 = r10.mOutWidth
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.mOutHeight
            r11.append(r0)
            java.lang.String r0 = ") is invalid."
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.onError(r12, r11)
            return
        L_0x003b:
            com.ss.avframework.utils.ThreadUtils$ThreadChecker r0 = r10.mThreadChecker     // Catch:{ Throwable -> 0x00a5 }
            r0.checkIsOnValidThread()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r11 = "CameraVideoCapturer"
            java.lang.String r0 = "onCaptureStarted ok"
            com.p280ss.avframework.utils.AVLog.ioi(r11, r0)
            android.graphics.SurfaceTexture r11 = r10.mSurfaceTexture
            r0 = 0
            if (r11 == 0) goto L_0x009f
            int r11 = r10.mOesTex
            if (r11 > 0) goto L_0x0051
            goto L_0x009f
        L_0x0051:
            java.lang.String r11 = "Capture is null, not should be here"
            java.lang.Object r1 = r10.mObject
            monitor-enter(r1)
            com.ss.android.ttvecamera.g r2 = r10.mCapture     // Catch:{ all -> 0x009c }
            r3 = 1
            if (r2 == 0) goto L_0x0088
            com.ss.android.ttvecamera.TEFrameSizei r5 = new com.ss.android.ttvecamera.TEFrameSizei     // Catch:{ all -> 0x009c }
            int r12 = r10.mCameraCaptureWidth     // Catch:{ all -> 0x009c }
            int r2 = r10.mCameraCaptureHeight     // Catch:{ all -> 0x009c }
            r5.<init>(r12, r2)     // Catch:{ all -> 0x009c }
            com.ss.android.ttvecamera.f.c$a r12 = new com.ss.android.ttvecamera.f.c$a     // Catch:{ all -> 0x009c }
            com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$6 r6 = new com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$6     // Catch:{ all -> 0x009c }
            r6.<init>()     // Catch:{ all -> 0x009c }
            r7 = 1
            android.graphics.SurfaceTexture r8 = r10.mSurfaceTexture     // Catch:{ all -> 0x009c }
            int r9 = r10.mOesTex     // Catch:{ all -> 0x009c }
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009c }
            com.ss.android.ttvecamera.g r2 = r10.mCapture     // Catch:{ all -> 0x009c }
            r2.mo55774a(r12)     // Catch:{ all -> 0x009c }
            com.ss.android.ttvecamera.g r12 = r10.mCapture     // Catch:{ Exception -> 0x0080 }
            int r12 = r12.mo55781b()     // Catch:{ Exception -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r11 = move-exception
            r12 = -1
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x009c }
        L_0x0086:
            if (r12 == 0) goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0090
            r10.onError(r12, r11)
            return
        L_0x0090:
            r10.mSkipFirstFrame = r3
            int r11 = r10.mOutWidth
            int r12 = r10.mOutHeight
            int r0 = r10.mFps
            super.start(r11, r12, r0)
            return
        L_0x009c:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            throw r11
        L_0x009f:
            java.lang.String r11 = "Invalid texture"
            r10.onError(r0, r11)
            return
        L_0x00a5:
            android.os.Handler r12 = r10.mHandler
            com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$5 r0 = new com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$5
            r0.<init>(r11)
            com.p280ss.avframework.utils.ThreadUtils.invokeAtFrontUninterruptibly(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.capture.CameraVideoCapturer.onCaptureStarted(int, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|(2:10|11)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean postAndWait(android.os.Handler r5, long r6, final java.lang.Runnable r8) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x002b
            if (r8 == 0) goto L_0x002b
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x002b
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2 = 1
            boolean[] r2 = new boolean[r2]
            r2[r0] = r0
            monitor-enter(r1)
            com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$12 r3 = new com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$12     // Catch:{ all -> 0x0028 }
            r3.<init>(r8, r2, r1)     // Catch:{ all -> 0x0028 }
            boolean r5 = r5.post(r3)     // Catch:{ all -> 0x0028 }
            if (r5 == 0) goto L_0x0024
            r1.wait(r6)     // Catch:{ InterruptedException -> 0x0024 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            boolean r0 = r2[r0]
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r5
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.capture.CameraVideoCapturer.postAndWait(android.os.Handler, long, java.lang.Runnable):boolean");
    }

    public void onInfo(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder("TECapture type ");
        sb.append(i);
        sb.append(" ext ");
        sb.append(i2);
        sb.append(" msg ");
        sb.append(str);
        AVLog.iod("CameraVideoCapturer", sb.toString());
    }

    public void start(int i, int i2, int i3) {
        int i4;
        StringBuilder sb = new StringBuilder("start(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(")");
        AVLog.ioi("CameraVideoCapturer", sb.toString());
        this.mOutWidth = i;
        this.mOutHeight = i2;
        this.mCameraCaptureHeight = Math.min(i, i2);
        this.mCameraCaptureWidth = Math.max(i, i2);
        this.mFps = i3;
        synchronized (this.mObject) {
            if (this.mCapture != null) {
                Context context = this.mContext;
                if (this.mIsCameraV2) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                C20632i iVar = new C20632i(context, i4, this.mCameraCaptureWidth, this.mCameraCaptureHeight);
                iVar.f55726e = this.mFront;
                iVar.f55739r = 0;
                iVar.f55746y = false;
                int a = this.mCapture.mo55776a(iVar);
                if (a != 0) {
                    VideoCapturerObserver videoCapturerObserver = this.mObserver;
                    StringBuilder sb2 = new StringBuilder("Capture connect failed(");
                    sb2.append(a);
                    sb2.append(")");
                    videoCapturerObserver.onVideoCapturerError(-1, new Exception(sb2.toString()));
                }
            } else {
                this.mObserver.onVideoCapturerError(-1, new Exception("Capture already release"));
            }
        }
    }

    CameraVideoCapturer(Handler handler, boolean z, VideoCapturerObserver videoCapturerObserver, Context context) {
        this(handler, z, videoCapturerObserver, context, false);
    }

    public int setFocusAreas(int i, int i2, int i3, int i4) {
        final int[] iArr = {-1};
        if (this.mCapture != null) {
            try {
                this.mISPFocuseStatus = true;
                this.mCapture.mo55772a(i, i2, 0.15f, i3, i4);
                postAndWait(this.mHandler, 3000, new Runnable() {
                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPFocuseStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
        return super.onFrame(buffer, i, i2, i3, j);
    }

    public CameraVideoCapturer(Handler handler, boolean z, VideoCapturerObserver videoCapturerObserver, Context context, boolean z2) {
        String str;
        super(videoCapturerObserver, handler);
        this.mTexMatrix = new float[16];
        this.mObject = new Object();
        this.mISPFocuseStatus = false;
        this.mISPToggleStatus = false;
        this.mISPExposureStatus = false;
        if (VERSION.SDK_INT < 24 && z2) {
            if (!(handler == null || videoCapturerObserver == null)) {
                StringBuilder sb = new StringBuilder("Find using CameraV2 at SDK ");
                sb.append(VERSION.SDK_INT);
                sb.append(" with force using CameraV1");
                AVLog.iow("CameraVideoCapturer", sb.toString());
            }
            z2 = false;
        }
        String str2 = "CameraVideoCapturer";
        StringBuilder sb2 = new StringBuilder("Constructor ");
        sb2.append(this);
        sb2.append(" with ");
        if (z2) {
            str = "CameraV2";
        } else {
            str = "CameraV1";
        }
        sb2.append(str);
        AVLog.ioi(str2, sb2.toString());
        this.mCapture = new C20621g(new CameraObserver(new WeakReference(this)));
        this.mFront = z ? 1 : 0;
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) new Runnable() {
            public void run() {
                CameraVideoCapturer.this.mThreadChecker = new ThreadChecker();
                CameraVideoCapturer.this.mOesTex = GlUtil.generateTexture(36197);
                CameraVideoCapturer.this.mSurfaceTexture = new SurfaceTexture(CameraVideoCapturer.this.mOesTex);
            }
        });
        this.mHandler = handler;
        this.mObserver = videoCapturerObserver;
        this.mContext = context;
        this.mDisplayRotation = C20642j.m68408a(this.mContext);
        enableSigalMode(true);
        this.mIsCameraV2 = z2;
        this.mDisplayRotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
    }
}
