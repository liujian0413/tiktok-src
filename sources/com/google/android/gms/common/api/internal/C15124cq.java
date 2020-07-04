package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cq */
final class C15124cq implements C15087bj {

    /* renamed from: a */
    private final /* synthetic */ C15122co f39107a;

    private C15124cq(C15122co coVar) {
        this.f39107a = coVar;
    }

    /* renamed from: a */
    public final void mo38299a(Bundle bundle) {
        this.f39107a.f39104m.lock();
        try {
            this.f39107a.m43882a(bundle);
            this.f39107a.f39101j = ConnectionResult.f38845a;
            this.f39107a.m43895e();
        } finally {
            this.f39107a.f39104m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38300a(ConnectionResult connectionResult) {
        this.f39107a.f39104m.lock();
        try {
            this.f39107a.f39101j = connectionResult;
            this.f39107a.m43895e();
        } finally {
            this.f39107a.f39104m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo38298a(int i, boolean z) {
        this.f39107a.f39104m.lock();
        try {
            if (!this.f39107a.f39103l && this.f39107a.f39102k != null) {
                if (this.f39107a.f39102k.mo38154b()) {
                    this.f39107a.f39103l = true;
                    this.f39107a.f39096e.mo38257a(i);
                    this.f39107a.f39104m.unlock();
                    return;
                }
            }
            this.f39107a.f39103l = false;
            this.f39107a.m43881a(i, z);
        } finally {
            this.f39107a.f39104m.unlock();
        }
    }

    /* synthetic */ C15124cq(C15122co coVar, C15123cp cpVar) {
        this(coVar);
    }
}
