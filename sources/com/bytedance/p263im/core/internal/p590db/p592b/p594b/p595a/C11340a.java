package com.bytedance.p263im.core.internal.p590db.p592b.p594b.p595a;

import android.database.Cursor;
import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;

/* renamed from: com.bytedance.im.core.internal.db.b.b.a.a */
public final class C11340a implements C11339b {

    /* renamed from: a */
    private Cursor f30711a;

    /* renamed from: e */
    public final Object mo27360e() {
        return this.f30711a;
    }

    /* renamed from: b */
    public final int mo27355b() {
        return this.f30711a.getCount();
    }

    /* renamed from: d */
    public final boolean mo27359d() {
        return this.f30711a.moveToNext();
    }

    /* renamed from: c */
    public final boolean mo27358c() {
        return this.f30711a.moveToFirst();
    }

    /* renamed from: a */
    public final void mo27354a() {
        this.f30711a.close();
    }

    public C11340a(Cursor cursor) {
        this.f30711a = cursor;
    }

    /* renamed from: a */
    public final int mo27352a(int i) {
        return this.f30711a.getInt(i);
    }

    /* renamed from: c */
    public final String mo27357c(int i) {
        return this.f30711a.getString(i);
    }

    /* renamed from: a */
    public final int mo27353a(String str) {
        return this.f30711a.getColumnIndex(str);
    }

    /* renamed from: b */
    public final long mo27356b(int i) {
        return this.f30711a.getLong(i);
    }
}
