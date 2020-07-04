package com.google.gson;

public class JsonParseException extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(Throwable th) {
        super(th);
    }

    public JsonParseException(String str, Throwable th) {
        super(str, th);
    }
}
