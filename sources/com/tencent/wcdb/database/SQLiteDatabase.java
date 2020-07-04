package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.wcdb.C46432f;
import com.tencent.wcdb.C46433g;
import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.C46435i;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.support.C46443a;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends C46411c {

    /* renamed from: a */
    static final /* synthetic */ boolean f119514a = (!SQLiteDatabase.class.desiredAssertionStatus());

    /* renamed from: b */
    private static final WeakHashMap<SQLiteDatabase, Object> f119515b = new WeakHashMap<>();

    /* renamed from: j */
    private static final String[] f119516j = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c */
    private final ThreadLocal<C46425m> f119517c = new ThreadLocal<C46425m>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C46425m initialValue() {
            return SQLiteDatabase.this.mo115466f();
        }
    };

    /* renamed from: d */
    private final C46408a f119518d;

    /* renamed from: e */
    private final C46433g f119519e;

    /* renamed from: f */
    private final Object f119520f = new Object();

    /* renamed from: g */
    private final C46419g f119521g;

    /* renamed from: h */
    private C46412d f119522h;

    /* renamed from: i */
    private boolean f119523i;

    public interface CustomFunction {
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$a */
    public interface C46408a {
        /* renamed from: a */
        C46423k mo27335a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C46443a aVar);

        /* renamed from: a */
        C46432f mo27336a(SQLiteDatabase sQLiteDatabase, C46418f fVar, String str, C46423k kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115461a() {
        this.f119519e.mo27338a(this);
    }

    /* renamed from: a */
    private void m145831a(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        mo115483d();
        try {
            mo115464b().mo115515a(2, (SQLiteTransactionListener) null, m145821a(false), (C46443a) null);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: a */
    private static SQLiteDatabase m145828a(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C46408a aVar, C46433g gVar, int i) {
        return m145827a(str, bArr, sQLiteCipherSpec, aVar, 268435456, gVar, 0);
    }

    /* JADX INFO: used method not loaded: com.tencent.wcdb.support.Log.a(java.lang.String, java.lang.String, java.lang.Object[]):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        mo115461a();
        m145834b(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r3 = new java.lang.StringBuilder("Failed to open database '");
        r3.append(m145835r());
        r3.append("'.");
        com.tencent.wcdb.support.Log.m146011a("WCDB.SQLiteDatabase", r3.toString(), r2);
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0006 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m145832a(byte[] r2, com.tencent.wcdb.database.SQLiteCipherSpec r3, int r4) {
        /*
            r1 = this;
            r1.m145834b(r2, r3, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0006 }
            return
        L_0x0004:
            r2 = move-exception
            goto L_0x000d
        L_0x0006:
            r1.mo115461a()     // Catch:{ SQLiteException -> 0x0004 }
            r1.m145834b(r2, r3, r4)     // Catch:{ SQLiteException -> 0x0004 }
            return
        L_0x000d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to open database '"
            r3.<init>(r4)
            java.lang.String r4 = r1.m145835r()
            r3.append(r4)
            java.lang.String r4 = "'."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            com.tencent.wcdb.support.Log.m146011a(r0, r3, r4)
            r1.close()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.m145832a(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    /* renamed from: a */
    public final void mo115462a(int i) {
        StringBuilder sb = new StringBuilder("PRAGMA user_version = ");
        sb.append(i);
        mo115465b(sb.toString());
    }

    /* renamed from: a */
    public final C46428n mo115459a(String str) throws SQLException {
        mo115483d();
        try {
            return new C46428n(this, str, null);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: a */
    public final C46432f mo115460a(String str, Object[] objArr) {
        return m145829a((C46408a) null, str, objArr, (String) null, (C46443a) null);
    }

    /* renamed from: a */
    private C46432f m145829a(C46408a aVar, String str, Object[] objArr, String str2, C46443a aVar2) {
        mo115483d();
        try {
            return new C46420h(this, str, null, null).mo115497a(this.f119518d, objArr);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: a */
    public final long mo115457a(String str, String str2, ContentValues contentValues) {
        try {
            return m145822a(str, str2, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLException e2) {
            Log.m146011a("WCDB.SQLiteDatabase", "Error inserting %s: %s", contentValues, e2);
            return -1;
        }
    }

    /* renamed from: a */
    private static Set<String> m145830a(ContentValues contentValues) {
        if (VERSION.SDK_INT >= 11) {
            return contentValues.keySet();
        }
        try {
            Field declaredField = Class.forName("android.content.ContentValues").getDeclaredField("mValues");
            declaredField.setAccessible(true);
            return ((HashMap) declaredField.get(contentValues)).keySet();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final int mo115456a(String str, String str2, String[] strArr) {
        C46428n nVar;
        String str3;
        mo115483d();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder(" WHERE ");
                sb2.append(str2);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            sb.append(str3);
            nVar = new C46428n(this, sb.toString(), strArr);
            int g = nVar.mo115526g();
            nVar.close();
            mo115484e();
            return g;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo115455a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return m145819a(str, contentValues, str2, strArr, 0);
    }

    /* renamed from: a */
    public final long mo115458a(String str, boolean z, boolean z2) {
        long a = mo115464b().mo115514a(z ? 1 : 2).mo115426a(str);
        if (a != 0) {
            return a;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    /* renamed from: a */
    public final void mo115463a(long j, Exception exc) {
        mo115464b().mo115518a((Exception) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo115353c() {
        m145833b(false);
    }

    /* renamed from: g */
    public final void mo115468g() {
        m145831a((SQLiteTransactionListener) null, true);
    }

    /* renamed from: r */
    private String m145835r() {
        String str;
        synchronized (this.f119520f) {
            str = this.f119521g.f119576b;
        }
        return str;
    }

    /* renamed from: s */
    private static boolean m145836s() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != Looper.getMainLooper()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private boolean m145837t() {
        if ((this.f119521g.f119578d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C46425m mo115464b() {
        return (C46425m) this.f119517c.get();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            m145833b(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: l */
    public final int mo115473l() {
        return Long.valueOf(C46434h.m145970a(this, "PRAGMA user_version;", (String[]) null)).intValue();
    }

    /* renamed from: m */
    public final boolean mo115474m() {
        boolean t;
        synchronized (this.f119520f) {
            t = m145837t();
        }
        return t;
    }

    /* renamed from: n */
    public final boolean mo115475n() {
        boolean z;
        synchronized (this.f119520f) {
            if (this.f119522h != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: o */
    public final String mo115476o() {
        String str;
        synchronized (this.f119520f) {
            str = this.f119521g.f119575a;
        }
        return str;
    }

    /* renamed from: p */
    public final C46430p mo115477p() {
        C46430p pVar;
        synchronized (this.f119520f) {
            m145839v();
            pVar = this.f119522h.f119533b;
        }
        return pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C46425m mo115466f() {
        C46412d dVar;
        synchronized (this.f119520f) {
            m145839v();
            dVar = this.f119522h;
        }
        return new C46425m(dVar);
    }

    /* renamed from: h */
    public final void mo115469h() {
        mo115483d();
        try {
            mo115464b().mo115517a((C46443a) null);
        } finally {
            mo115484e();
        }
    }

    /* renamed from: i */
    public final void mo115470i() {
        mo115483d();
        try {
            mo115464b().mo115522b();
        } finally {
            mo115484e();
        }
    }

    /* renamed from: j */
    public final boolean mo115471j() {
        mo115483d();
        try {
            return mo115464b().mo115520a();
        } finally {
            mo115484e();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteDatabase: ");
        sb.append(mo115476o());
        return sb.toString();
    }

    static {
        SQLiteGlobal.loadLib();
    }

    /* renamed from: u */
    private void m145838u() {
        synchronized (this.f119520f) {
            m145839v();
            if ((this.f119521g.f119578d & 536870912) != 0) {
                this.f119521g.f119578d &= -536870913;
                try {
                    this.f119522h.mo115489a(this.f119521g);
                } catch (RuntimeException e) {
                    C46419g gVar = this.f119521g;
                    gVar.f119578d = 536870912 | gVar.f119578d;
                    throw e;
                }
            }
        }
    }

    /* renamed from: v */
    private void m145839v() {
        if (this.f119522h == null) {
            StringBuilder sb = new StringBuilder("The database '");
            sb.append(this.f119521g.f119576b);
            sb.append("' is not open.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: k */
    public final void mo115472k() {
        synchronized (this.f119520f) {
            m145839v();
            if (m145837t()) {
                int i = this.f119521g.f119578d;
                this.f119521g.f119578d = (this.f119521g.f119578d & -2) | 0;
                try {
                    this.f119522h.mo115489a(this.f119521g);
                } catch (RuntimeException e) {
                    this.f119521g.f119578d = i;
                    throw e;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = mo115460a("pragma database_list;", (java.lang.Object[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1.moveToNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r0.add(new android.util.Pair(r1.getString(1), r1.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        mo115484e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        if (r1 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
        mo115484e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[SYNTHETIC, Splitter:B:30:0x0055] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> mo115478q() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f119520f
            monitor-enter(r1)
            com.tencent.wcdb.database.d r2 = r5.f119522h     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return r3
        L_0x000f:
            boolean r2 = r5.f119523i     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0023
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "main"
            com.tencent.wcdb.database.g r4 = r5.f119521g     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r4.f119575a     // Catch:{ all -> 0x0060 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            r0.add(r2)     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            return r0
        L_0x0023:
            r5.mo115483d()     // Catch:{ all -> 0x0060 }
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "pragma database_list;"
            com.tencent.wcdb.f r1 = r5.mo115460a(r1, r3)     // Catch:{ all -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0046
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x004f }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x004f }
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch:{ all -> 0x004f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x004f }
            r0.add(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002d
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x004b:
            r5.mo115484e()
            return r0
        L_0x004f:
            r0 = move-exception
            goto L_0x0053
        L_0x0051:
            r0 = move-exception
            r1 = r3
        L_0x0053:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            goto L_0x005c
        L_0x005b:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x005c:
            r5.mo115484e()
            throw r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0060 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.mo115478q():java.util.List");
    }

    /* renamed from: b */
    public final void mo115465b(String str) throws SQLException {
        m145820a(str, (Object[]) null, (C46443a) null);
    }

    /* renamed from: a */
    static int m145821a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        if (m145836s()) {
            return i | 4;
        }
        return i;
    }

    /* renamed from: a */
    public static SQLiteDatabase m145823a(C46408a aVar) {
        return m145825a(":memory:", (C46408a) null, 268435456);
    }

    /* renamed from: b */
    private void m145833b(boolean z) {
        C46412d dVar;
        synchronized (this.f119520f) {
            dVar = this.f119522h;
            this.f119522h = null;
        }
        if (!z) {
            synchronized (f119515b) {
                f119515b.remove(this);
            }
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    /* renamed from: a */
    private static SQLiteDatabase m145825a(String str, C46408a aVar, int i) {
        return m145826a(str, aVar, 268435456, (C46433g) null);
    }

    /* renamed from: a */
    private int m145820a(String str, Object[] objArr, C46443a aVar) throws SQLException {
        C46428n nVar;
        mo115483d();
        try {
            if (C46434h.m145979b(str) == 3) {
                boolean z = false;
                synchronized (this.f119520f) {
                    if (!this.f119523i) {
                        this.f119523i = true;
                        z = true;
                    }
                }
                if (z) {
                    m145838u();
                }
            }
            nVar = new C46428n(this, str, null);
            int a = nVar.mo115525a(null);
            nVar.close();
            mo115484e();
            return a;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: b */
    private void m145834b(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        synchronized (this.f119520f) {
            if (!f119514a) {
                if (this.f119522h != null) {
                    throw new AssertionError();
                }
            }
            this.f119522h = C46412d.m145877a(this, this.f119521g, bArr, sQLiteCipherSpec, i);
        }
        synchronized (f119515b) {
            f119515b.put(this, null);
        }
    }

    private SQLiteDatabase(String str, int i, C46408a aVar, C46433g gVar) {
        this.f119518d = aVar;
        if (gVar == null) {
            gVar = new C46435i(true);
        }
        this.f119519e = gVar;
        this.f119521g = new C46419g(str, i);
    }

    /* renamed from: a */
    private long m145822a(String str, String str2, ContentValues contentValues, int i) {
        int i2;
        C46428n nVar;
        String str3;
        String str4;
        mo115483d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(f119516j[0]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            if (contentValues == null || contentValues.size() <= 0) {
                i2 = 0;
            } else {
                i2 = contentValues.size();
            }
            if (i2 > 0) {
                objArr = new Object[i2];
                int i3 = 0;
                for (String str5 : m145830a(contentValues)) {
                    if (i3 > 0) {
                        str4 = ",";
                    } else {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(str5);
                    int i4 = i3 + 1;
                    objArr[i3] = contentValues.get(str5);
                    i3 = i4;
                }
                sb.append(')');
                sb.append(" VALUES (");
                for (int i5 = 0; i5 < i2; i5++) {
                    if (i5 > 0) {
                        str3 = ",?";
                    } else {
                        str3 = "?";
                    }
                    sb.append(str3);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(") VALUES (NULL");
                sb.append(sb2.toString());
            }
            sb.append(')');
            nVar = new C46428n(this, sb.toString(), objArr);
            long h = nVar.mo115527h();
            nVar.close();
            mo115484e();
            return h;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: a */
    private static SQLiteDatabase m145826a(String str, C46408a aVar, int i, C46433g gVar) {
        return m145827a(str, null, null, aVar, i, null, 0);
    }

    /* renamed from: a */
    public static SQLiteDatabase m145824a(File file, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C46408a aVar, C46433g gVar) {
        return m145828a(file.getPath(), bArr, null, null, gVar, 0);
    }

    /* renamed from: a */
    private int m145819a(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        int i2;
        C46428n nVar;
        String str3;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        mo115483d();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            int i3 = 0;
            sb.append(f119516j[0]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                i2 = size;
            } else {
                i2 = strArr.length + size;
            }
            Object[] objArr = new Object[i2];
            for (String str4 : m145830a(contentValues)) {
                if (i3 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(str4);
                int i4 = i3 + 1;
                objArr[i3] = contentValues.get(str4);
                sb.append("=?");
                i3 = i4;
            }
            if (strArr != null) {
                for (int i5 = size; i5 < i2; i5++) {
                    objArr[i5] = strArr[i5 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            nVar = new C46428n(this, sb.toString(), objArr);
            int g = nVar.mo115526g();
            nVar.close();
            mo115484e();
            return g;
        } catch (Throwable th) {
            mo115484e();
            throw th;
        }
    }

    /* renamed from: a */
    public static SQLiteDatabase m145827a(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C46408a aVar, int i, C46433g gVar, int i2) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i, aVar, gVar);
        sQLiteDatabase.m145832a(bArr, sQLiteCipherSpec, i2);
        return sQLiteDatabase;
    }
}
