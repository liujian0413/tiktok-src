package com.facebook.net;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.connectionclass.C10084b;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10147e;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12488k;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p671c.C12955b;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13683ai.C13684a;
import com.facebook.imagepipeline.p724k.C13700an;
import com.facebook.imagepipeline.p724k.C13715aw.C13719a;
import com.facebook.imagepipeline.p724k.C13736c;
import com.facebook.imagepipeline.p724k.C13738e;
import com.facebook.imagepipeline.p724k.C13748k;
import com.facebook.imagepipeline.p724k.C13767t;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.facebook.net.c */
public final class C14126c extends C13736c<C14133c> {

    /* renamed from: b */
    public static C14134d f37324b;

    /* renamed from: c */
    private static C14132b f37325c;

    /* renamed from: a */
    public Executor f37326a;

    /* renamed from: com.facebook.net.c$a */
    public interface C14131a {
        /* renamed from: a */
        Pair<InputStream, Long> mo33888a(InputStream inputStream, String str, long j) throws Exception;

        /* renamed from: a */
        String mo33889a(String str);
    }

    /* renamed from: com.facebook.net.c$b */
    public interface C14132b {
        /* renamed from: a */
        C14131a mo33890a();
    }

    /* renamed from: com.facebook.net.c$c */
    public static class C14133c extends C13767t {

        /* renamed from: a */
        public long f37343a;

        /* renamed from: b */
        public long f37344b;

        /* renamed from: c */
        public long f37345c;

        /* renamed from: i */
        public long f37346i;

        /* renamed from: j */
        public boolean f37347j;

        /* renamed from: k */
        public Runnable f37348k;

