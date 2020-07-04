package com.bytedance.p263im.core.internal.p590db.p592b.p594b.p596b;

import android.content.ContentValues;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d;
import com.bytedance.p263im.core.internal.p590db.p592b.C11354f;
import com.tencent.wcdb.SQLException;
import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: com.bytedance.im.core.internal.db.b.b.b.c */
public final class C11347c implements C11351d {

    /* renamed from: a */
    public SQLiteDatabase f30718a;

    /* renamed from: b */
    public final void mo27368b() {
        this.f30718a.close();
    }

    /* renamed from: c */
    public final boolean mo27369c() {
        return this.f30718a.mo115471j();
    }

    /* renamed from: d */
    public final void mo27370d() {
        this.f30718a.mo115468g();
    }

    /* renamed from: e */
    public final void mo27371e() {
        this.f30718a.mo115470i();
    }

    /* renamed from: f */
    public final void mo27372f() {
        this.f30718a.mo115469h();
    }

    /* renamed from: a */
    public final boolean mo27366a() {
        return this.f30718a.mo115475n();
    }

    public C11347c(SQLiteDatabase sQLiteDatabase) {
        this.f30718a = sQLiteDatabase;
    }

    /* renamed from: b */
    public final C11354f mo27367b(String str) throws SQLException {
        return new C11349e(this.f30718a.mo115459a(str));
    }

    /* renamed from: a */
    public final void mo27365a(String str) throws SQLException {
        this.f30718a.mo115465b(str);
    }

    /* renamed from: a */
    public final C11339b mo27364a(String str, String[] strArr) {
        return new C11345a(this.f30718a.mo115460a(str, (Object[]) strArr));
    }

    /* renamed from: a */
    public final int mo27362a(String str, String str2, String[] strArr) {
        return this.f30718a.mo115456a(str, str2, strArr);
    }

    /* renamed from: a */
    public final long mo27363a(String str, String str2, ContentValues contentValues) {
        return this.f30718a.mo115457a(str, str2, contentValues);
    }

    /* renamed from: a */
    public final int mo27361a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f30718a.mo115455a(str, contentValues, str2, strArr);
    }
}
