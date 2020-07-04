package com.bytedance.frameworks.baselib.network.http.impl;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.a */
public final class C10156a extends CookieManager {

    /* renamed from: a */
    private C10161c f27661a;

    /* renamed from: b */
    private C10157b f27662b;

    public C10156a() {
        this(null, null);
    }

    /* renamed from: a */
    private static String m30157a(String str) {
        if (str == null) {
            return "/";
        }
        return str.substring(0, str.lastIndexOf(47) + 1);
    }

    /* renamed from: a */
    private static List<C10163e> m30158a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2"))) {
                for (String a : (List) entry.getValue()) {
                    try {
                        for (C10163e add : C10163e.m30169a(a)) {
                            arrayList.add(add);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, List<String>> m30159a(List<C10163e> list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C10163e eVar : list) {
            i = Math.min(i, eVar.f27683l);
        }
        if (i == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(((C10163e) list.get(0)).toString());
        for (int i2 = 1; i2 < list.size(); i2++) {
            sb.append("; ");
            sb.append(((C10163e) list.get(i2)).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    public C10156a(C10161c cVar, C10157b bVar) {
        if (cVar == null) {
            cVar = new C10162d();
        }
        this.f27661a = cVar;
        if (bVar == null) {
            bVar = C10157b.f27665c;
        }
        this.f27662b = bVar;
    }

    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (C10163e eVar : this.f27661a.mo24834a(uri)) {
            if (C10163e.m30171a(eVar, uri) && C10163e.m30175b(eVar, uri) && C10163e.m30177c(eVar, uri)) {
                arrayList.add(eVar);
            }
        }
        return m30159a((List<C10163e>) arrayList);
    }

    public final void put(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        for (C10163e eVar : m30158a(map)) {
            if (eVar.f27675d == null) {
                eVar.mo24839b(uri.getHost());
            }
            if (eVar.f27678g == null) {
                eVar.f27678g = m30157a(uri.getPath());
            } else if (!C10163e.m30171a(eVar, uri)) {
            }
            if ("".equals(eVar.f27679h)) {
                eVar.f27679h = Integer.toString(SerializableHttpCookie.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (eVar.f27679h != null && !C10163e.m30177c(eVar, uri)) {
            }
            if (this.f27662b.mo24833a(uri, eVar)) {
                this.f27661a.mo24835a(uri, eVar);
            }
        }
    }
}
