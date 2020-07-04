package org.msgpack.packer;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;

public interface Packer extends Closeable, Flushable {
    Packer write(byte b) throws IOException;

    Packer write(double d) throws IOException;

    Packer write(float f) throws IOException;

    Packer write(int i) throws IOException;

    Packer write(long j) throws IOException;

    Packer write(Object obj) throws IOException;

    Packer write(Short sh) throws IOException;

    Packer write(String str) throws IOException;

    Packer write(BigInteger bigInteger) throws IOException;

    Packer write(ByteBuffer byteBuffer) throws IOException;

    Packer write(short s) throws IOException;

    Packer write(boolean z) throws IOException;

    Packer write(byte[] bArr) throws IOException;

    Packer writeArrayBegin(int i) throws IOException;

    Packer writeArrayEnd() throws IOException;

    Packer writeArrayEnd(boolean z) throws IOException;

    Packer writeMapBegin(int i) throws IOException;

    Packer writeMapEnd() throws IOException;

    Packer writeMapEnd(boolean z) throws IOException;

    Packer writeNil() throws IOException;
}
