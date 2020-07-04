package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16679kp;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.kp */
public abstract class C16679kp<M extends C16679kp<M>> extends C16684ku {

    /* renamed from: L */
    protected C16681kr f46593L;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo42656b() {
        if (this.f46593L == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f46593L.f46599a; i2++) {
            i += this.f46593L.mo43157b(i2).mo43161a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo42655a(C16678ko koVar) throws IOException {
        if (this.f46593L != null) {
            for (int i = 0; i < this.f46593L.f46599a; i++) {
                this.f46593L.mo43157b(i).mo43162a(koVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo43146a(C16676km kmVar, int i) throws IOException {
        int i2 = kmVar.mo43130i();
        if (!kmVar.mo43117a(i)) {
            return false;
        }
        int i3 = i >>> 3;
        C16686kw kwVar = new C16686kw(i, kmVar.mo43118a(i2, kmVar.mo43130i() - i2));
        C16682ks ksVar = null;
        if (this.f46593L == null) {
            this.f46593L = new C16681kr();
        } else {
            ksVar = this.f46593L.mo43154a(i3);
        }
        if (ksVar == null) {
            ksVar = new C16682ks();
            this.f46593L.mo43155a(i3, ksVar);
        }
        ksVar.mo43163a(kwVar);
        return true;
    }

    /* renamed from: c */
    public final /* synthetic */ C16684ku mo43147c() throws CloneNotSupportedException {
        return (C16679kp) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        C16679kp kpVar = (C16679kp) super.clone();
        C16683kt.m54803a(this, kpVar);
        return kpVar;
    }
}
