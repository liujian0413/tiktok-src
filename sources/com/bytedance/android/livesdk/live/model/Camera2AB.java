package com.bytedance.android.livesdk.live.model;

import com.google.gson.p276a.C6593c;

public class Camera2AB {
    @C6593c(mo15949a = "camera_hw_level")
    private int cameraHWLevel;
    @C6593c(mo15949a = "camera_type")
    private int cameraType = 1;

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public Camera2AB() {
    }

    public void setCameraHWLevel(int i) {
        this.cameraHWLevel = i;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public Camera2AB(int i, int i2) {
        this.cameraType = i;
        this.cameraHWLevel = i2;
    }
}
