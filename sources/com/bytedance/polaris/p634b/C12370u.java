package com.bytedance.polaris.p634b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Pair;
import android.webkit.WebView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.model.C12436b;
import com.p280ss.android.ugc.aweme.app.C22909c;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.b.u */
public final class C12370u {
    /* renamed from: a */
    public static boolean m35935a(String str) {
        return !C6319n.m19593a(str) && "1".equals(str);
    }

    /* renamed from: a */
    public static void m35934a(Map<String, String> map, boolean z) {
        C12428i.m36159i().mo30320a(map, z);
        map.put("polaris_version", "tt_2.0.0.59");
        map.put("polaris_version_code", "201");
    }

    /* renamed from: a */
    public static void m35932a(StringBuilder sb, boolean z) {
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C12428i.m36159i().mo30320a((Map<String, String>) linkedHashMap, z);
        linkedHashMap.put("polaris_version", "tt_2.0.0.59");
        linkedHashMap.put("polaris_version_code", "201");
        ArrayList arrayList = new ArrayList();
        for (Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb.append(NetworkUtils.m19541a((List<Pair<String, String>>) arrayList, "UTF-8"));
    }

    /* renamed from: a */
    public static void m35933a(HashMap<String, String> hashMap, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                try {
                    String str2 = (String) keys.next();
                    String optString = jSONObject.optString(str2);
                    if (!C6319n.m19593a(str2)) {
                        if (!C6319n.m19593a(optString)) {
                            hashMap.put(str2, optString);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!C6319n.m19593a((String) null)) {
            hashMap.put("User-Agent", null);
        }
    }

    /* renamed from: a */
    private static String m35925a() {
        StringBuilder sb = new StringBuilder("polaris");
        C12428i.m36159i();
        sb.append(1233);
        return sb.toString();
    }

    /* renamed from: f */
    public static boolean m35940f(String str) {
        return m35942h(str);
    }

    /* renamed from: b */
    public static String m35936b(String str) {
        StringBuilder sb = new StringBuilder(str);
        m35932a(sb, false);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m35937c(String str) {
        try {
            Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("polaris_version", "tt_2.0.0.59");
            buildUpon.appendQueryParameter("polaris_version_code", "201");
            return buildUpon.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static boolean m35938d(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m35939e(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        boolean g = m35941g(parse.getScheme());
        String host = parse.getHost();
        if (!g || !C12347d.f32776i.equals(host)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m35941g(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (C22909c.f60637a.equals(str)) {
            return true;
        }
        String a = m35925a();
        if (C6319n.m19593a(a) || !a.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m35942h(String str) {
        try {
            if (C6319n.m19593a(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            boolean g = m35941g(parse.getScheme());
            String host = parse.getHost();
            if (!g || !"polaris".equals(host)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m35926a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            if (m35939e(uri.toString())) {
                return new C12436b(uri).mo30304a();
            }
            return URLDecoder.decode(uri.getQueryParameter("url"));
        } catch (Exception unused) {
            return uri.toString();
        }
    }

    /* renamed from: a */
    public static void m35928a(WebView webView) {
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (C6319n.m19593a(userAgentString)) {
                userAgentString = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(userAgentString);
            sb.append(" PolarisVersion/tt_2.0.0.59");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(" PolarisVersionCode/");
            sb3.append("201");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(" HostVersion/");
            sb5.append(C12428i.m36159i().mo30312a());
            webView.getSettings().setUserAgentString(sb5.toString());
        }
    }

    /* renamed from: a */
    public static void m35929a(String str, WebView webView) {
        m35930a(str, webView, null, true);
    }

    /* renamed from: a */
    private static int m35923a(Uri uri, String str) {
        try {
            return Integer.valueOf(uri.getQueryParameter(str)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m35927a(String str, String str2) {
        if (C6319n.m19593a(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Builder clearQuery = parse.buildUpon().clearQuery();
        for (String str3 : queryParameterNames) {
            if (!str3.equals("url") && !str3.equals("fallback")) {
                clearQuery.appendQueryParameter(str3, parse.getQueryParameter(str3));
            } else if (!C6319n.m19593a(str2)) {
                clearQuery.appendQueryParameter(str3, URLEncoder.encode(str2));
            }
        }
        return clearQuery.build().toString();
    }

    /* renamed from: a */
    public static int m35924a(Uri uri, String str, int i) {
        int a = m35923a(uri, str);
        if (a == -1) {
            return 2;
        }
        return a;
    }

    /* renamed from: a */
    public static void m35931a(String str, WebView webView, HashMap<String, String> hashMap) {
        if (webView != null && !C6319n.m19593a(str)) {
            if (!hashMap.isEmpty()) {
                C12371v.m35943a(webView, str, hashMap);
            } else {
                C12355i.m35892a(webView, str);
            }
        }
    }

    /* renamed from: a */
    public static void m35930a(String str, WebView webView, String str2, boolean z) {
        if (webView != null && !C6319n.m19593a(str)) {
            boolean d = m35938d(str);
            if (d && C6319n.m19593a(str2)) {
                str2 = C12347d.f32775h;
            }
            if (!d) {
                str2 = null;
            }
            HashMap hashMap = new HashMap();
            if (!C6319n.m19593a(str2)) {
                hashMap.put("Referer", str2);
            }
            m35931a(str, webView, hashMap);
        }
    }
}
