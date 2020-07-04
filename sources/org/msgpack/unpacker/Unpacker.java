package org.msgpack.unpacker;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.template.Template;
import org.msgpack.type.Value;

public interface Unpacker extends Closeable, Iterable<Value> {
    <T> T read(Class<T> cls) throws IOException;

    <T> T read(T t) throws IOException;

    <T> T read(Template<T> template) throws IOException;

    int readArrayBegin() throws IOException;

    void readArrayEnd() throws IOException;

    void readArrayEnd(boolean z) throws IOException;

    BigInteger readBigInteger() throws IOException;

    boolean readBoolean() throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    ByteBuffer readByteBuffer() throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    int readMapBegin() throws IOException;

    void readMapEnd() throws IOException;

    void readMapEnd(boolean z) throws IOException;

    short readShort() throws IOException;

    String readString() throws IOException;

    Value readValue() throws IOException;

    void skip() throws IOException;

    boolean trySkipNil() throws IOException;
}
