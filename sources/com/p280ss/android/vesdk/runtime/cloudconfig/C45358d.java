package com.p280ss.android.vesdk.runtime.cloudconfig;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.vesdk.runtime.VERuntime;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.d */
public final class C45358d {

    /* renamed from: a */
    public static C45357c f116830a = new C45355a();

    /* renamed from: b */
    public static final C45361e f116831b = new C45361e();

    /* renamed from: c */
    public static int f116832c = 0;

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.d$a */
    static class C45360a extends AsyncTask<Void, Void, Void> {
        private C45360a() {
        }

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m143370a((Void[]) objArr);
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Void m143370a(java.lang.Void... r2) {
            /*
                com.ss.android.vesdk.runtime.VERuntime r2 = com.p280ss.android.vesdk.runtime.VERuntime.m143285a()     // Catch:{  }
                android.content.Context r2 = r2.f116762a     // Catch:{  }
                java.util.Map r0 = com.p280ss.android.ttve.monitor.C20471b.m67908a()     // Catch:{  }
                java.lang.String r2 = r2.getPackageName()     // Catch:{  }
                java.lang.String r1 = "package_name"
                r0.put(r1, r2)     // Catch:{  }
                java.lang.String r2 = "model"
                java.lang.String r1 = android.os.Build.MODEL     // Catch:{  }
                r0.put(r2, r1)     // Catch:{  }
                java.lang.String r2 = "os_version"
                java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{  }
                r0.put(r2, r1)     // Catch:{  }
                java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{  }
                if (r2 == 0) goto L_0x003d
                java.lang.String r1 = r2.getCountry()     // Catch:{  }
                if (r1 != 0) goto L_0x0030
                java.lang.String r2 = ""
                goto L_0x0034
            L_0x0030:
                java.lang.String r2 = r2.getCountry()     // Catch:{  }
            L_0x0034:
                java.lang.String r1 = "locale"
                java.lang.String r2 = r2.toLowerCase()     // Catch:{  }
                r0.put(r1, r2)     // Catch:{  }
            L_0x003d:
                java.lang.String r2 = "platform"
                java.lang.String r1 = "android"
                r0.put(r2, r1)     // Catch:{  }
                java.lang.String r2 = com.p280ss.android.vesdk.runtime.cloudconfig.C45358d.m143369c()     // Catch:{  }
                r1 = 1
                com.ss.android.vesdk.runtime.cloudconfig.HttpRequest r2 = com.p280ss.android.vesdk.runtime.cloudconfig.HttpRequest.m143318a(r2, r0, r1)     // Catch:{  }
                java.lang.String r2 = r2.mo108565a()     // Catch:{  }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0074 }
                r0.<init>(r2)     // Catch:{ Exception -> 0x0074 }
                com.ss.android.vesdk.runtime.cloudconfig.c r2 = com.p280ss.android.vesdk.runtime.cloudconfig.C45358d.f116830a     // Catch:{ Exception -> 0x0074 }
                if (r2 == 0) goto L_0x006c
                com.ss.android.vesdk.runtime.cloudconfig.c r2 = com.p280ss.android.vesdk.runtime.cloudconfig.C45358d.f116830a     // Catch:{ Exception -> 0x0074 }
                java.util.Map r2 = r2.mo108574a(r0)     // Catch:{ Exception -> 0x0074 }
                if (r2 == 0) goto L_0x0074
                com.ss.android.vesdk.runtime.VERuntime r0 = com.p280ss.android.vesdk.runtime.VERuntime.m143285a()     // Catch:{ Exception -> 0x0074 }
                android.content.Context r0 = r0.f116762a     // Catch:{ Exception -> 0x0074 }
                com.p280ss.android.vesdk.runtime.cloudconfig.C45358d.m143366a(r0, r2)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0074
            L_0x006c:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0074 }
                java.lang.String r0 = "Injector == null. VECloudConfig is not initialized!"
                r2.<init>(r0)     // Catch:{ Exception -> 0x0074 }
                throw r2     // Catch:{ Exception -> 0x0074 }
            L_0x0074:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.runtime.cloudconfig.C45358d.C45360a.m143370a(java.lang.Void[]):java.lang.Void");
        }
    }

    /* renamed from: b */
    public static void m143368b() {
        new C45360a().execute(new Void[0]);
    }

    /* renamed from: a */
    public static void m143365a() {
        if (VERuntime.m143285a().f116762a != null) {
            m143367a(m143364a(VERuntime.m143285a().f116762a));
            return;
        }
        throw new IllegalStateException("Must call VideoSdkCore.init() before.");
    }

    /* renamed from: c */
    public static String m143369c() {
        int i = f116832c;
        if (i == 0) {
            return "https://effect.snssdk.com/devicehub/getSettings?";
        }
        switch (i) {
            case 2:
                return "https://va-effect.byteoversea.com/devicehub/getSettings?";
            case 3:
                return "https://sg-effect.byteoversea.com/devicehub/getSetting?";
            default:
                return "https://effect.snssdk.com/devicehub/getSettings?";
        }
    }

    /* renamed from: a */
    private static void m143367a(Map<String, String> map) {
        if (f116830a != null) {
            f116830a.mo108575a(map, f116831b);
            return;
        }
        throw new IllegalStateException("CompileTimeBUG: Injector == null. VECloudConfig won't be initialized!. Consider specify an IInjector instance before compile code.");
    }

    /* renamed from: a */
    private static Map<String, String> m143364a(Context context) {
        HashMap hashMap = new HashMap();
        for (Entry entry : C7285c.m22838a(context, "ShortVideoConfig", 0).getAll().entrySet()) {
            if (((String) entry.getKey()).startsWith("PerfConfig_")) {
                hashMap.put(((String) entry.getKey()).substring(11), (String) entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m143366a(Context context, Map<String, String> map) {
        if (map != null) {
            Set<Entry> entrySet = map.entrySet();
            Editor edit = C7285c.m22838a(context, "ShortVideoConfig", 0).edit();
            for (Entry entry : entrySet) {
                StringBuilder sb = new StringBuilder("PerfConfig_");
                sb.append((String) entry.getKey());
                edit.putString(sb.toString(), (String) entry.getValue());
            }
            edit.apply();
        }
    }
}
