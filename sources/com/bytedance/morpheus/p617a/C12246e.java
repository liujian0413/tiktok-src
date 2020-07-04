package com.bytedance.morpheus.p617a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.morpheus.a.e */
class C12246e {

    /* renamed from: c */
    private static volatile C12246e f32557c;

    /* renamed from: a */
    private final Map<String, String> f32558a = new HashMap();

    /* renamed from: b */
    private final Map<String, String> f32559b = new HashMap();

    private C12246e() {
    }

    /* renamed from: a */
    public static C12246e m35620a() {
        if (f32557c == null) {
            synchronized (C12246e.class) {
                if (f32557c == null) {
                    f32557c = new C12246e();
                }
            }
        }
        return f32557c;
    }

    /* renamed from: a */
    public final String mo30004a(String str) {
        String str2 = (String) this.f32558a.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    /* renamed from: b */
    public final String mo30006b(String str) {
        String str2 = (String) this.f32559b.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo30005a(String str, String str2) {
        if (this.f32558a.containsKey(str)) {
            StringBuilder sb = new StringBuilder("duplicate config for package name ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f32559b.containsKey(str2)) {
            this.f32558a.put(str, str2);
            this.f32559b.put(str2, str);
        } else {
            StringBuilder sb2 = new StringBuilder("duplicate config for aab name ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
