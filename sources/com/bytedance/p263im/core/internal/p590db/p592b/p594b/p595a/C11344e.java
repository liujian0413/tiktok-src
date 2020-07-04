package com.bytedance.p263im.core.internal.p590db.p592b.p594b.p595a;

import android.database.sqlite.SQLiteStatement;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;

/* renamed from: com.bytedance.im.core.internal.db.b.b.a.e */
public final class C11344e implements C11354f {

    /* renamed from: a */
    private SQLiteStatement f30715a;

    /* renamed from: a */
    public final int mo27374a() {
        return this.f30715a.executeUpdateDelete();
    }

    /* renamed from: b */
    public final long mo27377b() {
        return this.f30715a.executeInsert();
    }

    /* renamed from: c */
    public final void mo27378c() {
        this.f30715a.close();
    }

    /* renamed from: d */
    public final void mo27379d() {
        this.f30715a.clearBindings();
    }

    public C11344e(SQLiteStatement sQLiteStatement) {
        this.f30715a = sQLiteStatement;
    }

    /* renamed from: a */
    public final void mo27375a(int i, long j) {
        this.f30715a.bindLong(i, j);
    }

    /* renamed from: a */
    public final void mo27376a(int i, String str) {
        this.f30715a.bindString(i, str);
    }
}
