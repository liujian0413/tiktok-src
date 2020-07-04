package com.google.common.math;

import com.google.common.base.C17430i;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.primitives.C18141b;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class Stats implements Serializable {
    private static final long serialVersionUID = 0;
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    public final double sumOfSquaresOfDeltas;

    public final long count() {
        return this.count;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sum() {
        double d = this.mean;
        double d2 = (double) this.count;
        Double.isNaN(d2);
        return d * d2;
    }

    public final double max() {
        boolean z;
        if (this.count != 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        return this.max;
    }

    public final double mean() {
        boolean z;
        if (this.count != 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        return this.mean;
    }

    public final double min() {
        boolean z;
        if (this.count != 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        return this.min;
    }

    public final byte[] toByteArray() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        writeTo(order);
        return order.array();
    }

    public final int hashCode() {
        return C17434j.m57954a(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public final double populationVariance() {
        boolean z;
        if (this.count > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        double c = C18118b.m59885c(this.sumOfSquaresOfDeltas);
        double count2 = (double) count();
        Double.isNaN(count2);
        return c / count2;
    }

    public final double sampleVariance() {
        boolean z;
        if (this.count > 1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        double c = C18118b.m59885c(this.sumOfSquaresOfDeltas);
        double d = (double) (this.count - 1);
        Double.isNaN(d);
        return c / d;
    }

    public final String toString() {
        if (count() > 0) {
            return C17430i.m57944a(this).mo44922a("count", this.count).mo44920a("mean", this.mean).mo44920a("populationStandardDeviation", populationStandardDeviation()).mo44920a("min", this.min).mo44920a("max", this.max).toString();
        }
        return C17430i.m57944a(this).mo44922a("count", this.count).toString();
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    /* renamed from: of */
    public static Stats m59875of(Iterable<? extends Number> iterable) {
        C18130g gVar = new C18130g();
        gVar.mo46767a(iterable);
        return gVar.mo46766a();
    }

    public static Stats fromByteArray(byte[] bArr) {
        boolean z;
        C17439m.m57962a(bArr);
        if (bArr.length == 40) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57972a(z, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return readFrom(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    /* renamed from: of */
    public static Stats m59876of(Iterator<? extends Number> it) {
        C18130g gVar = new C18130g();
        gVar.mo46768a(it);
        return gVar.mo46766a();
    }

    public static double meanOf(Iterator<? extends Number> it) {
        C17439m.m57968a(it.hasNext());
        double doubleValue = ((Number) it.next()).doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = ((Number) it.next()).doubleValue();
            j++;
            if (!C18141b.m59961b(doubleValue2) || !C18141b.m59961b(doubleValue)) {
                doubleValue = C18130g.m59902a(doubleValue, doubleValue2);
            } else {
                double d = doubleValue2 - doubleValue;
                double d2 = (double) j;
                Double.isNaN(d2);
                doubleValue += d / d2;
            }
        }
        return doubleValue;
    }

    /* renamed from: of */
    public static Stats m59877of(double... dArr) {
        C18130g gVar = new C18130g();
        gVar.mo46769a(dArr);
        return gVar.mo46766a();
    }

    static Stats readFrom(ByteBuffer byteBuffer) {
        boolean z;
        C17439m.m57962a(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57972a(z, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        Stats stats = new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
        return stats;
    }

    /* access modifiers changed from: 0000 */
    public final void writeTo(ByteBuffer byteBuffer) {
        boolean z;
        C17439m.m57962a(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57972a(z, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.count).putDouble(this.mean).putDouble(this.sumOfSquaresOfDeltas).putDouble(this.min).putDouble(this.max);
    }

    public static double meanOf(double... dArr) {
        boolean z;
        if (dArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            if (!C18141b.m59961b(d2) || !C18141b.m59961b(d)) {
                d = C18130g.m59902a(d, d2);
            } else {
                double d3 = d2 - d;
                double d4 = (double) (i + 1);
                Double.isNaN(d4);
                d += d3 / d4;
            }
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m59878of(int... iArr) {
        C18130g gVar = new C18130g();
        gVar.mo46770a(iArr);
        return gVar.mo46766a();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        if (this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max)) {
            return true;
        }
        return false;
    }

    public static double meanOf(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        double d = (double) iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = (double) iArr[i];
            if (!C18141b.m59961b(d2) || !C18141b.m59961b(d)) {
                d = C18130g.m59902a(d, d2);
            } else {
                Double.isNaN(d2);
                double d3 = d2 - d;
                double d4 = (double) (i + 1);
                Double.isNaN(d4);
                d += d3 / d4;
            }
        }
        return d;
    }

    /* renamed from: of */
    public static Stats m59879of(long... jArr) {
        C18130g gVar = new C18130g();
        gVar.mo46771a(jArr);
        return gVar.mo46766a();
    }

    public static double meanOf(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        double d = (double) jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = (double) jArr[i];
            if (!C18141b.m59961b(d2) || !C18141b.m59961b(d)) {
                d = C18130g.m59902a(d, d2);
            } else {
                Double.isNaN(d2);
                double d3 = d2 - d;
                double d4 = (double) (i + 1);
                Double.isNaN(d4);
                d += d3 / d4;
            }
        }
        return d;
    }

    Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }
}
