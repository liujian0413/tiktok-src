package com.bytedance.sdk.account.p659c;

import android.text.TextUtils;
import com.p280ss.android.account.C18895c;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.sdk.account.c.a */
public final class C12790a {

    /* renamed from: a */
    public final String f33835a;

    /* renamed from: b */
    public final String f33836b;

    /* renamed from: c */
    public final Map<String, String> f33837c;

    /* renamed from: com.bytedance.sdk.account.c.a$a */
    public static class C12791a {

        /* renamed from: a */
        private String f33838a;

        /* renamed from: b */
        private String f33839b;

        /* renamed from: c */
        private Map<String, String> f33840c;

        /* renamed from: b */
        public final C12790a mo31347b() {
            this.f33839b = "get";
            return new C12790a(this.f33838a, this.f33839b, this.f33840c);
        }

        /* renamed from: c */
        public final C12790a mo31348c() {
            this.f33839b = "post";
            return new C12790a(this.f33838a, this.f33839b, this.f33840c);
        }

        /* renamed from: a */
        public final C12791a mo31342a() {
            if (this.f33840c == null) {
                this.f33840c = new HashMap();
            }
            if (C18895c.m61668a().mo50932d()) {
                this.f33840c.put("multi_login", "1");
            }
            return this;
        }

        /* renamed from: a */
        public final C12791a mo31343a(String str) {
            this.f33838a = str;
            return this;
        }

        /* renamed from: a */
        public final C12791a mo31345a(Map<String, String> map) {
            if (this.f33840c == null) {
                this.f33840c = map;
            } else if (map != null) {
                for (Entry entry : map.entrySet()) {
                    this.f33840c.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C12791a mo31344a(String str, String str2) {
            if (this.f33840c == null) {
                this.f33840c = new HashMap();
            }
            this.f33840c.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C12791a mo31346a(Map<String, String> map, Map<String, String> map2) {
            if (this.f33840c == null) {
                this.f33840c = new HashMap();
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    this.f33840c.put(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                for (String str : map2.keySet()) {
                    if (!TextUtils.isEmpty(str) && map2.get(str) != null) {
                        this.f33840c.put(str, map2.get(str));
                    }
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public final String mo31341a(String str) {
        if (this.f33837c == null) {
            return null;
        }
        return (String) this.f33837c.get(str);
    }

    public C12790a(String str, String str2, Map<String, String> map) {
        this.f33835a = str;
        this.f33836b = str2;
        this.f33837c = map;
    }
}
