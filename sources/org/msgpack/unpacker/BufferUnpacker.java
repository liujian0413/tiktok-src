package org.msgpack.unpacker;

public interface BufferUnpacker extends Unpacker {
    BufferUnpacker wrap(byte[] bArr);
}
