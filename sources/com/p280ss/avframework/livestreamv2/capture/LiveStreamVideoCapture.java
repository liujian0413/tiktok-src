package com.p280ss.avframework.livestreamv2.capture;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.buffer.SurfaceTextureHelper;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.capture.video.ExternalVideoCapturer;
import com.p280ss.avframework.capture.video.ScreenVideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl.Range;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.GlRenderDrawer;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.ThreadUtils;
import com.p280ss.avframework.utils.ThreadUtils.ThreadChecker;
import com.p280ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture */
public class LiveStreamVideoCapture extends VideoCapturer implements VideoCapturerObserver, IVideoCapturerControl {
    public int mAvalidFps;
    private final BGMHandler mBGMHandler;
    public long mBGMTimestampDeltaUs;
    public int mBGMode;
    public Runnable mBackgroundPushVideoFrameRunable;
    public int mBackgroundTex;
    private volatile long mBaseTimeUs;
    public Context mContext;
    public GlRenderDrawer mDrawer;
    public int mFps;
    private GLThread mGlThread;
    public Handler mHandler;
    public int mHeight;
    private long mHelperFirstVideoTimeMs;
    private boolean mHorizontalMirror;
    public boolean mIsResume;
    public long mLastTimestamp;
    private volatile long mMaxFrameIntervalDiffUs;
    public final Observer mObserver;
    public int mSaveDevicesIdWhenToBack;
    public Intent mScreenIntent;
    private int mSource;
    public Object mStatFence;
    public int mStatus;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private SwitchCaptureRunnable mSwitchCaptureRunnable;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public ThreadChecker mThreadChecker;
    private boolean mUsingVECameraV2;
    private boolean mVerticalMirror;
    public VideoCapturer mVideoCapturer;
    public int mWidth;
    public List<Integer> textureIdList;

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$BGMHandler */
    class BGMHandler extends Handler {
        public void handleMessage(Message message) {
            boolean z;
            if (message.obj != null && (message.obj instanceof Intent)) {
                LiveStreamVideoCapture.this.mScreenIntent = (Intent) message.obj;
            }
            if (message.what == 10001) {
                if (message.arg1 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                LiveStreamVideoCapture.this.mBGMTimestampDeltaUs = 0;
                if (!z) {
                    LiveStreamVideoCapture.this.onSwitchVideoCapturer(4);
                    LiveStreamVideoCapture.this.mBGMTimestampDeltaUs = (System.nanoTime() / 1000) - LiveStreamVideoCapture.this.mLastTimestamp;
                    LiveStreamVideoCapture.this.mHandler.post(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                    return;
                }
                LiveStreamVideoCapture.this.mHandler.removeCallbacks(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                if (LiveStreamVideoCapture.this.mSaveDevicesIdWhenToBack != 0) {
                    LiveStreamVideoCapture.this.onSwitchVideoCapturer(LiveStreamVideoCapture.this.mSaveDevicesIdWhenToBack);
                }
            }
        }

        public BGMHandler(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$CameraWrapper */
    class CameraWrapper extends CameraVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        public CameraWrapper(Handler handler, boolean z, VideoCapturerObserver videoCapturerObserver, boolean z2) {
            super(handler, z, videoCapturerObserver, LiveStreamVideoCapture.this.mContext, z2);
        }

        public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            this.mBaseTime += j - this.mLastTime;
            this.mLastTime = j;
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, this.mBaseTime);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper */
    class ExternWrapper extends ExternalVideoCapturer {
        public int mRotation;
        float[] mTexMatrix;

        public synchronized void release() {
            if (this.mBufferAlreadyReturn) {
                GLES20.glFinish();
            } else {
                LiveStreamVideoCapture.this.mHandler.post(new Runnable() {
                    public void run() {
                        AVLog.iow("LiveStreamVideoCapture", "Release texture on new post.");
                        GLES20.glFinish();
                    }
                });
            }
            super.release();
        }

        public int pushLastFrame(long j) {
            String str;
            GlTextureFrameBuffer glTextureFrameBuffer = LiveStreamVideoCapture.this.mTextureFrameBuffer;
            if (glTextureFrameBuffer == null) {
                return -1;
            }
            int width = glTextureFrameBuffer.getWidth();
            int height = glTextureFrameBuffer.getHeight();
            if (width <= 0 || height <= 0 || !this.mBufferAlreadyReturn) {
                String str2 = "LiveStreamVideoCapture";
                if (this.mBufferAlreadyReturn) {
                    str = "never push any frame.";
                } else {
                    str = "current texture not return.";
                }
                AVLog.m143700w(str2, str);
                return -1;
            }
            return super.pushVideoFrame(glTextureFrameBuffer.getTextureId(), false, glTextureFrameBuffer.getWidth(), glTextureFrameBuffer.getHeight(), this.mRotation, this.mTexMatrix, j, null);
        }

        public ExternWrapper(VideoCapturerObserver videoCapturerObserver, Handler handler) {
            super(videoCapturerObserver, handler);
            enableSigalMode(true);
        }

        public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, j);
        }

        public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
            int[] iArr = {-1};
            if (!this.mBufferAlreadyReturn || this.mStatus != 1 || LiveStreamVideoCapture.this.mStatus != 1) {
                return iArr[0];
            }
            if (i < 0) {
                AVLog.m143700w("LiveStreamVideoCapture", "push texture frame invalid.");
                return -1;
            }
            this.mRotation = i4;
            this.mTexMatrix = fArr;
            Handler handler = LiveStreamVideoCapture.this.mHandler;
            final int i5 = i3;
            final int i6 = i2;
            final boolean z2 = z;
            final int i7 = i;
            final long j2 = j;
            final int[] iArr2 = iArr;
            final Bundle bundle2 = bundle;
            C455761 r0 = new Runnable() {
                public void run() {
                    if (LiveStreamVideoCapture.this.mTextureFrameBuffer != null && LiveStreamVideoCapture.this.mDrawer != null) {
                        if (!(LiveStreamVideoCapture.this.mTextureFrameBuffer.getHeight() == i5 && LiveStreamVideoCapture.this.mTextureFrameBuffer.getWidth() == i6)) {
                            try {
                                LiveStreamVideoCapture.this.mTextureFrameBuffer.setSize(i6, i5);
                            } catch (Exception e) {
                                StringBuilder sb = new StringBuilder("textureFrameBuffer setSize failed (");
                                sb.append(e.getMessage());
                                sb.append(") w ");
                                sb.append(i6);
                                sb.append(" h ");
                                sb.append(i5);
                                AVLog.m143697e("LiveStreamVideoCapture", sb.toString());
                                if (LiveStreamVideoCapture.this.mObserver != null) {
                                    LiveStreamVideoCapture.this.mObserver.onVideoCaptureError(-1, e);
                                }
                                return;
                            }
                        }
                        GLES20.glBindFramebuffer(36160, LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId());
                        try {
                            GlUtil.checkNoGLES2Error("bindFrameBuffer failed");
                            if (z2) {
                                LiveStreamVideoCapture.this.mDrawer.drawOes(i7, null, null, 0, 0, i6, i5);
                            } else {
                                LiveStreamVideoCapture.this.mDrawer.drawRgb(i7, null, null, 0, 0, i6, i5);
                            }
                            GLES20.glFlush();
                            GLES20.glBindFramebuffer(36160, 0);
                            try {
                                GlUtil.checkNoGLES2Error("drawer is error.");
                                iArr2[0] = ExternWrapper.super.pushVideoFrame(LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId(), false, i6, i5, ExternWrapper.this.mRotation, ExternWrapper.this.mTexMatrix, j2, bundle2);
                            } catch (Throwable unused) {
                                StringBuilder sb2 = new StringBuilder("Drawer is error with ignore frame timestamp ");
                                sb2.append(j2);
                                AVLog.m143697e("LiveStreamVideoCapture", sb2.toString());
                            }
                        } catch (Throwable unused2) {
                            StringBuilder sb3 = new StringBuilder("bindFrameBuffer faild (tex:");
                            sb3.append(LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId());
                            sb3.append(" fb:");
                            sb3.append(LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId());
                            sb3.append(" w:");
                            sb3.append(i6);
                            sb3.append(" h:");
                            sb3.append(i5);
                            AVLog.ioe("LiveStreamVideoCapture", sb3.toString());
                        }
                    }
                }
            };
            ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r0);
            return iArr[0];
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$Observer */
    public interface Observer {
        void onVideoCaptureError(int i, Exception exc);

        void onVideoCaptureStarted();

        void onVideoCaptureStoped();
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ScreenWrapper */
    class ScreenWrapper extends ScreenVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        public ScreenWrapper(Intent intent, VideoCapturerObserver videoCapturerObserver) {
            super(intent, videoCapturerObserver);
        }

        public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            this.mBaseTime += j - this.mLastTime;
            this.mLastTime = j;
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, this.mBaseTime);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$SurfaceTextureSharedHandler */
    class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$SwitchCaptureRunnable */
    class SwitchCaptureRunnable implements Runnable {
        public int mDevice;
        public Intent mIntent;

        public void run() {
            LiveStreamVideoCapture.this.mScreenIntent = this.mIntent;
            LiveStreamVideoCapture.this.mSaveDevicesIdWhenToBack = this.mDevice;
            LiveStreamVideoCapture.this.onSwitchVideoCapturer(this.mDevice);
        }

        public SwitchCaptureRunnable() {
        }

        public void setDevice(int i, Intent intent) {
            this.mDevice = i;
            this.mIntent = intent;
        }
    }

    public int getBackgroundPolicy() {
        return this.mBGMode;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public IVideoCapturerControl getISPControl() {
        return this;
    }

    public int status() {
        return this.mStatus;
    }

    public boolean backgroundMode() {
        if (!this.mIsResume) {
            return true;
        }
        return false;
    }

    public void onVideoCapturerStarted() {
        this.mObserver.onVideoCaptureStarted();
    }

    public void onVideoCapturerStoped() {
        this.mObserver.onVideoCaptureStoped();
    }

    private CameraVideoCapturer getCameraHandler() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null || !(videoCapturer instanceof CameraVideoCapturer)) {
            return null;
        }
        return (CameraVideoCapturer) videoCapturer;
    }

