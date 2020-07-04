package com.p280ss.android.newmedia;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.newmedia.eplatform.api.C19934a;
import com.p280ss.android.newmedia.eplatform.api.C19935b;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.p971p.C21766a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.newmedia.k */
public final class C19944k {
    /* renamed from: a */
    public static boolean m65783a(String str) {
        for (String startsWith : C21766a.m72783b()) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m65781a(WebView webView) {
        if (webView != null) {
            if (TextUtils.isEmpty(C21766a.m72785d())) {
                if (!TextUtils.isEmpty(C21766a.m72784c())) {
                    C10761a.m31410e(webView.getContext(), C21766a.m72784c()).mo25750a();
                } else {
                    C10761a.m31410e(webView.getContext(), webView.getContext().getString(R.string.cjm)).mo25750a();
                }
                C6907h.m21524a("enter_blacklist_page", (Map) C22984d.m75611a().mo59973a("black_list_type", "toast").f60753a);
                return;
            }
            C19946m.m65786a(webView, C21766a.m72785d());
            C6907h.m21524a("enter_blacklist_page", (Map) C22984d.m75611a().mo59973a("black_list_type", "intercept_page").f60753a);
        }
    }

    /* renamed from: a */
    public static void m65782a(WebView webView, String str) {
        if (webView != null) {
            C19934a.m65764a(str).mo6876a((C1591g<TResult, TContinuationResult>) new C19945l<TResult,TContinuationResult>(webView, str), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m65780a(WebView webView, String str, C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6890e() == null) {
            C10761a.m31410e(webView.getContext(), webView.getContext().getString(R.string.cjm)).mo25750a();
            return null;
        }
        if (!((C19935b) hVar.mo6890e()).f54020a) {
            ((SingleWebView) webView).visit(str);
            C19946m.m65786a(webView, str);
        } else if (TextUtils.isEmpty(C21766a.m72785d())) {
            if (!TextUtils.isEmpty(C21766a.m72784c())) {
                C10761a.m31410e(webView.getContext(), C21766a.m72784c()).mo25750a();
            } else {
                C10761a.m31410e(webView.getContext(), webView.getContext().getString(R.string.cjm)).mo25750a();
            }
            return null;
        } else {
            C19946m.m65786a(webView, Uri.parse(C21766a.m72785d()).buildUpon().appendQueryParameter("forbidden_url", str).appendQueryParameter("risk_level", String.valueOf(((C19935b) hVar.mo6890e()).f54021b)).toString());
            C6907h.m21524a("enter_blacklist_page", (Map) C22984d.m75611a().mo59973a("black_list_type", "intercept_page").f60753a);
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m65784a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return false;
        }
        if (!str3.contains(":")) {
            return TextUtils.equals(str2, str3);
        }
        return str.startsWith(str3);
    }

    /* renamed from: a */
    public static boolean m65785a(String str, String str2, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        if (str2 == null) {
            str2 = Uri.parse(str).getScheme();
        }
        if (TextUtils.equals(str2, C22909c.f60637a)) {
            return true;
        }
        for (String a : list) {
            if (m65784a(str, str2, a)) {
                return true;
            }
        }
        return false;
    }
}
