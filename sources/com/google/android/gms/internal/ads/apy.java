package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class apy {

    /* renamed from: a */
    public atq f40903a;

    private apy(atq atq) {
        this.f40903a = atq;
    }

    /* renamed from: a */
    static final apy m46888a(atq atq) throws GeneralSecurityException {
        if (atq != null && atq.mo40028a() > 0) {
            return new apy(atq);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        return aqh.m46915a(this.f40903a).toString();
    }
}
