package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24454d;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.f */
public final class C24471f extends C24456a {

    /* renamed from: d */
    public static final C24472a f64559d = new C24472a(null);

    /* renamed from: e */
    private String f64560e;

    /* renamed from: f */
    private String f64561f;

    /* renamed from: g */
    private String f64562g;

    /* renamed from: h */
    private Integer f64563h;

    /* renamed from: i */
    private String f64564i;

    /* renamed from: j */
    private String f64565j;

    /* renamed from: k */
    private String f64566k;

    /* renamed from: l */
    private String f64567l;

    /* renamed from: m */
    private String f64568m;

    /* renamed from: n */
    private String f64569n = "0";

    /* renamed from: o */
    private String f64570o = "0";

    /* renamed from: p */
    private String f64571p = "normal";

    /* renamed from: q */
    private String f64572q;

    /* renamed from: r */
    private String f64573r;

    /* renamed from: s */
    private String f64574s;

    /* renamed from: t */
    private String f64575t;

    /* renamed from: u */
    private String f64576u = "commerce_data";

    /* renamed from: v */
    private String f64577v;

    /* renamed from: w */
    private String f64578w;

    /* renamed from: x */
    private String f64579x;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.f$a */
    public static final class C24472a {
        private C24472a() {
        }

        public /* synthetic */ C24472a(C7571f fVar) {
            this();
        }
    }

    public C24471f() {
        super("show_product");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        String str;
        mo63538a("group_id", this.f64560e, C24459a.m80385a());
        mo63538a("enter_method", this.f64565j, C24459a.m80385a());
        mo63538a("author_id", this.f64561f, C24459a.m80385a());
        mo63538a("commodity_id", this.f64562g, C24459a.m80385a());
        String str2 = "commodity_type";
        Integer num = this.f64563h;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        mo63538a(str2, str, C24459a.m80385a());
        mo63538a("carrier_type", this.f64564i, C24459a.m80385a());
        mo63538a("scene_id", this.f64568m, C24459a.m80385a());
        mo63538a("product_label", this.f64571p, C24459a.m80385a());
        mo63538a("source_page", this.f64572q, C24459a.m80385a());
        mo63538a("with_coupon", this.f64569n, C24459a.m80385a());
        mo63538a("with_link", this.f64570o, C24459a.m80385a());
        mo63538a("enter_from", this.f64566k, C24459a.m80385a());
        mo63538a("room_id", this.f64567l, C24459a.m80385a());
        mo63538a("order_type", this.f64573r, C24459a.m80385a());
        mo63538a("follow_status", this.f64575t, C24459a.m80385a());
        mo63538a("data_type", this.f64576u, C24459a.m80385a());
        mo63538a("is_self", this.f64574s, C24459a.m80385a());
        mo63538a("search_id", this.f64577v, C24459a.m80385a());
        mo63538a("search_keyword", this.f64579x, C24459a.m80385a());
        mo63538a("entrance_info", this.f64578w, C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24471f mo63569a(Integer num) {
        this.f64563h = num;
        return this;
    }

    /* renamed from: b */
    public final C24471f mo63572b(String str) {
        this.f64564i = str;
        return this;
    }

    /* renamed from: c */
    public final C24471f mo63573c(String str) {
        this.f64562g = str;
        return this;
    }

    /* renamed from: d */
    public final C24471f mo63574d(String str) {
        this.f64560e = str;
        return this;
    }

    /* renamed from: e */
    public final C24471f mo63575e(String str) {
        this.f64565j = str;
        return this;
    }

    /* renamed from: f */
    public final C24471f mo63576f(String str) {
        this.f64561f = str;
        return this;
    }

    /* renamed from: g */
    public final C24471f mo63577g(String str) {
        this.f64566k = str;
        return this;
    }

    /* renamed from: h */
    public final C24471f mo63578h(String str) {
        this.f64567l = null;
        return this;
    }

    /* renamed from: a */
    public final C24471f mo63570a(String str) {
        this.f64572q = str;
        return this;
    }

    /* renamed from: b */
    public final C24471f mo63571b(Integer num) {
        String str;
        if (num == null || num.intValue() == -1 || C24454d.m80379a(this.f64561f)) {
            this.f64575t = null;
        } else {
            if (num.intValue() == 1 || num.intValue() == 2) {
                str = "1";
            } else {
                str = "0";
            }
            this.f64575t = str;
        }
        return this;
    }
}
