package com.bytedance.android.livesdk.p428w;

import com.bytedance.android.livesdk.C6128g;
import com.bytedance.android.livesdk.schema.C8923b;
import com.bytedance.android.livesdk.schema.C8924c;
import com.bytedance.android.livesdk.share.C8940a;
import com.bytedance.android.livesdk.share.C8941b;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8998l;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9463e;
import com.bytedance.android.livesdkapi.host.C9464f;
import com.bytedance.android.livesdkapi.host.C9465g;
import com.bytedance.android.livesdkapi.host.C9466h;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p447e.C9399d;
import com.bytedance.android.livesdkapi.service.C9514b;

/* renamed from: com.bytedance.android.livesdk.w.c */
public final class C9166c implements C9168e {

    /* renamed from: a */
    private C9514b f24884a;

    /* renamed from: b */
    private C8984e f24885b;

    /* renamed from: c */
    private C8940a f24886c;

    /* renamed from: d */
    private C8923b f24887d;

    /* renamed from: e */
    private IHostApp f24888e;

    /* renamed from: b */
    public final C9439a mo22361b() {
        return this.f24884a.mo14562b();
    }

    /* renamed from: d */
    public final C9463e mo22363d() {
        return this.f24884a.mo14565e();
    }

    /* renamed from: g */
    public final C9464f mo22366g() {
        return this.f24884a.mo14570j();
    }

    /* renamed from: i */
    public final C9466h mo22368i() {
        return this.f24884a.mo14572l();
    }

    /* renamed from: j */
    public final C9399d mo22369j() {
        return this.f24884a.mo14573m();
    }

    /* renamed from: k */
    public final C9465g mo22370k() {
        return this.f24884a.mo14574n();
    }

    /* renamed from: l */
    public final C9456c mo22371l() {
        return this.f24884a.mo14575o();
    }

    /* renamed from: a */
    public final IHostContext mo22360a() {
        return this.f24884a.mo14561a();
    }

    /* renamed from: c */
    public final IHostApp mo22362c() {
        if (this.f24888e == null) {
            this.f24888e = new C6128g(this.f24884a.mo14563c());
        }
        return this.f24888e;
    }

    /* renamed from: e */
    public final C8940a mo22364e() {
        if (this.f24886c == null) {
            this.f24886c = C8941b.m26755a(this.f24884a.mo14567g());
        }
        return this.f24886c;
    }

    /* renamed from: f */
    public final C8923b mo22365f() {
        if (this.f24887d == null) {
            this.f24887d = C8924c.m26711a(this.f24884a.mo14569i());
        }
        return this.f24887d;
    }

    /* renamed from: h */
    public final C8984e mo22367h() {
        if (this.f24885b == null) {
            this.f24885b = new C8998l(this.f24884a.mo14571k());
        }
        return this.f24885b;
    }

    /* renamed from: a */
    public static C9166c m27247a(C9514b bVar) {
        return new C9166c(bVar);
    }

    private C9166c(C9514b bVar) {
        this.f24884a = bVar;
        if (this.f24888e == null) {
            this.f24888e = new C6128g(bVar.mo14563c());
        }
    }
}
