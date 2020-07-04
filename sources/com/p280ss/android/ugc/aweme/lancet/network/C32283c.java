package com.p280ss.android.ugc.aweme.lancet.network;

import android.text.TextUtils;
import android.webkit.CookieManager;
import bolts.C1592h;
import com.bytedance.frameworks.baselib.network.http.impl.SerializableHttpCookie;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.p670a.C12925a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.taobao.android.dexposed.ClassUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.lancet.network.c */
public final class C32283c {

    /* renamed from: a */
    public static List<String> f84348a;

    /* renamed from: b */
    public static Map<URI, Set<SerializableHttpCookie>> f84349b = new ConcurrentHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        f84348a = arrayList;
        arrayList.add("sessionid");
        f84348a.add("sid_tt");
        f84348a.add("sid_guard");
        f84348a.add("uid_tt");
    }

    /* renamed from: a */
    public static void m104805a(final String str) {
        if (!TextUtils.isEmpty(str) && C6861a.m21337f().isLogin()) {
            C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    int i;
                    String str;
                    String str2;
                    String str3;
                    if (str.startsWith("http://") || str.startsWith("https://")) {
                        String b = C32283c.m104807b(URI.create(str).getHost());
                        C12925a a = C12925a.m37625a(C6399b.m19921a());
                        StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
                        sb.append(b);
                        List<String> d = a.mo24814d(sb.toString());
                        StringBuilder sb2 = new StringBuilder("checkCookie hosts size = ");
                        int i2 = 0;
                        if (d == null) {
                            i = 0;
                        } else {
                            i = d.size();
                        }
                        sb2.append(i);
                        if (d == null || d.isEmpty()) {
                            return null;
                        }
                        if (CookieManager.getInstance() != null) {
                            str = CookieManager.getInstance().getCookie(str);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            StringBuilder sb3 = new StringBuilder();
                            for (String str4 : C32283c.f84348a) {
                                if (str.contains(str4)) {
                                    i2++;
                                    sb3.append(str4);
                                    sb3.append(';');
                                }
                            }
                            if (i2 >= C32283c.f84348a.size()) {
                                return null;
                            }
                            str2 = sb3.toString();
                        } else {
                            str2 = "";
                        }
                        StringBuilder sb4 = new StringBuilder();
                        for (String append : d) {
                            sb4.append(append);
                            sb4.append(";");
                        }
                        String sb5 = sb4.toString();
                        if (C32283c.f84349b == null) {
                            str3 = "";
                        } else {
                            Map<URI, Set<SerializableHttpCookie>> map = C32283c.f84349b;
                            StringBuilder sb6 = new StringBuilder("http://");
                            sb6.append(b);
                            sb6.append("/");
                            Set<SerializableHttpCookie> set = (Set) map.get(URI.create(sb6.toString()));
                            if (set == null || set.isEmpty()) {
                                str3 = "";
                            } else {
                                StringBuilder sb7 = new StringBuilder();
                                for (SerializableHttpCookie serializableHttpCookie : set) {
                                    if (!(serializableHttpCookie == null || serializableHttpCookie.getHttpCookie() == null)) {
                                        sb7.append(serializableHttpCookie.getHttpCookie().f27677f);
                                        sb7.append(";");
                                    }
                                }
                                str3 = sb7.toString();
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("host", sb5);
                            jSONObject.put("error_desc", str3);
                            jSONObject.put("uri", str);
                            jSONObject.put(C22704b.f60415d, str2);
                        } catch (JSONException unused) {
                        }
                        C6379c.m19826a("cookie_error", jSONObject);
                    }
                    return null;
                }
            }, (Executor) C7258h.m22732e());
        }
    }

    /* renamed from: b */
    public static String m104807b(String str) {
        int length = str.length() - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (length < 0) {
                length = 0;
                break;
            }
            if (str.charAt(length) == '.') {
                if (i2 == 1) {
                    break;
                }
                i2++;
            }
            length--;
        }
        if (length > 0) {
            i = length + 1;
        }
        return str.substring(i);
    }

    /* renamed from: a */
    public static void m104806a(Map<URI, Set<SerializableHttpCookie>> map) {
        f84349b.clear();
        for (Entry entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((Set) entry.getValue()).size() <= 0)) {
                HashSet hashSet = new HashSet();
                for (SerializableHttpCookie add : (Set) entry.getValue()) {
                    hashSet.add(add);
                }
                f84349b.put(entry.getKey(), hashSet);
            }
        }
    }
}
