package com.bytedance.apm.p241f;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.C6179d;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p241f.C6201d;
import com.bytedance.apm.p246i.C6215a;
import com.bytedance.apm.util.C6294k;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a */
public abstract class C6189a<T extends C6201d> implements C6200c, C6480a {

    /* renamed from: b */
    private static int f18233b = 1000;

    /* renamed from: a */
    public C6215a f18234a;

    /* renamed from: c */
    private final LinkedList<T> f18235c = new LinkedList<>();

    /* renamed from: d */
    private volatile boolean f18236d;

    /* renamed from: a */
    public final void mo14917a(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        C6198b.m19243a(this, str, str2, jSONObject, z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14920b(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14922c(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo14924d(T t);

    public void onRefresh(JSONObject jSONObject, boolean z) {
    }

    public void onReady() {
        this.f18236d = true;
        m19206b();
    }

    protected C6189a() {
    }

    /* renamed from: a */
    public static boolean m19205a() {
        if (ActivityLifeObserver.getInstance() != null && ActivityLifeObserver.getInstance().isForeground()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m19206b() {
        LinkedList linkedList;
        synchronized (this.f18235c) {
            linkedList = new LinkedList(this.f18235c);
            this.f18235c.clear();
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            mo14924d((C6201d) it.next());
        }
    }

    /* renamed from: a */
    public static void m19203a(int i) {
        f18233b = i;
    }

    /* renamed from: a */
    public final void mo14916a(C6215a aVar) {
        this.f18234a = aVar;
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: b */
    public final boolean mo14921b(String str) {
        return ApmDelegate.getInstance().getServiceNameSwitch(str);
    }

    /* renamed from: c */
    public final boolean mo14923c(String str) {
        return ApmDelegate.getInstance().getMetricsTypeSwitch(str);
    }

    /* renamed from: e */
    private void m19207e(T t) {
        if (t != null) {
            synchronized (this.f18235c) {
                if (this.f18235c.size() > f18233b) {
                    this.f18235c.poll();
                    C6179d.m19171a().mo14889a("apm_cache_buffer_full");
                }
                this.f18235c.add(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo14915a(T t) {
        if (mo14920b(t)) {
            mo14922c(t);
            if (this.f18236d) {
                mo14924d(t);
            } else {
                m19207e(t);
            }
        }
    }

    /* renamed from: a */
    private static void m19204a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            String b = C6174c.m19153k().mo14886b();
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("session_id", b);
            }
            if (jSONObject.isNull("network_type")) {
                jSONObject.put("network_type", C6294k.m19531c(C6174c.m19129a()).getValue());
            }
            int a = C6294k.m19529a(C6174c.m19129a());
            if (a != -10000) {
                jSONObject.put("network_type_code", a);
            }
            if (jSONObject.isNull("timestamp") || jSONObject.optLong("timestamp") <= 0) {
                jSONObject.put("timestamp", System.currentTimeMillis());
            }
            if (jSONObject.isNull("sid")) {
                jSONObject.put("sid", C6174c.m19147e());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo14918a(String str) {
        return ApmDelegate.getInstance().getLogTypeSwitch(str);
    }

    /* renamed from: b */
    public final void mo14919b(final String str, final String str2, final JSONObject jSONObject, boolean z, boolean z2) {
        if (!TextUtils.equals(str, "timer")) {
            m19204a(jSONObject);
        }
        try {
            C6202e.m19259a().mo14932a(str, str2, jSONObject, z, z2);
        } catch (Exception e) {
            C2077a.m9161a((Throwable) e, "apm_basepipeline_logSend");
        }
        if (this.f18234a != null) {
            ApmDelegate.getInstance().submitTask(new Runnable() {
                public final void run() {
                    C6189a.this.f18234a.mo14953a(str, str2, jSONObject);
                }
            });
        }
    }
}
