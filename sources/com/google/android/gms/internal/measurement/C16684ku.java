package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ku */
public abstract class C16684ku {

    /* renamed from: M */
    protected volatile int f46608M = -1;

    /* renamed from: a */
    public abstract C16684ku mo42654a(C16676km kmVar) throws IOException;

    /* renamed from: a */
    public void mo42655a(C16678ko koVar) throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo42656b() {
        return 0;
    }

    /* renamed from: d */
    public final int mo43167d() {
        if (this.f46608M < 0) {
            mo43168e();
        }
        return this.f46608M;
    }

    /* renamed from: e */
    public final int mo43168e() {
        int b = mo42656b();
        this.f46608M = b;
        return b;
    }

    public String toString() {
        return C16685kv.m54813a(this);
    }

    /* renamed from: c */
    public C16684ku clone() throws CloneNotSupportedException {
        return (C16684ku) super.clone();
    }
}
