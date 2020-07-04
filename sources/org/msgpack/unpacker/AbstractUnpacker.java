package org.msgpack.unpacker;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.msgpack.C48350a;
import org.msgpack.packer.Unconverter;
import org.msgpack.template.Template;
import org.msgpack.type.Value;

public abstract class AbstractUnpacker implements Unpacker {
    protected int arraySizeLimit = 4194304;
    protected int mapSizeLimit = 2097152;
    protected C48350a msgpack;
    protected int rawSizeLimit = 134217728;

    /* access modifiers changed from: protected */
    public abstract void readValue(Unconverter unconverter) throws IOException;

    /* access modifiers changed from: protected */
    public abstract boolean tryReadNil() throws IOException;

    public void readArrayEnd() throws IOException {
        readArrayEnd(false);
    }

    public void readMapEnd() throws IOException {
        readMapEnd(false);
    }

    public UnpackerIterator iterator() {
        return new UnpackerIterator(this);
    }

    public ByteBuffer readByteBuffer() throws IOException {
        return ByteBuffer.wrap(readByteArray());
    }

    public Value readValue() throws IOException {
        Unconverter unconverter = new Unconverter(this.msgpack);
        readValue(unconverter);
        return unconverter.result;
    }

    public <T> T read(Template<T> template) throws IOException {
        if (tryReadNil()) {
            return null;
        }
        return template.read(this, null);
    }

    protected AbstractUnpacker(C48350a aVar) {
        this.msgpack = aVar;
    }

    public <T> T read(Class<T> cls) throws IOException {
        if (tryReadNil()) {
            return null;
        }
        return this.msgpack.mo121874a(cls).read(this, null);
    }

    public <T> T read(T t) throws IOException {
        if (tryReadNil()) {
            return null;
        }
        return this.msgpack.mo121874a(t.getClass()).read(this, t);
    }
}
