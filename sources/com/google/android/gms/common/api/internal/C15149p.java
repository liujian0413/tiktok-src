package com.google.android.gms.common.api.internal;

import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17057f;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.p */
final class C15149p implements C17054c<Map<C15110cd<?>, String>> {

    /* renamed from: a */
    private C15144k f39196a;

    /* renamed from: b */
    private final /* synthetic */ C15127ct f39197b;

    C15149p(C15127ct ctVar, C15144k kVar) {
        this.f39197b = ctVar;
        this.f39196a = kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38436a() {
        this.f39196a.mo38146h();
    }

    /* renamed from: a */
    public final void mo37270a(C17057f<Map<C15110cd<?>, String>> fVar) {
        this.f39197b.f39118f.lock();
        try {
            if (!this.f39197b.f39126n) {
                this.f39196a.mo38146h();
                return;
            }
            if (fVar.mo44294b()) {
                this.f39197b.f39128p = new ArrayMap(this.f39197b.f39114b.size());
                for (C15126cs csVar : this.f39197b.f39114b.values()) {
                    this.f39197b.f39128p.put(csVar.f38886d, ConnectionResult.f38845a);
                }
            } else if (fVar.mo44297e() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) fVar.mo44297e();
                if (this.f39197b.f39124l) {
                    this.f39197b.f39128p = new ArrayMap(this.f39197b.f39114b.size());
                    for (C15126cs csVar2 : this.f39197b.f39114b.values()) {
                        C15110cd<O> cdVar = csVar2.f38886d;
                        ConnectionResult connectionResult = availabilityException.getConnectionResult(csVar2);
                        if (this.f39197b.m43922a(csVar2, connectionResult)) {
                            this.f39197b.f39128p.put(cdVar, new ConnectionResult(16));
                        } else {
                            this.f39197b.f39128p.put(cdVar, connectionResult);
                        }
                    }
                } else {
                    this.f39197b.f39128p = availabilityException.zaj();
                }
            } else {
                this.f39197b.f39128p = Collections.emptyMap();
            }
            if (this.f39197b.mo38322f()) {
                this.f39197b.f39127o.putAll(this.f39197b.f39128p);
                if (this.f39197b.m43940k() == null) {
                    this.f39197b.m43936i();
                    this.f39197b.m43938j();
                    this.f39197b.f39121i.signalAll();
                }
            }
            this.f39196a.mo38146h();
            this.f39197b.f39118f.unlock();
        } finally {
            this.f39197b.f39118f.unlock();
        }
    }
}
