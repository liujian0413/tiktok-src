package com.bytedance.retrofit2.p637a;

import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.a.d */
public final class C12464d {

    /* renamed from: a */
    public final String f33118a;

    /* renamed from: b */
    public final int f33119b;

    /* renamed from: c */
    public final String f33120c;

    /* renamed from: d */
    public final List<C12461b> f33121d;

    /* renamed from: e */
    public final TypedInput f33122e;

    /* renamed from: f */
    public Object f33123f;

    /* renamed from: a */
    public final boolean mo30451a() {
        if (this.f33119b < 200 || this.f33119b >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C12461b mo30450a(String str) {
        if (this.f33121d == null) {
            return null;
        }
        for (C12461b bVar : this.f33121d) {
            if (str.equalsIgnoreCase(bVar.f33095a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final List<C12461b> mo30452b(String str) {
        ArrayList arrayList = null;
        if (str == null || this.f33121d == null) {
            return null;
        }
        for (C12461b bVar : this.f33121d) {
            if (str.equalsIgnoreCase(bVar.f33095a)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public C12464d(String str, int i, String str2, List<C12461b> list, TypedInput typedInput) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        } else if (i < 200) {
            StringBuilder sb = new StringBuilder("Invalid status code: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        } else if (list != null) {
            this.f33118a = str;
            this.f33119b = i;
            this.f33120c = str2;
            this.f33121d = Collections.unmodifiableList(new ArrayList(list));
            this.f33122e = typedInput;
        } else {
            throw new IllegalArgumentException("headers == null");
        }
    }
}
