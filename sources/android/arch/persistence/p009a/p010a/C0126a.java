package android.arch.persistence.p009a.p010a;

import android.arch.persistence.p009a.C0125a;
import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

/* renamed from: android.arch.persistence.a.a.a */
final class C0126a implements C0134b {

    /* renamed from: a */
    private static final String[] f266a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private static final String[] f267b = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f268c;

    /* renamed from: a */
    public final void mo266a() {
        this.f268c.beginTransaction();
    }

    /* renamed from: b */
    public final void mo268b() {
        this.f268c.endTransaction();
    }

    /* renamed from: c */
    public final void mo269c() {
        this.f268c.setTransactionSuccessful();
    }

    public final void close() throws IOException {
        this.f268c.close();
    }

    /* renamed from: d */
    public final boolean mo272d() {
        return this.f268c.inTransaction();
    }

    /* renamed from: e */
    public final boolean mo273e() {
        return this.f268c.isOpen();
    }

    /* renamed from: f */
    public final String mo274f() {
        return this.f268c.getPath();
    }

    /* renamed from: g */
    public final List<Pair<String, String>> mo275g() {
        return this.f268c.getAttachedDbs();
    }

    C0126a(SQLiteDatabase sQLiteDatabase) {
        this.f268c = sQLiteDatabase;
    }

    /* renamed from: a */
    public final C0142f mo264a(String str) {
        return new C0133e(this.f268c.compileStatement(str));
    }

    /* renamed from: b */
    public final Cursor mo267b(String str) {
        return mo265a((C0141e) new C0125a(str));
    }

    /* renamed from: c */
    public final void mo270c(String str) throws SQLException {
        this.f268c.execSQL(str);
    }

    /* renamed from: a */
    public final Cursor mo265a(final C0141e eVar) {
        return this.f268c.rawQueryWithFactory(new CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo263a(new C0132d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo262a(), f267b, null);
    }
}
