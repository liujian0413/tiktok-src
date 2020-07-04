package com.p280ss.android.ugc.aweme.lancet.network;

import bolts.C1592h;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.network.a */
public final class C7116a {
    /* renamed from: b */
    private static boolean m22231b(String str) {
        if (str.contains("video") || str.contains("audio") || str.contains("image")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m22227a(Response response) {
        boolean z;
        if (response != null) {
            Request request = response.request;
            if (request != null) {
                try {
                    HttpUrl httpUrl = request.url;
                    if (httpUrl != null) {
                        String str = httpUrl.host;
                        String encodedPath = httpUrl.encodedPath();
                        boolean isHttps = httpUrl.isHttps();
                        if (request.header("cookie") != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m22225a(str, encodedPath, z, isHttps, response.header("content-type"), "4", httpUrl.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m22228a(String str) {
        if ("ip-api.com".equals(str) || "cloudapi.bytedance.net".equals(str) || "freeapi.ipip.net".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m22230b(URL url, String str, String str2, String str3) {
        if (url != null) {
            try {
                String str4 = str3;
                m22225a(url.getHost(), url.getPath(), "cookie".equalsIgnoreCase(str), WebKitApi.SCHEME_HTTPS.equals(url.getProtocol()), str4, "2", url.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m22226a(URL url, String str, String str2, String str3) {
        if (url != null) {
            try {
                String str4 = str3;
                m22225a(url.getHost(), url.getPath(), "cookie".equalsIgnoreCase(str), WebKitApi.SCHEME_HTTPS.equals(url.getProtocol()), str4, "3", url.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m22229b(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        if (C7163a.m22363a() && !m22228a(str)) {
            LocalApiChecker.m22213a(str, str2, z, str3, z2, str4);
        }
    }

    /* renamed from: a */
    private static void m22224a(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("uri", str2);
            jSONObject.put("cookie", String.valueOf(z));
            jSONObject.put("item_type", str3);
            jSONObject.put("data_protocol", String.valueOf(z2));
            jSONObject.put("netClientType", str4);
            C6379c.m19826a("native_network_api_log", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m22225a(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        C7117b bVar = new C7117b(str3, z2, z, str, str5, str4, str2);
        C1592h.m7855a((Callable<TResult>) bVar, (Executor) C7258h.m22732e());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m22223a(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5) throws Exception {
        boolean b = m22231b(str);
        if (!z) {
            if (!b || (b && z2)) {
                String str6 = str2;
                boolean z3 = z2;
                String str7 = str;
                boolean z4 = z;
                String str8 = str4;
                m22224a(str6, str3, z3, str7, z4, str8);
                m22229b(str6, str5, z3, str7, z4, str8);
            }
        } else if ((!b && str5 != null && !str5.contains("v1/play")) || (z2 && b)) {
            String str9 = str2;
            boolean z5 = z2;
            String str10 = str;
            boolean z6 = z;
            String str11 = str4;
            m22224a(str9, str3, z5, str10, z6, str11);
            m22229b(str9, str5, z5, str10, z6, str11);
        }
        return null;
    }
}
