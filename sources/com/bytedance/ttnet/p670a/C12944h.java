package com.bytedance.ttnet.p670a;

import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ttnet.utils.C13006h;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.a.h */
public class C12944h {

    /* renamed from: a */
    private static volatile C12944h f34265a;

    /* renamed from: a */
    public static C12944h m37720a() {
        if (f34265a == null) {
            synchronized (C12944h.class) {
                if (f34265a == null) {
                    f34265a = new C12944h();
                }
            }
        }
        return f34265a;
    }

    /* renamed from: a */
    private static List<String> m37721a(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        if (C6319n.m19593a(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",")) {
            if (!C6319n.m19593a(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m37722a(List<String> list) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        for (String split2 : list) {
            for (String str : split2.split(";")) {
                if (!C6319n.m19593a(str)) {
                    arrayList.add(str.trim());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo31455a(final String str, final String str2) {
        if (!str2.equals(str)) {
            new C6304f("Sync-Cookie") {
                public final void run() {
                    C12944h.this.mo31456b(str, str2);
                }
            }.start();
        }
    }

    /* renamed from: b */
    public final void mo31456b(String str, String str2) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler != null) {
            List a = m37721a(str);
            List<String> a2 = m37721a(str2);
            ArrayList arrayList = new ArrayList();
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (String str3 : a2) {
                if (C13006h.m37955a(str3, a)) {
                    arrayList.add(str3);
                } else {
                    arrayList2.add(str3);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList.isEmpty()) {
                    arrayList = arrayList2;
                }
                Map hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str4 = (String) it.next();
                    try {
                        StringBuilder sb = new StringBuilder("http://");
                        sb.append(str4);
                        sb.append("/");
                        Map map = cookieHandler.get(new URI(sb.toString()), null);
                        try {
                            if (map.size() > 0) {
                                hashMap = map;
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                        hashMap = map;
                    } catch (Throwable unused2) {
                    }
                }
                if (hashMap != null && !hashMap.isEmpty()) {
                    List list = (List) hashMap.get("Cookie");
                    if (list == null || list.isEmpty()) {
                        list = (List) hashMap.get("cookie");
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    List<String> a3 = m37722a(list);
                    for (String str5 : arrayList2) {
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            StringBuilder sb2 = new StringBuilder("http://");
                            sb2.append(str5);
                            sb2.append("/");
                            URI uri = new URI(sb2.toString());
                            for (String str6 : a3) {
                                if (!C6319n.m19593a(str6)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str6);
                                    sb3.append("; Domain=");
                                    sb3.append(str5);
                                    arrayList3.add(sb3.toString());
                                }
                            }
                            linkedHashMap.put("Set-Cookie", arrayList3);
                            cookieHandler.put(uri, linkedHashMap);
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
