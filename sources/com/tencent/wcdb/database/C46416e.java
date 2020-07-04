package com.tencent.wcdb.database;

import com.tencent.wcdb.C46399b;
import com.tencent.wcdb.C46432f;
import com.tencent.wcdb.C46434h;
import com.tencent.wcdb.database.SQLiteDatabase.C46408a;
import com.tencent.wcdb.support.C46443a;
import com.tencent.wcdb.support.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.wcdb.database.e */
public final class C46416e extends C46399b {

    /* renamed from: h */
    public static final C46408a f119566h = new C46408a() {
        /* renamed from: a */
        public final C46423k mo27335a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C46443a aVar) {
            return new C46424l(sQLiteDatabase, str, objArr, aVar);
        }

        /* renamed from: a */
        public final C46432f mo27336a(SQLiteDatabase sQLiteDatabase, C46418f fVar, String str, C46423k kVar) {
            return new C46416e(fVar, str, (C46424l) kVar);
        }
    };

    /* renamed from: i */
    private final String f119567i;

    /* renamed from: j */
    private final String[] f119568j;

    /* renamed from: k */
    private final C46424l f119569k;

    /* renamed from: l */
    private final C46418f f119570l;

    /* renamed from: m */
    private int f119571m = -1;

    /* renamed from: n */
    private int f119572n;

    /* renamed from: o */
    private Map<String, Integer> f119573o;

    /* renamed from: p */
    private final Throwable f119574p;

    public final void deactivate() {
        super.deactivate();
    }

    public final String[] getColumnNames() {
        return this.f119568j;
    }

    /* renamed from: d */
    private SQLiteDatabase m145908d() {
        return this.f119569k.f119607a;
    }

    public final void close() {
        super.close();
        synchronized (this) {
            this.f119569k.close();
        }
    }

    public final void finalize() {
        try {
            if (this.f119464g != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        if (this.f119571m == -1) {
            m145907a(0);
        }
        return this.f119571m;
    }

    public final boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.f119569k.f119607a.mo115475n()) {
                return false;
            }
            if (this.f119464g != null) {
                this.f119464g.mo115348a();
            }
            this.f119451b = -1;
            this.f119571m = -1;
            try {
                return super.requery();
            } catch (IllegalStateException e) {
                StringBuilder sb = new StringBuilder("requery() failed ");
                sb.append(e.getMessage());
                Log.m146013b("WCDB.SQLiteCursor", sb.toString(), e);
                return false;
            }
        }
    }

    /* renamed from: a */
    private void m145907a(int i) {
        mo115408a(m145908d().mo115476o());
        try {
            if (this.f119571m == -1) {
                this.f119571m = this.f119569k.mo115510a(this.f119464g, C46434h.m145967a(i, 0), i, true);
                this.f119572n = this.f119464g.mo115350b();
                return;
            }
            this.f119569k.mo115510a(this.f119464g, C46434h.m145967a(i, this.f119572n), i, false);
        } catch (RuntimeException e) {
            mo115409c();
            throw e;
        }
    }

    public final int getColumnIndex(String str) {
        if (this.f119573o == null) {
            String[] strArr = this.f119568j;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.f119573o = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sb = new StringBuilder("requesting column name with table name -- ");
            sb.append(str);
            Log.m146011a("WCDB.SQLiteCursor", sb.toString(), exc);
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = (Integer) this.f119573o.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo115367a(int i, int i2) {
        if (this.f119464g == null || i2 < this.f119464g.f119448b || i2 >= this.f119464g.f119448b + this.f119464g.mo115350b()) {
            m145907a(i2);
        }
        return true;
    }

    public C46416e(C46418f fVar, String str, C46424l lVar) {
        if (lVar != null) {
            this.f119574p = null;
            this.f119570l = fVar;
            this.f119567i = str;
            this.f119573o = null;
            this.f119569k = lVar;
            this.f119568j = lVar.f119609c;
            this.f119452c = C46434h.m145969a(this.f119568j);
            return;
        }
        throw new IllegalArgumentException("query object cannot be null");
    }
}
