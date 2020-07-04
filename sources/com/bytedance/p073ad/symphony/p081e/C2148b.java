package com.bytedance.p073ad.symphony.p081e;

import com.bytedance.p073ad.symphony.util.SafeConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.e.b */
public final class C2148b {

    /* renamed from: a */
    public String f7299a;

    /* renamed from: b */
    public String f7300b;

    /* renamed from: c */
    public int f7301c;

    /* renamed from: d */
    public long f7302d;

    /* renamed from: e */
    public JSONObject f7303e;

    /* renamed from: f */
    public ConcurrentHashMap<String, Object> f7304f;

    /* renamed from: g */
    public String f7305g;

    /* renamed from: com.bytedance.ad.symphony.e.b$a */
    public static class C2150a {

        /* renamed from: a */
        String f7306a;

        /* renamed from: b */
        String f7307b;

        /* renamed from: c */
        int f7308c;

        /* renamed from: a */
        public final C2148b mo7832a() {
            return new C2148b(this);
        }

        /* renamed from: a */
        public final C2150a mo7830a(int i) {
            this.f7308c = i;
            return this;
        }

        /* renamed from: b */
        public final C2150a mo7833b(String str) {
            this.f7307b = str;
            return this;
        }

        /* renamed from: a */
        public final C2150a mo7831a(String str) {
            this.f7306a = str;
            return this;
        }
    }

    /* renamed from: a */
    public final ConcurrentHashMap<String, Object> mo7829a() {
        if (this.f7304f == null) {
            this.f7304f = new SafeConcurrentHashMap(32);
        }
        return this.f7304f;
    }

    private C2148b(C2150a aVar) {
        this.f7299a = aVar.f7306a;
        this.f7300b = aVar.f7307b;
        this.f7301c = aVar.f7308c;
    }
}
