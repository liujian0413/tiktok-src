package com.bytedance.p263im.core.internal.p590db.p592b.p593a;

import android.content.Context;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.p594b.p596b.C11347c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11208c;
import com.tencent.wcdb.C46433g;
import com.tencent.wcdb.database.C46422j;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.C46408a;
import com.tencent.wcdb.repair.RepairKit.C46442b;

/* renamed from: com.bytedance.im.core.internal.db.b.a.f */
public final class C11335f extends C46422j implements C11332c {

    /* renamed from: a */
    public static int f30706a;

    /* renamed from: b */
    public static volatile boolean f30707b;

    /* renamed from: e */
    private static final C46433g f30708e = new C46433g() {
        /* renamed from: a */
        public final void mo27338a(SQLiteDatabase sQLiteDatabase) {
        }
    };

    /* renamed from: f */
    private static final C11333d f30709f = new C11333d() {
        /* renamed from: a */
        public final void mo27338a(SQLiteDatabase sQLiteDatabase) {
            if (!C11335f.f30707b) {
                C11335f.f30707b = true;
                boolean d = C11335f.m33242d(sQLiteDatabase);
                StringBuilder sb = new StringBuilder("tryRepair result ");
                sb.append(d);
                C11404d.m33583a("LocalWcdbOpenHelper", sb.toString());
                C11208c a = C11208c.m32815a().mo27256a("core").mo27258b("db_repair").mo27257a("repair_result", String.valueOf(d));
                String str = "repair_count";
                int i = 1000;
                if (C11335f.f30706a < 1000) {
                    i = C11335f.f30706a;
                }
                a.mo27257a(str, Integer.valueOf(i)).mo27260b();
                if (!d) {
                    super.mo27338a(sQLiteDatabase);
                    C11198c.m32777a().mo27253f();
                }
                C11335f.f30707b = false;
            }
        }
    };

    /* renamed from: d */
    private C11330a f30710d;

    /* renamed from: a */
    public final void mo27328a(C11351d dVar) {
    }

