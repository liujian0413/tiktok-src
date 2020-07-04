package com.bytedance.ies.bullet.kit.web.p548b;

import android.net.Uri;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.p543b.C10406a;
import com.bytedance.ies.bullet.core.monitor.C10420a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.web.b.a */
public final class C10627a extends C10420a {

    /* renamed from: h */
    public static final C10628a f28477h = new C10628a(null);

    /* renamed from: i */
    private final String f28478i = "h5";

    /* renamed from: j */
    private boolean f28479j = true;

    /* renamed from: k */
    private long f28480k;

    /* renamed from: l */
    private long f28481l;

    /* renamed from: m */
    private final Map<Uri, Long> f28482m = new LinkedHashMap();

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.a$a */
    public static final class C10628a {
        private C10628a() {
        }

        public /* synthetic */ C10628a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo25208a() {
        return this.f28478i;
    }

    /* renamed from: a */
    public final void mo25211a(String str) {
        C7573i.m23587b(str, "id");
        super.mo25211a(str);
        this.f28479j = true;
        this.f28480k = System.currentTimeMillis();
        C10406a b = mo25209b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C10420a.m30803a(this, "ies_hybrid_monitor", "hybrid_app_monitor_load_url_event", b, jSONObject, null, null, 48, null);
    }

    /* renamed from: a */
    public final void mo25476a(Uri uri) {
        boolean z;
        C10627a aVar;
        Uri uri2 = uri;
        C7573i.m23587b(uri2, "uri");
        boolean z2 = false;
        if (C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject = null;
        if (!z) {
            uri2 = null;
        }
        if (uri2 != null) {
            mo25210c().mo25213a(uri2);
            long currentTimeMillis = System.currentTimeMillis();
            this.f28482m.put(uri2, Long.valueOf(currentTimeMillis));
            if (!this.f28479j) {
                aVar = this;
            } else {
                aVar = null;
            }
            C10627a aVar2 = aVar;
            if (aVar2 != null) {
                String str = "ies_hybrid_monitor";
                String str2 = "hybrid_app_monitor_load_url_event";
                C10406a b = aVar2.mo25209b();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trigger", "navigation_start");
                jSONObject2.put("is_first_screen", "navigation");
                JSONObject jSONObject3 = new JSONObject();
                if (aVar2.f28481l > 0 && aVar2.f28480k > 0) {
                    z2 = true;
                }
                if (z2) {
                    jSONObject = jSONObject3;
                }
                if (jSONObject != null) {
                    jSONObject.put("first_screen_page_load_interval", aVar2.f28481l - aVar2.f28480k);
                }
                jSONObject3.put("event_ts", currentTimeMillis);
                C10420a.m30803a(aVar2, str, str2, b, jSONObject2, jSONObject3, null, 32, null);
            }
        }
    }

    /* renamed from: b */
    public final void mo25477b(Uri uri) {
        boolean z;
        String str;
        boolean z2;
        JSONObject jSONObject;
        boolean z3;
        Uri uri2 = uri;
        C7573i.m23587b(uri2, "uri");
        if (C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
            z = true;
        } else {
            z = false;
        }
        JSONObject jSONObject2 = null;
        if (!z) {
            uri2 = null;
        }
        if (uri2 != null) {
            Long l = (Long) this.f28482m.remove(uri2);
            if (l != null) {
                long longValue = l.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f28479j) {
                    longValue = this.f28480k;
                }
                if (this.f28479j) {
                    this.f28481l = currentTimeMillis;
                }
                String str2 = "ies_hybrid_monitor";
                String str3 = "hybrid_app_monitor_load_url_event";
                C10406a b = mo25209b();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("trigger", "on_load");
                String str4 = "is_first_screen";
                if (this.f28479j) {
                    str = "first_screen";
                } else {
                    str = "navigation";
                }
                jSONObject3.put(str4, str);
                JSONObject jSONObject4 = new JSONObject();
                if (currentTimeMillis <= 0 || longValue <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    jSONObject = jSONObject4;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject.put("page_load_interval", currentTimeMillis - longValue);
                }
                if (this.f28481l <= 0 || this.f28480k <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    jSONObject2 = jSONObject4;
                }
                if (jSONObject2 != null) {
                    jSONObject2.put("first_screen_page_load_interval", this.f28481l - this.f28480k);
                }
                jSONObject4.put("event_ts", currentTimeMillis);
                C10420a.m30803a(this, str2, str3, b, jSONObject3, jSONObject4, null, 32, null);
                this.f28479j = false;
            }
        }
    }

    public C10627a(Uri uri, C10403b bVar) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "providerFactory");
        super(uri, bVar);
    }
}
