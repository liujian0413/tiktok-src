package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class bwt {

    /* renamed from: a */
    private final byte[] f44066a;

    /* renamed from: b */
    private int f44067b;

    /* renamed from: c */
    private int f44068c;

    /* renamed from: d */
    private final /* synthetic */ bwp f44069d;

    private bwt(bwp bwp, byte[] bArr) {
        this.f44069d = bwp;
        this.f44066a = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo41413a() {
        try {
            if (this.f44069d.f44063b) {
                this.f44069d.f44062a.mo40600a(this.f44066a);
                this.f44069d.f44062a.mo40597a(this.f44067b);
                this.f44069d.f44062a.mo40602b(this.f44068c);
                this.f44069d.f44062a.mo40601a((int[]) null);
                this.f44069d.f44062a.mo40596a();
            }
        } catch (RemoteException e) {
            afm.m45775a("Clearcut log failed", e);
        }
    }

    /* renamed from: a */
    public final bwt mo41412a(int i) {
        this.f44067b = i;
        return this;
    }

    /* renamed from: b */
    public final bwt mo41414b(int i) {
        this.f44068c = i;
        return this;
    }
}
