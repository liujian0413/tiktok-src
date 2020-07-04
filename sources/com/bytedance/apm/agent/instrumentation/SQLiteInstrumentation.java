package com.bytedance.apm.agent.instrumentation;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.CancellationSignal;
import com.bytedance.apm.agent.tracing.TraceMachine;
import java.util.Arrays;

public class SQLiteInstrumentation {
    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        TraceMachine.enterMethod("sqlite", "rawQuery", "db_trace");
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceMachine.exitMethod(str);
        return rawQuery;
    }

    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "rawQuery", "db_trace");
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceMachine.exitMethod(str);
        return rawQuery;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        TraceMachine.enterMethod("sqlite", "rawQueryWithFactory", "db_trace");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(Arrays.toString(strArr));
        TraceMachine.exitMethod(sb.toString());
        return rawQueryWithFactory;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "rawQueryWithFactory", "db_trace");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(Arrays.toString(strArr));
        TraceMachine.exitMethod(sb.toString());
        return rawQueryWithFactory;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor query = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, null));
        return query;
    }

    private static String combineQuery(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder("distinct: ");
        sb.append(z);
        sb.append(" table: ");
        sb.append(str);
        sb.append(" columns: ");
        sb.append(Arrays.toString(strArr));
        sb.append(" selection: ");
        sb.append(str2);
        sb.append(" selectionArgs: ");
        sb.append(Arrays.toString(strArr2));
        return sb.toString();
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor query = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return query;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        TraceMachine.enterMethod("sqlite", "query", "db_trace");
        Cursor query = sQLiteDatabase.query(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceMachine.exitMethod(combineQuery(z, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return query;
    }

    public static Cursor queryWithFactory(SQLiteDatabase sQLiteDatabase, CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        TraceMachine.enterMethod("sqlite", "queryWithFactory", "db_trace");
        Cursor queryWithFactory = sQLiteDatabase.queryWithFactory(cursorFactory, z, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        TraceMachine.exitMethod(combineQuery(false, str, strArr, str2, strArr2, str3, str4, str5, str6));
        return queryWithFactory;
    }
}
