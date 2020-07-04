package org.webrtc;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.ErrorCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraSession.FailureType;
import org.webrtc.CameraVideoCapturer.ORIENTATION_MODE;
import org.webrtc.VideoFrame.Buffer;

class Camera1Session implements CameraSession {
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT, 50);
    private static int sMinFramerate;
    private final Context applicationContext;
    public final Camera camera;
    private final int cameraId;
    public final Handler cameraThreadHandler;
    public final CaptureFormat captureFormat;
    private final boolean captureToTexture;
    public final long constructionTimeNs;
    public final Events events;
    public boolean firstFrameReported;
    private final CameraInfo info;
    private int mDisplayRotationCheckCounter;
    private int mLastDisplayRotation;
    private int mLastValidDisplayRotation;
    private ORIENTATION_MODE mOrientation = ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private final int scaleHeight;
    private final int scaleWidth;
    public SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;

    enum SessionState {
        RUNNING,
        STOPPED
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new PreviewCallback() {
            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void lambda$onPreviewFrame$0$Camera1Session$2(byte[] bArr) {
                if (Camera1Session.this.state == SessionState.RUNNING) {
                    Camera1Session.this.camera.addCallbackBuffer(bArr);
                }
            }

            /* access modifiers changed from: 0000 */
            public final /* synthetic */ void lambda$onPreviewFrame$1$Camera1Session$2(byte[] bArr) {
                Camera1Session.this.cameraThreadHandler.post(new Camera1Session$2$$Lambda$1(this, bArr));
            }

            public void onPreviewFrame(byte[] bArr, Camera camera) {
                Camera1Session.this.checkIsOnCameraThread();
                if (camera != Camera1Session.this.camera) {
                    Logging.m150048e("Camera1Session", "Callback from a different camera. This should never happen.");
                } else if (Camera1Session.this.state != SessionState.RUNNING) {
                    Logging.m150047d("Camera1Session", "Bytebuffer frame captured but camera is no longer running.");
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                    if (!Camera1Session.this.firstFrameReported) {
                        Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                        Camera1Session.this.firstFrameReported = true;
                    }
                    VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new Camera1Session$2$$Lambda$0(this, bArr)), Camera1Session.this.getFrameOrientation(), nanos);
                    Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                    videoFrame.release();
                }
            }
        });
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new Camera1Session$$Lambda$0(this));
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    private void startCapturing() {
        Logging.m150047d("Camera1Session", "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new ErrorCallback() {
            public void onError(int i, Camera camera) {
                String str;
                if (i == 100) {
                    str = "Camera server died!";
                } else {
                    StringBuilder sb = new StringBuilder("Camera error: ");
                    sb.append(i);
                    str = sb.toString();
                }
                Logging.m150048e("Camera1Session", str);
                Camera1Session.this.stopInternal();
                if (i == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, str);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    public void stop() {
        StringBuilder sb = new StringBuilder("Stop camera1 session on camera ");
        sb.append(this.cameraId);
        Logging.m150047d("Camera1Session", sb.toString());
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public void stopInternal() {
        Logging.m150047d("Camera1Session", "Stop internal");
        checkIsOnCameraThread();
        if (this.state == SessionState.STOPPED) {
            Logging.m150047d("Camera1Session", "Camera is already stopped");
            return;
        }
        this.state = SessionState.STOPPED;
        this.surfaceTextureHelper.stopListening();
        this.camera.stopPreview();
        this.camera.release();
        this.events.onCameraClosed(this);
        Logging.m150047d("Camera1Session", "Stop done");
    }

    public int getFrameOrientation() {
        int deviceOrientation$$STATIC$$ = CameraSession$$CC.getDeviceOrientation$$STATIC$$(this.applicationContext);
        int i = this.mLastValidDisplayRotation;
        if (this.mDisplayRotationCheckCounter > 0) {
            this.mDisplayRotationCheckCounter--;
            i = this.mLastValidDisplayRotation;
        } else if (this.mDisplayRotationCheckCounter == 0) {
            if (!isInForeground(this.applicationContext)) {
                i = this.mLastValidDisplayRotation;
            } else {
                i = deviceOrientation$$STATIC$$;
            }
            this.mDisplayRotationCheckCounter = -1;
        } else if (deviceOrientation$$STATIC$$ != this.mLastDisplayRotation) {
            if (sMinFramerate > 0) {
                this.mDisplayRotationCheckCounter = sMinFramerate;
            } else {
                this.mDisplayRotationCheckCounter = 5;
            }
        }
        this.mLastDisplayRotation = deviceOrientation$$STATIC$$;
        this.mLastValidDisplayRotation = i;
        if (this.info.facing == 0) {
            i = 360 - i;
        }
        return (this.info.orientation + i) % 360;
    }

    public void setOrientationMode(ORIENTATION_MODE orientation_mode) {
        this.mOrientation = orientation_mode;
    }

    private static boolean isInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String packageName = context.getPackageName();
        List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$listenForTextureFrames$0$Camera1Session(VideoFrame videoFrame) {
        Buffer buffer;
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.m150047d("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        if (this.scaleWidth == 0 || this.scaleHeight == 0 || (this.captureFormat.width == this.scaleWidth && this.captureFormat.height == this.scaleHeight)) {
            buffer = videoFrame.getBuffer().cropAndScale(0, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else if (((float) this.captureFormat.width) / ((float) this.captureFormat.height) > ((float) this.scaleWidth) / ((float) this.scaleHeight)) {
            buffer = videoFrame.getBuffer().cropAndScale(((int) (((float) this.captureFormat.width) - ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)))) / 2, 0, (int) ((((float) this.scaleWidth) / ((float) this.scaleHeight)) * ((float) this.captureFormat.height)), this.captureFormat.height, this.scaleWidth, this.scaleHeight);
        } else {
            buffer = videoFrame.getBuffer().cropAndScale(0, ((int) (((float) this.captureFormat.height) - ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)))) / 2, this.captureFormat.width, (int) ((((float) this.scaleHeight) / ((float) this.scaleWidth)) * ((float) this.captureFormat.width)), this.scaleWidth, this.scaleHeight);
        }
        videoFrame.getBuffer().release();
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) buffer;
        if (this.info.facing != 1) {
            z = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(CameraSession$$CC.createTextureBufferWithModifiedTransformMatrix$$STATIC$$(textureBufferImpl, z, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private static Size findClosestPictureSize(Parameters parameters, int i, int i2) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    private static CaptureFormat findClosestCaptureFormat(Parameters parameters, int i, int i2, int i3) {
        List convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        StringBuilder sb = new StringBuilder("Available fps ranges: ");
        sb.append(convertFramerates);
        Logging.m150047d("Camera1Session", sb.toString());
        FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static void updateCameraParameters(Camera camera2, Parameters parameters, CaptureFormat captureFormat2, Size size, boolean z) {
        List supportedFocusModes = parameters.getSupportedFocusModes();
        parameters.setPreviewFpsRange(captureFormat2.framerate.min, captureFormat2.framerate.max);
        parameters.setPreviewSize(captureFormat2.width, captureFormat2.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            captureFormat2.getClass();
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera2.setParameters(parameters);
    }

    public static void create(CreateSessionCallback createSessionCallback, Events events2, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, int i2, int i3, int i4) {
        CreateSessionCallback createSessionCallback2 = createSessionCallback;
        boolean z2 = z;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        long nanoTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Open camera ");
        sb.append(i5);
        Logging.m150047d("Camera1Session", sb.toString());
        events2.onCameraOpening();
        try {
            Camera open = Camera.open(i);
            if (open == null) {
                FailureType failureType = FailureType.ERROR;
                StringBuilder sb2 = new StringBuilder("android.hardware.Camera.open returned null for camera id = ");
                sb2.append(i5);
                createSessionCallback2.onFailure(failureType, sb2.toString());
                return;
            }
            try {
                open.setPreviewTexture(surfaceTextureHelper2.getSurfaceTexture());
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(i5, cameraInfo);
                try {
                    Parameters parameters = open.getParameters();
                    CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i6, i7, i4);
                    Size findClosestPictureSize = findClosestPictureSize(parameters, i6, i7);
                    events2.onCameraConfig(findClosestPictureSize.width, findClosestPictureSize.height, findClosestCaptureFormat.framerate);
                    sMinFramerate = findClosestCaptureFormat.framerate.min / 1000;
                    updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize, z2);
                    if (!z2) {
                        int frameSize = findClosestCaptureFormat.frameSize();
                        for (int i8 = 0; i8 < 3; i8++) {
                            open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                        }
                    }
                    open.setDisplayOrientation(0);
                    Camera1Session camera1Session = r2;
                    Camera1Session camera1Session2 = new Camera1Session(events2, z, context, surfaceTextureHelper2, i, open, cameraInfo, findClosestCaptureFormat, nanoTime, i2, i3);
                    createSessionCallback2.onDone(camera1Session);
                } catch (RuntimeException e) {
                    open.release();
                    createSessionCallback2.onFailure(FailureType.ERROR, e.getMessage());
                }
            } catch (IOException | RuntimeException e2) {
                open.release();
                createSessionCallback2.onFailure(FailureType.ERROR, e2.getMessage());
            }
        } catch (RuntimeException e3) {
            createSessionCallback2.onFailure(FailureType.ERROR, e3.getMessage());
        }
    }

    private Camera1Session(Events events2, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper2, int i, Camera camera2, CameraInfo cameraInfo, CaptureFormat captureFormat2, long j, int i2, int i3) {
        StringBuilder sb = new StringBuilder("Create new camera1 session on camera ");
        sb.append(i);
        Logging.m150047d("Camera1Session", sb.toString());
        this.cameraThreadHandler = new Handler();
        this.events = events2;
        this.captureToTexture = z;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = i;
        this.camera = camera2;
        this.info = cameraInfo;
        this.captureFormat = captureFormat2;
        this.constructionTimeNs = j;
        this.scaleWidth = i2;
        this.scaleHeight = i3;
        surfaceTextureHelper2.setTextureSize(captureFormat2.width, captureFormat2.height);
        startCapturing();
    }
}
