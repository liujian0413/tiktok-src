package org.msgpack.template;

import java.io.IOException;
import java.math.BigDecimal;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BigDecimalTemplate extends AbstractTemplate<BigDecimal> {
    static final BigDecimalTemplate instance = new BigDecimalTemplate();

    private BigDecimalTemplate() {
    }

    public static BigDecimalTemplate getInstance() {
        return instance;
    }

    public BigDecimal read(Unpacker unpacker, BigDecimal bigDecimal, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return new BigDecimal(unpacker.readString());
        }
        return null;
    }

    public void write(Packer packer, BigDecimal bigDecimal, boolean z) throws IOException {
        if (bigDecimal != null) {
            packer.write(bigDecimal.toString());
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
