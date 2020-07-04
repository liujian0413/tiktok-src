package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Process;
import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.C46443a;

/* renamed from: com.tencent.wcdb.database.m */
public final class C46425m {

    /* renamed from: a */
    static final /* synthetic */ boolean f119616a = (!C46425m.class.desiredAssertionStatus());

    /* renamed from: b */
    private final C46412d f119617b;

    /* renamed from: c */
    private SQLiteConnection f119618c;

    /* renamed from: d */
    private int f119619d;

    /* renamed from: e */
    private int f119620e;

    /* renamed from: f */
    private C46427a f119621f;

    /* renamed from: g */
    private C46427a f119622g;

    /* renamed from: com.tencent.wcdb.database.m$a */
    static final class C46427a {

        /* renamed from: a */
        public C46427a f119623a;

        /* renamed from: b */
        public int f119624b;

        /* renamed from: c */
        public SQLiteTransactionListener f119625c;

        /* renamed from: d */
        public boolean f119626d;

        /* renamed from: e */
        public boolean f119627e;

        private C46427a() {
        }
    }

    /* renamed from: a */
    public final boolean mo115520a() {
        return this.f119622g != null;
    }

    /* renamed from: a */
    public final void mo115517a(C46443a aVar) {
        m145942d();
        if (f119616a || this.f119618c != null) {
            m145938a(aVar, false);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final void mo115519a(String str, int i, C46443a aVar, C46429o oVar) {
        if (str != null) {
            if (aVar != null) {
                aVar.mo115546a();
            }
            m145939a(str, i, aVar);
            try {
                this.f119618c.mo115432a(str, oVar);
            } finally {
                m145941c();
            }
        } else {
            throw new IllegalArgumentException("sql must not be null.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115518a(Exception exc) {
        if (this.f119618c != null) {
            this.f119618c.mo115431a(exc);
        }
        m145941c();
    }

    /* renamed from: d */
    private void m145942d() {
        if (this.f119622g == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    /* renamed from: b */
    public final void mo115522b() {
        m145942d();
        m145943e();
        this.f119622g.f119626d = true;
    }

    /* renamed from: c */
    private void m145941c() {
        int i = this.f119620e - 1;
        this.f119620e = i;
        if (i == 0) {
            try {
                this.f119618c.mo115434a((Thread) null, 0);
                this.f119617b.mo115487a(this.f119618c);
            } finally {
                this.f119618c = null;
            }
        }
    }

    /* renamed from: e */
    private void m145943e() {
        if (this.f119622g != null && this.f119622g.f119626d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SQLiteConnection mo115514a(int i) {
        m145939a(null, i, null);
        return this.f119618c;
    }

    public C46425m(C46412d dVar) {
        if (dVar != null) {
            this.f119617b = dVar;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    /* renamed from: a */
    private void m145937a(C46427a aVar) {
        aVar.f119623a = this.f119621f;
        aVar.f119625c = null;
        this.f119621f = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115516a(C46405c cVar) {
        if (this.f119618c != null) {
            this.f119618c.mo115428a(cVar);
            m145941c();
        }
    }

    /* renamed from: a */
    private C46427a m145936a(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        C46427a aVar = this.f119621f;
        if (aVar != null) {
            this.f119621f = aVar.f119623a;
            aVar.f119623a = null;
            aVar.f119626d = false;
            aVar.f119627e = false;
        } else {
            aVar = new C46427a();
        }
        aVar.f119624b = i;
        aVar.f119625c = sQLiteTransactionListener;
        return aVar;
    }

    /* renamed from: a */
    private void m145938a(C46443a aVar, boolean z) {
        boolean z2;
        Throwable th;
        if (aVar != null) {
            aVar.mo115546a();
        }
        C46427a aVar2 = this.f119622g;
        if (!aVar2.f119626d || aVar2.f119627e) {
            z2 = false;
        } else {
            z2 = true;
        }
        SQLiteTransactionListener sQLiteTransactionListener = aVar2.f119625c;
        if (sQLiteTransactionListener != null) {
            if (z2) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e) {
                    th = e;
                    z2 = false;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        th = null;
        this.f119622g = aVar2.f119623a;
        m145937a(aVar2);
        if (this.f119622g == null) {
            if (z2) {
                try {
                    this.f119618c.mo115433a("COMMIT;", null, aVar);
                } catch (Throwable th2) {
                    m145941c();
                    throw th2;
                }
            } else {
                this.f119618c.mo115433a("ROLLBACK;", null, aVar);
            }
            m145941c();
        } else if (!z2) {
            this.f119622g.f119627e = true;
        }
        if (th != null) {
            throw th;
        }
    }

    /* renamed from: a */
    private void m145939a(String str, int i, C46443a aVar) {
        if (this.f119618c == null) {
            this.f119618c = this.f119617b.mo115485a(str, i, aVar);
            this.f119619d = i;
            this.f119618c.mo115434a(Thread.currentThread(), Process.myTid());
        }
        this.f119620e++;
    }

    /* renamed from: e */
    private boolean m145944e(String str, Object[] objArr, int i, C46443a aVar) {
        if (aVar != null) {
            aVar.mo115546a();
        }
        switch (C46434h.m145979b(str)) {
            case 4:
                mo115515a(2, (SQLiteTransactionListener) null, i, aVar);
                return true;
            case 5:
                mo115522b();
                mo115517a(aVar);
                return true;
            case 6:
                mo115517a(aVar);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final String mo115521b(String str, Object[] objArr, int i, C46443a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m145944e(str, objArr, i, aVar)) {
            return null;
        } else {
            m145939a(str, i, aVar);
            try {
                return this.f119618c.mo115440c(str, objArr, aVar);
            } finally {
                m145941c();
            }
        }
    }

    /* renamed from: c */
    public final int mo115523c(String str, Object[] objArr, int i, C46443a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m145944e(str, objArr, i, aVar)) {
            return 0;
        } else {
            m145939a(str, i, aVar);
            try {
                return this.f119618c.mo115441d(str, objArr, aVar);
            } finally {
                m145941c();
            }
        }
    }

    /* renamed from: d */
    public final long mo115524d(String str, Object[] objArr, int i, C46443a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m145944e(str, objArr, i, aVar)) {
            return 0;
        } else {
            m145939a(str, i, aVar);
            try {
                return this.f119618c.mo115442e(str, objArr, aVar);
            } finally {
                m145941c();
            }
        }
    }

    /* renamed from: b */
    private void m145940b(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C46443a aVar) {
        if (aVar != null) {
            aVar.mo115546a();
        }
        if (this.f119622g == null) {
            m145939a(null, i2, aVar);
        }
        try {
            if (this.f119622g == null) {
                switch (i) {
                    case 1:
                        this.f119618c.mo115433a("BEGIN IMMEDIATE;", null, aVar);
                        break;
                    case 2:
                        this.f119618c.mo115433a("BEGIN EXCLUSIVE;", null, aVar);
                        break;
                    default:
                        this.f119618c.mo115433a("BEGIN;", null, aVar);
                        break;
                }
            }
            if (sQLiteTransactionListener != null) {
                sQLiteTransactionListener.onBegin();
            }
            C46427a a = m145936a(i, sQLiteTransactionListener);
            a.f119623a = this.f119622g;
            this.f119622g = a;
            if (this.f119622g == null) {
                m145941c();
            }
        } catch (RuntimeException e) {
            if (this.f119622g == null) {
                this.f119618c.mo115433a("ROLLBACK;", null, aVar);
            }
            throw e;
        } catch (Throwable th) {
            if (this.f119622g == null) {
                m145941c();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final long mo115513a(String str, Object[] objArr, int i, C46443a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m145944e(str, objArr, i, aVar)) {
            return 0;
        } else {
            m145939a(str, i, aVar);
            try {
                return this.f119618c.mo115435b(str, objArr, aVar);
            } finally {
                m145941c();
            }
        }
    }

    /* renamed from: a */
    public final void mo115515a(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C46443a aVar) {
        m145943e();
        m145940b(i, sQLiteTransactionListener, i2, aVar);
    }

    /* renamed from: a */
    public final int mo115512a(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, C46443a aVar) {
        int i4 = i3;
        C46443a aVar2 = aVar;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow != null) {
            Object[] objArr2 = objArr;
            if (m145944e(str, objArr, i4, aVar2)) {
                cursorWindow.mo115348a();
                return 0;
            }
            m145939a(str, i4, aVar2);
            try {
                return this.f119618c.mo115425a(str, objArr, cursorWindow, i, i2, z, aVar);
            } finally {
                m145941c();
            }
        } else {
            throw new IllegalArgumentException("window must not be null.");
        }
    }
}
