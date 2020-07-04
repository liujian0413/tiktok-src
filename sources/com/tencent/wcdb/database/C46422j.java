package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.C46433g;
import com.tencent.wcdb.database.SQLiteDatabase.C46408a;
import com.tencent.wcdb.support.C46445b;
import com.tencent.wcdb.support.Log;

/* renamed from: com.tencent.wcdb.database.j */
public abstract class C46422j {

    /* renamed from: a */
    private final Context f119593a;

    /* renamed from: b */
    private final C46408a f119594b;

    /* renamed from: c */
    public final String f119595c;

    /* renamed from: d */
    private final int f119596d;

    /* renamed from: e */
    private SQLiteDatabase f119597e;

    /* renamed from: f */
    private boolean f119598f;

    /* renamed from: g */
    private boolean f119599g;

    /* renamed from: h */
    private boolean f119600h;

    /* renamed from: i */
    private final C46433g f119601i;

    /* renamed from: j */
    private byte[] f119602j;

    /* renamed from: k */
    private SQLiteCipherSpec f119603k;

    /* renamed from: l */
    private int f119604l;

    /* renamed from: m */
    private boolean f119605m;

    static {
        SQLiteGlobal.loadLib();
    }

    /* renamed from: a */
    public abstract void mo27346a(SQLiteDatabase sQLiteDatabase);

    /* renamed from: a */
    public abstract void mo27347a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* renamed from: b */
    public void mo27348b(SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: c */
    public void mo27350c(SQLiteDatabase sQLiteDatabase) {
    }

    /* renamed from: a */
    public final SQLiteDatabase mo115501a() {
        SQLiteDatabase a;
        synchronized (this) {
            a = m145917a(true);
        }
        return a;
    }

    /* renamed from: a */
    private SQLiteDatabase m145917a(boolean z) {
        int i;
        SQLiteDatabase a;
        if (this.f119597e != null) {
            if (!this.f119597e.mo115475n()) {
                this.f119597e = null;
            } else if (!this.f119597e.mo115474m()) {
                return this.f119597e;
            }
        }
        if (!this.f119598f) {
            SQLiteDatabase sQLiteDatabase = this.f119597e;
            try {
                this.f119598f = true;
                if (sQLiteDatabase == null) {
                    if (this.f119595c == null) {
                        a = SQLiteDatabase.m145823a((C46408a) null);
                    } else {
                        boolean z2 = this.f119600h;
                        this.f119605m = true;
                        if (this.f119599g) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        this.f119604l = i;
                        a = C46445b.m146021a(this.f119593a, this.f119595c, this.f119602j, this.f119603k, this.f119604l, this.f119594b, this.f119601i, z2 ? 1 : 0);
                    }
                    sQLiteDatabase = a;
                } else if (sQLiteDatabase.mo115474m()) {
                    sQLiteDatabase.mo115472k();
                }
                SQLiteDatabase d = m145918d(sQLiteDatabase);
                this.f119598f = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.f119597e)) {
                    sQLiteDatabase.close();
                }
                return d;
            } catch (SQLiteException e) {
                throw e;
            } catch (Throwable th) {
                this.f119598f = false;
                if (!(sQLiteDatabase == null || sQLiteDatabase == this.f119597e)) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("getDatabase called recursively");
        }
    }

    /* renamed from: d */
    private SQLiteDatabase m145918d(SQLiteDatabase sQLiteDatabase) {
        mo27348b(sQLiteDatabase);
        int l = sQLiteDatabase.mo115473l();
        if (l != this.f119596d) {
            if (!sQLiteDatabase.mo115474m()) {
                sQLiteDatabase.mo115468g();
                if (l == 0) {
                    try {
                        mo27346a(sQLiteDatabase);
                    } catch (Throwable th) {
                        sQLiteDatabase.mo115469h();
                        throw th;
                    }
                } else if (l > this.f119596d) {
                    mo27349b(sQLiteDatabase, l, this.f119596d);
                } else {
                    mo27347a(sQLiteDatabase, l, this.f119596d);
                }
                sQLiteDatabase.mo115462a(this.f119596d);
                sQLiteDatabase.mo115470i();
                sQLiteDatabase.mo115469h();
            } else {
                StringBuilder sb = new StringBuilder("Can't upgrade read-only database from version ");
                sb.append(sQLiteDatabase.mo115473l());
                sb.append(" to ");
                sb.append(this.f119596d);
                sb.append(": ");
                sb.append(this.f119595c);
                throw new SQLiteException(sb.toString());
            }
        }
        mo27350c(sQLiteDatabase);
        if (sQLiteDatabase.mo115474m()) {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append(this.f119595c);
            sb2.append(" in read-only mode");
            Log.m146012b("WCDB.SQLiteOpenHelper", sb2.toString());
        }
        this.f119597e = sQLiteDatabase;
        return sQLiteDatabase;
    }

    /* renamed from: b */
    public void mo27349b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new SQLiteException(sb.toString());
    }

    public C46422j(Context context, String str, byte[] bArr, C46408a aVar, int i, C46433g gVar) {
        this(context, str, bArr, null, aVar, i, gVar);
    }

    private C46422j(Context context, String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, C46408a aVar, int i, C46433g gVar) {
        if (i > 0) {
            this.f119593a = context;
            this.f119595c = str;
            this.f119594b = aVar;
            this.f119596d = i;
            this.f119601i = gVar;
            this.f119602j = bArr;
            this.f119603k = null;
            this.f119605m = false;
            return;
        }
        StringBuilder sb = new StringBuilder("Version must be >= 1, was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
