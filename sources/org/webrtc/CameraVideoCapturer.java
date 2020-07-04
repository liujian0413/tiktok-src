package org.webrtc;

import android.media.MediaRecorder;
import com.facebook.ads.AdError;
import com.taobao.android.dexposed.ClassUtils;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat.FramerateRange;

public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraConfig(int i, int i2, FramerateRange framerateRange);

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public static class CameraStatistics {
        private final Runnable cameraObserver = new Runnable() {
            public void run() {
                int round = Math.round((((float) CameraStatistics.this.frameCount) * 1000.0f) / 2000.0f);
                StringBuilder sb = new StringBuilder("Camera fps: ");
                sb.append(round);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                Logging.m150047d("CameraStatistics", sb.toString());
                if (CameraStatistics.this.frameCount == 0) {
                    CameraStatistics.this.freezePeriodCount++;
                    if (CameraStatistics.this.freezePeriodCount * AdError.SERVER_ERROR_CODE >= 4000 && CameraStatistics.this.eventsHandler != null) {
                        Logging.m150048e("CameraStatistics", "Camera freezed.");
                        if (CameraStatistics.this.surfaceTextureHelper.isTextureInUse()) {
                            CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                            return;
                        } else {
                            CameraStatistics.this.eventsHandler.onCameraFreezed("Camera failure.");
                            return;
                        }
                    }
                } else {
                    CameraStatistics.this.freezePeriodCount = 0;
                }
                CameraStatistics.this.frameCount = 0;
                CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, 2000);
            }
        };
        public final CameraEventsHandler eventsHandler;
        public int frameCount;
        public int freezePeriodCount;
        public final SurfaceTextureHelper surfaceTextureHelper;

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }

        private void checkThread() {
            if (Thread.currentThread() != this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper2, CameraEventsHandler cameraEventsHandler) {
            if (surfaceTextureHelper2 != null) {
                this.surfaceTextureHelper = surfaceTextureHelper2;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper2.getHandler().postDelayed(this.cameraObserver, 2000);
                return;
            }
            throw new IllegalArgumentException("SurfaceTextureHelper is null");
        }
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        public static ORIENTATION_MODE convertFromInt(int i) {
            return values()[i];
        }

        private ORIENTATION_MODE(int i) {
            this.value = i;
        }
    }

    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void setOrientationMode(ORIENTATION_MODE orientation_mode);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);
}
