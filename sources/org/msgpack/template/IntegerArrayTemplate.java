package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class IntegerArrayTemplate extends AbstractTemplate<int[]> {
    static final IntegerArrayTemplate instance = new IntegerArrayTemplate();

    private IntegerArrayTemplate() {
    }

    public static IntegerArrayTemplate getInstance() {
        return instance;
    }

    public int[] read(Unpacker unpacker, int[] iArr, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (iArr == null || iArr.length != readArrayBegin) {
            iArr = new int[readArrayBegin];
        }
        for (int i = 0; i < readArrayBegin; i++) {
            iArr[i] = unpacker.readInt();
        }
        unpacker.readArrayEnd();
        return iArr;
    }

    public void write(Packer packer, int[] iArr, boolean z) throws IOException {
        if (iArr != null) {
            packer.writeArrayBegin(iArr.length);
            for (int write : iArr) {
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
