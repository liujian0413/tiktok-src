package com.bytedance.android.p089a.p099b.p101b;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.p095e.C2222b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.c */
public final class C2249c {

    /* renamed from: a */
    public C2250a f7502a;

    /* renamed from: b */
    public String f7503b;

    /* renamed from: c */
    public String f7504c;

    /* renamed from: d */
    public Map<String, List<String>> f7505d;

    /* renamed from: e */
    public final C2222b f7506e;

    /* renamed from: com.bytedance.android.a.b.b.c$a */
    public static final class C2250a {

        /* renamed from: a */
        public String f7507a;

        /* renamed from: b */
        public String f7508b;

        /* renamed from: c */
        public Map<String, List<String>> f7509c;

        /* renamed from: d */
        public C2222b f7510d;

        /* renamed from: a */
        public final C2249c mo7987a() {
            return new C2249c(this);
        }

        /* renamed from: a */
        public final C2250a mo7984a(C2222b bVar) {
            this.f7510d = bVar;
            return this;
        }

        /* renamed from: b */
        public final C2250a mo7988b(String str) {
            this.f7508b = str;
            return this;
        }

        /* renamed from: a */
        public final C2250a mo7985a(String str) {
            this.f7507a = str;
            return this;
        }

        /* renamed from: a */
        private C2250a m9659a(String str, List<String> list) {
            if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
                return this;
            }
            if (this.f7509c == null) {
                this.f7509c = new HashMap();
            }
            this.f7509c.put(str, list);
            return this;
        }

        /* renamed from: a */
        public final C2250a mo7986a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return this;
            }
            if (this.f7509c == null) {
                this.f7509c = new HashMap();
            }
            m9659a(str, Collections.singletonList(str2));
            return this;
        }
    }

    public C2249c(C2250a aVar) {
        this.f7502a = aVar;
        this.f7503b = aVar.f7507a;
        this.f7504c = aVar.f7508b;
        this.f7505d = aVar.f7509c;
        this.f7506e = aVar.f7510d;
    }
}
