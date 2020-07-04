package org.msgpack.type;

import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class LongValueImpl extends IntegerValue {
    private static long BYTE_MAX = 127;
    private static long BYTE_MIN = -128;
    private static long INT_MAX = 2147483647L;
    private static long INT_MIN = -2147483648L;
    private static long SHORT_MAX = 32767;
    private static long SHORT_MIN = -32768;
    private long value;

    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public long getLong() {
        return this.value;
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return this.value;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this.value);
    }

    public byte byteValue() {
        return (byte) ((int) this.value);
    }

    public BigInteger getBigInteger() {
        return BigInteger.valueOf(this.value);
    }

    public short shortValue() {
        return (short) ((int) this.value);
    }

    public String toString() {
        return Long.toString(this.value);
    }

    public byte getByte() {
        if (this.value <= BYTE_MAX && this.value >= BYTE_MIN) {
            return (byte) ((int) this.value);
        }
        throw new MessageTypeException();
    }

    public int getInt() {
        if (this.value <= INT_MAX && this.value >= INT_MIN) {
            return (int) this.value;
        }
        throw new MessageTypeException();
    }

    public short getShort() {
        if (this.value <= SHORT_MAX && this.value >= SHORT_MIN) {
            return (short) ((int) this.value);
        }
        throw new MessageTypeException();
    }

    public int hashCode() {
        if (INT_MIN > this.value || this.value > INT_MAX) {
            return (int) (this.value ^ (this.value >>> 32));
        }
        return (int) this.value;
    }

    LongValueImpl(long j) {
        this.value = j;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.value);
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append(Long.toString(this.value));
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
            if (this.value == value2.asIntegerValue().getLong()) {
                return true;
            }
            return false;
        } catch (MessageTypeException unused) {
            return false;
        }
    }
}
