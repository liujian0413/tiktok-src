package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.bytedance.ies.web.p583b.C11107b;
import com.bytedance.ies.web.p583b.C11108c;
import com.bytedance.ies.web.p583b.C11109d;
import com.bytedance.ies.web.p583b.C11110e;
import com.bytedance.ies.web.p583b.C11110e.C11111a;
import com.bytedance.ies.web.p583b.C11114g;
import com.bytedance.ies.web.p583b.C11123l;
import com.bytedance.ies.web.p583b.C11146v;
import com.bytedance.keva.Keva;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25896d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.registry.p1224rn.C28060b;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b */
public final class C25985b {

    /* renamed from: a */
    public static final C25985b f68703a = new C25985b();

    /* renamed from: b */
    private static final ExecutorService f68704b = C25995c.m85379a();

    /* renamed from: c */
    private static String f68705c;

    /* renamed from: d */
    private static boolean f68706d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static C11110e f68707e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$a */
    public static final class C25986a implements C11109d {

        /* renamed from: a */
        final /* synthetic */ Keva f68708a;

        C25986a(Keva keva) {
            this.f68708a = keva;
        }

        /* renamed from: a */
        public final String mo11516a(String str) {
            C7573i.m23587b(str, "key");
            return this.f68708a.getString(str, null);
        }

        /* renamed from: b */
        public final Collection<String> mo11519b(String str) {
            C7573i.m23587b(str, "key");
            return this.f68708a.getStringSet(str, null);
        }

        /* renamed from: c */
        public final void mo11520c(String str) {
            C7573i.m23587b(str, "key");
            this.f68708a.erase(str);
        }

        /* renamed from: a */
        public final void mo11517a(String str, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "value");
            this.f68708a.storeString(str, str2);
        }

        /* renamed from: a */
        public final void mo11518a(String str, Collection<String> collection) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(collection, "collection");
            this.f68708a.storeStringSet(str, (Set) collection);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$b */
    public static final class C25987b implements C11108c {

        /* renamed from: a */
        final /* synthetic */ String f68709a;

        /* renamed from: a */
        public final List<String> mo11521a() {
            return C7525m.m23457a(this.f68709a);
        }

