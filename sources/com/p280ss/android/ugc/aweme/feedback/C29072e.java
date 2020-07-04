package com.p280ss.android.ugc.aweme.feedback;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.ss.android.ugc.aweme.feedback.e */
public final class C29072e {

    /* renamed from: d */
    private static C29072e f76745d;

    /* renamed from: e */
    private static Object f76746e = new Object();

    /* renamed from: f */
    private static final String[] f76747f = {"item_id", "timestamp", C38347c.f99553h, "image_url", "avatar_url", "image_width", "image_height", "type", "links"};

    /* renamed from: a */
    private final Context f76748a;

    /* renamed from: b */
    private SQLiteDatabase f76749b;

    /* renamed from: c */
    private volatile boolean f76750c;

    /* renamed from: com.ss.android.ugc.aweme.feedback.e$a */
    static class C29073a extends SQLiteOpenHelper {
        C29073a(Context context) {
            super(context, "feedback.db", null, 2);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE feedback (auto_id INTEGER PRIMARY KEY AUTOINCREMENT,item_id INTEGER NOT NULL,timestamp INTEGER NOT NULL DEFAULT 0,content VARCHAR,image_url VARCHAR,avatar_url VARCHAR,image_width INTEGER NOT NULL DEFAULT 0,image_height INTEGER NOT NULL DEFAULT 0,type INTEGER NOT NULL DEFAULT 0,links VARCHAR )");
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 2) {
                try {
                    sQLiteDatabase.execSQL("ALTER TABLE feedback ADD COLUMN links VARCHAR");
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: e */
    private void m95406e() {
        this.f76750c = true;
        try {
            if (this.f76749b != null && this.f76749b.isOpen()) {
                this.f76749b.close();
                this.f76749b = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final synchronized void mo74508b() {
        if (m95405d()) {
            try {
                this.f76749b.delete("feedback", null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m95403a() {
        synchronized (f76746e) {
            if (f76745d != null) {
                f76745d.m95406e();
                f76745d = null;
            }
        }
    }

    /* renamed from: d */
    private boolean m95405d() {
        if (this.f76750c) {
            return false;
        }
        if (this.f76749b == null) {
            this.f76749b = m95404b(this.f76748a);
        }
        if (this.f76749b == null || !this.f76749b.isOpen()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|(0)|25|26) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0043 A[SYNTHETIC, Splitter:B:29:0x0043] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.p280ss.android.ugc.aweme.feedback.C29075g> mo74509c() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r0.<init>()     // Catch:{ all -> 0x0048 }
            boolean r1 = r10.m95405d()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r10)
            return r0
        L_0x000e:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f76749b     // Catch:{ Exception -> 0x0041, all -> 0x003a }
            java.lang.String r3 = "feedback"
            java.lang.String[] r4 = f76747f     // Catch:{ Exception -> 0x0041, all -> 0x003a }
            java.lang.String r5 = "type == 2"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0041, all -> 0x003a }
        L_0x001f:
            if (r2 == 0) goto L_0x0034
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            if (r1 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feedback.g r1 = m95402a(r2)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r0.add(r1)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            goto L_0x001f
        L_0x002f:
            r0 = move-exception
            r1 = r2
            goto L_0x003b
        L_0x0032:
            r1 = r2
            goto L_0x0041
        L_0x0034:
            if (r2 == 0) goto L_0x0046
            r2.close()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0046
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            monitor-exit(r10)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.C29072e.mo74509c():java.util.List");
    }

    private C29072e(Context context) {
        this.f76748a = context;
    }

    /* renamed from: b */
    private static SQLiteDatabase m95404b(Context context) {
        try {
            return new C29073a(context).getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C29072e m95401a(Context context) {
        synchronized (f76746e) {
            if (f76745d == null) {
                f76745d = new C29072e(context.getApplicationContext());
            }
        }
        return f76745d;
    }

    /* renamed from: a */
    private static ContentValues m95400a(C29075g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", Long.valueOf(gVar.f76752b));
        contentValues.put("timestamp", Long.valueOf(gVar.f76754d));
        contentValues.put(C38347c.f99553h, gVar.f76755e);
        contentValues.put("image_url", gVar.f76756f);
        contentValues.put("avatar_url", gVar.f76757g);
        contentValues.put("image_width", Integer.valueOf(gVar.f76758h));
        contentValues.put("image_height", Integer.valueOf(gVar.f76759i));
        contentValues.put("type", Integer.valueOf(gVar.f76760j));
        contentValues.put("links", gVar.f76761k);
        return contentValues;
    }

    /* renamed from: a */
    private static C29075g m95402a(Cursor cursor) {
        C29075g gVar = new C29075g(cursor.getLong(0));
        gVar.f76754d = cursor.getLong(1);
        gVar.f76755e = cursor.getString(2);
        gVar.f76756f = cursor.getString(3);
        gVar.f76757g = cursor.getString(4);
        gVar.f76758h = cursor.getInt(5);
        gVar.f76759i = cursor.getInt(6);
        gVar.f76760j = cursor.getInt(7);
        gVar.f76761k = cursor.getString(8);
        return gVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:26|27|(0)|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a A[SYNTHETIC, Splitter:B:35:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0060 A[SYNTHETIC, Splitter:B:41:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo74505a(boolean r16) {
        /*
            r15 = this;
            r1 = r15
            monitor-enter(r15)
            boolean r0 = r15.m95405d()     // Catch:{ all -> 0x0065 }
            r2 = -1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r15)
            return r2
        L_0x000c:
            r4 = 0
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r0 = "item_id"
            r14 = 0
            r7[r14] = r0     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r5 = "item_id"
            r0.<init>(r5)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            if (r16 == 0) goto L_0x0021
            java.lang.String r5 = " DESC"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = " ASC"
        L_0x0023:
            r0.append(r5)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r12 = r0.toString()     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r8 = "type < 2"
            android.database.sqlite.SQLiteDatabase r5 = r1.f76749b     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            java.lang.String r6 = "feedback"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r13 = "1"
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x005e, all -> 0x0057 }
            if (r5 == 0) goto L_0x0051
            boolean r0 = r5.moveToNext()     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            if (r0 == 0) goto L_0x0051
            long r6 = r5.getLong(r14)     // Catch:{ Exception -> 0x004f, all -> 0x004c }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            monitor-exit(r15)
            return r6
        L_0x004c:
            r0 = move-exception
            r4 = r5
            goto L_0x0058
        L_0x004f:
            r4 = r5
            goto L_0x005e
        L_0x0051:
            if (r5 == 0) goto L_0x0063
            r5.close()     // Catch:{ Exception -> 0x0063 }
            goto L_0x0063
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x005e:
            if (r4 == 0) goto L_0x0063
            r4.close()     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            monitor-exit(r15)
            return r2
        L_0x0065:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.C29072e.mo74505a(boolean):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|24|25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0061 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo74507a(java.util.List<com.p280ss.android.ugc.aweme.feedback.C29075g> r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.m95405d()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006a
            int r0 = r8.size()     // Catch:{ all -> 0x006c }
            if (r0 > 0) goto L_0x000e
            goto L_0x006a
        L_0x000e:
            android.database.sqlite.SQLiteDatabase r0 = r7.f76749b     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            r0.beginTransaction()     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0061, all -> 0x005a }
        L_0x0017:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            com.ss.android.ugc.aweme.feedback.g r0 = (com.p280ss.android.ugc.aweme.feedback.C29075g) r0     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            android.content.ContentValues r1 = m95400a(r0)     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            java.lang.String r2 = "item_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            r4 = 0
            long r5 = r0.f76752b     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            r3[r4] = r5     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            boolean r0 = r0.f76764n     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            if (r0 != 0) goto L_0x0043
            android.database.sqlite.SQLiteDatabase r0 = r7.f76749b     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            java.lang.String r4 = "feedback"
            int r0 = r0.update(r4, r1, r2, r3)     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            if (r0 > 0) goto L_0x0017
        L_0x0043:
            android.database.sqlite.SQLiteDatabase r0 = r7.f76749b     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            java.lang.String r2 = "feedback"
            r3 = 0
            r0.insert(r2, r3, r1)     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            goto L_0x0017
        L_0x004c:
            android.database.sqlite.SQLiteDatabase r8 = r7.f76749b     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            r8.setTransactionSuccessful()     // Catch:{ Exception -> 0x0061, all -> 0x005a }
            android.database.sqlite.SQLiteDatabase r8 = r7.f76749b     // Catch:{ Exception -> 0x0058 }
            r8.endTransaction()     // Catch:{ Exception -> 0x0058 }
            monitor-exit(r7)
            return
        L_0x0058:
            monitor-exit(r7)
            return
        L_0x005a:
            r8 = move-exception
            android.database.sqlite.SQLiteDatabase r0 = r7.f76749b     // Catch:{ Exception -> 0x0060 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r8     // Catch:{ all -> 0x006c }
        L_0x0061:
            android.database.sqlite.SQLiteDatabase r8 = r7.f76749b     // Catch:{ Exception -> 0x0068 }
            r8.endTransaction()     // Catch:{ Exception -> 0x0068 }
            monitor-exit(r7)
            return
        L_0x0068:
            monitor-exit(r7)
            return
        L_0x006a:
            monitor-exit(r7)
            return
        L_0x006c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.C29072e.mo74507a(java.util.List):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|31|(0)|41|42) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009b */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC, Splitter:B:39:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009e A[SYNTHETIC, Splitter:B:45:0x009e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.p280ss.android.ugc.aweme.feedback.C29075g> mo74506a(long r10, long r12, int r14, java.lang.String r15) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r10.<init>()     // Catch:{ all -> 0x00a3 }
            boolean r11 = r9.m95405d()     // Catch:{ all -> 0x00a3 }
            if (r11 != 0) goto L_0x000e
            monitor-exit(r9)
            return r10
        L_0x000e:
            r11 = 0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r0.<init>()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0036
            int r1 = r0.length()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r1 <= 0) goto L_0x0025
            java.lang.String r1 = " AND "
            r0.append(r1)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0025:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r2 = "item_id>"
            r1.<init>(r2)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r1.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r12 = r1.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r0.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0036:
            int r12 = r0.length()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r12 <= 0) goto L_0x0041
            java.lang.String r12 = " AND "
            r0.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0041:
            java.lang.String r12 = "type < 2"
            r0.append(r12)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r14 <= 0) goto L_0x004e
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r8 = r12
            goto L_0x004f
        L_0x004e:
            r8 = r11
        L_0x004f:
            boolean r12 = com.bytedance.common.utility.C6319n.m19593a(r15)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            if (r12 == 0) goto L_0x0057
            java.lang.String r15 = " ASC"
        L_0x0057:
            android.database.sqlite.SQLiteDatabase r12 = r9.f76749b     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r1 = "feedback"
            java.lang.String[] r2 = f76747f     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r14 = "item_id"
            r13.<init>(r14)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r13.append(r15)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.lang.String r7 = r13.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r0 = r12
            android.database.Cursor r12 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
        L_0x0077:
            if (r12 == 0) goto L_0x008f
            boolean r11 = r12.moveToNext()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r11 == 0) goto L_0x008f
            com.ss.android.ugc.aweme.feedback.g r11 = m95402a(r12)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r11.mo74512a()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r10.add(r11)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            goto L_0x0077
        L_0x008a:
            r10 = move-exception
            r11 = r12
            goto L_0x0096
        L_0x008d:
            r11 = r12
            goto L_0x009c
        L_0x008f:
            if (r12 == 0) goto L_0x00a1
            r12.close()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00a1
        L_0x0095:
            r10 = move-exception
        L_0x0096:
            if (r11 == 0) goto L_0x009b
            r11.close()     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            throw r10     // Catch:{ all -> 0x00a3 }
        L_0x009c:
            if (r11 == 0) goto L_0x00a1
            r11.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            monitor-exit(r9)
            return r10
        L_0x00a3:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feedback.C29072e.mo74506a(long, long, int, java.lang.String):java.util.List");
    }
}
