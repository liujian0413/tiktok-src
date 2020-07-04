package org.msgpack.p1895io;

import java.io.EOFException;

/* renamed from: org.msgpack.io.EndOfBufferException */
public class EndOfBufferException extends EOFException {
    public EndOfBufferException() {
    }

    public EndOfBufferException(String str) {
        super(str);
    }
}
