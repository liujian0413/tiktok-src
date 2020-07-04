package net.jpountz.util;

import java.nio.ByteOrder;
import sun.misc.Unsafe;

public enum UnsafeUtils {
    ;
    
    private static final long BYTE_ARRAY_OFFSET = 0;
    private static final int BYTE_ARRAY_SCALE = 0;
    private static final long INT_ARRAY_OFFSET = 0;
    private static final int INT_ARRAY_SCALE = 0;
    private static final long SHORT_ARRAY_OFFSET = 0;
    private static final int SHORT_ARRAY_SCALE = 0;
    private static final Unsafe UNSAFE = null;

    public static void checkLength(int i) {
        SafeUtils.checkLength(i);
    }

    public static void checkRange(byte[] bArr, int i) {
        SafeUtils.checkRange(bArr, i);
    }

    public static byte readByte(byte[] bArr, int i) {
        return UNSAFE.getByte(bArr, BYTE_ARRAY_OFFSET + ((long) (BYTE_ARRAY_SCALE * i)));
    }

    public static int readInt(byte[] bArr, int i) {
        return UNSAFE.getInt(bArr, BYTE_ARRAY_OFFSET + ((long) i));
    }

    public static int readIntLE(byte[] bArr, int i) {
        int readInt = readInt(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return Integer.reverseBytes(readInt);
        }
        return readInt;
    }

    public static long readLong(byte[] bArr, int i) {
        return UNSAFE.getLong(bArr, BYTE_ARRAY_OFFSET + ((long) i));
    }

    public static long readLongLE(byte[] bArr, int i) {
        long readLong = readLong(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return Long.reverseBytes(readLong);
        }
        return readLong;
    }

    public static short readShort(byte[] bArr, int i) {
        return UNSAFE.getShort(bArr, BYTE_ARRAY_OFFSET + ((long) i));
    }

    public static int readInt(int[] iArr, int i) {
        return UNSAFE.getInt(iArr, INT_ARRAY_OFFSET + ((long) (INT_ARRAY_SCALE * i)));
    }

    public static int readShort(short[] sArr, int i) {
        return UNSAFE.getShort(sArr, SHORT_ARRAY_OFFSET + ((long) (SHORT_ARRAY_SCALE * i))) & 65535;
    }

    public static int readShortLE(byte[] bArr, int i) {
        short readShort = readShort(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            readShort = Short.reverseBytes(readShort);
        }
        return readShort & 65535;
    }

    public static void checkRange(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
    }

    public static void writeByte(byte[] bArr, int i, int i2) {
        writeByte(bArr, i, (byte) i2);
    }

    public static void writeByte(byte[] bArr, int i, byte b) {
        UNSAFE.putByte(bArr, BYTE_ARRAY_OFFSET + ((long) (BYTE_ARRAY_SCALE * i)), b);
    }

    public static void writeInt(byte[] bArr, int i, int i2) {
        UNSAFE.putInt(bArr, BYTE_ARRAY_OFFSET + ((long) i), i2);
    }

    public static void writeLong(byte[] bArr, int i, long j) {
        UNSAFE.putLong(bArr, ((long) i) + BYTE_ARRAY_OFFSET, j);
    }

    public static void writeShort(byte[] bArr, int i, short s) {
        UNSAFE.putShort(bArr, BYTE_ARRAY_OFFSET + ((long) i), s);
    }

    public static void writeShortLE(byte[] bArr, int i, int i2) {
        writeByte(bArr, i, (byte) i2);
        writeByte(bArr, i + 1, (byte) (i2 >>> 8));
    }

    public static void writeInt(int[] iArr, int i, int i2) {
        UNSAFE.putInt(iArr, INT_ARRAY_OFFSET + ((long) (INT_ARRAY_SCALE * i)), i2);
    }

    public static void writeShort(short[] sArr, int i, int i2) {
        UNSAFE.putShort(sArr, SHORT_ARRAY_OFFSET + ((long) (SHORT_ARRAY_SCALE * i)), (short) i2);
    }
}
