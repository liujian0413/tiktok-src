package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.io.Serializable;
import java.math.BigInteger;

public final class UnsignedLong extends Number implements Serializable, Comparable<UnsignedLong> {
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    private final long value;

    public final int intValue() {
        return (int) this.value;
    }

    public final long longValue() {
        return this.value;
    }

    public final int hashCode() {
        return C18145d.m59975a(this.value);
    }

    public final String toString() {
        return C18151i.m60000a(this.value);
    }

    public final BigInteger bigIntegerValue() {
        BigInteger valueOf = BigInteger.valueOf(this.value & Long.MAX_VALUE);
        if (this.value < 0) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }

    public final double doubleValue() {
        double d = (double) (this.value & Long.MAX_VALUE);
        if (this.value >= 0) {
            return d;
        }
        Double.isNaN(d);
        return d + 9.223372036854776E18d;
    }

    public final float floatValue() {
        float f = (float) (this.value & Long.MAX_VALUE);
        if (this.value < 0) {
            return f + 9.223372E18f;
        }
        return f;
    }

    private UnsignedLong(long j) {
        this.value = j;
    }

    public static UnsignedLong fromLongBits(long j) {
        return new UnsignedLong(j);
    }

    public static UnsignedLong valueOf(String str) {
        return valueOf(str, 10);
    }

    public final int compareTo(UnsignedLong unsignedLong) {
        C17439m.m57962a(unsignedLong);
        return C18151i.m59998a(this.value, unsignedLong.value);
    }

    public final UnsignedLong minus(UnsignedLong unsignedLong) {
        return fromLongBits(this.value - ((UnsignedLong) C17439m.m57962a(unsignedLong)).value);
    }

    public final UnsignedLong plus(UnsignedLong unsignedLong) {
        return fromLongBits(this.value + ((UnsignedLong) C17439m.m57962a(unsignedLong)).value);
    }

    public final String toString(int i) {
        return C18151i.m60001a(this.value, i);
    }

    public static UnsignedLong valueOf(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "value (%s) is outside the range for an unsigned long value", j);
        return fromLongBits(j);
    }

    public final UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        return fromLongBits(C18151i.m60003b(this.value, ((UnsignedLong) C17439m.m57962a(unsignedLong)).value));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnsignedLong)) {
            return false;
        }
        if (this.value == ((UnsignedLong) obj).value) {
            return true;
        }
        return false;
    }

    public final UnsignedLong mod(UnsignedLong unsignedLong) {
        return fromLongBits(C18151i.m60004c(this.value, ((UnsignedLong) C17439m.m57962a(unsignedLong)).value));
    }

    public final UnsignedLong times(UnsignedLong unsignedLong) {
        return fromLongBits(this.value * ((UnsignedLong) C17439m.m57962a(unsignedLong)).value);
    }

    public static UnsignedLong valueOf(BigInteger bigInteger) {
        boolean z;
        C17439m.m57962a(bigInteger);
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 64) {
            z = false;
        } else {
            z = true;
        }
        C17439m.m57976a(z, "value (%s) is outside the range for an unsigned long value", (Object) bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    public static UnsignedLong valueOf(String str, int i) {
        return fromLongBits(C18151i.m59999a(str, i));
    }
}
