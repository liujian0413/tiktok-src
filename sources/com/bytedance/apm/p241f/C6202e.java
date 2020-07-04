package com.bytedance.apm.p241f;

import android.app.Activity;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p245h.C6212a;
import com.bytedance.apm.p245h.C6213e;
import com.bytedance.apm.p247j.C6240a;
import com.bytedance.apm.p247j.C6242c;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import com.bytedance.apm.util.C6292i;
import com.bytedance.apm.util.C6295r;
import com.bytedance.frameworks.core.apm.C6360b;
import com.bytedance.frameworks.core.apm.C6363c;
import com.bytedance.frameworks.core.apm.C6363c.C6365a;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.C6478c;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.e */
public final class C6202e implements C6276b, C6365a, C6478c, C6480a {

    /* renamed from: a */
    public volatile boolean f18259a;

    /* renamed from: b */
    private final LinkedList<C6213e> f18260b;

    /* renamed from: c */
    private boolean f18261c;

    /* renamed from: d */
    private long f18262d;

    /* renamed from: e */
    private long f18263e;

    /* renamed from: f */
    private boolean f18264f;

    /* renamed from: g */
    private long f18265g;

    /* renamed from: h */
    private int f18266h;

    /* renamed from: i */
    private int f18267i;

    /* renamed from: j */
    private long f18268j;

    /* renamed from: com.bytedance.apm.f.e$a */
    static final class C6204a {

        /* renamed from: a */
        public static final C6202e f18270a = new C6202e();
    }

    /* renamed from: a */
    public static C6202e m19259a() {
        return C6204a.f18270a;
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
    }

    /* renamed from: c */
    public final void mo14870c(Activity activity) {
    }

    /* renamed from: d */
    public final int mo14936d() {
        return this.f18266h;
    }

    /* renamed from: d */
    public final void mo14871d(Activity activity) {
    }

    /* renamed from: e */
    public final int mo14937e() {
        return this.f18267i;
    }

    private C6202e() {
        this.f18260b = new LinkedList<>();
        this.f18264f = true;
    }

    /* renamed from: c */
    public final void mo14935c() {
        synchronized (this.f18260b) {
            this.f18260b.clear();
        }
    }

    public final void onReady() {
        C6363c.m19778a((C6365a) this);
        C6273b.m19475a().mo15065a((C6276b) this);
    }

    /* renamed from: b */
    public final void mo14934b() {
        this.f18261c = C6174c.m19145c();
        this.f18262d = System.currentTimeMillis();
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: b */
    private static void m19264b(C6213e eVar) {
        C6360b.m19768a().mo15270a(eVar);
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        mo14933a(false);
        m19263b(j);
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6202e.this.mo14933a(true);
            }
        });
    }

    /* renamed from: a */
    private void m19260a(C6213e eVar) {
        synchronized (this.f18260b) {
            if (this.f18260b.size() >= 2000) {
                this.f18260b.poll();
                new String[1][0] = " buffer log too many, lost happen";
            }
            this.f18260b.add(eVar);
        }
    }

    /* renamed from: b */
    private void m19263b(long j) {
        if (this.f18264f && j - this.f18268j >= 1200000) {
            this.f18268j = j;
            if (Environment.getDataDirectory().getFreeSpace() < this.f18265g * 1024 * 1024) {
                this.f18264f = false;
                C6360b.m19768a().mo15269a(C6295r.m19533a(5));
            }
        }
    }

    /* renamed from: a */
    private static void m19262a(ArrayList<? extends C6213e> arrayList) {
        int size = arrayList.size() / 2;
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6213e eVar = (C6213e) it.next();
            if (eVar != null) {
                if (TextUtils.equals("api_all", eVar.f18294g)) {
                    arrayList3.add((C6212a) eVar);
                } else {
                    arrayList2.add(eVar);
                }
            }
        }
        if (!C6292i.m19525a((List<?>) arrayList2)) {
            C6360b.m19768a().mo15274b((List<C6213e>) arrayList2);
            if (C6174c.m19149g()) {
                m19261a("savedb_default", arrayList2);
            }
        }
        if (!C6292i.m19525a((List<?>) arrayList3)) {
            C6360b.m19768a().mo15271a((List<C6212a>) arrayList3);
            if (C6174c.m19149g()) {
                m19261a("savedb_api", arrayList3);
            }
        }
    }

    /* renamed from: a */
    public final void mo14933a(boolean z) {
        ArrayList arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f18261c || currentTimeMillis - this.f18262d >= 60000) {
            int size = this.f18260b.size();
            if (size != 0) {
                if (z || size >= 5 || currentTimeMillis - this.f18263e > 120000) {
                    this.f18263e = currentTimeMillis;
                    synchronized (this.f18260b) {
                        arrayList = new ArrayList(this.f18260b);
                        this.f18260b.clear();
                    }
                    m19262a(arrayList);
                }
            }
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        this.f18264f = jSONObject.optBoolean("local_monitor_switch", true);
        this.f18265g = jSONObject.optLong("local_monitor_min_free_disk_mb", 150);
        this.f18266h = jSONObject.optInt("log_reserve_days", 7);
        this.f18267i = jSONObject.optInt("log_max_size_mb", 80);
    }

    /* renamed from: a */
    private static void m19261a(String str, ArrayList<? extends C6213e> arrayList) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size(); i++) {
            jSONArray.put(((C6213e) arrayList.get(i)).f18296i);
        }
        C6242c.m19340a(C6240a.f18364i, str, jSONArray.toString());
    }

    /* renamed from: a */
    public final void mo14932a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        if (C6174c.m19149g()) {
            C6242c.m19340a(C6240a.f18364i, "logType", str, "subType", str2, "data", jSONObject, "sample", Boolean.valueOf(z));
        }
        if (!this.f18259a) {
            if (z || this.f18264f) {
                C6213e a = C6213e.m19288c(str).mo14949b(str2).mo14945a(jSONObject).mo14948a(z).mo14946a(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                if (z2) {
                    m19264b(a);
                } else {
                    m19260a(a);
                }
            }
        }
    }
}
