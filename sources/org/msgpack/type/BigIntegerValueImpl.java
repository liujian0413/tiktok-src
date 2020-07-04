package org.msgpack.type;

import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class BigIntegerValueImpl extends IntegerValue {
    private static BigInteger BYTE_MAX = BigInteger.valueOf(127);
    private static BigInteger BYTE_MIN = BigInteger.valueOf(-128);
    private static BigInteger INT_MAX = BigInteger.valueOf(2147483647L);
    private static BigInteger INT_MIN = BigInteger.valueOf(-2147483648L);
    private static BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static BigInteger SHORT_MAX = BigInteger.valueOf(32767);
    private static BigInteger SHORT_MIN = BigInteger.valueOf(-32768);
    private BigInteger value;

    public BigInteger bigIntegerValue() {
        return this.value;
    }

    public BigInteger getBigInteger() {
        return this.value;
    }

    public byte byteValue() {
        return this.value.byteValue();
    }

    public double doubleValue() {
        return this.value.doubleValue();
    }

    public float floatValue() {
        return this.value.floatValue();
    }

    public int intValue() {
        return this.value.intValue();
    }

    public long longValue() {
        return this.value.longValue();
    }

    public short shortValue() {
        return this.value.shortValue();
    }

    public String toString() {
        return this.value.toString();
    }

    public byte getByte() {
        if (this.value.compareTo(BYTE_MAX) <= 0 && this.value.compareTo(BYTE_MIN) >= 0) {
            return this.value.byteValue();
        }
        throw new MessageTypeException();
    }

    public int getInt() {
        if (this.value.compareTo(INT_MAX) <= 0 && this.value.compareTo(INT_MIN) >= 0) {
            return this.value.intValue();
        }
        throw new MessageTypeException();
    }

    public long getLong() {
        if (this.value.compareTo(LONG_MAX) <= 0 && this.value.compareTo(LONG_MIN) >= 0) {
            return this.value.longValue();
        }
        throw new MessageTypeException();
    }

    public short getShort() {
        if (this.value.compareTo(SHORT_MAX) <= 0 && this.value.compareTo(SHORT_MIN) >= 0) {
            return this.value.shortValue();
        }
        throw new MessageTypeException();
    }

    public int hashCode() {
        if (INT_MIN.compareTo(this.value) <= 0 && this.value.compareTo(INT_MAX) <= 0) {
            return (int) this.value.longValue();
        }
        if (LONG_MIN.compareTo(this.value) > 0 || this.value.compareTo(LONG_MAX) > 0) {
            return this.value.hashCode();
        }
        long longValue = this.value.longValue();
        return (int) (longValue ^ (longValue >>> 32));
    }

    BigIntegerValueImpl(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.value);
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append(this.value.toString());
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
        return this.value.equals(value2.asIntegerValue().bigIntegerValue());
    }
}
