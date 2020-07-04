package com.p280ss.sys.p1806ck;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.c */
public final class C45991c {

    /* renamed from: a */
    private static Map<String, HashMap<String, Method>> f117533a = new HashMap();

    /* renamed from: a */
    private static HashMap<String, Method> m144187a(Class cls) {
        Method[] declaredMethods;
        HashMap<String, Method> hashMap = new HashMap<>();
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getModifiers() == 9) {
                String name = method.getName();
                if (name != null) {
                    Class<C45992d>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0] == WebView.class && parameterTypes[1] == JSONObject.class && parameterTypes[2] == C45992d.class) {
                        hashMap.put(name, method);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m144188a(String str, Class<?> cls) {
        if (!f117533a.containsKey(str)) {
            try {
                f117533a.put(str, m144187a(cls));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m144189a(WebView webView, String str) {
        String str2 = "";
        String str3 = "";
        String str4 = "{}";
        String str5 = "";
        if (!TextUtils.isEmpty(str) && str.startsWith("jsbridge")) {
            try {
                Uri parse = Uri.parse(str);
                str3 = parse.getHost();
                str4 = parse.getQuery();
                StringBuilder sb = new StringBuilder();
                sb.append(parse.getPort());
                str5 = sb.toString();
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path)) {
                    str2 = path.replace("/", "");
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        if (f117533a.containsKey(str3)) {
            HashMap hashMap = (HashMap) f117533a.get(str3);
            if (!(hashMap == null || hashMap.size() == 0 || !hashMap.containsKey(str2))) {
                Method method = (Method) hashMap.get(str2);
                if (!(method == null || webView == null)) {
                    try {
                        method.invoke(null, new Object[]{webView, new JSONObject(str4), new C45992d(webView, str5)});
                        return true;
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return false;
    }
}
