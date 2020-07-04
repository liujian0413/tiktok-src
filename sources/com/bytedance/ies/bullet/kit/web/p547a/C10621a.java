package com.bytedance.ies.bullet.kit.web.p547a;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.web.jsbridge2.C11167k;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.jsbridge2.C11176q;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.google.gson.C6600e;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.web.a.a */
public final class C10621a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f28460a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C10621a.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: c */
    public static final C10622a f28461c = new C10622a(null);

    /* renamed from: b */
    public C11087a f28462b;

    /* renamed from: d */
    private WebViewClient f28463d;

    /* renamed from: e */
    private WebChromeClient f28464e;

    /* renamed from: f */
    private List<String> f28465f = new ArrayList();

    /* renamed from: g */
    private List<String> f28466g = new ArrayList();

    /* renamed from: h */
    private List<String> f28467h = new ArrayList();

    /* renamed from: i */
    private C11176q f28468i;

    /* renamed from: j */
    private C11174p f28469j;

    /* renamed from: k */
    private final C7541d f28470k = C7546e.m23569a(C10623b.f28472a);

    /* renamed from: l */
    private final WebView f28471l;

    /* renamed from: com.bytedance.ies.bullet.kit.web.a.a$a */
    public static final class C10622a {
        private C10622a() {
        }

        public /* synthetic */ C10622a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C10621a m31066a(WebView webView) {
            C7573i.m23587b(webView, "webView");
            return new C10621a(webView);
        }

        /* renamed from: a */
        public static void m31067a(WebView webView, String str) {
            C7573i.m23587b(webView, "webView");
            if (str != null) {
                StringBuilder sb = new StringBuilder("\n                    javascript:(function () {\n                         window.reactId = '");
                sb.append(str);
                sb.append("'\n                    })();\n                ");
                C10625b.m31071a(webView, C7634n.m23692a(sb.toString()));
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a.a$b */
    static final class C10623b extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C10623b f28472a = new C10623b();

        C10623b() {
            super(0);
        }

        /* renamed from: a */
        private static C6600e m31068a() {
            return new C6600e();
        }

        public final /* synthetic */ Object invoke() {
            return m31068a();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a.a$c */
    public static final class C10624c implements C11167k {

        /* renamed from: a */
        final /* synthetic */ C10621a f28473a;

        C10624c(C10621a aVar) {
            this.f28473a = aVar;
        }

        /* renamed from: a */
        public final <T> String mo11660a(T t) {
            String b = this.f28473a.mo25469a().mo15979b((Object) t);
            C7573i.m23582a((Object) b, "gson.toJson(value)");
            return b;
        }

        /* renamed from: a */
        public final <T> T mo11659a(String str, Type type) {
            C7573i.m23587b(str, "data");
            C7573i.m23587b(type, "type");
            return this.f28473a.mo25469a().mo15975a(str, type);
        }
    }

    /* renamed from: a */
    public final C6600e mo25469a() {
        return (C6600e) this.f28470k.getValue();
    }

    /* renamed from: c */
    public final void mo25475c() {
        C11087a aVar = this.f28462b;
        if (aVar != null) {
            aVar.mo27028a();
        }
        C11174p pVar = this.f28469j;
        if (pVar != null) {
            pVar.mo27205a();
        }
    }

    /* renamed from: b */
    public final C10621a mo25471b() {
        this.f28469j = C11174p.m32711a(this.f28471l).mo27188a(true).mo27186a("ToutiaoJSBridge").mo27184a((C11167k) new C10624c(this)).mo27187a((Collection<String>) this.f28465f).mo27190b(false).mo27191c(true).mo27189a();
        this.f28468i = C11176q.m32722a(this.f28471l, this.f28469j);
        C11176q qVar = this.f28468i;
        if (qVar == null) {
            C7573i.m23580a();
        }
        this.f28462b = qVar.f30326a;
        C11087a aVar = this.f28462b;
        if (aVar == null) {
            C7573i.m23580a();
        }
        C11087a b = aVar.mo27025a("bytedance").mo27022a(this.f28464e).mo27023a(this.f28463d).mo27027a(this.f28465f).mo27033b(this.f28466g);
        C7573i.m23582a((Object) b, "iesJsBridge!!.setBridgeS…setPublicFunc(publicFunc)");
        b.mo27036c(this.f28467h);
        return this;
    }

    /* renamed from: a */
    public final C10621a mo25465a(WebChromeClient webChromeClient) {
        this.f28464e = webChromeClient;
        return this;
    }

    /* renamed from: a */
    public final C10621a mo25466a(WebViewClient webViewClient) {
        this.f28463d = webViewClient;
        return this;
    }

    /* renamed from: a */
    public final C10621a mo25468a(List<String> list) {
        C7573i.m23587b(list, "safeHost");
        this.f28465f.addAll(list);
        return this;
    }

    /* renamed from: b */
    public final C10621a mo25472b(List<String> list) {
        C7573i.m23587b(list, "publicFunc");
        this.f28466g.addAll(list);
        return this;
    }

    /* renamed from: c */
    public final C10621a mo25474c(List<String> list) {
        C7573i.m23587b(list, "protectedFunc");
        this.f28467h.addAll(list);
        return this;
    }

    public C10621a(WebView webView) {
        C7573i.m23587b(webView, "webView");
        this.f28471l = webView;
    }

    /* renamed from: a */
    public final C10621a mo25467a(String str, C11093e eVar) {
        if (this.f28468i != null) {
            C11176q qVar = this.f28468i;
            if (qVar == null) {
                C7573i.m23580a();
            }
            qVar.mo27210a(str, eVar);
        } else {
            C11087a aVar = this.f28462b;
            if (aVar != null) {
                aVar.mo27026a(str, eVar);
            }
        }
        return this;
    }

    /* renamed from: b */
    public final void mo25473b(String str, JSONObject jSONObject) {
        C11087a aVar = this.f28462b;
        if (aVar != null) {
            aVar.mo27030a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo25470a(String str, JSONObject jSONObject) {
        C11087a aVar = this.f28462b;
        if (aVar != null) {
            aVar.mo27034b(str, jSONObject);
        }
    }
}
