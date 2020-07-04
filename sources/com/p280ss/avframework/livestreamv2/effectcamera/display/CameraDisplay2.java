package com.p280ss.avframework.livestreamv2.effectcamera.display;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p280ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy;
import com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.StateListener;
import com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType;
import com.p280ss.avframework.livestreamv2.effectcamera.model.BeautyBean;
import com.p280ss.avframework.livestreamv2.effectcamera.model.ComposerNodes;
import com.p280ss.avframework.livestreamv2.effectcamera.model.EffectBean;
import com.p280ss.avframework.livestreamv2.effectcamera.model.FilterBean;
import com.p280ss.avframework.livestreamv2.effectcamera.model.ReshapeFaceBean;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectCallback;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnMicrophoneDetectResultListener;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.Rotation;
import com.p280ss.avframework.livestreamv2.effectcamera.render.FrameRender;
import com.p280ss.avframework.livestreamv2.effectcamera.render.FrameRender.GLCallback;
import com.p280ss.avframework.livestreamv2.effectcamera.render.IAudioPlayer.IFactory;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.Accelerometer;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.LogUtils;
import com.p280ss.avframework.utils.AVLog;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 */
public class CameraDisplay2 {
    public String TAG = "CameraDisplay2";
    public AssetManager mASSManager = null;
    private Accelerometer mAccelerometer;
    private IFactory mAudioPlayerFactory;
    private boolean mCameraChanging = false;
    public Object mCameraFence = new Object();
    private int mCameraID;
    public int mCameraOrientation;
    public IESCameraProxy mCameraProxy;
    public boolean mChange = false;
    public BeautyBean mCurBeautyBean;
    public ComposerNodes mCurComposer;
    public EffectBean mCurEffectBean;
    public FilterBean mCurFilterBean;
    public ReshapeFaceBean mCurReshapeFaceBean;
    public String mDeviceName;
    private EffectCallback mEffectCallback;
    public EffectMsgListener mEffectMsgListener;
    public EffectRender mEffectRender;
    public EGLContext mEglContext;
    private FpsChangeListener mFpsListener;
    public FrameListener mFrameListener;
    public FrameRender mFrameRender;
    public boolean mIsUseResourceFinder;
    private int mMaxFps = 30;
    private int mMinFps = 15;
    public String mModelPath;
    private boolean mNeedFaceAttribute = false;
    public boolean mNeedFlipHorizontal;
    public OnFrameAvailableListener mOnFrameAvailableListener = new OnFrameAvailableListener() {
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            String str = CameraDisplay2.this.TAG;
            StringBuilder sb = new StringBuilder("SurfaceTexture onFrameAvailable: timestamp ");
            sb.append(CameraDisplay2.this.mTimeStamp);
            AVLog.logToIODevice2(4, str, sb.toString(), null, "CameraDisplay2.java:onFrameAvailable:1", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            CameraDisplay2.this.mTimeStamp = System.currentTimeMillis();
            if (CameraDisplay2.this.mFrameRender != null) {
                CameraDisplay2.this.mFrameRender.drawFrame(CameraDisplay2.this.mTextureId, CameraDisplay2.this.mTimeStamp, CameraDisplay2.this.getRenderRotation(), CameraDisplay2.this.mCameraOrientation, CameraDisplay2.this.mNeedFlipHorizontal, CameraDisplay2.this.mbFirstFrame);
            }
            if (CameraDisplay2.this.mbFirstFrame) {
                CameraDisplay2.this.mbFirstFrame = false;
            }
        }
    };
    public int mPreviewFormat;
    public int mPreviewH = 0;
    public int mPreviewW = 0;
    public int mSetPreviewHeight = 0;
    public int mSetPreviewWidth = 0;
    private StateListener mStateListener;
    private SurfaceHolder mSurfaceHolder;
    public SurfaceTexture mSurfaceTexture;
    public int mTextureId = -1;
    private int[] mTextureOutId;
    public long mTimeStamp;
    private boolean mUseTTDetection;
    private WindowManager mWindMgr;
    private int mWindowRotation;
    public boolean mbFirstFrame;
    private boolean mbStartCapture;

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2$FpsChangeListener */
    public interface FpsChangeListener {
        void onFpsChanged(int i);
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2$FrameListener */
    public interface FrameListener {
        void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle);
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    private void setUpCamera(SurfaceTexture surfaceTexture) {
    }

    public FrameListener getFrameListener() {
        return this.mFrameListener;
    }

    public boolean isFilpHorizontal() {
        return this.mNeedFlipHorizontal;
    }

    static {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("effect");
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary("ies_render");
    }

    private void deleteInternalTextures() {
        if (this.mTextureOutId != null) {
            GLES20.glDeleteTextures(1, this.mTextureOutId, 0);
            this.mTextureOutId = null;
        }
    }