        public C14133c(C13748k<C13647e> kVar, C13700an anVar) {
            super(kVar, anVar);
            if (kVar instanceof C13719a) {
                C13719a aVar = (C13719a) kVar;
                if (aVar.f36423a != null) {
                    this.f37346i = (long) aVar.f36423a.mo33281i();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo33884a(C12534t tVar, C14133c cVar, Throwable th, C12955b bVar, int i) {
        if (cVar != null) {
            try {
                long j = cVar.f37343a;
                long j2 = cVar.f37345c - cVar.f37343a;
                if (j2 <= 0) {
                    j2 = System.currentTimeMillis() - cVar.f37343a;
                }
                long j3 = j2;
                String str = null;
                if (C6319n.m19593a((String) null)) {
                    if (tVar != null) {
                        str = tVar.f33301a.f33118a;
                    } else {
                        str = cVar.mo33371c().toString();
                    }
                }
                mo33885a(cVar, false, j3);
                C14139g gVar = new C14139g();
                gVar.f37365a = tVar;
                gVar.f37367c = str;
                if (f37324b != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", cVar.mo33369a());
                    jSONObject.put("retryCount", i);
                    f37324b.mo33891a(j3, j, gVar, bVar, th, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo33885a(C14133c cVar, boolean z, long j) {
        if (m41712a(cVar) == 1) {
            C14135e.m41735a().mo33893a(cVar.mo33371c().toString(), z, j, true);
            return;
        }
        if (m41712a(cVar) == 0) {
            C14135e.m41735a().mo33893a(cVar.mo33371c().toString(), z, j, false);
        }
    }

    /* renamed from: a */
    public static void m41716a(C14132b bVar) {
        f37325c = bVar;
    }

    /* renamed from: a */
    public static int m41711a(C12955b bVar) {
        JSONObject jSONObject = bVar.f27522y;
        if (jSONObject != null) {
            Object remove = jSONObject.remove("retryCount");
            if (remove instanceof Integer) {
                return ((Integer) remove).intValue();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static int m41712a(C14133c cVar) {
        if (cVar == null || cVar.f36544e == null || cVar.f36544e.mo33337d() == null) {
            return -1;
        }
        Object d = cVar.f36544e.mo33337d();
        if (d instanceof C14141i) {
            Uri c = cVar.mo33371c();
            if (c != null) {
                return ((C14141i) d).mo33894a(c.toString());
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static String m41714a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static void m41719a(C14134d dVar) {
        f37324b = dVar;
    }

    /* renamed from: a */
    private static C14133c m41713a(C13748k<C13647e> kVar, C13700an anVar) {
        return new C14133c(kVar, anVar);
    }

    public final /* synthetic */ C13767t createFetchState(C13748k kVar, C13700an anVar) {
        return m41713a(kVar, anVar);
    }

    public final /* synthetic */ Map getExtraMap(C13767t tVar, int i) {
        return m41721b((C14133c) tVar, i);
    }

    public final /* synthetic */ void onFetchCompletion(C13767t tVar, int i) {
        m41717a((C14133c) tVar, i);
    }

    /* renamed from: a */
    private static void m41717a(C14133c cVar, int i) {
        cVar.f37348k.run();
    }

    /* renamed from: b */
    private static Map<String, String> m41721b(C14133c cVar, int i) {
        String str;
        HashMap hashMap = new HashMap(1);
        hashMap.put("image_size", Integer.toString(i));
        String str2 = "hit_cdn_cache";
        if (cVar.f37347j) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        return hashMap;
    }

    /* renamed from: b */
    private void m41722b(C14133c cVar, C13684a aVar) {
        final C14131a aVar2;
        INetworkApi iNetworkApi;
        final boolean z;
        cVar.f37343a = System.currentTimeMillis();
        Uri c = cVar.mo33371c();
        if (c != null) {
            LinkedList linkedList = null;
            if (f37325c != null) {
                aVar2 = f37325c.mo33890a();
            } else {
                aVar2 = null;
            }
            String uri = c.toString();
            if (aVar2 != null) {
                uri = aVar2.mo33889a(uri);
            }
            if (!C6319n.m19593a(uri)) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair a = C10191k.m30270a(uri, (Map<String, String>) linkedHashMap);
                    String str = (String) a.first;
                    String str2 = (String) a.second;
                    if (RetryInterceptManager.m41704a().mo33882b()) {
                        iNetworkApi = (INetworkApi) RetryInterceptManager.m41704a().mo33881a(str, INetworkApi.class);
                    } else {
                        iNetworkApi = (INetworkApi) RetrofitUtils.m37898a(str, INetworkApi.class);
                    }
                    INetworkApi iNetworkApi2 = iNetworkApi;
                    C14125b bVar = new C14125b(cVar.mo33372d());
                    if (cVar.f37346i > 0) {
                        linkedList = new LinkedList();
                        StringBuilder sb = new StringBuilder("bytes=");
                        sb.append(cVar.f37346i);
                        sb.append("-");
                        linkedList.add(new C12461b("Range", sb.toString()));
                    }
                    LinkedList linkedList2 = linkedList;
                    if (iNetworkApi2 != null) {
                        final C12466b downloadFile = iNetworkApi2.downloadFile(false, -1, str2, linkedHashMap, linkedList2, bVar);
                        cVar.f36544e.mo33334a(new C13738e() {
                            /* renamed from: a */
                            public final void mo29896a() {
                                if (Looper.myLooper() != Looper.getMainLooper()) {
                                    downloadFile.cancel();
                                } else {
                                    C14126c.this.f37326a.execute(new Runnable() {
                                        public final void run() {
                                            downloadFile.cancel();
                                        }
                                    });
                                }
                            }
                        });
                        C10147e d = C10142f.m30121d();
                        if (d == null || !d.mo24810b(uri)) {
                            z = false;
                        } else {
                            C10084b.m29954a().mo24737c();
                            z = true;
                        }
                        final C14133c cVar2 = cVar;
                        final C14125b bVar2 = bVar;
                        final C13684a aVar3 = aVar;
                        final C12466b bVar3 = downloadFile;
                        C141292 r3 = new C12488k<TypedInput>() {

                            /* renamed from: a */
                            C12955b f37330a;

                            /* renamed from: b */
                            long f37331b = -1;

                            /* renamed from: a */
                            public final void mo26463a(C12466b<TypedInput> bVar, C12534t<TypedInput> tVar) {
                            }

                            /* renamed from: a */
                            public final void mo26464a(C12466b<TypedInput> bVar, Throwable th) {
                                Exception exc;
                                this.f37331b = System.currentTimeMillis();
                                if (z) {
                                    C10084b.m29954a().mo24738d();
                                }
                                if (th instanceof Exception) {
                                    exc = (Exception) th;
                                } else {
                                    exc = new Exception(th.getMessage(), th.getCause());
                                }
                                m41726a((C12534t) null, exc);
                            }

                            /* JADX WARNING: Can't wrap try/catch for region: R(11:20|21|(2:25|(1:27))|28|(1:33)|34|(1:36)(1:37)|38|(4:40|(1:42)|43|(2:45|46))|47|48) */
                            /* JADX WARNING: Failed to process nested try/catch */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c2 */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00cd */
                            /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1 A[Catch:{ Throwable -> 0x00e9 }] */
                            /* renamed from: a */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            private void m41726a(com.bytedance.retrofit2.C12534t r8, java.lang.Exception r9) {
                                /*
                                    r7 = this;
                                    if (r9 != 0) goto L_0x0003
                                    return
                                L_0x0003:
                                    r0 = -1
                                    boolean r1 = r9 instanceof com.facebook.net.RetryInterceptManager.RetryWrapException
                                    if (r1 == 0) goto L_0x0011
                                    com.facebook.net.RetryInterceptManager$RetryWrapException r9 = (com.facebook.net.RetryInterceptManager.RetryWrapException) r9
                                    java.lang.Exception r0 = r9.f37321e
                                    int r9 = r9.retryCount
                                    r6 = r9
                                    r9 = r0
                                    goto L_0x0012
                                L_0x0011:
                                    r6 = -1
                                L_0x0012:
                                    r0 = 1
                                    boolean r1 = r9 instanceof com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException
                                    r2 = 0
                                    if (r1 == 0) goto L_0x0026
                                    r1 = r9
                                    com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r1 = (com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException) r1
                                    if (r1 == 0) goto L_0x0026
                                    int r1 = r1.getStatusCode()
                                    r3 = 304(0x130, float:4.26E-43)
                                    if (r1 != r3) goto L_0x0026
                                    r0 = 0
                                L_0x0026:
                                    boolean r1 = r9 instanceof com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException
                                    if (r1 == 0) goto L_0x004d
                                    r1 = r9
                                    com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException r1 = (com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException) r1
                                    com.bytedance.frameworks.baselib.network.http.a r3 = r1.getRequestInfo()
                                    boolean r4 = r3 instanceof com.bytedance.ttnet.p671c.C12955b
                                    if (r4 == 0) goto L_0x003a
                                    com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p671c.C12955b) r3
                                    r7.f37330a = r3
                                    goto L_0x004d
                                L_0x003a:
                                    com.bytedance.ttnet.c.b r3 = new com.bytedance.ttnet.c.b
                                    r3.<init>()
                                    r7.f37330a = r3
                                    com.bytedance.ttnet.c.b r3 = r7.f37330a
                                    r3.f27519v = r2
                                    com.bytedance.ttnet.c.b r2 = r7.f37330a
                                    java.lang.String r1 = r1.getRequestLog()
                                    r2.f27521x = r1
                                L_0x004d:
                                    if (r0 == 0) goto L_0x00cd
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    if (r0 != 0) goto L_0x0069
                                    com.bytedance.retrofit2.b r0 = r10     // Catch:{ Throwable -> 0x00cd }
                                    boolean r0 = r0 instanceof com.bytedance.retrofit2.C12490m     // Catch:{ Throwable -> 0x00cd }
                                    if (r0 == 0) goto L_0x0069
                                    com.bytedance.retrofit2.b r0 = r10     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.retrofit2.m r0 = (com.bytedance.retrofit2.C12490m) r0     // Catch:{ Throwable -> 0x00cd }
                                    java.lang.Object r0 = r0.getRequestInfo()     // Catch:{ Throwable -> 0x00cd }
                                    boolean r1 = r0 instanceof com.bytedance.ttnet.p671c.C12955b     // Catch:{ Throwable -> 0x00cd }
                                    if (r1 == 0) goto L_0x0069
                                    com.bytedance.ttnet.c.b r0 = (com.bytedance.ttnet.p671c.C12955b) r0     // Catch:{ Throwable -> 0x00cd }
                                    r7.f37330a = r0     // Catch:{ Throwable -> 0x00cd }
                                L_0x0069:
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    if (r0 != 0) goto L_0x0084
                                    com.bytedance.retrofit2.b r0 = r10     // Catch:{ Throwable -> 0x00cd }
                                    boolean r0 = r0 instanceof com.bytedance.retrofit2.C12489l     // Catch:{ Throwable -> 0x00cd }
                                    if (r0 == 0) goto L_0x0084
                                    if (r8 == 0) goto L_0x0084
                                    com.bytedance.retrofit2.b r0 = r10     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.retrofit2.l r0 = (com.bytedance.retrofit2.C12489l) r0     // Catch:{ Throwable -> 0x00cd }
                                    r0.doCollect()     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.retrofit2.a.d r0 = r8.f33301a     // Catch:{ Throwable -> 0x00cd }
                                    java.lang.Object r0 = r0.f33123f     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.ttnet.c.b r0 = (com.bytedance.ttnet.p671c.C12955b) r0     // Catch:{ Throwable -> 0x00cd }
                                    r7.f37330a = r0     // Catch:{ Throwable -> 0x00cd }
                                L_0x0084:
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    if (r8 == 0) goto L_0x008d
                                    java.util.List r1 = r8.mo30511b()     // Catch:{ Throwable -> 0x00cd }
                                    goto L_0x008e
                                L_0x008d:
                                    r1 = 0
                                L_0x008e:
                                    com.bytedance.ttnet.c.e r2 = r7     // Catch:{ Throwable -> 0x00cd }
                                    com.facebook.net.C14126c.m41715a(r0, r1, r2, r9)     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    if (r0 == 0) goto L_0x00c2
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00cd }
                                    r0.f27505h = r1     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    long r0 = r0.f27504g     // Catch:{ Throwable -> 0x00cd }
                                    r2 = 0
                                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                    if (r4 > 0) goto L_0x00af
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    long r1 = r7.f37331b     // Catch:{ Throwable -> 0x00cd }
                                    r0.f27504g = r1     // Catch:{ Throwable -> 0x00cd }
                                L_0x00af:
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    org.json.JSONObject r0 = r0.f27522y     // Catch:{ Throwable -> 0x00cd }
                                    if (r0 == 0) goto L_0x00c2
                                    com.bytedance.ttnet.c.b r0 = r7.f37330a     // Catch:{ Throwable -> 0x00c2 }
                                    org.json.JSONObject r0 = r0.f27522y     // Catch:{ Throwable -> 0x00c2 }
                                    java.lang.String r1 = "ex"
                                    java.lang.String r2 = r9.getMessage()     // Catch:{ Throwable -> 0x00c2 }
                                    r0.put(r1, r2)     // Catch:{ Throwable -> 0x00c2 }
                                L_0x00c2:
                                    com.facebook.net.c r1 = com.facebook.net.C14126c.this     // Catch:{ Throwable -> 0x00cd }
                                    com.facebook.net.c$c r3 = r6     // Catch:{ Throwable -> 0x00cd }
                                    com.bytedance.ttnet.c.b r5 = r7.f37330a     // Catch:{ Throwable -> 0x00cd }
                                    r2 = r8
                                    r4 = r9
                                    r1.mo33884a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x00cd }
                                L_0x00cd:
                                    com.facebook.imagepipeline.k.ai$a r8 = r8     // Catch:{ Throwable -> 0x00e9 }
                                    if (r8 == 0) goto L_0x00e8
                                    com.bytedance.retrofit2.b r8 = r10     // Catch:{ Throwable -> 0x00e9 }
                                    if (r8 == 0) goto L_0x00e3
                                    com.bytedance.retrofit2.b r8 = r10     // Catch:{ Throwable -> 0x00e9 }
                                    boolean r8 = r8.isCanceled()     // Catch:{ Throwable -> 0x00e9 }
                                    if (r8 == 0) goto L_0x00e3
                                    com.facebook.imagepipeline.k.ai$a r8 = r8     // Catch:{ Throwable -> 0x00e9 }
                                    r8.mo33323a()     // Catch:{ Throwable -> 0x00e9 }
                                    goto L_0x00e9
                                L_0x00e3:
                                    com.facebook.imagepipeline.k.ai$a r8 = r8     // Catch:{ Throwable -> 0x00e9 }
                                    r8.mo33325a(r9)     // Catch:{ Throwable -> 0x00e9 }
                                L_0x00e8:
                                    return
                                L_0x00e9:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14126c.C141292.m41726a(com.bytedance.retrofit2.t, java.lang.Exception):void");
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:73:0x00ff  */
                            /* JADX WARNING: Removed duplicated region for block: B:81:0x010f  */
                            /* renamed from: b */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void mo30461b(com.bytedance.retrofit2.C12466b<com.bytedance.retrofit2.mime.TypedInput> r12, com.bytedance.retrofit2.C12534t<com.bytedance.retrofit2.mime.TypedInput> r13) {
                                /*
                                    r11 = this;
                                    r0 = 0
                                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f7 }
                                    r11.f37331b = r1     // Catch:{ Exception -> 0x00f7 }
                                    if (r13 != 0) goto L_0x0019
                                    boolean r12 = r9
                                    if (r12 == 0) goto L_0x0014
                                    com.bytedance.frameworks.baselib.network.connectionclass.b r12 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
                                    r12.mo24738d()
                                L_0x0014:
                                    com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r0)     // Catch:{ Throwable -> 0x0018 }
                                    return
                                L_0x0018:
                                    return
                                L_0x0019:
                                    T r1 = r13.f33302b     // Catch:{ Exception -> 0x00f7 }
                                    com.bytedance.retrofit2.mime.TypedInput r1 = (com.bytedance.retrofit2.mime.TypedInput) r1     // Catch:{ Exception -> 0x00f7 }
                                    boolean r2 = r13.mo30512c()     // Catch:{ Exception -> 0x00f7 }
                                    if (r2 == 0) goto L_0x00dc
                                    com.facebook.net.c$a r2 = r5     // Catch:{ Exception -> 0x00f7 }
                                    if (r2 == 0) goto L_0x0046
                                    com.facebook.net.c$a r2 = r5     // Catch:{ Exception -> 0x00f7 }
                                    java.io.InputStream r3 = r1.mo10444in()     // Catch:{ Exception -> 0x00f7 }
                                    com.bytedance.retrofit2.a.d r4 = r13.f33301a     // Catch:{ Exception -> 0x00f7 }
                                    java.lang.String r4 = r4.f33118a     // Catch:{ Exception -> 0x00f7 }
                                    long r5 = r1.length()     // Catch:{ Exception -> 0x00f7 }
                                    android.util.Pair r1 = r2.mo33888a(r3, r4, r5)     // Catch:{ Exception -> 0x00f7 }
                                    java.lang.Object r2 = r1.first     // Catch:{ Exception -> 0x00f7 }
                                    java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Exception -> 0x00f7 }
                                    java.lang.Object r0 = r1.second     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    long r0 = r0.longValue()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    goto L_0x004e
                                L_0x0046:
                                    java.io.InputStream r2 = r1.mo10444in()     // Catch:{ Exception -> 0x00f7 }
                                    long r0 = r1.length()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                L_0x004e:
                                    r3 = 0
                                    int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                                    if (r5 < 0) goto L_0x0064
                                    com.facebook.net.c$c r5 = r6     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    long r5 = r5.f37346i     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                                    if (r7 <= 0) goto L_0x0065
                                    int r5 = r13.mo30510a()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    r6 = 206(0xce, float:2.89E-43)
                                    if (r5 == r6) goto L_0x0065
                                L_0x0064:
                                    r0 = r3
                                L_0x0065:
                                    com.bytedance.retrofit2.a.d r3 = r13.f33301a     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    java.lang.String r4 = "X-Cache"
                                    java.util.List r3 = r3.mo30452b(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    if (r3 == 0) goto L_0x0075
                                    int r4 = r3.size()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    if (r4 > 0) goto L_0x007d
                                L_0x0075:
                                    com.bytedance.retrofit2.a.d r3 = r13.f33301a     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    java.lang.String r4 = "X-Cache-new"
                                    java.util.List r3 = r3.mo30452b(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                L_0x007d:
                                    boolean r4 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    if (r4 != 0) goto L_0x00b3
                                    java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                L_0x0087:
                                    boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    if (r4 == 0) goto L_0x00b3
                                    java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    com.bytedance.retrofit2.a.b r4 = (com.bytedance.retrofit2.p637a.C12461b) r4     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    if (r4 == 0) goto L_0x0087
                                    java.lang.String r4 = r4.f33096b     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    r6 = 1
                                    if (r5 != 0) goto L_0x00ac
                                    java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    java.lang.String r5 = "hit"
                                    boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    if (r4 == 0) goto L_0x00ac
                                    r4 = 1
                                    goto L_0x00ad
                                L_0x00ac:
                                    r4 = 0
                                L_0x00ad:
                                    if (r4 == 0) goto L_0x0087
                                    com.facebook.net.c$c r3 = r6     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    r3.f37347j = r6     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                L_0x00b3:
                                    com.facebook.net.c$c r9 = r6     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    com.facebook.net.c$2$1 r10 = new com.facebook.net.c$2$1     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    r3 = r10
                                    r4 = r11
                                    r5 = r0
                                    r7 = r12
                                    r8 = r13
                                    r3.<init>(r5, r7, r8)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    r9.f37348k = r10     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    com.facebook.imagepipeline.k.ai$a r12 = r8     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    int r0 = (int) r0     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    r12.mo33324a(r2, r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    boolean r12 = r9
                                    if (r12 == 0) goto L_0x00d2
                                    com.bytedance.frameworks.baselib.network.connectionclass.b r12 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
                                    r12.mo24738d()
                                L_0x00d2:
                                    com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r2)     // Catch:{ Throwable -> 0x00d6 }
                                    return
                                L_0x00d6:
                                    return
                                L_0x00d7:
                                    r12 = move-exception
                                    goto L_0x010b
                                L_0x00d9:
                                    r12 = move-exception
                                    r0 = r2
                                    goto L_0x00f8
                                L_0x00dc:
                                    java.io.IOException r12 = new java.io.IOException     // Catch:{ Exception -> 0x00f7 }
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f7 }
                                    java.lang.String r2 = "Unexpected HTTP code "
                                    r1.<init>(r2)     // Catch:{ Exception -> 0x00f7 }
                                    int r2 = r13.mo30510a()     // Catch:{ Exception -> 0x00f7 }
                                    r1.append(r2)     // Catch:{ Exception -> 0x00f7 }
                                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f7 }
                                    r12.<init>(r1)     // Catch:{ Exception -> 0x00f7 }
                                    throw r12     // Catch:{ Exception -> 0x00f7 }
                                L_0x00f4:
                                    r12 = move-exception
                                    r2 = r0
                                    goto L_0x010b
                                L_0x00f7:
                                    r12 = move-exception
                                L_0x00f8:
                                    r11.m41726a(r13, r12)     // Catch:{ all -> 0x00f4 }
                                    boolean r12 = r9
                                    if (r12 == 0) goto L_0x0106
                                    com.bytedance.frameworks.baselib.network.connectionclass.b r12 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
                                    r12.mo24738d()
                                L_0x0106:
                                    com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r0)     // Catch:{ Throwable -> 0x010a }
                                    return
                                L_0x010a:
                                    return
                                L_0x010b:
                                    boolean r13 = r9
                                    if (r13 == 0) goto L_0x0116
                                    com.bytedance.frameworks.baselib.network.connectionclass.b r13 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
                                    r13.mo24738d()
                                L_0x0116:
                                    com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r2)     // Catch:{ Throwable -> 0x0119 }
                                L_0x0119:
                                    throw r12
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14126c.C141292.mo30461b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.t):void");
                            }
                        };
                        downloadFile.enqueue(r3);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void fetch(C14133c cVar, C13684a aVar) {
        if (cVar != null) {
            m41722b(cVar, aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[Catch:{ JSONException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ JSONException -> 0x005e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m41720a(org.json.JSONObject r10, com.facebook.net.C14126c.C14133c r11) {
        /*
            long r0 = r11.f37344b     // Catch:{ JSONException -> 0x005e }
            r2 = -1
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x001d
            long r0 = r11.f37343a     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            java.lang.String r0 = "queue_time"
            long r6 = r11.f37344b     // Catch:{ JSONException -> 0x005e }
            long r8 = r11.f37343a     // Catch:{ JSONException -> 0x005e }
            r1 = 0
            long r6 = r6 - r8
            r10.put(r0, r6)     // Catch:{ JSONException -> 0x005e }
            goto L_0x0022
        L_0x001d:
            java.lang.String r0 = "queue_time"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x005e }
        L_0x0022:
            long r0 = r11.f37345c     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x003b
            long r0 = r11.f37344b     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            java.lang.String r0 = "fetch_time"
            long r6 = r11.f37345c     // Catch:{ JSONException -> 0x005e }
            long r8 = r11.f37344b     // Catch:{ JSONException -> 0x005e }
            r1 = 0
            long r6 = r6 - r8
            r10.put(r0, r6)     // Catch:{ JSONException -> 0x005e }
            goto L_0x0040
        L_0x003b:
            java.lang.String r0 = "fetch_time"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x005e }
        L_0x0040:
            long r0 = r11.f37345c     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0059
            long r0 = r11.f37343a     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x004d
            goto L_0x0059
        L_0x004d:
            java.lang.String r0 = "total_time"
            long r1 = r11.f37345c     // Catch:{ JSONException -> 0x005e }
            long r3 = r11.f37343a     // Catch:{ JSONException -> 0x005e }
            r11 = 0
            long r1 = r1 - r3
            r10.put(r0, r1)     // Catch:{ JSONException -> 0x005e }
            return
        L_0x0059:
            java.lang.String r11 = "total_time"
            r10.put(r11, r2)     // Catch:{ JSONException -> 0x005e }
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14126c.m41720a(org.json.JSONObject, com.facebook.net.c$c):void");
    }

    /* renamed from: a */
    public static void m41715a(C10104a aVar, List<C12461b> list, C12960e eVar, Exception exc) {
        if (aVar != null) {
            try {
                if (C6319n.m19593a(aVar.f27498a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (C12461b bVar : list) {
                            if ("x-snssdk.remoteaddr".equalsIgnoreCase(bVar.f33095a)) {
                                str = bVar.f33096b;
                            }
                        }
                    }
                    if (C6319n.m19593a(str) && eVar != null) {
                        str = eVar.f27552a;
                    }
                    if (C6319n.m19593a(str)) {
                        str = m41714a((Throwable) exc);
                    }
                    if (!C6319n.m19593a(str) && aVar != null) {
                        aVar.f27498a = str;
                        if (aVar.f27499b != null) {
                            aVar.f27499b.f27552a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
