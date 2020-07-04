package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.util.C10183c;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.common.util.concurrent.C18253l;
import com.p1843tt.miniapphost.AppBrandLogger;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33441e;
import com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a.C33452a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a.C33453b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a.C33454c;
import com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a.C33454c.C33455a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a.C33456d;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33429d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl */
public class NetWorkImpl implements C33441e {

    /* renamed from: a */
    public static final String f87209a = "NetWorkImpl";

    /* renamed from: b */
    private static final IRetrofit f87210b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c */
    private static IRetrofitService f87211c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$CompressType */
    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$NetApi */
    public interface NetApi {
        @C6457h
        C18253l<String> doGet(@C6463n int i, @C6450ac String str);
    }

    /* renamed from: a */
    public final String mo85557a(Context context) {
        return NetworkUtils.getNetworkAccessType(context);
    }

    /* renamed from: d */
    private static C12960e m107949d(C33454c cVar) {
        if (cVar == null) {
            return null;
        }
        C12960e eVar = new C12960e();
        eVar.f27554c = cVar.f87324g;
        eVar.f27555d = cVar.f87326i;
        eVar.f27556e = cVar.f87325h;
        return eVar;
    }

    /* renamed from: c */
    public final C33456d mo85560c(C33454c cVar) throws Exception {
        C33456d dVar = new C33456d();
        if (C6319n.m19593a(cVar.f87320c)) {
            dVar.f87331c = "url is null";
            return dVar;
        }
        ArrayList arrayList = new ArrayList();
        if (cVar.f87321d != null && !cVar.f87321d.isEmpty()) {
            for (Entry entry : cVar.f87321d.entrySet()) {
                arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        HashMap hashMap = new HashMap();
        for (Entry entry2 : cVar.f87322e.entrySet()) {
            hashMap.put(entry2.getKey(), new TypedString(entry2.getValue().toString()));
        }
        for (Entry entry3 : cVar.f87323f.entrySet()) {
            String str = (String) entry3.getKey();
            C33455a aVar = (C33455a) entry3.getValue();
            hashMap.put(str, new TypedFile(aVar.f87329b, aVar.f87328a));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C10191k.m30270a(cVar.f87320c, (Map<String, String>) linkedHashMap);
        String str2 = (String) a.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m37898a((String) a.first, INetworkApi.class);
        if (iNetworkApi != null) {
            C12534t execute = iNetworkApi.postMultiPart(-1, str2, linkedHashMap, hashMap, arrayList).execute();
            dVar.f87330b = execute.mo30510a();
            dVar.f87331c = execute.f33301a.f33120c;
            dVar.f87332d = (String) execute.f33302b;
        }
        return dVar;
    }

    /* renamed from: b */
    public final C33456d mo85559b(C33454c cVar) throws Exception {
        byte[] bArr;
        String str;
        C33456d dVar = new C33456d();
        if (C6319n.m19593a(cVar.f87320c)) {
            dVar.f87331c = "url is null";
            return dVar;
        }
        C12960e d = m107949d(cVar);
        if (cVar.f87327j) {
            Pair a = m107946a(cVar.mo85761a().getBytes(), CompressType.GZIP);
            bArr = (byte[]) a.first;
            str = (String) a.second;
        } else {
            bArr = cVar.mo85761a().getBytes();
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new C12461b("Content-Encoding", str));
        }
        arrayList.add(new C12461b("Content-Type", "application/json"));
        if (cVar.f87321d != null && !cVar.f87321d.isEmpty()) {
            for (Entry entry : cVar.f87321d.entrySet()) {
                arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a2 = C10191k.m30270a(cVar.f87320c, (Map<String, String>) linkedHashMap);
        String str2 = (String) a2.first;
        String str3 = (String) a2.second;
        IAppbrandNetworkApi iAppbrandNetworkApi = (IAppbrandNetworkApi) RetrofitUtils.m37898a(str2, IAppbrandNetworkApi.class);
        if (iAppbrandNetworkApi != null) {
            try {
                C12534t execute = iAppbrandNetworkApi.postBody(-1, str3, linkedHashMap, new TypedByteArray(null, bArr, new String[0]), arrayList, d).execute();
                dVar.f87330b = execute.mo30510a();
                dVar.f87331c = execute.f33301a.f33120c;
                dVar.f87332d = (String) execute.f33302b;
            } catch (HttpResponseException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getClass());
                sb.append(":");
                sb.append(e.getMessage());
                dVar.f87331c = sb.toString();
                dVar.f87330b = e.getStatusCode();
                dVar.f87333e = e;
            } catch (CronetIOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.getClass());
                sb2.append(":");
                sb2.append(e2.getMessage());
                dVar.f87331c = sb2.toString();
                dVar.f87333e = e2;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public final C33456d mo85556a(C33454c cVar) throws Exception {
        C12960e d = m107949d(cVar);
        C33456d dVar = new C33456d();
        if (C6319n.m19593a(cVar.f87320c)) {
            dVar.f87331c = "url is null";
            return dVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C10191k.m30270a(cVar.f87320c, (Map<String, String>) linkedHashMap);
        String str = (String) a.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.m37898a((String) a.first, INetworkApi.class);
        LinkedList linkedList = new LinkedList();
        if (cVar.f87321d != null && !cVar.f87321d.isEmpty()) {
            for (Entry entry : cVar.f87321d.entrySet()) {
                linkedList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        if (iNetworkApi != null) {
            try {
                C12534t execute = iNetworkApi.doGet(true, -1, str, linkedHashMap, linkedList, d).execute();
                dVar.f87330b = execute.mo30510a();
                dVar.f87331c = execute.f33301a.f33120c;
                dVar.f87332d = (String) execute.f33302b;
            } catch (HttpResponseException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getClass());
                sb.append(":");
                sb.append(e.getMessage());
                dVar.f87331c = sb.toString();
                dVar.f87330b = e.getStatusCode();
                dVar.f87333e = e;
            } catch (CronetIOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.getClass());
                sb2.append(":");
                sb2.append(e2.getMessage());
                dVar.f87331c = sb2.toString();
                dVar.f87333e = e2;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo85558a(Map<String, String> map, boolean z) {
        NetUtil.putCommonParams(map, true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6 = new android.util.Pair<>(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return r6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<byte[], java.lang.String> m107946a(byte[] r5, com.p280ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.CompressType r6) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0008
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r5, r0)
        L_0x0008:
            int r1 = r5.length     // Catch:{ Throwable -> 0x006b }
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$CompressType r2 = com.p280ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.CompressType.GZIP     // Catch:{ Throwable -> 0x006b }
            r3 = 128(0x80, float:1.794E-43)
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r6) goto L_0x003a
            if (r1 <= r3) goto L_0x003a
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x006b }
            r6.<init>(r4)     // Catch:{ Throwable -> 0x006b }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x006b }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x006b }
            r1.write(r5)     // Catch:{ Throwable -> 0x002d }
            r1.close()     // Catch:{ Throwable -> 0x006b }
            byte[] r6 = r6.toByteArray()     // Catch:{ Throwable -> 0x006b }
            java.lang.String r5 = "gzip"
        L_0x0029:
            r0 = r5
            goto L_0x006c
        L_0x002b:
            r6 = move-exception
            goto L_0x0036
        L_0x002d:
            android.util.Pair r6 = new android.util.Pair     // Catch:{ all -> 0x002b }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x002b }
            r1.close()     // Catch:{ Throwable -> 0x006b }
            return r6
        L_0x0036:
            r1.close()     // Catch:{ Throwable -> 0x006b }
            throw r6     // Catch:{ Throwable -> 0x006b }
        L_0x003a:
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$CompressType r2 = com.p280ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.CompressType.DEFLATER     // Catch:{ Throwable -> 0x006b }
            if (r2 != r6) goto L_0x006b
            if (r1 <= r3) goto L_0x006b
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x006b }
            r6.<init>(r4)     // Catch:{ Throwable -> 0x006b }
            java.util.zip.Deflater r1 = new java.util.zip.Deflater     // Catch:{ Throwable -> 0x006b }
            r1.<init>()     // Catch:{ Throwable -> 0x006b }
            r1.setInput(r5)     // Catch:{ Throwable -> 0x006b }
            r1.finish()     // Catch:{ Throwable -> 0x006b }
            byte[] r2 = new byte[r4]     // Catch:{ Throwable -> 0x006b }
        L_0x0052:
            boolean r3 = r1.finished()     // Catch:{ Throwable -> 0x006b }
            if (r3 != 0) goto L_0x0061
            int r3 = r1.deflate(r2)     // Catch:{ Throwable -> 0x006b }
            r4 = 0
            r6.write(r2, r4, r3)     // Catch:{ Throwable -> 0x006b }
            goto L_0x0052
        L_0x0061:
            r1.end()     // Catch:{ Throwable -> 0x006b }
            byte[] r6 = r6.toByteArray()     // Catch:{ Throwable -> 0x006b }
            java.lang.String r5 = "deflate"
            goto L_0x0029
        L_0x006b:
            r6 = r5
        L_0x006c:
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.m107946a(byte[], com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$CompressType):android.util.Pair");
    }

    /* renamed from: a */
    public final C33453b mo85555a(C33452a aVar, C33429d dVar) {
        C33452a aVar2 = aVar;
        File file = new File(aVar2.f87317a, aVar2.f87318b);
        if (file.exists()) {
            file.delete();
        }
        C33453b bVar = new C33453b();
        try {
            final C33429d dVar2 = dVar;
            C333751 r9 = new C10183c<String>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo24885a(int i, String str) {
                    if (dVar2 != null) {
                        dVar2.mo85668a(i, -1, -1);
                    }
                }
            };
            ArrayList arrayList = null;
            if (aVar2.f87321d != null && !aVar2.f87321d.isEmpty()) {
                arrayList = new ArrayList();
                for (Entry entry : aVar2.f87321d.entrySet()) {
                    arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            ArrayList arrayList2 = arrayList;
            boolean a = m107948a(-1, aVar2.f87320c, aVar2.f87317a, null, aVar2.f87318b, r9, "download", null, arrayList2, null, null, bVar);
            if (file.exists() && a) {
                bVar.f87319a = file;
            }
        } catch (Exception e) {
            bVar.f87331c = e.getMessage();
            bVar.f87333e = e;
            AppBrandLogger.m146383e(f87209a, "", e);
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m107947a(C10104a<?> aVar, String[] strArr, List<C12461b> list, C12960e eVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C12461b bVar : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f33095a)) {
                            str = bVar.f33096b;
                        }
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (C6319n.m19593a(str)) {
            str = eVar.f27552a;
        }
        if (C6319n.m19593a(str)) {
            str = RetrofitUtils.m37899a(exc);
        }
        if (!C6319n.m19593a(str)) {
            if (strArr != null && strArr.length > 0) {
                strArr[0] = str;
            }
            if (aVar != null) {
                aVar.f27498a = str;
                if (aVar.f27499b != null) {
                    aVar.f27499b.f27552a = str;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r35v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v23, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r26v2 */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r26v3 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r26v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r35v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r26v5 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r26v6 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r13v10 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r26v7 */
    /* JADX WARNING: type inference failed for: r13v13 */
    /* JADX INFO: used method not loaded: com.bytedance.ttnet.utils.RetrofitUtils.a(java.util.List, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0178, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x017b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x017c, code lost:
        r14 = r12;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x017e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0181, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0188, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x018c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x018d, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0190, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0191, code lost:
        r14 = r4;
        r3 = r7;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0196, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0197, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01a1, code lost:
        r2.f87330b = ((com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException) r0).getStatusCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01d0, code lost:
        r26 = com.bytedance.ttnet.utils.RetrofitUtils.m37900a((java.util.List) r13, "X-TT-LOGID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01e9, code lost:
        r3 = (com.bytedance.frameworks.baselib.network.http.C10104a) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01f0, code lost:
        ((com.bytedance.retrofit2.C12489l) r4).doCollect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0206, code lost:
        if (r3.f27504g <= 0) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0208, code lost:
        r3.f27504g = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x020a, code lost:
        r3.f27505h = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x020e, code lost:
        if (r3.f27522y != null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0210, code lost:
        r3.f27522y.put("ex", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x024d, code lost:
        r0 = (java.lang.Exception) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0250, code lost:
        r0 = new java.lang.Exception(r0.getMessage(), r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0265, code lost:
        com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a().mo24738d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0271, code lost:
        r4.cancel();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r13v1
      assigns: []
      uses: []
      mth insns count: 283
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x017e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:74:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0181 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:74:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:52:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0190 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:52:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a1 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01d0 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01e9 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01f0 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0200 A[Catch:{ Throwable -> 0x009f, all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x024d A[Catch:{ all -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0250 A[Catch:{ all -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0271 A[Catch:{ Throwable -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2 A[SYNTHETIC, Splitter:B:52:0x00a2] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m107948a(int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.bytedance.frameworks.baselib.network.http.util.C10183c<java.lang.String> r33, java.lang.String r34, com.bytedance.frameworks.baselib.network.http.util.C10188h r35, java.util.List<com.bytedance.retrofit2.p637a.C12461b> r36, java.lang.String[] r37, int[] r38, com.p280ss.android.ugc.aweme.miniapp_api.model.p1399a.C33456d r39) throws java.lang.Exception {
        /*
            r27 = this;
            r1 = r29
            r2 = r39
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r29)
            r3 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "url is empty"
            r2.f87331c = r0
            return r3
        L_0x0010:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            android.util.Pair r0 = com.bytedance.frameworks.baselib.network.http.util.C10191k.m30270a(r1, r8)
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.second
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class<com.bytedance.ttnet.INetworkApi> r0 = com.bytedance.ttnet.INetworkApi.class
            java.lang.Object r0 = com.bytedance.ttnet.utils.RetrofitUtils.m37898a(r4, r0)
            r4 = r0
            com.bytedance.ttnet.INetworkApi r4 = (com.bytedance.ttnet.INetworkApi) r4
            com.bytedance.ttnet.c.e r11 = new com.bytedance.ttnet.c.e
            r11.<init>()
            r12 = -1
            if (r4 != 0) goto L_0x0039
            java.lang.String r0 = "createSsService fail"
            r2.f87331c = r0
            return r3
        L_0x0039:
            r5 = 0
            r6 = -1
            r14 = 0
            r9 = r36
            r10 = r11
            com.bytedance.retrofit2.b r4 = r4.downloadFile(r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x0245, all -> 0x023f }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            android.content.Context r0 = r0.mo31461a()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            boolean r0 = com.p280ss.android.ugc.aweme.miniapp.impl.C33399g.m108018a(r0)     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "network is not available"
            r2.f87331c = r0     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r14)     // Catch:{ Throwable -> 0x005d }
            if (r4 == 0) goto L_0x005d
            r4.cancel()     // Catch:{ Throwable -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            r0 = move-exception
            goto L_0x0243
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            r12 = r14
            goto L_0x023d
        L_0x0065:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            com.bytedance.frameworks.baselib.network.http.f$e r0 = com.bytedance.frameworks.baselib.network.http.C10142f.m30121d()     // Catch:{ Throwable -> 0x023a, all -> 0x0237 }
            if (r0 == 0) goto L_0x007f
            boolean r0 = r0.mo24810b(r1)     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            if (r0 == 0) goto L_0x007f
            com.bytedance.frameworks.baselib.network.connectionclass.b r0 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            r0.mo24737c()     // Catch:{ Throwable -> 0x0061, all -> 0x005e }
            r0 = 1
            r7 = 1
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            com.bytedance.retrofit2.t r0 = r4.execute()     // Catch:{ Throwable -> 0x0231, all -> 0x022e }
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "ssResponse is null"
            r2.f87331c = r0     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r7 == 0) goto L_0x0093
            com.bytedance.frameworks.baselib.network.connectionclass.b r0 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
            r0.mo24738d()
        L_0x0093:
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r14)     // Catch:{ Throwable -> 0x009b }
            if (r4 == 0) goto L_0x009b
            r4.cancel()     // Catch:{ Throwable -> 0x009b }
        L_0x009b:
            return r3
        L_0x009c:
            r0 = move-exception
            goto L_0x0263
        L_0x009f:
            r0 = move-exception
            r3 = r7
            goto L_0x0062
        L_0x00a2:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0196, Throwable -> 0x0190, all -> 0x018c }
            com.bytedance.retrofit2.a.d r3 = r0.f33301a     // Catch:{ Exception -> 0x018a, Throwable -> 0x0190, all -> 0x018c }
            java.lang.Object r3 = r3.f33123f     // Catch:{ Exception -> 0x018a, Throwable -> 0x0190, all -> 0x018c }
            boolean r10 = r3 instanceof com.bytedance.frameworks.baselib.network.http.C10104a     // Catch:{ Exception -> 0x018a, Throwable -> 0x0190, all -> 0x018c }
            if (r10 == 0) goto L_0x00b8
            com.bytedance.frameworks.baselib.network.http.a r3 = (com.bytedance.frameworks.baselib.network.http.C10104a) r3     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b9
        L_0x00b1:
            r0 = move-exception
            r3 = r14
            r13 = r3
        L_0x00b4:
            r26 = r13
            goto L_0x019d
        L_0x00b8:
            r3 = r14
        L_0x00b9:
            if (r3 == 0) goto L_0x00c1
            r3.f27504g = r8     // Catch:{ Exception -> 0x00be }
            goto L_0x00c1
        L_0x00be:
            r0 = move-exception
            r13 = r14
            goto L_0x00b4
        L_0x00c1:
            T r10 = r0.f33302b     // Catch:{ Exception -> 0x0188, Throwable -> 0x0190, all -> 0x018c }
            com.bytedance.retrofit2.mime.TypedInput r10 = (com.bytedance.retrofit2.mime.TypedInput) r10     // Catch:{ Exception -> 0x0188, Throwable -> 0x0190, all -> 0x018c }
            if (r10 == 0) goto L_0x00cc
            java.io.InputStream r12 = r10.mo10444in()     // Catch:{ Exception -> 0x00be }
            goto L_0x00cd
        L_0x00cc:
            r12 = r14
        L_0x00cd:
            java.util.List r13 = r0.mo30511b()     // Catch:{ Exception -> 0x0184, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r15 = "X-TT-LOGID"
            java.lang.String r26 = com.bytedance.ttnet.utils.RetrofitUtils.m37900a(r13, r15)     // Catch:{ Exception -> 0x017b, Throwable -> 0x0181, all -> 0x017e }
            m107947a(r3, r14, r13, r11, r14)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            int r15 = r0.mo30510a()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r2.f87330b = r15     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            com.bytedance.retrofit2.a.d r0 = r0.f33301a     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r0 = r0.f33120c     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r2.f87331c = r0     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r0 = 200(0xc8, float:2.8E-43)
            if (r15 != r0) goto L_0x0153
            if (r10 == 0) goto L_0x0153
            r10.length()     // Catch:{ Exception -> 0x014f, Throwable -> 0x014a, all -> 0x0145 }
            long r16 = r10.length()     // Catch:{ Exception -> 0x014f, Throwable -> 0x014a, all -> 0x0145 }
            com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$2 r0 = new com.ss.android.ugc.aweme.miniapp.impl.NetWorkImpl$2     // Catch:{ Exception -> 0x014f, Throwable -> 0x014a, all -> 0x0145 }
            r10 = r27
            r0.<init>(r1, r4)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r19 = -1
            r21 = 0
            r25 = 0
            r15 = r12
            r18 = r0
            r20 = r30
            r22 = r32
            r23 = r33
            r24 = r34
            boolean r0 = com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30223a(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            if (r0 == 0) goto L_0x0133
            boolean r15 = r4 instanceof com.bytedance.retrofit2.C12489l     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            if (r15 == 0) goto L_0x011b
            r15 = r4
            com.bytedance.retrofit2.l r15 = (com.bytedance.retrofit2.C12489l) r15     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r15.doCollect()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x011b:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            if (r3 == 0) goto L_0x0123
            r3.f27505h = r14     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x0123:
            r16 = 0
            long r14 = r14 - r5
            r30 = r14
            r32 = r5
            r34 = r29
            r35 = r26
            r36 = r3
            com.bytedance.frameworks.baselib.network.http.C10142f.m30101a(r30, r32, r34, r35, r36)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x0133:
            if (r7 == 0) goto L_0x013c
            com.bytedance.frameworks.baselib.network.connectionclass.b r1 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
            r1.mo24738d()
        L_0x013c:
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r12)     // Catch:{ Throwable -> 0x0144 }
            if (r4 == 0) goto L_0x0144
            r4.cancel()     // Catch:{ Throwable -> 0x0144 }
        L_0x0144:
            return r0
        L_0x0145:
            r0 = move-exception
            r10 = r27
            goto L_0x0262
        L_0x014a:
            r0 = move-exception
            r10 = r27
            goto L_0x0234
        L_0x014f:
            r0 = move-exception
            r10 = r27
            goto L_0x0179
        L_0x0153:
            if (r15 != r0) goto L_0x015f
            if (r10 != 0) goto L_0x015f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r10 = "HTTP TypedInput may not be null"
            r0.<init>(r10)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            throw r0     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x015f:
            com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r0 = new com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r14 = "get url = "
            r10.<init>(r14)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r10.append(r1)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r14 = " exception"
            r10.append(r14)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            r0.<init>(r15, r10)     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
            throw r0     // Catch:{ Exception -> 0x0178, Throwable -> 0x0181, all -> 0x017e }
        L_0x0178:
            r0 = move-exception
        L_0x0179:
            r14 = r12
            goto L_0x019d
        L_0x017b:
            r0 = move-exception
            r14 = r12
            goto L_0x019b
        L_0x017e:
            r0 = move-exception
            goto L_0x0262
        L_0x0181:
            r0 = move-exception
            goto L_0x0234
        L_0x0184:
            r0 = move-exception
            r14 = r12
            r13 = 0
            goto L_0x019b
        L_0x0188:
            r0 = move-exception
            goto L_0x0199
        L_0x018a:
            r0 = move-exception
            goto L_0x0198
        L_0x018c:
            r0 = move-exception
            r14 = 0
            goto L_0x0263
        L_0x0190:
            r0 = move-exception
            r14 = r4
            r3 = r7
            r12 = 0
            goto L_0x0249
        L_0x0196:
            r0 = move-exception
            r8 = r12
        L_0x0198:
            r3 = 0
        L_0x0199:
            r13 = 0
            r14 = 0
        L_0x019b:
            r26 = 0
        L_0x019d:
            boolean r10 = r0 instanceof com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r10 == 0) goto L_0x01aa
            r10 = r0
            com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r10 = (com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException) r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            int r10 = r10.getStatusCode()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.f87330b = r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x01aa:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r10.<init>()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.Class r12 = r0.getClass()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r10.append(r12)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r12 = ":"
            r10.append(r12)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r12 = r0.getMessage()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r10.append(r12)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.f87331c = r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.f87333e = r0     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r26)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x01d8
            java.lang.String r2 = "X-TT-LOGID"
            java.lang.String r2 = com.bytedance.ttnet.utils.RetrofitUtils.m37900a(r13, r2)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r26 = r2
        L_0x01d8:
            if (r3 != 0) goto L_0x01ec
            boolean r2 = r4 instanceof com.bytedance.retrofit2.C12490m     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x01ec
            r2 = r4
            com.bytedance.retrofit2.m r2 = (com.bytedance.retrofit2.C12490m) r2     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.Object r2 = r2.getRequestInfo()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            boolean r10 = r2 instanceof com.bytedance.frameworks.baselib.network.http.C10104a     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r10 == 0) goto L_0x01ec
            com.bytedance.frameworks.baselib.network.http.a r2 = (com.bytedance.frameworks.baselib.network.http.C10104a) r2     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r3 = r2
        L_0x01ec:
            boolean r2 = r4 instanceof com.bytedance.retrofit2.C12489l     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x01f6
            r2 = r4
            com.bytedance.retrofit2.l r2 = (com.bytedance.retrofit2.C12489l) r2     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.doCollect()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x01f6:
            r2 = 0
            m107947a(r3, r2, r13, r11, r0)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r3 == 0) goto L_0x021b
            long r12 = r3.f27504g     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r15 = 0
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 > 0) goto L_0x020a
            r3.f27504g = r8     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x020a:
            r3.f27505h = r10     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            org.json.JSONObject r2 = r3.f27522y     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            if (r2 == 0) goto L_0x021b
            org.json.JSONObject r2 = r3.f27522y     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            java.lang.String r8 = "ex"
            java.lang.String r9 = r0.getMessage()     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            r2.put(r8, r9)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x021b:
            r2 = 0
            long r8 = r10 - r5
            r30 = r8
            r32 = r5
            r34 = r29
            r35 = r26
            r36 = r3
            r37 = r0
            com.bytedance.frameworks.baselib.network.http.C10142f.m30102a(r30, r32, r34, r35, r36, r37)     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
            throw r0     // Catch:{ Throwable -> 0x009f, all -> 0x009c }
        L_0x022e:
            r0 = move-exception
            r2 = r14
            goto L_0x0263
        L_0x0231:
            r0 = move-exception
            r2 = r14
            r12 = r2
        L_0x0234:
            r14 = r4
            r3 = r7
            goto L_0x0249
        L_0x0237:
            r0 = move-exception
            r2 = r14
            goto L_0x0243
        L_0x023a:
            r0 = move-exception
            r2 = r14
            r12 = r2
        L_0x023d:
            r14 = r4
            goto L_0x0249
        L_0x023f:
            r0 = move-exception
            r2 = r14
            r4 = r2
            r14 = r4
        L_0x0243:
            r7 = 0
            goto L_0x0263
        L_0x0245:
            r0 = move-exception
            r2 = r14
            r12 = r2
            r14 = r12
        L_0x0249:
            boolean r1 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x025f }
            if (r1 == 0) goto L_0x0250
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ all -> 0x025f }
            goto L_0x025e
        L_0x0250:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x025f }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x025f }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x025f }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x025f }
            r0 = r1
        L_0x025e:
            throw r0     // Catch:{ all -> 0x025f }
        L_0x025f:
            r0 = move-exception
            r7 = r3
            r4 = r14
        L_0x0262:
            r14 = r12
        L_0x0263:
            if (r7 == 0) goto L_0x026c
            com.bytedance.frameworks.baselib.network.connectionclass.b r1 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
            r1.mo24738d()
        L_0x026c:
            com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r14)     // Catch:{ Throwable -> 0x0274 }
            if (r4 == 0) goto L_0x0274
            r4.cancel()     // Catch:{ Throwable -> 0x0274 }
        L_0x0274:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp.impl.NetWorkImpl.m107948a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.c, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.h, java.util.List, java.lang.String[], int[], com.ss.android.ugc.aweme.miniapp_api.model.a.d):boolean");
    }
}