    public void cancelAutoFocus() {
        if (this.mCameraProxy != null) {
            this.mCameraProxy.cancelAutoFocus();
        }
    }

    public int getMaxExposureCompensation() {
        if (this.mCameraProxy == null) {
            return 0;
        }
        return this.mCameraProxy.getMaxExposureCompensation();
    }

    public int getMinExposureCompensation() {
        if (this.mCameraProxy == null) {
            return 0;
        }
        return this.mCameraProxy.getMinExposureCompensation();
    }

    public StateListener getStateListener() {
        if (this.mStateListener != null) {
            return this.mStateListener;
        }
        return new StateListener() {
            public void onError(TCStateType tCStateType, int i, String str) {
            }

            public void onInfo(TCStateType tCStateType, int i, String str) {
            }
        };
    }

    public boolean isEnableMockFace() {
        EffectRender effectRender = this.mEffectRender;
        if (effectRender != null) {
            return effectRender.isEnableMockFace();
        }
        return false;
    }

    public boolean isSupportExposureCompensation() {
        if (this.mCameraProxy == null) {
            return false;
        }
        return this.mCameraProxy.isSupportExposureCompensation();
    }

    public void onPause() {
        LogUtils.m143683i(this.TAG, "onPause", new Object[0]);
    }

    public void onResume() {
        LogUtils.m143683i(this.TAG, "onResume", new Object[0]);
    }

    public int pauseEffect() {
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.onPause();
    }

    public int resumeEffect() {
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.onResume();
    }

    private void deleteSurfaceTexture() {
        if (this.mTextureId != -1) {
            GLES20.glDeleteTextures(1, new int[]{this.mTextureId}, 0);
        }
        this.mTextureId = -1;
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        this.mSurfaceTexture = null;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void deleteTextures() {
        LogUtils.m143683i(this.TAG, "delete textures", new Object[0]);
        deleteSurfaceTexture();
        deleteInternalTextures();
    }

    public synchronized void releaseSurfaceHolder() {
        if (!(this.mFrameRender == null || this.mSurfaceHolder == null)) {
            this.mFrameRender.releaseSurface();
            this.mSurfaceHolder = null;
        }
    }

    public int stopCapture() {
        synchronized (this.mCameraFence) {
            if (this.mCameraProxy != null) {
                this.mCameraProxy.releaseCamera();
            }
        }
        if (this.mFrameRender != null) {
            this.mFrameRender.stopProcess();
        }
        this.mbStartCapture = false;
        return 0;
    }

    private void fillDisplayRotation() {
        switch (this.mWindMgr.getDefaultDisplay().getRotation()) {
            case 0:
                this.mWindowRotation = 0;
                return;
            case 1:
                this.mWindowRotation = 90;
                return;
            case 2:
                this.mWindowRotation = NormalGiftView.ALPHA_180;
                return;
            case 3:
                this.mWindowRotation = 270;
                break;
        }
    }

    private boolean openCamera() {
        if (this.mCameraProxy == null) {
            this.mCameraProxy = new IESCameraProxy();
        }
        if (this.mCameraProxy.getCamera() != null) {
            return true;
        }
        if (this.mCameraProxy.getNumberOfCameras() == 1) {
            this.mCameraID = 0;
        }
        return this.mCameraProxy.openCamera(this.mCameraID, null);
    }

    public Rotation getRenderRotation() {
        int direction = this.mAccelerometer.getDirection();
        Rotation rotation = Rotation.CLOCKWISE_ROTATE_0;
        if (direction == 0) {
            return Rotation.CLOCKWISE_ROTATE_0;
        }
        if (direction == 90) {
            return Rotation.CLOCKWISE_ROTATE_90;
        }
        if (direction == 180) {
            return Rotation.CLOCKWISE_ROTATE_180;
        }
        if (direction != 270) {
            return rotation;
        }
        return Rotation.CLOCKWISE_ROTATE_270;
    }

    public synchronized void onDestroy() {
        stopCapture();
        releaseSurfaceHolder();
        this.mEffectRender = null;
        if (this.mFrameRender != null) {
            this.mFrameRender.release();
            this.mFrameRender = null;
        }
        this.mFrameListener = null;
        this.mFpsListener = null;
        this.mStateListener = null;
        this.mCameraProxy = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        return -501;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int changeCamera() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mCameraFence
            monitor-enter(r0)
            int r1 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ all -> 0x0092 }
            r2 = -501(0xfffffffffffffe0b, float:NaN)
            r3 = 1
            if (r1 == r3) goto L_0x0090
            boolean r1 = r6.mCameraChanging     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0012
            goto L_0x0090
        L_0x0012:
            int r1 = r6.mCameraID     // Catch:{ all -> 0x0092 }
            int r1 = 1 - r1
            r6.mCameraID = r1     // Catch:{ all -> 0x0092 }
            r6.mCameraChanging = r3     // Catch:{ all -> 0x0092 }
            r6.mbFirstFrame = r3     // Catch:{ all -> 0x0092 }
            com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r1 = r6.mCameraProxy     // Catch:{ all -> 0x0092 }
            int r4 = r6.mCameraID     // Catch:{ all -> 0x0092 }
            r5 = 0
            boolean r1 = r1.openCamera(r4, r5)     // Catch:{ all -> 0x0092 }
            r4 = -1
            if (r1 == 0) goto L_0x0087
            com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r1 = r6.mCameraProxy     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.getCamera()     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0087
            com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r1 = r6.mCameraProxy     // Catch:{ all -> 0x0092 }
            boolean r1 = r1.isFlipHorizontal()     // Catch:{ all -> 0x0092 }
            r6.mNeedFlipHorizontal = r1     // Catch:{ all -> 0x0092 }
            com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r1 = r6.mCameraProxy     // Catch:{ all -> 0x0092 }
            int r1 = r1.getOrientation()     // Catch:{ all -> 0x0092 }
            r6.mCameraOrientation = r1     // Catch:{ all -> 0x0092 }
            int r1 = r6.mCameraOrientation     // Catch:{ all -> 0x0092 }
            int r5 = r6.mCameraID     // Catch:{ all -> 0x0092 }
            if (r5 != r3) goto L_0x0049
            int r3 = r6.mWindowRotation     // Catch:{ all -> 0x0092 }
            goto L_0x004c
        L_0x0049:
            int r3 = r6.mWindowRotation     // Catch:{ all -> 0x0092 }
            int r3 = -r3
        L_0x004c:
            int r1 = r1 + r3
            r6.mCameraOrientation = r1     // Catch:{ all -> 0x0092 }
            int r1 = r6.mCameraOrientation     // Catch:{ all -> 0x0092 }
            int r1 = r6.normalizeDegree(r1)     // Catch:{ all -> 0x0092 }
            r6.mCameraOrientation = r1     // Catch:{ all -> 0x0092 }
            int r1 = r6.mSetPreviewWidth     // Catch:{ all -> 0x0092 }
            int r3 = r6.mSetPreviewHeight     // Catch:{ all -> 0x0092 }
            boolean r1 = r6.setPreviewSize(r1, r3)     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x006a
            com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType r1 = com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType.PreProcessFail     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "setPreview size failed"
            r6.pushError(r1, r4, r3)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r2
        L_0x006a:
            com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r1 = r6.mCameraProxy     // Catch:{ Exception -> 0x007e }
            android.graphics.SurfaceTexture r3 = r6.mSurfaceTexture     // Catch:{ Exception -> 0x007e }
            r1.startPreview(r3)     // Catch:{ Exception -> 0x007e }
            com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r1 = r6.mCameraProxy     // Catch:{ all -> 0x0092 }
            int r1 = r1.getPreviewFormat()     // Catch:{ all -> 0x0092 }
            r6.mPreviewFormat = r1     // Catch:{ all -> 0x0092 }
            r1 = 0
            r6.mCameraChanging = r1     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r1
        L_0x007e:
            com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType r1 = com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType.PreProcessFail     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "startPreview failed"
            r6.pushError(r1, r4, r3)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r2
        L_0x0087:
            com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType r1 = com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType.CameraOpenFail     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "OpenCamera failed"
            r6.pushError(r1, r4, r3)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r2
        L_0x0090:
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            return r2
        L_0x0092:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.changeCamera():int");
    }

