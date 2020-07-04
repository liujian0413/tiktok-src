package org.msgpack.type;

import java.math.BigInteger;
import java.nio.ByteBuffer;

public final class ValueFactory {
    public static ArrayValue createArrayValue() {
        return ArrayValueImpl.getEmptyInstance();
    }

    public static MapValue createMapValue() {
        return SequentialMapValueImpl.getEmptyInstance();
    }

    public static NilValue createNilValue() {
        return NilValue.getInstance();
    }

    public static RawValue createRawValue() {
        return ByteArrayRawValueImpl.getEmptyInstance();
    }

    public static FloatValue createFloatValue(double d) {
        return new DoubleValueImpl(d);
    }

    public static IntegerValue createIntegerValue(byte b) {
        return new IntValueImpl(b);
    }

    public static BooleanValue createBooleanValue(boolean z) {
        if (z) {
            return TrueValueImpl.getInstance();
        }
        return FalseValueImpl.getInstance();
    }

    public static FloatValue createFloatValue(float f) {
        return new FloatValueImpl(f);
    }

    public static IntegerValue createIntegerValue(int i) {
        return new IntValueImpl(i);
    }

    public static RawValue createRawValue(String str) {
        return new StringRawValueImpl(str);
    }

    public static IntegerValue createIntegerValue(long j) {
        return new LongValueImpl(j);
    }

    public static RawValue createRawValue(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteArrayRawValueImpl(bArr, true);
        } finally {
            byteBuffer.position(position);
        }
    }

    public static IntegerValue createIntegerValue(BigInteger bigInteger) {
        return new BigIntegerValueImpl(bigInteger);
    }

    public static RawValue createRawValue(byte[] bArr) {
        return createRawValue(bArr, false);
    }

    public static IntegerValue createIntegerValue(short s) {
        return new IntValueImpl(s);
    }

    public static ArrayValue createArrayValue(Value[] valueArr, boolean z) {
        if (valueArr.length == 0) {
            return ArrayValueImpl.getEmptyInstance();
        }
        return new ArrayValueImpl(valueArr, z);
    }

    public static MapValue createMapValue(Value[] valueArr, boolean z) {
        if (valueArr.length == 0) {
            return SequentialMapValueImpl.getEmptyInstance();
        }
        return new SequentialMapValueImpl(valueArr, z);
    }

    public static RawValue createRawValue(byte[] bArr, boolean z) {
        return new ByteArrayRawValueImpl(bArr, z);
    }

    public static RawValue createRawValue(byte[] bArr, int i, int i2) {
        return new ByteArrayRawValueImpl(bArr, i, i2);
    }
}
