package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cr */
final class C15125cr implements C15087bj {

    /* renamed from: a */
    private final /* synthetic */ C15122co f39108a;

    private C15125cr(C15122co coVar) {
        this.f39108a = coVar;
    }

    /* renamed from: a */
    public final void mo38299a(Bundle bundle) {
        this.f39108a.f39104m.lock();
        try {
            this.f39108a.f39102k = ConnectionResult.f38845a;
            this.f39108a.m43895e();
        } finally {
            this.f39108a.f39104m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38300a(ConnectionResult connectionResult) {
        this.f39108a.f39104m.lock();
        try {
            this.f39108a.f39102k = connectionResult;
            this.f39108a.m43895e();
        } finally {
            this.f39108a.f39104m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38298a(int i, boolean z) {
        this.f39108a.f39104m.lock();
        try {
            if (this.f39108a.f39103l) {
                this.f39108a.f39103l = false;
                this.f39108a.m43881a(i, z);
                return;
            }
            this.f39108a.f39103l = true;
            this.f39108a.f39095d.mo38257a(i);
            this.f39108a.f39104m.unlock();
        } finally {
            this.f39108a.f39104m.unlock();
        }
    }

    /* synthetic */ C15125cr(C15122co coVar, C15123cp cpVar) {
        this(coVar);
    }
}
