package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class BooleanArrayTemplate extends AbstractTemplate<boolean[]> {
    static final BooleanArrayTemplate instance = new BooleanArrayTemplate();

    private BooleanArrayTemplate() {
    }

    public static BooleanArrayTemplate getInstance() {
        return instance;
    }

    public boolean[] read(Unpacker unpacker, boolean[] zArr, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (zArr == null || zArr.length != readArrayBegin) {
            zArr = new boolean[readArrayBegin];
        }
        for (int i = 0; i < readArrayBegin; i++) {
            zArr[i] = unpacker.readBoolean();
        }
        unpacker.readArrayEnd();
        return zArr;
    }

    public void write(Packer packer, boolean[] zArr, boolean z) throws IOException {
        if (zArr != null) {
            packer.writeArrayBegin(zArr.length);
            for (boolean write : zArr) {
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
