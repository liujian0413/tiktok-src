package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import org.webrtc.CameraSession.CreateSessionCallback;
import org.webrtc.CameraSession.Events;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;
import org.webrtc.CameraVideoCapturer.CameraSwitchHandler;
import org.webrtc.CameraVideoCapturer.ORIENTATION_MODE;

public class Camera2Capturer extends CameraCapturer {
    private final CameraManager cameraManager;
    private final Context context;

    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    public /* bridge */ /* synthetic */ void setOrientationMode(ORIENTATION_MODE orientation_mode) {
        super.setOrientationMode(orientation_mode);
    }

    public /* bridge */ /* synthetic */ void switchCamera(CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i, int i2, int i3) {
        super.changeCaptureFormat(i, i2, i3);
    }

    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context2, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context2, capturerObserver);
    }

    public /* bridge */ /* synthetic */ void startCapture(int i, int i2, int i3) {
        super.startCapture(i, i2, i3);
    }

    public Camera2Capturer(Context context2, String str, CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new Camera2Enumerator(context2));
        this.context = context2;
        this.cameraManager = (CameraManager) context2.getSystemService("camera");
    }

    /* access modifiers changed from: protected */
    public void createCameraSession(CreateSessionCallback createSessionCallback, Events events, Context context2, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera2Session.create(createSessionCallback, events, context2, this.cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }
}
