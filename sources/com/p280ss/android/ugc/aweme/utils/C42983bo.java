package com.p280ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.android.livesdkapi.p450f.C9407c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.C10873f.C10883a;
import com.bytedance.ies.geckoclient.C10887i;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.p567a.C10836a.C10838a;
import com.bytedance.ies.geckoclient.p567a.C10839b;
import com.bytedance.ies.geckoclient.p570d.C10853b;
import com.bytedance.ies.geckoclient.p571e.C10869f;
import com.bytedance.ies.geckoclient.p571e.C10869f.C10870a;
import com.bytedance.ies.geckoclient.p572f.C10884a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.anywheredoor_api.C19221a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b;
import com.p280ss.android.ugc.aweme.crossplatform.abtest.DynamicChannelExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e;
import com.p280ss.android.ugc.aweme.p1664t.C42104a;
import com.p280ss.android.ugc.aweme.p1664t.C42105b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.C37562ao.C37566a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.p1694c.C42999a;
import com.p280ss.android.ugc.aweme.web.C43440c;
import com.p280ss.android.ugc.aweme.web.C43441d;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.bo */
public class C42983bo {

    /* renamed from: a */
    private static volatile long f111540a;

    /* renamed from: b */
    private static volatile boolean f111541b;

    /* renamed from: c */
    private static AtomicBoolean f111542c = new AtomicBoolean(false);

    /* renamed from: d */
    private static String f111543d;

    /* renamed from: a */
    public static Set<String> m136455a() {
        return C42999a.m136490a().f111565c.mo104693a();
    }

    /* renamed from: b */
    public static C10873f m136460b() {
        C43440c cVar = (C43440c) ServiceManager.get().getService(C43440c.class);
        if (cVar != null) {
            return cVar.mo105374a(C43447i.m137872c().mo105382g());
        }
        return null;
    }

    /* renamed from: c */
    public static C10873f m136465c() {
        C43440c cVar = (C43440c) ServiceManager.get().getService(C43440c.class);
        if (cVar != null) {
            return cVar.mo105376b(C43447i.m137872c().mo105382g());
        }
        return null;
    }

    /* renamed from: d */
    public static C10873f m136468d() {
        C43440c cVar = (C43440c) ServiceManager.get().getService(C43440c.class);
        if (cVar != null) {
            return cVar.mo105374a(C43447i.m137876h());
        }
        return null;
    }

