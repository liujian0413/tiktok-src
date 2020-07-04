package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.tagmanager.bl */
final class C17021bl implements C17009b {

    /* renamed from: a */
    private C16981a f47669a;

    /* renamed from: b */
    private C16981a f47670b;

    /* renamed from: c */
    private Status f47671c;

    /* renamed from: d */
    private C17023bn f47672d;

    /* renamed from: e */
    private C17022bm f47673e;

    /* renamed from: f */
    private boolean f47674f;

    /* renamed from: g */
    private C17028d f47675g;

    /* renamed from: a */
    public final Status mo38101a() {
        return this.f47671c;
    }

    /* renamed from: b */
    public final void mo38266b() {
        if (!this.f47674f) {
            this.f47674f = true;
            this.f47675g.mo44260a(this);
            this.f47669a.mo44204a();
            this.f47669a = null;
            this.f47670b = null;
            this.f47673e = null;
            this.f47672d = null;
        }
    }

    /* renamed from: a */
    public final void mo44245a(String str) {
        if (!this.f47674f) {
            this.f47669a.mo44205a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo44246c() {
        if (this.f47674f) {
            return "";
        }
        return this.f47669a.f47605a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo44247d() {
        if (this.f47674f) {
            return "";
        }
        return this.f47673e.mo44248a();
    }
}
