package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.lighten.loader.C12180s;
import com.facebook.imagepipeline.p717d.C13613j;
import com.facebook.react.bridge.OnRNLoadExceptionListener;
import com.facebook.react.bridge.PageFinishedListener;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactBridge.JSExceptionListener;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C23016o.C23017a;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.service.IReactService;
import com.p280ss.android.ugc.aweme.experiment.RNLibrarianExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.d */
public class C25917d {

    /* renamed from: a */
    private static volatile boolean f68566a;

    /* renamed from: a */
    public static void m85213a() {
        IReactService d = m85218d();
        if (d != null) {
            d.invoke();
        }
    }

    /* renamed from: b */
    public static void m85216b() {
        IReactService d = m85218d();
        if (d != null) {
            d.rePrepareReactContext();
        }
    }

    /* renamed from: d */
    private static IReactService m85218d() {
        m85215a(C12180s.m35428a().f32427a);
        return (IReactService) ServiceManager.get().getService(IReactService.class);
    }

    /* renamed from: c */
    public static void m85217c() {
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            boolean a = C6384b.m19835a().mo15292a(RNLibrarianExperiment.class, true, "rn_use_librarian", C6384b.m19835a().mo15295d().rn_use_librarian, false);
            C259192 r3 = new OnRNLoadExceptionListener() {
                public final void onLoadError(String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("library_load_status", "false");
                        jSONObject.put("info", str);
                    } catch (Exception unused) {
                    }
                    C6759a.m20910a("reactnative_load_library_error", jSONObject);
                    C25917d.m85214a(System.currentTimeMillis() - currentTimeMillis, str);
                }
            };
            if (a) {
                ReactBridge.staticInit(r3, C25922e.f68569a);
            } else {
                ReactBridge.staticInit(r3);
            }
            ReactBridge.setPageFinishListener(new PageFinishedListener() {
                public final void upLoad(JSONObject jSONObject) {
                    C6379c.m19828a("reactnative_page_pref_log", (JSONObject) null, jSONObject, (JSONObject) null);
                    C30388i b = C25871a.m85133a().mo67248b();
                    if (b != null) {
                        C30395o oVar = (C30395o) b.mo80008a(C30395o.class);
                        if (oVar != null) {
                            oVar.mo80021a(jSONObject);
                        }
                    }
                }
            });
            ReactBridge.setJSExceptionListener(new JSExceptionListener() {
                public final void upLoad(JSONObject jSONObject) {
                    C30388i b = C25871a.m85133a().mo67248b();
                    if (b != null) {
                        C30395o oVar = (C30395o) b.mo80008a(C30395o.class);
                        if (oVar != null) {
                            oVar.mo80025b(jSONObject);
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m85215a(final C13613j jVar) {
        if (!f68566a) {
            synchronized (C25917d.class) {
                if (!f68566a) {
                    ServiceManager.get().bind(IReactService.class, new ServiceProvider<IReactService>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public IReactService get() {
                            IReactService iReactService = (IReactService) ServiceManager.get().getService(IReactService.class, true);
                            if (iReactService != null) {
                                iReactService.init(AwemeApplication.m21341a(), new C25909a(jVar), new C25923f());
                            }
                            return iReactService;
                        }
                    }).asSingleton();
                    f68566a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m85214a(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_cost", j);
            jSONObject.put("failed_info", str);
            C23017a.m75671a("ies_hybrid_monitor", "hybrid_app_monitor_rn_base_load", new JSONObject(), jSONObject, new JSONObject(), null);
        } catch (Exception unused) {
        }
    }
}
