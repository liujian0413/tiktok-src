package com.tencent.wcdb.database;

import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.C46443a;
import com.tencent.wcdb.support.Log;

/* renamed from: com.tencent.wcdb.database.l */
public final class C46424l extends C46423k {

    /* renamed from: f */
    private final C46443a f119615f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteQuery: ");
        sb.append(this.f119608b);
        return sb.toString();
    }

    C46424l(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C46443a aVar) {
        super(sQLiteDatabase, str, objArr, aVar);
        this.f119615f = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo115510a(CursorWindow cursorWindow, int i, int i2, boolean z) {
        mo115483d();
        try {
            cursorWindow.mo115483d();
            int a = mo115502a().mo115512a(this.f119608b, this.f119610d, cursorWindow, i, i2, z, mo115507b(), this.f119615f);
            cursorWindow.mo115484e();
            mo115484e();
            return a;
        } catch (SQLiteException e) {
            String str = "WCDB.SQLiteQuery";
            StringBuilder sb = new StringBuilder("exception: ");
            sb.append(e.getMessage());
            sb.append("; query: ");
            sb.append(this.f119608b);
            Log.m146010a(str, sb.toString());
            mo115505a(e);
            throw e;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }
}
