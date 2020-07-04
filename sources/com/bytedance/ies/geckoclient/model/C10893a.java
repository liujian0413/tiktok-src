package com.bytedance.ies.geckoclient.model;

import android.os.Build;
import android.os.Build.VERSION;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.model.a */
public final class C10893a {
    @C6593c(mo15949a = "common")

    /* renamed from: a */
    public C10897d f29469a;
    @C6593c(mo15949a = "deployment")

    /* renamed from: b */
    public Map<String, List<C10895b>> f29470b;
    @C6593c(mo15949a = "deployments")

    /* renamed from: c */
    public Map<String, C10896c> f29471c;
    @C6593c(mo15949a = "custom")

    /* renamed from: d */
    public Map<String, Map<String, Object>> f29472d;

    /* renamed from: com.bytedance.ies.geckoclient.model.a$a */
    public static class C10894a {
        @C6593c(mo15949a = "c")

        /* renamed from: a */
        String f29473a;

        public C10894a(String str) {
            this.f29473a = str;
        }
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.a$b */
    public static class C10895b {
        @C6593c(mo15949a = "target_version")

        /* renamed from: a */
        public Integer f29474a;
        @C6593c(mo15949a = "channel")

        /* renamed from: b */
        private String f29475b;
        @C6593c(mo15949a = "local_version")

        /* renamed from: c */
        private int f29476c;

        public C10895b(String str, int i) {
            this.f29475b = str;
            this.f29476c = i;
        }
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.a$c */
    public static class C10896c {
        @C6593c(mo15949a = "channels")

        /* renamed from: a */
        public List<C10894a> f29477a = new ArrayList();
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.a$d */
    public static class C10897d {
        @C6593c(mo15949a = "aid")

        /* renamed from: a */
        private int f29478a;
        @C6593c(mo15949a = "app_version")

        /* renamed from: b */
        private String f29479b;
        @C6593c(mo15949a = "os")

        /* renamed from: c */
        private int f29480c;
        @C6593c(mo15949a = "device_id")

        /* renamed from: d */
        private String f29481d;
        @C6593c(mo15949a = "app_name")

        /* renamed from: e */
        private String f29482e;
        @C6593c(mo15949a = "ac")

        /* renamed from: f */
        private String f29483f;
        @C6593c(mo15949a = "os_version")

        /* renamed from: g */
        private String f29484g;
        @C6593c(mo15949a = "device_model")

        /* renamed from: h */
        private String f29485h = Build.MODEL;
        @C6593c(mo15949a = "device_platform")

        /* renamed from: i */
        private String f29486i = "android";
        @C6593c(mo15949a = "sdk_version")

        /* renamed from: j */
        private String f29487j;

        public C10897d(int i, String str, String str2, String str3, String str4, String str5) {
            StringBuilder sb = new StringBuilder();
            sb.append(VERSION.SDK_INT);
            this.f29484g = sb.toString();
            this.f29478a = i;
            this.f29479b = str;
            this.f29481d = str2;
            this.f29482e = str3;
            this.f29483f = str4;
            this.f29487j = str5;
        }
    }

    /* renamed from: a */
    public final void mo26306a(String str, List<C10895b> list) {
        if (this.f29470b == null) {
            this.f29470b = new HashMap();
        }
        this.f29470b.put(str, list);
    }
}
