package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ShortArrayTemplate extends AbstractTemplate<short[]> {
    static final ShortArrayTemplate instance = new ShortArrayTemplate();

    private ShortArrayTemplate() {
    }

    public static ShortArrayTemplate getInstance() {
        return instance;
    }

    public short[] read(Unpacker unpacker, short[] sArr, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (sArr == null || sArr.length != readArrayBegin) {
            sArr = new short[readArrayBegin];
        }
        for (int i = 0; i < readArrayBegin; i++) {
            sArr[i] = unpacker.readShort();
        }
        unpacker.readArrayEnd();
        return sArr;
    }

    public void write(Packer packer, short[] sArr, boolean z) throws IOException {
        if (sArr != null) {
            packer.writeArrayBegin(sArr.length);
            for (short write : sArr) {
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
