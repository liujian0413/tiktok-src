package com.p280ss.sys.ces.p1805gg;

import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10143a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.p811a.p813b.C18881a;
import com.p280ss.p811a.p813b.C18885d;
import com.p280ss.sys.ces.C45928a;
import com.p280ss.sys.ces.out.StcSDKFactory;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.sys.ces.gg.tt */
public class C45959tt {

    /* renamed from: a */
    private static boolean f117465a;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m144129d(String str) {
        int indexOf = str.indexOf("?");
        int indexOf2 = str.indexOf("#");
        if (indexOf == -1) {
            return null;
        }
        if (indexOf2 == -1) {
            return str.substring(indexOf + 1);
        }
        if (indexOf2 < indexOf) {
            return null;
        }
        return str.substring(indexOf + 1, indexOf2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m144130e(String str) {
        String[] split;
        for (String str2 : str.replace(" ", "").split(",")) {
            int indexOf = str2.indexOf("sessionid=");
            if (indexOf != -1) {
                return str2.substring(indexOf + 10);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m144131f(String str) {
        return false;
    }

    public static void init_gorgon() {
        C10142f.m30103a((C10143a) new C10143a() {
            /* renamed from: a */
            public final Map<String, String> mo24803a(String str, Map<String, List<String>> map) {
                HashMap hashMap = new HashMap();
                Calendar.getInstance().getTimeInMillis();
                String str2 = "";
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                try {
                    if (!str.toLowerCase().contains(WebKitApi.SCHEME_HTTP)) {
                        if (!str.toLowerCase().contains(WebKitApi.SCHEME_HTTPS)) {
                            throw new NullPointerException("nein http/https");
                        }
                    }
                    if (str.toLowerCase().contains("x-khronos")) {
                        if (str.toLowerCase().contains("x-gorgon")) {
                            throw new NullPointerException("it had");
                        }
                    }
                    if (!C45959tt.m144131f(str)) {
                        String b = C45959tt.m144129d(str);
                        String str3 = null;
                        String a = (b == null || b.length() <= 0) ? null : C18885d.m61646a(b);
                        String str4 = null;
                        String str5 = null;
                        int i = -1;
                        for (Entry entry : map.entrySet()) {
                            if (((String) entry.getKey()).toUpperCase().contains("X-SS-STUB")) {
                                str3 = (String) ((List) entry.getValue()).get(0);
                            }
                            if (((String) entry.getKey()).toUpperCase().contains("COOKIE")) {
                                String str6 = (String) ((List) entry.getValue()).get(0);
                                if (str6 != null && str6.length() > 0) {
                                    str4 = C18885d.m61646a(str6);
                                    String c = C45959tt.m144130e(str6);
                                    if (c != null && c.length() > 0) {
                                        str5 = C18885d.m61646a(c);
                                        StcSDKFactory.getInstance().setSession(c);
                                    }
                                }
                            }
                            if (((String) entry.getKey()).toUpperCase().contains("META-SHADOWMAZE")) {
                                String str7 = (String) ((List) entry.getValue()).get(0);
                                if (str7 != null && str7.length() > 0 && Integer.parseInt(str7) == 1) {
                                    i = 1;
                                }
                            }
                        }
                        if (a == null || a.length() <= 0) {
                            a = "00000000000000000000000000000000";
                        }
                        if (str3 == null || str3.length() <= 0) {
                            str3 = "00000000000000000000000000000000";
                        }
                        if (str4 == null || str4.length() <= 0) {
                            str4 = "00000000000000000000000000000000";
                        }
                        if (str5 == null || str5.length() <= 0) {
                            str5 = "00000000000000000000000000000000";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(a);
                        sb.append(str3);
                        sb.append(str4);
                        sb.append(str5);
                        String a2 = C18881a.m61632a(C45928a.leviathan(i, currentTimeMillis, C18881a.m61633a(sb.toString())));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        hashMap.put("X-Khronos", sb2.toString());
                        hashMap.put("X-Gorgon", a2);
                        Calendar.getInstance().getTimeInMillis();
                        return hashMap;
                    }
                    throw new NullPointerException("filter_1");
                } catch (Throwable th) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(currentTimeMillis);
                    hashMap.put("X-Khronos", sb3.toString());
                    hashMap.put("X-Gorgon", str2);
                    Calendar.getInstance().getTimeInMillis();
                    throw th;
                }
            }
        });
    }
}
