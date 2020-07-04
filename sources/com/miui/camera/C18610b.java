package com.miui.camera;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import com.miui.camera.MiCameraCapabilities.TAG;

/* renamed from: com.miui.camera.b */
public class C18610b {

    /* renamed from: a */
    private static final String f50294a = "b";

    /* renamed from: a */
    public static boolean m61043a(Builder builder) {
        Integer num = (Integer) builder.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m61042a(Builder builder, boolean z) {
        new StringBuilder("recordingEndOfStream: ").append("0x1");
        builder.set(TAG.VIDEO_END.toCaptureRequestKey(), Byte.valueOf(1));
    }

    /* renamed from: a */
    public static void m61041a(Builder builder, CameraCharacteristics cameraCharacteristics, boolean z) {
        if (builder != null) {
            boolean b = MiCameraCapabilities.m61033b(cameraCharacteristics);
            boolean a = MiCameraCapabilities.m61032a(cameraCharacteristics);
            if (b) {
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(z ? 1 : 0));
            }
            if (a) {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            }
        }
    }
}
