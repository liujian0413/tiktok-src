package com.tencent.wcdb.database;

import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.support.C46443a;
import java.util.Arrays;

/* renamed from: com.tencent.wcdb.database.k */
public abstract class C46423k extends C46411c {

    /* renamed from: f */
    private static final String[] f119606f = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f119607a;

    /* renamed from: b */
    public final String f119608b;

    /* renamed from: c */
    public final String[] f119609c;

    /* renamed from: d */
    public final Object[] f119610d;

    /* renamed from: e */
    protected C46405c f119611e;

    /* renamed from: g */
    private final boolean f119612g;

    /* renamed from: h */
    private final int f119613h;

    /* renamed from: i */
    private C46425m f119614i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C46425m mo115502a() {
        return this.f119607a.mo115464b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo115507b() {
        return SQLiteDatabase.m145821a(this.f119612g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo115353c() {
        mo115526g();
        mo115508f();
    }

    /* renamed from: f */
    public final void mo115508f() {
        if (this.f119610d != null) {
            Arrays.fill(this.f119610d, null);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        synchronized (this) {
            if (this.f119614i != null || this.f119611e != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    /* renamed from: g */
    private synchronized void mo115526g() {
        if (this.f119614i != null || this.f119611e != null) {
            if (this.f119614i == null || this.f119611e == null) {
                throw new IllegalStateException("Internal state error.");
            } else if (this.f119614i == this.f119607a.mo115464b()) {
                this.f119614i.mo115516a(this.f119611e);
                this.f119611e = null;
                this.f119614i = null;
            } else {
                throw new IllegalStateException("SQLiteProgram has bound to another thread.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115505a(SQLiteException sQLiteException) {
        boolean z = true;
        if (!(sQLiteException instanceof SQLiteDatabaseCorruptException) && (!(sQLiteException instanceof SQLiteFullException) || !this.f119612g)) {
            z = false;
        }
        if (z) {
            SQLiteDebug.m145868a(this.f119607a);
            this.f119607a.mo115461a();
        }
    }

    /* renamed from: a */
    public final void mo115506a(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                mo115504a(length, strArr[length - 1]);
            }
        }
    }

    /* renamed from: a */
    public final void mo115503a(int i, long j) {
        m145925a(i, (Object) Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo115504a(int i, String str) {
        if (str != null) {
            m145925a(i, (Object) str);
            return;
        }
        StringBuilder sb = new StringBuilder("the bind value at index ");
        sb.append(i);
        sb.append(" is null");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m145925a(int i, Object obj) {
        if (i <= 0 || i > this.f119613h) {
            StringBuilder sb = new StringBuilder("Cannot bind argument at index ");
            sb.append(i);
            sb.append(" because the index is out of range.  The statement has ");
            sb.append(this.f119613h);
            sb.append(" parameters.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f119610d[i - 1] = obj;
    }

    protected C46423k(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C46443a aVar) {
        this.f119607a = sQLiteDatabase;
        this.f119608b = str.trim();
        int b = C46434h.m145979b(this.f119608b);
        switch (b) {
            case 4:
            case 5:
            case 6:
                this.f119612g = false;
                this.f119609c = f119606f;
                this.f119613h = 0;
                break;
            default:
                boolean z = true;
                if (b != 1) {
                    z = false;
                }
                C46429o oVar = new C46429o();
                sQLiteDatabase.mo115464b().mo115519a(this.f119608b, SQLiteDatabase.m145821a(z), aVar, oVar);
                this.f119612g = oVar.f119630c;
                this.f119609c = oVar.f119629b;
                this.f119613h = oVar.f119628a;
                break;
        }
        if (objArr == null || objArr.length <= this.f119613h) {
            if (this.f119613h != 0) {
                this.f119610d = new Object[this.f119613h];
                if (objArr != null) {
                    System.arraycopy(objArr, 0, this.f119610d, 0, objArr.length);
                }
            } else {
                this.f119610d = null;
            }
            this.f119611e = null;
            this.f119614i = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Too many bind arguments.  ");
        sb.append(objArr.length);
        sb.append(" arguments were provided but the statement needs ");
        sb.append(this.f119613h);
        sb.append(" arguments.");
        throw new IllegalArgumentException(sb.toString());
    }
}