    /* renamed from: a */
    public final void mo27329a(C11351d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public final void mo27330b(C11351d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public final C11351d mo27334d() {
        return m33243e(mo115501a());
    }

    /* renamed from: a */
    public final void mo27331a(C11330a aVar) {
        this.f30710d = aVar;
    }

    /* renamed from: e */
    private static C11351d m33243e(SQLiteDatabase sQLiteDatabase) {
        return new C11347c(sQLiteDatabase);
    }

    /* renamed from: b */
    public final void mo27348b(SQLiteDatabase sQLiteDatabase) {
        C11404d.m33582a("LocalWcdbOpenHelper onConfigure");
        m33243e(sQLiteDatabase);
    }

    /* renamed from: a */
    public final void mo27346a(SQLiteDatabase sQLiteDatabase) {
        C11404d.m33582a("LocalWcdbOpenHelper onCreate");
        this.f30710d.mo27328a(m33243e(sQLiteDatabase));
    }

    /* renamed from: c */
    public final void mo27350c(SQLiteDatabase sQLiteDatabase) {
        C11404d.m33582a("LocalWcdbOpenHelper onOpen");
        m33243e(sQLiteDatabase);
        StringBuilder sb = new StringBuilder();
        sb.append(sQLiteDatabase.mo115476o());
        sb.append("-mbak");
        C46442b.m146007a(sQLiteDatabase, sb.toString(), (byte[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab A[Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1 A[SYNTHETIC, Splitter:B:52:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m33242d(com.tencent.wcdb.database.SQLiteDatabase r8) {
        /*
            java.lang.Class<com.bytedance.im.core.internal.db.b.a.f> r0 = com.bytedance.p263im.core.internal.p590db.p592b.p593a.C11335f.class
            monitor-enter(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            boolean r2 = r8.mo115475n()     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x0011
            r8.close()     // Catch:{ all -> 0x00ec }
        L_0x0011:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00ec }
            java.lang.String r8 = r8.mo115476o()     // Catch:{ all -> 0x00ec }
            r2.<init>(r8)     // Catch:{ all -> 0x00ec }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00ec }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r3.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r2.getPath()     // Catch:{ all -> 0x00ec }
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "-mbak"
            r3.append(r4)     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ec }
            r8.<init>(r3)     // Catch:{ all -> 0x00ec }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r2.getParent()     // Catch:{ all -> 0x00ec }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ec }
            r5.<init>()     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = r2.getName()     // Catch:{ all -> 0x00ec }
            r5.append(r6)     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = "-recover"
            r5.append(r6)     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ec }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ec }
            boolean r4 = r8.exists()     // Catch:{ all -> 0x00ec }
            r5 = 0
            if (r4 == 0) goto L_0x0062
            java.lang.String r8 = r8.getPath()     // Catch:{ SQLiteException -> 0x0062 }
            com.tencent.wcdb.repair.RepairKit$b r8 = com.tencent.wcdb.repair.RepairKit.C46442b.m146005a(r8, r5, r5)     // Catch:{ SQLiteException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r8 = r5
        L_0x0063:
            com.bytedance.im.core.a.c r4 = com.bytedance.p263im.core.p584a.C11198c.m32777a()     // Catch:{ all -> 0x00ec }
            com.bytedance.im.core.a.e r4 = r4.mo27248b()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r4.f30424x     // Catch:{ all -> 0x00ec }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x0082
            com.bytedance.im.core.a.c r4 = com.bytedance.p263im.core.p584a.C11198c.m32777a()     // Catch:{ all -> 0x00ec }
            com.bytedance.im.core.a.e r4 = r4.mo27248b()     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r4.f30424x     // Catch:{ all -> 0x00ec }
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x00ec }
            goto L_0x0083
        L_0x0082:
            r4 = r5
        L_0x0083:
            com.tencent.wcdb.repair.RepairKit r6 = new com.tencent.wcdb.repair.RepairKit     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            java.lang.String r7 = r2.getPath()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            r6.<init>(r7, r4, r5, r8)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            boolean r8 = r3.exists()     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            if (r8 == 0) goto L_0x0095
            r3.delete()     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
        L_0x0095:
            com.tencent.wcdb.g r8 = f30708e     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            com.tencent.wcdb.database.SQLiteDatabase r8 = com.tencent.wcdb.database.SQLiteDatabase.m145824a(r3, r4, r5, r5, r8)     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            f30706a = r1     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            com.bytedance.im.core.internal.db.b.a.f$3 r4 = new com.bytedance.im.core.internal.db.b.a.f$3     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            r6.f119637a = r4     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            int r4 = r6.mo115536a(r8, r1)     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            r7 = 1
            if (r4 == 0) goto L_0x00b6
            if (r4 != r7) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            com.tencent.wcdb.database.SQLiteException r8 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            java.lang.String r2 = "Repair returns failure."
            r8.<init>(r2)     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            throw r8     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
        L_0x00b6:
            r4 = 16
            r8.mo115462a(r4)     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            r8.close()     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            r6.mo115537a()     // Catch:{ SQLiteException -> 0x00db, all -> 0x00d9 }
            boolean r8 = r2.delete()     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            if (r8 == 0) goto L_0x00cf
            boolean r8 = r3.renameTo(r2)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            if (r8 == 0) goto L_0x00cf
            monitor-exit(r0)
            return r7
        L_0x00cf:
            com.tencent.wcdb.database.SQLiteException r8 = new com.tencent.wcdb.database.SQLiteException     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            java.lang.String r2 = "Cannot rename database."
            r8.<init>(r2)     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
            throw r8     // Catch:{ SQLiteException -> 0x00d7, all -> 0x00dd }
        L_0x00d7:
            goto L_0x00e5
        L_0x00d9:
            r8 = move-exception
            goto L_0x00df
        L_0x00db:
            r5 = r6
            goto L_0x00e5
        L_0x00dd:
            r8 = move-exception
            r6 = r5
        L_0x00df:
            if (r6 == 0) goto L_0x00e4
            r6.mo115537a()     // Catch:{ all -> 0x00ec }
        L_0x00e4:
            throw r8     // Catch:{ all -> 0x00ec }
        L_0x00e5:
            if (r5 == 0) goto L_0x00ea
            r5.mo115537a()     // Catch:{ all -> 0x00ec }
        L_0x00ea:
            monitor-exit(r0)
            return r1
        L_0x00ec:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.p592b.p593a.C11335f.m33242d(com.tencent.wcdb.database.SQLiteDatabase):boolean");
    }

    /* renamed from: b */
    public final void mo27349b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11404d.m33591d("LocalWcdbOpenHelper onDowngrade");
        this.f30710d.mo27330b(m33243e(sQLiteDatabase), i, i2);
    }

    /* renamed from: a */
    public final void mo27347a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11404d.m33582a("LocalWcdbOpenHelper onUpgrade");
        this.f30710d.mo27329a(m33243e(sQLiteDatabase), i, i2);
    }

    public C11335f(Context context, String str, C46408a aVar, int i) {
        super(context, str, null, aVar, i, f30709f);
        C11404d.m33582a("LocalWcdbOpenHelper");
    }

    public C11335f(Context context, String str, byte[] bArr, C46408a aVar, int i) {
        super(context, str, bArr, aVar, i, f30709f);
        C11404d.m33582a("LocalWcdbOpenHelper");
    }
}
