package com.bytedance.android.monitor.webview;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.C9531c.C9532a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.j */
public final class C9541j implements C9531c, C9534e {

    /* renamed from: a */
    private static C9531c f26105a = null;

    /* renamed from: b */
    private static C9534e f26106b = null;

    /* renamed from: c */
    private static String f26107c = "ttlive_web_view_tag";

    /* renamed from: d */
    private static String f26108d = "ttlive_web_view_last_url_tag";

    /* renamed from: e */
    private static String f26109e = "ttlive_web_view_auto_report_tag";

    /* renamed from: i */
    private static Map<String, String> f26110i = new HashMap();

    /* renamed from: k */
    private static C9532a f26111k;

    /* renamed from: f */
    private final String f26112f = "3.0";

    /* renamed from: g */
    private Map<String, C9532a> f26113g = new HashMap();

    /* renamed from: h */
    private Map<String, C9532a> f26114h = new HashMap();

    /* renamed from: j */
    private C9543a f26115j = new C9543a();

    /* renamed from: com.bytedance.android.monitor.webview.j$a */
    static class C9543a implements OnAttachStateChangeListener {
        private C9543a() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: b */
        public final void mo23649b(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
            }
        }

        /* renamed from: a */
        public final void mo23648a(WebView webView) {
            if (webView != null) {
                webView.removeOnAttachStateChangeListener(this);
                webView.addOnAttachStateChangeListener(this);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view instanceof WebView) {
                m28279c((WebView) view);
            }
        }

