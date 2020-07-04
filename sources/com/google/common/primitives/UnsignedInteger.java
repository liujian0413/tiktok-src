package com.google.common.primitives;

import com.google.common.base.C17439m;
import java.math.BigInteger;

public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public static final UnsignedInteger MAX_VALUE = fromIntBits(-1);
    public static final UnsignedInteger ONE = fromIntBits(1);
    public static final UnsignedInteger ZERO = fromIntBits(0);
    private final int value;

    public final int hashCode() {
        return this.value;
    }

    public final int intValue() {
        return this.value;
    }

    public final double doubleValue() {
        return (double) longValue();
    }

    public final float floatValue() {
        return (float) longValue();
    }

    public final long longValue() {
        return C18150h.m59993a(this.value);
    }

    public final String toString() {
        return toString(10);
    }

    public final BigInteger bigIntegerValue() {
        return BigInteger.valueOf(longValue());
    }

    private UnsignedInteger(int i) {
        this.value = i & -1;
    }

    public static UnsignedInteger fromIntBits(int i) {
        return new UnsignedInteger(i);
    }

    public static UnsignedInteger valueOf(String str) {
        return valueOf(str, 10);
    }

    public final int compareTo(UnsignedInteger unsignedInteger) {
        C17439m.m57962a(unsignedInteger);
        return C18150h.m59991a(this.value, unsignedInteger.value);
    }

    public final UnsignedInteger minus(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value - ((UnsignedInteger) C17439m.m57962a(unsignedInteger)).value);
    }

    public final UnsignedInteger plus(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value + ((UnsignedInteger) C17439m.m57962a(unsignedInteger)).value);
    }

    public final String toString(int i) {
        return C18150h.m59997d(this.value, i);
    }

    public static UnsignedInteger valueOf(long j) {
        boolean z;
        if ((4294967295L & j) == j) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "value (%s) is outside the range for an unsigned integer value", j);
        return fromIntBits((int) j);
    }

    public final UnsignedInteger dividedBy(UnsignedInteger unsignedInteger) {
        return fromIntBits(C18150h.m59995b(this.value, ((UnsignedInteger) C17439m.m57962a(unsignedInteger)).value));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnsignedInteger)) {
            return false;
        }
        if (this.value == ((UnsignedInteger) obj).value) {
            return true;
        }
        return false;
    }

    public final UnsignedInteger mod(UnsignedInteger unsignedInteger) {
        return fromIntBits(C18150h.m59996c(this.value, ((UnsignedInteger) C17439m.m57962a(unsignedInteger)).value));
    }

    public final UnsignedInteger times(UnsignedInteger unsignedInteger) {
        return fromIntBits(this.value * ((UnsignedInteger) C17439m.m57962a(unsignedInteger)).value);
    }

    public static UnsignedInteger valueOf(BigInteger bigInteger) {
        boolean z;
        C17439m.m57962a(bigInteger);
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 32) {
            z = false;
        } else {
            z = true;
        }
        C17439m.m57976a(z, "value (%s) is outside the range for an unsigned integer value", (Object) bigInteger);
        return fromIntBits(bigInteger.intValue());
    }

    public static UnsignedInteger valueOf(String str, int i) {
        return fromIntBits(C18150h.m59992a(str, i));
    }
}
