package com.google.common.math;

import com.google.common.base.C17430i;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class PairedStats implements Serializable {
    private static final long serialVersionUID = 0;
    public final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    private static double ensureInUnitRange(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private static double ensurePositive(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public final Stats xStats() {
        return this.xStats;
    }

    public final Stats yStats() {
        return this.yStats;
    }

    public final long count() {
        return this.xStats.count();
    }

    public final int hashCode() {
        return C17434j.m57954a(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public final double populationCovariance() {
        boolean z;
        if (count() != 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        double d = this.sumOfProductsOfDeltas;
        double count = (double) count();
        Double.isNaN(count);
        return d / count;
    }

    public final double sampleCovariance() {
        boolean z;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        double d = this.sumOfProductsOfDeltas;
        double count = (double) (count() - 1);
        Double.isNaN(count);
        return d / count;
    }

    public final byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(order);
        this.yStats.writeTo(order);
        order.putDouble(this.sumOfProductsOfDeltas);
        return order.array();
    }

    public final C18121d leastSquaresFit() {
        boolean z;
        boolean z2 = false;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return C18121d.m59893a();
        }
        double d = this.xStats.sumOfSquaresOfDeltas;
        if (d <= 0.0d) {
            if (this.yStats.sumOfSquaresOfDeltas > 0.0d) {
                z2 = true;
            }
            C17439m.m57981b(z2);
            return C18121d.m59894a(this.xStats.mean());
        } else if (this.yStats.sumOfSquaresOfDeltas > 0.0d) {
            return C18121d.m59892a(this.xStats.mean(), this.yStats.mean()).mo46762a(this.sumOfProductsOfDeltas / d);
        } else {
            return C18121d.m59895b(this.yStats.mean());
        }
    }

    public final double pearsonsCorrelationCoefficient() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (count() > 1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double d = xStats().sumOfSquaresOfDeltas;
        double d2 = yStats().sumOfSquaresOfDeltas;
        if (d > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57981b(z2);
        if (d2 > 0.0d) {
            z3 = true;
        }
        C17439m.m57981b(z3);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(d * d2)));
    }

    public final String toString() {
        if (count() > 0) {
            return C17430i.m57944a(this).mo44923a("xStats", (Object) this.xStats).mo44923a("yStats", (Object) this.yStats).mo44920a("populationCovariance", populationCovariance()).toString();
        }
        return C17430i.m57944a(this).mo44923a("xStats", (Object) this.xStats).mo44923a("yStats", (Object) this.yStats).toString();
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        boolean z;
        C17439m.m57962a(bArr);
        if (bArr.length == 88) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57972a(z, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(order), Stats.readFrom(order), order.getDouble());
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        if (!this.xStats.equals(pairedStats.xStats) || !this.yStats.equals(pairedStats.yStats) || Double.doubleToLongBits(this.sumOfProductsOfDeltas) != Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas)) {
            return false;
        }
        return true;
    }

    PairedStats(Stats stats, Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }
}