    /* renamed from: e */
    private static Map<String, String> m136470e() {
        HashMap hashMap = new HashMap();
        hashMap.put("channel", C6399b.m19941q());
        hashMap.put("iid", TeaAgent.getInstallId());
        return hashMap;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m136454a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            C10873f fVar = (C10873f) hVar.mo6890e();
            if (fVar != null) {
                fVar.mo26219a(new String[0]);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m136472f(String str) {
        m136456a(str);
        C1592h.m7853a(C42989bt.f111549a).mo6876a(C42990bu.f111550a, (Executor) C1592h.f5957a);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m136473g(String str) {
        m136456a(str);
        C1592h.m7853a(C42991bv.f111551a).mo6876a(C42992bw.f111552a, (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    public static void m136456a(String str) {
        if (!f111542c.get()) {
            f111543d = str;
            synchronized (C42983bo.class) {
                if (!f111542c.get()) {
                    ServiceManager.get().bind(C43440c.class, new C42985bp(str)).asSingleton();
                    f111542c.set(true);
                }
            }
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Void m136462b(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            C10873f fVar = (C10873f) hVar.mo6890e();
            if (fVar != null) {
                fVar.mo26219a(new String[0]);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m136467c(String str) {
        if (((Set) SharePrefCache.inst().getGeckoInitialHighPriorityChannels().mo59877d()).isEmpty()) {
            C37562ao.m120324a().mo94851a((C37566a) new C42988bs(str));
        } else {
            m136473g(str);
        }
    }

    /* renamed from: d */
    static final /* synthetic */ C43440c m136469d(String str) {
        C43440c cVar = new C43440c();
        String g = C43447i.m137872c().mo105382g();
        cVar.mo105375a(g, m136453a(str, g));
        if (!C6399b.m19944t()) {
            String h = C43447i.m137876h();
            cVar.mo105375a(h, m136466c(str, h));
        }
        return cVar;
    }

    /* renamed from: e */
    private static void m136471e(String str) {
        boolean bf = C7213d.m22500a().mo18794bf();
        C10869f a = C10869f.m31887a();
        if (bf) {
            a.mo26201b();
        } else {
            a.mo26203c();
        }
        a.mo26200a(str, new C10870a() {

            /* renamed from: a */
            private long f111544a;

            /* renamed from: a */
            public final void mo26204a(String str) {
                this.f111544a = SystemClock.uptimeMillis();
            }

            /* renamed from: b */
            public final void mo26205b(String str) {
                boolean z = C10869f.m31887a().f29403a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", SystemClock.uptimeMillis() - this.f111544a);
                    jSONObject.put("accesskey", str);
                    jSONObject.put("enable", z);
                } catch (Exception unused) {
                }
                C6893q.m21452b("service_monitor", "gecko_io_performance", jSONObject);
            }
        });
    }

    /* renamed from: a */
    private static void m136458a(Collection<String> collection) {
        if (C6384b.m19835a().mo15287a(DynamicChannelExperiment.class, true, "bundle_dynamic_load", C6384b.m19835a().mo15295d().bundle_dynamic_load, 0) == 1) {
            collection.removeAll(C42999a.m136490a().f111565c.mo104693a());
        }
    }

    /* renamed from: b */
    public static void m136463b(String str) {
        if (!f111541b || SystemClock.elapsedRealtime() - f111540a >= 3600000) {
            if (((Set) SharePrefCache.inst().getGeckoChannels().mo59877d()).isEmpty()) {
                C37562ao.m120324a().mo94851a((C37566a) new C42987br(str));
            } else {
                m136472f(str);
            }
            f111541b = true;
            f111540a = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    private static C10873f m136461b(String str, String str2) {
        String serverDeviceId = AppLog.getServerDeviceId();
        String e = C43447i.m137874e();
        Set<String> a = C42999a.m136490a().f111564b.mo104693a();
        Set set = (Set) SharePrefCache.inst().getGeckoInitialHighPriorityChannels().mo59877d();
        if (!C6307b.m19566a((Collection<T>) set)) {
            a.addAll(set);
        }
        if (C6307b.m19566a((Collection<T>) a)) {
            return null;
        }
        try {
            m136471e(str2);
            C10883a a2 = C10873f.m31899a(C6399b.m19921a(), str2, str, serverDeviceId, e, "live_gecko", 1233).mo26255a(C43447i.m137875f()).mo26253a((C10887i) new C43441d()).mo26251a((C10853b) new C42105b()).mo26252a((C10884a) new C42104a()).mo26258b(60, TimeUnit.SECONDS).mo26249a(60, TimeUnit.SECONDS).mo26256a(m136470e()).mo26250a(new C10838a().mo26167a(C10839b.f29346a).mo26169a());
            a.add("rn_base_android");
            a.add("rn_snapshot");
            m136458a((Collection<String>) a);
            for (String dVar : a) {
                a2.mo26254a(new C10903d(dVar));
            }
            C42999a.m136490a().f111566d.mo104695b(a);
            return a2.mo26257a();
        } catch (Exception e2) {
            C27873e.f73441a.mo71355a("warning", e2);
            return null;
        }
    }

    /* renamed from: c */
    private static C10873f m136466c(String str, String str2) {
        int i;
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        String e = C43447i.m137874e();
        if (C7163a.m22363a()) {
            C10873f.m31901a();
        }
        try {
            i = C30199h.m98861a().getAdLandingPageConfig().getAdLandingPagePreloadCacheCount().intValue();
        } catch (NullValueException unused) {
            i = 20;
        }
        try {
            m136471e(str2);
            C10883a a = C10873f.m31899a(C6399b.m19921a(), str2, str, serverDeviceId, e, "live_gecko", 1233).mo26255a(C43447i.m137875f()).mo26253a((C10887i) new C43441d()).mo26251a((C10853b) new C42105b()).mo26252a((C10884a) new C42104a()).mo26258b(60, TimeUnit.SECONDS).mo26249a(60, TimeUnit.SECONDS).mo26256a(m136470e());
            C10838a a2 = new C10838a().mo26166a(i).mo26167a(C10839b.f29348c);
            C24736b bVar = C24736b.f65176b;
            bVar.getClass();
            return a.mo26250a(a2.mo26168a(C42986bq.m136476a(bVar)).mo26169a()).mo26257a();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static C10873f m136453a(String str, String str2) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        Set<String> a = C42999a.m136490a().f111563a.mo104693a();
        a.addAll((Collection) SharePrefCache.inst().getGeckoChannels().mo59877d());
        if (a.isEmpty()) {
            return null;
        }
        a.addAll(C9407c.f25890c);
        try {
            a.addAll(C30199h.m98861a().getAdLandingPageConfig().getAdLandingPagePreloadCommonChannel());
        } catch (NullValueException unused) {
        }
        String e = C43447i.m137874e();
        if (C7163a.m22363a()) {
            C10873f.m31901a();
        }
        try {
            m136471e(str2);
            C10883a a2 = C10873f.m31899a(C6399b.m19921a(), str2, str, serverDeviceId, e, "live_gecko", 1233).mo26255a(C43447i.m137875f()).mo26253a((C10887i) new C43441d()).mo26251a((C10853b) new C42105b()).mo26252a((C10884a) new C42104a()).mo26258b(60, TimeUnit.SECONDS).mo26249a(60, TimeUnit.SECONDS).mo26256a(m136470e()).mo26250a(new C10838a().mo26167a(C10839b.f29346a).mo26169a());
            a.add("rn_base_android");
            a.add("rn_snapshot");
            a.add("poi_resource");
            a.add("gecko_hybrid_prefetch_zip");
            if (C7163a.m22363a()) {
                a.add(C19221a.m62952a());
            }
            m136458a((Collection<String>) a);
            Set a3 = C42999a.m136490a().f111566d.mo104693a();
            if (!C6307b.m19566a((Collection<T>) a3)) {
                a.removeAll(a3);
            }
            for (String dVar : a) {
                a2.mo26254a(new C10903d(dVar));
            }
            return a2.mo26257a();
        } catch (Exception e2) {
            C27873e.f73441a.mo71355a("warning", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static void m136459a(List<String> list, List<String> list2, List<String> list3) {
        if (list != null) {
            C42999a.m136490a().f111563a.mo104694a(list);
        }
        if (!C6307b.m19566a((Collection<T>) list2)) {
            C42999a.m136490a().f111564b.mo104694a(list2);
        }
        if (!C6307b.m19566a((Collection<T>) list3)) {
            C42999a.m136490a().f111565c.mo104694a(list3);
        }
        if (f111543d != null) {
            C43440c cVar = (C43440c) ServiceManager.get().getService(C43440c.class);
            if (cVar != null) {
                String g = C43447i.m137872c().mo105382g();
                if (cVar.mo105374a(g) == null) {
                    C10873f b = m136461b(f111543d, g);
                    if (b != null) {
                        cVar.mo105377b(g, b);
                    }
                    cVar.mo105375a(g, m136453a(f111543d, g));
                }
            }
        }
    }
}
