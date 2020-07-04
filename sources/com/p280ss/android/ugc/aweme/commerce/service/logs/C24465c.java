package com.p280ss.android.ugc.aweme.commerce.service.logs;

import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a.C24458b.C24459a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.c */
public final class C24465c extends C24456a {

    /* renamed from: d */
    public static final C24466a f64521d = new C24466a(null);

    /* renamed from: e */
    private String f64522e;

    /* renamed from: f */
    private final JSONObject f64523f = new JSONObject();

    /* renamed from: g */
    private final JSONObject f64524g = new JSONObject();

    /* renamed from: h */
    private final JSONObject f64525h = new JSONObject();

    /* renamed from: i */
    private final StringBuilder f64526i = new StringBuilder();

    /* renamed from: j */
    private Long f64527j;

    /* renamed from: k */
    private Long f64528k;

    /* renamed from: l */
    private String f64529l;

    /* renamed from: m */
    private String f64530m;

    /* renamed from: n */
    private String f64531n;

    /* renamed from: o */
    private String f64532o;

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.c$a */
    public static final class C24466a {
        private C24466a() {
        }

        public /* synthetic */ C24466a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo63549c() {
        m80392d();
        C6379c.m19828a("goods_page_render_time", this.f64523f, this.f64524g, this.f64525h);
        mo63537a();
    }

    public C24465c() {
        super("commerce_page_render_time");
    }

    /* renamed from: d */
    private final void m80392d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f64522e);
        sb.append("?");
        sb.append(this.f64526i.deleteCharAt(0));
        this.f64525h.put("page_full_path", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63539b() {
        mo63538a("render_time", String.valueOf(this.f64527j), C24459a.m80385a());
        mo63538a("interact_time", String.valueOf(this.f64528k), C24459a.m80385a());
        mo63538a("session_id", this.f64529l, C24459a.m80385a());
        mo63538a("goods_id", this.f64530m, C24459a.m80385a());
        mo63538a("author_id", this.f64531n, C24459a.m80385a());
        mo63538a("video_id", this.f64532o, C24459a.m80385a());
        mo63538a("page_id", this.f64522e, C24459a.m80385a());
    }

    /* renamed from: a */
    public final C24465c mo63545a(long j) {
        this.f64524g.put("render_time", j);
        this.f64527j = Long.valueOf(j);
        return this;
    }

    /* renamed from: b */
    public final C24465c mo63547b(long j) {
        this.f64524g.put("interact_time", j);
        this.f64528k = Long.valueOf(j);
        return this;
    }

    /* renamed from: a */
    public final C24465c mo63546a(String str) {
        C7573i.m23587b(str, "sessionId");
        StringBuilder sb = this.f64526i;
        sb.append("&");
        StringBuilder sb2 = new StringBuilder("session_id=");
        sb2.append(str);
        sb.append(sb2.toString());
        this.f64529l = str;
        return this;
    }

    /* renamed from: b */
    public final C24465c mo63548b(String str) {
        this.f64523f.put("page_id", str);
        this.f64522e = str;
        return this;
    }
}
