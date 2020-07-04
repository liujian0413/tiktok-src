package com.bytedance.p263im.core.internal.p590db.p592b.p593a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.p594b.p595a.C11342c;
import com.bytedance.p263im.core.internal.utils.C11404d;

/* renamed from: com.bytedance.im.core.internal.db.b.a.e */
public final class C11334e extends SQLiteOpenHelper implements C11331b {

    /* renamed from: a */
    private C11330a f30705a;

    /* renamed from: a */
    public final void mo27328a(C11351d dVar) {
    }

    /* renamed from: a */
    public final void mo27329a(C11351d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public final void mo27330b(C11351d dVar, int i, int i2) {
    }

    public final void close() {
        super.close();
    }

    /* renamed from: d */
    public final C11351d mo27334d() {
        return m33236a(getWritableDatabase());
    }

    /* renamed from: a */
    public final void mo27331a(C11330a aVar) {
        this.f30705a = aVar;
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: a */
    private static C11351d m33236a(SQLiteDatabase sQLiteDatabase) {
        return new C11342c(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onConfigure");
        C11404d.m33582a(sb.toString());
        m33236a(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onOpen");
        C11404d.m33582a(sb.toString());
        m33236a(sQLiteDatabase);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onCreate");
        C11404d.m33582a(sb.toString());
        this.f30705a.mo27328a(m33236a(sQLiteDatabase));
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onDowngrade");
        C11404d.m33582a(sb.toString());
        this.f30705a.mo27330b(m33236a(sQLiteDatabase), i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" onUpgrade");
        C11404d.m33582a(sb.toString());
        this.f30705a.mo27329a(m33236a(sQLiteDatabase), i, i2);
    }

    public C11334e(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
        C11404d.m33582a(getClass().getSimpleName());
    }
}
