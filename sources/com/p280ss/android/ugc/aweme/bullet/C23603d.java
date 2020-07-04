package com.p280ss.android.ugc.aweme.bullet;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.bullet.base.p535a.C10311a;
import com.bytedance.ies.bullet.base.p535a.p537b.C10313a;
import com.bytedance.ies.bullet.base.p535a.p537b.C10314b;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.core.kit.C10383h;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.kit.p261rn.C10488b;
import com.bytedance.ies.bullet.kit.p261rn.C10498e;
import com.bytedance.ies.bullet.kit.p261rn.C10504h;
import com.bytedance.ies.bullet.kit.p261rn.C10579k;
import com.bytedance.ies.bullet.kit.p261rn.C10580l;
import com.bytedance.ies.bullet.kit.web.C10626b;
import com.bytedance.ies.bullet.kit.web.C10641h;
import com.bytedance.ies.bullet.kit.web.C10642i;
import com.bytedance.ies.bullet.kit.web.C10644k;
import com.bytedance.ies.bullet.kit.web.C10647n;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.bullet.kit.web.p549c.C10630a;
import com.bytedance.ies.geckoclient.C10873f;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.newmedia.p897ui.webview.C19996a;
import com.p280ss.android.sdk.webview.C20142i;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.FetchMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.OpenAwemeMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.OpenMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import com.p280ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import com.p280ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25914c.C25915a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.web.C43447i;
import com.p280ss.android.ugc.aweme.web.IAmeJsMessageHandlerService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.bullet.d */
public final class C23603d extends C10311a {

    /* renamed from: com.ss.android.ugc.aweme.bullet.d$a */
    public static final class C23604a implements C10580l {

        /* renamed from: com.ss.android.ugc.aweme.bullet.d$a$a */
        public static final class C23605a implements C10504h {
            C23605a() {
            }

            /* renamed from: b */
            public final List<C10498e<?>> mo25305b(C10579k kVar, C10403b bVar) {
                C7573i.m23587b(kVar, "instance");
                C7573i.m23587b(bVar, "providerFactory");
                return C7525m.m23461a();
            }

            /* renamed from: a */
            public final List<C10488b> mo25304a(C10579k kVar, C10403b bVar) {
                C7573i.m23587b(kVar, "instance");
                C7573i.m23587b(bVar, "providerFactory");
                return C7525m.m23466c(new RNCommonModule());
            }
        }

        C23604a() {
        }

        /* renamed from: a */
        public final C10383h mo25157a(C10403b bVar) {
            C7573i.m23587b(bVar, "providerFactory");
            return null;
        }