    public void setFaceAttribute(boolean z) {
        this.mNeedFaceAttribute = z;
    }

    public void setFpsChangeListener(FpsChangeListener fpsChangeListener) {
        this.mFpsListener = fpsChangeListener;
    }

    public void setStateListener(StateListener stateListener) {
        this.mStateListener = stateListener;
    }

    private int normalizeDegree(int i) {
        int i2 = i % 360;
        if (i2 < 0) {
            return i2 + 360;
        }
        return i2;
    }

    public void setEffect(String str) {
        setEffect(str, false);
    }

    public void setFilpHorizontalState(boolean z) {
        if (z != this.mNeedFlipHorizontal) {
            this.mNeedFlipHorizontal = z;
        }
    }

    public void setFrameListener(FrameListener frameListener) {
        synchronized (this) {
            this.mFrameListener = frameListener;
        }
    }

    public int disableFilters(boolean z) {
        if (this.mFrameRender != null) {
            return this.mFrameRender.disableFilters(z);
        }
        return 0;
    }

    public int enableROIDetect(boolean z) {
        if (this.mEffectRender == null) {
            return -1;
        }
        return this.mEffectRender.setROIDetect(z);
    }

    public boolean forceDetectFace(boolean z) {
        if (this.mEffectRender == null) {
            return false;
        }
        this.mEffectRender.setForceDetectFace(z);
        return true;
    }

