package com.p280ss.avframework.livestreamv2.effectcamera.camera;

import android.content.Context;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.camera.CameraParams */
public class CameraParams {
    public static final String[] sCameraSceneMode = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};
    public int mCameraHardwareSupportLevel;
    public Context mContext;
    public int mHeight = 720;
    public String mSceneMode = "auto";
    public int mType = 1;
    public int mWidth = 1280;

    public boolean isValid() {
        if (this.mContext == null || this.mWidth <= 0 || this.mHeight <= 0) {
            return false;
        }
        return true;
    }

    public CameraParams(int i) {
        this.mType = i;
    }

    public CameraParams(Context context, int i) {
        this.mContext = context;
        this.mType = i;
    }

    public CameraParams(Context context, int i, int i2, int i3) {
        this.mContext = context;
        this.mType = i;
        this.mWidth = i3;
        this.mHeight = i2;
    }
}
