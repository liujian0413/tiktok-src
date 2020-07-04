package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.p763e.C16377j;

/* renamed from: com.google.android.gms.maps.model.c */
public final class C16771c {

    /* renamed from: a */
    private final C16377j f46883a;

    public C16771c(C16377j jVar) {
        this.f46883a = (C16377j) C15267r.m44384a(jVar);
    }

    /* renamed from: a */
    public final void mo43458a() {
        try {
            this.f46883a.mo42466J_();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo43459b() {
        try {
            this.f46883a.mo42468b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16771c)) {
            return false;
        }
        try {
            return this.f46883a.mo42467a(((C16771c) obj).f46883a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f46883a.mo42469c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
