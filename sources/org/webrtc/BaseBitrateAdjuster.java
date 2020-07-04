package org.webrtc;

class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected int targetFps;

    BaseBitrateAdjuster() {
    }

    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    public int getCodecConfigFramerate() {
        return this.targetFps;
    }

    public void reportEncodedFrame(int i) {
    }

    public void setTargets(int i, int i2) {
        this.targetBitrateBps = i;
        this.targetFps = i2;
    }
}
