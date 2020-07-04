package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraSession.FailureType;
import org.webrtc.CameraVideoCapturer.ORIENTATION_MODE;

class Camera2Session implements CameraSession {
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());
    public static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT, 50);
    private final Context applicationContext;
    public final CreateSessionCallback callback;
    public CameraCharacteristics cameraCharacteristics;
    public CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    public int cameraOrientation;
    public final Handler cameraThreadHandler;
    public CaptureFormat captureFormat;
    public CameraCaptureSession captureSession;
    public final long constructionTimeNs;
    public final Events events;
    public boolean firstFrameReported;
    public int fpsUnitFactor;
    private final int framerate;
    private final int height;
    public boolean isCameraFrontFacing;
    public SessionState state = SessionState.RUNNING;
    public Surface surface;
    public final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;

    static class CameraCaptureCallback extends CaptureCallback {
        private CameraCaptureCallback() {
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            StringBuilder sb = new StringBuilder("Capture failed: ");
            sb.append(captureFailure);
            Logging.m150047d("Camera2Session", sb.toString());
        }
    }

    class CameraStateCallback extends StateCallback {
        private CameraStateCallback() {
        }

        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m150047d("Camera2Session", "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        private String getErrorDescription(int i) {
            switch (i) {
                case 1:
                    return "Camera device is in use already.";
                case 2:
                    return "Camera device could not be opened because there are too many other open camera devices.";
                case 3:
                    return "Camera device could not be opened due to a device policy.";
                case 4:
                    return "Camera device has encountered a fatal error.";
                case 5:
                    return "Camera service has encountered a fatal error.";
                default:
                    StringBuilder sb = new StringBuilder("Unknown camera error: ");
                    sb.append(i);
                    return sb.toString();
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            boolean z;
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.captureSession != null || Camera2Session.this.state == SessionState.STOPPED) {
                z = false;
            } else {
                z = true;
            }
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z) {
                Camera2Session.this.callback.onFailure(FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m150047d("Camera2Session", "Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                cameraDevice.createCaptureSession(Arrays.asList(new Surface[]{Camera2Session.this.surface}), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session = Camera2Session.this;
                StringBuilder sb = new StringBuilder("Failed to create capture session. ");
                sb.append(e);
                camera2Session.reportError(sb.toString());
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }
    }

    class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        private void chooseFocusMode(Builder builder) {
            for (int i : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
                    Logging.m150047d("Camera2Session", "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.m150047d("Camera2Session", "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                        Logging.m150047d("Camera2Session", "Using optical stabilization.");
                        return;
                    }
                }
            }
            for (int i2 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                    Logging.m150047d("Camera2Session", "Using video stabilization.");
                    return;
                }
            }
            Logging.m150047d("Camera2Session", "Stabilization not available.");
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$onConfigured$0$Camera2Session$CaptureSessionCallback(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Logging.m150047d("Camera2Session", "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession$$CC.createTextureBufferWithModifiedTransformMatrix$$STATIC$$((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m150047d("Camera2Session", "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                Builder createCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
                chooseStabilizationMode(createCaptureRequest);
                chooseFocusMode(createCaptureRequest);
                Camera2Session.this.events.onCameraConfig(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height, Camera2Session.this.captureFormat.framerate);
                createCaptureRequest.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new Camera2Session$CaptureSessionCallback$$Lambda$0(this));
                Logging.m150047d("Camera2Session", "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e) {
                Camera2Session camera2Session = Camera2Session.this;
                StringBuilder sb = new StringBuilder("Failed to start capture request. ");
                sb.append(e);
                camera2Session.reportError(sb.toString());
            }
        }
    }

    enum SessionState {
        RUNNING,
        STOPPED
    }

    public void setOrientationMode(ORIENTATION_MODE orientation_mode) {
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public int getFrameOrientation() {
        int deviceOrientation$$STATIC$$ = CameraSession$$CC.getDeviceOrientation$$STATIC$$(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation$$STATIC$$ = 360 - deviceOrientation$$STATIC$$;
        }
        return (this.cameraOrientation + deviceOrientation$$STATIC$$) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        StringBuilder sb = new StringBuilder("Opening camera ");
        sb.append(this.cameraId);
        Logging.m150047d("Camera2Session", sb.toString());
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (CameraAccessException e) {
            StringBuilder sb2 = new StringBuilder("Failed to open camera: ");
            sb2.append(e);
            reportError(sb2.toString());
        }
    }

    public void stop() {
        StringBuilder sb = new StringBuilder("Stop camera2 session on camera ");
        sb.append(this.cameraId);
        Logging.m150047d("Camera2Session", sb.toString());
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            this.state = SessionState.STOPPED;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }

    public void stopInternal() {
        Logging.m150047d("Camera2Session", "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        if (this.captureSession != null) {
            this.captureSession.close();
            this.captureSession = null;
        }
        if (this.surface != null) {
            this.surface.release();
            this.surface = null;
        }
        if (this.cameraDevice != null) {
            this.cameraDevice.close();
            this.cameraDevice = null;
        }
        Logging.m150047d("Camera2Session", "Stop done");
    }

    private void start() {
        boolean z;
        checkIsOnCameraThread();
        Logging.m150047d("Camera2Session", "start");
        try {
            this.cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraOrientation = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            if (((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.isCameraFrontFacing = z;
            findCaptureFormat();
            openCamera();
        } catch (CameraAccessException e) {
            StringBuilder sb = new StringBuilder("getCameraCharacteristics(): ");
            sb.append(e.getMessage());
            reportError(sb.toString());
        }
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        this.fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        List convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, this.fpsUnitFactor);
        List supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        StringBuilder sb = new StringBuilder("Available preview sizes: ");
        sb.append(supportedSizes);
        Logging.m150047d("Camera2Session", sb.toString());
        StringBuilder sb2 = new StringBuilder("Available fps ranges: ");
        sb2.append(convertFramerates);
        Logging.m150047d("Camera2Session", sb2.toString());
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        StringBuilder sb3 = new StringBuilder("Using capture format: ");
        sb3.append(this.captureFormat);
        Logging.m150047d("Camera2Session", sb3.toString());
    }

    public void reportError(String str) {
        boolean z;
        checkIsOnCameraThread();
        StringBuilder sb = new StringBuilder("Error: ");
        sb.append(str);
        Logging.m150048e("Camera2Session", sb.toString());
        if (this.captureSession != null || this.state == SessionState.STOPPED) {
            z = false;
        } else {
            z = true;
        }
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    public static void create(CreateSessionCallback createSessionCallback, Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events2, context, cameraManager2, surfaceTextureHelper2, str, i, i2, i3);
    }

    private Camera2Session(CreateSessionCallback createSessionCallback, Events events2, Context context, CameraManager cameraManager2, SurfaceTextureHelper surfaceTextureHelper2, String str, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("Create new camera2 session on camera ");
        sb.append(str);
        Logging.m150047d("Camera2Session", sb.toString());
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events2;
        this.applicationContext = context;
        this.cameraManager = cameraManager2;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        start();
    }
}
