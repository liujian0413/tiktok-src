package com.tencent.wcdb;

import android.database.Cursor;

/* renamed from: com.tencent.wcdb.f */
public interface C46432f extends Cursor {
    void close();

    int getColumnIndex(String str);

    int getCount();

    int getInt(int i);

    long getLong(int i);

    String getString(int i);

    boolean isAfterLast();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToNext();
}
