package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24454d;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.e */
public final class C24469e extends C24456a {

    /* renamed from: d */
    public static final C24470a f64545d = new C24470a(null);

    /* renamed from: e */
    private String f64546e;

    /* renamed from: f */
    private String f64547f;

    /* renamed from: g */
    private String f64548g;

    /* renamed from: h */
    private String f64549h;

    /* renamed from: i */
    private String f64550i;

    /* renamed from: j */
    private String f64551j;

    /* renamed from: k */
    private Integer f64552k;

    /* renamed from: l */
    private String f64553l;

    /* renamed from: m */
    private String f64554m;

    /* renamed from: n */
    private String f64555n;

    /* renamed from: o */
    private String f64556o;

    /* renamed from: p */
    private String f64557p = "commerce_data";

    /* renamed from: q */
    private String f64558q;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.e$a */
    public static final class C24470a {
        private C24470a() {
        }

        public /* synthetic */ C24470a(C7571f fVar) {
            this();
        }
    }

    public C24469e() {
        super("product_entrance_show");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        String str;
        mo63538a("group_id", this.f64546e, C24459a.m80385a());
        mo63538a("room_id", this.f64550i, C24459a.m80385a());
        mo63538a("enter_from", this.f64554m, C24459a.m80385a());
        mo63538a("author_id", this.f64549h, C24459a.m80385a());
        mo63538a("commodity_id", this.f64551j, C24459a.m80385a());
        String str2 = "commodity_type";
        Integer num = this.f64552k;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        mo63538a(str2, str, C24459a.m80385a());
        mo63538a("carrier_type", this.f64553l, C24459a.m80385a());
        mo63538a("follow_status", this.f64556o, C24459a.m80385a());
        mo63538a("is_self", this.f64555n, C24459a.m80385a());
        mo63538a("data_type", this.f64557p, C24459a.m80385a());
        mo63538a("from_group_id", this.f64547f, C24459a.m80385a());
        mo63538a("button_status", this.f64558q, C24459a.m80385a());
        mo63538a("refer_commodity_id", this.f64548g, C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24469e mo63560a(Integer num) {
        this.f64552k = num;
        return this;
    }

    /* renamed from: b */
    public final C24469e mo63563b(String str) {
        this.f64551j = str;
        return this;
    }

    /* renamed from: c */
    public final C24469e mo63564c(String str) {
        this.f64546e = str;
        return this;
    }

    /* renamed from: d */
    public final C24469e mo63565d(String str) {
        this.f64547f = str;
        return this;
    }

    /* renamed from: e */
    public final C24469e mo63566e(String str) {
        this.f64548g = str;
        return this;
    }

    /* renamed from: f */
    public final C24469e mo63567f(String str) {
        this.f64554m = str;
        return this;
    }

    /* renamed from: g */
    public final C24469e mo63568g(String str) {
        this.f64549h = str;
        return this;
    }

    /* renamed from: a */
    public final C24469e mo63561a(String str) {
        this.f64553l = str;
        return this;
    }

    /* renamed from: b */
    public final C24469e mo63562b(Integer num) {
        String str;
        if (num == null || num.intValue() == -1 || C24454d.m80379a(this.f64549h)) {
            this.f64556o = null;
        } else {
            if (num.intValue() == 1 || num.intValue() == 2) {
                str = "1";
            } else {
                str = "0";
            }
            this.f64556o = str;
        }
        return this;
    }
}
