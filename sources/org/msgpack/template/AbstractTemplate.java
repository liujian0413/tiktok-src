package org.msgpack.template;

import java.io.IOException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public abstract class AbstractTemplate<T> implements Template<T> {
    public T read(Unpacker unpacker, T t) throws IOException {
        return read(unpacker, t, false);
    }

    public void write(Packer packer, T t) throws IOException {
        write(packer, t, false);
    }
}
