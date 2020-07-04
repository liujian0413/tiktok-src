package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24454d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.d */
public final class C24467d extends C24456a {

    /* renamed from: d */
    public static final C24468a f64533d = new C24468a(null);

    /* renamed from: e */
    private String f64534e;

    /* renamed from: f */
    private String f64535f;

    /* renamed from: g */
    private String f64536g;

    /* renamed from: h */
    private String f64537h;

    /* renamed from: i */
    private Long f64538i;

    /* renamed from: j */
    private String f64539j;

    /* renamed from: k */
    private String f64540k;

    /* renamed from: l */
    private String f64541l;

    /* renamed from: m */
    private String f64542m;

    /* renamed from: n */
    private String f64543n;

    /* renamed from: o */
    private String f64544o;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.d$a */
    public static final class C24468a {
        private C24468a() {
        }

        public /* synthetic */ C24468a(C7571f fVar) {
            this();
        }
    }

    public C24467d() {
        super("product_entrance_click");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        String str;
        mo63538a("group_id", this.f64534e, C24459a.m80385a());
        mo63538a("enter_from", this.f64540k, C24459a.m80385a());
        mo63538a("author_id", this.f64535f, C24459a.m80385a());
        mo63538a("room_id", this.f64536g, C24459a.m80385a());
        mo63538a("commodity_id", this.f64537h, C24459a.m80385a());
        String str2 = "commodity_type";
        Long l = this.f64538i;
        if (l != null) {
            str = String.valueOf(l.longValue());
        } else {
            str = null;
        }
        mo63538a(str2, str, C24459a.m80385a());
        mo63538a("carrier_type", this.f64539j, C24459a.m80385a());
        mo63538a("destination", this.f64542m, C24459a.m80385a());
        mo63538a("is_self", this.f64543n, C24459a.m80385a());
        mo63538a("follow_status", this.f64544o, C24459a.m80385a());
        mo63538a("enter_method", this.f64541l, C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24467d mo63551a(Long l) {
        this.f64538i = l;
        return this;
    }

    /* renamed from: b */
    public final C24467d mo63554b(String str) {
        this.f64539j = str;
        return this;
    }

    /* renamed from: c */
    public final C24467d mo63555c(String str) {
        this.f64537h = str;
        return this;
    }

    /* renamed from: d */
    public final C24467d mo63556d(String str) {
        this.f64534e = str;
        return this;
    }

    /* renamed from: e */
    public final C24467d mo63557e(String str) {
        this.f64540k = str;
        return this;
    }

    /* renamed from: f */
    public final C24467d mo63558f(String str) {
        this.f64541l = str;
        return this;
    }

    /* renamed from: g */
    public final C24467d mo63559g(String str) {
        this.f64535f = str;
        return this;
    }

    /* renamed from: a */
    public final C24467d mo63552a(String str) {
        C7573i.m23587b(str, "destination");
        this.f64542m = str;
        return this;
    }

    /* renamed from: a */
    public final C24467d mo63553a(boolean z) {
        this.f64543n = "1";
        return this;
    }

    /* renamed from: a */
    public final C24467d mo63550a(Integer num) {
        String str;
        if (num == null || num.intValue() == -1 || C24454d.m80379a(this.f64535f)) {
            this.f64544o = null;
        } else {
            if (num.intValue() == 1 || num.intValue() == 2) {
                str = "1";
            } else {
                str = "0";
            }
            this.f64544o = str;
        }
        return this;
    }
}
