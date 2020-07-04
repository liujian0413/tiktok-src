package com.tencent.wcdb.database;

import com.tencent.wcdb.support.C46443a;

/* renamed from: com.tencent.wcdb.database.n */
public final class C46428n extends C46423k {
    /* renamed from: g */
    public final int mo115526g() {
        return mo115525a(null);
    }

    /* renamed from: h */
    public final long mo115527h() {
        return m145958b(null);
    }

    /* renamed from: i */
    public final long mo115528i() {
        return m145959c(null);
    }

    /* renamed from: j */
    public final String mo115529j() {
        return m145960d(null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteProgram: ");
        sb.append(this.f119608b);
        return sb.toString();
    }

    /* renamed from: b */
    private long m145958b(C46443a aVar) {
        mo115483d();
        try {
            long d = mo115502a().mo115524d(this.f119608b, this.f119610d, mo115507b(), null);
            mo115484e();
            return d;
        } catch (SQLiteDatabaseCorruptException e) {
            mo115505a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: c */
    private long m145959c(C46443a aVar) {
        mo115483d();
        try {
            long a = mo115502a().mo115513a(this.f119608b, this.f119610d, mo115507b(), (C46443a) null);
            mo115484e();
            return a;
        } catch (SQLiteDatabaseCorruptException e) {
            mo115505a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: d */
    private String m145960d(C46443a aVar) {
        mo115483d();
        try {
            String b = mo115502a().mo115521b(this.f119608b, this.f119610d, mo115507b(), (C46443a) null);
            mo115484e();
            return b;
        } catch (SQLiteDatabaseCorruptException e) {
            mo115505a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo115525a(C46443a aVar) {
        mo115483d();
        try {
            int c = mo115502a().mo115523c(this.f119608b, this.f119610d, mo115507b(), aVar);
            mo115484e();
            return c;
        } catch (SQLiteDatabaseCorruptException e) {
            mo115505a((SQLiteException) e);
            throw e;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    C46428n(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }
}
