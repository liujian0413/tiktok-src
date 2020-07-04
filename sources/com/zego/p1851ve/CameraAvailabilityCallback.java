package com.zego.p1851ve;

import android.hardware.camera2.CameraManager.AvailabilityCallback;

/* renamed from: com.zego.ve.CameraAvailabilityCallback */
public class CameraAvailabilityCallback extends AvailabilityCallback {
    private Listener mListener;

    /* renamed from: com.zego.ve.CameraAvailabilityCallback$Listener */
    public interface Listener {
        void onCameraAvailable(String str);

        void onCameraUnavailable(String str);
    }

    public CameraAvailabilityCallback(Listener listener) {
        this.mListener = listener;
    }

    public void onCameraAvailable(String str) {
        this.mListener.onCameraAvailable(str);
    }

    public void onCameraUnavailable(String str) {
        this.mListener.onCameraUnavailable(str);
    }
}
