package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class FloatTemplate extends AbstractTemplate<Float> {
    static final FloatTemplate instance = new FloatTemplate();

    private FloatTemplate() {
    }

    public static FloatTemplate getInstance() {
        return instance;
    }

    public Float read(Unpacker unpacker, Float f, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Float.valueOf(unpacker.readFloat());
        }
        return null;
    }

    public void write(Packer packer, Float f, boolean z) throws IOException {
        if (f != null) {
            packer.write(f.floatValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
