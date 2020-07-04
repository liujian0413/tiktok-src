package com.bytedance.ies.web.jsbridge2;

import java.util.Map;
import java.util.concurrent.Executor;

public interface IBridgePermissionConfigurator {

    public enum RegionConfig {
        CN("https://gecko.snssdk.com/gecko/server/v2/package"),
        SG("https://gecko-sg.snssdk.com/gecko/server/v2/package"),
        US("https://gecko-va.snssdk.com/gecko/server/v2/package");
        
        public String url;

        private RegionConfig(String str) {
            this.url = str;
        }
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator$a */
    public interface C11147a {

        /* renamed from: com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator$a$a */
        public interface C11148a {
            /* renamed from: a */
            void mo27149a(String str);
        }

        /* renamed from: a */
        void mo27147a(String str, C11148a aVar);

        /* renamed from: a */
        void mo27148a(String str, String str2);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.IBridgePermissionConfigurator$b */
    public interface C11149b {
        /* renamed from: a */
        void mo27150a(Exception exc);

        /* renamed from: a */
        void mo27151a(String str);
    }

    /* renamed from: a */
    RegionConfig mo27139a();

    /* renamed from: a */
    void mo27140a(String str, Map<String, String> map, String str2, byte[] bArr, C11149b bVar);

    /* renamed from: b */
    int mo27141b();

    /* renamed from: c */
    String mo27142c();

    /* renamed from: d */
    String mo27143d();

    /* renamed from: e */
    String mo27144e();

    /* renamed from: f */
    C11147a mo27145f();

    /* renamed from: g */
    Executor mo27146g();
}
