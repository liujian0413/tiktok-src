package com.p280ss.avframework.livestreamv2.core;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.p280ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener;
import com.p280ss.avframework.effect.IVideoEffectProcessor.MicrophoneDetectListener;
import com.p280ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p280ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.Observer;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl.Range;
import com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.StateListener;
import com.p280ss.avframework.livestreamv2.effectcamera.common.TCState.TCStateType;
import com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2;
import com.p280ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2.FrameListener;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnMicrophoneDetectResultListener;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.EffectMsgListener;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager.ErrorListener;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.ThreadUtils;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.core.EffectCameraWrapperImpl */
public class EffectCameraWrapperImpl extends EffectCameraWrapper implements Callback, StateListener, FrameListener {
    public static final String TAG = EffectCameraWrapper.class.getName();
    private final int STATUS_ERROR = 4;
    private final int STATUS_INIT = 1;
    private final int STATUS_START = 2;
    private final int STATUS_STOP = 3;
    private final int STATUS_UNINIT;
    public CameraDisplay2 mCameraDisplay2;
    public Handler mCaptureHander;
    public int mCaptureHeight;
    public int mCapturePreviewHeight;
    public int mCapturePreviewWidth;
    private GLThread mCaptureThread;
    public int mCaptureWidth;
    private boolean mDisableFilter;
    public FaceDetectListener mFaceDetectListener;
    private int mFps;
    public final EffectCameraWrapper.FrameListener mFrameListener;
    public boolean mFrontCam;
    public MicrophoneDetectListener mMicrophoneDetectListener;
    private EffectMsgListener mMsgListener;
    public Observer mObserver;
    public int mStatus;
    private Handler mWorkHandler;

    public void checkStatus(boolean z) {
    }

    public boolean currentSupportISPControl() {
        return true;
    }

    public int enableMockFace(boolean z) {
        return 0;
    }

    public void forceOutput2DTex(boolean z) {
    }

    public String getEffectVersion() {
        return null;
    }

    public String getVersion() {
        return "";
    }

    public boolean isEnable() {
        return this.mDisableFilter;
    }

    public boolean isFrontCam() {
        return this.mFrontCam;
    }

    public boolean isValid() {
        return true;
    }

    public String name() {
        return "EffectCameraWrapper";
    }

    public void setErrorListener(ErrorListener errorListener) {
    }

    public int startEffectAudio() {
        return 0;
    }

