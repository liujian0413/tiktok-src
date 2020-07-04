package com.tencent.wcdb.database;

import com.tencent.wcdb.database.SQLiteDatabase.CustomFunction;

public final class SQLiteCustomFunction {
    public final CustomFunction callback;
    public final String name;
    public final int numArgs;

    private void dispatchCallback(String[] strArr) {
    }

    public SQLiteCustomFunction(String str, int i, CustomFunction customFunction) {
        if (str != null) {
            this.name = str;
            this.numArgs = i;
            this.callback = customFunction;
            return;
        }
        throw new IllegalArgumentException("name must not be null.");
    }
}
