package org.webrtc;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.Arrays;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraSession.FailureType;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;
import org.webrtc.CameraVideoCapturer.CameraStatistics;
import org.webrtc.CameraVideoCapturer.CameraSwitchHandler;
import org.webrtc.CameraVideoCapturer.MediaRecorderHandler;
import org.webrtc.CameraVideoCapturer.ORIENTATION_MODE;

abstract class CameraCapturer implements CameraVideoCapturer {
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public final Events cameraSessionEventsHandler = new Events() {
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (CameraCapturer.this.currentSession != null) {
                    Logging.m150051w("CameraCapturer", "onCameraOpening while session was open.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                }
            }
        }

        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                    CameraCapturer.this.eventsHandler.onCameraClosed();
                } else {
                    Logging.m150047d("CameraCapturer", "onCameraClosed from another session.");
                }
            }
        }

        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m150051w("CameraCapturer", "onCameraDisconnected from another session.");
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraDisconnected();
                CameraCapturer.this.stopCapture();
            }
        }

        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    StringBuilder sb = new StringBuilder("onCameraError from another session: ");
                    sb.append(str);
                    Logging.m150051w("CameraCapturer", sb.toString());
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraError(str);
                CameraCapturer.this.stopCapture();
            }
        }

        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.m150051w("CameraCapturer", "onFrameCaptured from another session.");
                    return;
                }
                if (!CameraCapturer.this.firstFrameObserved) {
                    CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                    CameraCapturer.this.firstFrameObserved = true;
                }
                CameraCapturer.this.cameraStatistics.addFrame();
                CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
            }
        }

        public void onCameraConfig(int i, int i2, FramerateRange framerateRange) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.eventsHandler.onCameraConfig(i, i2, framerateRange);
            }
        }
    };
    public CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public final CreateSessionCallback createSessionCallback = new CreateSessionCallback() {
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            StringBuilder sb = new StringBuilder("Create session done. Switch state: ");
            sb.append(CameraCapturer.this.switchState);
            Logging.m150047d("CameraCapturer", sb.toString());
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != null) {
                    try {
                        cameraSession.setOrientationMode(CameraCapturer.this.mOrientationMode);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer.this.sessionOpening = false;
                CameraCapturer.this.currentSession = cameraSession;
                CameraCapturer.this.cameraStatistics = new CameraStatistics(CameraCapturer.this.surfaceHelper, CameraCapturer.this.eventsHandler);
                CameraCapturer.this.firstFrameObserved = false;
                CameraCapturer.this.stateLock.notifyAll();
                if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    if (CameraCapturer.this.switchEventsHandler != null) {
                        CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    CameraCapturer.this.switchCameraInternal(CameraCapturer.this.switchEventsHandler);
                }
            }
        }

        public void onFailure(FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer.this.openAttemptsRemaining--;
                if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                    StringBuilder sb = new StringBuilder("Opening camera failed, passing: ");
                    sb.append(str);
                    Logging.m150051w("CameraCapturer", sb.toString());
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState != SwitchState.IDLE) {
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                    }
                    if (failureType == FailureType.DISCONNECTED) {
                        CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraError(str);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Opening camera failed, retry: ");
                    sb2.append(str);
                    Logging.m150051w("CameraCapturer", sb2.toString());
                    CameraCapturer.this.createSessionInternal(VETransitionFilterParam.TransitionDuration_DEFAULT);
                }
            }
        }
    };
    public CameraSession currentSession;
    public final CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public ORIENTATION_MODE mOrientationMode = ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private NativeLibraryLoader nativeLibraryLoader = new DefaultLoader();
    private String nativeLibraryName = "bytertc";
    public int openAttemptsRemaining;
    public final Runnable openCameraTimeoutRunnable = new Runnable() {
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    public boolean sessionOpening;
    public final Object stateLock = new Object();
    public SurfaceTextureHelper surfaceHelper;
    public CameraSwitchHandler switchEventsHandler;
    public SwitchState switchState = SwitchState.IDLE;
    public final Handler uiThreadHandler;
    public int width;

    enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer$$CC.addMediaRecorderToCamera(this, mediaRecorder, mediaRecorderHandler);
    }

    /* access modifiers changed from: protected */
    public abstract void createCameraSession(CreateSessionCallback createSessionCallback2, Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    public boolean isScreencast() {
        return false;
    }

    public void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer$$CC.removeMediaRecorderFromCamera(this, mediaRecorderHandler);
    }

    public void dispose() {
        Logging.m150047d("CameraCapturer", "dispose");
        stopCapture();
    }

    /* access modifiers changed from: protected */
    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            Logging.m150048e("CameraCapturer", "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    public void printStackTrace() {
        Thread thread;
        if (this.cameraThreadHandler != null) {
            thread = this.cameraThreadHandler.getLooper().getThread();
        } else {
            thread = null;
        }
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.m150047d("CameraCapturer", "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m150047d("CameraCapturer", stackTraceElement.toString());
                }
            }
        }
    }

    public void stopCapture() {
        Logging.m150047d("CameraCapturer", "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.m150047d("CameraCapturer", "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.m150051w("CameraCapturer", "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.m150047d("CameraCapturer", "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() {
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.m150047d("CameraCapturer", "Stop capture: No session open");
            }
        }
        Logging.m150047d("CameraCapturer", "Stop capture done");
    }

    public void setOrientationMode(ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, (long) (i + VideoCacheTTnetProxyTimeoutExperiment.DEFAULT));
        this.cameraThreadHandler.postDelayed(new Runnable() {
            public void run() {
                CameraCapturer.this.createCameraSession(CameraCapturer.this.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, (long) i);
    }

    public void switchCamera(final CameraSwitchHandler cameraSwitchHandler) {
        Logging.m150047d("CameraCapturer", "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
            }
        });
    }

    public void switchCameraInternal(CameraSwitchHandler cameraSwitchHandler) {
        Logging.m150047d("CameraCapturer", "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length < 2) {
            if (cameraSwitchHandler != null) {
                cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
            }
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
            } else if (this.sessionOpening || this.currentSession != null) {
                this.switchEventsHandler = cameraSwitchHandler;
                if (this.sessionOpening) {
                    this.switchState = SwitchState.PENDING;
                    return;
                }
                this.switchState = SwitchState.IN_PROGRESS;
                Logging.m150047d("CameraCapturer", "switchCamera: Stopping session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() {
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
                this.sessionOpening = true;
                this.openAttemptsRemaining = 1;
                createSessionInternal(0);
                Logging.m150047d("CameraCapturer", "switchCamera done");
            } else {
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
            }
        }
    }

    private void reportCameraSwitchError(String str, CameraSwitchHandler cameraSwitchHandler) {
        Logging.m150048e("CameraCapturer", str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        Handler handler;
        this.applicationContext = context;
        this.capturerObserver = capturerObserver2;
        this.surfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            handler = null;
        } else {
            handler = surfaceTextureHelper.getHandler();
        }
        this.cameraThreadHandler = handler;
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("changeCaptureFormat: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("@");
        sb.append(i3);
        Logging.m150047d("CameraCapturer", sb.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public void startCapture(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("startCapture: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("@");
        sb.append(i3);
        Logging.m150047d("CameraCapturer", sb.toString());
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (!this.sessionOpening) {
                    if (this.currentSession == null) {
                        this.width = i;
                        this.height = i2;
                        this.framerate = i3;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 3;
                        createSessionInternal(0);
                        return;
                    }
                }
                Logging.m150051w("CameraCapturer", "Session already open");
                return;
            }
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    public CameraCapturer(String str, CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator2) {
        if (cameraEventsHandler == null) {
            cameraEventsHandler = new CameraEventsHandler() {
                public void onCameraClosed() {
                }

                public void onCameraConfig(int i, int i2, FramerateRange framerateRange) {
                }

                public void onCameraDisconnected() {
                }

                public void onCameraError(String str) {
                }

                public void onCameraFreezed(String str) {
                }

                public void onCameraOpening(String str) {
                }

                public void onFirstFrameAvailable() {
                }
            };
        }
        NativeLibrary.initialize(this.nativeLibraryLoader, this.nativeLibraryName);
        this.eventsHandler = cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator2;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator2.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        } else if (!Arrays.asList(deviceNames).contains(this.cameraName)) {
            StringBuilder sb = new StringBuilder("Camera name ");
            sb.append(this.cameraName);
            sb.append(" does not match any known camera device.");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
