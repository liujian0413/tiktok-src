package org.webrtc;

class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    FramerateBitrateAdjuster() {
    }

    public int getCodecConfigFramerate() {
        return 30;
    }

    public void setTargets(int i, int i2) {
        if (this.targetFps == 0) {
            i2 = 30;
        }
        super.setTargets(i, i2);
        this.targetBitrateBps = (this.targetBitrateBps * 30) / this.targetFps;
    }
}
