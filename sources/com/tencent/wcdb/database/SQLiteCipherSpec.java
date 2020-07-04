package com.tencent.wcdb.database;

public class SQLiteCipherSpec {
    public String cipher;
    public boolean hmacEnabled = true;
    public int kdfIteration;
    public int pageSize = SQLiteGlobal.f119529a;

    public SQLiteCipherSpec() {
    }

    public SQLiteCipherSpec(SQLiteCipherSpec sQLiteCipherSpec) {
        this.cipher = sQLiteCipherSpec.cipher;
        this.kdfIteration = sQLiteCipherSpec.kdfIteration;
        this.hmacEnabled = sQLiteCipherSpec.hmacEnabled;
        this.pageSize = sQLiteCipherSpec.pageSize;
    }
}
