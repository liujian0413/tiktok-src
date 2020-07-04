package org.msgpack.template;

import java.io.IOException;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class FloatArrayTemplate extends AbstractTemplate<float[]> {
    static final FloatArrayTemplate instance = new FloatArrayTemplate();

    private FloatArrayTemplate() {
    }

    public static FloatArrayTemplate getInstance() {
        return instance;
    }

    public float[] read(Unpacker unpacker, float[] fArr, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (fArr == null || fArr.length != readArrayBegin) {
            fArr = new float[readArrayBegin];
        }
        for (int i = 0; i < readArrayBegin; i++) {
            fArr[i] = unpacker.readFloat();
        }
        unpacker.readArrayEnd();
        return fArr;
    }

    public void write(Packer packer, float[] fArr, boolean z) throws IOException {
        if (fArr != null) {
            packer.writeArrayBegin(fArr.length);
            for (float write : fArr) {
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