        /* renamed from: c */
        private static void m28279c(WebView webView) {
            if (C9541j.m28231c().mo23630f(webView)) {
                C9541j.m28227b().mo23594b(webView);
            }
        }
    }

    /* renamed from: b */
    public static C9531c m28227b() {
        return f26105a;
    }

    /* renamed from: c */
    static C9534e m28231c() {
        return f26106b;
    }

    /* renamed from: a */
    public final void mo23592a(C9532a aVar) {
        C9532a d = m28235d(aVar);
        String[] strArr = d.f26063d;
        if (!(strArr == null || strArr.length == 0)) {
            for (String put : strArr) {
                this.f26114h.put(put, d);
            }
        }
        String[] strArr2 = d.f26062c;
        if (strArr2 != null && strArr2.length != 0) {
            for (String put2 : strArr2) {
                this.f26113g.put(put2, d);
            }
        }
    }

    /* renamed from: a */
    public final void mo23591a(WebView webView, String str, boolean z) {
        m28233c(webView, m28239e(str), z);
    }

    /* renamed from: a */
    public final void mo23593a(String str) {
        if (this.f26114h != null) {
            this.f26114h.remove(str);
        }
    }

    /* renamed from: a */
    public final C9532a mo23584a() {
        return new C9532a();
    }

    static {
        C9541j jVar = new C9541j();
        f26105a = jVar;
        f26106b = jVar;
    }

    private C9541j() {
    }

    /* renamed from: a */
    public final void mo23585a(WebView webView) {
        m28246m(webView);
    }

    /* renamed from: b */
    private static Class<?> m28228b(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: n */
    private void m28247n(WebView webView) {
        m28225a(webView, false);
    }

    /* renamed from: c */
    public final void mo23598c(C9532a aVar) {
        f26111k = m28235d(aVar);
    }

    /* renamed from: k */
    private void m28244k(WebView webView) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23609a(webView);
            }
        }
    }

    /* renamed from: l */
    private void m28245l(WebView webView) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23614b(webView);
            }
        }
    }

    /* renamed from: o */
    private void m28248o(WebView webView) {
        if (this.f26115j != null && mo23630f(webView)) {
            this.f26115j.mo23648a(webView);
        }
    }

    /* renamed from: p */
    private void m28249p(WebView webView) {
        if (this.f26115j != null) {
            this.f26115j.mo23649b(webView);
        }
    }

    /* renamed from: g */
    public final C9529a mo23631g(WebView webView) {
        C9532a j = m28243j(webView);
        if (j == null) {
            return null;
        }
        return j.f26065f;
    }

    /* renamed from: h */
    public final C9530b mo23632h(WebView webView) {
        C9532a j = m28243j(webView);
        if (j == null) {
            return null;
        }
        return j.f26061b;
    }

    /* renamed from: i */
    public final boolean mo23633i(WebView webView) {
        C9532a j = m28243j(webView);
        if (j == null || !j.f26070k) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m28239e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    /* renamed from: d */
    public final String mo23599d(WebView webView) {
        if (webView == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(webView.hashCode());
        return sb.toString();
    }

    /* renamed from: f */
    public final boolean mo23630f(WebView webView) {
        C9532a j = m28243j(webView);
        if (j == null || !j.f26069j) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m28234c(String str) {
        return C9544k.m28288a(C9544k.m28290b(str), "webview_is_need_monitor");
    }

    /* renamed from: m */
    private void m28246m(WebView webView) {
        if (mo23629e(webView) && mo23630f(webView) && !f26109e.equals(m28236d(webView, f26109e))) {
            m28248o(webView);
            String str = f26109e;
            m28242g(webView, str, str);
        }
    }

    /* renamed from: d */
    private static String[] m28238d(String str) {
        String[] strArr = new String[0];
        if (TextUtils.isEmpty(str)) {
            return strArr;
        }
        JSONArray e = C9544k.m28293e(C9544k.m28290b(str), "webview_classes");
        if (e == null) {
            return strArr;
        }
        String[] strArr2 = new String[e.length()];
        for (int i = 0; i < e.length(); i++) {
            try {
                strArr2[i] = e.getString(i);
            } catch (JSONException unused) {
            }
        }
        return strArr2;
    }

    /* renamed from: j */
    private C9532a m28243j(WebView webView) {
        if (webView == null) {
            return f26111k;
        }
        C9532a aVar = (C9532a) this.f26114h.get(mo23599d(webView));
        if (aVar != null) {
            return aVar;
        }
        C9532a aVar2 = (C9532a) this.f26113g.get(webView.getClass().getName());
        if (aVar2 != null) {
            return aVar2;
        }
        String name = webView.getClass().getName();
        for (String str : this.f26113g.keySet()) {
            if (m28226a(name, str)) {
                C9532a aVar3 = (C9532a) this.f26113g.get(str);
                if (aVar3 != null) {
                    return aVar3;
                }
            }
        }
        return f26111k;
    }

    /* renamed from: q */
    private void m28250q(WebView webView) {
        String str;
        String str2;
        boolean z;
        try {
            if (VERSION.SDK_INT >= 19) {
                String url = webView.getUrl();
                String d = m28236d(webView, f26108d);
                if (!TextUtils.isEmpty(url) && !url.equals(d)) {
                    C9532a j = m28243j(webView);
                    if (j == null) {
                        str = C9536g.m28171b();
                    } else {
                        str = j.f26072m;
                    }
                    if (j == null) {
                        str2 = "";
                    } else {
                        str2 = j.f26073n;
                    }
                    if (j != null) {
                        if (!j.f26071l) {
                            z = false;
                            webView.evaluateJavascript(C9545l.m28295a(webView.getContext(), str2, str, z), null);
                            m28242g(webView, f26108d, url);
                            m28241f(webView, url, "loadUrl");
                        }
                    }
                    z = true;
                    webView.evaluateJavascript(C9545l.m28295a(webView.getContext(), str2, str, z), null);
                    m28242g(webView, f26108d, url);
                    m28241f(webView, url, "loadUrl");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo23594b(WebView webView) {
        m28245l(webView);
        m28240e(webView, f26108d);
        m28240e(webView, f26109e);
        m28240e(webView, f26107c);
        m28249p(webView);
    }

    /* renamed from: e */
    public final boolean mo23629e(WebView webView) {
        C9532a j = m28243j(webView);
        if (j == null) {
            return false;
        }
        return j.f26068i;
    }

    /* renamed from: d */
    private C9532a m28235d(C9532a aVar) {
        C9533d dVar;
        String str;
        String str2;
        String[] strArr;
        boolean z;
        String str3;
        C9532a aVar2 = new C9532a();
        aVar.mo23608d(aVar.f26074o);
        if (aVar.f26060a != null) {
            dVar = aVar.f26060a;
        } else {
            dVar = C9540i.m28211a();
        }
        aVar2.f26060a = dVar;
        if (aVar.f26064e != null) {
            str = aVar.f26064e;
        } else {
            str = "WebViewMonitor";
        }
        aVar2.f26064e = str;
        aVar2.f26065f = new C9546m(aVar.f26065f);
        aVar2.f26067h = aVar.f26067h;
        aVar2.f26075p.putAll(aVar.f26075p);
        aVar2.f26069j = aVar.f26069j;
        aVar2.f26070k = aVar.f26070k;
        aVar2.f26073n = aVar.f26073n;
        aVar2.f26068i = aVar.f26068i;
        aVar2.f26071l = aVar.f26071l;
        aVar2.f26063d = aVar.f26063d;
        aVar2.f26062c = aVar.f26062c;
        aVar2.f26061b = aVar.f26061b;
        aVar2.f26074o = aVar.f26074o;
        if (TextUtils.isEmpty(aVar.f26072m)) {
            str2 = C9536g.m28171b();
        } else {
            str2 = aVar.f26072m;
        }
        aVar2.f26072m = str2;
        if (C9544k.m28294f(C9544k.m28290b(aVar.f26066g), "webview_classes") == null) {
            strArr = aVar2.f26062c;
        } else {
            strArr = m28238d(aVar.f26066g);
        }
        aVar2.f26062c = strArr;
        if (C9544k.m28294f(C9544k.m28290b(aVar.f26066g), "webview_is_need_monitor") == null) {
            z = aVar2.f26068i;
        } else {
            z = m28234c(aVar.f26066g);
        }
        aVar2.f26068i = z;
        if (TextUtils.isEmpty(aVar.f26066g)) {
            str3 = aVar2.f26072m;
        } else {
            str3 = new C9536g(aVar.f26066g).mo23634a();
        }
        aVar2.f26072m = str3;
        return aVar2;
    }

    /* renamed from: c */
    public final void mo23597c(WebView webView) {
        m28241f(webView, webView.getUrl(), "loadUrl");
        m28244k(webView);
        m28247n(webView);
    }

    /* renamed from: b */
    public final void mo23596b(C9532a aVar) {
        mo23592a(aVar);
    }

    /* renamed from: a */
    public final void mo23586a(WebView webView, int i) {
        m28229b(webView, i);
    }

    /* renamed from: b */
    public final void mo23623b(WebView webView, String str) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23610a(webView, str);
            }
        }
    }

    /* renamed from: a */
    private boolean m28226a(String str, String str2) {
        Class b = m28228b(str);
        Class b2 = m28228b(str2);
        if (b == null || b2 == null) {
            return false;
        }
        return b2.isAssignableFrom(b);
    }

    /* renamed from: a */
    private void m28225a(WebView webView, boolean z) {
        if (VERSION.SDK_INT >= 19 && mo23629e(webView) && !f26107c.equals(m28236d(webView, f26107c))) {
            TTLiveWebViewMonitorJsBridge tTLiveWebViewMonitorJsBridge = new TTLiveWebViewMonitorJsBridge(webView);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            webView.addJavascriptInterface(tTLiveWebViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
            String str = f26107c;
            m28242g(webView, str, str);
        }
    }

    /* renamed from: b */
    private void m28229b(WebView webView, int i) {
        if (mo23629e(webView) && i >= 15 && webView != null && VERSION.SDK_INT >= 19) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            m28250q(webView);
        }
    }

    /* renamed from: d */
    private String m28236d(WebView webView, String str) {
        String d = mo23599d(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        String str2 = (String) f26110i.get(sb.toString());
        if (str2 == null) {
            return null;
        }
        return str2.replaceAll(d, "");
    }

    /* renamed from: e */
    private void m28240e(WebView webView, String str) {
        String d = mo23599d(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        f26110i.remove(sb.toString());
    }

    /* renamed from: a */
    public final void mo23587a(WebView webView, String str) {
        mo23597c(webView);
    }

    /* renamed from: c */
    public final String mo23625c(WebView webView, String str) {
        C9532a j = m28243j(webView);
        if (j == null) {
            return str;
        }
        return j.mo23604a(str);
    }

    /* renamed from: c */
    private void m28233c(WebView webView, String str, boolean z) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23613a(webView, str, z);
            }
        }
    }

    /* renamed from: d */
    private void m28237d(WebView webView, String str, boolean z) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23617b(webView, str, z);
            }
        }
    }

    /* renamed from: f */
    private void m28241f(WebView webView, String str, String str2) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23611a(webView, str, str2);
            }
        }
    }

    /* renamed from: e */
    public final void mo23628e(WebView webView, String str, String str2) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23621f(webView, str, str2);
            }
        }
    }

    /* renamed from: g */
    private void m28242g(WebView webView, String str, String str2) {
        String d = mo23599d(webView);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        f26110i.put(sb.toString(), str2);
    }

    /* renamed from: a */
    public final void mo23588a(WebView webView, String str, Bitmap bitmap) {
        mo23585a(webView);
    }

    /* renamed from: b */
    public final void mo23624b(WebView webView, String str, String str2) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23618c(webView, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo23622a(WebView webView, String str, String str2) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23615b(webView, str, str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo23595b(WebView webView, String str, boolean z) {
        m28237d(webView, m28239e(str), z);
    }

    /* renamed from: c */
    public final void mo23626c(WebView webView, String str, String str2) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23619d(webView, str, str2);
            }
        }
    }

    /* renamed from: d */
    public final void mo23627d(WebView webView, String str, String str2) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23620e(webView, str, str2);
            }
        }
    }

    /* renamed from: b */
    private void m28230b(WebView webView, String str, String str2, String str3, String str4) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23612a(webView, str, str2, str3, str4);
            }
        }
    }

    /* renamed from: c */
    private void m28232c(WebView webView, String str, String str2, String str3, String str4) {
        C9532a j = m28243j(webView);
        if (j != null) {
            C9533d dVar = j.f26060a;
            if (dVar != null) {
                dVar.mo23616b(webView, str, str2, str3, str4);
            }
        }
    }

    /* renamed from: a */
    public final void mo23589a(WebView webView, String str, String str2, String str3, String str4) {
        mo23590a(webView, null, null, str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo23590a(WebView webView, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str2)) {
            JSONObject b = C9544k.m28290b(str5);
            C9544k.m28285a(b, "event_name", (Object) str2);
            str5 = b.toString();
        }
        String str7 = str5;
        if ("0".equals(str6)) {
            m28232c(webView, str, str3, str4, str7);
            return;
        }
        if ("1".equals(str6)) {
            m28230b(webView, str, str3, str4, str7);
        }
    }
}
