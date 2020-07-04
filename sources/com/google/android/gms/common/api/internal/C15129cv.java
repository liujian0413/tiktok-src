package com.google.android.gms.common.api.internal;

import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C17054c;
import com.google.android.gms.tasks.C17057f;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.cv */
final class C15129cv implements C17054c<Map<C15110cd<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C15127ct f39131a;

    private C15129cv(C15127ct ctVar) {
        this.f39131a = ctVar;
    }

    /* renamed from: a */
    public final void mo37270a(C17057f<Map<C15110cd<?>, String>> fVar) {
        this.f39131a.f39118f.lock();
        try {
            if (this.f39131a.f39126n) {
                if (fVar.mo44294b()) {
                    this.f39131a.f39127o = new ArrayMap(this.f39131a.f39113a.size());
                    for (C15126cs csVar : this.f39131a.f39113a.values()) {
                        this.f39131a.f39127o.put(csVar.f38886d, ConnectionResult.f38845a);
                    }
                } else if (fVar.mo44297e() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) fVar.mo44297e();
                    if (this.f39131a.f39124l) {
                        this.f39131a.f39127o = new ArrayMap(this.f39131a.f39113a.size());
                        for (C15126cs csVar2 : this.f39131a.f39113a.values()) {
                            C15110cd<O> cdVar = csVar2.f38886d;
                            ConnectionResult connectionResult = availabilityException.getConnectionResult(csVar2);
                            if (this.f39131a.m43922a(csVar2, connectionResult)) {
                                this.f39131a.f39127o.put(cdVar, new ConnectionResult(16));
                            } else {
                                this.f39131a.f39127o.put(cdVar, connectionResult);
                            }
                        }
                    } else {
                        this.f39131a.f39127o = availabilityException.zaj();
                    }
                    this.f39131a.f39130r = this.f39131a.m43940k();
                } else {
                    this.f39131a.f39127o = Collections.emptyMap();
                    this.f39131a.f39130r = new ConnectionResult(8);
                }
                if (this.f39131a.f39128p != null) {
                    this.f39131a.f39127o.putAll(this.f39131a.f39128p);
                    this.f39131a.f39130r = this.f39131a.m43940k();
                }
                if (this.f39131a.f39130r == null) {
                    this.f39131a.m43936i();
                    this.f39131a.m43938j();
                } else {
                    this.f39131a.f39126n = false;
                    this.f39131a.f39117e.mo38300a(this.f39131a.f39130r);
                }
                this.f39131a.f39121i.signalAll();
                this.f39131a.f39118f.unlock();
            }
        } finally {
            this.f39131a.f39118f.unlock();
        }
    }
}
