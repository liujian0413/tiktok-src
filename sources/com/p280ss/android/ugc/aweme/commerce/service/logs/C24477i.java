package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.i */
public final class C24477i extends C24456a {

    /* renamed from: d */
    public static final C24478a f64590d = new C24478a(null);

    /* renamed from: e */
    private String f64591e;

    /* renamed from: f */
    private String f64592f;

    /* renamed from: g */
    private String f64593g;

    /* renamed from: h */
    private String f64594h;

    /* renamed from: i */
    private String f64595i;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.i$a */
    public static final class C24478a {
        private C24478a() {
        }

        public /* synthetic */ C24478a(C7571f fVar) {
            this();
        }
    }

    public C24477i() {
        super("ec_seed_entrance_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        mo63538a("group_id", this.f64591e, C24459a.m80385a());
        mo63538a("author_id", this.f64592f, C24459a.m80385a());
        mo63538a("seed_id", this.f64593g, C24459a.m80385a());
        mo63538a("seed_name", this.f64594h, C24459a.m80385a());
        mo63538a("enter_from", this.f64595i, C24459a.m80385a());
        mo63538a("data_type", "commerce_data", C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24477i mo63587a(String str) {
        this.f64591e = str;
        return this;
    }

    /* renamed from: b */
    public final C24477i mo63588b(String str) {
        this.f64592f = str;
        return this;
    }

    /* renamed from: c */
    public final C24477i mo63589c(String str) {
        this.f64593g = str;
        return this;
    }

    /* renamed from: d */
    public final C24477i mo63590d(String str) {
        this.f64594h = str;
        return this;
    }

    /* renamed from: e */
    public final C24477i mo63591e(String str) {
        this.f64595i = str;
        return this;
    }
}
