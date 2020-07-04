package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class DoubleTemplate extends AbstractTemplate<Double> {
    static final DoubleTemplate instance = new DoubleTemplate();

    private DoubleTemplate() {
    }

    public static DoubleTemplate getInstance() {
        return instance;
    }

    public Double read(Unpacker unpacker, Double d, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Double.valueOf(unpacker.readDouble());
        }
        return null;
    }

    public void write(Packer packer, Double d, boolean z) throws IOException {
        if (d != null) {
            packer.write(d.doubleValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
