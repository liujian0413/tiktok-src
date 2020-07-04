package com.p280ss.android.sdk.webview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import bolts.C1592h;
import com.bytedance.ies.web.jsbridge2.C11166j;
import com.bytedance.ies.web.jsbridge2.C11167k;
import com.bytedance.ies.web.jsbridge2.C11169m;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.jsbridge2.C11176q;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11095g;
import com.google.gson.C6600e;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.DMTJsBridge */
public final class DMTJsBridge {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f54453a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DMTJsBridge.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: f */
    public static final C20116a f54454f = new C20116a(null);

    /* renamed from: b */
    public C11087a f54455b;

    /* renamed from: c */
    public C11174p f54456c;

    /* renamed from: d */
    public boolean f54457d;

    /* renamed from: e */
    public final WebView f54458e;

    /* renamed from: g */
    private WebViewClient f54459g;

    /* renamed from: h */
    private WebChromeClient f54460h;

    /* renamed from: i */
    private C20123a f54461i;

    /* renamed from: j */
    private boolean f54462j;

    /* renamed from: k */
    private C11176q f54463k;

    /* renamed from: l */
    private final C7541d f54464l = C7546e.m23569a(C20117b.f54465a);

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$BridgeAccess */
    public enum BridgeAccess {
        PUBLIC,
        PRIVATE
    }

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$a */
    public static final class C20116a {
        private C20116a() {
        }

        public /* synthetic */ C20116a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static DMTJsBridge m66326a(WebView webView) {
            C7573i.m23587b(webView, "webView");
            return new DMTJsBridge(webView);
        }

