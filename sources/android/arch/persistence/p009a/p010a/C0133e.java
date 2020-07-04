package android.arch.persistence.p009a.p010a;

import android.arch.persistence.p009a.C0142f;
import android.database.sqlite.SQLiteStatement;

/* renamed from: android.arch.persistence.a.a.e */
final class C0133e extends C0132d implements C0142f {

    /* renamed from: a */
    private final SQLiteStatement f278a;

    /* renamed from: a */
    public final int mo294a() {
        return this.f278a.executeUpdateDelete();
    }

    /* renamed from: b */
    public final long mo295b() {
        return this.f278a.executeInsert();
    }

    C0133e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f278a = sQLiteStatement;
    }
}
