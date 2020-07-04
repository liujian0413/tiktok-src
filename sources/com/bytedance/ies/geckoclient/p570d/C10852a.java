package com.bytedance.ies.geckoclient.p570d;

import android.util.Pair;
import com.C1642a;
import com.bytedance.ies.geckoclient.debug.NetWorkAnalyze;
import com.bytedance.ies.geckoclient.debug.NetWorkAnalyze.Session;
import com.bytedance.ies.geckoclient.model.C10902c;
import com.bytedance.ies.geckoclient.model.C10905f;
import com.bytedance.ies.geckoclient.model.C10912k;
import com.bytedance.ies.geckoclient.p568b.C10848b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ies.geckoclient.d.a */
public final class C10852a {

    /* renamed from: a */
    public String f29370a = "gecko.snssdk.com/";

    /* renamed from: b */
    private C10902c f29371b;

    public C10852a(C10902c cVar) {
        this.f29371b = cVar;
    }

    /* renamed from: a */
    public final String mo26176a(C10912k kVar) throws Exception {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(this.f29370a);
        sb.append("gecko/server/packages/stats");
        return C10854c.m31840b().f29373a.mo26179a(sb.toString(), C10848b.m31813a().f29368a.mo15979b((Object) kVar));
    }

    /* renamed from: a */
    public final void mo26178a(String str) {
        if (!str.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            str = sb.toString();
        }
        this.f29370a = str;
    }

    /* renamed from: a */
    public final void mo26177a(C10905f fVar) throws Exception {
        if (fVar != null) {
            StringBuilder sb = new StringBuilder("https://");
            sb.append(this.f29370a);
            sb.append(C1642a.m8034a("gecko/server/push_task/%s/stats", new Object[]{Long.valueOf(fVar.f29523a)}));
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Pair.create("msg_type", "2"));
            arrayList.add(Pair.create("device_id", this.f29371b.f29504c));
            arrayList.add(Pair.create("os", "0"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(fVar.f29526d);
            arrayList.add(Pair.create("status", sb3.toString()));
            arrayList.add(Pair.create("app_version", this.f29371b.f29503b));
            arrayList.add(Pair.create("sdk_version", fVar.f29529g));
            arrayList.add(Pair.create("device_model", fVar.f29530h));
            C10854c.m31840b().f29373a.mo26180a(sb2, (List<Pair<String, String>>) arrayList);
        }
    }

    /* renamed from: a */
    public static void m31829a(long j, TimeUnit timeUnit) {
        C10855d.m31841a(j, timeUnit);
    }

    /* renamed from: b */
    public static void m31830b(long j, TimeUnit timeUnit) {
        C10855d.m31843b(j, timeUnit);
    }

    /* renamed from: a */
    public static String m31828a(String str, String str2) throws Exception {
        Session a = NetWorkAnalyze.m31847a().mo26183a(str, str2);
        try {
            String a2 = C10854c.m31840b().f29373a.mo26179a(str, str2);
            a.mo26189c(a2);
            return a2;
        } catch (Exception e) {
            a.mo26187a((Throwable) e);
            throw e;
        }
    }

    /* renamed from: b */
    public static boolean m31831b(String str, String str2) throws Exception {
        Session a = NetWorkAnalyze.m31847a().mo26182a(str);
        try {
            boolean b = C10854c.m31840b().f29373a.mo26181b(str, str2);
            StringBuilder sb = new StringBuilder("下载成功 path:");
            sb.append(str2);
            a.mo26189c(sb.toString());
            return b;
        } catch (Exception e) {
            a.mo26187a((Throwable) e);
            StringBuilder sb2 = new StringBuilder("download failed, reason:");
            sb2.append(e.getMessage());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
