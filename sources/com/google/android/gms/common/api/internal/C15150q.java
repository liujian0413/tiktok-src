package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C15041e.C15042a;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17058g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.q */
public final class C15150q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f39198a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C17058g<?>, Boolean> f39199b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38437a(BasePendingResult<? extends C15044g> basePendingResult, boolean z) {
        this.f39198a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo38261a((C15042a) new C15151r(this, basePendingResult));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <TResult> void mo38438a(C17058g<TResult> gVar, boolean z) {
        this.f39199b.put(gVar, Boolean.valueOf(z));
        gVar.f47728a.mo44285a((C17054c<TResult>) new C15152s<TResult>(this, gVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo38439a() {
        return !this.f39198a.isEmpty() || !this.f39199b.isEmpty();
    }

    /* renamed from: b */
    public final void mo38440b() {
        m44058a(false, C15133d.f39142a);
    }

    /* renamed from: c */
    public final void mo38441c() {
        m44058a(true, C15100bw.f39051a);
    }

    /* renamed from: a */
    private final void m44058a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f39198a) {
            hashMap = new HashMap(this.f39198a);
        }
        synchronized (this.f39199b) {
            hashMap2 = new HashMap(this.f39199b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo38269c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C17058g) entry2.getKey()).mo44300b((Exception) new ApiException(status));
            }
        }
    }
}
