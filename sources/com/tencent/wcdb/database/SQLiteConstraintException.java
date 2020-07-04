package com.tencent.wcdb.database;

public class SQLiteConstraintException extends SQLiteException {
    public SQLiteConstraintException() {
    }

    public SQLiteConstraintException(String str) {
        super(str);
    }
}
