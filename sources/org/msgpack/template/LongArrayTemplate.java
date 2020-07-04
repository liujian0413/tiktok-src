package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class LongArrayTemplate extends AbstractTemplate<long[]> {
    static final LongArrayTemplate instance = new LongArrayTemplate();

    private LongArrayTemplate() {
    }

    public static LongArrayTemplate getInstance() {
        return instance;
    }

    public long[] read(Unpacker unpacker, long[] jArr, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (jArr == null || jArr.length != readArrayBegin) {
            jArr = new long[readArrayBegin];
        }
        for (int i = 0; i < readArrayBegin; i++) {
            jArr[i] = unpacker.readLong();
        }
        unpacker.readArrayEnd();
        return jArr;
    }

    public void write(Packer packer, long[] jArr, boolean z) throws IOException {
        if (jArr != null) {
            packer.writeArrayBegin(jArr.length);
            for (long write : jArr) {
                packer.write(write);
            }
            packer.writeArrayEnd();
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new MessageTypeException("Attempted to write null");
        }
    }
}
