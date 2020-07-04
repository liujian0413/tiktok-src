package org.msgpack.unpacker;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.C48350a;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.ArrayValue;
import org.msgpack.type.MapValue;
import org.msgpack.type.Value;

public class Converter extends AbstractUnpacker {
    private final UnpackerStack stack;
    protected Value value;
    private Object[] values;

    public void close() throws IOException {
    }

    /* access modifiers changed from: protected */
    public Value nextValue() throws IOException {
        throw new EOFException();
    }

    private void ensureValue() throws IOException {
        if (this.value == null) {
            this.value = nextValue();
        }
    }

    public BigInteger readBigInteger() throws IOException {
        BigInteger bigInteger = getTop().asIntegerValue().getBigInteger();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return bigInteger;
    }

    public boolean readBoolean() throws IOException {
        boolean z = getTop().asBooleanValue().getBoolean();
        this.stack.reduceCount();
        return z;
    }

    public byte readByte() throws IOException {
        byte b = getTop().asIntegerValue().getByte();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return b;
    }

    public byte[] readByteArray() throws IOException {
        byte[] byteArray = getTop().asRawValue().getByteArray();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return byteArray;
    }

    public double readDouble() throws IOException {
        double d = getTop().asFloatValue().getDouble();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return d;
    }

    public float readFloat() throws IOException {
        float f = getTop().asFloatValue().getFloat();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return f;
    }

    public int readInt() throws IOException {
        int i = getTop().asIntegerValue().getInt();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return i;
    }

    public long readLong() throws IOException {
        long j = getTop().asIntegerValue().getLong();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return j;
    }

    public short readShort() throws IOException {
        short s = getTop().asIntegerValue().getShort();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return s;
    }

    public String readString() throws IOException {
        String string = getTop().asRawValue().getString();
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return string;
    }

    public Value readValue() throws IOException {
        if (this.stack.top != 0) {
            return super.readValue();
        }
        if (this.value == null) {
            return nextValue();
        }
        Value value2 = this.value;
        this.value = null;
        return value2;
    }

    private Value getTop() throws IOException {
        ensureValue();
        this.stack.checkCount();
        if (this.stack.top == 0) {
            return this.value;
        }
        Value[] valueArr = (Value[]) this.values[this.stack.top];
        return valueArr[valueArr.length - this.stack.getTopCount()];
    }

    public int readArrayBegin() throws IOException {
        Value top = getTop();
        if (top.isArrayValue()) {
            ArrayValue asArrayValue = top.asArrayValue();
            this.stack.reduceCount();
            this.stack.pushArray(asArrayValue.size());
            this.values[this.stack.top] = asArrayValue.getElementArray();
            return asArrayValue.size();
        }
        throw new MessageTypeException("Expected array but got not array value");
    }

    public int readMapBegin() throws IOException {
        Value top = getTop();
        if (top.isMapValue()) {
            MapValue asMapValue = top.asMapValue();
            this.stack.reduceCount();
            this.stack.pushMap(asMapValue.size());
            this.values[this.stack.top] = asMapValue.getKeyValueArray();
            return asMapValue.size();
        }
        throw new MessageTypeException("Expected map but got not map value");
    }

    public boolean tryReadNil() throws IOException {
        this.stack.checkCount();
        if (!getTop().isNilValue()) {
            return false;
        }
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return true;
    }

    public boolean trySkipNil() throws IOException {
        ensureValue();
        if (this.stack.top > 0 && this.stack.getTopCount() <= 0) {
            return true;
        }
        if (!getTop().isNilValue()) {
            return false;
        }
        this.stack.reduceCount();
        if (this.stack.top == 0) {
            this.value = null;
        }
        return true;
    }

