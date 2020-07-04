package org.msgpack.template;

import java.io.IOException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public interface Template<T> {
    T read(Unpacker unpacker, T t) throws IOException;

    T read(Unpacker unpacker, T t, boolean z) throws IOException;

    void write(Packer packer, T t) throws IOException;

    void write(Packer packer, T t, boolean z) throws IOException;
}