        /* renamed from: a */
        public static void m66327a(WebView webView, String str) {
            C7573i.m23587b(webView, "webView");
            if (str != null) {
                StringBuilder sb = new StringBuilder("javascript:(function () {    window.reactId = '");
                sb.append(str);
                sb.append("';})();");
                C20137e.m66371a(webView, sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$b */
    static final class C20117b extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C20117b f54465a = new C20117b();

        C20117b() {
            super(0);
        }

        /* renamed from: a */
        private static C6600e m66328a() {
            return new C6600e();
        }

        public final /* synthetic */ Object invoke() {
            return m66328a();
        }
    }

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$c */
    static final class C20118c extends Lambda implements C7563m<String, BridgeAccess, C7581n> {

        /* renamed from: a */
        public static final C20118c f54466a = new C20118c();

        C20118c() {
            super(2);
        }

        /* renamed from: a */
        private static void m66329a(String str, BridgeAccess bridgeAccess) {
            C7573i.m23587b(str, "<anonymous parameter 0>");
            C7573i.m23587b(bridgeAccess, "<anonymous parameter 1>");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m66329a((String) obj, (BridgeAccess) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$d */
    static final class C20119d extends Lambda implements C48006q<String, BridgeAccess, Integer, C7581n> {

        /* renamed from: a */
        public static final C20119d f54467a = new C20119d();

        C20119d() {
            super(3);
        }

        /* renamed from: a */
        private static void m66330a(String str, BridgeAccess bridgeAccess, int i) {
            C7573i.m23587b(str, "<anonymous parameter 0>");
            C7573i.m23587b(bridgeAccess, "<anonymous parameter 1>");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m66330a((String) obj, (BridgeAccess) obj2, ((Number) obj3).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$e */
    public static final class C20120e implements C11167k {

        /* renamed from: a */
        final /* synthetic */ DMTJsBridge f54468a;

        C20120e(DMTJsBridge dMTJsBridge) {
            this.f54468a = dMTJsBridge;
        }

        /* renamed from: a */
        public final <T> String mo11660a(T t) {
            String b = this.f54468a.mo53851a().mo15979b((Object) t);
            C7573i.m23582a((Object) b, "gson.toJson(value)");
            return b;
        }

        /* renamed from: a */
        public final <T> T mo11659a(String str, Type type) {
            C7573i.m23587b(str, "data");
            C7573i.m23587b(type, "type");
            return this.f54468a.mo53851a().mo15975a(str, type);
        }
    }

    /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$f */
    public static final class C20121f implements C11169m {

        /* renamed from: a */
        final /* synthetic */ DMTJsBridge f54469a;

        /* renamed from: b */
        final /* synthetic */ C7563m f54470b;

        /* renamed from: c */
        final /* synthetic */ List f54471c;

        /* renamed from: d */
        final /* synthetic */ C48006q f54472d;

        /* renamed from: com.ss.android.sdk.webview.DMTJsBridge$f$a */
        static final class C20122a<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C20121f f54473a;

            /* renamed from: b */
            final /* synthetic */ String f54474b;

            /* renamed from: c */
            final /* synthetic */ String f54475c;

            /* renamed from: d */
            final /* synthetic */ int f54476d;

            C20122a(C20121f fVar, String str, String str2, int i) {
                this.f54473a = fVar;
                this.f54474b = str;
                this.f54475c = str2;
                this.f54476d = i;
            }

            public final /* synthetic */ Object call() {
                m66335a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m66335a() {
                Context context = this.f54473a.f54469a.f54458e.getContext();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f54474b);
                sb.append(" failed to visit func: ");
                sb.append(this.f54475c);
                sb.append(", reason: ");
                sb.append(this.f54476d);
                sb.append(";\n                                                可以进入DebugSettings->JSB 测试设置添加安全域名进行调试\n                                            ");
                C20138f.m66372a(Toast.makeText(context, C7634n.m23693a(sb.toString(), "|"), 1));
            }
        }

        /* renamed from: a */
        public final void mo27192a(String str, String str2) {
            BridgeAccess bridgeAccess;
            if (str2 != null) {
                C7563m mVar = this.f54470b;
                if (this.f54471c.contains(str2)) {
                    bridgeAccess = BridgeAccess.PUBLIC;
                } else {
                    bridgeAccess = BridgeAccess.PRIVATE;
                }
                mVar.invoke(str2, bridgeAccess);
            }
        }

        /* renamed from: a */
        public final void mo27193a(String str, String str2, int i) {
            BridgeAccess bridgeAccess;
            if (str2 != null) {
                C48006q qVar = this.f54472d;
                if (this.f54471c.contains(str2)) {
                    bridgeAccess = BridgeAccess.PUBLIC;
                } else {
                    bridgeAccess = BridgeAccess.PRIVATE;
                }
                qVar.invoke(str2, bridgeAccess, Integer.valueOf(i));
            }
            if (this.f54469a.f54457d) {
                C1592h.m7855a((Callable<TResult>) new C20122a<TResult>(this, str, str2, i), C1592h.f5958b);
            }
        }

        C20121f(DMTJsBridge dMTJsBridge, C7563m mVar, List list, C48006q qVar) {
            this.f54469a = dMTJsBridge;
            this.f54470b = mVar;
            this.f54471c = list;
            this.f54472d = qVar;
        }
    }

    /* renamed from: a */
    public final C6600e mo53851a() {
        return (C6600e) this.f54464l.getValue();
    }

    /* renamed from: a */
    public final boolean mo53859a(String str) {
        if (this.f54455b == null) {
            return false;
        }
        C11087a aVar = this.f54455b;
        if (aVar == null) {
            C7573i.m23580a();
        }
        return aVar.mo27039e(str);
    }

    /* renamed from: b */
    public final void mo53861b() {
        C11087a aVar = this.f54455b;
        if (aVar != null) {
            aVar.mo27028a();
        }
        C11174p pVar = this.f54456c;
        if (pVar != null) {
            pVar.mo27205a();
        }
    }

    /* renamed from: a */
    public final DMTJsBridge mo53856a(boolean z) {
        this.f54462j = z;
        return this;
    }

    /* renamed from: b */
    public final DMTJsBridge mo53860b(boolean z) {
        this.f54457d = z;
        return this;
    }

    /* renamed from: a */
    public final DMTJsBridge mo53852a(WebChromeClient webChromeClient) {
        C7573i.m23587b(webChromeClient, "webChromeClient");
        this.f54460h = webChromeClient;
        return this;
    }

    public DMTJsBridge(WebView webView) {
        C7573i.m23587b(webView, "webView");
        this.f54458e = webView;
    }

    /* renamed from: a */
    public final DMTJsBridge mo53853a(WebViewClient webViewClient) {
        C7573i.m23587b(webViewClient, "webViewClient");
        this.f54459g = webViewClient;
        return this;
    }

    /* renamed from: a */
    public final DMTJsBridge mo53854a(C20123a aVar) {
        C7573i.m23587b(aVar, "jsMessageHandler");
        this.f54461i = aVar;
        return this;
    }

    /* renamed from: b */
    public final void mo53862b(String str, JSONObject jSONObject) {
        C11087a aVar = this.f54455b;
        if (aVar != null) {
            aVar.mo27030a(str, jSONObject);
        }
    }

    /* renamed from: a */
    private DMTJsBridge m66313a(C7563m<? super String, ? super BridgeAccess, C7581n> mVar, C48006q<? super String, ? super BridgeAccess, ? super Integer, C7581n> qVar) {
        C7573i.m23587b(mVar, "invokeHandler");
        C7573i.m23587b(qVar, "rejectHandler");
        C20123a aVar = this.f54461i;
        if (aVar == null) {
            C7573i.m23580a();
        }
        List b = aVar.mo53872b();
        C7573i.m23582a((Object) b, "jsMessageHandler!!.addPublicFunc()");
        if (this.f54462j) {
            C11174p.m32715b(b);
            C11166j a = C11174p.m32711a(this.f54458e).mo27188a(true).mo27186a("ToutiaoJSBridge").mo27184a((C11167k) new C20120e(this));
            C20123a aVar2 = this.f54461i;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            this.f54456c = a.mo27187a((Collection<String>) aVar2.mo53875c()).mo27190b(false).mo27191c(true).mo27185a((C11169m) new C20121f(this, mVar, b, qVar)).mo27189a();
            this.f54463k = C11176q.m32722a(this.f54458e, this.f54456c);
            C11176q qVar2 = this.f54463k;
            if (qVar2 == null) {
                C7573i.m23580a();
            }
            this.f54455b = qVar2.f30326a;
        } else {
            this.f54455b = C11087a.m32475a(this.f54458e);
        }
        C11087a aVar3 = this.f54455b;
        if (aVar3 == null) {
            C7573i.m23580a();
        }
        if (this.f54461i == null) {
            C7573i.m23580a();
        }
        C11087a a2 = aVar3.mo27025a(C20123a.m66336a()).mo27022a(this.f54460h).mo27023a(this.f54459g);
        C20123a aVar4 = this.f54461i;
        if (aVar4 == null) {
            C7573i.m23580a();
        }
        C11087a a3 = a2.mo27024a((C11095g) aVar4);
        C20123a aVar5 = this.f54461i;
        if (aVar5 == null) {
            C7573i.m23580a();
        }
        C11087a a4 = a3.mo27027a(aVar5.mo53875c());
        C7573i.m23582a((Object) a4, "iesJsBridge!!.setBridgeS…essageHandler!!.safeHost)");
        a4.mo27033b(b);
        return this;
    }

    /* renamed from: a */
    public final DMTJsBridge mo53855a(String str, C11093e eVar) {
        if (this.f54463k != null) {
            C11176q qVar = this.f54463k;
            if (qVar == null) {
                C7573i.m23580a();
            }
            qVar.mo27210a(str, eVar);
        } else {
            C11087a aVar = this.f54455b;
            if (aVar != null) {
                aVar.mo27026a(str, eVar);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo53857a(String str, JSONObject jSONObject) {
        C11087a aVar = this.f54455b;
        if (aVar != null) {
            aVar.mo27034b(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo53858a(String str, String... strArr) {
        C7573i.m23587b(str, "method");
        C7573i.m23587b(strArr, "params");
        C11087a aVar = this.f54455b;
        if (aVar != null) {
            aVar.mo27031a(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ DMTJsBridge m66312a(DMTJsBridge dMTJsBridge, C7563m mVar, C48006q qVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mVar = C20118c.f54466a;
        }
        if ((i & 2) != 0) {
            qVar = C20119d.f54467a;
        }
        return dMTJsBridge.m66313a(mVar, qVar);
    }
}
