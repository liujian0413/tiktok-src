package com.p280ss.android.ugc.lib.video.bitrate.regulator;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.Shift */
public class Shift implements Serializable, Comparable<Shift> {
    private static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    public double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i2 * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shift{mRate=");
        sb.append(this.mRate);
        sb.append(", mDownThreshold=");
        sb.append(this.mDownThreshold);
        sb.append(", mUpThreshold=");
        sb.append(this.mUpThreshold);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Shift shift) {
        return Double.compare(this.mRate, shift.mRate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shift)) {
            return false;
        }
        Shift shift = (Shift) obj;
        if (Double.compare(shift.mRate, this.mRate) == 0 && Double.compare(shift.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(shift.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public Shift(double d, double d2, double d3) {
        this.mRate = d;
        this.mDownThreshold = d2;
        this.mUpThreshold = d3;
    }
}
