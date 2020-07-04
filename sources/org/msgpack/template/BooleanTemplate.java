package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BooleanTemplate extends AbstractTemplate<Boolean> {
    static final BooleanTemplate instance = new BooleanTemplate();

    private BooleanTemplate() {
    }

    public static BooleanTemplate getInstance() {
        return instance;
    }

    public Boolean read(Unpacker unpacker, Boolean bool, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Boolean.valueOf(unpacker.readBoolean());
        }
        return null;
    }

    public void write(Packer packer, Boolean bool, boolean z) throws IOException {
        if (bool != null) {
            packer.write(bool.booleanValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
