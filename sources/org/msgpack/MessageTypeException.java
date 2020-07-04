package org.msgpack;

public class MessageTypeException extends RuntimeException {
    public MessageTypeException() {
    }

    public MessageTypeException(String str) {
        super(str);
    }

    public MessageTypeException(Throwable th) {
        super(th);
    }

    public MessageTypeException(String str, Throwable th) {
        super(str, th);
    }
}
