package org.msgpack.packer;

public interface BufferPacker extends Packer {
    byte[] toByteArray();
}
