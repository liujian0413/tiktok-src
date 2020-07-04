package com.p280ss.android.ugc.aweme.utils;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.utils.w */
public final class C43173w {

    /* renamed from: a */
    private static final boolean f111804a = C7163a.m22363a();

    /* renamed from: a */
    public static void m136924a(Runnable runnable) {
        m136931d(runnable, "BoltsUtils");
    }

    /* renamed from: b */
    public static void m136929b(Runnable runnable) {
        m136925a(runnable, "BoltsUtils");
    }

    /* renamed from: a */
    public static boolean m136926a(C1592h hVar) {
        if (hVar == null || hVar.mo6889d() || hVar.mo6887c() || hVar.mo6890e() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static final /* synthetic */ Void m136927b(Runnable runnable, String str) throws Exception {
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }

    /* renamed from: c */
    static final /* synthetic */ Void m136930c(Runnable runnable, String str) throws Exception {
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m136923a(String str, C1592h hVar) throws Exception {
        if (hVar == null) {
            boolean z = f111804a;
        } else {
            hVar.mo6889d();
        }
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Void m136928b(String str, C1592h hVar) throws Exception {
        if (hVar == null) {
            boolean z = f111804a;
        } else {
            hVar.mo6889d();
        }
        return null;
    }

    /* renamed from: a */
    public static void m136925a(Runnable runnable, String str) {
        C1592h.m7853a((Callable<TResult>) new C43174x<TResult>(runnable, str)).mo6875a((C1591g<TResult, TContinuationResult>) new C43175y<TResult,TContinuationResult>(str));
    }

    /* renamed from: d */
    private static void m136931d(Runnable runnable, String str) {
        C1592h.m7855a((Callable<TResult>) new C43176z<TResult>(runnable, str), C1592h.f5958b).mo6875a((C1591g<TResult, TContinuationResult>) new C42913aa<TResult,TContinuationResult>(str));
    }
}
