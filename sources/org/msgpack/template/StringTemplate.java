package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class StringTemplate extends AbstractTemplate<String> {
    static final StringTemplate instance = new StringTemplate();

    private StringTemplate() {
    }

    public static StringTemplate getInstance() {
        return instance;
    }

    public String read(Unpacker unpacker, String str, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return unpacker.readString();
        }
        return null;
    }

    public void write(Packer packer, String str, boolean z) throws IOException {
        if (str != null) {
            packer.write(str);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
