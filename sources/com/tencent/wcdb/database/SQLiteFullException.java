package com.tencent.wcdb.database;

public class SQLiteFullException extends SQLiteException {
    public SQLiteFullException() {
    }

    public SQLiteFullException(String str) {
        super(str);
    }
}
