package org.msgpack.type;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.packer.Packer;

class FloatValueImpl extends FloatValue {
    private float value;

    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return this.value;
    }

    public double getDouble() {
        return (double) this.value;
    }

    public float getFloat() {
        return this.value;
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

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public short shortValue() {
        return (short) ((int) this.value);
    }

    public String toString() {
        return Float.toString(this.value);
    }

    public BigInteger bigIntegerValue() {
        return new BigDecimal((double) this.value).toBigInteger();
    }

    FloatValueImpl(float f) {
        this.value = f;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.value);
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append(Float.toString(this.value));
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
        if (value2.isFloatValue() && ((double) this.value) == value2.asFloatValue().getDouble()) {
            return true;
        }
        return false;
    }
}
