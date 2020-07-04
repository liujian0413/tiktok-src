package com.p280ss.android.medialib.p884qr;

/* renamed from: com.ss.android.medialib.qr.ScanSettings */
public class ScanSettings {
    public int buildChainFlag = 1;
    public String detectModelDir;
    public float detectRectHeight;
    public float detectRectLeft;
    public float detectRectTop;
    public float detectRectWidth;
    public long detectRequirement = 65536;
    public boolean enableDetectRect;
    public int height = -1;
    public int width = -1;

    public int getBuildChainFlag() {
        return this.buildChainFlag;
    }

    public String getDetectModelDir() {
        return this.detectModelDir;
    }

    public long getDetectRequirement() {
        return this.detectRequirement;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
