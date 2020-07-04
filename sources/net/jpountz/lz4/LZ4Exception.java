package net.jpountz.lz4;

public class LZ4Exception extends RuntimeException {
    private static final long serialVersionUID = 1;

    public LZ4Exception() {
    }

    public LZ4Exception(String str) {
        super(str);
    }

    public LZ4Exception(String str, Throwable th) {
        super(str, th);
    }
}
