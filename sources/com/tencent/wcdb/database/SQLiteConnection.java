package com.tencent.wcdb.database;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.support.C46443a;
import com.tencent.wcdb.support.C46443a.C46444a;
import com.tencent.wcdb.support.C46446c;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class SQLiteConnection implements C46444a {

    /* renamed from: a */
    public static final byte[] f119468a = new byte[0];

    /* renamed from: h */
    private static final String[] f119469h = new String[0];

    /* renamed from: i */
    private static final Pattern f119470i = Pattern.compile("[\\s]*\\n+[\\s]*");

    /* renamed from: b */
    public final C46412d f119471b;

    /* renamed from: c */
    public final int f119472c;

    /* renamed from: d */
    public final boolean f119473d;

    /* renamed from: e */
    public final C46404b f119474e = new C46404b();

    /* renamed from: f */
    public int f119475f;

    /* renamed from: g */
    public boolean f119476g;

    /* renamed from: j */
    private final C46419g f119477j;

    /* renamed from: k */
    private final boolean f119478k;

    /* renamed from: l */
    private final C46406d f119479l;

    /* renamed from: m */
    private C46405c f119480m;

    /* renamed from: n */
    private Thread f119481n;

    /* renamed from: o */
    private long f119482o;

    /* renamed from: p */
    private int f119483p;

    /* renamed from: q */
    private byte[] f119484q;

    /* renamed from: r */
    private SQLiteCipherSpec f119485r;

    /* renamed from: s */
    private C46403a f119486s;

    /* renamed from: t */
    private int f119487t;

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$a */
    static final class C46403a {

        /* renamed from: k */
        private static final SimpleDateFormat f119488k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        /* renamed from: a */
        public long f119489a;

        /* renamed from: b */
        public long f119490b;

        /* renamed from: c */
        public String f119491c;

        /* renamed from: d */
        public String f119492d;

        /* renamed from: e */
        public ArrayList<Object> f119493e;

        /* renamed from: f */
        public boolean f119494f;

        /* renamed from: g */
        public Exception f119495g;

        /* renamed from: h */
        public int f119496h;

        /* renamed from: i */
        public int f119497i;

        /* renamed from: j */
        public int f119498j;

        private C46403a() {
        }

        /* renamed from: a */
        private String m145803a() {
            if (!this.f119494f) {
                return "running";
            }
            if (this.f119495g != null) {
                return "failed";
            }
            return "succeeded";
        }

        /* renamed from: a */
        public final void mo115445a(StringBuilder sb, boolean z) {
            sb.append(this.f119491c);
            if (this.f119494f) {
                sb.append(" took ");
                sb.append(this.f119490b - this.f119489a);
                sb.append("ms");
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.f119489a);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(m145803a());
            if (this.f119492d != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.m145769c(this.f119492d));
                sb.append("\"");
            }
            if (this.f119498j > 0) {
                sb.append(", tid=");
                sb.append(this.f119498j);
            }
            if (this.f119495g != null && this.f119495g.getMessage() != null) {
                sb.append(", exception=\"");
                sb.append(this.f119495g.getMessage());
                sb.append("\"");
            }
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$b */
    final class C46404b {

        /* renamed from: b */
        private final C46403a[] f119500b;

        /* renamed from: c */
        private int f119501c;

        /* renamed from: d */
        private int f119502d;

        /* renamed from: a */
        public final String mo115447a() {
            synchronized (this.f119500b) {
                C46403a aVar = this.f119500b[this.f119501c];
                if (aVar == null || aVar.f119494f) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                aVar.mo115445a(sb, false);
                String sb2 = sb.toString();
                return sb2;
            }
        }

        private C46404b() {
            this.f119500b = new C46403a[20];
        }

        /* renamed from: c */
        private int m145807c(int i) {
            int i2 = this.f119502d;
            this.f119502d = i2 + 1;
            return i | (i2 << 8);
        }

        /* renamed from: d */
        private C46403a m145808d(int i) {
            C46403a aVar = this.f119500b[i & NormalGiftView.ALPHA_255];
            if (aVar.f119496h == i) {
                return aVar;
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m145806a(C46403a aVar) {
            if (aVar == null) {
                return false;
            }
            aVar.f119490b = System.currentTimeMillis();
            aVar.f119494f = true;
            if (aVar.f119495g == null || aVar.f119495g.getMessage() == null) {
                return SQLiteDebug.m145869a(aVar.f119490b - aVar.f119489a);
            }
            return true;
        }

        /* JADX INFO: used method not loaded: com.tencent.wcdb.database.d.a(java.lang.String, int, long):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            if ("prepare".equals(r3) != false) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r9.f119499a.f119471b.mo115492a(r2, r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo115451b(int r10) {
            /*
                r9 = this;
                com.tencent.wcdb.database.SQLiteConnection$a[] r0 = r9.f119500b
                monitor-enter(r0)
                com.tencent.wcdb.database.SQLiteConnection$a r10 = r9.m145808d(r10)     // Catch:{ all -> 0x002d }
                if (r10 != 0) goto L_0x000c
                r10 = 0
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return r10
            L_0x000c:
                boolean r1 = m145806a(r10)     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r10.f119492d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r10.f119491c     // Catch:{ all -> 0x002d }
                int r4 = r10.f119497i     // Catch:{ all -> 0x002d }
                long r5 = r10.f119490b     // Catch:{ all -> 0x002d }
                long r7 = r10.f119489a     // Catch:{ all -> 0x002d }
                r10 = 0
                long r5 = r5 - r7
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                java.lang.String r10 = "prepare"
                boolean r10 = r10.equals(r3)
                if (r10 != 0) goto L_0x002c
                com.tencent.wcdb.database.SQLiteConnection r10 = com.tencent.wcdb.database.SQLiteConnection.this
                com.tencent.wcdb.database.d r10 = r10.f119471b
                r10.mo115492a(r2, r4, r5)
            L_0x002c:
                return r1
            L_0x002d:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.C46404b.mo115451b(int):boolean");
        }

        /* renamed from: a */
        public final void mo115448a(int i) {
            String str;
            String str2;
            int i2;
            long j;
            synchronized (this.f119500b) {
                C46403a d = m145808d(i);
                if (m145806a(d)) {
                    m145805a(d, (String) null);
                }
                str = d.f119492d;
                str2 = d.f119491c;
                i2 = d.f119497i;
                j = d.f119490b - d.f119489a;
            }
            if (!"prepare".equals(str2)) {
                SQLiteConnection.this.f119471b.mo115492a(str, i2, j);
            }
        }

        /* renamed from: a */
        public final void mo115449a(int i, Exception exc) {
            synchronized (this.f119500b) {
            }
        }

        /* renamed from: a */
        private static void m145805a(C46403a aVar, String str) {
            StringBuilder sb = new StringBuilder();
            aVar.mo115445a(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            Log.m146014c("WCDB.SQLiteConnection", sb.toString());
        }

        /* renamed from: a */
        public final void mo115450a(int i, String str) {
            synchronized (this.f119500b) {
                C46403a d = m145808d(i);
                if (d != null) {
                    m145805a(d, str);
                }
            }
        }

        /* renamed from: a */
        public final C46403a mo115446a(String str, String str2, Object[] objArr) {
            C46403a aVar;
            synchronized (this.f119500b) {
                int i = (this.f119501c + 1) % 20;
                aVar = this.f119500b[i];
                if (aVar == null) {
                    aVar = new C46403a();
                    this.f119500b[i] = aVar;
                } else {
                    aVar.f119494f = false;
                    aVar.f119495g = null;
                    if (aVar.f119493e != null) {
                        aVar.f119493e.clear();
                    }
                }
                aVar.f119489a = System.currentTimeMillis();
                aVar.f119491c = str;
                aVar.f119492d = str2;
                if (objArr != null) {
                    if (aVar.f119493e == null) {
                        aVar.f119493e = new ArrayList<>();
                    } else {
                        aVar.f119493e.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj == null || !(obj instanceof byte[])) {
                            aVar.f119493e.add(obj);
                        } else {
                            aVar.f119493e.add(SQLiteConnection.f119468a);
                        }
                    }
                }
                aVar.f119496h = m145807c(i);
                aVar.f119498j = SQLiteConnection.this.f119475f;
                this.f119501c = i;
            }
            return aVar;
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$c */
    static final class C46405c {

        /* renamed from: a */
        public C46405c f119503a;

        /* renamed from: b */
        public String f119504b;

        /* renamed from: c */
        public long f119505c;

        /* renamed from: d */
        public int f119506d;

        /* renamed from: e */
        public int f119507e;

        /* renamed from: f */
        public boolean f119508f;

        /* renamed from: g */
        public boolean f119509g;

        /* renamed from: h */
        public boolean f119510h;

        /* renamed from: i */
        private WeakReference<SQLiteConnection> f119511i;

        /* renamed from: j */
        private C46403a f119512j;

        C46405c(SQLiteConnection sQLiteConnection) {
            this.f119511i = new WeakReference<>(sQLiteConnection);
        }

        /* renamed from: a */
        public final void mo115452a(C46443a aVar) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.f119511i.get();
            if (sQLiteConnection != null) {
                sQLiteConnection.mo115430a(aVar);
            }
        }

        /* renamed from: a */
        public final void mo115453a(String str) {
            if (this.f119512j != null) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) this.f119511i.get();
                if (sQLiteConnection != null) {
                    if (sQLiteConnection.f119474e.mo115451b(this.f119512j.f119496h)) {
                        sQLiteConnection.f119474e.mo115450a(this.f119512j.f119496h, (String) null);
                    }
                    this.f119512j = null;
                }
            }
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$d */
    final class C46406d extends C46446c<String, C46405c> {
        public C46406d(int i) {
            super(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo115454a(boolean z, String str, C46405c cVar, C46405c cVar2) {
            cVar.f119509g = false;
            if (!cVar.f119510h) {
                SQLiteConnection.this.mo115437b(cVar);
            }
        }
    }

    /* renamed from: a */
    private static boolean m145767a(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatement(long j, long j2, boolean z);

    private static native long nativeSQLiteHandle(long j, boolean z);

    private static native void nativeSetKey(long j, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j);

    private static native long nativeWalCheckpoint(long j, String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115431a(Exception exc) {
        int i = this.f119487t - 1;
        this.f119487t = i;
        if (i == 0 && this.f119486s != null) {
            nativeSQLiteHandle(this.f119482o, false);
            if (exc == null) {
                this.f119474e.mo115451b(this.f119486s.f119496h);
            } else {
                this.f119474e.mo115449a(this.f119486s.f119496h, exc);
            }
            this.f119486s = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115429a(C46419g gVar) {
        boolean z = false;
        this.f119476g = false;
        int size = gVar.f119586l.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = (SQLiteCustomFunction) gVar.f119586l.get(i);
            if (!this.f119477j.f119586l.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f119482o, sQLiteCustomFunction);
            }
        }
        boolean z2 = ((gVar.f119578d ^ this.f119477j.f119578d) & 536870912) != 0;
        boolean z3 = gVar.f119581g != this.f119477j.f119581g;
        boolean z4 = !gVar.f119580f.equals(this.f119477j.f119580f);
        boolean z5 = gVar.f119582h != this.f119477j.f119582h;
        boolean z6 = gVar.f119583i != this.f119477j.f119583i;
        if (!(gVar.f119584j == this.f119477j.f119584j && gVar.f119585k == this.f119477j.f119585k)) {
            z = true;
        }
        this.f119477j.mo115498a(gVar);
        this.f119479l.mo115551a(gVar.f119579e);
        if (z3) {
            m145779i();
        }
        if (z2) {
            m145780j();
        }
        if (z6) {
            m145781k();
        }
        if (z5) {
            m145777g();
        }
        if (z4) {
            m145782l();
        }
        if (z) {
            m145784n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115434a(Thread thread, int i) {
        this.f119481n = thread;
        this.f119475f = i;
    }

    /* renamed from: a */
    public final void mo115432a(String str, C46429o oVar) {
        C46405c e;
        if (str != null) {
            C46403a a = this.f119474e.mo115446a("prepare", str, null);
            int i = a.f119496h;
            try {
                e = m145774e(str);
                a.f119497i = e.f119507e;
                if (oVar != null) {
                    oVar.f119628a = e.f119506d;
                    oVar.f119630c = e.f119508f;
                    int nativeGetColumnCount = nativeGetColumnCount(this.f119482o, e.f119505c);
                    if (nativeGetColumnCount == 0) {
                        oVar.f119629b = f119469h;
                    } else {
                        oVar.f119629b = new String[nativeGetColumnCount];
                        for (int i2 = 0; i2 < nativeGetColumnCount; i2++) {
                            oVar.f119629b[i2] = nativeGetColumnName(this.f119482o, e.f119505c, i2);
                        }
                    }
                }
                mo115428a(e);
                this.f119474e.mo115448a(i);
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.f119471b != null) {
                        this.f119471b.mo115490a(str);
                    }
                    this.f119474e.mo115449a(i, (Exception) e2);
                    throw e2;
                } catch (Throwable th) {
                    this.f119474e.mo115448a(i);
                    throw th;
                }
            } catch (Throwable th2) {
                mo115428a(e);
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* renamed from: a */
    public final void mo115433a(String str, Object[] objArr, C46443a aVar) {
        if (str != null) {
            C46403a a = this.f119474e.mo115446a("execute", str, objArr);
            int i = a.f119496h;
            try {
                C46405c e = m145774e(str);
                a.f119497i = e.f119507e;
                try {
                    m145770c(e);
                    m145765a(e, objArr);
                    m145768b(aVar);
                    nativeExecute(this.f119482o, e.f119505c);
                    mo115430a(aVar);
                    mo115428a(e);
                    this.f119474e.mo115448a(i);
                } catch (Throwable th) {
                    mo115428a(e);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.f119471b != null) {
                        this.f119471b.mo115490a(str);
                    }
                    this.f119474e.mo115449a(i, (Exception) e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.f119474e.mo115448a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115428a(C46405c cVar) {
        cVar.f119510h = false;
        if (cVar.f119509g) {
            try {
                m145764a(cVar, true);
            } catch (SQLiteException unused) {
                this.f119479l.mo115552b(cVar.f119504b);
            }
        } else {
            mo115437b(cVar);
        }
    }

    /* renamed from: a */
    public final void mo115430a(C46443a aVar) {
        if (aVar != null) {
            this.f119483p--;
            if (this.f119483p == 0) {
                aVar.mo115547a(null);
                nativeResetCancel(this.f119482o, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115427a() {
        m145766a(false);
    }

    /* renamed from: b */
    public final void mo115436b() {
        nativeCancel(this.f119482o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo115439c() {
        return this.f119474e.mo115447a();
    }

    /* renamed from: m */
    private void m145783m() {
        if (this.f119478k) {
            mo115433a("PRAGMA query_only = 1", null, null);
        }
    }

    /* renamed from: n */
    private void m145784n() {
        nativeSetUpdateNotification(this.f119482o, this.f119477j.f119584j, this.f119477j.f119585k);
    }

    /* renamed from: h */
    private void m145778h() {
        if (!this.f119477j.mo115499a() && !this.f119478k && mo115435b("PRAGMA journal_size_limit", null, null) != 524288) {
            mo115435b("PRAGMA journal_size_limit=524288", null, null);
        }
    }

    /* renamed from: j */
    private void m145780j() {
        String str;
        if (!this.f119477j.mo115499a() && !this.f119478k) {
            if ((this.f119477j.f119578d & 536870912) != 0) {
                str = "WAL";
            } else {
                str = "PERSIST";
            }
            m145773d(str);
        }
    }

    /* renamed from: k */
    private void m145781k() {
        int i = this.f119477j.f119583i;
        StringBuilder sb = new StringBuilder("PRAGMA synchronous=");
        sb.append(i);
        mo115433a(sb.toString(), null, null);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (!(this.f119471b == null || this.f119482o == 0)) {
                this.f119471b.mo115486a();
            }
            m145766a(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    private void m145777g() {
        if (!this.f119477j.mo115499a() && !this.f119478k) {
            if (this.f119477j.f119582h) {
                nativeSetWalHook(this.f119482o);
            } else if (mo115435b("PRAGMA wal_autocheckpoint", null, null) != 100) {
                mo115435b("PRAGMA wal_autocheckpoint=100", null, null);
            }
        }
    }

    /* renamed from: i */
    private void m145779i() {
        long j;
        if (!this.f119478k) {
            if (this.f119477j.f119581g) {
                j = 1;
            } else {
                j = 0;
            }
            if (mo115435b("PRAGMA foreign_keys", null, null) != j) {
                StringBuilder sb = new StringBuilder("PRAGMA foreign_keys=");
                sb.append(j);
                mo115433a(sb.toString(), null, null);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteConnection: ");
        sb.append(this.f119477j.f119575a);
        sb.append(" (");
        sb.append(this.f119472c);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: d */
    private void m145771d() {
        this.f119482o = nativeOpen(this.f119477j.f119575a, this.f119477j.f119578d, this.f119477j.f119577c);
        if (this.f119484q != null && this.f119484q.length == 0) {
            this.f119484q = null;
        }
        if (this.f119484q != null) {
            nativeSetKey(this.f119482o, this.f119484q);
            m145776f();
        }
        m145775e();
        m145783m();
        m145779i();
        m145780j();
        m145781k();
        m145778h();
        m145777g();
        m145782l();
        m145784n();
        int size = this.f119477j.f119586l.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.f119482o, (SQLiteCustomFunction) this.f119477j.f119586l.get(i));
        }
    }

    /* renamed from: f */
    private void m145776f() {
        if (this.f119485r != null) {
            if (this.f119485r.cipher != null) {
                StringBuilder sb = new StringBuilder("PRAGMA cipher=");
                sb.append(C46434h.m145972a(this.f119485r.cipher));
                mo115433a(sb.toString(), null, null);
            }
            if (this.f119485r.kdfIteration != 0) {
                StringBuilder sb2 = new StringBuilder("PRAGMA kdf_iter=");
                sb2.append(this.f119485r.kdfIteration);
                mo115433a(sb2.toString(), null, null);
            }
            StringBuilder sb3 = new StringBuilder("PRAGMA cipher_use_hmac=");
            sb3.append(this.f119485r.hmacEnabled);
            mo115433a(sb3.toString(), null, null);
        }
    }

    /* renamed from: e */
    private void m145775e() {
        long j;
        String str;
        int i;
        if (!this.f119477j.mo115499a()) {
            if (this.f119484q != null) {
                str = "PRAGMA cipher_page_size";
                if (this.f119485r == null || this.f119485r.pageSize <= 0) {
                    i = SQLiteGlobal.f119529a;
                } else {
                    i = this.f119485r.pageSize;
                }
                j = (long) i;
            } else {
                str = "PRAGMA page_size";
                j = (long) SQLiteGlobal.f119529a;
            }
            if (mo115435b(str, null, null) != j) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("=");
                sb.append(j);
                mo115433a(sb.toString(), null, null);
            }
        }
    }

    /* renamed from: l */
    private void m145782l() {
        this.f119477j.f119578d |= 16;
        if ((this.f119477j.f119578d & 16) == 0) {
            String locale = this.f119477j.f119580f.toString();
            nativeRegisterLocalizedCollators(this.f119482o, locale);
            if (!this.f119478k) {
                try {
                    mo115433a("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
                    String c = mo115440c("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
                    if (c == null || !c.equals(locale)) {
                        mo115433a("BEGIN", null, null);
                        mo115433a("DELETE FROM android_metadata", null, null);
                        mo115433a("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, null);
                        mo115433a("REINDEX LOCALIZED", null, null);
                        mo115433a("COMMIT", null, null);
                    }
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder("Failed to change locale for db '");
                    sb.append(this.f119477j.f119576b);
                    sb.append("' to '");
                    sb.append(locale);
                    sb.append("'.");
                    throw new SQLiteException(sb.toString(), e);
                } catch (Throwable th) {
                    mo115433a("ROLLBACK", null, null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public static String m145769c(String str) {
        return f119470i.matcher(str).replaceAll(" ");
    }

    /* renamed from: d */
    private void m145772d(C46405c cVar) {
        cVar.f119504b = null;
        cVar.f119503a = this.f119480m;
        this.f119480m = cVar;
    }

    /* renamed from: b */
    public final void mo115437b(C46405c cVar) {
        nativeFinalizeStatement(this.f119482o, cVar.f119505c);
        m145772d(cVar);
    }

    /* renamed from: b */
    private void m145768b(C46443a aVar) {
        if (aVar != null) {
            aVar.mo115546a();
            this.f119483p++;
            if (this.f119483p == 1) {
                nativeResetCancel(this.f119482o, true);
                aVar.mo115547a(this);
            }
        }
    }

    /* renamed from: c */
    private void m145770c(C46405c cVar) {
        if (this.f119476g && !cVar.f119508f) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo115438b(String str) {
        if (this.f119479l.mo115548a(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m145766a(boolean z) {
        if (this.f119482o != 0) {
            int i = this.f119474e.mo115446a("close", null, null).f119496h;
            try {
                this.f119479l.mo115550a();
                nativeClose(this.f119482o);
                this.f119482o = 0;
            } finally {
                this.f119474e.mo115448a(i);
            }
        }
    }

    /* renamed from: e */
    private C46405c m145774e(String str) {
        boolean z;
        C46405c cVar = (C46405c) this.f119479l.mo115548a(str);
        if (cVar == null) {
            z = false;
        } else if (!cVar.f119510h) {
            cVar.f119510h = true;
            return cVar;
        } else {
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.f119482o, str);
        try {
            int nativeGetParameterCount = nativeGetParameterCount(this.f119482o, nativePrepareStatement);
            int b = C46434h.m145979b(str);
            C46405c a = m145762a(str, nativePrepareStatement, nativeGetParameterCount, b, nativeIsReadOnly(this.f119482o, nativePrepareStatement));
            if (!z) {
                try {
                    if (m145767a(b)) {
                        this.f119479l.mo115549a(str, a);
                        a.f119509g = true;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    cVar = a;
                    nativeFinalizeStatement(this.f119482o, nativePrepareStatement);
                    throw e;
                }
            }
            a.f119510h = true;
            return a;
        } catch (RuntimeException e2) {
            e = e2;
            if (cVar == null || !cVar.f119509g) {
                nativeFinalizeStatement(this.f119482o, nativePrepareStatement);
            }
            throw e;
        }
    }

    /* renamed from: d */
    private void m145773d(String str) {
        String c = mo115440c("PRAGMA journal_mode", null, null);
        if (!c.equalsIgnoreCase(str)) {
            try {
                StringBuilder sb = new StringBuilder("PRAGMA journal_mode=");
                sb.append(str);
                if (mo115440c(sb.toString(), null, null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteDatabaseLockedException unused) {
            }
            StringBuilder sb2 = new StringBuilder("Could not change the database journal mode of '");
            sb2.append(this.f119477j.f119576b);
            sb2.append("' from '");
            sb2.append(c);
            sb2.append("' to '");
            sb2.append(str);
            sb2.append("' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
            Log.m146012b("WCDB.SQLiteConnection", sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo115426a(String str) {
        if (this.f119482o == 0) {
            return 0;
        }
        if (str != null && this.f119486s == null) {
            this.f119486s = this.f119474e.mo115446a(str, null, null);
            this.f119486s.f119497i = 99;
        }
        this.f119487t++;
        return nativeSQLiteHandle(this.f119482o, true);
    }

    private void notifyCheckpoint(String str, int i) {
        this.f119471b.mo115491a(str, i);
    }

    /* renamed from: a */
    private void m145764a(C46405c cVar, boolean z) {
        nativeResetStatement(this.f119482o, cVar.f119505c, true);
    }

    /* renamed from: a */
    private void m145765a(C46405c cVar, Object[] objArr) {
        int i;
        long j;
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i != cVar.f119506d) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(cVar.f119506d);
            sb.append(" bind arguments but ");
            sb.append(i);
            sb.append(" were provided.");
            throw new SQLiteBindOrColumnIndexOutOfRangeException(sb.toString());
        } else if (i != 0) {
            long j2 = cVar.f119505c;
            for (int i2 = 0; i2 < i; i2++) {
                Boolean bool = objArr[i2];
                int a = C46434h.m145968a((Object) bool);
                if (a != 4) {
                    switch (a) {
                        case 0:
                            nativeBindNull(this.f119482o, j2, i2 + 1);
                            break;
                        case 1:
                            nativeBindLong(this.f119482o, j2, i2 + 1, ((Number) bool).longValue());
                            break;
                        case 2:
                            nativeBindDouble(this.f119482o, j2, i2 + 1, ((Number) bool).doubleValue());
                            break;
                        default:
                            if (!(bool instanceof Boolean)) {
                                nativeBindString(this.f119482o, j2, i2 + 1, bool.toString());
                                break;
                            } else {
                                long j3 = this.f119482o;
                                int i3 = i2 + 1;
                                if (bool.booleanValue()) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                nativeBindLong(j3, j2, i3, j);
                                break;
                            }
                    }
                } else {
                    nativeBindBlob(this.f119482o, j2, i2 + 1, (byte[]) bool);
                }
            }
        }
    }

    /* renamed from: b */
    public final long mo115435b(String str, Object[] objArr, C46443a aVar) {
        if (str != null) {
            C46403a a = this.f119474e.mo115446a("executeForLong", str, objArr);
            int i = a.f119496h;
            try {
                C46405c e = m145774e(str);
                a.f119497i = e.f119507e;
                try {
                    m145770c(e);
                    m145765a(e, objArr);
                    m145768b(aVar);
                    long nativeExecuteForLong = nativeExecuteForLong(this.f119482o, e.f119505c);
                    mo115430a(aVar);
                    mo115428a(e);
                    this.f119474e.mo115448a(i);
                    return nativeExecuteForLong;
                } catch (Throwable th) {
                    mo115428a(e);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.f119471b != null) {
                        this.f119471b.mo115490a(str);
                    }
                    this.f119474e.mo115449a(i, (Exception) e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.f119474e.mo115448a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* renamed from: c */
    public final String mo115440c(String str, Object[] objArr, C46443a aVar) {
        if (str != null) {
            C46403a a = this.f119474e.mo115446a("executeForString", str, objArr);
            int i = a.f119496h;
            try {
                C46405c e = m145774e(str);
                a.f119497i = e.f119507e;
                try {
                    m145770c(e);
                    m145765a(e, objArr);
                    m145768b(aVar);
                    String nativeExecuteForString = nativeExecuteForString(this.f119482o, e.f119505c);
                    mo115430a(aVar);
                    mo115428a(e);
                    this.f119474e.mo115448a(i);
                    return nativeExecuteForString;
                } catch (Throwable th) {
                    mo115428a(e);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.f119471b != null) {
                        this.f119471b.mo115490a(str);
                    }
                    this.f119474e.mo115449a(i, (Exception) e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.f119474e.mo115448a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo115441d(java.lang.String r9, java.lang.Object[] r10, com.tencent.wcdb.support.C46443a r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0091
            r0 = 0
            com.tencent.wcdb.database.SQLiteConnection$b r1 = r8.f119474e
            java.lang.String r2 = "executeForChangedRowCount"
            com.tencent.wcdb.database.SQLiteConnection$a r1 = r1.mo115446a(r2, r9, r10)
            int r2 = r1.f119496h
            com.tencent.wcdb.database.SQLiteConnection$c r3 = r8.m145774e(r9)     // Catch:{ RuntimeException -> 0x005d }
            int r4 = r3.f119507e     // Catch:{ RuntimeException -> 0x005d }
            r1.f119497i = r4     // Catch:{ RuntimeException -> 0x005d }
            r8.m145770c(r3)     // Catch:{ all -> 0x0056 }
            r8.m145765a(r3, r10)     // Catch:{ all -> 0x0056 }
            r8.m145768b(r11)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f119482o     // Catch:{ all -> 0x0051 }
            long r6 = r3.f119505c     // Catch:{ all -> 0x0051 }
            int r10 = nativeExecuteForChangedRowCount(r4, r6)     // Catch:{ all -> 0x0051 }
            r8.mo115430a(r11)     // Catch:{ all -> 0x004e }
            r8.mo115428a(r3)     // Catch:{ RuntimeException -> 0x004b, all -> 0x0048 }
            com.tencent.wcdb.database.SQLiteConnection$b r9 = r8.f119474e
            boolean r9 = r9.mo115451b(r2)
            if (r9 == 0) goto L_0x0047
            com.tencent.wcdb.database.SQLiteConnection$b r9 = r8.f119474e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "changedRows="
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r9.mo115450a(r2, r11)
        L_0x0047:
            return r10
        L_0x0048:
            r9 = move-exception
            r0 = r10
            goto L_0x0075
        L_0x004b:
            r11 = move-exception
            r0 = r10
            goto L_0x005e
        L_0x004e:
            r11 = move-exception
            r0 = r10
            goto L_0x0057
        L_0x0051:
            r10 = move-exception
            r8.mo115430a(r11)     // Catch:{ all -> 0x0056 }
            throw r10     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r11 = move-exception
        L_0x0057:
            r8.mo115428a(r3)     // Catch:{ RuntimeException -> 0x005d }
            throw r11     // Catch:{ RuntimeException -> 0x005d }
        L_0x005b:
            r9 = move-exception
            goto L_0x0075
        L_0x005d:
            r11 = move-exception
        L_0x005e:
            boolean r10 = r11 instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException     // Catch:{ all -> 0x005b }
            if (r10 != 0) goto L_0x0066
            boolean r10 = r11 instanceof com.tencent.wcdb.database.SQLiteTableLockedException     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x006f
        L_0x0066:
            com.tencent.wcdb.database.d r10 = r8.f119471b     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x006f
            com.tencent.wcdb.database.d r10 = r8.f119471b     // Catch:{ all -> 0x005b }
            r10.mo115490a(r9)     // Catch:{ all -> 0x005b }
        L_0x006f:
            com.tencent.wcdb.database.SQLiteConnection$b r9 = r8.f119474e     // Catch:{ all -> 0x005b }
            r9.mo115449a(r2, r11)     // Catch:{ all -> 0x005b }
            throw r11     // Catch:{ all -> 0x005b }
        L_0x0075:
            com.tencent.wcdb.database.SQLiteConnection$b r10 = r8.f119474e
            boolean r10 = r10.mo115451b(r2)
            if (r10 == 0) goto L_0x0090
            com.tencent.wcdb.database.SQLiteConnection$b r10 = r8.f119474e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "changedRows="
            r11.<init>(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.mo115450a(r2, r11)
        L_0x0090:
            throw r9
        L_0x0091:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "sql must not be null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.mo115441d(java.lang.String, java.lang.Object[], com.tencent.wcdb.support.a):int");
    }

    /* renamed from: e */
    public final long mo115442e(String str, Object[] objArr, C46443a aVar) {
        if (str != null) {
            C46403a a = this.f119474e.mo115446a("executeForLastInsertedRowId", str, objArr);
            int i = a.f119496h;
            try {
                C46405c e = m145774e(str);
                a.f119497i = e.f119507e;
                try {
                    m145770c(e);
                    m145765a(e, objArr);
                    m145768b(aVar);
                    long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.f119482o, e.f119505c);
                    mo115430a(aVar);
                    mo115428a(e);
                    this.f119474e.mo115448a(i);
                    return nativeExecuteForLastInsertedRowId;
                } catch (Throwable th) {
                    mo115428a(e);
                    throw th;
                }
            } catch (RuntimeException e2) {
                try {
                    if (((e2 instanceof SQLiteDatabaseLockedException) || (e2 instanceof SQLiteTableLockedException)) && this.f119471b != null) {
                        this.f119471b.mo115490a(str);
                    }
                    this.f119474e.mo115449a(i, (Exception) e2);
                    throw e2;
                } catch (Throwable th2) {
                    this.f119474e.mo115448a(i);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f119471b.mo115493a(str, str2, jArr, jArr2, jArr3);
    }

    /* renamed from: a */
    private C46405c m145762a(String str, long j, int i, int i2, boolean z) {
        C46405c cVar = this.f119480m;
        if (cVar != null) {
            this.f119480m = cVar.f119503a;
            cVar.f119503a = null;
            cVar.f119509g = false;
        } else {
            cVar = new C46405c(this);
        }
        cVar.f119504b = str;
        cVar.f119505c = j;
        cVar.f119506d = i;
        cVar.f119507e = i2;
        cVar.f119508f = z;
        return cVar;
    }

    private SQLiteConnection(C46412d dVar, C46419g gVar, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2 = null;
        this.f119484q = bArr;
        if (sQLiteCipherSpec != null) {
            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
        }
        this.f119485r = sQLiteCipherSpec2;
        this.f119471b = dVar;
        this.f119477j = new C46419g(gVar);
        this.f119472c = i;
        this.f119473d = z;
        int i2 = gVar.f119578d;
        boolean z2 = true;
        if ((i2 & 1) == 0) {
            z2 = false;
        }
        this.f119478k = z2;
        this.f119479l = new C46406d(this.f119477j.f119579e);
    }

    /* renamed from: a */
    static SQLiteConnection m145763a(C46412d dVar, C46419g gVar, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(dVar, gVar, i, z, bArr, sQLiteCipherSpec);
        try {
            sQLiteConnection.m145771d();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            SQLiteDebug.m145867a(sQLiteConnection);
            sQLiteConnection.m145766a(false);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e6 A[Catch:{ all -> 0x011a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo115425a(java.lang.String r18, java.lang.Object[] r19, com.tencent.wcdb.CursorWindow r20, int r21, int r22, boolean r23, com.tencent.wcdb.support.C46443a r24) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r3 = r20
            r13 = r21
            r14 = r24
            if (r2 == 0) goto L_0x0127
            if (r3 == 0) goto L_0x011f
            r20.mo115483d()
            com.tencent.wcdb.database.SQLiteConnection$b r4 = r1.f119474e     // Catch:{ all -> 0x011a }
            java.lang.String r5 = "executeForCursorWindow"
            com.tencent.wcdb.database.SQLiteConnection$a r4 = r4.mo115446a(r5, r2, r0)     // Catch:{ all -> 0x011a }
            int r15 = r4.f119496h     // Catch:{ all -> 0x011a }
            r16 = -1
            com.tencent.wcdb.database.SQLiteConnection$c r12 = r17.m145774e(r18)     // Catch:{ RuntimeException -> 0x00bf, all -> 0x00ba }
            int r5 = r12.f119507e     // Catch:{ RuntimeException -> 0x00bf, all -> 0x00ba }
            r4.f119497i = r5     // Catch:{ RuntimeException -> 0x00bf, all -> 0x00ba }
            r1.m145770c(r12)     // Catch:{ all -> 0x00b0 }
            r1.m145765a(r12, r0)     // Catch:{ all -> 0x00b0 }
            r1.m145768b(r14)     // Catch:{ all -> 0x00b0 }
            long r4 = r1.f119482o     // Catch:{ all -> 0x00a6 }
            long r6 = r12.f119505c     // Catch:{ all -> 0x00a6 }
            long r8 = r3.f119447a     // Catch:{ all -> 0x00a6 }
            r10 = r21
            r11 = r22
            r2 = r12
            r12 = r23
            long r4 = nativeExecuteForCursorWindow(r4, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x00a4 }
            r0 = 32
            long r6 = r4 >> r0
            int r6 = (int) r6
            int r4 = (int) r4
            int r5 = r20.mo115350b()     // Catch:{ all -> 0x00a0 }
            r3.f119448b = r6     // Catch:{ all -> 0x009c }
            r1.mo115430a(r14)     // Catch:{ all -> 0x0098 }
            r1.mo115428a(r2)     // Catch:{ RuntimeException -> 0x0094, all -> 0x0092 }
            com.tencent.wcdb.database.SQLiteConnection$b r0 = r1.f119474e     // Catch:{ all -> 0x011a }
            boolean r0 = r0.mo115451b(r15)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x008e
            com.tencent.wcdb.database.SQLiteConnection$b r0 = r1.f119474e     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            java.lang.String r7 = "window='"
            r2.<init>(r7)     // Catch:{ all -> 0x011a }
            r2.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r7 = "', startPos="
            r2.append(r7)     // Catch:{ all -> 0x011a }
            r2.append(r13)     // Catch:{ all -> 0x011a }
            java.lang.String r7 = ", actualPos="
            r2.append(r7)     // Catch:{ all -> 0x011a }
            r2.append(r6)     // Catch:{ all -> 0x011a }
            java.lang.String r6 = ", filledRows="
            r2.append(r6)     // Catch:{ all -> 0x011a }
            r2.append(r5)     // Catch:{ all -> 0x011a }
            java.lang.String r5 = ", countedRows="
            r2.append(r5)     // Catch:{ all -> 0x011a }
            r2.append(r4)     // Catch:{ all -> 0x011a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x011a }
            r0.mo115450a(r15, r2)     // Catch:{ all -> 0x011a }
        L_0x008e:
            r20.mo115484e()
            return r4
        L_0x0092:
            r0 = move-exception
            goto L_0x00de
        L_0x0094:
            r0 = move-exception
            r16 = r6
            goto L_0x00c2
        L_0x0098:
            r0 = move-exception
            r16 = r6
            goto L_0x00b4
        L_0x009c:
            r0 = move-exception
            r16 = r6
            goto L_0x00aa
        L_0x00a0:
            r0 = move-exception
            r16 = r6
            goto L_0x00a9
        L_0x00a4:
            r0 = move-exception
            goto L_0x00a8
        L_0x00a6:
            r0 = move-exception
            r2 = r12
        L_0x00a8:
            r4 = -1
        L_0x00a9:
            r5 = -1
        L_0x00aa:
            r1.mo115430a(r14)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b0:
            r0 = move-exception
            r2 = r12
            r4 = -1
            r5 = -1
        L_0x00b4:
            r1.mo115428a(r2)     // Catch:{ RuntimeException -> 0x00b8 }
            throw r0     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            goto L_0x00c2
        L_0x00ba:
            r0 = move-exception
            r4 = -1
            r5 = -1
            r6 = -1
            goto L_0x00de
        L_0x00bf:
            r0 = move-exception
            r4 = -1
            r5 = -1
        L_0x00c2:
            boolean r2 = r0 instanceof com.tencent.wcdb.database.SQLiteDatabaseLockedException     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x00ca
            boolean r2 = r0 instanceof com.tencent.wcdb.database.SQLiteTableLockedException     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00d5
        L_0x00ca:
            com.tencent.wcdb.database.d r2 = r1.f119471b     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00d5
            com.tencent.wcdb.database.d r2 = r1.f119471b     // Catch:{ all -> 0x00db }
            r6 = r18
            r2.mo115490a(r6)     // Catch:{ all -> 0x00db }
        L_0x00d5:
            com.tencent.wcdb.database.SQLiteConnection$b r2 = r1.f119474e     // Catch:{ all -> 0x00db }
            r2.mo115449a(r15, r0)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            r6 = r16
        L_0x00de:
            com.tencent.wcdb.database.SQLiteConnection$b r2 = r1.f119474e     // Catch:{ all -> 0x011a }
            boolean r2 = r2.mo115451b(r15)     // Catch:{ all -> 0x011a }
            if (r2 == 0) goto L_0x0119
            com.tencent.wcdb.database.SQLiteConnection$b r2 = r1.f119474e     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "window='"
            r7.<init>(r8)     // Catch:{ all -> 0x011a }
            r7.append(r3)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = "', startPos="
            r7.append(r8)     // Catch:{ all -> 0x011a }
            r7.append(r13)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = ", actualPos="
            r7.append(r8)     // Catch:{ all -> 0x011a }
            r7.append(r6)     // Catch:{ all -> 0x011a }
            java.lang.String r6 = ", filledRows="
            r7.append(r6)     // Catch:{ all -> 0x011a }
            r7.append(r5)     // Catch:{ all -> 0x011a }
            java.lang.String r5 = ", countedRows="
            r7.append(r5)     // Catch:{ all -> 0x011a }
            r7.append(r4)     // Catch:{ all -> 0x011a }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x011a }
            r2.mo115450a(r15, r4)     // Catch:{ all -> 0x011a }
        L_0x0119:
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r0 = move-exception
            r20.mo115484e()
            throw r0
        L_0x011f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "window must not be null."
            r0.<init>(r2)
            throw r0
        L_0x0127:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "sql must not be null."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.mo115425a(java.lang.String, java.lang.Object[], com.tencent.wcdb.CursorWindow, int, int, boolean, com.tencent.wcdb.support.a):int");
    }
}