    public void cancelAudioFocus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.cancelAudioFocus();
        }
    }

    public boolean currentSupportISPControl() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler == null || !cameraHandler.currentSupportISPControl()) {
            return false;
        }
        return true;
    }

    public Range getExposureCompensationRange() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getExposureCompensationRange();
        }
        return null;
    }

    public void loadBitmap() {
        if (this.mBackgroundTex <= 0) {
            this.mBackgroundTex = GlUtil.generateTexture(3553);
        }
        updateImage();
    }

    private void onToExtern() {
        stopVideoCapturer();
        this.mVideoCapturer = new ExternWrapper(this, this.mHandler);
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    private void setupMirror() {
        if (this.mVideoCapturer != null && (this.mVideoCapturer instanceof ExternalVideoCapturer)) {
            ((ExternalVideoCapturer) this.mVideoCapturer).enableMirror(this.mHorizontalMirror, true);
            ((ExternalVideoCapturer) this.mVideoCapturer).enableMirror(this.mVerticalMirror, false);
        }
    }

    public void stopVideoCapturer() {
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
    }

    private void onToScreen() {
        stopVideoCapturer();
        ScreenWrapper screenWrapper = new ScreenWrapper(this.mScreenIntent, this);
        if (this.mSurfaceTextureHelper != null) {
            this.mSurfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mSurfaceTextureHelper = new SurfaceTextureSharedHandler(this.mHandler);
        screenWrapper.initialize(this.mSurfaceTextureHelper, this.mContext);
        this.mVideoCapturer = screenWrapper;
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    public synchronized void release() {
        stop();
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (LiveStreamVideoCapture.this.mBackgroundTex != 0) {
                        GLES20.glDeleteTextures(1, new int[]{LiveStreamVideoCapture.this.mBackgroundTex}, 0);
                    }
                    for (Integer intValue : LiveStreamVideoCapture.this.textureIdList) {
                        GLES20.glDeleteTextures(1, new int[]{intValue.intValue()}, 0);
                    }
                    LiveStreamVideoCapture.this.textureIdList.clear();
                    if (LiveStreamVideoCapture.this.mTextureFrameBuffer != null) {
                        LiveStreamVideoCapture.this.mTextureFrameBuffer.release();
                        LiveStreamVideoCapture.this.mTextureFrameBuffer = null;
                    }
                    if (LiveStreamVideoCapture.this.mDrawer != null) {
                        LiveStreamVideoCapture.this.mDrawer.release();
                        LiveStreamVideoCapture.this.mDrawer = null;
                    }
                }
            });
        }
        if (this.mGlThread != null) {
            this.mGlThread.quit();
        }
        super.release();
    }

    public void resume() {
        synchronized (this.mStatFence) {
            String str = "LiveStreamVideoCapture";
            StringBuilder sb = new StringBuilder("Resume capture, status ");
            sb.append(status());
            AVLog.iod(str, sb.toString());
            this.mIsResume = true;
            this.mBGMHandler.removeMessages(10001);
            this.mBGMHandler.sendMessage(this.mBGMHandler.obtainMessage(10001, 1, 0, this.mScreenIntent));
        }
    }

    public void stop() {
        synchronized (this.mStatFence) {
            if (this.mStatus != 2) {
                this.mStatus = 2;
                this.mBGMHandler.removeMessages(10001);
                this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
                this.mHandler.removeCallbacks(this.mBackgroundPushVideoFrameRunable);
                this.mHandler.post(new Runnable() {
                    public void run() {
                        LiveStreamVideoCapture.this.stopVideoCapturer();
                    }
                });
            }
        }
    }

    public void pause() {
        synchronized (this.mStatFence) {
            String str = "LiveStreamVideoCapture";
            StringBuilder sb = new StringBuilder("Pause capture, status ");
            sb.append(status());
            AVLog.iod(str, sb.toString());
            this.mIsResume = false;
            if (this.mBGMode == 2) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        if (LiveStreamVideoCapture.this.mVideoCapturer instanceof CameraWrapper) {
                            ((CameraWrapper) LiveStreamVideoCapture.this.mVideoCapturer).copyCurrentFrame(LiveStreamVideoCapture.this.mDrawer, LiveStreamVideoCapture.this.mTextureFrameBuffer);
                        }
                    }
                });
            }
            this.mBGMHandler.removeMessages(10001);
            this.mBGMHandler.sendMessage(this.mBGMHandler.obtainMessage(10001, 0, 0, this.mScreenIntent));
        }
    }

    public void updateImage() {
        Bitmap createBitmap = createBitmap(this.mWidth, this.mHeight);
        if (createBitmap != null) {
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setTextSize(10.0f);
            paint.setTextAlign(Align.RIGHT);
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setSubpixelText(true);
            PaintFlagsDrawFilter paintFlagsDrawFilter = new PaintFlagsDrawFilter(0, 2);
            Date date = new Date();
            canvas.setDrawFilter(paintFlagsDrawFilter);
            canvas.save();
            canvas.translate((float) (this.mWidth / 2), (float) (this.mHeight / 2));
            canvas.scale(1.0f, -1.0f);
            canvas.drawText(date.toString(), 0.0f, 0.0f, paint);
            canvas.restore();
            GLES20.glBindTexture(3553, this.mBackgroundTex);
            GLUtils.texImage2D(3553, 0, createBitmap, 0);
            GLES20.glBindTexture(3553, 0);
            createBitmap.recycle();
        }
    }

    public void setBackgroundPolicy(int i) {
        this.mBGMode = i;
    }

    public void updateScreenIntent(Intent intent) {
        this.mScreenIntent = intent;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    public void setBackGroundPhotoPath(final Object obj) {
        this.mHandler.post(new Runnable() {
            public void run() {
                boolean z;
                Iterator it = LiveStreamVideoCapture.this.textureIdList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    GLES20.glDeleteTextures(1, new int[]{((Integer) it.next()).intValue()}, 0);
                }
                LiveStreamVideoCapture.this.textureIdList.clear();
                Bitmap bitmap = null;
                if (obj instanceof String) {
                    Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                    Matrix matrix = new Matrix();
                    matrix.setScale(1.0f, -1.0f);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                    decodeFile.recycle();
                    bitmap = createBitmap;
                } else {
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    }
                    z = false;
                }
                if (bitmap != null) {
                    int generateTexture = GlUtil.generateTexture(3553);
                    GLES20.glBindTexture(3553, generateTexture);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    GLES20.glBindTexture(3553, 0);
                    LiveStreamVideoCapture.this.textureIdList.add(Integer.valueOf(generateTexture));
                    if (z) {
                        bitmap.recycle();
                    }
                }
            }
        });
    }

    public int setExposureCompensation(float f) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setExposureCompensation(f);
        }
        return -1;
    }

    public int toggleFlashLight(boolean z) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.toggleFlashLight(z);
        }
        return -1;
    }

    public static long guessFrameTimestampDiffUs(long j) {
        long currentTimeMillis = (System.currentTimeMillis() * 1000) - j;
        if (Math.abs(currentTimeMillis) < 5000000) {
            return currentTimeMillis;
        }
        long nanoTime = (System.nanoTime() / 1000) - j;
        if (Math.abs(nanoTime) < 5000000) {
            return nanoTime;
        }
        return 0;
    }

    private void onToCamBack(boolean z) {
        if (this.mVideoCapturer == null || !(this.mVideoCapturer instanceof CameraVideoCapturer) || ((CameraVideoCapturer) this.mVideoCapturer).isBackCam() != z) {
            stopVideoCapturer();
            CameraWrapper cameraWrapper = new CameraWrapper(this.mHandler, !z, this, this.mUsingVECameraV2);
            this.mVideoCapturer = cameraWrapper;
            setupMirror();
            this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
        }
    }

    public void onSwitchVideoCapturer(int i) {
        if (i != this.mSource || this.mVideoCapturer == null) {
            this.mSource = i;
            boolean z = true;
            if (this.mSource == 0 || this.mStatus == 1) {
                switch (this.mSource) {
                    case 1:
                    case 2:
                        if (2 != this.mSource) {
                            z = false;
                        }
                        onToCamBack(z);
                        return;
                    case 3:
                        onToScreen();
                        return;
                    case 4:
                        onToExtern();
                        return;
                    default:
                        stopVideoCapturer();
                        return;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("Ignore switching to video capture device ");
            sb.append(i);
            sb.append(" which is the same with previous.");
            AVLog.iow("LiveStreamVideoCapture", sb.toString());
        }
    }

    public void onVideoCapturerError(int i, Exception exc) {
        this.mObserver.onVideoCaptureError(i, exc);
    }

    private Bitmap createBitmap(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public void enableMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
        setupMirror();
    }

    public void switchVideoCaptureDevice(int i, Intent intent) {
        this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
        this.mSwitchCaptureRunnable.setDevice(i, intent);
        this.mHandler.post(this.mSwitchCaptureRunnable);
    }

    public void adaptedOutputFormat(int i, int i2, int i3) {
        super.nativeAdaptedOutputFormat(i, i2, i3);
        this.mAvalidFps = i3;
    }

    public void start(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        this.mHandler.post(new Runnable() {
            public void run() {
                LiveStreamVideoCapture.this.loadBitmap();
            }
        });
        synchronized (this.mStatFence) {
            if (this.mStatus != 1) {
                this.mHelperFirstVideoTimeMs = 0;
                this.mStatus = 1;
                switchVideoCaptureDevice(this.mSource, this.mScreenIntent);
            }
        }
    }

    public LiveStreamVideoCapture(int i, Handler handler, Observer observer, LiveStreamBuilder liveStreamBuilder) {
        this(i, handler, observer, liveStreamBuilder.getContext());
        this.mUsingVECameraV2 = liveStreamBuilder.isVECamera2API();
    }

    public int setFocusAreas(int i, int i2, int i3, int i4) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setFocusAreas(i, i2, i3, i4);
        }
        return -1;
    }

    public LiveStreamVideoCapture(int i, Handler handler, Observer observer, Context context) {
        this.mStatFence = new Object();
        this.mBackgroundTex = 0;
        this.mLastTimestamp = 0;
        this.mMaxFrameIntervalDiffUs = 0;
        this.mHorizontalMirror = false;
        this.mVerticalMirror = false;
        this.mSaveDevicesIdWhenToBack = 0;
        this.textureIdList = new CopyOnWriteArrayList();
        this.mBaseTimeUs = 0;
        this.mHelperFirstVideoTimeMs = 0;
        this.mAvalidFps = 0;
        this.mSource = i;
        this.mHandler = handler;
        this.mObserver = observer;
        this.mStatus = 0;
        this.mIsResume = true;
        this.mContext = context;
        if (this.mHandler == null) {
            this.mGlThread = new GLThread("liveStreamVideoSource");
            this.mGlThread.start();
            this.mHandler = this.mGlThread.getHandler();
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        throw new AndroidRuntimeException("Not a gl thread.");
                    }
                }
            });
        }
        this.mBackgroundPushVideoFrameRunable = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r21 = this;
                    r1 = r21
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this
                    java.lang.Object r2 = r0.mStatFence
                    monitor-enter(r2)
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    boolean r0 = r0.mIsResume     // Catch:{ all -> 0x010b }
                    if (r0 != 0) goto L_0x0109
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r0 = r0.status()     // Catch:{ all -> 0x010b }
                    r3 = 1
                    if (r0 == r3) goto L_0x0018
                    goto L_0x0109
                L_0x0018:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.lang.Runnable r3 = r3.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x010b }
                    r0.removeCallbacks(r3)     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r0 = r0.mAvalidFps     // Catch:{ all -> 0x010b }
                    if (r0 == 0) goto L_0x002e
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r0 = r0.mAvalidFps     // Catch:{ all -> 0x010b }
                    goto L_0x0032
                L_0x002e:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r0 = r0.mFps     // Catch:{ all -> 0x010b }
                L_0x0032:
                    r3 = 1000(0x3e8, float:1.401E-42)
                    if (r0 > 0) goto L_0x0038
                    r0 = 30
                L_0x0038:
                    int r3 = r3 / r0
                    long r3 = (long) r3     // Catch:{ all -> 0x010b }
                    long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x010b }
                    r7 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 / r7
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    long r9 = r0.mBGMTimestampDeltaUs     // Catch:{ all -> 0x010b }
                    r0 = 0
                    long r5 = r5 - r9
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    long r9 = r0.mLastTimestamp     // Catch:{ all -> 0x010b }
                    r0 = 0
                    long r9 = r5 - r9
                    long r9 = r9 / r7
                    int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                    if (r0 >= 0) goto L_0x0061
                    long r3 = r3 - r9
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r5 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.lang.Runnable r5 = r5.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x010b }
                    r0.postDelayed(r5, r3)     // Catch:{ all -> 0x010b }
                    monitor-exit(r2)     // Catch:{ all -> 0x010b }
                    return
                L_0x0061:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x010b }
                    boolean r0 = r0 instanceof com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper     // Catch:{ all -> 0x010b }
                    if (r0 != 0) goto L_0x0076
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.lang.Runnable r3 = r3.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x010b }
                    r0.post(r3)     // Catch:{ all -> 0x010b }
                    monitor-exit(r2)     // Catch:{ all -> 0x010b }
                    return
                L_0x0076:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r0 = r0.mBGMode     // Catch:{ all -> 0x010b }
                    r3 = 2
                    if (r0 != r3) goto L_0x0096
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper r0 = (com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper) r0     // Catch:{ all -> 0x010b }
                    int r0 = r0.pushLastFrame(r5)     // Catch:{ all -> 0x010b }
                    if (r0 < 0) goto L_0x0096
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.lang.Runnable r3 = r3.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x010b }
                    r0.post(r3)     // Catch:{ all -> 0x010b }
                    monitor-exit(r2)     // Catch:{ all -> 0x010b }
                    return
                L_0x0096:
                    r7 = 5
                    java.lang.String r8 = "LiveStreamVideoCapture"
                    java.lang.String r9 = "LiveStreamVideoCapture background push video"
                    r10 = 0
                    java.lang.String r11 = "LiveStreamVideoCapture.java:mBackgroundPushVideoFrameRunable"
                    r12 = 10000(0x2710, float:1.4013E-41)
                    com.p280ss.avframework.utils.AVLog.logToIODevice2(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.util.List<java.lang.Integer> r0 = r0.textureIdList     // Catch:{ all -> 0x010b }
                    boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x010b }
                    if (r0 == 0) goto L_0x00d2
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    r0.updateImage()     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x010b }
                    r11 = r0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper r11 = (com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper) r11     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r12 = r0.mBackgroundTex     // Catch:{ all -> 0x010b }
                    r13 = 0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r14 = r0.mWidth     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r15 = r0.mHeight     // Catch:{ all -> 0x010b }
                    r16 = 0
                    r17 = 0
                    r20 = 0
                    r18 = r5
                    r11.pushVideoFrame(r12, r13, r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x010b }
                    goto L_0x00fc
                L_0x00d2:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x010b }
                    r11 = r0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper r11 = (com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper) r11     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.util.List<java.lang.Integer> r0 = r0.textureIdList     // Catch:{ all -> 0x010b }
                    r3 = 0
                    java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x010b }
                    java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x010b }
                    int r12 = r0.intValue()     // Catch:{ all -> 0x010b }
                    r13 = 0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r14 = r0.mWidth     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    int r15 = r0.mHeight     // Catch:{ all -> 0x010b }
                    r16 = 0
                    r17 = 0
                    r20 = 0
                    r18 = r5
                    r11.pushVideoFrame(r12, r13, r14, r15, r16, r17, r18, r20)     // Catch:{ all -> 0x010b }
                L_0x00fc:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x010b }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x010b }
                    java.lang.Runnable r3 = r3.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x010b }
                    r0.post(r3)     // Catch:{ all -> 0x010b }
                    monitor-exit(r2)     // Catch:{ all -> 0x010b }
                    return
                L_0x0109:
                    monitor-exit(r2)     // Catch:{ all -> 0x010b }
                    return
                L_0x010b:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x010b }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.C455703.run():void");
            }
        };
        if (this.mHandler == null) {
            this.mHandler = this.mGlThread.getHandler();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                LiveStreamVideoCapture.this.mThreadChecker = new ThreadChecker();
                LiveStreamVideoCapture.this.mDrawer = new GlRenderDrawer();
                LiveStreamVideoCapture.this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            }
        });
        this.mBGMHandler = new BGMHandler(this.mHandler.getLooper());
        this.mSwitchCaptureRunnable = new SwitchCaptureRunnable();
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if ((this.mBGMode == 1 || this.mIsResume) && this.mVideoCapturer != null && (this.mVideoCapturer instanceof ExternWrapper)) {
            return ((ExternWrapper) this.mVideoCapturer).pushVideoFrame(byteBuffer, i, i2, i3, j);
        }
        return -1;
    }

    public int onFrame(Buffer buffer, int i, int i2, int i3, long j) {
        long j2 = j;
        try {
            this.mThreadChecker.checkIsOnValidThread();
        } catch (Exception e) {
            AVLog.m143700w("LiveStreamVideoCapture", e.toString());
        }
        long j3 = j2 - this.mLastTimestamp;
        if (j3 <= 0) {
            StringBuilder sb = new StringBuilder("LiveStreamVideoCapture.onFrame return: diffUs ");
            sb.append(j3);
            AVLog.logToIODevice2(5, "LiveStreamVideoCapture", sb.toString(), null, "LiveStreamVideoCapture.java:onFrame1", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            return -1;
        }
        this.mLastTimestamp = j2;
        synchronized (this.mStatFence) {
            if (status() != 1) {
                StringBuilder sb2 = new StringBuilder("status ");
                sb2.append(status());
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder("LiveStreamVideoCapture.onFrame return: ");
                sb4.append(sb3);
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder("LiveStreamVideoCapture.java:onFrame2: ");
                sb6.append(sb3);
                AVLog.logToIODevice2(5, "LiveStreamVideoCapture", sb5, null, sb6.toString(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                return -1;
            }
            int onFrame = super.onFrame(buffer, i, i2, i3, j);
            return onFrame;
        }
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        if ((this.mBGMode == 1 || this.mIsResume) && this.mVideoCapturer != null && (this.mVideoCapturer instanceof ExternWrapper)) {
            return ((ExternWrapper) this.mVideoCapturer).pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
        }
        return -1;
    }
}
