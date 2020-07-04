package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24567h;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod.C43454b;
import com.p280ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod.C43457b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage */
public final class AdSouthNorthStickerPage extends AbsFragment {

    /* renamed from: i */
    public static final C25444a f66962i = new C25444a(null);

    /* renamed from: e */
    public View f66963e;

    /* renamed from: f */
    public boolean f66964f;

    /* renamed from: g */
    public boolean f66965g;

    /* renamed from: h */
    public boolean f66966h;

    /* renamed from: j */
    private CrossPlatformWebView f66967j;

    /* renamed from: k */
    private boolean f66968k;

    /* renamed from: l */
    private final C25448e f66969l = new C25448e(this);

    /* renamed from: m */
    private C25445b f66970m = new C25445b(this);

    /* renamed from: n */
    private HashMap f66971n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage$a */
    public static final class C25444a {
        private C25444a() {
        }

        public /* synthetic */ C25444a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C0608j m83673a(Context context) {
            C7573i.m23587b(context, "context");
            C0608j supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            C7573i.m23582a((Object) supportFragmentManager, "(context as FragmentActi…y).supportFragmentManager");
            return supportFragmentManager;
        }

        /* renamed from: b */
        public final void mo66071b(Context context) {
            C7573i.m23587b(context, "context");
            C0608j a = m83673a(context);
            Fragment a2 = a.mo2642a((int) R.id.db);
            if (a2 != null) {
                a2.setUserVisibleHint(false);
                a.mo2645a().mo2587a(a2).mo2606d();
            }
        }

        /* renamed from: a */
        public final boolean mo66070a(Context context, String str) {
            C7573i.m23587b(context, "context");
            C0608j a = m83673a(context);
            Fragment a2 = a.mo2642a((int) R.id.db);
            if (a2 == null) {
                return false;
            }
            if ((a2 instanceof AdSouthNorthStickerPage) && !((AdSouthNorthStickerPage) a2).f66966h) {
                return false;
            }
            Bundle arguments = a2.getArguments();
            if (arguments != null) {
                arguments.putString("support_team", str);
            }
            a2.setUserVisibleHint(true);
            a.mo2645a().mo2605c(a2).mo2606d();
            return true;
        }

