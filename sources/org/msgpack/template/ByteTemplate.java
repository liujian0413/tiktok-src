package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteTemplate extends AbstractTemplate<Byte> {
    static final ByteTemplate instance = new ByteTemplate();

    private ByteTemplate() {
    }

    public static ByteTemplate getInstance() {
        return instance;
    }

    public Byte read(Unpacker unpacker, Byte b, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Byte.valueOf(unpacker.readByte());
        }
        return null;
    }

    public void write(Packer packer, Byte b, boolean z) throws IOException {
        if (b != null) {
            packer.write(b.byteValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
