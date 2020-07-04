package com.tencent.wcdb.database;

import android.os.SystemClock;
import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.support.C46443a;
import com.tencent.wcdb.support.Log;
import com.tencent.wcdb.support.OperationCanceledException;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.tencent.wcdb.database.d */
public final class C46412d implements Closeable {

    /* renamed from: e */
    static final /* synthetic */ boolean f119531e = (!C46412d.class.desiredAssertionStatus());

    /* renamed from: a */
    public volatile C46409a f119532a;

    /* renamed from: b */
    public volatile C46430p f119533b;

    /* renamed from: c */
    public volatile C46410b f119534c;

    /* renamed from: d */
    public final Object f119535d = new Object();

    /* renamed from: f */
    private final WeakReference<SQLiteDatabase> f119536f;

    /* renamed from: g */
    private byte[] f119537g;

    /* renamed from: h */
    private SQLiteCipherSpec f119538h;

    /* renamed from: i */
    private final AtomicBoolean f119539i = new AtomicBoolean();

    /* renamed from: j */
    private final C46419g f119540j;

    /* renamed from: k */
    private int f119541k;

    /* renamed from: l */
    private boolean f119542l;

    /* renamed from: m */
    private int f119543m;

    /* renamed from: n */
    private C46415b f119544n;

    /* renamed from: o */
    private C46415b f119545o;

    /* renamed from: p */
    private final ArrayList<SQLiteConnection> f119546p = new ArrayList<>();

    /* renamed from: q */
    private SQLiteConnection f119547q;

    /* renamed from: r */
    private final WeakHashMap<SQLiteConnection, C46414a> f119548r = new WeakHashMap<>();

    /* renamed from: com.tencent.wcdb.database.d$a */
    enum C46414a {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    /* renamed from: com.tencent.wcdb.database.d$b */
    static final class C46415b {

        /* renamed from: a */
        public C46415b f119556a;

        /* renamed from: b */
        public Thread f119557b;

        /* renamed from: c */
        public long f119558c;

        /* renamed from: d */
        public int f119559d;

        /* renamed from: e */
        public boolean f119560e;

        /* renamed from: f */
        public String f119561f;

        /* renamed from: g */
        public int f119562g;

        /* renamed from: h */
        public SQLiteConnection f119563h;

        /* renamed from: i */
        public RuntimeException f119564i;

        /* renamed from: j */
        public int f119565j;

        private C46415b() {
        }
    }

