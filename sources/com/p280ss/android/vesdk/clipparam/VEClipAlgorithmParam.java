package com.p280ss.android.vesdk.clipparam;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipAlgorithmParam */
public class VEClipAlgorithmParam {
    public static int BINGO_EFFECT_NULL = 0;
    public static int BINGO_EFFECT_ZOOMIN = 1;
    public static int BINGO_EFFECT_ZOOMOUT = 2;
    public int bingoEffect;
    public int index;
    public int range;
    public int rotate;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder sb = new StringBuilder("index: ");
        sb.append(this.index);
        sb.append(" trimIn: ");
        sb.append(this.trimIn);
        sb.append(" trimOut: ");
        sb.append(this.trimOut);
        sb.append(" range: ");
        sb.append(this.range);
        sb.append(" bingoEffect: ");
        sb.append(this.bingoEffect);
        sb.append("rotate: ");
        sb.append(this.rotate);
        return sb.toString();
    }
}
