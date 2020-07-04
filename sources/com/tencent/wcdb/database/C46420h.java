package com.tencent.wcdb.database;

import com.tencent.wcdb.database.SQLiteDatabase.C46408a;
import com.tencent.wcdb.support.C46443a;

/* renamed from: com.tencent.wcdb.database.h */
public final class C46420h implements C46418f {

    /* renamed from: f */
    private static C46408a f119587f = C46416e.f119566h;

    /* renamed from: a */
    private final SQLiteDatabase f119588a;

    /* renamed from: b */
    private final String f119589b;

    /* renamed from: c */
    private final String f119590c;

    /* renamed from: d */
    private final C46443a f119591d;

    /* renamed from: e */
    private C46423k f119592e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteDirectCursorDriver: ");
        sb.append(this.f119590c);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.wcdb.C46432f mo115497a(com.tencent.wcdb.database.SQLiteDatabase.C46408a r5, java.lang.Object[] r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0004
            com.tencent.wcdb.database.SQLiteDatabase$a r5 = f119587f
        L_0x0004:
            r0 = 0
            com.tencent.wcdb.database.SQLiteDatabase r1 = r4.f119588a     // Catch:{ RuntimeException -> 0x001d }
            java.lang.String r2 = r4.f119590c     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.support.a r3 = r4.f119591d     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.database.k r6 = r5.mo27335a(r1, r2, r6, r3)     // Catch:{ RuntimeException -> 0x001d }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r4.f119588a     // Catch:{ RuntimeException -> 0x001a }
            java.lang.String r1 = r4.f119589b     // Catch:{ RuntimeException -> 0x001a }
            com.tencent.wcdb.f r5 = r5.mo27336a(r0, r4, r1, r6)     // Catch:{ RuntimeException -> 0x001a }
            r4.f119592e = r6
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r6
            goto L_0x001e
        L_0x001d:
            r5 = move-exception
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()
        L_0x0023:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.C46420h.mo115497a(com.tencent.wcdb.database.SQLiteDatabase$a, java.lang.Object[]):com.tencent.wcdb.f");
    }

    public C46420h(SQLiteDatabase sQLiteDatabase, String str, String str2, C46443a aVar) {
        this.f119588a = sQLiteDatabase;
        this.f119589b = str2;
        this.f119590c = str;
        this.f119591d = aVar;
    }
}
