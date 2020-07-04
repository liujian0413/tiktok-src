package com.p280ss.android.ugc.aweme.report.p1502a;

import android.os.Looper;
import com.bytedance.apm.C6159b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.bytex.coverage_lib.CoveragePlugin;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.report.a.a */
public final class C37191a implements CoveragePlugin {

    /* renamed from: a */
    private ConcurrentHashMap<Integer, Integer> f97313a;

    /* renamed from: b */
    private int f97314b;

    /* renamed from: c */
    private long f97315c;

    /* renamed from: com.ss.android.ugc.aweme.report.a.a$a */
    static class C37193a {

        /* renamed from: a */
        public static final C37191a f97316a = new C37191a();
    }

    /* renamed from: a */
    public static C37191a m119552a() {
        return C37193a.f97316a;
    }

    /* renamed from: d */
    private void m119553d() {
        Looper.myQueue().addIdleHandler(new C37194b(this));
    }

    private C37191a() {
        this.f97314b = 120000;
        this.f97313a = new ConcurrentHashMap<>(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        this.f97315c = System.currentTimeMillis() + ((long) this.f97314b);
        m119553d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo93722b() {
        if (System.currentTimeMillis() > this.f97315c) {
            if (this.f97313a.size() >= 20) {
                C7258h.m22732e().execute(new C37195c(this));
            }
            this.f97315c = System.currentTimeMillis() + ((long) this.f97314b);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo93723c() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : this.f97313a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coverage_count", sb.toString());
            C6159b.m19110a("code_coverage", jSONObject);
        } catch (JSONException unused) {
        }
        this.f97313a.clear();
    }

    public final void addData(int i) {
        Integer num = (Integer) this.f97313a.get(Integer.valueOf(i));
        if (num == null) {
            this.f97313a.put(Integer.valueOf(i), Integer.valueOf(1));
        } else {
            this.f97313a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
        }
    }
}
