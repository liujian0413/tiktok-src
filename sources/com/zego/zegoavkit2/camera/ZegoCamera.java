package com.zego.zegoavkit2.camera;

public class ZegoCamera {
    public static boolean setCamExposureCompensation(float f, int i) {
        return ZegoCameraJNI.setCamExposureCompensation(f, i);
    }

    public static boolean setCamExposureMode(ZegoCameraExposureMode zegoCameraExposureMode, int i) {
        return ZegoCameraJNI.setCamExposureMode(zegoCameraExposureMode.getCode(), i);
    }

    public static boolean setCamFocusMode(ZegoCameraFocusMode zegoCameraFocusMode, int i) {
        return ZegoCameraJNI.setCamFocusMode(zegoCameraFocusMode.getCode(), i);
    }

    public static boolean setCamExposurePoint(float f, float f2, int i) {
        return ZegoCameraJNI.setCamExposurePoint(f, f2, i);
    }

    public static boolean setCamFocusPoint(float f, float f2, int i) {
        return ZegoCameraJNI.setCamFocusPoint(f, f2, i);
    }
}
