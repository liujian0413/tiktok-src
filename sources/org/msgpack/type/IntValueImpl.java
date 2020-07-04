package org.msgpack.type;

import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class IntValueImpl extends IntegerValue {
    private static int BYTE_MAX = 127;
    private static int BYTE_MIN = -128;
    private static int SHORT_MAX = 32767;
    private static int SHORT_MIN = -32768;
    private int value;

    public byte byteValue() {
        return (byte) this.value;
    }

    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public int getInt() {
        return this.value;
    }

    public long getLong() {
        return (long) this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public int intValue() {
        return this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public short shortValue() {
        return (short) this.value;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf((long) this.value);
    }

    public BigInteger getBigInteger() {
        return BigInteger.valueOf((long) this.value);
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public byte getByte() {
        if (this.value <= BYTE_MAX && this.value >= BYTE_MIN) {
            return (byte) this.value;
        }
        throw new MessageTypeException();
    }

    public short getShort() {
        if (this.value <= SHORT_MAX && this.value >= SHORT_MIN) {
            return (short) this.value;
        }
        throw new MessageTypeException();
    }

    IntValueImpl(int i) {
        this.value = i;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.value);
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append(Integer.toString(this.value));
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
        if (!value2.isIntegerValue()) {
            return false;
        }
        try {
            if (this.value == value2.asIntegerValue().getInt()) {
                return true;
            }
            return false;
        } catch (MessageTypeException unused) {
            return false;
        }
    }
}
