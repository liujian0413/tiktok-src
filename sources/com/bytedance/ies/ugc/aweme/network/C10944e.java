package com.bytedance.ies.ugc.aweme.network;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import bolts.C1592h;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10108b;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10108b.C10111a;
import com.bytedance.ies.net.p573a.C10920a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.p670a.C12925a;
import com.bytedance.ttnet.utils.C13003f;
import com.bytedance.ttnet.utils.C13003f.C13004a;
import com.google.gson.C6600e;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.corenet.C34057b;
import com.p280ss.android.ugc.aweme.net.corenet.C34059d;
import com.p280ss.android.ugc.aweme.utils.GsonProvider;
import java.util.concurrent.Callable;
import javax.net.ssl.X509TrustManager;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import okhttp3.OkHttpClient.Builder;
import org.chromium.C48316e;
import org.chromium.C48317f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.aweme.network.e */
public final class C10944e {

    /* renamed from: a */
    public static final C10944e f29612a = new C10944e();

    /* renamed from: b */
    private static final Object f29613b = new Object();

    /* renamed from: c */
    private static volatile boolean f29614c;

    /* renamed from: d */
    private static C10948f f29615d;

    /* renamed from: com.bytedance.ies.ugc.aweme.network.e$a */
    static final class C10945a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10948f f29616a;

        /* renamed from: b */
        final /* synthetic */ C10963h f29617b;

        C10945a(C10948f fVar, C10963h hVar) {
            this.f29616a = fVar;
            this.f29617b = hVar;
        }

        public final /* synthetic */ Object call() {
            m32121a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m32121a() {
            C12961d.m37787c();
            C10944e.f29612a.mo26436b(this.f29616a, this.f29617b);
            C10944e.m32117d();
            C10963h hVar = this.f29617b;
            if (hVar != null) {
                hVar.mo18661d(this.f29616a);
            }
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.e$b */
    static final class C10946b implements C10111a {

        /* renamed from: a */
        public static final C10946b f29618a = new C10946b();

        C10946b() {
        }

        /* renamed from: a */
        public final void mo24768a(Builder builder) {
            X509TrustManager lVar = new C10967l();
            builder.sslSocketFactory(new C10964i(lVar), lVar);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.e$c */
    public static final class C10947c implements C13004a {
        C10947c() {
        }

        /* renamed from: a */
        public final void mo26438a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
            C7573i.m23587b(str, "tag");
            C7573i.m23587b(str2, "url");
            C7573i.m23587b(jSONObject, "extraJson");
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tag", str);
                jSONObject2.put("url", str2);
                jSONObject2.put("value", i);
                jSONObject2.put("ext_value", z ? 1 : 0);
                jSONObject2.put("extraObject", jSONObject);
                C6759a.m20910a("set_cookie", jSONObject2);
            } catch (Throwable unused) {
            }
        }
    }

    private C10944e() {
    }

    /* renamed from: b */
    public static final C10948f m32115b() {
        return f29615d;
    }

    /* renamed from: d */
    public static void m32117d() {
        synchronized (f29613b) {
            f29614c = true;
            f29613b.notifyAll();
        }
    }

    /* renamed from: e */
    private static boolean m32118e() {
        if (VERSION.SDK_INT <= 19) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final C6600e m32113a() {
        Object service = ServiceManager.get().getService(GsonProvider.class);
        C7573i.m23582a(service, "ServiceManager.get().get…GsonProvider::class.java)");
        C6600e gson = ((GsonProvider) service).getGson();
        C7573i.m23582a((Object) gson, "ServiceManager.get().get…rovider::class.java).gson");
        return gson;
    }

    /* renamed from: c */
    public static final void m32116c() {
        if (!f29614c) {
            synchronized (f29613b) {
                if (!f29614c) {
                    try {
                        f29613b.wait();
                        f29614c = true;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private static boolean m32119f() {
        String str;
        try {
            if (VERSION.SDK_INT == 18) {
                return true;
            }
            if (VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
                C7573i.m23582a((Object) str, "Build.CPU_ABI");
            } else {
                str = Build.SUPPORTED_ABIS[0];
                C7573i.m23582a((Object) str, "Build.SUPPORTED_ABIS[0]");
            }
            if (!C7573i.m23585a((Object) "x86", (Object) str)) {
                if (!C7573i.m23585a((Object) "x86_64", (Object) str)) {
                    return false;
                }
            }
            new StringBuilder("Cronet unsupported CPU arch: ").append(str);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static final void m32114a(C10948f fVar, C10963h hVar) {
        C7573i.m23587b(fVar, "config");
        hVar.mo18658a(fVar);
        f29615d = fVar;
        C1592h.m7855a((Callable<TResult>) new C10945a<TResult>(fVar, hVar), fVar.f29627i);
    }

    /* renamed from: b */
    public final void mo26436b(C10948f fVar, C10963h hVar) {
        C10948f fVar2 = fVar;
        C10963h hVar2 = hVar;
        if (hVar2 != null) {
            hVar2.mo18659b(fVar2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C10920a.m32025a(fVar2.f29622d);
        C10940a.m32103a(((Number) fVar2.f29633o.mo26439a()).intValue());
        C12961d.m37780a(fVar2.f29620b);
        if (!m32118e() && C6776h.m20947b(fVar2.f29619a)) {
            C12961d.m37775a(0);
        }
        String c = C6776h.m20949c(fVar2.f29619a);
        if (c == null || !C7634n.m23776c((CharSequence) c, (CharSequence) "miniapp", false)) {
            C12961d.m37778a(fVar2.f29619a, fVar2.f29619a, new C34059d(), new C34057b(C6399b.m19921a()), null, true, false);
        } else {
            if (!m32118e()) {
                C12961d.m37775a(0);
            }
            C12961d.m37778a(fVar2.f29619a, fVar2.f29619a, new C34059d(), new C34057b(C6399b.m19921a()), null, true, true);
        }
        try {
            if (((Boolean) fVar2.f29636r.mo26439a()).booleanValue()) {
                C12925a.m37625a((Context) fVar2.f29619a);
                C12925a.m37637b(false);
                C12925a.m37625a((Context) fVar2.f29619a);
                C12925a.m37638c(true);
            } else if (m32119f()) {
                C12925a.m37625a((Context) fVar2.f29619a);
                C12925a.m37637b(true);
            } else {
                C12925a.m37625a((Context) fVar2.f29619a);
                C12925a.m37638c(true);
            }
            C48317f.m149883a().setAdapter(fVar2.f29621c);
            C48316e.m149835a().mo121728a((Object) fVar2.f29621c);
            if (((Boolean) fVar2.f29635q.mo26439a()).booleanValue()) {
                C10940a.m32102a();
            }
            C12961d.m37790f();
            C12961d.m37781a(((Boolean) fVar2.f29632n.mo26439a()).booleanValue());
            if (m32118e()) {
                C10108b.m30008a((C10111a) C10946b.f29618a);
            }
        } catch (Throwable unused) {
        }
        C13003f.m37948a((C13004a) new C10947c());
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ttnet_init_time", elapsedRealtime2);
        } catch (JSONException unused2) {
        }
        C6893q.m21452b("ttnet_init_time", "", jSONObject);
        new StringBuilder("ttnet init cost time:").append(elapsedRealtime2);
        if (hVar2 != null) {
            hVar2.mo18660c(fVar2);
        }
    }
}
