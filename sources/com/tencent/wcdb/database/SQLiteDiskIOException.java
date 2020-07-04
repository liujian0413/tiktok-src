package com.tencent.wcdb.database;

public class SQLiteDiskIOException extends SQLiteException {
    public SQLiteDiskIOException() {
    }

    public SQLiteDiskIOException(String str) {
        super(str);
    }
}