    public int stopEffectAudio() {
        return 0;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void cancelAudioFocus() {
        this.mCameraDisplay2.cancelAutoFocus();
    }

    public int pauseEffect() {
        return this.mCameraDisplay2.pauseEffect();
    }

    public int resumeEffect() {
        return this.mCameraDisplay2.resumeEffect();
    }

    public void startCapture() {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                if (EffectCameraWrapperImpl.this.mStatus == 4) {
                    AVLog.m143697e(EffectCameraWrapperImpl.TAG, "Status exception at startCapture");
                } else if (EffectCameraWrapperImpl.this.mStatus != 2) {
                    EffectCameraWrapperImpl.this.mStatus = 2;
                    ThreadUtils.invokeAtFrontUninterruptibly(EffectCameraWrapperImpl.this.mCaptureHander, (Runnable) new Runnable() {
                        public void run() {
                            EffectCameraWrapperImpl.this.mCameraDisplay2.startCapture(EffectCameraWrapperImpl.this.mFrontCam, EffectCameraWrapperImpl.this.mCaptureWidth, EffectCameraWrapperImpl.this.mCaptureHeight, EffectCameraWrapperImpl.this.mCapturePreviewWidth, EffectCameraWrapperImpl.this.mCapturePreviewHeight);
                        }
                    });
                }
            }
        });
    }

    public void stopCapture() {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                if (EffectCameraWrapperImpl.this.mStatus == 4) {
                    AVLog.m143697e(EffectCameraWrapperImpl.TAG, "Status exception at startCapture");
                } else if (EffectCameraWrapperImpl.this.mStatus != 3) {
                    EffectCameraWrapperImpl.this.mStatus = 3;
                    EffectCameraWrapperImpl.this.mCameraDisplay2.stopCapture();
                }
            }
        });
    }

    public void switchCamera() {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                if (EffectCameraWrapperImpl.this.mStatus == 4) {
                    AVLog.m143697e(EffectCameraWrapperImpl.TAG, "Status exception at startCapture");
                    return;
                }
                EffectCameraWrapperImpl effectCameraWrapperImpl = EffectCameraWrapperImpl.this;
                if (EffectCameraWrapperImpl.this.mStatus == 2) {
                    z = true;
                } else {
                    z = false;
                }
                effectCameraWrapperImpl.checkStatus(z);
                int changeCamera = EffectCameraWrapperImpl.this.mCameraDisplay2.changeCamera();
                if (changeCamera != 0) {
                    EffectCameraWrapperImpl effectCameraWrapperImpl2 = EffectCameraWrapperImpl.this;
                    TCStateType tCStateType = TCStateType.CameraOpenFail;
                    StringBuilder sb = new StringBuilder("change camera failed, ret : ");
                    sb.append(changeCamera);
                    sb.append("msg type ");
                    effectCameraWrapperImpl2.onError(tCStateType, -1, sb.toString());
                    EffectCameraWrapperImpl.this.mStatus = 4;
                }
                EffectCameraWrapperImpl.this.mFrontCam = !EffectCameraWrapperImpl.this.mFrontCam;
            }
        });
    }

    public void release() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mCaptureHander, (Runnable) new Runnable() {
            public void run() {
                EffectCameraWrapperImpl.this.stopCapture();
                EffectCameraWrapperImpl.this.mCameraDisplay2.releaseSurfaceHolder();
                EffectCameraWrapperImpl.this.mStatus = 0;
            }
        });
        if (this.mCaptureThread != null) {
            this.mCaptureHander = null;
            try {
                this.mCaptureThread.join(1000);
            } catch (InterruptedException unused) {
            }
            this.mCaptureThread.quitSafely();
            this.mCaptureThread = null;
        }
    }

    public Range getExposureCompensationRange() {
        Range range = new Range();
        if (!this.mCameraDisplay2.isSupportExposureCompensation()) {
            return null;
        }
        range.max = (float) this.mCameraDisplay2.getMaxExposureCompensation();
        range.min = (float) this.mCameraDisplay2.getMinExposureCompensation();
        return range;
    }

    public int composerAppendNodes(String[] strArr) {
        return this.mCameraDisplay2.setComposerAppendNodes(strArr);
    }

    public int composerRemoveNodes(String[] strArr) {
        return this.mCameraDisplay2.setComposerRemoveNodes(strArr);
    }

    public void enable(boolean z) {
        this.mDisableFilter = z;
        this.mCameraDisplay2.disableFilters(z);
    }

    public void enableRoi(boolean z) {
        this.mCameraDisplay2.enableROIDetect(z);
    }

    public int setEffect(String str) {
        this.mCameraDisplay2.setEffect(str);
        return 0;
    }

    public void setEffectAlgorithmAB(boolean z) {
        this.mCameraDisplay2.setEffectAlgorithmAB(z);
    }

    public int setFaceAttribute(boolean z) {
        this.mCameraDisplay2.setFaceAttribute(z);
        return 0;
    }

    public void setSurface(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(this);
    }

    public int toggleFlashLight(boolean z) {
        return this.mCameraDisplay2.toggleFlashLight(z);
    }

    public void setEffectMsgListener(EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mCameraDisplay2.setEffectMsgListener(this.mMsgListener);
    }

    public void setFaceDetectListener(IFilterManager.FaceDetectListener faceDetectListener) {
        this.mFaceDetectListener = faceDetectListener;
        this.mCameraDisplay2.setDetectFaceResultListener(new OnRefreshFaceDataListener() {
            public void onRefreshFaceData(int i) {
                if (EffectCameraWrapperImpl.this.mFaceDetectListener != null) {
                    EffectCameraWrapperImpl.this.mFaceDetectListener.onFaceDetectResultCallback(i);
                }
            }
        });
    }

    public void setMicrophoneDetectListener(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
        this.mMicrophoneDetectListener = microphoneDetectListener;
        this.mCameraDisplay2.setDetectMicrophoneResultListener(new OnMicrophoneDetectResultListener() {
            public void onMicrophoneDetectResult(float f) {
                if (EffectCameraWrapperImpl.this.mMicrophoneDetectListener != null) {
                    EffectCameraWrapperImpl.this.mMicrophoneDetectListener.onMicrophoneDetectResultCallback(f);
                }
            }
        });
    }

    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                EffectCameraWrapperImpl effectCameraWrapperImpl = EffectCameraWrapperImpl.this;
                if (EffectCameraWrapperImpl.this.mStatus != 4) {
                    z = true;
                } else {
                    z = false;
                }
                effectCameraWrapperImpl.checkStatus(z);
                EffectCameraWrapperImpl.this.mCameraDisplay2.setSurfaceHolder(surfaceHolder);
            }
        });
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                EffectCameraWrapperImpl effectCameraWrapperImpl = EffectCameraWrapperImpl.this;
                if (EffectCameraWrapperImpl.this.mStatus != 4) {
                    z = true;
                } else {
                    z = false;
                }
                effectCameraWrapperImpl.checkStatus(z);
                EffectCameraWrapperImpl.this.mCameraDisplay2.releaseSurfaceHolder();
            }
        });
    }

    public int setExposureCompensation(float f) {
        if (!this.mCameraDisplay2.isSupportExposureCompensation()) {
            return -1;
        }
        this.mCameraDisplay2.setExposureCompensation((int) f);
        return 0;
    }

    public int composerReloadNodes(String[] strArr, int i) {
        return this.mCameraDisplay2.setComposerReloadNodes(strArr, i);
    }

    public int composerSetMode(int i, int i2) {
        return this.mCameraDisplay2.setComposerMode(i, i2);
    }

    public int composerSetNodes(String[] strArr, int i) {
        return this.mCameraDisplay2.setComposerSetNodes(strArr, i);
    }

    public void processDoubleClickEvent(float f, float f2) {
        this.mCameraDisplay2.processDoubleClickEvent(f, f2);
    }

    public void processLongPressEvent(float f, float f2) {
        this.mCameraDisplay2.processLongPressEvent(f, f2);
    }

    public void processRotationEvent(float f, float f2) {
        this.mCameraDisplay2.processRotationEvent(f, f2);
    }

    public void processScaleEvent(float f, float f2) {
        this.mCameraDisplay2.processScaleEvent(f, f2);
    }

    public void processTouchEvent(float f, float f2) {
        this.mCameraDisplay2.processTouchEvent(f, f2);
    }

    public int setCustomEffect(String str, String str2) {
        this.mCameraDisplay2.setCustomEffect(str, str2);
        return 0;
    }

    public int setFilter(String str, float f) {
        this.mCameraDisplay2.setFilter(str, f);
        return 0;
    }

    public void enableMirror(final boolean z, boolean z2) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                CameraDisplay2 cameraDisplay2 = EffectCameraWrapperImpl.this.mCameraDisplay2;
                if (z != EffectCameraWrapperImpl.this.mCameraDisplay2.isFilpHorizontal()) {
                    z = true;
                } else {
                    z = false;
                }
                cameraDisplay2.setFilpHorizontalState(z);
            }
        });
    }

    public int setEffect(String str, boolean z) {
        this.mCameraDisplay2.setEffect(str, z);
        return 0;
    }

    public int composerUpdateNode(String str, String str2, float f) {
        return this.mCameraDisplay2.setComposerUpdateNode(str, str2, f);
    }

    public void processTouchDownEvent(float f, float f2, int i) {
        this.mCameraDisplay2.processTouchDownEvent(f, f2, i);
    }

    public void processTouchUpEvent(float f, float f2, int i) {
        this.mCameraDisplay2.processTouchUpEvent(f, f2, i);
    }

    public int setBeautify(String str, float f, float f2) {
        return this.mCameraDisplay2.setBeautify(str, f, f2, 0.0f);
    }

    public int setReshape(String str, float f, float f2) {
        return this.mCameraDisplay2.setReshape(str, f, f2);
    }

    public void onError(final TCStateType tCStateType, final int i, String str) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                Observer observer = EffectCameraWrapperImpl.this.mObserver;
                int i = i;
                StringBuilder sb = new StringBuilder("ret : ");
                sb.append(i);
                sb.append("msg type ");
                sb.append(tCStateType.name());
                observer.onVideoCaptureError(i, new Exception(sb.toString()));
            }
        });
    }

    public void onInfo(TCStateType tCStateType, int i, String str) {
        if (tCStateType == TCStateType.EffectInitSucceed) {
            EffectMsgListener effectMsgListener = this.mMsgListener;
            if (effectMsgListener != null) {
                effectMsgListener.onMessageReceived(2139095041, i, 0, str);
            }
        }
    }

    public int setFilter(String str, String str2, float f) {
        this.mCameraDisplay2.setFilter(str, str2, f);
        return 0;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        return this.mCameraDisplay2.sendEffectMsg(i, i2, i3, str);
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        return this.mCameraDisplay2.setBeautify(str, f, f2, f3);
    }

    public int setFocusAreas(int i, int i2, int i3, int i4) {
        if (this.mCameraDisplay2.setFocus(i, i2, (float) i3, (float) i4)) {
            return 0;
        }
        return -1;
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z) {
        this.mCameraDisplay2.configEffect(str, str2, z, false);
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        this.mCameraDisplay2.processPanEvent(f, f2, f3, f4, f5);
    }

    public EffectCameraWrapperImpl(final LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, Observer observer, EffectCameraWrapper.FrameListener frameListener) {
        boolean z = true;
        this.mFps = liveStreamBuilder.getVideoCaptureFps();
        this.mCaptureWidth = liveStreamBuilder.getVideoCaptureWidth();
        this.mCaptureHeight = liveStreamBuilder.getVideoCaptureHeight();
        this.mCaptureHander = handler;
        this.mWorkHandler = handler2;
        this.mCapturePreviewWidth = liveStreamBuilder.getVideoWidth();
        this.mCapturePreviewHeight = liveStreamBuilder.getVideoHeight();
        this.mObserver = observer;
        if (liveStreamBuilder.getVideoCaptureDevice() != 1) {
            z = false;
        }
        this.mFrontCam = z;
        this.mFrameListener = frameListener;
        if (this.mCaptureHander == null) {
            this.mCaptureThread = new GLThread("EffectCameraCaptureThread");
            this.mCaptureThread.start();
            this.mCaptureHander = this.mCaptureThread.getHandler();
        }
        if (this.mWorkHandler == null) {
            this.mWorkHandler = new Handler(Looper.getMainLooper());
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mCaptureHander, (Runnable) new Runnable() {
            public void run() {
                EffectCameraWrapperImpl.this.mCameraDisplay2 = new CameraDisplay2(liveStreamBuilder.getContext());
                EffectCameraWrapperImpl.this.mCameraDisplay2.setFrameListener(EffectCameraWrapperImpl.this);
                EffectCameraWrapperImpl.this.mCameraDisplay2.setStateListener(EffectCameraWrapperImpl.this);
                EffectCameraWrapperImpl.this.mStatus = 1;
            }
        });
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
        this.mCameraDisplay2.configEffect(str, str2, z, false, assetManager);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
        this.mCameraDisplay2.configEffect(str, str2, z, false, null, obj);
    }

    public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("Get a frame w ");
        sb.append(i3);
        sb.append(" h ");
        final int i5 = i4;
        sb.append(i5);
        AVLog.m143696d(str, sb.toString());
        Handler handler = this.mCaptureHander;
        final EGLContext eGLContext2 = eGLContext;
        final int i6 = i;
        final int i7 = i2;
        final int i8 = i3;
        final long j2 = j;
        final Bundle bundle2 = bundle;
        C455929 r3 = new Runnable() {
            public void run() {
                EffectCameraWrapperImpl.this.mFrameListener.onFrameAvailable(eGLContext2, i6, i7, i8, i5, j2, bundle2);
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r3);
    }
}
