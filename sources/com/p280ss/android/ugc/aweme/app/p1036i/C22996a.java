package com.p280ss.android.ugc.aweme.app.p1036i;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27995l;
import com.p280ss.android.ugc.aweme.router.C7195s.C7202b;

/* renamed from: com.ss.android.ugc.aweme.app.i.a */
public final class C22996a implements IInterceptor, C7202b {

    /* renamed from: a */
    private boolean f60775a;

    /* renamed from: a */
    public final String mo18692a(String str) {
        if (!TextUtils.isEmpty(str) && (str.startsWith("aweme://webview/") || str.startsWith("aweme://ame/webview/"))) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                return Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString();
            }
        } else if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            sb.append(Uri.encode(str));
            str = sb.toString();
        }
        if (C27995l.m91593a(str)) {
            str = "";
        }
        return str;
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url = routeIntent.getUrl();
        if (!TextUtils.isEmpty(routeIntent.getUrl())) {
            if (url.startsWith("aweme://webview/") || url.startsWith("aweme://ame/webview/")) {
                Uri parse = Uri.parse(url);
                if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                    routeIntent.setUrl(Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter("url")).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString());
                    return true;
                }
            } else if (url.startsWith("http://") || url.startsWith("https://")) {
                StringBuilder sb = new StringBuilder("aweme://webview/?url=");
                sb.append(Uri.encode(url));
                routeIntent.setUrl(sb.toString());
                return true;
            }
        }
        this.f60775a = C27995l.m91593a(url);
        if (this.f60775a) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (!this.f60775a) {
            return false;
        }
        this.f60775a = false;
        return true;
    }
}
