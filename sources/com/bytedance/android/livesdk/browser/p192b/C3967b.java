package com.bytedance.android.livesdk.browser.p192b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.p146b.C3164a;
import com.bytedance.android.live.core.p146b.C3165b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.C3970c;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.bytedance.android.livesdk.utils.C9020a;
import com.p280ss.android.common.util.NetworkUtils;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.browser.b.b */
public final class C3967b implements C3966a {

    /* renamed from: com.bytedance.android.livesdk.browser.b.b$a */
    public static final class C3969a implements C9174b<C3966a> {
        /* renamed from: a */
        public final C9175a<C3966a> mo11528a(C9175a<C3966a> aVar) {
            return aVar.mo22388a(new C3967b());
        }
    }

    private C3967b() {
    }

    /* renamed from: b */
    private static String m13901b() {
        return C3165b.m11951a(TTLiveSDKContext.getHostService().mo22360a().currentLocale());
    }

    /* renamed from: a */
    public final int mo11526a() {
        int intValue = ((Integer) C3970c.f11822g.mo10240a()).intValue();
        if (intValue == 1 || intValue == 0 || intValue == 2) {
            return intValue;
        }
        return 2;
    }

    /* renamed from: a */
    public final void mo11527a(WebView webView) {
        String a = m13900a(webView.getContext(), webView);
        if (!TextUtils.isEmpty(a)) {
            webView.getSettings().setUserAgentString(a);
        }
    }

    /* renamed from: a */
    private String m13900a(Context context, WebView webView) {
        String a = C9020a.m26951a(context, webView);
        if (a == null) {
            a = "";
        }
        Locale c = C3164a.m11950c();
        if (context != null) {
            c = context.getResources().getConfiguration().locale;
        }
        if (TextUtils.isEmpty(a)) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" ");
        sb.append(TTLiveSDKContext.getHostService().mo22360a().appName());
        sb.append("_");
        sb.append(TTLiveSDKContext.getHostService().mo22360a().getVersionCode());
        sb.append(" AppVersion/");
        sb.append(TTLiveSDKContext.getHostService().mo22360a().getVersionCode());
        sb.append(" JsSdk/2.0 NetType/");
        sb.append(NetworkUtils.getNetworkAccessType(TTLiveSDKContext.getHostService().mo22360a().context()).toUpperCase());
        sb.append(" Channel/");
        sb.append(TTLiveSDKContext.getHostService().mo22360a().getChannel());
        sb.append(" ByteLocale/");
        sb.append(c.toString());
        sb.append(" Webcast_ByteLocale/");
        sb.append(m13901b());
        sb.append(" Region/");
        sb.append(C3164a.m11948b());
        sb.append(" App/");
        sb.append(TTLiveSDKContext.getHostService().mo22360a().appName());
        sb.append(" WebcastSDK/1380");
        return sb.toString();
    }
}
