package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.g */
public final class C24473g extends C24456a {

    /* renamed from: d */
    public static final C24474a f64580d = new C24474a(null);

    /* renamed from: e */
    private String f64581e;

    /* renamed from: f */
    private String f64582f;

    /* renamed from: g */
    private String f64583g;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.g$a */
    public static final class C24474a {
        private C24474a() {
        }

        public /* synthetic */ C24474a(C7571f fVar) {
            this();
        }
    }

    public C24473g() {
        super("show_store_entrance");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        mo63538a("entrance_location", this.f64582f, C24459a.m80385a());
        mo63538a("author_id", this.f64581e, C24459a.m80385a());
        mo63538a("store_type", this.f64583g, C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24473g mo63579a(String str) {
        this.f64582f = str;
        return this;
    }

    /* renamed from: b */
    public final C24473g mo63580b(String str) {
        this.f64581e = str;
        return this;
    }

    /* renamed from: c */
    public final C24473g mo63581c(String str) {
        this.f64583g = str;
        return this;
    }
}
