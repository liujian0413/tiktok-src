package com.p280ss.video.rtc.engine.video;

import android.content.Context;
import com.p280ss.video.rtc.engine.NativeFunctions;
import com.p280ss.video.rtc.engine.RtcEngineImpl.C46266RtcEngineImpl;
import com.p280ss.video.rtc.engine.data.ByteRtcData;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;
import org.webrtc.CameraVideoCapturer.CameraSwitchHandler;
import org.webrtc.CameraVideoCapturer.ORIENTATION_MODE;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase$$CC;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.video.rtc.engine.video.VideoCapture */
public class VideoCapture {
    private CapturerObserver localCapturerObserver = new CapturerObserver() {
        public void onCapturerStopped() {
            NativeFunctions.nativeOnCapturerStopped(VideoCapture.this.mNativeCaptureObserver);
        }

        public void onCapturerStarted(boolean z) {
            NativeFunctions.nativeOnCapturerStarted(VideoCapture.this.mNativeCaptureObserver, z);
        }

        public void onFrameCaptured(VideoFrame videoFrame) {
            NativeFunctions.nativeOnFrameCaptured(VideoCapture.this.mNativeCaptureObserver, videoFrame);
        }
    };
    private CameraEventsHandler mCameraEventsHandler;
    private WeakReference<Context> mContextRef;
    private boolean mHasFatalException;
    private int mHeight;
    public boolean mIsFrontCamera = true;
    private boolean mIsVideoCaptureInited;
    private boolean mIsVideoCaptureWorking;
    public long mNativeCaptureObserver;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    private CameraVideoCapturer mVideoCapturer;
    private int mWidth;

    public int getCameraFace() {
        if (this.mIsFrontCamera) {
            return 1;
        }
        return 0;
    }

    public void release() {
        try {
            if (this.mVideoCapturer != null) {
                stopCapture();
                this.mVideoCapturer.dispose();
                this.mVideoCapturer = null;
            }
            if (this.mSurfaceTextureHelper != null) {
                this.mSurfaceTextureHelper.dispose();
                this.mSurfaceTextureHelper = null;
            }
            this.mIsVideoCaptureInited = false;
            this.mIsVideoCaptureWorking = false;
        } catch (Exception e) {
            this.mHasFatalException = true;
            StringBuilder sb = new StringBuilder("VideoCapture release catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("VideoCapture", sb.toString());
        }
    }

    public void stopCapture() {
        try {
            LogUtil.m145281i("VideoCapture", "stopCapture...");
            if (!this.mHasFatalException && this.mVideoCapturer != null && this.mIsVideoCaptureInited && this.mIsVideoCaptureWorking) {
                try {
                    this.mVideoCapturer.stopCapture();
                    this.mIsVideoCaptureWorking = false;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e) {
            this.mHasFatalException = true;
            StringBuilder sb = new StringBuilder("VideoCapture stopCapture catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("VideoCapture", sb.toString());
        }
    }

    public void switchCamera() {
        try {
            if (!this.mHasFatalException && this.mVideoCapturer != null) {
                if (this.mIsVideoCaptureInited) {
                    if (this.mVideoCapturer instanceof CameraVideoCapturer) {
                        this.mIsFrontCamera = !this.mIsFrontCamera;
                        this.mVideoCapturer.switchCamera(new CameraSwitchHandler() {
                            public void onCameraSwitchError(String str) {
                            }

                            public void onCameraSwitchDone(boolean z) {
                                VideoCapture.this.mIsFrontCamera = z;
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("VideoCapture release catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("VideoCapture", sb.toString());
        }
    }

    VideoCapture(long j) {
        try {
            LogUtil.m145281i("VideoCapture", "VideoCapture Created...");
            this.mHasFatalException = false;
            this.mContextRef = new WeakReference<>(C46266RtcEngineImpl.getApplicationContext());
            this.mSurfaceTextureHelper = SurfaceTextureHelper.create("LocalCapturer", EglBase$$CC.create$$STATIC$$().getEglBaseContext());
            this.mNativeCaptureObserver = j;
        } catch (Exception e) {
            this.mHasFatalException = true;
            StringBuilder sb = new StringBuilder("VideoCapture constructor catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("VideoCapture", sb.toString());
        }
    }

    private CameraVideoCapturer createVideoCapturer(int i) {
        String[] deviceNames;
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true);
            for (String str : camera1Enumerator.getDeviceNames()) {
                if (camera1Enumerator.isFrontFacing(str) && i == 1) {
                    CameraVideoCapturer createCapturer = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                    if (createCapturer != null) {
                        return createCapturer;
                    }
                }
                if (camera1Enumerator.isBackFacing(str) && i == 0) {
                    CameraVideoCapturer createCapturer2 = camera1Enumerator.createCapturer(str, this.mCameraEventsHandler);
                    if (createCapturer2 != null) {
                        return createCapturer2;
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Create VideoCapture fail : ");
            sb.append(e.getMessage());
            LogUtil.m145281i("VideoCapture", sb.toString());
            return null;
        }
    }

    private void startVideoCapture(int i, int i2, int i3) {
        LogUtil.m145281i("VideoCapture", "startVideoCapture... ");
        if (this.mVideoCapturer != null) {
            try {
                this.mVideoCapturer.startCapture(i, i2, i3);
                this.mIsVideoCaptureWorking = true;
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("VideoCapture startCapture fail : ");
                sb.append(e.getMessage());
                LogUtil.m145281i("VideoCapture", sb.toString());
            }
        }
    }

    public void startCapture(int i, int i2, int i3) {
        try {
            LogUtil.m145281i("VideoCapture", "startCapture...");
            this.mWidth = i;
            this.mHeight = i2;
            if (!this.mHasFatalException && this.mContextRef != null) {
                if (this.mContextRef.get() != null) {
                    if (this.mVideoCapturer != null) {
                        this.mVideoCapturer.dispose();
                        this.mVideoCapturer = null;
                        this.mIsVideoCaptureInited = false;
                        this.mIsVideoCaptureWorking = false;
                    }
                    this.mVideoCapturer = createVideoCapturer(1);
                    if (this.mVideoCapturer != null) {
                        this.mVideoCapturer.initialize(this.mSurfaceTextureHelper, (Context) this.mContextRef.get(), this.localCapturerObserver);
                        this.mVideoCapturer.setOrientationMode(ORIENTATION_MODE.convertFromInt(ByteRtcData.instance().getOrientationMode().getValue()));
                    }
                    this.mIsVideoCaptureInited = true;
                    startVideoCapture(i, i2, i3);
                }
            }
        } catch (Exception e) {
            this.mHasFatalException = true;
            StringBuilder sb = new StringBuilder("VideoCapture startCapture catch exception.\n");
            sb.append(e.getMessage());
            LogUtil.m145278d("VideoCapture", sb.toString());
        }
    }
}
