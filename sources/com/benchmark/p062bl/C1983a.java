package com.benchmark.p062bl;

import android.os.RemoteException;
import bolts.C1591g;
import bolts.C1592h;
import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C1957a;
import com.benchmark.C1977b;
import com.benchmark.C2005i;
import com.benchmark.C2013m;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.benchmark.bl.a */
public final class C1983a implements C2005i {

    /* renamed from: a */
    public static BenchmarkAPI f7035a = ((BenchmarkAPI) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(BenchmarkAPI.class));

    /* renamed from: h */
    private static C1983a f7036h = new C1983a();

    /* renamed from: b */
    private boolean f7037b;

    /* renamed from: c */
    private boolean f7038c;

    /* renamed from: d */
    private C1993k f7039d;

    /* renamed from: e */
    private List<Benchmark> f7040e = new ArrayList();

    /* renamed from: f */
    private List<Benchmark> f7041f = new ArrayList();

    /* renamed from: g */
    private List<BenchmarkResult> f7042g = new ArrayList();

    /* renamed from: i */
    private C1977b f7043i = C1977b.m9007a(C6399b.m19921a());

    /* renamed from: j */
    private C35546al f7044j = ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService();

    /* renamed from: b */
    public static C1983a m9029b() {
        return f7036h;
    }

    /* renamed from: c */
    public final void mo7635c() {
        m9034d();
    }

    /* renamed from: a */
    public final void mo7630a(Benchmark benchmark, BenchmarkResult benchmarkResult) {
        m9025a(benchmarkResult);
    }

    /* renamed from: a */
    public final void mo7631a(boolean z) {
        m9033c(z);
    }

    /* renamed from: d */
    private void m9034d() {
        mo7631a(false);
        m9036e();
    }

    /* renamed from: a */
    public final void mo7628a() {
        m9035d(this.f7042g);
    }