        /* renamed from: a */
        public final C10504h mo25361a() {
            return new C23605a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d$b */
    public static final class C23606b implements C10642i {

        /* renamed from: com.ss.android.ugc.aweme.bullet.d$b$a */
        public static final class C23607a extends C10314b {
            C23607a() {
            }

            /* renamed from: b */
            public final boolean mo25063b(C10641h hVar, String str) {
                C7573i.m23587b(hVar, "kitContainerApi");
                if (str != null && !C7634n.m23721b(str, WebKitApi.SCHEME_HTTP, false) && !C7634n.m23721b(str, "javascript", false) && !C7634n.m23721b(str, "about:blank", false)) {
                    return true;
                }
                throw new YieldError("An operation is not implemented");
            }
        }

        C23606b() {
        }

        /* renamed from: a */
        public final C10383h mo25157a(C10403b bVar) {
            C7573i.m23587b(bVar, "providerFactory");
            return null;
        }

        /* renamed from: a */
        public final C10647n mo25497a() {
            return new C23607a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d$c */
    public static final class C23608c extends C10313a {

        /* renamed from: a */
        final /* synthetic */ C10403b f62275a;

        /* renamed from: com.ss.android.ugc.aweme.bullet.d$c$a */
        public static final class C23609a implements C10630a {

            /* renamed from: a */
            final /* synthetic */ C20145l f62276a;

            /* renamed from: com.ss.android.ugc.aweme.bullet.d$c$a$a */
            static final class C23610a extends Lambda implements C7562b<String, Boolean> {

                /* renamed from: a */
                public static final C23610a f62277a = new C23610a();

                C23610a() {
                    super(1);
                }

                /* renamed from: a */
                private static boolean m77509a(String str) {
                    C7573i.m23587b(str, "it");
                    return C10873f.m31910d(str);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(m77509a((String) obj));
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.bullet.d$c$a$b */
            static final class C23611b extends Lambda implements C7562b<String, WebResourceResponse> {

                /* renamed from: a */
                public static final C23611b f62278a = new C23611b();

                C23611b() {
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return m77510a((String) obj);
                }

                /* renamed from: a */
                private static WebResourceResponse m77510a(String str) {
                    C7573i.m23587b(str, "it");
                    return C20142i.m66380a().mo53904a(str);
                }
            }

            /* renamed from: b */
            public final boolean mo25479b() {
                return C43447i.m137873d();
            }

            /* renamed from: c */
            public final C7562b<String, Boolean> mo25480c() {
                return C23610a.f62277a;
            }

            /* renamed from: d */
            public final C7562b<String, WebResourceResponse> mo25481d() {
                return C23611b.f62278a;
            }

            /* renamed from: a */
            public final String mo25478a() {
                String a = this.f62276a.mo53916a();
                C7573i.m23582a((Object) a, "offlineBundleConfig.offlineRootDir()");
                return a;
            }

            /* renamed from: e */
            public final List<Pattern> mo25482e() {
                List<Pattern> b = this.f62276a.mo53918b();
                C7573i.m23582a((Object) b, "offlineBundleConfig.offlineHostPrefix()");
                return b;
            }

            C23609a(C20145l lVar) {
                this.f62276a = lVar;
            }
        }

        /* renamed from: b */
        public final C10630a mo25054b() {
            AwemeAppData a = C19936f.m65765a();
            C7573i.m23582a((Object) a, "BaseAppData.inst()");
            C20145l g = a.mo53441g();
            if (g == null) {
                return null;
            }
            return new C23609a(g);
        }

        /* renamed from: a */
        public final C10626b mo25052a() {
            boolean z = false;
            List c = C7525m.m23466c("snssdk.com", "toutiao.com", "snssdk.com", "toutiao.com", "neihanshequ.com", "youdianyisi.com", "admin.bytedance.com", "wallet.amemv.com", "iesdouyin.com", "douyincdn.com", "douyinact.com", "douyin.com", "chengzijianzhan.com", "ad.toutiao.com", "s3.pstatp.com", "s0.ipstatp.com", "s.ipstatp.com", "m.toutiaocdn.cn", "m.toutiaocdn.com", "m.toutiaocdn.net", "m.zjurl.cn", "douyinvideo.net", "lb.jinritemai.com", "amemv.com", "juliangyinqing.com", "xgfe.snssdk.com", "ixigua.com", "activity.ixigua.com", "pstatp.com", "jinritemai.com", "s-b-l-f.com", "s-b-l-f.cn", "sb-lf.cn", "reflow.huoshan.com", "bytecdn.cn");
            IAmeJsMessageHandlerService iAmeJsMessageHandlerService = (IAmeJsMessageHandlerService) ServiceManager.get().getService(IAmeJsMessageHandlerService.class);
            if (iAmeJsMessageHandlerService != null) {
                List safeHosts = iAmeJsMessageHandlerService.getSafeHosts();
                if (safeHosts != null) {
                    if (!(!C6307b.m19566a((Collection<T>) safeHosts))) {
                        safeHosts = null;
                    }
                    if (safeHosts != null) {
                        c.addAll(safeHosts);
                    }
                }
            }
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl ab = a.mo60058ab();
            C7573i.m23582a((Object) ab, "CommonSharePrefCache.inst().jsBridgeWhiteList");
            List list = (List) ab.mo59877d();
            if (list != null) {
                if (list.size() > 0) {
                    z = true;
                }
                if (!z) {
                    list = null;
                }
                if (list != null) {
                    c.addAll(list);
                }
            }
            if (C7163a.m22363a()) {
                String str = C25915a.m85211a().f68562a;
                if (str != null) {
                    if (!(!TextUtils.isEmpty(str))) {
                        str = null;
                    }
                    if (str != null) {
                        c.add(str);
                    }
                }
            }
            C10626b bVar = new C10626b(null, null, c, 3, null);
            return bVar;
        }

        C23608c(C10403b bVar) {
            this.f62275a = bVar;
        }

        /* renamed from: a */
        public final void mo25053a(WebSettings webSettings, WebView webView) {
            C7573i.m23587b(webSettings, "settings");
            C7573i.m23587b(webView, "webView");
            super.mo25053a(webSettings, webView);
            C19996a.m65912a((Context) this.f62275a.mo25202b(Context.class)).mo53544a(true).mo53545a(webView);
            webSettings.setCacheMode(2);
        }
    }

    /* renamed from: a */
    public final C10644k mo25042a(C10403b bVar) {
        C7573i.m23587b(bVar, "providerFactory");
        return new C23608c(bVar);
    }

    /* renamed from: b */
    public final C10642i mo25043b(C10403b bVar) {
        C7573i.m23587b(bVar, "providerFactory");
        return new C23606b();
    }

    /* renamed from: d */
    public final C10580l mo25045d(C10403b bVar) {
        C7573i.m23587b(bVar, "providerFactory");
        return new C23604a();
    }

    /* renamed from: f */
    public final List<IBridge> mo25047f(C10403b bVar) {
        C7573i.m23587b(bVar, "providerFactory");
        List<IBridge> arrayList = new ArrayList<>();
        arrayList.addAll(m77489j(bVar));
        arrayList.addAll(m77488i(bVar));
        return arrayList;
    }

    /* renamed from: i */
    private static List<IBridge> m77488i(C10403b bVar) {
        return C7525m.m23464b((T[]) new BaseBridge[]{new CloseMethod(bVar), new UserInfoMethod(bVar), new SendLogMethod(bVar), new SendLogV3Method(bVar), new MonitorLogMethod(bVar), new OpenSchemaMethod(bVar), new ShowToastMethod(bVar), new OpenBrowserMethod(bVar), new AppInfoMethod(bVar), new GetAppInfoMethod(bVar), new ComponentDidMountMethod(bVar)});
    }

    /* renamed from: j */
    private static List<IBridge> m77489j(C10403b bVar) {
        return C7525m.m23464b((T[]) new BaseBridge[]{new FetchMethod(bVar), new GetNativeItemMethod(bVar), new SetNativeItemMethod(bVar), new GetSettingsMethod(bVar), new BroadcastMethod(bVar), new ShowDmtToastMethod(bVar), new OpenMethod(bVar), new OpenAwemeMethod(bVar), new OpenBrowserMethod(bVar), new UploadFileMethod(bVar)});
    }
}
