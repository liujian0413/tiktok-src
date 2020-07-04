package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import com.p280ss.android.ugc.aweme.commerce.service.logs.C24456a;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.d */
public final class C25996d extends C24456a {

    /* renamed from: e */
    public static final C25997a f68718e = new C25997a(null);

    /* renamed from: d */
    public C30388i f68719d;

    /* renamed from: f */
    private final JSONObject f68720f = new JSONObject();

    /* renamed from: g */
    private final JSONObject f68721g = new JSONObject();

    /* renamed from: h */
    private final JSONObject f68722h = new JSONObject();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.d$a */
    public static final class C25997a {
        private C25997a() {
        }

        public /* synthetic */ C25997a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo63539b() {
    }

    public C25996d() {
        super("hybrid_prefetch_duration_monitor");
    }

    /* renamed from: a */
    public final void mo63537a() {
        C30395o oVar;
        C25871a.m85133a();
        C30388i iVar = this.f68719d;
        if (iVar != null) {
            oVar = (C30395o) iVar.mo80008a(C30395o.class);
        } else {
            oVar = null;
        }
        C25870d.m85114a(oVar, "hybrid_prefetch_duration_monitor", "invoke_render_event", this.f68720f, this.f68721g, this.f68722h);
    }

    /* renamed from: a */
    public final C25996d mo67437a(long j) {
        this.f68721g.put("duration", j);
        return this;
    }

    /* renamed from: b */
    public final C25996d mo67439b(String str) {
        this.f68720f.put("duration_type", str);
        return this;
    }

    /* renamed from: c */
    public final C25996d mo67440c(String str) {
        this.f68720f.put("is_cache", str);
        return this;
    }

    /* renamed from: a */
    public final C25996d mo67438a(String str) {
        this.f68720f.put("page_id", str);
        return this;
    }
}
