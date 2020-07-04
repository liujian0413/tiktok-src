package android.arch.persistence.p009a.p010a;

import android.arch.persistence.p009a.C0140d;
import android.database.sqlite.SQLiteProgram;

/* renamed from: android.arch.persistence.a.a.d */
class C0132d implements C0140d {

    /* renamed from: a */
    private final SQLiteProgram f277a;

    public void close() {
        this.f277a.close();
    }

    C0132d(SQLiteProgram sQLiteProgram) {
        this.f277a = sQLiteProgram;
    }

    /* renamed from: a */
    public final void mo288a(int i) {
        this.f277a.bindNull(i);
    }

    /* renamed from: a */
    public final void mo289a(int i, double d) {
        this.f277a.bindDouble(i, d);
    }

    /* renamed from: a */
    public final void mo290a(int i, long j) {
        this.f277a.bindLong(i, j);
    }

    /* renamed from: a */
    public final void mo291a(int i, String str) {
        this.f277a.bindString(i, str);
    }

    /* renamed from: a */
    public final void mo292a(int i, byte[] bArr) {
        this.f277a.bindBlob(i, bArr);
    }
}
