package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.b */
public final class C24463b extends C24456a {

    /* renamed from: d */
    public static final C24464a f64516d = new C24464a(null);

    /* renamed from: e */
    private String f64517e;

    /* renamed from: f */
    private String f64518f;

    /* renamed from: g */
    private String f64519g;

    /* renamed from: h */
    private String f64520h;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.b$a */
    public static final class C24464a {
        private C24464a() {
        }

        public /* synthetic */ C24464a(C7571f fVar) {
            this();
        }
    }

    public C24463b() {
        super("enter_store_page");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        mo63538a("entrance_location", this.f64518f, C24459a.m80385a());
        mo63538a("author_id", this.f64517e, C24459a.m80385a());
        mo63538a("store_type", this.f64519g, C24459a.m80385a());
        mo63538a("from_group_id", this.f64520h, C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24463b mo63542a(String str) {
        this.f64518f = str;
        return this;
    }

    /* renamed from: b */
    public final C24463b mo63543b(String str) {
        this.f64517e = str;
        return this;
    }

    /* renamed from: c */
    public final C24463b mo63544c(String str) {
        this.f64519g = str;
        return this;
    }
}
