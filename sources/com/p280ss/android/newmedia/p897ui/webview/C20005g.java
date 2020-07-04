package com.p280ss.android.newmedia.p897ui.webview;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.crossplatform.C25881h;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.language.C32326h;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.newmedia.ui.webview.g */
public final class C20005g {

    /* renamed from: a */
    public static final C20005g f54137a = new C20005g();

    private C20005g() {
    }

    /* renamed from: a */
    public final void mo53551a(WebView webView) {
        if (webView != null) {
            Context context = webView.getContext();
            C7573i.m23582a((Object) context, "webview.context");
            String a = m65925a(context, webView);
            if (!C6319n.m19593a(a)) {
                WebSettings settings = webView.getSettings();
                C7573i.m23582a((Object) settings, "webview.settings");
                settings.setUserAgentString(a);
            }
        }
    }

    /* renamed from: a */
    private static String m65925a(Context context, WebView webView) {
        String str;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(webView, C22912d.f60641a);
        String a = C20006h.m65927a(context, webView);
        if (a == null) {
            a = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" trill_");
        sb.append(C6399b.m19933i());
        sb.append(" JsSdk/1.0 NetType/");
        String networkAccessType = NetworkUtils.getNetworkAccessType(C6399b.m19921a());
        C7573i.m23582a((Object) networkAccessType, "NetworkUtils.getNetworkA….getApplicationContext())");
        if (networkAccessType != null) {
            String upperCase = networkAccessType.toUpperCase();
            C7573i.m23582a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            sb.append(" Channel/");
            sb.append(C6399b.m19941q());
            sb.append(" AppName/");
            sb.append(C6399b.m19929e());
            sb.append(" app_version/");
            sb.append(C6399b.m19934j());
            String sb2 = sb.toString();
            Locale a2 = C30476b.m99547a();
            if (VERSION.SDK_INT >= 21) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" ByteLocale/");
                sb3.append(a2.toLanguageTag());
                str = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(" ByteLocale/");
                String locale = a2.toString();
                C7573i.m23582a((Object) locale, "locale.toString()");
                sb4.append(C7634n.m23711a(locale, "_", "-", false));
                str = sb4.toString();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(" ByteFullLocale/");
            sb5.append(C30476b.m99553b());
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(" Region/");
            sb7.append(C32326h.m104885g());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append(" AppSkin/");
            sb9.append(C25881h.m85148a());
            return sb9.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
