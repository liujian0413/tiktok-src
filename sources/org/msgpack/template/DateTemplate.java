package org.msgpack.template;

import java.io.IOException;
import java.util.Date;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class DateTemplate extends AbstractTemplate<Date> {
    static final DateTemplate instance = new DateTemplate();

    private DateTemplate() {
    }

    public static DateTemplate getInstance() {
        return instance;
    }

    public Date read(Unpacker unpacker, Date date, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return new Date(unpacker.readLong());
        }
        return null;
    }

    public void write(Packer packer, Date date, boolean z) throws IOException {
        if (date != null) {
            packer.write(date.getTime());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
