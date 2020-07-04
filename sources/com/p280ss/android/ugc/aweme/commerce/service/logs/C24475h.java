package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.h */
public final class C24475h extends C24456a {

    /* renamed from: d */
    public static final C24476a f64584d = new C24476a(null);

    /* renamed from: e */
    private String f64585e;

    /* renamed from: f */
    private String f64586f;

    /* renamed from: g */
    private String f64587g;

    /* renamed from: h */
    private String f64588h;

    /* renamed from: i */
    private String f64589i;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.h$a */
    public static final class C24476a {
        private C24476a() {
        }

        public /* synthetic */ C24476a(C7571f fVar) {
            this();
        }
    }

    public C24475h() {
        super("ec_seed_entrance_click");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        mo63538a("group_id", this.f64585e, C24459a.m80385a());
        mo63538a("author_id", this.f64586f, C24459a.m80385a());
        mo63538a("seed_id", this.f64587g, C24459a.m80385a());
        mo63538a("seed_name", this.f64588h, C24459a.m80385a());
        mo63538a("enter_from", this.f64589i, C24459a.m80385a());
        mo63538a("data_type", "commerce_data", C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24475h mo63582a(String str) {
        this.f64585e = str;
        return this;
    }

    /* renamed from: b */
    public final C24475h mo63583b(String str) {
        this.f64586f = str;
        return this;
    }

    /* renamed from: c */
    public final C24475h mo63584c(String str) {
        this.f64587g = str;
        return this;
    }

    /* renamed from: d */
    public final C24475h mo63585d(String str) {
        this.f64588h = str;
        return this;
    }

    /* renamed from: e */
    public final C24475h mo63586e(String str) {
        this.f64589i = str;
        return this;
    }
}
