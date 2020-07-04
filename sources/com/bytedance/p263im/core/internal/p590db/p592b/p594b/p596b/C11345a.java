package com.bytedance.p263im.core.internal.p590db.p592b.p594b.p596b;

import com.bytedance.p263im.core.internal.p590db.p592b.C11339b;
import com.tencent.wcdb.C46432f;

/* renamed from: com.bytedance.im.core.internal.db.b.b.b.a */
public final class C11345a implements C11339b {

    /* renamed from: a */
    private C46432f f30716a;

    /* renamed from: e */
    public final Object mo27360e() {
        return this.f30716a;
    }

    /* renamed from: b */
    public final int mo27355b() {
        return this.f30716a.getCount();
    }

    /* renamed from: d */
    public final boolean mo27359d() {
        return this.f30716a.moveToNext();
    }

    /* renamed from: c */
    public final boolean mo27358c() {
        return this.f30716a.moveToFirst();
    }

    /* renamed from: a */
    public final void mo27354a() {
        this.f30716a.close();
    }

    public C11345a(C46432f fVar) {
        this.f30716a = fVar;
    }

    /* renamed from: a */
    public final int mo27352a(int i) {
        return this.f30716a.getInt(i);
    }

    /* renamed from: c */
    public final String mo27357c(int i) {
        return this.f30716a.getString(i);
    }

    /* renamed from: a */
    public final int mo27353a(String str) {
        return this.f30716a.getColumnIndex(str);
    }

    /* renamed from: b */
    public final long mo27356b(int i) {
        return this.f30716a.getLong(i);
    }
}
