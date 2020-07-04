package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.C1642a;
import com.facebook.ads.AdError;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tagmanager.k */
final class C17036k implements C17027c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f47709a = C1642a.m8034a("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[]{"datalayer", "ID", "key", "value", "expires"});

    /* renamed from: b */
    private final Executor f47710b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f47711c;

    /* renamed from: d */
    private C17040o f47712d;

    /* renamed from: e */
    private C15322e f47713e;

    /* renamed from: f */
    private int f47714f;

    public C17036k(Context context) {
        this(context, C15325h.m44574d(), "google_tagmanager.db", AdError.SERVER_ERROR_CODE, C17037l.m56558a());
    }

    private C17036k(Context context, C15322e eVar, String str, int i, Executor executor) {
        this.f47711c = context;
        this.f47713e = eVar;
        this.f47714f = AdError.SERVER_ERROR_CODE;
        this.f47710b = executor;
        this.f47712d = new C17040o(this, this.f47711c, str);
    }

    /* renamed from: a */
    public final void mo44257a(List<C17025a> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (C17025a aVar : list) {
            arrayList.add(new C17041p(aVar.f47685a, m56549a(aVar.f47686b)));
        }
        this.f47710b.execute(new C17038m(this, arrayList, j));
    }

    /* renamed from: a */
    public final void mo44256a(C17034i iVar) {
        this.f47710b.execute(new C17039n(this, iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final List<C17025a> m56551b() {
        try {
            m56547a(this.f47713e.mo38684a());
            List<C17041p> c = m56553c();
            ArrayList arrayList = new ArrayList();
            for (C17041p pVar : c) {
                arrayList.add(new C17025a(pVar.f47721a, m56543a(pVar.f47722b)));
            }
            return arrayList;
        } finally {
            m56555e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[SYNTHETIC, Splitter:B:13:0x001e] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0028 A[SYNTHETIC, Splitter:B:22:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0032 A[SYNTHETIC, Splitter:B:31:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m56543a(byte[] r4) {
        /*
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r4)
            r4 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x0025, all -> 0x001b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002f, ClassNotFoundException -> 0x0025, all -> 0x001b }
            java.lang.Object r2 = r1.readObject()     // Catch:{ IOException -> 0x0030, ClassNotFoundException -> 0x0026, all -> 0x0016 }
            r1.close()     // Catch:{ IOException -> 0x0015 }
            r0.close()     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r2
        L_0x0016:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
            goto L_0x001c
        L_0x001b:
            r1 = move-exception
        L_0x001c:
            if (r4 == 0) goto L_0x0021
            r4.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0021:
            r0.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            throw r1
        L_0x0025:
            r1 = r4
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002b:
            r0.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r4
        L_0x002f:
            r1 = r4
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0035:
            r0.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C17036k.m56543a(byte[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A[SYNTHETIC, Splitter:B:13:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0029 A[SYNTHETIC, Splitter:B:22:0x0029] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m56549a(java.lang.Object r3) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0026, all -> 0x001c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0026, all -> 0x001c }
            r2.writeObject(r3)     // Catch:{ IOException -> 0x0027, all -> 0x0019 }
            byte[] r3 = r0.toByteArray()     // Catch:{ IOException -> 0x0027, all -> 0x0019 }
            r2.close()     // Catch:{ IOException -> 0x0018 }
            r0.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r3
        L_0x0019:
            r3 = move-exception
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r3 = move-exception
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0022:
            r0.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            throw r3
        L_0x0026:
            r2 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x002c:
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C17036k.m56549a(java.lang.Object):byte[]");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void m56552b(List<C17041p> list, long j) {
        long a;
        String[] strArr;
        try {
            a = this.f47713e.mo38684a();
            m56547a(a);
            int d = (m56554d() - this.f47714f) + list.size();
            if (d > 0) {
                List a2 = m56545a(d);
                int size = a2.size();
                StringBuilder sb = new StringBuilder(64);
                sb.append("DataLayer store full, deleting ");
                sb.append(size);
                sb.append(" entries to make room.");
                strArr = (String[]) a2.toArray(new String[0]);
                if (strArr != null) {
                    if (strArr.length != 0) {
                        SQLiteDatabase a3 = m56542a("Error opening database for deleteEntries.");
                        if (a3 != null) {
                            a3.delete("datalayer", C1642a.m8034a("%s in (%s)", new Object[]{"ID", TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                        }
                    }
                }
            }
        } catch (SQLiteException unused) {
            String str = "Error deleting entries ";
            String valueOf = String.valueOf(Arrays.toString(strArr));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
        } catch (Throwable th) {
            m56555e();
            throw th;
        }
        long j2 = a + j;
        SQLiteDatabase a4 = m56542a("Error opening database for writeEntryToDatabase.");
        if (a4 != null) {
            for (C17041p pVar : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("expires", Long.valueOf(j2));
                contentValues.put("key", pVar.f47721a);
                contentValues.put("value", pVar.f47722b);
                a4.insert("datalayer", null, contentValues);
            }
        }
        m56555e();
    }

    /* renamed from: c */
    private final List<C17041p> m56553c() {
        SQLiteDatabase a = m56542a("Error opening database for loadSerialized.");
        ArrayList arrayList = new ArrayList();
        if (a == null) {
            return arrayList;
        }
        Cursor query = a.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new C17041p(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m56547a(long j) {
        SQLiteDatabase a = m56542a("Error opening database for deleteOlderThan.");
        if (a != null) {
            try {
                int delete = a.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
                StringBuilder sb = new StringBuilder(33);
                sb.append("Deleted ");
                sb.append(delete);
                sb.append(" expired items");
            } catch (SQLiteException unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m56545a(int r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r15 > 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.String r1 = "Error opening database for peekEntryIds."
            android.database.sqlite.SQLiteDatabase r2 = r14.m56542a(r1)
            if (r2 != 0) goto L_0x0011
            return r0
        L_0x0011:
            r1 = 0
            java.lang.String r3 = "datalayer"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0062 }
            java.lang.String r6 = "ID"
            r11 = 0
            r5[r11] = r6     // Catch:{ SQLiteException -> 0x0062 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "%s ASC"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ SQLiteException -> 0x0062 }
            java.lang.String r12 = "ID"
            r4[r11] = r12     // Catch:{ SQLiteException -> 0x0062 }
            java.lang.String r10 = com.C1642a.m8034a(r10, r4)     // Catch:{ SQLiteException -> 0x0062 }
            java.lang.String r15 = java.lang.Integer.toString(r15)     // Catch:{ SQLiteException -> 0x0062 }
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r15
            android.database.Cursor r15 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0062 }
            boolean r1 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            if (r1 == 0) goto L_0x0052
        L_0x0041:
            long r1 = r15.getLong(r11)     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            r0.add(r1)     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            boolean r1 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x005b, all -> 0x0058 }
            if (r1 != 0) goto L_0x0041
        L_0x0052:
            if (r15 == 0) goto L_0x0081
            r15.close()
            goto L_0x0081
        L_0x0058:
            r0 = move-exception
            r1 = r15
            goto L_0x0082
        L_0x005b:
            r1 = move-exception
            r13 = r1
            r1 = r15
            r15 = r13
            goto L_0x0063
        L_0x0060:
            r0 = move-exception
            goto L_0x0082
        L_0x0062:
            r15 = move-exception
        L_0x0063:
            java.lang.String r2 = "Error in peekEntries fetching entryIds: "
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x0060 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0060 }
            int r3 = r15.length()     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0077
            r2.concat(r15)     // Catch:{ all -> 0x0060 }
            goto L_0x007c
        L_0x0077:
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x0060 }
            r15.<init>(r2)     // Catch:{ all -> 0x0060 }
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.close()
        L_0x0081:
            return r0
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r1.close()
        L_0x0087:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C17036k.m56545a(int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m56554d() {
        /*
            r4 = this;
            java.lang.String r0 = "Error opening database for getNumStoredEntries."
            android.database.sqlite.SQLiteDatabase r0 = r4.m56542a(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = 0
            java.lang.String r3 = "SELECT COUNT(*) from datalayer"
            android.database.Cursor r0 = r0.rawQuery(r3, r2)     // Catch:{ SQLiteException -> 0x002c, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x002d, all -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            long r2 = r0.getLong(r1)     // Catch:{ SQLiteException -> 0x002d, all -> 0x0022 }
            int r1 = (int) r2
        L_0x001c:
            if (r0 == 0) goto L_0x0032
            r0.close()
            goto L_0x0032
        L_0x0022:
            r1 = move-exception
            goto L_0x0026
        L_0x0024:
            r1 = move-exception
            r0 = r2
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()
        L_0x002b:
            throw r1
        L_0x002c:
            r0 = r2
        L_0x002d:
            if (r0 == 0) goto L_0x0032
            r0.close()
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C17036k.m56554d():int");
    }

    /* renamed from: a */
    private final SQLiteDatabase m56542a(String str) {
        try {
            return this.f47712d.getWritableDatabase();
        } catch (SQLiteException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private final void m56555e() {
        try {
            this.f47712d.close();
        } catch (SQLiteException unused) {
        }
    }
}
