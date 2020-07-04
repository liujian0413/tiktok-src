package com.bytedance.polaris.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.bytedance.common.p479c.C9682a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.polaris.base.AbsPolarisFragment;
import com.bytedance.polaris.base.BasePolarisActivity;
import com.bytedance.polaris.browser.p635a.C12410d;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p633a.C12335a;
import com.bytedance.polaris.p634b.C12361l;
import com.bytedance.polaris.p634b.C12367r;
import com.bytedance.polaris.p634b.C12370u;
import com.bytedance.polaris.widget.FullscreenVideoFrame;
import com.bytedance.polaris.widget.FullscreenVideoFrame.C12437a;
import com.bytedance.polaris.widget.webview.C12440a;
import com.bytedance.polaris.widget.webview.C12443c;
import com.bytedance.polaris.widget.webview.PolarisWebView;
import com.example.p266a.C6490c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class PolarisBrowserFragment extends AbsPolarisFragment implements C6310a, C12388a {

    /* renamed from: A */
    private boolean f32868A;

    /* renamed from: B */
    private String f32869B;

    /* renamed from: d */
    protected PolarisWebView f32870d;

    /* renamed from: e */
    public C12410d f32871e;

    /* renamed from: f */
    C12385a f32872f;

    /* renamed from: g */
    public FullscreenVideoFrame f32873g;

    /* renamed from: h */
    public boolean f32874h;

    /* renamed from: i */
    public boolean f32875i;

    /* renamed from: j */
    public CustomViewCallback f32876j;

    /* renamed from: k */
    public View f32877k;

    /* renamed from: l */
    public boolean f32878l = true;

    /* renamed from: m */
    private ProgressBar f32879m;

    /* renamed from: n */
    private JSONObject f32880n;

    /* renamed from: o */
    private C6309f f32881o;

    /* renamed from: p */
    private Runnable f32882p;

    /* renamed from: q */
    private FragmentActivity f32883q;

    /* renamed from: r */
    private Resources f32884r;

    /* renamed from: s */
    private boolean f32885s;

    /* renamed from: t */
    private boolean f32886t;

    /* renamed from: u */
    private boolean f32887u;

    /* renamed from: v */
    private String f32888v;

    /* renamed from: w */
    private long f32889w;

    /* renamed from: x */
    private C12440a f32890x;

    /* renamed from: y */
    private boolean f32891y;

    /* renamed from: z */
    private boolean f32892z;

    /* renamed from: com.bytedance.polaris.browser.PolarisBrowserFragment$a */
    class C12385a extends C12443c {
        public final void onGeolocationPermissionsHidePrompt() {
            C12410d dVar = PolarisBrowserFragment.this.f32871e;
            if (dVar != null) {
                dVar.mo30249a();
            }
        }

        public final void onHideCustomView() {
            if (PolarisBrowserFragment.this.f32877k == null) {
                PolarisBrowserFragment.this.f32876j = null;
                return;
            }
            if (PolarisBrowserFragment.this.getActivity() != null && (PolarisBrowserFragment.this.getActivity() instanceof BasePolarisActivity)) {
                ((BasePolarisActivity) PolarisBrowserFragment.this.getActivity()).mo30210o_();
            }
            PolarisBrowserFragment.this.f32873g.setVisibility(8);
            PolarisBrowserFragment.this.f32873g.removeView(PolarisBrowserFragment.this.f32877k);
            C9738o.m28692a((Activity) PolarisBrowserFragment.this.getActivity(), false);
            PolarisBrowserFragment.this.f32877k = null;
            PolarisBrowserFragment.this.f32876j.onCustomViewHidden();
        }

        C12385a() {
            super(PolarisBrowserFragment.this);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            C12410d dVar = PolarisBrowserFragment.this.f32871e;
            if (dVar != null) {
                dVar.mo30251a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            PolarisBrowserFragment.this.mo30228a(i);
            if (i >= 100) {
                PolarisBrowserFragment.this.mo30234f();
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (PolarisBrowserFragment.this.f32875i && PolarisBrowserFragment.this.getActivity() != null && !C6319n.m19593a(str)) {
                PolarisBrowserFragment.this.getActivity().setTitle(str);
            }
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            if (!PolarisBrowserFragment.this.f32878l || !PolarisBrowserFragment.this.f32874h) {
                return;
            }
            if (PolarisBrowserFragment.this.f32877k != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            if (PolarisBrowserFragment.this.getActivity() != null && (PolarisBrowserFragment.this.getActivity() instanceof BasePolarisActivity)) {
                ((BasePolarisActivity) PolarisBrowserFragment.this.getActivity()).mo30209h();
            }
            PolarisBrowserFragment.this.f32876j = customViewCallback;
            PolarisBrowserFragment.this.f32873g.addView(view);
            PolarisBrowserFragment.this.f32877k = view;
            C9738o.m28692a((Activity) PolarisBrowserFragment.this.getActivity(), true);
            PolarisBrowserFragment.this.f32873g.setVisibility(0);
            PolarisBrowserFragment.this.f32873g.requestFocus();
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            if (C12361l.m35898a()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" -- line ");
                sb.append(i);
            }
            try {
                C12410d dVar = PolarisBrowserFragment.this.f32871e;
                if (dVar != null) {
                    dVar.mo30250a(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final WebView mo30231c() {
        return this.f32870d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo30232d() {
        return R.layout.agf;
    }

    /* renamed from: b */
    public final void mo30230b() {
        if (this.f32885s) {
            this.f32870d.stopLoading();
        } else {
            this.f32870d.reload();
        }
    }

    public void onDestroy() {
        C12410d dVar = this.f32871e;
        if (dVar != null) {
            dVar.mo30258d();
        }
        super.onDestroy();
        C12367r.m35918a((WebView) this.f32870d);
    }

    /* renamed from: g */
    private void mo30245g() {
        this.f32870d.setBackgroundColor(this.f32884r.getColor(R.color.a25));
        if (this.f32887u) {
            this.f32870d.setBackgroundColor(this.f32884r.getColor(R.color.a25));
        }
    }

    /* renamed from: h */
    private void m35991h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("use_new", true);
        } catch (JSONException unused) {
        }
        C12428i.m36159i().mo30317a(getActivity(), "all", null, null, jSONObject, null);
    }

    /* renamed from: e */
    public final void mo30233e() {
        this.f32885s = false;
        if (this.f32879m != null && this.f32879m.getVisibility() == 0) {
            this.f32879m.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo30234f() {
        this.f32881o.removeCallbacks(this.f32882p);
        this.f32881o.postDelayed(this.f32882p, 500);
    }

    /* renamed from: i */
    private boolean m35992i() {
        if (this.f32892z && this.f32868A) {
            if (!C12428i.m36159i().mo30323b()) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return true;
                }
            } else {
                m35988b(this.f32888v);
            }
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.f32868A = true;
        FragmentActivity activity = getActivity();
        C9682a.m28609a((WebView) this.f32870d);
        C12367r.m35917a(getActivity(), this.f32870d);
        C12410d dVar = this.f32871e;
        if (this.f32881o != null && activity != null && !activity.isFinishing() && !dVar.mo30255b(this.f32888v)) {
            this.f32881o.sendEmptyMessageDelayed(10011, 120000);
        }
        if (dVar != null) {
            dVar.mo30256c();
        }
    }

    public void onResume() {
        super.onResume();
        if (!m35992i()) {
            if (this.f32868A && this.f32892z) {
                this.f32892z = false;
            }
            if (this.f32870d != null) {
                this.f32870d.getSettings().setBlockNetworkLoads(false);
                if (this.f32881o != null) {
                    this.f32881o.removeMessages(10011);
                }
            }
            this.f32889w = System.currentTimeMillis();
            C9682a.m28610b(this.f32870d);
            mo30245g();
            C12410d dVar = this.f32871e;
            if (dVar != null) {
                dVar.mo30253b();
            }
        }
    }

    /* renamed from: a */
    public final void mo30229a(String str) {
        m35987a(str, false);
    }

    /* renamed from: a */
    private static PolarisWebView m35986a(View view) {
        return (PolarisWebView) view.findViewById(R.id.d_1);
    }

    public void handleMsg(Message message) {
        if (message.what == 10011 && !mo30201p_() && this.f32870d != null) {
            try {
                this.f32870d.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m35988b(String str) {
        if (this.f32880n == null || this.f32880n.length() <= 0) {
            C12370u.m35930a(str, this.f32870d, this.f32869B, true);
        } else {
            HashMap hashMap = new HashMap();
            C12370u.m35933a(hashMap, (String) null, this.f32880n);
            C12370u.m35931a(str, (WebView) this.f32870d, hashMap);
        }
        m35989c(str);
    }

    /* renamed from: c */
    private static void m35989c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path) && path.contains("page/task")) {
                    C12335a.m35825b().mo30175a();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: a */
    public final void mo30228a(int i) {
        this.f32885s = true;
        if (this.f32879m != null) {
            this.f32879m.setProgress(i);
            this.f32881o.removeCallbacks(this.f32882p);
            if (this.f32879m.getVisibility() != 0) {
                this.f32879m.setVisibility(0);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        String str;
        boolean z;
        int i;
        super.onActivityCreated(bundle);
        this.f32881o = new C6309f(this);
        this.f32882p = new Runnable() {
            public final void run() {
                PolarisBrowserFragment.this.mo30233e();
            }
        };
        this.f32883q = getActivity();
        this.f32884r = this.f32883q.getResources();
        boolean z2 = false;
        this.f32874h = false;
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments != null) {
            z = arguments.getBoolean("bundle_no_hw_acceleration", false);
            this.f32886t = arguments.getBoolean("bundle_enable_app_cache", false);
            str = arguments.getString("bundle_url");
            if (str == null) {
                str = "";
            }
            this.f32869B = arguments.getString("referer");
            this.f32887u = arguments.getBoolean("bundle_use_day_night", false);
            this.f32875i = arguments.getBoolean("bundle_user_webview_title", false);
            String string = arguments.getString("wap_headers");
            this.f32891y = arguments.getBoolean("require_login");
            try {
                if (!C6319n.m19593a(string)) {
                    this.f32880n = new JSONObject(string);
                }
            } catch (JSONException unused) {
            }
        } else {
            str = str2;
            z = false;
        }
        try {
            CookieManager.getInstance().setAcceptCookie(true);
        } catch (Throwable unused2) {
        }
        C12419c a = C12419c.m36109a((Context) getActivity());
        if (!z) {
            z2 = true;
        }
        a.mo30302a(z2).mo30303a((WebView) this.f32870d);
        C12428i.m36155e().mo30309a(this.f32870d);
        C12370u.m35928a((WebView) this.f32870d);
        this.f32872f = new C12385a();
        this.f32870d.setWebChromeClient(this.f32872f);
        WebSettings settings = this.f32870d.getSettings();
        if (this.f32886t) {
            i = 1;
        } else {
            i = -1;
        }
        settings.setCacheMode(i);
        this.f32888v = str;
        boolean b = C12428i.m36159i().mo30323b();
        if (!this.f32891y || b) {
            m35988b(this.f32888v);
            return;
        }
        this.f32892z = true;
        m35991h();
    }

    /* renamed from: a */
    private void m35987a(String str, boolean z) {
        if (this.f32870d != null) {
            if (this.f32880n == null || this.f32880n.length() <= 0) {
                C12370u.m35929a(str, (WebView) this.f32870d);
                return;
            }
            HashMap hashMap = new HashMap();
            C12370u.m35933a(hashMap, (String) null, this.f32880n);
            C12370u.m35931a(str, (WebView) this.f32870d, hashMap);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f32872f != null) {
            this.f32872f.mo30394a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo30232d(), viewGroup, false);
        this.f32879m = (ProgressBar) inflate.findViewById(R.id.d9z);
        this.f32870d = m35986a(inflate);
        this.f32871e = new C12410d(this, this, this.f32870d);
        this.f32890x = new C12440a(this.f32871e);
        this.f32870d.setWebViewClient(C6490c.m20171a((WebViewClient) this.f32890x));
        this.f32870d.setScrollBarStyle(0);
        this.f32873g = (FullscreenVideoFrame) inflate.findViewById(R.id.a5s);
        this.f32873g.setListener(new C12437a() {
            /* renamed from: a */
            public final void mo30235a() {
                if (PolarisBrowserFragment.this.f32872f != null) {
                    PolarisBrowserFragment.this.f32872f.onHideCustomView();
                }
            }
        });
        return inflate;
    }
}
