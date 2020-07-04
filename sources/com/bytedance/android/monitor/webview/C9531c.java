package com.bytedance.android.monitor.webview;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import com.C1642a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.monitor.webview.c */
public interface C9531c {

    /* renamed from: com.bytedance.android.monitor.webview.c$a */
    public static class C9532a {

        /* renamed from: a */
        C9533d f26060a;

        /* renamed from: b */
        C9530b f26061b;

        /* renamed from: c */
        String[] f26062c;

        /* renamed from: d */
        String[] f26063d;

        /* renamed from: e */
        String f26064e;

        /* renamed from: f */
        C9529a f26065f;

        /* renamed from: g */
        String f26066g = "";

        /* renamed from: h */
        boolean f26067h;

        /* renamed from: i */
        boolean f26068i;

        /* renamed from: j */
        boolean f26069j;

        /* renamed from: k */
        boolean f26070k;

        /* renamed from: l */
        boolean f26071l = true;

        /* renamed from: m */
        String f26072m = "";

        /* renamed from: n */
        String f26073n = "";

        /* renamed from: o */
        String f26074o = "";

        /* renamed from: p */
        Map<String, String> f26075p = m28121f("");

        C9532a() {
        }

        /* renamed from: a */
        public final C9532a mo23600a(C9529a aVar) {
            this.f26065f = aVar;
            return this;
        }

        /* renamed from: b */
        public final C9532a mo23605b(String str) {
            this.f26064e = str;
            return this;
        }

        /* renamed from: c */
        public final C9532a mo23607c(String str) {
            this.f26066g = str;
            return this;
        }

        /* renamed from: a */
        public final C9532a mo23601a(C9533d dVar) {
            this.f26060a = dVar;
            return this;
        }

        /* renamed from: b */
        public final C9532a mo23606b(boolean z) {
            this.f26070k = true;
            return this;
        }

        /* renamed from: e */
        private void m28120e(String str) {
            this.f26075p.clear();
            this.f26075p.putAll(m28121f(str));
        }

        /* renamed from: a */
        public final C9532a mo23603a(String... strArr) {
            this.f26063d = strArr;
            return this;
        }

        /* renamed from: d */
        public final C9532a mo23608d(String str) {
            this.f26074o = str;
            if (this.f26067h) {
                this.f26074o = "live";
            }
            m28120e(this.f26074o);
            return this;
        }

        /* renamed from: a */
        public final C9532a mo23602a(boolean z) {
            this.f26067h = true;
            if (this.f26067h) {
                this.f26074o = "live";
            }
            m28120e(this.f26074o);
            return this;
        }

        /* renamed from: a */
        public final String mo23604a(String str) {
            String str2 = (String) this.f26075p.get(str);
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            return str2;
        }

        /* renamed from: f */
        private static Map<String, String> m28121f(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("pv", C1642a.m8034a("tt%s_webview_timing_monitor_pv_service", new Object[]{str}));
            hashMap.put("overview", C1642a.m8034a("tt%s_webview_timing_monitor_overview_service", new Object[]{str}));
            hashMap.put("performance", C1642a.m8034a("tt%s_webview_timing_monitor_performance_service", new Object[]{str}));
            hashMap.put("resource", C1642a.m8034a("tt%s_webview_timing_monitor_resource_service", new Object[]{str}));
            hashMap.put("error", C1642a.m8034a("tt%s_webview_timing_monitor_error_service", new Object[]{str}));
            hashMap.put("diff", C1642a.m8034a("tt%s_webview_timing_monitor_diff_service", new Object[]{str}));
            hashMap.put("custom", C1642a.m8034a("tt%s_webview_timing_monitor_custom_service", new Object[]{str}));
            return hashMap;
        }
    }

    /* renamed from: a */
    C9532a mo23584a();

    /* renamed from: a */
    void mo23585a(WebView webView);

    /* renamed from: a */
    void mo23586a(WebView webView, int i);

    /* renamed from: a */
    void mo23587a(WebView webView, String str);

    /* renamed from: a */
    void mo23588a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: a */
    void mo23589a(WebView webView, String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo23590a(WebView webView, String str, String str2, String str3, String str4, String str5, String str6);

    /* renamed from: a */
    void mo23591a(WebView webView, String str, boolean z);

    /* renamed from: a */
    void mo23592a(C9532a aVar);

    /* renamed from: a */
    void mo23593a(String str);

    /* renamed from: b */
    void mo23594b(WebView webView);

    /* renamed from: b */
    void mo23595b(WebView webView, String str, boolean z);

    /* renamed from: b */
    void mo23596b(C9532a aVar);

    /* renamed from: c */
    void mo23597c(WebView webView);

    /* renamed from: c */
    void mo23598c(C9532a aVar);

    /* renamed from: d */
    String mo23599d(WebView webView);
}
