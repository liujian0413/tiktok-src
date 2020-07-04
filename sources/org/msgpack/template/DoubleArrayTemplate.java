package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class DoubleArrayTemplate extends AbstractTemplate<double[]> {
    static final DoubleArrayTemplate instance = new DoubleArrayTemplate();

    private DoubleArrayTemplate() {
    }

    public static DoubleArrayTemplate getInstance() {
        return instance;
    }

    public double[] read(Unpacker unpacker, double[] dArr, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (dArr == null || dArr.length != readArrayBegin) {
            dArr = new double[readArrayBegin];
        }
        for (int i = 0; i < readArrayBegin; i++) {
            dArr[i] = unpacker.readDouble();
        }
        unpacker.readArrayEnd();
        return dArr;
    }

    public void write(Packer packer, double[] dArr, boolean z) throws IOException {
        if (dArr != null) {
            packer.writeArrayBegin(dArr.length);
            for (double write : dArr) {
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