    /* renamed from: b */
    private static int m145883b(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    /* renamed from: a */
    private void m145881a(boolean z) {
        if (!z) {
            synchronized (this.f119535d) {
                m145896i();
                this.f119542l = false;
                m145889c();
                int size = this.f119548r.size();
                if (size != 0) {
                    StringBuilder sb = new StringBuilder("The connection pool for ");
                    sb.append(this.f119540j.f119576b);
                    sb.append(" has been closed but there are still ");
                    sb.append(size);
                    sb.append(" connections in use.  They will be closed as they are released back to the pool.");
                    Log.m146014c("WCDB.SQLiteConnectionPool", sb.toString());
                }
                m145895h();
            }
        }
    }

    /* renamed from: a */
    public final void mo115489a(C46419g gVar) {
        if (gVar != null) {
            synchronized (this.f119535d) {
                m145896i();
                boolean z = ((gVar.f119578d ^ this.f119540j.f119578d) & 536870912) != 0;
                if (z) {
                    if (this.f119548r.isEmpty()) {
                        m145891d();
                    } else {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                if (gVar.f119581g != this.f119540j.f119581g) {
                    if (!this.f119548r.isEmpty()) {
                        throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                }
                if (((this.f119540j.f119578d ^ gVar.f119578d) & 268435473) == 0) {
                    if (C46434h.m145977a((Object) this.f119540j.f119577c, (Object) gVar.f119577c)) {
                        this.f119540j.mo115498a(gVar);
                        m145890c(0);
                        m145892e();
                        m145894g();
                        m145895h();
                    }
                }
                if (z) {
                    m145889c();
                }
                SQLiteConnection a = m145875a(gVar, true);
                m145889c();
                m145893f();
                this.f119547q = a;
                this.f119540j.mo115498a(gVar);
                m145890c(0);
                m145895h();
            }
            return;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    /* renamed from: a */
    public final SQLiteConnection mo115485a(String str, int i, C46443a aVar) {
        SystemClock.uptimeMillis();
        SQLiteConnection b = m145885b(str, i, aVar);
        if (this.f119533b != null) {
            SystemClock.uptimeMillis();
            if (((SQLiteDatabase) this.f119536f.get()) != null) {
                C46430p pVar = this.f119533b;
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo115487a(SQLiteConnection sQLiteConnection) {
        synchronized (this.f119535d) {
            C46414a aVar = (C46414a) this.f119548r.remove(sQLiteConnection);
            if (aVar == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            } else if (!this.f119542l) {
                m145887b(sQLiteConnection);
            } else if (sQLiteConnection.f119473d) {
                if (m145882a(sQLiteConnection, aVar)) {
                    if (!f119531e) {
                        if (this.f119547q != null) {
                            throw new AssertionError();
                        }
                    }
                    this.f119547q = sQLiteConnection;
                }
                m145895h();
            } else if (this.f119546p.size() >= this.f119541k - 1) {
                m145887b(sQLiteConnection);
            } else {
                if (m145882a(sQLiteConnection, aVar)) {
                    this.f119546p.add(sQLiteConnection);
                }
                m145895h();
            }
        }
    }

    /* renamed from: a */
    private boolean m145882a(SQLiteConnection sQLiteConnection, C46414a aVar) {
        if (aVar == C46414a.RECONFIGURE) {
            try {
                sQLiteConnection.mo115429a(this.f119540j);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Failed to reconfigure released connection, closing it: ");
                sb.append(sQLiteConnection);
                Log.m146011a("WCDB.SQLiteConnectionPool", sb.toString(), e);
                aVar = C46414a.DISCARD;
            }
        }
        if (aVar != C46414a.DISCARD) {
            return true;
        }
        m145887b(sQLiteConnection);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115486a() {
        StringBuilder sb = new StringBuilder("A SQLiteConnection object for database '");
        sb.append(this.f119540j.f119576b);
        sb.append("' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        Log.m146012b("WCDB.SQLiteConnectionPool", sb.toString());
        this.f119539i.set(true);
    }

    /* renamed from: a */
    public final void mo115488a(C46415b bVar) {
        if (bVar.f119563h == null && bVar.f119564i == null) {
            C46415b bVar2 = null;
            C46415b bVar3 = this.f119545o;
            while (true) {
                C46415b bVar4 = bVar3;
                C46415b bVar5 = bVar2;
                bVar2 = bVar4;
                if (bVar2 == bVar) {
                    if (bVar5 != null) {
                        bVar5.f119556a = bVar.f119556a;
                    } else {
                        this.f119545o = bVar.f119556a;
                    }
                    bVar.f119564i = new OperationCanceledException();
                    LockSupport.unpark(bVar.f119557b);
                    m145895h();
                    return;
                } else if (f119531e || bVar2 != null) {
                    bVar3 = bVar2.f119556a;
                } else {
                    throw new AssertionError();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115493a(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f119536f.get();
        if (this.f119532a != null && sQLiteDatabase != null) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115492a(String str, int i, long j) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f119536f.get();
        if (this.f119533b != null && sQLiteDatabase != null) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115491a(String str, int i) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f119536f.get();
        if (this.f119534c != null && sQLiteDatabase != null) {
        }
    }

    /* renamed from: f */
    private void m145893f() {
        m145879a(C46414a.DISCARD);
    }

    public final void close() {
        m145881a(false);
    }

    /* renamed from: b */
    private void m145886b() {
        this.f119547q = m145875a(this.f119540j, true);
        this.f119542l = true;
    }

    /* renamed from: c */
    private void m145889c() {
        m145891d();
        if (this.f119547q != null) {
            m145887b(this.f119547q);
            this.f119547q = null;
        }
    }

    /* renamed from: i */
    private void m145896i() {
        if (!this.f119542l) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            m145881a(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: d */
    private void m145891d() {
        int size = this.f119546p.size();
        for (int i = 0; i < size; i++) {
            m145887b((SQLiteConnection) this.f119546p.get(i));
        }
        this.f119546p.clear();
    }

    /* renamed from: e */
    private void m145892e() {
        int size = this.f119546p.size();
        while (true) {
            int i = size - 1;
            if (size > this.f119541k - 1) {
                m145887b((SQLiteConnection) this.f119546p.remove(i));
                size = i;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SQLiteConnectionPool: ");
        sb.append(this.f119540j.f119575a);
        return sb.toString();
    }

    /* renamed from: g */
    private void m145894g() {
        if (this.f119547q != null) {
            try {
                this.f119547q.mo115429a(this.f119540j);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Failed to reconfigure available primary connection, closing it: ");
                sb.append(this.f119547q);
                Log.m146011a("WCDB.SQLiteConnectionPool", sb.toString(), e);
                m145887b(this.f119547q);
                this.f119547q = null;
            }
        }
        int size = this.f119546p.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection = (SQLiteConnection) this.f119546p.get(i);
            try {
                sQLiteConnection.mo115429a(this.f119540j);
            } catch (RuntimeException e2) {
                StringBuilder sb2 = new StringBuilder("Failed to reconfigure available non-primary connection, closing it: ");
                sb2.append(sQLiteConnection);
                Log.m146011a("WCDB.SQLiteConnectionPool", sb2.toString(), e2);
                m145887b(sQLiteConnection);
                int i2 = i - 1;
                this.f119546p.remove(i);
                size--;
                i = i2;
            }
            i++;
        }
        m145879a(C46414a.RECONFIGURE);
    }

    /* renamed from: h */
    private void m145895h() {
        SQLiteConnection sQLiteConnection;
        C46415b bVar = this.f119545o;
        C46415b bVar2 = null;
        boolean z = false;
        boolean z2 = false;
        while (bVar != null) {
            boolean z3 = true;
            if (this.f119542l) {
                try {
                    if (bVar.f119560e || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = m145884b(bVar.f119561f, bVar.f119562g);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2) {
                        sQLiteConnection = m145874a(bVar.f119562g);
                        if (sQLiteConnection == null) {
                            z2 = true;
                        }
                    }
                    if (sQLiteConnection != null) {
                        bVar.f119563h = sQLiteConnection;
                    } else if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e) {
                    bVar.f119564i = e;
                }
            }
            C46415b bVar3 = bVar.f119556a;
            if (z3) {
                if (bVar2 != null) {
                    bVar2.f119556a = bVar3;
                } else {
                    this.f119545o = bVar3;
                }
                bVar.f119556a = null;
                LockSupport.unpark(bVar.f119557b);
            } else {
                bVar2 = bVar;
            }
            bVar = bVar3;
        }
    }

    /* renamed from: a */
    public final void mo115490a(String str) {
        synchronized (this.f119535d) {
            m145880a(str, 0, 0);
        }
    }

    /* renamed from: b */
    private static void m145887b(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.mo115427a();
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Failed to close connection, its fate is now in the hands of the merciful GC: ");
            sb.append(sQLiteConnection);
            sb.append(e.getMessage());
            Log.m146010a("WCDB.SQLiteConnectionPool", sb.toString());
        }
    }

    /* renamed from: a */
    private SQLiteConnection m145874a(int i) {
        SQLiteConnection sQLiteConnection = this.f119547q;
        if (sQLiteConnection != null) {
            this.f119547q = null;
            m145878a(sQLiteConnection, i);
            return sQLiteConnection;
        }
        for (SQLiteConnection sQLiteConnection2 : this.f119548r.keySet()) {
            if (sQLiteConnection2.f119473d) {
                return null;
            }
        }
        SQLiteConnection a = m145875a(this.f119540j, true);
        m145878a(a, i);
        return a;
    }

    /* renamed from: b */
    private void m145888b(C46415b bVar) {
        bVar.f119556a = this.f119544n;
        bVar.f119557b = null;
        bVar.f119561f = null;
        bVar.f119563h = null;
        bVar.f119564i = null;
        bVar.f119565j++;
        this.f119544n = bVar;
    }

    /* renamed from: c */
    private void m145890c(int i) {
        if (i <= 0) {
            if ((this.f119540j.f119578d & 536870912) != 0) {
                i = 4;
            } else {
                i = 1;
            }
        }
        this.f119541k = i;
        Log.m146015c("WCDB.SQLiteConnectionPool", "Max connection pool size is %d.", Integer.valueOf(this.f119541k));
    }

    /* renamed from: a */
    private void m145879a(C46414a aVar) {
        if (!this.f119548r.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f119548r.size());
            for (Entry entry : this.f119548r.entrySet()) {
                C46414a aVar2 = (C46414a) entry.getValue();
                if (!(aVar == aVar2 || aVar2 == C46414a.DISCARD)) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f119548r.put(arrayList.get(i), aVar);
            }
        }
    }

    /* renamed from: a */
    private SQLiteConnection m145875a(C46419g gVar, boolean z) {
        int i = this.f119543m;
        this.f119543m = i + 1;
        return SQLiteConnection.m145763a(this, gVar, i, z, this.f119537g, this.f119538h);
    }

    /* renamed from: b */
    private SQLiteConnection m145884b(String str, int i) {
        int size = this.f119546p.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = (SQLiteConnection) this.f119546p.get(i2);
                if (sQLiteConnection.mo115438b(str)) {
                    this.f119546p.remove(i2);
                    m145878a(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) this.f119546p.remove(size - 1);
            m145878a(sQLiteConnection2, i);
            return sQLiteConnection2;
        }
        int size2 = this.f119548r.size();
        if (this.f119547q != null) {
            size2++;
        }
        if (size2 >= this.f119541k) {
            return null;
        }
        SQLiteConnection a = m145875a(this.f119540j, false);
        m145878a(a, i);
        return a;
    }

    /* renamed from: a */
    private void m145878a(SQLiteConnection sQLiteConnection, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.f119476g = z;
            this.f119548r.put(sQLiteConnection, C46414a.NORMAL);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Failed to prepare acquired connection for session, closing it: ");
            sb.append(sQLiteConnection);
            sb.append(", connectionFlags=");
            sb.append(i);
            Log.m146010a("WCDB.SQLiteConnectionPool", sb.toString());
            m145887b(sQLiteConnection);
            throw e;
        }
    }

    private C46412d(SQLiteDatabase sQLiteDatabase, C46419g gVar, int i) {
        this.f119536f = new WeakReference<>(sQLiteDatabase);
        this.f119540j = new C46419g(gVar);
        m145890c(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r10 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r10.mo115547a(new com.tencent.wcdb.database.C46412d.C464131(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6 = r1.f119558c + 3000;
        r2 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r9.f119539i.compareAndSet(true, false) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        r8 = r9.f119535d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        m145895h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0081, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r2 * 1000000);
        java.lang.Thread.interrupted();
        r2 = r9.f119535d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        m145896i();
        r3 = r1.f119563h;
        r8 = r1.f119564i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009b, code lost:
        if (r3 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
        if (r8 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
        r15 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a6, code lost:
        if (r15 >= r6) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a8, code lost:
        r15 = r15 - r6;
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ac, code lost:
        m145880a(r19, r15 - r1.f119558c, r0);
        r6 = r15 + 3000;
        r15 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bb, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00bd, code lost:
        m145888b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c0, code lost:
        if (r3 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c3, code lost:
        if (r10 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c5, code lost:
        r10.mo115547a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ce, code lost:
        if (r10 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d0, code lost:
        r10.mo115547a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d3, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection m145885b(java.lang.String r19, int r20, com.tencent.wcdb.support.C46443a r21) {
        /*
            r18 = this;
            r9 = r18
            r0 = r20
            r10 = r21
            r1 = r0 & 2
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x000e
            r6 = 1
            goto L_0x000f
        L_0x000e:
            r6 = 0
        L_0x000f:
            java.lang.Object r13 = r9.f119535d
            monitor-enter(r13)
            r18.m145896i()     // Catch:{ all -> 0x00d4 }
            if (r10 == 0) goto L_0x001a
            r21.mo115546a()     // Catch:{ all -> 0x00d4 }
        L_0x001a:
            r14 = 0
            if (r6 != 0) goto L_0x0022
            com.tencent.wcdb.database.SQLiteConnection r1 = r18.m145884b(r19, r20)     // Catch:{ all -> 0x00d4 }
            goto L_0x0023
        L_0x0022:
            r1 = r14
        L_0x0023:
            if (r1 != 0) goto L_0x0029
            com.tencent.wcdb.database.SQLiteConnection r1 = r9.m145874a(r0)     // Catch:{ all -> 0x00d4 }
        L_0x0029:
            if (r1 == 0) goto L_0x002d
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            return r1
        L_0x002d:
            int r15 = m145883b(r20)     // Catch:{ all -> 0x00d4 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00d4 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d4 }
            r1 = r18
            r5 = r15
            r7 = r19
            r8 = r20
            com.tencent.wcdb.database.d$b r1 = r1.m145876a(r2, r3, r5, r6, r7, r8)     // Catch:{ all -> 0x00d4 }
            com.tencent.wcdb.database.d$b r2 = r9.f119545o     // Catch:{ all -> 0x00d4 }
            r3 = r14
        L_0x0047:
            if (r2 == 0) goto L_0x0058
            int r4 = r2.f119559d     // Catch:{ all -> 0x00d4 }
            if (r15 <= r4) goto L_0x0050
            r1.f119556a = r2     // Catch:{ all -> 0x00d4 }
            goto L_0x0058
        L_0x0050:
            com.tencent.wcdb.database.d$b r3 = r2.f119556a     // Catch:{ all -> 0x00d4 }
            r17 = r3
            r3 = r2
            r2 = r17
            goto L_0x0047
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            r3.f119556a = r1     // Catch:{ all -> 0x00d4 }
            goto L_0x005f
        L_0x005d:
            r9.f119545o = r1     // Catch:{ all -> 0x00d4 }
        L_0x005f:
            int r2 = r1.f119565j     // Catch:{ all -> 0x00d4 }
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            if (r10 == 0) goto L_0x006c
            com.tencent.wcdb.database.d$1 r3 = new com.tencent.wcdb.database.d$1
            r3.<init>(r1, r2)
            r10.mo115547a(r3)
        L_0x006c:
            long r2 = r1.f119558c     // Catch:{ all -> 0x00cd }
            r4 = 3000(0xbb8, double:1.482E-320)
            long r2 = r2 + r4
            r6 = r2
            r2 = r4
        L_0x0073:
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.f119539i     // Catch:{ all -> 0x00cd }
            boolean r8 = r8.compareAndSet(r12, r11)     // Catch:{ all -> 0x00cd }
            if (r8 == 0) goto L_0x0086
            java.lang.Object r8 = r9.f119535d     // Catch:{ all -> 0x00cd }
            monitor-enter(r8)     // Catch:{ all -> 0x00cd }
            r18.m145895h()     // Catch:{ all -> 0x0083 }
            monitor-exit(r8)     // Catch:{ all -> 0x0083 }
            goto L_0x0086
        L_0x0083:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x0086:
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r15
            java.util.concurrent.locks.LockSupport.parkNanos(r2)     // Catch:{ all -> 0x00cd }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x00cd }
            java.lang.Object r2 = r9.f119535d     // Catch:{ all -> 0x00cd }
            monitor-enter(r2)     // Catch:{ all -> 0x00cd }
            r18.m145896i()     // Catch:{ all -> 0x00ca }
            com.tencent.wcdb.database.SQLiteConnection r3 = r1.f119563h     // Catch:{ all -> 0x00ca }
            java.lang.RuntimeException r8 = r1.f119564i     // Catch:{ all -> 0x00ca }
            if (r3 != 0) goto L_0x00bd
            if (r8 == 0) goto L_0x00a0
            goto L_0x00bd
        L_0x00a0:
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00ca }
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ac
            long r15 = r15 - r6
            r3 = r19
            goto L_0x00ba
        L_0x00ac:
            long r6 = r1.f119558c     // Catch:{ all -> 0x00ca }
            r3 = 0
            long r6 = r15 - r6
            r3 = r19
            r9.m145880a(r3, r6, r0)     // Catch:{ all -> 0x00ca }
            r6 = 0
            long r15 = r15 + r4
            r6 = r15
            r15 = r4
        L_0x00ba:
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            r2 = r15
            goto L_0x0073
        L_0x00bd:
            r9.m145888b(r1)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00c9
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            if (r10 == 0) goto L_0x00c8
            r10.mo115547a(r14)
        L_0x00c8:
            return r3
        L_0x00c9:
            throw r8     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            if (r10 == 0) goto L_0x00d3
            r10.mo115547a(r14)
        L_0x00d3:
            throw r0
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00d4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.C46412d.m145885b(java.lang.String, int, com.tencent.wcdb.support.a):com.tencent.wcdb.database.SQLiteConnection");
    }

    /* renamed from: a */
    private void m145880a(String str, long j, int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread currentThread = Thread.currentThread();
            sb.append("The connection pool for database '");
            sb.append(this.f119540j.f119576b);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(currentThread.getId());
            sb.append(" (");
            sb.append(currentThread.getName());
            sb.append(") ");
            sb.append("with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(((float) j) * 0.001f);
            sb.append(" seconds.\n");
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (!this.f119548r.isEmpty()) {
            i2 = 0;
            for (SQLiteConnection c : this.f119548r.keySet()) {
                String c2 = c.mo115439c();
                if (c2 != null) {
                    arrayList.add(c2);
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        int size = this.f119546p.size();
        if (this.f119547q != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i3);
        sb.append(" active, ");
        sb.append(i2);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                sb.append("  ");
                sb.append(str2);
                sb.append("\n");
            }
        }
        Log.m146012b("WCDB.SQLiteConnectionPool", sb.toString());
        if (((SQLiteDatabase) this.f119536f.get()) != null && this.f119533b != null) {
            C46430p pVar = this.f119533b;
        }
    }

    /* renamed from: a */
    public static C46412d m145877a(SQLiteDatabase sQLiteDatabase, C46419g gVar, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (gVar != null) {
            C46412d dVar = new C46412d(sQLiteDatabase, gVar, i);
            dVar.f119537g = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            dVar.f119538h = sQLiteCipherSpec2;
            dVar.m145886b();
            return dVar;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    /* renamed from: a */
    private C46415b m145876a(Thread thread, long j, int i, boolean z, String str, int i2) {
        C46415b bVar = this.f119544n;
        if (bVar != null) {
            this.f119544n = bVar.f119556a;
            bVar.f119556a = null;
        } else {
            bVar = new C46415b();
        }
        bVar.f119557b = thread;
        bVar.f119558c = j;
        bVar.f119559d = i;
        bVar.f119560e = z;
        bVar.f119561f = str;
        bVar.f119562g = i2;
        return bVar;
    }
}