    /* renamed from: e */
    private void m9036e() {
        f7035a.getBenchmarks().mo6879b(C1987e.f7049a).mo6876a((C1591g<TResult, TContinuationResult>) new C1988f<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    private C1983a() {
    }

    /* renamed from: a */
    public final void mo7629a(int i) {
        m9030b(i);
    }

    /* renamed from: d */
    private void m9035d(List<BenchmarkResult> list) {
        m9037e(list);
        this.f7043i.mo7611a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo7627a(C1592h hVar) throws Exception {
        this.f7037b = false;
        if (hVar.mo6882b()) {
            this.f7042g.clear();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo7634b(List<Benchmark> list) {
        try {
            this.f7043i.mo7613a(list);
            this.f7037b = true;
            this.f7041f.clear();
            this.f7041f.addAll(list);
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo7632b(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            m9026a((BenchmarkResponse) hVar.mo6890e(), false);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Void mo7636d(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            m9026a((BenchmarkResponse) hVar.mo6890e(), true);
        }
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ BenchmarkResponse m9028b(boolean z) throws Exception {
        if (z) {
            return (BenchmarkResponse) C42996by.m136484a(C1957a.m8948b("/sdcard/benchmark.json"), BenchmarkResponse.class);
        }
        return (BenchmarkResponse) C6887b.m21436b().mo16895a(C6399b.m19921a(), "benchmark", BenchmarkResponse.class);
    }

    /* renamed from: c */
    static final /* synthetic */ C1592h m9031c(C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            C1957a.m8943a((Throwable) hVar.mo6891f());
        } else if (hVar.mo6882b() && hVar.mo6890e() != null) {
            C6887b.m21436b().mo16907b(C6399b.m19921a(), "benchmark", hVar.mo6890e());
            return hVar;
        }
        return null;
    }

    /* renamed from: e */
    private void m9037e(List<BenchmarkResult> list) {
        if (!C6311g.m19573a(list)) {
            C1592h.m7853a((Callable<TResult>) new C1991i<TResult>(new ArrayList(list))).mo6876a((C1591g<TResult, TContinuationResult>) new C1992j<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: b */
    private void m9030b(int i) {
        Object obj;
        boolean z;
        List a = m9024a(this.f7040e, i);
        StringBuilder sb = new StringBuilder("startBenchmarkTest called from ");
        sb.append(i);
        sb.append(" with run benchmark ");
        if (a == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(a.size());
        }
        sb.append(obj);
        if (!C6311g.m19573a(a) && !this.f7037b) {
            if (this.f7039d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m9027a(this.f7039d, (Runnable) new C1984b(this, a));
            } else {
                mo7634b(a);
            }
        }
    }

    /* renamed from: c */
    private void m9033c(boolean z) {
        C1592h.m7855a((Callable<TResult>) new C1985c<TResult>(z), (Executor) C7258h.m22730c()).mo6876a((C1591g<TResult, TContinuationResult>) new C1986d<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.benchmark.BenchmarkResult>, for r9v0, types: [java.util.List, java.util.List<com.benchmark.BenchmarkResult>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Boolean m9022a(java.util.List<com.benchmark.BenchmarkResult> r9) throws java.lang.Exception {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0009:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x009c
            java.lang.Object r1 = r9.next()
            com.benchmark.BenchmarkResult r1 = (com.benchmark.BenchmarkResult) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.benchmark.Benchmark r3 = r1.f6998e     // Catch:{ JSONException -> 0x0099 }
            long[] r4 = r1.f6997d     // Catch:{ JSONException -> 0x0099 }
            if (r4 == 0) goto L_0x0039
            int r5 = r4.length     // Catch:{ JSONException -> 0x0099 }
            if (r5 <= 0) goto L_0x0039
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0099 }
            r5.<init>()     // Catch:{ JSONException -> 0x0099 }
            r6 = 0
        L_0x0029:
            int r7 = r4.length     // Catch:{ JSONException -> 0x0099 }
            if (r6 >= r7) goto L_0x0034
            r7 = r4[r6]     // Catch:{ JSONException -> 0x0099 }
            r5.put(r7)     // Catch:{ JSONException -> 0x0099 }
            int r6 = r6 + 1
            goto L_0x0029
        L_0x0034:
            java.lang.String r4 = "consumeTime"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0099 }
        L_0x0039:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r1.f6996c     // Catch:{ JSONException -> 0x0099 }
            if (r4 == 0) goto L_0x006f
            int r5 = r4.size()     // Catch:{ JSONException -> 0x0099 }
            if (r5 <= 0) goto L_0x006f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0099 }
            r5.<init>()     // Catch:{ JSONException -> 0x0099 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ JSONException -> 0x0099 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x0099 }
        L_0x0050:
            boolean r6 = r4.hasNext()     // Catch:{ JSONException -> 0x0099 }
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = r4.next()     // Catch:{ JSONException -> 0x0099 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ JSONException -> 0x0099 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x0099 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ JSONException -> 0x0099 }
            r5.put(r7, r6)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x0050
        L_0x006a:
            java.lang.String r4 = "info"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0099 }
        L_0x006f:
            java.lang.String r4 = "code"
            int r5 = r1.f6994a     // Catch:{ JSONException -> 0x0099 }
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r4 = "failedReason"
            java.lang.String r1 = r1.f6995b     // Catch:{ JSONException -> 0x0099 }
            r2.put(r4, r1)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r1 = "when"
            int r4 = r3.when     // Catch:{ JSONException -> 0x0099 }
            r2.put(r1, r4)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r1 = "id"
            int r4 = r3.f6993id     // Catch:{ JSONException -> 0x0099 }
            r2.put(r1, r4)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r1 = "times"
            int r4 = r3.times     // Catch:{ JSONException -> 0x0099 }
            r2.put(r1, r4)     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r1 = r3.name     // Catch:{ JSONException -> 0x0099 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x0009
        L_0x0099:
            goto L_0x0009
        L_0x009c:
            java.lang.String r9 = "benchmark"
            com.p280ss.android.ugc.aweme.common.C6907h.m21525a(r9, r0)
            com.ss.android.ugc.aweme.au.b r9 = com.p280ss.android.ugc.aweme.p307au.C6887b.m21436b()
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            java.lang.String r1 = "benchmark"
            r2 = 0
            r9.mo16901a(r0, r1, r2)
            r9 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.p062bl.C1983a.m9022a(java.util.List):java.lang.Boolean");
    }

    /* renamed from: a */
    private void m9025a(BenchmarkResult benchmarkResult) {
        ListIterator listIterator = this.f7041f.listIterator();
        while (listIterator.hasNext()) {
            Benchmark benchmark = (Benchmark) listIterator.next();
            if (!(benchmark == null || benchmarkResult == null || benchmarkResult.f6998e == null || benchmark.f6993id != benchmarkResult.f6998e.f6993id)) {
                this.f7042g.add(benchmarkResult);
                listIterator.remove();
                this.f7040e.remove(benchmark);
            }
        }
        if (this.f7041f.isEmpty()) {
            m9035d(this.f7042g);
        }
    }

    /* renamed from: b */
    public final void mo7633b(Benchmark benchmark, BenchmarkResult benchmarkResult) {
        m9025a(benchmarkResult);
    }

    /* renamed from: a */
    static final /* synthetic */ Void m9023a(Runnable runnable, C1592h hVar) throws Exception {
        if (hVar.mo6882b() && ((Boolean) hVar.mo6890e()).booleanValue() && runnable != null) {
            runnable.run();
        }
        return null;
    }

    /* renamed from: a */
    private static List<Benchmark> m9024a(List<Benchmark> list, int i) {
        if (C6311g.m19573a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Benchmark benchmark : list) {
            if (benchmark.when == i) {
                arrayList.add(benchmark);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m9026a(BenchmarkResponse benchmarkResponse, boolean z) {
        Object obj;
        StringBuilder sb = new StringBuilder("onBenchmarkResponse called from local ");
        sb.append(z);
        sb.append(" benchmark list ");
        if (benchmarkResponse.benchmarks == null) {
            obj = " no task ";
        } else {
            obj = Integer.valueOf(benchmarkResponse.benchmarks.size());
        }
        sb.append(obj);
        if (benchmarkResponse != null && benchmarkResponse.benchmarks != null && !this.f7037b && (!this.f7038c || this.f7040e.isEmpty())) {
            List<Benchmark> list = benchmarkResponse.benchmarks;
            this.f7039d = benchmarkResponse.resouces;
            this.f7040e.clear();
            this.f7040e.addAll(list);
            this.f7038c = z;
            m9027a(this.f7039d, (Runnable) null);
        }
    }

    /* renamed from: a */
    private static void m9027a(C1993k kVar, Runnable runnable) {
        if (kVar != null) {
            C1592h.m7855a((Callable<TResult>) new C1989g<TResult>(kVar.f7057a, kVar.f7058b, kVar.f7059c), (Executor) C7258h.m22730c()).mo6876a((C1591g<TResult, TContinuationResult>) new C1990h<TResult,TContinuationResult>(runnable), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m9021a(String str, String str2, String str3) throws Exception {
        boolean z;
        boolean a = C1957a.m8945a(C2013m.m9071a().f7078b, str);
        boolean a2 = C1957a.m8945a(C2013m.m9071a().f7079c, str2);
        boolean a3 = C1957a.m8945a(C2013m.m9071a().f7080d, str3);
        if (!a) {
            a = C1957a.m8946a(str, C2013m.m9071a().f7077a, "image.png");
        }
        if (!a2) {
            a2 = C1957a.m8946a(str2, C2013m.m9071a().f7077a, "h264_video.mp4");
        }
        if (!a3) {
            a3 = C1957a.m8946a(str3, C2013m.m9071a().f7077a, "h265_video.mp4");
        }
        if (!a || !a2 || !a3) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
