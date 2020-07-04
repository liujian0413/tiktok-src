package org.msgpack.template;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ByteBufferTemplate extends AbstractTemplate<ByteBuffer> {
    static final ByteBufferTemplate instance = new ByteBufferTemplate();

    private ByteBufferTemplate() {
    }

    public static ByteBufferTemplate getInstance() {
        return instance;
    }

    public ByteBuffer read(Unpacker unpacker, ByteBuffer byteBuffer, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return unpacker.readByteBuffer();
        }
        return null;
    }

    public void write(Packer packer, ByteBuffer byteBuffer, boolean z) throws IOException {
        if (byteBuffer != null) {
            packer.write(byteBuffer);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
