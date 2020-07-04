package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class LongTemplate extends AbstractTemplate<Long> {
    static final LongTemplate instance = new LongTemplate();

    private LongTemplate() {
    }

    public static LongTemplate getInstance() {
        return instance;
    }

    public Long read(Unpacker unpacker, Long l, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Long.valueOf(unpacker.readLong());
        }
        return null;
    }

    public void write(Packer packer, Long l, boolean z) throws IOException {
        if (l != null) {
            packer.write(l.longValue());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
