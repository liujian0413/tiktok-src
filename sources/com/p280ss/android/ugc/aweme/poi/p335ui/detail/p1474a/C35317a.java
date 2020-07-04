package com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1474a;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.a.a */
public abstract class C35317a {

    /* renamed from: a */
    protected boolean f92586a;

    /* renamed from: b */
    private String f92587b;

    /* renamed from: a */
    public void mo89873a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo89874a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo89876b() {
        return false;
    }

    /* renamed from: c */
    public void mo89877c() {
    }

    /* renamed from: d */
    public abstract int mo89878d();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo89879e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo89880f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo89881g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo89882h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo89883i() {
        this.f92586a = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo89884j() {
        this.f92586a = false;
        mo89881g();
    }

    public C35317a(String str) {
        this.f92587b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo89875a(String str) {
        if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase(this.f92587b)) {
            return false;
        }
        return true;
    }
}
