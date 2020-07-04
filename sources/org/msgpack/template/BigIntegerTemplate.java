package org.msgpack.template;

import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BigIntegerTemplate extends AbstractTemplate<BigInteger> {
    static final BigIntegerTemplate instance = new BigIntegerTemplate();

    private BigIntegerTemplate() {
    }

    public static BigIntegerTemplate getInstance() {
        return instance;
    }

    public BigInteger read(Unpacker unpacker, BigInteger bigInteger, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return unpacker.readBigInteger();
        }
        return null;
    }

    public void write(Packer packer, BigInteger bigInteger, boolean z) throws IOException {
        if (bigInteger != null) {
            packer.write(bigInteger);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
