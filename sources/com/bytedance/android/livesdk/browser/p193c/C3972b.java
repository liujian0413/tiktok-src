package com.bytedance.android.livesdk.browser.p193c;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.DialogFragment;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.browser.C3142b;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.jsbridge.C4030a;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.b */
public interface C3972b {

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$a */
    public static class C3974a {

        /* renamed from: a */
        public String f11826a;

        /* renamed from: b */
        public String f11827b;

        /* renamed from: c */
        public boolean f11828c;

        /* renamed from: d */
        public boolean f11829d;

        /* renamed from: e */
        public boolean f11830e;

        /* renamed from: f */
        public String f11831f;

        /* renamed from: g */
        public String f11832g;

        /* renamed from: a */
        public final C3974a mo11550a(String str) {
            this.f11827b = str;
            return this;
        }

        /* renamed from: b */
        public final C3974a mo11552b(String str) {
            this.f11831f = str;
            return this;
        }

        /* renamed from: c */
        public final C3974a mo11554c(String str) {
            this.f11832g = str;
            return this;
        }

        private C3974a(String str) {
            this.f11826a = str;
        }

        /* renamed from: a */
        public final C3974a mo11551a(boolean z) {
            this.f11828c = z;
            return this;
        }

        /* renamed from: b */
        public final C3974a mo11553b(boolean z) {
            this.f11829d = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$b */
    public static class C3975b {

        /* renamed from: a */
        public String f11833a;

        /* renamed from: b */
        public int f11834b;

        /* renamed from: c */
        public int f11835c;

        /* renamed from: d */
        public int f11836d;

        /* renamed from: e */
        public int f11837e;

        /* renamed from: f */
        public int f11838f;

        /* renamed from: g */
        public int f11839g;

        /* renamed from: h */
        public int f11840h;

        /* renamed from: i */
        public int f11841i;

        /* renamed from: j */
        public int f11842j;

        /* renamed from: k */
        public int f11843k;

        /* renamed from: l */
        public String f11844l;

        /* renamed from: m */
        public boolean f11845m;

        /* renamed from: n */
        public boolean f11846n;

        /* renamed from: o */
        public boolean f11847o;

        /* renamed from: p */
        public boolean f11848p;

        /* renamed from: q */
        public boolean f11849q;

        /* renamed from: r */
        public C3142b f11850r;

        /* renamed from: s */
        public String f11851s;

        /* renamed from: t */
        public boolean f11852t;

        /* renamed from: a */
        public final C3975b mo11555a(int i) {
            this.f11834b = i;
            return this;
        }

        /* renamed from: b */
        public final C3975b mo11560b(int i) {
            this.f11835c = i;
            return this;
        }

        /* renamed from: c */
        public final C3975b mo11562c(int i) {
            this.f11836d = i;
            return this;
        }

        /* renamed from: d */
        public final C3975b mo11565d(boolean z) {
            this.f11849q = z;
            return this;
        }

        /* renamed from: e */
        public final C3975b mo11566e(int i) {
            this.f11842j = i;
            return this;
        }

        /* renamed from: f */
        public final C3975b mo11568f(int i) {
            this.f11843k = i;
            return this;
        }

        /* renamed from: a */
        public final C3975b mo11557a(C3142b bVar) {
            this.f11850r = bVar;
            return this;
        }

        /* renamed from: b */
        public final C3975b mo11561b(boolean z) {
            this.f11847o = z;
            return this;
        }

        /* renamed from: c */
        public final C3975b mo11563c(boolean z) {
            this.f11848p = true;
            return this;
        }

        /* renamed from: e */
        public final C3975b mo11567e(boolean z) {
            this.f11852t = z;
            return this;
        }

        /* renamed from: d */
        public final C3975b mo11564d(int i) {
            this.f11845m = false;
            this.f11837e = i;
            this.f11838f = 0;
            this.f11839g = 0;
            this.f11840h = 0;
            this.f11841i = 0;
            return this;
        }

        private C3975b(String str) {
            this.f11843k = -1;
            this.f11844l = "";
            this.f11849q = true;
            this.f11851s = "";
            this.f11852t = true;
            this.f11833a = str;
        }

        /* renamed from: a */
        public final C3975b mo11558a(String str) {
            this.f11844l = str;
            return this;
        }

        /* renamed from: a */
        public final C3975b mo11559a(boolean z) {
            this.f11846n = z;
            return this;
        }

        /* renamed from: a */
        public final C3975b mo11556a(int i, int i2, int i3, int i4) {
            this.f11845m = true;
            this.f11838f = i;
            this.f11839g = i2;
            this.f11840h = i3;
            this.f11841i = i4;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$c */
    public interface C3976c {
        /* renamed from: a */
        boolean mo11569a();

        /* renamed from: a */
        boolean mo11570a(WebView webView);

        /* renamed from: b */
        C3978e mo11571b();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$d */
    public interface C3977d {
        /* renamed from: a */
        void mo9661a(WebView webView, String str);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.b$e */
    public static class C3978e implements C4030a {

        /* renamed from: a */
        public RoundRectWebView f11853a;

        /* renamed from: b */
        public C3971a f11854b;

        /* renamed from: c */
        public WebChromeClient f11855c;

        /* renamed from: d */
        public WebViewClient f11856d;

        /* renamed from: a */
        public final void mo11572a() {
            this.f11854b = null;
            this.f11853a = null;
            this.f11855c = null;
            this.f11856d = null;
        }

        /* renamed from: a */
        public final void mo11573a(String str, JSONObject jSONObject) {
            this.f11854b.mo11529a().mo27206a(str, jSONObject);
        }

        public C3978e(RoundRectWebView roundRectWebView, C3971a aVar, WebChromeClient webChromeClient, WebViewClient webViewClient) {
            this.f11853a = roundRectWebView;
            this.f11854b = aVar;
            this.f11855c = webChromeClient;
            this.f11856d = webViewClient;
        }
    }

    /* renamed from: a */
    WebView mo11531a(Context context);

    /* renamed from: a */
    BaseDialogFragment mo11532a(Context context, String str, String str2);

    /* renamed from: a */
    BaseDialogFragment mo11533a(C3975b bVar);

    /* renamed from: a */
    C3978e mo11534a(Activity activity, C3977d dVar);

    /* renamed from: a */
    void mo11535a(Context context, C3974a aVar);

    /* renamed from: a */
    void mo11536a(DialogFragment dialogFragment);

    /* renamed from: a */
    void mo11537a(WebView webView);

    /* renamed from: a */
    void mo11538a(C3976c cVar);

    /* renamed from: a */
    void mo11539a(C3978e eVar);

    /* renamed from: a */
    void mo11540a(C3978e eVar, String str);

    /* renamed from: a */
    void mo11541a(C3978e eVar, String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo11542a(C4030a aVar);

    /* renamed from: a */
    void mo11543a(String str, JSONObject jSONObject);

    /* renamed from: a */
    boolean mo11544a();

    /* renamed from: a */
    boolean mo11545a(WebView webView, String str);

    /* renamed from: b */
    void mo11546b();

    /* renamed from: b */
    void mo11547b(DialogFragment dialogFragment);

    /* renamed from: b */
    void mo11548b(C3976c cVar);

    /* renamed from: b */
    void mo11549b(C4030a aVar);
}
