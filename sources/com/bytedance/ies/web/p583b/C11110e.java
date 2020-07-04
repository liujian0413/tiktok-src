package com.bytedance.ies.web.p583b;

import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.e */
public interface C11110e {

    /* renamed from: com.bytedance.ies.web.b.e$a */
    public interface C11111a {
        /* renamed from: a */
        void mo27089a(C11112b bVar);

        /* renamed from: a */
        void mo27090a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.web.b.e$b */
    public static final class C11112b {

        /* renamed from: a */
        public Map<String, String> f30189a;

        /* renamed from: b */
        public byte[] f30190b;

        /* renamed from: a */
        public final Map<String, String> mo27091a() {
            Map<String, String> map = this.f30189a;
            if (map == null) {
                C7573i.m23583a("headerMap");
            }
            return map;
        }

        /* renamed from: b */
        public final byte[] mo27094b() {
            byte[] bArr = this.f30190b;
            if (bArr == null) {
                C7573i.m23583a("body");
            }
            return bArr;
        }

        /* renamed from: a */
        public final void mo27092a(Map<String, String> map) {
            C7573i.m23587b(map, "<set-?>");
            this.f30189a = map;
        }

        /* renamed from: a */
        public final void mo27093a(byte[] bArr) {
            C7573i.m23587b(bArr, "<set-?>");
            this.f30190b = bArr;
        }
    }

    /* renamed from: a */
    void mo11522a(String str, Map<String, String> map, C11111a aVar);

    /* renamed from: a */
    void mo11523a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C11111a aVar);
}
