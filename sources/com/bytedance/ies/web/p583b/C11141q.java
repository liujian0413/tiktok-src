package com.bytedance.ies.web.p583b;

import java.util.List;
import java.util.SortedMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.web.b.q */
public final class C11141q {

    /* renamed from: a */
    public String f30243a;

    /* renamed from: b */
    public String f30244b;

    /* renamed from: c */
    public long f30245c = 20000;

    /* renamed from: d */
    public List<String> f30246d;

    /* renamed from: e */
    public SortedMap<String, String> f30247e;

    /* renamed from: f */
    public SortedMap<String, C11144t> f30248f;

    /* renamed from: g */
    public SortedMap<String, C11144t> f30249g;

    /* renamed from: a */
    public final String mo27120a() {
        String str = this.f30243a;
        if (str == null) {
            C7573i.m23583a("apiUrl");
        }
        return str;
    }

    /* renamed from: b */
    public final String mo27124b() {
        String str = this.f30244b;
        if (str == null) {
            C7573i.m23583a("method");
        }
        return str;
    }

    /* renamed from: c */
    public final List<String> mo27127c() {
        List<String> list = this.f30246d;
        if (list == null) {
            C7573i.m23583a("conditions");
        }
        return list;
    }

    /* renamed from: d */
    public final SortedMap<String, String> mo27129d() {
        SortedMap<String, String> sortedMap = this.f30247e;
        if (sortedMap == null) {
            C7573i.m23583a("headerMap");
        }
        return sortedMap;
    }

    /* renamed from: e */
    public final SortedMap<String, C11144t> mo27130e() {
        SortedMap<String, C11144t> sortedMap = this.f30248f;
        if (sortedMap == null) {
            C7573i.m23583a("paramMap");
        }
        return sortedMap;
    }

    /* renamed from: f */
    public final SortedMap<String, C11144t> mo27131f() {
        SortedMap<String, C11144t> sortedMap = this.f30249g;
        if (sortedMap == null) {
            C7573i.m23583a("dataMap");
        }
        return sortedMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("hashCode: ");
        sb.append(hashCode());
        sb.append(", url: ");
        String str = this.f30243a;
        if (str == null) {
            C7573i.m23583a("apiUrl");
        }
        sb.append(str);
        sb.append(", method: ");
        String str2 = this.f30244b;
        if (str2 == null) {
            C7573i.m23583a("method");
        }
        sb.append(str2);
        sb.append(", expireTimeout: ");
        sb.append(this.f30245c);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo27121a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f30243a = str;
    }

    /* renamed from: b */
    public final void mo27125b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f30244b = str;
    }

    /* renamed from: c */
    public final void mo27128c(SortedMap<String, C11144t> sortedMap) {
        C7573i.m23587b(sortedMap, "<set-?>");
        this.f30249g = sortedMap;
    }

    /* renamed from: a */
    public final void mo27122a(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f30246d = list;
    }

    /* renamed from: b */
    public final void mo27126b(SortedMap<String, C11144t> sortedMap) {
        C7573i.m23587b(sortedMap, "<set-?>");
        this.f30248f = sortedMap;
    }

    /* renamed from: a */
    public final void mo27123a(SortedMap<String, String> sortedMap) {
        C7573i.m23587b(sortedMap, "<set-?>");
        this.f30247e = sortedMap;
    }
}
