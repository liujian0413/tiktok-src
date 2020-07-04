package com.tencent.wcdb.database;

public class SQLiteAbortException extends SQLiteException {
    public SQLiteAbortException() {
    }

    public SQLiteAbortException(String str) {
        super(str);
    }
}
