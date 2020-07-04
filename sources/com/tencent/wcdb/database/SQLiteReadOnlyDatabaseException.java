package com.tencent.wcdb.database;

public class SQLiteReadOnlyDatabaseException extends SQLiteException {
    public SQLiteReadOnlyDatabaseException() {
    }

    public SQLiteReadOnlyDatabaseException(String str) {
        super(str);
    }
}