    public boolean setDetectFaceResultListener(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.mEffectRender == null) {
            return false;
        }
        this.mEffectRender.setOnRefreshFaceDataListener(onRefreshFaceDataListener);
        return true;
    }

    public boolean setDetectMicrophoneResultListener(OnMicrophoneDetectResultListener onMicrophoneDetectResultListener) {
        if (this.mEffectRender == null) {
            return false;
        }
        this.mEffectRender.setOnMicrophoneDetectResultListener(onMicrophoneDetectResultListener);
        return true;
    }

    public void setEffectAlgorithmAB(boolean z) {
        if (this.mEffectRender != null) {
            this.mEffectRender.setAlgorithmAB(z);
        }
    }

    public int setEffectMsgListener(EffectMsgListener effectMsgListener) {
        this.mEffectMsgListener = effectMsgListener;
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.setMessageListener(effectMsgListener);
    }

    public void setExposureCompensation(int i) {
        if (this.mCameraProxy != null) {
            this.mCameraProxy.setExposureCompensation(i);
        }
    }

    public int setMaxMemCache(int i) {
        if (this.mEffectRender != null) {
            return this.mEffectRender.setMaxMemCache(i);
        }
        return -105;
    }

    public int setROI(boolean z) {
        if (TextUtils.isEmpty(this.mModelPath)) {
            return -1;
        }
        return enableROIDetect(z);
    }

