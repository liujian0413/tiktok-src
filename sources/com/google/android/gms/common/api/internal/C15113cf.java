package com.google.android.gms.common.api.internal;

import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17058g;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.cf */
public final class C15113cf {

    /* renamed from: a */
    private final ArrayMap<C15110cd<?>, ConnectionResult> f39074a = new ArrayMap<>();

    /* renamed from: b */
    private final ArrayMap<C15110cd<?>, String> f39075b = new ArrayMap<>();

    /* renamed from: c */
    private final C17058g<Map<C15110cd<?>, String>> f39076c = new C17058g<>();

    /* renamed from: d */
    private int f39077d;

    /* renamed from: e */
    private boolean f39078e = false;

    public C15113cf(Iterable<? extends C15034c<?>> iterable) {
        for (C15034c cVar : iterable) {
            this.f39074a.put(cVar.f38886d, null);
        }
        this.f39077d = this.f39074a.keySet().size();
    }

    /* renamed from: a */
    public final Set<C15110cd<?>> mo38373a() {
        return this.f39074a.keySet();
    }

    /* renamed from: b */
    public final C17057f<Map<C15110cd<?>, String>> mo38375b() {
        return this.f39076c.f47728a;
    }

    /* renamed from: a */
    public final void mo38374a(C15110cd<?> cdVar, ConnectionResult connectionResult, String str) {
        this.f39074a.put(cdVar, connectionResult);
        this.f39075b.put(cdVar, str);
        this.f39077d--;
        if (!connectionResult.mo38154b()) {
            this.f39078e = true;
        }
        if (this.f39077d == 0) {
            if (this.f39078e) {
                this.f39076c.mo44298a((Exception) new AvailabilityException(this.f39074a));
                return;
            }
            this.f39076c.mo44299a(this.f39075b);
        }
    }
}
