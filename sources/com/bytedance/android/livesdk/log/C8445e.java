package com.bytedance.android.livesdk.log;

import com.bytedance.android.livesdk.log.p404a.C8416g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.log.e */
public interface C8445e {

    /* renamed from: com.bytedance.android.livesdk.log.e$a */
    public static class C8446a {

        /* renamed from: a */
        public Map<String, String> f23108a = new HashMap();

        /* renamed from: a */
        public static C8446a m25675a() {
            return new C8446a();
        }

        /* renamed from: a */
        public final C8446a mo21610a(Map<String, String> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            this.f23108a.putAll(map);
            return this;
        }

        /* renamed from: a */
        public final C8446a mo21611a(JSONObject jSONObject) {
            this.f23108a.put("ad_extra_data", jSONObject.toString());
            return this;
        }

        /* renamed from: a */
        private C8446a m25676a(String str, C8416g gVar) {
            this.f23108a.put(str, C8447f.m25681a(str, gVar));
            return this;
        }

        /* renamed from: a */
        public final C8446a mo21608a(C8416g gVar, String... strArr) {
            if (strArr.length <= 0) {
                return this;
            }
            for (String a : strArr) {
                m25676a(a, gVar);
            }
            return this;
        }

        /* renamed from: a */
        public final C8446a mo21609a(String str, String str2) {
            this.f23108a.put(str, str2);
            return this;
        }
    }
}
