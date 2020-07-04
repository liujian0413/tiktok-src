package com.bytedance.frameworks.baselib.network.http.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.j */
public final class C10190j {

    /* renamed from: a */
    public final Map<String, List<String>> f27724a;

    /* renamed from: b */
    public String f27725b;

    public final String toString() {
        return mo24886a();
    }

    public C10190j() {
        this.f27724a = new LinkedHashMap();
        this.f27725b = null;
    }

    /* renamed from: a */
    public final String mo24886a() {
        if (this.f27724a.isEmpty()) {
            return this.f27725b;
        }
        String a = C10191k.m30272a(this.f27724a, "UTF-8");
        if (this.f27725b == null || this.f27725b.length() == 0) {
            return a;
        }
        if (this.f27725b.indexOf(63) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27725b);
            sb.append("&");
            sb.append(a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27725b);
        sb2.append("?");
        sb2.append(a);
        return sb2.toString();
    }

    public C10190j(String str) {
        this.f27724a = new LinkedHashMap();
        this.f27725b = str;
    }

    /* renamed from: a */
    public final void mo24887a(String str, double d) {
        List list = (List) this.f27724a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(d));
        this.f27724a.put(str, list);
    }

    /* renamed from: a */
    public final void mo24888a(String str, int i) {
        List list = (List) this.f27724a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add("1");
        this.f27724a.put(str, list);
    }

    /* renamed from: a */
    public final void mo24889a(String str, long j) {
        List list = (List) this.f27724a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(j));
        this.f27724a.put(str, list);
    }

    /* renamed from: a */
    public final void mo24890a(String str, String str2) {
        List list = (List) this.f27724a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(str2));
        this.f27724a.put(str, list);
    }
}
