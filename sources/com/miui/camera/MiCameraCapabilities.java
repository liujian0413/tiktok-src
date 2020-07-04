package com.miui.camera;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import java.util.HashMap;
import java.util.Map;

public final class MiCameraCapabilities {

    /* renamed from: a */
    public static Map<TAG, Class> f50288a;

    public enum TAG {
        VIDEO_END("org.quic.camera.recording.endOfStream");
        
        private final String mName;

        public final String toString() {
            return this.mName;
        }

        public final <T> Key<T> toCaptureRequestKey() {
            return C18611c.m61044a(this.mName, (Class) MiCameraCapabilities.f50288a.get(this));
        }

        public final <T> CaptureResult.Key<T> toCaptureResultKey() {
            return C18611c.m61045b(this.mName, (Class) MiCameraCapabilities.f50288a.get(this));
        }

        private TAG(String str) {
            this.mName = str;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f50288a = hashMap;
        hashMap.put(TAG.VIDEO_END, Byte.TYPE);
    }

    /* renamed from: a */
    public static boolean m61032a(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        if (iArr.length == 1 && iArr[0] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m61033b(CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        if (iArr.length == 1 && iArr[0] == 0) {
            return false;
        }
        return true;
    }
}