        /* renamed from: a */
        public final void mo66069a(String str, Context context) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(context, "context");
            if (C37073c.m119204d(str)) {
                str = Uri.parse(str).getQueryParameter("url");
                if (str == null) {
                    str = "";
                }
            }
            if (!TextUtils.isEmpty(str)) {
                String uri = Uri.parse(str).buildUpon().appendQueryParameter("isNew", "1").build().toString();
                C7573i.m23582a((Object) uri, "Uri.parse(url)\n         …              .toString()");
                Bundle bundle = new Bundle();
                bundle.putString("url", uri);
                AdSouthNorthStickerPage adSouthNorthStickerPage = new AdSouthNorthStickerPage();
                adSouthNorthStickerPage.setArguments(bundle);
                Fragment fragment = adSouthNorthStickerPage;
                m83673a(context).mo2645a().mo2586a(R.id.db, fragment, "AdSouthNorthSticker").mo2601b(fragment).mo2606d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage$b */
    public static final class C25445b implements C23254a {

        /* renamed from: a */
        final /* synthetic */ AdSouthNorthStickerPage f66972a;

        C25445b(AdSouthNorthStickerPage adSouthNorthStickerPage) {
            this.f66972a = adSouthNorthStickerPage;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f66972a.mo66066a();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage$c */
    static final class C25446c implements OnClickListener {

        /* renamed from: a */
        public static final C25446c f66973a = new C25446c();

        C25446c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl adSouthNorthFirstSupportTime = inst.getAdSouthNorthFirstSupportTime();
            C7573i.m23582a((Object) adSouthNorthFirstSupportTime, "SharePrefCache.inst().adSouthNorthFirstSupportTime");
            adSouthNorthFirstSupportTime.mo59871a(Long.valueOf(0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage$d */
    static final class C25447d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdSouthNorthStickerPage f66974a;

        C25447d(AdSouthNorthStickerPage adSouthNorthStickerPage) {
            this.f66974a = adSouthNorthStickerPage;
        }

        public final void run() {
            if (AdSouthNorthStickerPage.m83666a(this.f66974a).getVisibility() == 0) {
                C43316v.m137450K().mo104948x();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage$e */
    public static final class C25448e implements C25965c {

        /* renamed from: a */
        final /* synthetic */ AdSouthNorthStickerPage f66975a;

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            return false;
        }

        C25448e(AdSouthNorthStickerPage adSouthNorthStickerPage) {
            this.f66975a = adSouthNorthStickerPage;
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            this.f66975a.f66964f = true;
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f66975a.f66965g = true;
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
            this.f66975a.f66964f = false;
            this.f66975a.f66965g = false;
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            this.f66975a.f66965g = true;
        }
    }

    /* renamed from: g */
    private void m83671g() {
        if (this.f66971n != null) {
            this.f66971n.clear();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C42961az.m136383d(this);
        m83671g();
    }

    public final void onResume() {
        super.onResume();
        if (this.mUserVisibleHint) {
            View view = this.f66963e;
            if (view == null) {
                C7573i.m23583a("mMaskView");
            }
            view.postDelayed(new C25447d(this), 500);
        }
    }

    /* renamed from: d */
    private final void m83668d() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("support_team", "");
        } else {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("first_support_team", str);
        CrossPlatformWebView crossPlatformWebView = this.f66967j;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        crossPlatformWebView.mo67472a("juStickerParams", jSONObject);
    }

    /* renamed from: e */
    private final void m83669e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity instanceof MainActivity) {
                ((MainActivity) activity).registerActivityOnKeyDownListener(this.f66970m);
            } else {
                if (activity instanceof DetailActivity) {
                    ((DetailActivity) activity).registerActivityOnKeyDownListener(this.f66970m);
                }
            }
        }
    }

    /* renamed from: f */
    private final void m83670f() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity instanceof MainActivity) {
                ((MainActivity) activity).unRegisterActivityOnKeyDownListener(this.f66970m);
            } else {
                if (activity instanceof DetailActivity) {
                    ((DetailActivity) activity).unRegisterActivityOnKeyDownListener(this.f66970m);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo66066a() {
        Context context = getContext();
        if (context != null) {
            setUserVisibleHint(false);
            C7573i.m23582a((Object) context, "it");
            C25444a.m83673a(context).mo2645a().mo2601b(this).mo2606d();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m83666a(AdSouthNorthStickerPage adSouthNorthStickerPage) {
        View view = adSouthNorthStickerPage.f66963e;
        if (view == null) {
            C7573i.m23583a("mMaskView");
        }
        return view;
    }

    @C7709l
    public final void onDidLoadFinishEvent(C43457b bVar) {
        C7573i.m23587b(bVar, "event");
        boolean z = true;
        if (bVar.f112549a != 1) {
            z = false;
        }
        this.f66966h = z;
    }

    @C7709l
    public final void onReceiveCloseJuStickerWindowEvent(C43454b bVar) {
        C7573i.m23587b(bVar, "event");
        mo66066a();
    }

    /* renamed from: a */
    private final void m83667a(View view) {
        View findViewById = view.findViewById(R.id.bwy);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.mask)");
        this.f66963e = findViewById;
        View view2 = this.f66963e;
        if (view2 == null) {
            C7573i.m23583a("mMaskView");
        }
        view2.setAlpha(0.0f);
        View findViewById2 = view.findViewById(R.id.egh);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.webview)");
        this.f66967j = (CrossPlatformWebView) findViewById2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CrossPlatformWebView crossPlatformWebView = this.f66967j;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            CommercializeWebViewHelper.m82757a(crossPlatformWebView, this.f66969l, this, activity, getArguments());
        }
        if (C7163a.m22363a()) {
            View findViewById3 = view.findViewById(R.id.wm);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(C25446c.f66973a);
            }
        }
        setUserVisibleHint(false);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f66968k != z) {
            this.f66968k = z;
            int i = 0;
            if (z) {
                m83668d();
                m83669e();
                View view = this.f66963e;
                if (view == null) {
                    C7573i.m23583a("mMaskView");
                }
                view.animate().alpha(0.5f).setDuration(100).start();
                if (getActivity() instanceof DetailActivity) {
                    C24567h hVar = new C24567h(true);
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        i = activity.hashCode();
                    }
                    hVar.f64808b = i;
                    C42961az.m136380a(hVar);
                }
            } else {
                m83670f();
                View view2 = this.f66963e;
                if (view2 == null) {
                    C7573i.m23583a("mMaskView");
                }
                view2.animate().alpha(0.0f).setDuration(100).start();
                C43222g K = C43316v.m137450K();
                C7573i.m23582a((Object) K, "PlayerManager.inst()");
                if (!K.mo104916o()) {
                    C43316v.m137450K().mo104946v();
                }
                if (getActivity() instanceof DetailActivity) {
                    C24567h hVar2 = new C24567h(false);
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        i = activity2.hashCode();
                    }
                    hVar2.f64808b = i;
                    C42961az.m136380a(hVar2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r7 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            super.onViewCreated(r7, r8)
            r6.m83667a(r7)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136382c(r6)
            android.os.Bundle r7 = r6.getArguments()
            if (r7 == 0) goto L_0x001f
            java.lang.String r8 = "url"
            java.lang.String r7 = r7.getString(r8)
            if (r7 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r1 = r7
            goto L_0x0022
        L_0x001f:
            java.lang.String r7 = ""
            goto L_0x001d
        L_0x0022:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f66967j
            if (r0 != 0) goto L_0x002b
            java.lang.String r7 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x002b:
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m85411a(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.AdSouthNorthStickerPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.n4, viewGroup, false);
    }
}
