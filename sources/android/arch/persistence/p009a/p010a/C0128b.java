package android.arch.persistence.p009a.p010a;

import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0135c;
import android.arch.persistence.p009a.C0135c.C0136a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: android.arch.persistence.a.a.b */
final class C0128b implements C0135c {

    /* renamed from: a */
    private final C0129a f271a;

    /* renamed from: android.arch.persistence.a.a.b$a */
    static class C0129a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C0126a[] f272a;

        /* renamed from: b */
        final C0136a f273b;

        /* renamed from: c */
        private boolean f274c;

        public final synchronized void close() {
            super.close();
            this.f272a[0] = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized C0134b mo279a() {
            this.f274c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f274c) {
                close();
                return mo279a();
            }
            return m342a(writableDatabase);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            m342a(sQLiteDatabase);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f273b.mo296a((C0134b) m342a(sQLiteDatabase));
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f274c) {
                this.f273b.mo298b(m342a(sQLiteDatabase));
            }
        }

        /* renamed from: a */
        private C0126a m342a(SQLiteDatabase sQLiteDatabase) {
            if (this.f272a[0] == null) {
                this.f272a[0] = new C0126a(sQLiteDatabase);
            }
            return this.f272a[0];
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f274c = true;
            this.f273b.mo299b(m342a(sQLiteDatabase), i, i2);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f274c = true;
            this.f273b.mo297a(m342a(sQLiteDatabase), i, i2);
        }

        C0129a(Context context, String str, final C0126a[] aVarArr, final C0136a aVar) {
            super(context, str, null, aVar.f279a, new DatabaseErrorHandler() {
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C0126a aVar = aVarArr[0];
                    if (aVar != null) {
                        aVar.mo300c(aVar);
                    }
                }
            });
            this.f273b = aVar;
            this.f272a = aVarArr;
        }
    }

    /* renamed from: a */
    public final C0134b mo277a() {
        return this.f271a.mo279a();
    }

    /* renamed from: a */
    public final void mo278a(boolean z) {
        this.f271a.setWriteAheadLoggingEnabled(z);
    }

    C0128b(Context context, String str, C0136a aVar) {
        this.f271a = m339a(context, str, aVar);
    }

    /* renamed from: a */
    private static C0129a m339a(Context context, String str, C0136a aVar) {
        return new C0129a(context, str, new C0126a[1], aVar);
    }
}
