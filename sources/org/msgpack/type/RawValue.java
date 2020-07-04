package org.msgpack.type;

public interface RawValue extends Value {
    byte[] getByteArray();

    String getString();
}
