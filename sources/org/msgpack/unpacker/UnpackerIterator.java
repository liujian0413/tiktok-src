package org.msgpack.unpacker;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.Value;

public class UnpackerIterator implements Iterator<Value> {
    public IOException exception;

    /* renamed from: u */
    private final AbstractUnpacker f123486u;

    /* renamed from: uc */
    private final Unconverter f123487uc;

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.f123487uc.result != null) {
            return true;
        }
        try {
            this.f123486u.readValue(this.f123487uc);
            if (this.f123487uc.result != null) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (IOException e) {
            this.exception = e;
            return false;
        }
    }

    public Value next() {
        if (hasNext()) {
            Value value = this.f123487uc.result;
            this.f123487uc.resetResult();
            return value;
        }
        throw new NoSuchElementException();
    }

    public UnpackerIterator(AbstractUnpacker abstractUnpacker) {
        this.f123486u = abstractUnpacker;
        this.f123487uc = new Unconverter(abstractUnpacker.msgpack);
    }
}
