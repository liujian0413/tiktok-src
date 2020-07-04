package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

enum XXHashJNI {
    ;

    static native int XXH32(byte[] bArr, int i, int i2, int i3);

    static native int XXH32BB(ByteBuffer byteBuffer, int i, int i2, int i3);

    static native int XXH32_digest(long j);

    static native void XXH32_free(long j);

    static native long XXH32_init(int i);

    static native void XXH32_update(long j, byte[] bArr, int i, int i2);

    static native long XXH64(byte[] bArr, int i, int i2, long j);

    static native long XXH64BB(ByteBuffer byteBuffer, int i, int i2, long j);

    static native long XXH64_digest(long j);

    static native void XXH64_free(long j);

    static native long XXH64_init(long j);

    static native void XXH64_update(long j, byte[] bArr, int i, int i2);

    private static native void init();

    static {
        Native.load();
        init();
    }
}