        C25987b(String str) {
            this.f68709a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$c */
    public static final class C25988c implements C11123l {
        C25988c() {
        }

        /* renamed from: a */
        public final void mo27100a(int i, String str) {
            C7573i.m23587b(str, "message");
        }

        /* renamed from: a */
        public final void mo27101a(int i, String str, Throwable th) {
            C7573i.m23587b(str, "message");
            C7573i.m23587b(th, "throwable");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$d */
    public static final class C25989d implements C11110e {
        C25989d() {
        }

        /* renamed from: a */
        public final void mo11522a(String str, Map<String, String> map, C11111a aVar) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(map, "headers");
            C7573i.m23587b(aVar, "callback");
            C11110e a = C25985b.f68707e;
            if (a != null) {
                a.mo11522a(str, map, aVar);
            }
        }

        /* renamed from: a */
        public final void mo11523a(String str, Map<String, String> map, String str2, JSONObject jSONObject, C11111a aVar) {
            C7573i.m23587b(str, "url");
            C7573i.m23587b(map, "headers");
            C7573i.m23587b(str2, "mimeType");
            C7573i.m23587b(jSONObject, "body");
            C7573i.m23587b(aVar, "callback");
            C11110e a = C25985b.f68707e;
            if (a != null) {
                a.mo11523a(str, map, str2, jSONObject, aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$e */
    static final class C25990e extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C25990e f68710a = new C25990e();

        C25990e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m85374a());
        }

        /* renamed from: a */
        private static boolean m85374a() {
            IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
            C7573i.m23582a((Object) userService, "ServiceManager.get().get…class.java).userService()");
            return userService.isLogin();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$f */
    static final class C25991f<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C25991f f68711a = new C25991f();

        C25991f() {
        }

        public final /* synthetic */ Object call() {
            return m85375a();
        }

        /* renamed from: a */
        private static String m85375a() {
            boolean z;
            String a = C25985b.f68703a.mo67434a();
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$g */
    static final class C25992g<TTaskResult, TContinuationResult> implements C1591g<String, Void> {

        /* renamed from: a */
        final /* synthetic */ C11174p f68712a;

        /* renamed from: b */
        final /* synthetic */ String f68713b;

        C25992g(C11174p pVar, String str) {
            this.f68712a = pVar;
            this.f68713b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<String> hVar) {
            try {
                C7573i.m23582a((Object) hVar, "it");
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "it.result");
                C25985b.m85361a((String) e);
                C25985b.f68707e = C25980a.f68692a;
                C11146v.m32629a(this.f68712a);
                C11146v.f30261b.mo27137a(this.f68713b);
            } catch (Exception e2) {
                C6921a.m21559a((Throwable) e2);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$h */
    static final class C25993h<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C25993h f68714a = new C25993h();

        C25993h() {
        }

        public final /* synthetic */ Object call() {
            return m85377a();
        }

        /* renamed from: a */
        private static String m85377a() {
            boolean z;
            String a = C25985b.f68703a.mo67434a();
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.b$i */
    static final class C25994i<TTaskResult, TContinuationResult> implements C1591g<String, Void> {

        /* renamed from: a */
        final /* synthetic */ C28060b f68715a;

        /* renamed from: b */
        final /* synthetic */ RnPrefetchMethod f68716b;

        /* renamed from: c */
        final /* synthetic */ String f68717c;

        C25994i(C28060b bVar, RnPrefetchMethod rnPrefetchMethod, String str) {
            this.f68715a = bVar;
            this.f68716b = rnPrefetchMethod;
            this.f68717c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<String> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "it.result");
            C25985b.m85361a((String) e);
            C25985b.f68707e = C25999f.f68725a;
            this.f68715a.mo71505a("__prefetch", (BaseCommonJavaMethod) this.f68716b);
            C11146v.m32630a(this.f68717c, (C11114g) this.f68716b);
            return null;
        }
    }

    private C25985b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ff, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0101, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0103, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015 A[Catch:{ Exception -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[SYNTHETIC, Splitter:B:13:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[Catch:{ Exception -> 0x00f5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo67434a() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = f68705c     // Catch:{ all -> 0x0104 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x0104 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = f68705c     // Catch:{ all -> 0x0104 }
            monitor-exit(r11)
            return r0
        L_0x0019:
            com.bytedance.ies.geckoclient.f r0 = com.p280ss.android.ugc.aweme.utils.C42983bo.m136460b()     // Catch:{ all -> 0x0104 }
            r3 = 0
            if (r0 == 0) goto L_0x0102
            java.lang.String r4 = "gecko_hybrid_prefetch_zip"
            com.bytedance.ies.geckoclient.model.d r0 = r0.mo26209a(r4)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0100
            java.lang.String r4 = r0.f29509d     // Catch:{ all -> 0x0104 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x0104 }
            if (r4 == 0) goto L_0x0037
            int r4 = r4.length()     // Catch:{ all -> 0x0104 }
            if (r4 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r4 = 0
            goto L_0x0038
        L_0x0037:
            r4 = 1
        L_0x0038:
            if (r4 != 0) goto L_0x0100
            java.lang.String r4 = "null"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x0104 }
            java.lang.String r5 = r0.f29509d     // Catch:{ all -> 0x0104 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0104 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ all -> 0x0104 }
            if (r4 == 0) goto L_0x004a
            goto L_0x0100
        L_0x004a:
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ all -> 0x0104 }
            java.lang.String r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19934j()     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = com.p280ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ all -> 0x0104 }
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ all -> 0x0104 }
            com.ss.android.ugc.aweme.app.AwemeAppData r8 = com.p280ss.android.newmedia.C19936f.m65765a()     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = "BaseAppData.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)     // Catch:{ all -> 0x0104 }
            com.ss.android.sdk.webview.l r8 = r8.mo53441g()     // Catch:{ all -> 0x0104 }
            if (r8 != 0) goto L_0x006a
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ all -> 0x0104 }
        L_0x006a:
            java.lang.String r8 = r8.mo53916a()     // Catch:{ all -> 0x0104 }
            r7[r1] = r8     // Catch:{ all -> 0x0104 }
            com.bytedance.ies.c.a r4 = com.bytedance.ies.p555c.C10702a.m31260a(r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = "iesOfflineCache"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = r4.mo25588a()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r0.f29509d     // Catch:{ all -> 0x0104 }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x0104 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00fe
            java.io.File[] r0 = r5.listFiles()     // Catch:{ all -> 0x0104 }
            java.lang.String r4 = "dir.listFiles()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)     // Catch:{ all -> 0x0104 }
            int r0 = r0.length     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x0098
            r0 = 1
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            if (r0 == 0) goto L_0x009c
            goto L_0x00fe
        L_0x009c:
            java.io.File[] r0 = r5.listFiles()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x00a5
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ all -> 0x0104 }
        L_0x00a5:
            int r4 = r0.length     // Catch:{ all -> 0x0104 }
        L_0x00a6:
            if (r1 >= r4) goto L_0x0102
            r5 = r0[r1]     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = "prefetch.json"
            java.lang.String r7 = "file"
            kotlin.jvm.internal.C7573i.m23582a(r5, r7)     // Catch:{ all -> 0x0104 }
            java.lang.String r7 = r5.getName()     // Catch:{ all -> 0x0104 }
            boolean r6 = kotlin.text.C7634n.m23717a(r6, r7, r2)     // Catch:{ all -> 0x0104 }
            if (r6 == 0) goto L_0x00fb
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x00f5 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00f5 }
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch:{ Exception -> 0x00f5 }
            java.nio.charset.Charset r5 = kotlin.text.C48038d.f122880a     // Catch:{ Exception -> 0x00f5 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00f5 }
            r7.<init>(r6, r5)     // Catch:{ Exception -> 0x00f5 }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ Exception -> 0x00f5 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00f5 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r7, r6)     // Catch:{ Exception -> 0x00f5 }
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch:{ Exception -> 0x00f5 }
            r6 = r5
            java.io.BufferedReader r6 = (java.io.BufferedReader) r6     // Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
            java.io.Reader r6 = (java.io.Reader) r6     // Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
            java.lang.String r6 = kotlin.p1884io.C47991m.m148954b(r6)     // Catch:{ Throwable -> 0x00eb, all -> 0x00e8 }
            kotlin.p1884io.C47973b.m148917a(r5, r3)     // Catch:{ Exception -> 0x00f5 }
            f68705c = r6     // Catch:{ Exception -> 0x00f5 }
            monitor-exit(r11)
            return r6
        L_0x00e8:
            r6 = move-exception
            r7 = r3
            goto L_0x00f1
        L_0x00eb:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r7 = move-exception
            r10 = r7
            r7 = r6
            r6 = r10
        L_0x00f1:
            kotlin.p1884io.C47973b.m148917a(r5, r7)     // Catch:{ Exception -> 0x00f5 }
            throw r6     // Catch:{ Exception -> 0x00f5 }
        L_0x00f5:
            r5 = move-exception
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x0104 }
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r5)     // Catch:{ all -> 0x0104 }
        L_0x00fb:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00fe:
            monitor-exit(r11)
            return r3
        L_0x0100:
            monitor-exit(r11)
            return r3
        L_0x0102:
            monitor-exit(r11)
            return r3
        L_0x0104:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25985b.mo67434a():java.lang.String");
    }

    /* renamed from: b */
    private static final HashMap<String, String> m85362b(String str) {
        if (str == null) {
            return new HashMap<>();
        }
        Uri parse = Uri.parse(str);
        HashMap<String, String> hashMap = new HashMap<>();
        C7573i.m23582a((Object) parse, "uri");
        for (String str2 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                Map map = hashMap;
                C7573i.m23582a((Object) str2, "queryName");
                if (queryParameter == null) {
                    C7573i.m23580a();
                }
                map.put(str2, queryParameter);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m85361a(String str) {
        C7573i.m23587b(str, "configProvider");
        C11107b a = C11146v.m32634b().mo27080a(32).mo27087a(false).mo27082a((C11109d) new C25986a(Keva.getRepo("KEY_PREFETCH_CACHE"))).mo27081a((C11108c) new C25987b(str)).mo27084a((C11123l) new C25988c()).mo27083a((C11110e) new C25989d());
        ExecutorService executorService = f68704b;
        C7573i.m23582a((Object) executorService, "workerExecutor");
        a.mo27086a((Executor) executorService).mo27085a("login", C25990e.f68710a).mo27088a();
        f68706d = true;
    }

    /* renamed from: a */
    public static void m85358a(C11174p pVar, String str) {
        if (pVar != null && str != null && !pVar.f30321a) {
            if (f68706d) {
                f68707e = C25980a.f68692a;
                try {
                    C11146v.m32629a(pVar);
                    C11146v.f30261b.mo27137a(str);
                } catch (Exception e) {
                    C6921a.m21559a((Throwable) e);
                }
            } else {
                C1592h.m7853a((Callable<TResult>) C25991f.f68711a).mo6876a((C1591g<TResult, TContinuationResult>) new C25992g<TResult,TContinuationResult>(pVar, str), C1592h.f5958b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final String m85356a(C25896d dVar, Map<String, String> map) {
        String str = dVar.f68499j;
        if (str == null) {
            str = null;
        }
        HashMap b = m85362b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo67272a());
        sb.append("/");
        sb.append(dVar.f68494e);
        Builder clearQuery = Uri.parse(sb.toString()).buildUpon().clearQuery();
        for (Entry entry : b.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        if (map != null) {
            for (Entry entry2 : map.entrySet()) {
                clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        String uri = clearQuery.build().toString();
        C7573i.m23582a((Object) uri, "uriBuilder.build().toString()");
        return uri;
    }

    /* renamed from: a */
    public static void m85360a(C28060b bVar, ReactContext reactContext, C25896d dVar) {
        C7573i.m23587b(reactContext, "reactContext");
        if (bVar != null && dVar != null) {
            String a = m85356a(dVar, null);
            RnPrefetchMethod rnPrefetchMethod = new RnPrefetchMethod(reactContext);
            if (f68706d) {
                f68707e = C25999f.f68725a;
                bVar.mo71505a("__prefetch", (BaseCommonJavaMethod) rnPrefetchMethod);
                C11146v.m32630a(a, (C11114g) rnPrefetchMethod);
                return;
            }
            C1592h.m7853a((Callable<TResult>) C25993h.f68714a).mo6876a((C1591g<TResult, TContinuationResult>) new C25994i<TResult,TContinuationResult>(bVar, rnPrefetchMethod, a), C1592h.f5958b);
        }
    }
}
