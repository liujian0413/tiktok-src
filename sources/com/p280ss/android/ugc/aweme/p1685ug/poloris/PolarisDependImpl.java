package com.p280ss.android.ugc.aweme.p1685ug.poloris;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.p555c.C10713b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.polaris.depend.C12420a;
import com.bytedance.polaris.depend.C12422c;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12427h;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.CompressType;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.downloadlib.p868c.C19519e;
import com.p280ss.android.downloadlib.p868c.C19519e.C19520a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.newmedia.p897ui.webview.C20005g;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.sdk.webview.C20140h;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.C21658ar;
import com.p280ss.android.ugc.aweme.C21758j;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.net.corenet.C34064i;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.NotImplementedError;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl */
public final class PolarisDependImpl implements C12422c, C12424e {

    /* renamed from: a */
    public static final C7541d f111002a = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C42713b.f111007a);

    /* renamed from: b */
    public static final C42712a f111003b = new C42712a(null);

    /* renamed from: c */
    private C20140h f111004c;

    /* renamed from: d */
    private PolarisDependApi f111005d;

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$PolarisDependApi */
    public interface PolarisDependApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);

        @C6456g
        @C6468s
        C18253l<String> doPost(@C6463n Integer num, @C6450ac String str, @C6455f Map<String, String> map);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$a */
    public static final class C42712a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f111006a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42712a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/ug/poloris/PolarisDependImpl;"))};

        private C42712a() {
        }

        /* renamed from: a */
        public static PolarisDependImpl m135605a() {
            return (PolarisDependImpl) PolarisDependImpl.f111002a.getValue();
        }

        public /* synthetic */ C42712a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$b */
    static final class C42713b extends Lambda implements C7561a<PolarisDependImpl> {

        /* renamed from: a */
        public static final C42713b f111007a = new C42713b();

        C42713b() {
            super(0);
        }

        /* renamed from: a */
        private static PolarisDependImpl m135606a() {
            return new PolarisDependImpl(null);
        }

        public final /* synthetic */ Object invoke() {
            return m135606a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$c */
    static final class C42714c implements C10713b {

        /* renamed from: a */
        public static final C42714c f111008a = new C42714c();

        C42714c() {
        }

        /* renamed from: a */
        public final boolean mo25528a(String str) {
            return C10873f.m31910d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.poloris.PolarisDependImpl$d */
    public static final class C42715d implements C19520a {

        /* renamed from: a */
        final /* synthetic */ C12427h f111009a;

        /* renamed from: a */
        public final void mo51485a() {
            C12427h hVar = this.f111009a;
            if (hVar != null) {
                hVar.mo30331a();
            }
        }

        C42715d(C12427h hVar) {
            this.f111009a = hVar;
        }

        /* renamed from: a */
        public final void mo51486a(String str) {
            C12427h hVar = this.f111009a;
            if (hVar != null) {
                hVar.mo30332a(str);
            }
        }
    }

    /* renamed from: a */
    public final String mo30312a() {
        return "14.7.4";
    }

    /* renamed from: b */
    public final String mo30311b(Context context, String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public final boolean mo30310a(Context context, String str) {
        return C22912d.f60645e.mo59887a(context, str, context != null ? context.getPackageName() : null);
    }

    /* renamed from: a */
    public final void mo30309a(WebView webView) {
        C20005g.f54137a.mo53551a(webView);
    }

    /* renamed from: a */
    public final void mo30308a(Context context, int i) {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7195s a2 = C7195s.m22438a();
            C7573i.m23582a((Object) a, "it");
            FeedbackConf feedbackConf = a.getFeedbackConf();
            a2.mo18682a(feedbackConf != null ? feedbackConf.getNormalEntry() : null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo30319a(String str, JSONObject jSONObject) {
        C6907h.m21525a(str, jSONObject);
    }

    /* renamed from: a */
    public final boolean mo30322a(String str, int i, String str2, String str3) {
        return C42716a.m135610a(str, i, str2, str3);
    }

    /* renamed from: a */
    public final void mo30321a(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new NotImplementedError(sb.toString());
    }

    /* renamed from: a */
    public final void mo30320a(Map<String, String> map, boolean z) {
        NetUtil.putCommonParams(map, z);
    }

    /* renamed from: e */
    public final String mo30326e() {
        String str = Api.f60502b;
        C7573i.m23582a((Object) str, "Api.API_URL_PREFIX_SI");
        return str;
    }

    /* renamed from: b */
    public final boolean mo30323b() {
        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
        return C42811c.m135867c();
    }

    /* renamed from: c */
    public final String mo30324c() {
        String d = C6789d.m21080d();
        C7573i.m23582a((Object) d, "DeviceRegisterManager.getDeviceId()");
        return d;
    }

    /* renamed from: d */
    public final boolean mo30325d() {
        Activity activity;
        WeakReference a = C21758j.m72769a();
        if (a != null) {
            activity = (Activity) a.get();
        } else {
            activity = null;
        }
        return activity instanceof MainActivity;
    }

    private PolarisDependImpl() {
        this.f111005d = (PolarisDependApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(PolarisDependApi.class);
    }

    /* renamed from: f */
    public final void mo104322f() {
        if (this.f111004c == null) {
            PolarisDependImpl polarisDependImpl = this;
            AwemeAppData a = C19936f.m65765a();
            C7573i.m23582a((Object) a, "BaseAppData.inst()");
            C20145l g = a.mo53441g();
            if (g != null) {
                polarisDependImpl.f111004c = new C20140h(g.mo53916a()).mo53900a((C10713b) C42714c.f111008a).mo53903a(C43447i.m137873d()).mo53902a(g.mo53918b());
            }
        }
    }

    public /* synthetic */ PolarisDependImpl(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final int mo30305a(Context context, Exception exc) {
        return C34064i.m109693a(context, (Throwable) exc);
    }

    /* renamed from: a */
    public final String mo30313a(int i, String str) {
        String executeGet = NetworkUtils.executeGet(20480, str);
        C7573i.m23582a((Object) executeGet, "NetworkUtils.executeGet(maxLength, url)");
        return executeGet;
    }

    /* renamed from: a */
    public final WebResourceResponse mo30307a(WebView webView, String str) {
        WebResourceResponse webResourceResponse;
        if (this.f111004c != null) {
            C20140h hVar = this.f111004c;
            if (hVar != null) {
                webResourceResponse = hVar.mo53899a(webView, str);
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final WebResourceResponse mo30306a(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        String str;
        if (this.f111004c != null) {
            C20140h hVar = this.f111004c;
            if (hVar != null) {
                if (webResourceRequest != null) {
                    Uri url = webResourceRequest.getUrl();
                    if (url != null) {
                        str = url.toString();
                        webResourceResponse = hVar.mo53899a(webView, str);
                    }
                }
                str = null;
                webResourceResponse = hVar.mo53899a(webView, str);
            } else {
                webResourceResponse = null;
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo30314a(int i, String str, List<Pair<String, String>> list) {
        Iterable<Pair> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (Pair pair : iterable) {
            arrayList.add(new C19565e((String) pair.first, (String) pair.second));
        }
        String executePost = NetworkUtils.executePost(20480, str, (List) arrayList);
        C7573i.m23582a((Object) executePost, "NetworkUtils.executePost(maxLength, url, params)");
        return executePost;
    }

    /* renamed from: a */
    public final void mo30316a(Activity activity, String str, Drawable drawable) {
        C10761a.m31403c((Context) activity, str).mo25750a();
    }

    /* renamed from: a */
    public final void mo30318a(Activity activity, String[] strArr, C12427h hVar) {
        C19519e.m64290a(strArr, (C19520a) new C42715d(hVar));
    }

    /* renamed from: a */
    public final String mo30315a(int i, String str, byte[] bArr, String str2) {
        String executePost = NetworkUtils.executePost(20480, str, bArr, CompressType.GZIP, str2);
        C7573i.m23582a((Object) executePost, "NetworkUtils.executePost…pe.GZIP, contentTypeJson)");
        return executePost;
    }

    /* renamed from: a */
    public final void mo30317a(Activity activity, String str, String str2, String str3, JSONObject jSONObject, C12420a aVar) {
        C21658ar b = C6861a.m21333b();
        C21080d dVar = new C21080d();
        if (activity == null) {
            C7573i.m23580a();
        }
        b.showLoginAndRegisterView(dVar.mo56860a(activity).mo56864a(str3).mo56866b("polaris").mo56859a());
    }
}
