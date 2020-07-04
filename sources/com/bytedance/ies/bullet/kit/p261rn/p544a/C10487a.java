package com.bytedance.ies.bullet.kit.p261rn.p544a;

import android.net.Uri;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.p543b.C10406a;
import com.bytedance.ies.bullet.core.monitor.C10420a;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.a.a */
public final class C10487a extends C10420a {

    /* renamed from: h */
    private final String f28213h = "rn";

    /* renamed from: i */
    private long f28214i;

    /* renamed from: j */
    private long f28215j;

    /* renamed from: k */
    private long f28216k;

    /* renamed from: l */
    private long f28217l;

    /* renamed from: m */
    private long f28218m;

    /* renamed from: a */
    public final String mo25208a() {
        return this.f28213h;
    }

    /* renamed from: d */
    public final void mo25271d() {
        this.f28215j = System.currentTimeMillis();
        C10406a b = mo25209b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "dynamic_update_start");
        jSONObject.put("is_first_screen", "first_screen");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("event_ts", this.f28215j);
        C10420a.m30803a(this, "ies_hybrid_monitor", "hybrid_app_monitor_load_url_event", b, jSONObject, jSONObject2, null, 32, null);
    }

    /* renamed from: e */
    public final void mo25272e() {
        this.f28216k = System.currentTimeMillis();
        C10406a b = mo25209b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "dynamic_update_end");
        jSONObject.put("is_first_screen", "first_screen");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dynamic_update_interval", this.f28216k - this.f28215j);
        jSONObject2.put("event_ts", this.f28216k);
        C10420a.m30803a(this, "ies_hybrid_monitor", "hybrid_app_monitor_load_url_event", b, jSONObject, jSONObject2, null, 32, null);
    }

    /* renamed from: f */
    public final void mo25273f() {
        boolean z;
        JSONObject jSONObject;
        this.f28217l = System.currentTimeMillis();
        String str = "ies_hybrid_monitor";
        String str2 = "hybrid_app_monitor_load_url_event";
        C10406a b = mo25209b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trigger", "prepare_rn_start");
        jSONObject2.put("is_first_screen", "first_screen");
        JSONObject jSONObject3 = new JSONObject();
        if (this.f28216k <= 0 || this.f28215j <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONObject.put("dynamic_update_interval", this.f28216k - this.f28215j);
        }
        jSONObject3.put("event_ts", this.f28217l);
        C10420a.m30803a(this, str, str2, b, jSONObject2, jSONObject3, null, 32, null);
    }

    /* renamed from: g */
    public final void mo25274g() {
        boolean z;
        JSONObject jSONObject;
        this.f28218m = System.currentTimeMillis();
        String str = "ies_hybrid_monitor";
        String str2 = "hybrid_app_monitor_load_url_event";
        C10406a b = mo25209b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trigger", "prepare_rn_end");
        jSONObject2.put("is_first_screen", "first_screen");
        JSONObject jSONObject3 = new JSONObject();
        if (this.f28216k <= 0 || this.f28215j <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONObject.put("dynamic_update_interval", this.f28216k - this.f28215j);
        }
        jSONObject3.put("prepare_rn_interval", this.f28218m - this.f28217l);
        jSONObject3.put("event_ts", this.f28218m);
        C10420a.m30803a(this, str, str2, b, jSONObject2, jSONObject3, null, 32, null);
    }

    /* renamed from: a */
    public final void mo25211a(String str) {
        C7573i.m23587b(str, "id");
        super.mo25211a(str);
        this.f28214i = System.currentTimeMillis();
        C10406a b = mo25209b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        C10420a.m30803a(this, "ies_hybrid_monitor", "hybrid_app_monitor_load_url_event", b, jSONObject, null, null, 48, null);
    }

    /* renamed from: a */
    public final void mo25270a(JSONObject jSONObject) {
        boolean z;
        JSONObject jSONObject2;
        boolean z2;
        JSONObject jSONObject3;
        boolean z3;
        JSONObject jSONObject4;
        boolean z4;
        long currentTimeMillis = System.currentTimeMillis();
        String str = "ies_hybrid_monitor";
        String str2 = "hybrid_app_monitor_load_url_event";
        C10406a b = mo25209b();
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("trigger", "on_load");
        jSONObject5.put("is_first_screen", "first_screen");
        JSONObject jSONObject6 = new JSONObject();
        if (this.f28216k <= 0 || this.f28215j <= 0) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject7 = null;
        if (z) {
            jSONObject2 = jSONObject6;
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            jSONObject2.put("dynamic_update_interval", this.f28216k - this.f28215j);
        }
        if (this.f28218m <= 0 || this.f28217l <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            jSONObject3 = jSONObject6;
        } else {
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            jSONObject3.put("prepare_rn_interval", this.f28218m - this.f28217l);
        }
        if (currentTimeMillis <= 0 || this.f28218m <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            jSONObject4 = jSONObject6;
        } else {
            jSONObject4 = null;
        }
        if (jSONObject4 != null) {
            jSONObject4.put("load_interval", currentTimeMillis - this.f28218m);
        }
        if (currentTimeMillis <= 0 || this.f28214i <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            jSONObject7 = jSONObject6;
        }
        if (jSONObject7 != null) {
            jSONObject7.put("page_load_interval", currentTimeMillis - this.f28214i);
        }
        jSONObject6.put("event_ts", currentTimeMillis);
        C10420a.m30803a(this, str, str2, b, jSONObject5, jSONObject6, null, 32, null);
    }

    public C10487a(Uri uri, C10403b bVar) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(bVar, "providerFactory");
        super(uri, bVar);
    }
}
