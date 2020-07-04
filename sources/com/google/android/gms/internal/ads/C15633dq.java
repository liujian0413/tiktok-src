package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dq */
public class C15633dq {

    /* renamed from: a */
    public static boolean f44343a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    private static String f44344b = "Volley";

    /* renamed from: c */
    private static final String f44345c = C15633dq.class.getName();

    /* renamed from: com.google.android.gms.internal.ads.dq$a */
    static class C15634a {

        /* renamed from: a */
        public static final boolean f44346a = C15633dq.f44343a;

        /* renamed from: b */
        private final List<C15661eq> f44347b = new ArrayList();

        /* renamed from: c */
        private boolean f44348c = false;

        C15634a() {
        }

        /* renamed from: a */
        public final synchronized void mo41605a(String str, long j) {
            if (!this.f44348c) {
                List<C15661eq> list = this.f44347b;
                C15661eq eqVar = new C15661eq(str, j, SystemClock.elapsedRealtime());
                list.add(eqVar);
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: a */
        public final synchronized void mo41604a(String str) {
            long j;
            this.f44348c = true;
            if (this.f44347b.size() == 0) {
                j = 0;
            } else {
                j = ((C15661eq) this.f44347b.get(this.f44347b.size() - 1)).f44417c - ((C15661eq) this.f44347b.get(0)).f44417c;
            }
            if (j > 0) {
                long j2 = ((C15661eq) this.f44347b.get(0)).f44417c;
                Object[] objArr = {Long.valueOf(j), str};
                for (C15661eq eqVar : this.f44347b) {
                    long j3 = eqVar.f44417c;
                    Object[] objArr2 = {Long.valueOf(j3 - j2), Long.valueOf(eqVar.f44416b), eqVar.f44415a};
                    j2 = j3;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            if (!this.f44348c) {
                mo41604a("Request on the loose");
            }
        }
    }
}
