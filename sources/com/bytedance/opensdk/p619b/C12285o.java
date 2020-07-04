package com.bytedance.opensdk.p619b;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.opensdk.b.o */
public final class C12285o {

    /* renamed from: a */
    private final LinkedHashMap<String, List<String>> f32624a = new LinkedHashMap<>();

    /* renamed from: b */
    private final String f32625b;

    public final String toString() {
        return mo30089a();
    }

    /* renamed from: a */
    public final String mo30089a() {
        boolean z;
        if (this.f32624a.isEmpty()) {
            return this.f32625b;
        }
        String a = C12286p.f32626a.mo30091a((Map<String, ? extends List<String>>) this.f32624a, C12286p.m35721a());
        if (this.f32625b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a;
        }
        if (C7634n.m23726a((CharSequence) this.f32625b, '?', 0, false, 6, (Object) null) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32625b);
            sb.append('&');
            sb.append(a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32625b);
        sb2.append('?');
        sb2.append(a);
        return sb2.toString();
    }

    public C12285o(String str) {
        C7573i.m23587b(str, "mUrl");
        this.f32625b = str;
    }

    /* renamed from: a */
    public final C12285o mo30087a(String str, int i) {
        C7573i.m23587b(str, "name");
        List list = (List) this.f32624a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(i));
        this.f32624a.put(str, list);
        return this;
    }

    /* renamed from: a */
    public final C12285o mo30088a(String str, String str2) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(str2, "value");
        List list = (List) this.f32624a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(str2);
        this.f32624a.put(str, list);
        return this;
    }
}
