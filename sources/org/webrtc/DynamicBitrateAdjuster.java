package org.webrtc;

class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    DynamicBitrateAdjuster() {
    }

    private double getBitrateAdjustmentScale() {
        double d = (double) this.bitrateAdjustmentScaleExp;
        Double.isNaN(d);
        return Math.pow(4.0d, d / 20.0d);
    }

    public int getAdjustedBitrateBps() {
        double d = (double) this.targetBitrateBps;
        double bitrateAdjustmentScale = getBitrateAdjustmentScale();
        Double.isNaN(d);
        return (int) (d * bitrateAdjustmentScale);
    }

    public void reportEncodedFrame(int i) {
        if (this.targetFps != 0) {
            double d = (double) this.targetBitrateBps;
            Double.isNaN(d);
            double d2 = d / 8.0d;
            double d3 = (double) this.targetFps;
            Double.isNaN(d3);
            double d4 = d2 / d3;
            double d5 = this.deviationBytes;
            double d6 = (double) i;
            Double.isNaN(d6);
            this.deviationBytes = d5 + (d6 - d4);
            double d7 = this.timeSinceLastAdjustmentMs;
            double d8 = (double) this.targetFps;
            Double.isNaN(d8);
            this.timeSinceLastAdjustmentMs = d7 + (1000.0d / d8);
            double d9 = (double) this.targetBitrateBps;
            Double.isNaN(d9);
            double d10 = d9 / 8.0d;
            double d11 = 3.0d * d10;
            this.deviationBytes = Math.min(this.deviationBytes, d11);
            this.deviationBytes = Math.max(this.deviationBytes, -d11);
            if (this.timeSinceLastAdjustmentMs > 3000.0d) {
                if (this.deviationBytes > d10) {
                    this.bitrateAdjustmentScaleExp -= (int) ((this.deviationBytes / d10) + 0.5d);
                    this.bitrateAdjustmentScaleExp = Math.max(this.bitrateAdjustmentScaleExp, -20);
                    this.deviationBytes = d10;
                } else {
                    double d12 = -d10;
                    if (this.deviationBytes < d12) {
                        this.bitrateAdjustmentScaleExp += (int) (((-this.deviationBytes) / d10) + 0.5d);
                        this.bitrateAdjustmentScaleExp = Math.min(this.bitrateAdjustmentScaleExp, 20);
                        this.deviationBytes = d12;
                    }
                }
                this.timeSinceLastAdjustmentMs = 0.0d;
            }
        }
    }

    public void setTargets(int i, int i2) {
        if (this.targetBitrateBps > 0 && i < this.targetBitrateBps) {
            double d = this.deviationBytes;
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = d * d2;
            double d4 = (double) this.targetBitrateBps;
            Double.isNaN(d4);
            this.deviationBytes = d3 / d4;
        }
        super.setTargets(i, i2);
    }
}
