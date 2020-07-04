package com.p280ss.avframework.livestreamv2.effectcamera.camera;

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.AbsIESCameraProxy */
public abstract class AbsIESCameraProxy {
    private static final String TAG = "com.ss.avframework.livestreamv2.effectcamera.camera.AbsIESCameraProxy";
    protected CameraListener mClientListener;

    public void changeCamera(int i, CameraListener cameraListener) {
    }

    public Object getCamera() {
        return null;
    }

    public int getMaxExposureCompensation() {
        return 0;
    }

    public int getMinExposureCompensation() {
        return 0;
    }

    public int getNumberOfCameras() {
        return 0;
    }

    public int getOrientation() {
        return 270;
    }

    public void init(CameraParams cameraParams) {
    }

    public boolean isFlipHorizontal() {
        return true;
    }

    public boolean isSupportExposureCompensation() {
        return false;
    }

    public boolean openCamera(int i, CameraListener cameraListener) {
        return true;
    }

    public void releaseCamera() {
    }

    public void setExposureCompensation(int i) {
    }

    public boolean setFocusAreas(int i, int i2, float f, float[] fArr, int i3) {
        return false;
    }

    public void setPreviewSize(int i, int i2) {
    }

    public void startPreview(SurfaceTexture surfaceTexture) {
    }

    public int toggleFlashLight(boolean z) {
        return 0;
    }

    public List<int[]> getBestMatchCameraPreviewSize() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new int[]{720, 1280});
        return arrayList;
    }
}
