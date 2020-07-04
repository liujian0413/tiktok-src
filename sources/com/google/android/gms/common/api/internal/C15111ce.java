package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15267r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.ce */
public class C15111ce extends C15114cg {

    /* renamed from: b */
    private final SparseArray<C15112a> f39069b = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.internal.ce$a */
    class C15112a implements C15040c {

        /* renamed from: a */
        public final int f39070a;

        /* renamed from: b */
        public final C15037d f39071b;

        /* renamed from: c */
        public final C15040c f39072c;

        public C15112a(int i, C15037d dVar, C15040c cVar) {
            this.f39070a = i;
            this.f39071b = dVar;
            this.f39072c = cVar;
            dVar.mo38235a((C15040c) this);
        }

        /* renamed from: a */
        public final void mo38259a(ConnectionResult connectionResult) {
            C15111ce.this.mo38376b(connectionResult, this.f39070a);
        }
    }

    /* renamed from: b */
    public static C15111ce m43849b(C15138f fVar) {
        C15139g a = m43645a(fVar);
        C15111ce ceVar = (C15111ce) a.mo38383a("AutoManageHelper", C15111ce.class);
        if (ceVar != null) {
            return ceVar;
        }
        return new C15111ce(a);
    }

    private C15111ce(C15139g gVar) {
        super(gVar);
        this.f38934a.mo38384a("AutoManageHelper", (LifecycleCallback) this);
    }

    /* renamed from: a */
    public final void mo38370a(int i, C15037d dVar, C15040c cVar) {
        C15267r.m44385a(dVar, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f39069b.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C15267r.m44391a(z, (Object) sb.toString());
        C15115ch chVar = (C15115ch) this.f39081d.get();
        this.f39069b.put(i, new C15112a(i, dVar, cVar));
        if (this.f39080c && chVar == null) {
            dVar.mo38244e();
        }
    }

    /* renamed from: a */
    public final void mo38369a(int i) {
        C15112a aVar = (C15112a) this.f39069b.get(i);
        this.f39069b.remove(i);
        if (aVar != null) {
            aVar.f39071b.mo38240b((C15040c) aVar);
            aVar.f39071b.mo38246g();
        }
    }

    /* renamed from: b */
    public final void mo38280b() {
        super.mo38280b();
        if (this.f39081d.get() == null) {
            for (int i = 0; i < this.f39069b.size(); i++) {
                C15112a b = m43848b(i);
                if (b != null) {
                    b.f39071b.mo38244e();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo38283d() {
        super.mo38283d();
        for (int i = 0; i < this.f39069b.size(); i++) {
            C15112a b = m43848b(i);
            if (b != null) {
                b.f39071b.mo38246g();
            }
        }
    }

    /* renamed from: a */
    public final void mo38279a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f39069b.size(); i++) {
            C15112a b = m43848b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f39070a);
                printWriter.println(":");
                b.f39071b.mo38237a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38371a(ConnectionResult connectionResult, int i) {
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C15112a aVar = (C15112a) this.f39069b.get(i);
        if (aVar != null) {
            mo38369a(i);
            C15040c cVar = aVar.f39072c;
            if (cVar != null) {
                cVar.mo38259a(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo38372e() {
        for (int i = 0; i < this.f39069b.size(); i++) {
            C15112a b = m43848b(i);
            if (b != null) {
                b.f39071b.mo38244e();
            }
        }
    }

    /* renamed from: b */
    private final C15112a m43848b(int i) {
        if (this.f39069b.size() <= i) {
            return null;
        }
        return (C15112a) this.f39069b.get(this.f39069b.keyAt(i));
    }
}
