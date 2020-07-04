package org.msgpack.type;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.packer.Packer;

class DoubleValueImpl extends FloatValue {
    private double value;

    public double doubleValue() {
        return this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public double getDouble() {
        return this.value;
    }

    public float getFloat() {
        return (float) this.value;
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public byte byteValue() {
        return (byte) ((int) this.value);
    }

    public short shortValue() {
        return (short) ((int) this.value);
    }

    public String toString() {
        return Double.toString(this.value);
    }

    public BigInteger bigIntegerValue() {
        return new BigDecimal(this.value).toBigInteger();
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    DoubleValueImpl(double d) {
        this.value = d;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.value);
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append(Double.toString(this.value));
        return sb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value2 = (Value) obj;
        if (value2.isFloatValue() && this.value == value2.asFloatValue().getDouble()) {
            return true;
        }
        return false;
    }
}
