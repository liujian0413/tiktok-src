package com.p280ss.android.ugc.aweme.thread;

import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.thread.n */
final class C7268n {

    /* renamed from: a */
    private C7272o f20334a;

    /* renamed from: b */
    private C7270a f20335b;

    /* renamed from: com.ss.android.ugc.aweme.thread.n$a */
    public interface C7270a {
        /* renamed from: a */
        ExecutorService mo18972a(C7265m mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.thread.n$b */
    static class C7271b {

        /* renamed from: a */
        public static final C7268n f20336a = new C7268n();
    }

    /* renamed from: a */
    static C7268n m22763a() {
        return C7271b.f20336a;
    }

    private C7268n() {
        this.f20334a = new C7272o();
        this.f20335b = new C7246d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final JSONObject mo18998b() {
        if (C7258h.m22723a().f20307a) {
            try {
                return this.f20334a.mo18999a();
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ExecutorService mo18997a(C7265m mVar, boolean z) {
        ExecutorService a = this.f20335b.mo18972a(mVar);
        if (C7258h.m22723a().f20307a) {
            this.f20334a.mo19000a(mVar.f20320a, a, z);
        }
        return a;
    }
}
