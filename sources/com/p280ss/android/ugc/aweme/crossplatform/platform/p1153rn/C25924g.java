package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import bolts.C1590f;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.p569c.C10850a;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.params.DynamicType;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.model.RNBundleInfo;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26022a;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26024b;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26029f;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26033g;
import com.p280ss.android.ugc.aweme.framework.C29943a;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30395o;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import com.p280ss.android.ugc.aweme.utils.C43018cm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.g */
public final class C25924g {

    /* renamed from: a */
    public C25928b f68570a;

    /* renamed from: b */
    public boolean f68571b = false;

    /* renamed from: c */
    private final RnResourceDownloader f68572c;

    /* renamed from: d */
    private boolean f68573d;

    /* renamed from: e */
    private C1590f f68574e = new C1590f();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.g$a */
    static class C25927a {

        /* renamed from: a */
        public String f68584a;

        private C25927a() {
        }

        /* renamed from: a */
        public final boolean mo67308a() {
            if (TextUtils.isEmpty(this.f68584a) || !new File(this.f68584a).exists()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.g$b */
    public interface C25928b {
        /* renamed from: a */
        void mo67309a(C26024b<ReactInstanceManager> bVar);

        /* renamed from: a */
        void mo67310a(Exception exc);
    }

    /* renamed from: a */
    public final void mo67303a() {
        this.f68570a = null;
    }

    /* renamed from: a */
    public final void mo67305a(String str, C25886b bVar, C25928b bVar2, boolean z, long j, boolean z2) {
        mo67304a(str, bVar, new C25927a(), bVar2, z, 0, z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67306a(String str, C26024b bVar, ReactContext reactContext) {
        try {
            if (!this.f68571b) {
                this.f68574e.mo6871c();
                if (!TextUtils.isEmpty(str)) {
                    m85226a(reactContext, str);
                }
                C30395o b = m85231b();
                if (b != null) {
                    b.mo80022a(false);
                }
                if (this.f68570a != null) {
                    this.f68570a.mo67309a(bVar);
                }
            }
        } catch (Exception e) {
            if (this.f68570a != null) {
                this.f68570a.mo67310a(e);
            }
        }
    }

    /* renamed from: b */
    public static C30395o m85231b() {
        C30388i b = C25871a.m85133a().mo67248b();
        if (b != null) {
            return (C30395o) b.mo80008a(C30395o.class);
        }
        return null;
    }

    public C25924g(Context context) {
        this.f68572c = new RnResourceDownloader(context);
    }

    /* renamed from: a */
    private static boolean m85229a(Uri uri) {
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        List<String> dmtSourceUrlWhitelist = C30199h.m98861a().getDmtSourceUrlWhitelist();
        if (dmtSourceUrlWhitelist == null || dmtSourceUrlWhitelist.isEmpty()) {
            return true;
        }
        for (String str : dmtSourceUrlWhitelist) {
            if (str != null && host.contains(str)) {
                return true;
            }
        }
        if (!C7163a.m22363a() || !TextUtils.equals(host, C25935n.m85247a().f68609a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m85226a(ReactContext reactContext, String str) {
        ((CatalystInstanceImpl) reactContext.getCatalystInstance()).loadScriptFromFile(str, str, false);
    }

    /* renamed from: a */
    static final /* synthetic */ void m85227a(C25928b bVar, Exception exc) {
        if (bVar != null) {
            bVar.mo67310a(exc);
        }
    }

    /* renamed from: a */
    private boolean m85230a(C25886b bVar, C10903d dVar) {
        if (bVar.f68475c.f68500k) {
            if (bVar.f68475c.f68501l == DynamicType.FROCE_DYNAMIC) {
                return true;
            }
            if (!this.f68573d && dVar == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static ReactInstanceManager m85224a(String str, C25886b bVar, C25928b bVar2) {
        C29943a reactNativeHost = ReactInstance.getReactNativeHost(str, new C25929h(bVar2));
        reactNativeHost.f78723a = C43018cm.m136528a("channel_name", bVar.f68475c.mo67272a(), "module_name", bVar.f68475c.f68494e);
        return reactNativeHost.getReactInstanceManager();
    }

    /* renamed from: a */
    private void m85228a(C26024b<ReactInstanceManager> bVar, String str, C25928b bVar2, long j, boolean z) {
        if (bVar == null) {
            bVar2.mo67310a((Exception) new IllegalStateException("ReactInstanceManager Reference is null"));
            return;
        }
        ReactInstanceManager reactInstanceManager = (ReactInstanceManager) bVar.mo67542b();
        if (reactInstanceManager == null) {
            bVar2.mo67310a((Exception) new IllegalStateException("ReactInstanceManager is null"));
            return;
        }
        C30395o b = m85231b();
        if (b != null) {
            b.mo80026c();
        }
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext != null) {
            try {
                if (!TextUtils.isEmpty(str) && z) {
                    m85226a(currentReactContext, str);
                }
                C30395o b2 = m85231b();
                if (b2 != null) {
                    b2.mo80022a(true);
                }
                bVar2.mo67309a(bVar);
            } catch (Exception e) {
                bVar2.mo67310a(e);
            }
        } else {
            this.f68570a = bVar2;
            reactInstanceManager.addReactInstanceEventListener(new C25932k(this, str, bVar));
            if (!reactInstanceManager.hasStartedCreatingInitialContext()) {
                reactInstanceManager.createReactContextInBackground();
            }
            this.f68571b = false;
            if (j > 0) {
                this.f68574e = new C1590f();
                C1592h.m7848a(j).mo6877a((C1591g<TResult, TContinuationResult>) new C1591g<Void, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<Void> hVar) throws Exception {
                        C25924g.this.f68571b = true;
                        if (C25924g.this.f68570a != null) {
                            C25924g.this.f68570a.mo67310a(new Exception("ReactInstanceEventListener callback timeout"));
                        }
                        return null;
                    }
                }, C1592h.f5958b, this.f68574e.mo6870b());
            }
        }
    }

    /* renamed from: c */
    private boolean m85233c(String str, C25886b bVar, C25927a aVar, C25928b bVar2, boolean z, long j, boolean z2) {
        String str2 = bVar.f68475c.f68502m;
        if (TextUtils.isEmpty(str2) || !m85229a(Uri.parse(str2))) {
            return true;
        }
        C30395o b = m85231b();
        if (b != null) {
            b.aX_();
        }
        RnResourceDownloader rnResourceDownloader = this.f68572c;
        C25930i iVar = new C25930i(this, aVar, str, bVar, bVar2, z, j, z2);
        rnResourceDownloader.mo67279a(str2, iVar, new C25931j(bVar2));
        return false;
    }

    /* renamed from: b */
    private boolean m85232b(String str, C25886b bVar, C25927a aVar, C25928b bVar2, boolean z, long j, boolean z2) {
        RNBundleInfo rNBundleInfo;
        C25886b bVar3 = bVar;
        C25928b bVar4 = bVar2;
        C10873f b = C42983bo.m136460b();
        if (b == null) {
            bVar4.mo67310a(new Exception("gecko client is null"));
            return false;
        }
        C10903d a = b.mo26209a(bVar3.f68475c.mo67272a());
        if (m85230a(bVar3, a)) {
            C30395o b2 = m85231b();
            if (b2 != null) {
                b2.aX_();
            }
            String a2 = bVar3.f68475c.mo67272a();
            final String str2 = str;
            final C25886b bVar5 = bVar;
            final C25927a aVar2 = aVar;
            final C25928b bVar6 = bVar2;
            final boolean z3 = z;
            final long j2 = j;
            final boolean z4 = z2;
            C259251 r0 = new C10850a() {
                /* renamed from: a */
                public final void mo26174a() {
                    C25933l lVar = new C25933l(this, str2, bVar5, aVar2, bVar6, z3, j2, z4);
                    C1592h.m7855a((Callable<TResult>) lVar, C1592h.f5958b);
                }

                /* renamed from: a */
                public final void mo26175a(String str, Exception exc) {
                    C1592h.m7855a((Callable<TResult>) new C25934m<TResult>(bVar6, str), C1592h.f5958b);
                }

                /* renamed from: a */
                static final /* synthetic */ Void m85239a(C25928b bVar, String str) throws Exception {
                    StringBuilder sb = new StringBuilder("check update to latest fail: ");
                    sb.append(str);
                    bVar.mo67310a(new Exception(sb.toString()));
                    return null;
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ Void mo67307a(String str, C25886b bVar, C25927a aVar, C25928b bVar2, boolean z, long j, boolean z2) throws Exception {
                    C30395o b = C25924g.m85231b();
                    if (b != null) {
                        b.aY_();
                    }
                    C25924g.this.mo67304a(str, bVar, aVar, bVar2, z, j, z2);
                    return null;
                }
            };
            b.mo26220a(a2, 0, (C10850a) r0);
            this.f68573d = true;
            return false;
        }
        String str3 = null;
        if (a != null && C25913b.m85203a(a)) {
            RNBundleInfo b3 = C25913b.m85204b(a);
            C10903d a3 = b.mo26209a("rn_base_android");
            if (a3 == null) {
                rNBundleInfo = null;
            } else {
                rNBundleInfo = C25913b.m85204b(a3);
            }
            if (b3 == null || C6307b.m19566a((Collection<T>) b3.getModules()) || TextUtils.isEmpty(b3.getVersion()) || TextUtils.isEmpty(b3.getBaseVersion())) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar3.f68475c.mo67272a());
                sb.append(": bundle info args error");
                bVar4.mo67310a(new Exception(sb.toString()));
                return false;
            } else if (!b3.getModules().contains(bVar3.f68475c.f68494e)) {
                StringBuilder sb2 = new StringBuilder("no such module: ");
                sb2.append(bVar3.f68475c.f68494e);
                bVar4.mo67310a(new Exception(sb2.toString()));
                return false;
            } else if (rNBundleInfo == null || TextUtils.isEmpty(rNBundleInfo.getVersion())) {
                bVar4.mo67310a(new Exception("rn_base_android: bundle info args error"));
                return false;
            } else if (!TextUtils.equals(b3.getBaseVersion(), rNBundleInfo.getVersion())) {
                bVar4.mo67310a(new Exception("patch bundle is not compat with base bundle"));
                return false;
            }
        }
        if (a != null) {
            str3 = C25913b.m85201a(a, bVar3.f68475c.mo67275b());
        }
        aVar.f68584a = str3;
        return true;
    }

    /* renamed from: a */
    public final void mo67304a(String str, C25886b bVar, C25927a aVar, C25928b bVar2, boolean z, long j, boolean z2) {
        boolean z3;
        C26024b bVar3;
        String str2;
        if (TextUtils.isEmpty(str)) {
            bVar2.mo67310a(new Exception("reactId is null"));
        } else if (bVar == null || TextUtils.isEmpty(bVar.f68475c.mo67272a()) || TextUtils.isEmpty(bVar.f68475c.f68494e)) {
            bVar2.mo67310a(new Exception("schema info, channel name or module name is null"));
        } else {
            C26024b bVar4 = null;
            if (z) {
                if (!aVar.mo67308a()) {
                    C10873f b = C42983bo.m136460b();
                    if (b == null) {
                        bVar2.mo67310a(new Exception("gecko client is null"));
                        return;
                    }
                    C10903d a = b.mo26209a("rn_base_android");
                    if (a == null) {
                        str2 = null;
                    } else {
                        str2 = C25913b.m85207c(a);
                    }
                    if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
                        bVar2.mo67310a(new Exception("baseBundleFilePath not exist"));
                        return;
                    } else if (!m85233c(str, bVar, aVar, bVar2, z, j, z2) || !m85232b(str, bVar, aVar, bVar2, z, j, z2)) {
                        return;
                    }
                }
                if (!aVar.mo67308a()) {
                    bVar2.mo67310a(new Exception("patchBundleFilePath not exist"));
                    return;
                }
            }
            C26033g gVar = new C26033g(bVar.f68475c.mo67272a(), bVar.f68475c.mo67275b());
            if (z2) {
                bVar4 = C26029f.m85505a().mo67549a(gVar);
                if (bVar4 != null) {
                    bVar4.mo67543c();
                    bVar3 = bVar4;
                    z3 = false;
                    m85228a(bVar3, aVar.f68584a, bVar2, j, z3);
                }
                ReactInstanceManager a2 = m85224a(str, bVar, bVar2);
                if (a2 != null) {
                    bVar4 = C26029f.m85505a().mo67550a(gVar, a2);
                }
            } else {
                ReactInstanceManager a3 = m85224a(str, bVar, bVar2);
                if (a3 != null) {
                    bVar3 = new C26022a(a3);
                    z3 = true;
                    m85228a(bVar3, aVar.f68584a, bVar2, j, z3);
                }
            }
            bVar3 = bVar4;
            z3 = true;
            m85228a(bVar3, aVar.f68584a, bVar2, j, z3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo67302a(C25927a aVar, String str, C25886b bVar, C25928b bVar2, boolean z, long j, boolean z2, File file) {
        if (file.exists()) {
            C30395o b = m85231b();
            if (b != null) {
                b.aY_();
            }
            C25927a aVar2 = aVar;
            aVar2.f68584a = file.getPath();
            mo67304a(str, bVar, aVar2, bVar2, z, j, z2);
        } else {
            C25928b bVar3 = bVar2;
            bVar2.mo67310a((Exception) new FileNotFoundException(file.getPath()));
        }
        return null;
    }
}
