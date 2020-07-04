package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j */
public final class C25978j {

    /* renamed from: a */
    public static final C25978j f68686a = new C25978j();

    /* renamed from: b */
    public static final C25979a f68687b = new C25979a(null);

    /* renamed from: c */
    private static final CopyOnWriteArrayList<String> f68688c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static final CopyOnWriteArrayList<String> f68689d = new CopyOnWriteArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.j$a */
    public static final class C25979a {
        private C25979a() {
        }

        /* renamed from: a */
        public static C25978j m85338a() {
            return C25978j.f68686a;
        }

        public /* synthetic */ C25979a(C7571f fVar) {
            this();
        }
    }

    private C25978j() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            List ttnetInterceptWebviewBlackList = a.getTtnetInterceptWebviewBlackList();
            IESSettingsProxy a2 = C30199h.m98861a();
            C7573i.m23582a((Object) a2, "SettingsReader.get()");
            List ttnetInterceptWebviewWhiteList = a2.getTtnetInterceptWebviewWhiteList();
            if (!C23477d.m77081a((Collection<T>) ttnetInterceptWebviewWhiteList)) {
                C7573i.m23582a((Object) ttnetInterceptWebviewWhiteList, "whiteList");
                m85333b(ttnetInterceptWebviewWhiteList);
            }
            if (!C23477d.m77081a((Collection<T>) ttnetInterceptWebviewBlackList)) {
                C7573i.m23582a((Object) ttnetInterceptWebviewBlackList, "blackList");
                m85331a(ttnetInterceptWebviewBlackList);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m85331a(List<String> list) {
        Collection collection = list;
        if (!C23477d.m77081a(collection)) {
            f68689d.addAll(collection);
        }
    }

    /* renamed from: b */
    private static void m85333b(List<String> list) {
        Collection collection = list;
        if (!C23477d.m77081a(collection)) {
            f68688c.addAll(collection);
        }
    }

    /* renamed from: a */
    public static boolean m85332a(String str) {
        C7573i.m23587b(str, "ref");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        if (C7634n.m23776c(charSequence, (CharSequence) WebKitApi.SCHEME_HTTPS, false) || C7634n.m23776c(charSequence, (CharSequence) WebKitApi.SCHEME_HTTP, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m85334b(String str) {
        if (!C23477d.m77081a((Collection<T>) f68688c)) {
            Iterator it = f68688c.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                CharSequence charSequence = str;
                C7573i.m23582a((Object) str2, "host");
                if (C7634n.m23776c(charSequence, (CharSequence) str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m85336c(String str) {
        if (!C23477d.m77081a((Collection<T>) f68689d)) {
            Iterator it = f68689d.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                CharSequence charSequence = str;
                C7573i.m23582a((Object) str2, "host");
                if (C7634n.m23776c(charSequence, (CharSequence) str2, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final WebResourceResponse mo67429a(String str, String str2) {
        C7573i.m23587b(str, "ref");
        C7573i.m23587b(str2, "url");
        if (!m85335b(str, str2)) {
            return null;
        }
        return new C25975h().mo67427a(str, str2);
    }

    /* renamed from: b */
    private final boolean m85335b(String str, String str2) {
        CharSequence charSequence = str2;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence charSequence2 = str;
            if (!TextUtils.isEmpty(charSequence2)) {
                if ((!C7634n.m23776c(charSequence2, (CharSequence) WebKitApi.SCHEME_HTTPS, false) && !C7634n.m23776c(charSequence2, (CharSequence) WebKitApi.SCHEME_HTTP, false)) || ((!C7634n.m23776c(charSequence, (CharSequence) WebKitApi.SCHEME_HTTP, false) && !C7634n.m23776c(charSequence, (CharSequence) WebKitApi.SCHEME_HTTPS, false)) || C7634n.m23776c(charSequence, (CharSequence) "/v1/list?rdn", false) || C7634n.m23776c(charSequence, (CharSequence) "google-analytics.com", false) || C7634n.m23776c(charSequence, (CharSequence) "cdn.polyfill.io", false))) {
                    return false;
                }
                C7213d a = C7213d.m22500a();
                C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
                if (!a.mo18812l()) {
                    return false;
                }
                C7213d a2 = C7213d.m22500a();
                C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
                if (a2.mo18813m()) {
                    if (C7634n.m23776c(charSequence2, (CharSequence) "ttnet_intercept=0", false)) {
                        return false;
                    }
                    return m85336c(str);
                } else if (C7634n.m23776c(charSequence2, (CharSequence) "ttnet_intercept=1", false)) {
                    return true;
                } else {
                    return m85334b(str);
                }
            }
        }
        return false;
    }
}