    public void skip() throws IOException {
        this.stack.checkCount();
        Value top = getTop();
        if (top.isArrayValue() || top.isMapValue()) {
            int i = this.stack.top;
            while (true) {
                if (this.stack.getTopCount() == 0) {
                    this.stack.pop();
                    if (this.stack.top == 0) {
                        this.value = null;
                    }
                    if (this.stack.top <= i) {
                        return;
                    }
                } else {
                    this.stack.checkCount();
                    Value top2 = getTop();
                    if (top2.isArrayValue()) {
                        ArrayValue asArrayValue = top2.asArrayValue();
                        this.stack.reduceCount();
                        this.stack.pushArray(asArrayValue.size());
                        this.values[this.stack.top] = asArrayValue.getElementArray();
                    } else if (top2.isMapValue()) {
                        MapValue asMapValue = top2.asMapValue();
                        this.stack.reduceCount();
                        this.stack.pushMap(asMapValue.size());
                        this.values[this.stack.top] = asMapValue.getKeyValueArray();
                    } else {
                        this.stack.reduceCount();
                    }
                }
            }
        } else {
            this.stack.reduceCount();
            if (this.stack.top == 0) {
                this.value = null;
            }
        }
    }

    public Converter(Value value2) {
        this(new C48350a(), value2);
    }

    public void readArrayEnd(boolean z) throws IOException {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        skip();
                    }
                } else {
                    throw new MessageTypeException("readArrayEnd(check=true) is called but the array is not end");
                }
            }
            this.stack.pop();
            if (this.stack.top == 0) {
                this.value = null;
                return;
            }
            return;
        }
        throw new MessageTypeException("readArrayEnd() is called but readArrayBegin() is not called");
    }

    public void readMapEnd(boolean z) throws IOException {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (!z) {
                    for (int i = 0; i < topCount; i++) {
                        skip();
                    }
                } else {
                    throw new MessageTypeException("readMapEnd(check=true) is called but the map is not end");
                }
            }
            this.stack.pop();
            if (this.stack.top == 0) {
                this.value = null;
                return;
            }
            return;
        }
        throw new MessageTypeException("readMapEnd() is called but readMapBegin() is not called");
    }

    /* access modifiers changed from: protected */
    public void readValue(Unconverter unconverter) throws IOException {
        if (unconverter.result != null) {
            unconverter.resetResult();
        }
        this.stack.checkCount();
        Value top = getTop();
        if (!top.isArrayValue() && !top.isMapValue()) {
            unconverter.write(top);
            this.stack.reduceCount();
            if (this.stack.top == 0) {
                this.value = null;
            }
            if (unconverter.result != null) {
                return;
            }
        }
        while (true) {
            if (this.stack.top == 0 || this.stack.getTopCount() != 0) {
                this.stack.checkCount();
                Value top2 = getTop();
                if (top2.isArrayValue()) {
                    ArrayValue asArrayValue = top2.asArrayValue();
                    unconverter.writeArrayBegin(asArrayValue.size());
                    this.stack.reduceCount();
                    this.stack.pushArray(asArrayValue.size());
                    this.values[this.stack.top] = asArrayValue.getElementArray();
                } else if (top2.isMapValue()) {
                    MapValue asMapValue = top2.asMapValue();
                    unconverter.writeMapBegin(asMapValue.size());
                    this.stack.reduceCount();
                    this.stack.pushMap(asMapValue.size());
                    this.values[this.stack.top] = asMapValue.getKeyValueArray();
                } else {
                    unconverter.write(top2);
                    this.stack.reduceCount();
                }
            } else {
                if (this.stack.topIsArray()) {
                    unconverter.writeArrayEnd(true);
                    this.stack.pop();
                } else if (this.stack.topIsMap()) {
                    unconverter.writeMapEnd(true);
                    this.stack.pop();
                } else {
                    throw new RuntimeException("invalid stack");
                }
                if (this.stack.top == 0) {
                    this.value = null;
                }
                if (unconverter.result != null) {
                    return;
                }
            }
        }
    }

    public Converter(C48350a aVar, Value value2) {
        super(aVar);
        this.stack = new UnpackerStack();
        this.values = new Object[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
        this.value = value2;
    }
}
