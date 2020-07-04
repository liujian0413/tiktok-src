package org.msgpack.packer;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.C48350a;
import org.msgpack.MessageTypeException;
import org.msgpack.type.Value;
import org.msgpack.type.ValueFactory;

public class Unconverter extends AbstractPacker {
    public Value result;
    private PackerStack stack;
    private Object[] values;

    public void close() throws IOException {
    }

    public void flush() throws IOException {
    }

    public void resetResult() {
        this.result = null;
    }

    public Packer writeNil() throws IOException {
        put(ValueFactory.createNilValue());
        return this;
    }

    public Unconverter() {
        this(new C48350a());
    }

    public Packer write(Value value) throws IOException {
        put(value);
        return this;
    }

    public void writeBigInteger(BigInteger bigInteger) throws IOException {
        put(ValueFactory.createIntegerValue(bigInteger));
    }

    public void writeBoolean(boolean z) throws IOException {
        put(ValueFactory.createBooleanValue(z));
    }

    public void writeByte(byte b) throws IOException {
        put(ValueFactory.createIntegerValue(b));
    }

    public void writeByteBuffer(ByteBuffer byteBuffer) throws IOException {
        put(ValueFactory.createRawValue(byteBuffer));
    }

    public void writeDouble(double d) throws IOException {
        put(ValueFactory.createFloatValue(d));
    }

    public void writeFloat(float f) throws IOException {
        put(ValueFactory.createFloatValue(f));
    }

    public void writeInt(int i) throws IOException {
        put(ValueFactory.createIntegerValue(i));
    }

    public void writeLong(long j) throws IOException {
        put(ValueFactory.createIntegerValue(j));
    }

    public void writeShort(short s) throws IOException {
        put(ValueFactory.createIntegerValue(s));
    }

    public void writeString(String str) throws IOException {
        put(ValueFactory.createRawValue(str));
    }

    public Unconverter(C48350a aVar) {
        super(aVar);
        this.stack = new PackerStack();
        this.values = new Object[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
    }

    private void put(Value value) {
        if (this.stack.top <= 0) {
            this.result = value;
            return;
        }
        this.stack.checkCount();
        Value[] valueArr = (Value[]) this.values[this.stack.top];
        valueArr[valueArr.length - this.stack.getTopCount()] = value;
        this.stack.reduceCount();
    }

    private void putContainer(Value value) {
        if (this.stack.top <= 0) {
            this.values[0] = value;
            return;
        }
        this.stack.checkCount();
        Value[] valueArr = (Value[]) this.values[this.stack.top];
        valueArr[valueArr.length - this.stack.getTopCount()] = value;
        this.stack.reduceCount();
    }

    public Packer writeArrayBegin(int i) throws IOException {
        if (i == 0) {
            putContainer(ValueFactory.createArrayValue());
            this.stack.pushArray(0);
            this.values[this.stack.top] = null;
        } else {
            Value[] valueArr = new Value[i];
            putContainer(ValueFactory.createArrayValue(valueArr, true));
            this.stack.pushArray(i);
            this.values[this.stack.top] = valueArr;
        }
        return this;
    }

    public Packer writeArrayEnd(boolean z) throws IOException {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        writeNil();
                    }
                } else {
                    throw new MessageTypeException("writeArrayEnd(check=true) is called but the array is not end");
                }
            }
            this.stack.pop();
            if (this.stack.top <= 0) {
                this.result = (Value) this.values[0];
            }
            return this;
        }
        throw new MessageTypeException("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    public Packer writeMapBegin(int i) throws IOException {
        this.stack.checkCount();
        if (i == 0) {
            putContainer(ValueFactory.createMapValue());
            this.stack.pushMap(0);
            this.values[this.stack.top] = null;
        } else {
            Value[] valueArr = new Value[(i * 2)];
            putContainer(ValueFactory.createMapValue(valueArr, true));
            this.stack.pushMap(i);
            this.values[this.stack.top] = valueArr;
        }
        return this;
    }

    public Packer writeMapEnd(boolean z) throws IOException {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        writeNil();
                    }
                } else {
                    throw new MessageTypeException("writeMapEnd(check=true) is called but the map is not end");
                }
            }
            this.stack.pop();
            if (this.stack.top <= 0) {
                this.result = (Value) this.values[0];
            }
            return this;
        }
        throw new MessageTypeException("writeMapEnd() is called but writeMapBegin() is not called");
    }

    public void writeByteArray(byte[] bArr, int i, int i2) throws IOException {
        put(ValueFactory.createRawValue(bArr, i, i2));
    }
}
