package com.p280ss.avframework.livestreamv2.effectcamera.camera;

import android.graphics.SurfaceTexture;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraInterface */
public interface IESCameraInterface {
    public static final int[] CameraHWLevelAndroid2VE = {1, 2, 0, 3};
    public static final int[] CameraHWLevelVE2Android = {2, 0, 1, 3};

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraInterface$FlashMode */
    public @interface FlashMode {
    }

    /* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraInterface$ZoomListener */
    public interface ZoomListener {
        boolean enablbeSmooth();

        void onChange(int i, float f, boolean z);

        void onZoomSupport(int i, boolean z, boolean z2, float f, List<Integer> list);
    }

    void cancelAutoFocus();

    void changeCamera(int i, CameraListener cameraListener);

    void close();

    boolean currentValid();

    void enableTorch(boolean z);

    int getCameraPosition();

    float getMaxZoom();

    int[] getPreviewWH();

    List<int[]> getSupportedPreviewSizes();

    void init(CameraParams cameraParams);

    int[] initCameraParam();

    boolean isTorchSupported();

    boolean isVideoStabilizationSupported();

    boolean open(int i, CameraListener cameraListener);

    int setCameraPosition(int i);

    boolean setFocusAreas(View view, float[] fArr, int i);

    int setOrientationDegrees(int i);

    boolean setVideoStabilization(boolean z);

    void setZoom(float f);

    void setZoomListener(ZoomListener zoomListener);

    void startPreview(SurfaceTexture surfaceTexture);

    void startZoom(float f);

    void stopZoom();

    boolean switchFlashMode(int i);
}
