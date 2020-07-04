package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;

/* renamed from: com.google.android.gms.common.api.internal.w */
public final class C15156w implements C15069at {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15070au f39209a;

    /* renamed from: b */
    private boolean f39210b;

    public C15156w(C15070au auVar) {
        this.f39209a = auVar;
    }

    /* renamed from: a */
    public final void mo38292a() {
    }

    /* renamed from: a */
    public final void mo38294a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo38295a(ConnectionResult connectionResult, C15017a<?> aVar, boolean z) {
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.gms.common.api.a$h<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <A extends com.google.android.gms.common.api.C15017a.C15019b, T extends com.google.android.gms.common.api.internal.C15104c.C15105a<? extends com.google.android.gms.common.api.C15044g, A>> T mo38291a(T r4) {
        /*
            r3 = this;
            com.google.android.gms.common.api.internal.au r0 = r3.f39209a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.al r0 = r0.f38992d     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.bw r0 = r0.f38956e     // Catch:{ DeadObjectException -> 0x0045 }
            r0.mo38359a(r4)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.au r0 = r3.f39209a     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.internal.al r0 = r0.f38992d     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A> r1 = r4.f39058a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r0 = r0.f38953b     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$f r0 = (com.google.android.gms.common.api.C15017a.C15028f) r0     // Catch:{ DeadObjectException -> 0x0045 }
            java.lang.String r1 = "Appropriate Api was not requested."
            com.google.android.gms.common.internal.C15267r.m44385a(r0, r1)     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r0.mo38216g()     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 != 0) goto L_0x0039
            com.google.android.gms.common.api.internal.au r1 = r3.f39209a     // Catch:{ DeadObjectException -> 0x0045 }
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r1 = r1.f38990b     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$c<A> r2 = r4.f39058a     // Catch:{ DeadObjectException -> 0x0045 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0039
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ DeadObjectException -> 0x0045 }
            r1 = 17
            r0.<init>(r1)     // Catch:{ DeadObjectException -> 0x0045 }
            r4.mo38364b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0039:
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.C15268s     // Catch:{ DeadObjectException -> 0x0045 }
            if (r1 == 0) goto L_0x0041
            com.google.android.gms.common.internal.s r0 = (com.google.android.gms.common.internal.C15268s) r0     // Catch:{ DeadObjectException -> 0x0045 }
            com.google.android.gms.common.api.a$h<T> r0 = r0.f39465a     // Catch:{ DeadObjectException -> 0x0045 }
        L_0x0041:
            r4.mo38365b(r0)     // Catch:{ DeadObjectException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            com.google.android.gms.common.api.internal.au r0 = r3.f39209a
            com.google.android.gms.common.api.internal.x r1 = new com.google.android.gms.common.api.internal.x
            r1.<init>(r3, r3)
            r0.mo38314a(r1)
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15156w.mo38291a(com.google.android.gms.common.api.internal.c$a):com.google.android.gms.common.api.internal.c$a");
    }

    /* renamed from: b */
    public final boolean mo38296b() {
        if (this.f39210b) {
            return false;
        }
        if (this.f39209a.f38992d.mo38302m()) {
            this.f39210b = true;
            for (C15097bt a : this.f39209a.f38992d.f38955d) {
                a.mo38354a();
            }
            return false;
        }
        this.f39209a.mo38312a((ConnectionResult) null);
        return true;
    }

    /* renamed from: c */
    public final void mo38297c() {
        if (this.f39210b) {
            this.f39210b = false;
            this.f39209a.mo38314a((C15071av) new C15158y(this, this));
        }
    }

    /* renamed from: a */
    public final void mo38293a(int i) {
        this.f39209a.mo38312a((ConnectionResult) null);
        this.f39209a.f38993e.mo38298a(i, this.f39210b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo38442d() {
        if (this.f39210b) {
            this.f39210b = false;
            this.f39209a.f38992d.f38956e.mo38358a();
            mo38296b();
        }
    }
}