    public int setComposerAppendNodes(String[] strArr) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerAppendNodes(strArr);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerAppendNodes(strArr);
        }
        return -105;
    }

    public int setComposerRemoveNodes(String[] strArr) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerRemoveNodes(strArr);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerRemoveNodes(strArr);
        }
        return -105;
    }

    public int toggleFlashLight(boolean z) {
        if (this.mCameraProxy == null || this.mCameraProxy.getCamera() == null) {
            return -502;
        }
        return this.mCameraProxy.toggleFlashLight(z);
    }

    public void enableMockFace(boolean z) {
        int i;
        EffectRender effectRender = this.mEffectRender;
        if (effectRender != null) {
            i = effectRender.enableMockFace(z);
        } else {
            i = -1;
        }
        if (i != 0) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder("Set mock face failed: ");
            sb.append(i);
            LogUtils.m143680e(str, sb.toString(), new Object[0]);
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) throws NullPointerException {
        if (surfaceHolder != null) {
            this.mSurfaceHolder = surfaceHolder;
            if (this.mSurfaceHolder != null) {
                this.mSurfaceHolder.setType(3);
            }
            if (this.mFrameRender != null) {
                this.mFrameRender.setSurface(surfaceHolder.getSurface());
                return;
            }
            return;
        }
        throw new NullPointerException("holder is null");
    }

    public CameraDisplay2(Context context) {
        this.mAccelerometer = new Accelerometer(context);
        this.mFrameRender = new FrameRender();
        this.mFrameRender.init();
        this.mModelPath = null;
        this.mbFirstFrame = false;
        this.mASSManager = null;
        this.mIsUseResourceFinder = false;
        this.mCurBeautyBean = new BeautyBean();
        this.mCurEffectBean = new EffectBean();
        this.mCurFilterBean = new FilterBean();
        this.mCurReshapeFaceBean = new ReshapeFaceBean();
        this.mCurComposer = new ComposerNodes();
        this.mEffectRender = new EffectRender();
        this.mWindMgr = (WindowManager) context.getSystemService("window");
        this.mEffectCallback = null;
    }

    public void setCustomEffect(String str, String str2) {
        setCustomEffect(str, str2, false);
    }

    public void setFpsRange(int i, int i2) {
        this.mMinFps = i;
        this.mMaxFps = i2;
    }

    public void processDoubleClickEvent(float f, float f2) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processDoubleClickEvent(f, f2);
        }
    }

    public void processLongPressEvent(float f, float f2) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processLongPressEvent(f, f2);
        }
    }

    public void processRotationEvent(float f, float f2) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processRotationEvent(f, f2);
        }
    }

    public void processScaleEvent(float f, float f2) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processScaleEvent(f, f2);
        }
    }

    public void processTouchEvent(float f, float f2) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processTouchEvent(f, f2);
        }
    }

    public int setComposerReloadNodes(String[] strArr, int i) {
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerReloadNodes(strArr, i);
        }
        return -105;
    }

    public int setComposerMode(int i, int i2) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerMode(i, i2);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerSetMode(i, i2);
        }
        return -105;
    }

    public int setComposerSetNodes(String[] strArr, int i) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerNodes(strArr, i);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerSetNodes(strArr, i);
        }
        return -105;
    }

    private boolean setPreviewSize(int i, int i2) {
        List bestMatchCameraPreviewSize = this.mCameraProxy.getBestMatchCameraPreviewSize();
        if (bestMatchCameraPreviewSize == null) {
            return false;
        }
        int[] iArr = (int[]) bestMatchCameraPreviewSize.get(0);
        int i3 = iArr[0];
        int i4 = iArr[1];
        if (i > i2 || this.mCameraOrientation % NormalGiftView.ALPHA_180 == 0) {
            this.mSetPreviewWidth = i4;
            this.mSetPreviewHeight = i3;
        } else {
            this.mSetPreviewWidth = i3;
            this.mSetPreviewHeight = i4;
        }
        this.mCameraProxy.setPreviewSize(i4, i3);
        return true;
    }

    public void setEffect(String str, boolean z) {
        String str2 = this.TAG;
        StringBuilder sb = new StringBuilder("setEffect: ");
        sb.append(str);
        LogUtils.m143677d(str2, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            str = "";
            z = false;
        }
        if (this.mCurEffectBean == null) {
            this.mCurEffectBean = new EffectBean(str, z);
        } else {
            this.mCurEffectBean.setResPath(str);
            this.mCurEffectBean.setRenderCacheKey(null);
            this.mCurEffectBean.setWithoutFace(z);
            this.mCurEffectBean.setCustom(false);
        }
        if (this.mEffectRender != null) {
            int effect = this.mEffectRender.setEffect(str, z);
            if (effect != 0) {
                String str3 = this.TAG;
                StringBuilder sb2 = new StringBuilder("setEffect(");
                sb2.append(str);
                sb2.append(") failed: ");
                sb2.append(effect);
                LogUtils.m143680e(str3, sb2.toString(), new Object[0]);
            }
        }
    }

    public int setFilter(String str, float f) {
        String str2 = this.TAG;
        StringBuilder sb = new StringBuilder("filter path: ");
        sb.append(str);
        LogUtils.m143683i(str2, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (this.mCurFilterBean == null) {
            this.mCurFilterBean = new FilterBean(str, f);
        } else {
            this.mCurFilterBean.setLeftResPath(str);
            this.mCurFilterBean.setRightResPath(str);
            this.mCurFilterBean.setIntensity(f);
            this.mCurFilterBean.setPosition(0.0f);
        }
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.setFilter(str, f);
    }

    public void pushError(TCStateType tCStateType, int i, String str) {
        getStateListener().onError(tCStateType, i, str);
    }

    public void pushInfo(TCStateType tCStateType, int i, String str) {
        getStateListener().onInfo(tCStateType, i, str);
    }

    public void processTouchDownEvent(float f, float f2, int i) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processTouchDownEvent(f, f2, i);
        }
    }

    public void processTouchUpEvent(float f, float f2, int i) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processTouchUpEvent(f, f2, i);
        }
    }

    public int setComposerUpdateNode(String str, String str2, float f) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerUpdateNodes(str, str2, f);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerUpdateNode(str, str2, f);
        }
        return -105;
    }

    public void setCustomEffect(String str, String str2, boolean z) {
        String str3 = this.TAG;
        StringBuilder sb = new StringBuilder("setCustomEffect: ");
        sb.append(str2);
        LogUtils.m143677d(str3, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
            z = false;
        }
        if (this.mCurEffectBean == null) {
            this.mCurEffectBean = new EffectBean(str, str2, z);
        } else {
            this.mCurEffectBean.setResPath(str2);
            this.mCurEffectBean.setRenderCacheKey(str);
            this.mCurEffectBean.setWithoutFace(z);
            this.mCurEffectBean.setCustom(true);
        }
        if (this.mEffectRender != null) {
            this.mEffectRender.setCustomEffect(str, str2, z);
        }
    }

    public int setReshape(String str, float f, float f2) {
        String str2 = this.TAG;
        StringBuilder sb = new StringBuilder("setReshape ");
        sb.append(str);
        LogUtils.m143683i(str2, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(str)) {
            str = "";
            f = 0.0f;
            f2 = 0.0f;
        }
        if (this.mCurReshapeFaceBean == null) {
            this.mCurReshapeFaceBean = new ReshapeFaceBean(str, f, f2);
        } else {
            this.mCurReshapeFaceBean.setResPath(str);
            this.mCurReshapeFaceBean.setEyeIntensity(f);
            this.mCurReshapeFaceBean.setCheekIntensity(f2);
        }
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.setReshape(str, f, f2);
    }

    public int setFilter(String str, String str2, float f) {
        String str3 = this.TAG;
        StringBuilder sb = new StringBuilder("leftFilterName: ");
        sb.append(str);
        sb.append("  rightFilterName: ");
        sb.append(str2);
        sb.append("position: ");
        sb.append(f);
        LogUtils.m143683i(str3, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        if (this.mCurFilterBean == null) {
            this.mCurFilterBean = new FilterBean(str, str2, f, 1.0f);
        } else {
            this.mCurFilterBean.setLeftResPath(str);
            this.mCurFilterBean.setRightResPath(str2);
            this.mCurFilterBean.setIntensity(1.0f);
            this.mCurFilterBean.setPosition(f);
        }
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.switchFilter(str, str2, f);
    }

    public int startCapture(boolean z, int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        this.mSetPreviewWidth = i;
        this.mSetPreviewHeight = i2;
        fillDisplayRotation();
        if (z) {
            this.mCameraID = 1;
        } else {
            this.mCameraID = 0;
        }
        if (this.mCameraProxy == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!openCamera()) {
            pushError(TCStateType.CameraOpenFail, -1, "OpenCamera failed.");
            return -1;
        }
        if (this.mCameraProxy.getCamera() != null) {
            if (z2) {
                this.mNeedFlipHorizontal = this.mCameraProxy.isFlipHorizontal();
            }
            this.mCameraOrientation = this.mCameraProxy.getOrientation();
            int i5 = this.mCameraOrientation;
            if (z) {
                i4 = this.mWindowRotation;
            } else {
                i4 = -this.mWindowRotation;
            }
            this.mCameraOrientation = i5 + i4;
            this.mCameraOrientation = normalizeDegree(this.mCameraOrientation);
            if (!setPreviewSize(this.mSetPreviewWidth, this.mSetPreviewHeight)) {
                pushError(TCStateType.CameraOpenFail, -1, "OpenCamera failed.");
                return -1;
            }
        }
        this.mFrameRender.setGLCallback(new GLCallback() {
            public void onOpenGLDestroy() {
                if (CameraDisplay2.this.mEffectRender != null) {
                    CameraDisplay2.this.mEffectRender.release();
                }
                CameraDisplay2.this.deleteTextures();
                CameraDisplay2.this.mEglContext = null;
            }

            public int onUpdateTexImage() {
                if (CameraDisplay2.this.mSurfaceTexture == null) {
                    return -1;
                }
                try {
                    CameraDisplay2.this.mSurfaceTexture.updateTexImage();
                    return 0;
                } catch (Throwable unused) {
                    return -1;
                }
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|33|34|35) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0203 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onOpenGLCreate() {
                /*
                    r10 = this;
                    javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
                    javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r1 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
                    r1.mEglContext = r0
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    int r0 = r0.mTextureId
                    r1 = -1
                    if (r0 != r1) goto L_0x0048
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    int r2 = com.p280ss.avframework.livestreamv2.effectcamera.utils.OpenGLUtils.getExternalOESTextureID()
                    r0.mTextureId = r2
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    android.graphics.SurfaceTexture r2 = new android.graphics.SurfaceTexture
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    int r3 = r3.mTextureId
                    r2.<init>(r3)
                    r0.mSurfaceTexture = r2
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r2 = 21
                    if (r0 < r2) goto L_0x003d
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    android.graphics.SurfaceTexture r0 = r0.mSurfaceTexture
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    android.graphics.SurfaceTexture$OnFrameAvailableListener r2 = r2.mOnFrameAvailableListener
                    r3 = 0
                    r0.setOnFrameAvailableListener(r2, r3)
                    goto L_0x0048
                L_0x003d:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    android.graphics.SurfaceTexture r0 = r0.mSurfaceTexture
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    android.graphics.SurfaceTexture$OnFrameAvailableListener r2 = r2.mOnFrameAvailableListener
                    r0.setOnFrameAvailableListener(r2)
                L_0x0048:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    java.lang.String r0 = r0.mModelPath
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01ec
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r0 = r0.mEffectRender
                    if (r0 == 0) goto L_0x01ec
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r0.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    java.lang.String r3 = r0.mModelPath
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    java.lang.String r4 = r0.mDeviceName
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    int r5 = r0.mSetPreviewWidth
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    int r6 = r0.mSetPreviewHeight
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    boolean r7 = r0.mChange
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    android.content.res.AssetManager r8 = r0.mASSManager
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    boolean r9 = r0.mIsUseResourceFinder
                    int r0 = r2.init(r3, r4, r5, r6, r7, r8, r9)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.EffectBean r2 = r2.mCurEffectBean
                    boolean r2 = r2.isCustom()
                    if (r2 == 0) goto L_0x00a6
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.EffectBean r3 = r3.mCurEffectBean
                    java.lang.String r3 = r3.getRenderCacheKey()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.EffectBean r4 = r4.mCurEffectBean
                    java.lang.String r4 = r4.getResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r5 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.EffectBean r5 = r5.mCurEffectBean
                    boolean r5 = r5.isWithoutFace()
                    r2.setCustomEffect(r3, r4, r5)
                    goto L_0x00bd
                L_0x00a6:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.EffectBean r3 = r3.mCurEffectBean
                    java.lang.String r3 = r3.getResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.EffectBean r4 = r4.mCurEffectBean
                    boolean r4 = r4.isWithoutFace()
                    r2.setEffect(r3, r4)
                L_0x00bd:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.BeautyBean r3 = r3.mCurBeautyBean
                    java.lang.String r3 = r3.getResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.BeautyBean r4 = r4.mCurBeautyBean
                    float r4 = r4.getSmoothIntensity()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r5 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.BeautyBean r5 = r5.mCurBeautyBean
                    float r5 = r5.getWhiteIntensity()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r6 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.BeautyBean r6 = r6.mCurBeautyBean
                    float r6 = r6.getSharpIntensity()
                    r2.setFaceBeauty(r3, r4, r5, r6)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r2 = r2.mCurFilterBean
                    java.lang.String r2 = r2.getLeftResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r3 = r3.mCurFilterBean
                    java.lang.String r3 = r3.getRightResPath()
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L_0x0112
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r3 = r3.mCurFilterBean
                    java.lang.String r3 = r3.getLeftResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r4 = r4.mCurFilterBean
                    float r4 = r4.getIntensity()
                    r2.setFilter(r3, r4)
                    goto L_0x0131
                L_0x0112:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r3 = r3.mCurFilterBean
                    java.lang.String r3 = r3.getLeftResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r4 = r4.mCurFilterBean
                    java.lang.String r4 = r4.getRightResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r5 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.FilterBean r5 = r5.mCurFilterBean
                    float r5 = r5.getPosition()
                    r2.switchFilter(r3, r4, r5)
                L_0x0131:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes r3 = r3.mCurComposer
                    int r3 = r3.getComposerMode()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes r4 = r4.mCurComposer
                    int r4 = r4.getComposerOrderType()
                    r2.composerSetMode(r3, r4)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes r3 = r3.mCurComposer
                    java.lang.String[] r3 = r3.getComposerNodesPaths()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes r4 = r4.mCurComposer
                    int r4 = r4.getComposerNodesNum()
                    r2.composerSetNodes(r3, r4)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes r2 = r2.mCurComposer
                    java.util.Map r2 = r2.getComposerNodes()
                    java.util.Set r2 = r2.entrySet()
                    java.util.Iterator r2 = r2.iterator()
                L_0x016f:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x018f
                    java.lang.Object r3 = r2.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r3 = r3.getValue()
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes$ComposerNode r3 = (com.p280ss.avframework.livestreamv2.effectcamera.model.ComposerNodes.ComposerNode) r3
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r4 = r4.mEffectRender
                    java.lang.String r5 = r3.nodePath
                    java.lang.String r6 = r3.nodeTag
                    float r3 = r3.nodeValue
                    r4.composerUpdateNode(r5, r6, r3)
                    goto L_0x016f
                L_0x018f:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ComposerNodes r3 = r3.mCurComposer
                    java.lang.String[] r3 = r3.getComposerAppendedNodes()
                    r2.composerAppendNodes(r3)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ReshapeFaceBean r3 = r3.mCurReshapeFaceBean
                    java.lang.String r3 = r3.getResPath()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r4 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ReshapeFaceBean r4 = r4.mCurReshapeFaceBean
                    float r4 = r4.getEyeIntensity()
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r5 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.model.ReshapeFaceBean r5 = r5.mCurReshapeFaceBean
                    float r5 = r5.getCheekIntensity()
                    r2.setReshape(r3, r4, r5)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r2 = r2.mEffectRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.effect.IVideoEffectProcessor$EffectMsgListener r3 = r3.mEffectMsgListener
                    r2.setMessageListener(r3)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.FrameRender r2 = r2.mFrameRender
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.render.EffectRender r3 = r3.mEffectRender
                    long r3 = r3.getHandler()
                    r2.setProcessHandler(r3)
                    if (r0 < 0) goto L_0x01e3
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType r3 = com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType.EffectInitSucceed
                    java.lang.String r4 = "Init Succeed"
                    r2.pushInfo(r3, r0, r4)
                    goto L_0x01ec
                L_0x01e3:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType r3 = com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType.EffectInitFail
                    java.lang.String r4 = "Init Failed"
                    r2.pushError(r3, r0, r4)
                L_0x01ec:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r0 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this
                    java.lang.Object r0 = r0.mCameraFence
                    monitor-enter(r0)
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this     // Catch:{ all -> 0x021a }
                    com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r2 = r2.mCameraProxy     // Catch:{ all -> 0x021a }
                    if (r2 == 0) goto L_0x0218
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this     // Catch:{ Exception -> 0x0203 }
                    com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r2 = r2.mCameraProxy     // Catch:{ Exception -> 0x0203 }
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r3 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this     // Catch:{ Exception -> 0x0203 }
                    android.graphics.SurfaceTexture r3 = r3.mSurfaceTexture     // Catch:{ Exception -> 0x0203 }
                    r2.startPreview(r3)     // Catch:{ Exception -> 0x0203 }
                    goto L_0x020c
                L_0x0203:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this     // Catch:{ all -> 0x021a }
                    com.ss.avframework.livestreamv2.effectcamera.common.TCState$TCStateType r3 = com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType.PreProcessFail     // Catch:{ all -> 0x021a }
                    java.lang.String r4 = "startPreview failed"
                    r2.pushError(r3, r1, r4)     // Catch:{ all -> 0x021a }
                L_0x020c:
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r1 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this     // Catch:{ all -> 0x021a }
                    com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2 r2 = com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.this     // Catch:{ all -> 0x021a }
                    com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy r2 = r2.mCameraProxy     // Catch:{ all -> 0x021a }
                    int r2 = r2.getPreviewFormat()     // Catch:{ all -> 0x021a }
                    r1.mPreviewFormat = r2     // Catch:{ all -> 0x021a }
                L_0x0218:
                    monitor-exit(r0)     // Catch:{ all -> 0x021a }
                    return
                L_0x021a:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x021a }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.C456392.onOpenGLCreate():void");
            }

            public void onFrameAvailable(int i, long j, Bundle bundle) {
                synchronized (this) {
                    if (CameraDisplay2.this.mFrameListener != null) {
                        String str = CameraDisplay2.this.TAG;
                        StringBuilder sb = new StringBuilder("GLCallback onFrameAvailable: texID ");
                        sb.append(i);
                        sb.append(", timestamp ");
                        sb.append(j);
                        AVLog.logToIODevice2(4, str, sb.toString(), null, "CameraDisplay2.java:onFrameAvailable:2", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                        FrameListener frameListener = CameraDisplay2.this.mFrameListener;
                        EGLContext eGLContext = CameraDisplay2.this.mEglContext;
                        int i2 = CameraDisplay2.this.mPreviewFormat;
                        int i3 = CameraDisplay2.this.mPreviewW;
                        int i4 = CameraDisplay2.this.mPreviewH;
                        if (!CameraDisplay2.this.mEffectRender.isEnableROI()) {
                            bundle = null;
                        }
                        frameListener.onFrameAvailable(eGLContext, i, i2, i3, i4, j, bundle);
                    }
                }
            }
        });
        if (this.mPreviewW == 0 || this.mPreviewH == 0) {
            this.mPreviewW = this.mSetPreviewWidth;
            this.mPreviewH = this.mSetPreviewHeight;
            int max = Math.max(this.mPreviewW, this.mPreviewH);
            int min = Math.min(this.mPreviewW, this.mPreviewH);
            int i6 = max * 9;
            if (i6 < min * 16) {
                min = i6 / 16;
            }
            if (this.mPreviewW > this.mPreviewH) {
                i3 = max;
            } else {
                i3 = min;
            }
            this.mPreviewW = i3;
            if (this.mPreviewW == max) {
                max = min;
            }
            this.mPreviewH = max;
        }
        this.mFrameRender.startProcess(this.mPreviewW, this.mPreviewH, this.mSetPreviewWidth, this.mSetPreviewHeight);
        this.mbStartCapture = true;
        return 0;
    }

    public void configEffect(String str, String str2, boolean z, boolean z2) {
        this.mModelPath = str;
        this.mDeviceName = str2;
        this.mUseTTDetection = z;
        this.mChange = z2;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.sendMessage(i, i2, i3, str);
    }

    public boolean setFocus(int i, int i2, float f, float f2) {
        if (this.mCameraProxy == null) {
            return false;
        }
        return this.mCameraProxy.setFocusAreas(i, i2, 0.15f, new float[]{f, f2}, this.mCameraProxy.getOrientation());
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        if (TextUtils.isEmpty(str)) {
            str = "";
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (this.mCurBeautyBean == null) {
            this.mCurBeautyBean = new BeautyBean(str, f, f2, f3);
        } else {
            this.mCurBeautyBean.setResPath(str);
            this.mCurBeautyBean.setSmoothIntensity(f);
            this.mCurBeautyBean.setWhiteIntensity(f2);
            this.mCurBeautyBean.setSharpIntensity(f3);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.setFaceBeauty(str, f, f2, f3);
        }
        return -105;
    }

    public void configEffect(String str, String str2, boolean z, boolean z2, AssetManager assetManager) {
        configEffect(str, str2, z, z2);
        this.mASSManager = assetManager;
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (this.mEffectRender != null) {
            this.mEffectRender.processPanEvent(f, f2, f3, f4, f5);
        }
    }

    public int startCapture(boolean z, int i, int i2, int i3, int i4) {
        this.mPreviewW = i3;
        this.mPreviewH = i4;
        return startCapture(z, i, i2);
    }

    public void configEffect(String str, String str2, boolean z, boolean z2, AssetManager assetManager, Object obj) {
        configEffect(str, str2, z, z2, assetManager);
        if (obj != null) {
            this.mIsUseResourceFinder = true;
            this.mEffectCallback = new EffectCallback();
            EffectCallback.setResourceFinder(obj);
            return;
        }
        this.mIsUseResourceFinder = false;
    }
}
