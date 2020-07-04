package com.p280ss.android.ugc.aweme.thread;

import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.thread.l */
public final class C42115l implements C7245c {
    /* renamed from: a */
    public final boolean mo18963a() {
        if (C6379c.m19829a("startup_thread_info") || C7163a.m22363a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo18965b() {
        if (C6379c.m19829a("task_wait_timeout") || C7163a.m22363a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo18967c() {
        if (C6379c.m19829a("task_execute_timeout") || C7163a.m22363a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo18969d() {
        if (C6379c.m19829a("task_blocked") || C7163a.m22363a()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo18971e() {
        if (C6379c.m19829a("task_rejected") || C7163a.m22363a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo18968d(JSONObject jSONObject) {
        C6893q.m21447a("task_blocked", jSONObject);
    }

    /* renamed from: e */
    public final void mo18970e(JSONObject jSONObject) {
        C6893q.m21447a("task_rejected", jSONObject);
    }

    /* renamed from: b */
    public final void mo18964b(JSONObject jSONObject) {
        if (jSONObject != null) {
            C6893q.m21447a("task_wait_timeout", jSONObject);
        }
    }

    /* renamed from: c */
    public final void mo18966c(JSONObject jSONObject) {
        if (jSONObject != null) {
            C6893q.m21447a("task_execute_timeout", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo18962a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("cpu_core_count", Runtime.getRuntime().availableProcessors());
                jSONObject.put("active_thread_count_in_feed", Thread.getAllStackTraces().size());
            } catch (JSONException unused) {
            }
            C6893q.m21447a("startup_thread_info", jSONObject);
        }
    }
}
