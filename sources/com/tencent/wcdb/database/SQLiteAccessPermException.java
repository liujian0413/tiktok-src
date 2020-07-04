package com.tencent.wcdb.database;

public class SQLiteAccessPermException extends SQLiteException {
    public SQLiteAccessPermException() {
    }

    public SQLiteAccessPermException(String str) {
        super(str);
    }
}
