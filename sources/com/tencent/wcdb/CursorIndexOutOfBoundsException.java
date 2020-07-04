package com.tencent.wcdb;

public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public CursorIndexOutOfBoundsException(String str) {
        super(str);
    }

    public CursorIndexOutOfBoundsException(int i, int i2) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" requested, with a size of ");
        sb.append(i2);
        super(sb.toString());
    }
}
