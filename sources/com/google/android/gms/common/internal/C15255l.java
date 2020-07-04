package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15017a.C15028f;

/* renamed from: com.google.android.gms.common.internal.l */
public final class C15255l {

    /* renamed from: a */
    private final SparseIntArray f39460a;

    /* renamed from: b */
    private C15167c f39461b;

    public C15255l() {
        this(GoogleApiAvailability.getInstance());
    }

    public C15255l(C15167c cVar) {
        this.f39460a = new SparseIntArray();
        C15267r.m44384a(cVar);
        this.f39461b = cVar;
    }

    /* renamed from: a */
    public final int mo38606a(Context context, C15028f fVar) {
        C15267r.m44384a(context);
        C15267r.m44384a(fVar);
        int e = fVar.mo38134e();
        int i = this.f39460a.get(e, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f39460a.size()) {
                break;
            }
            int keyAt = this.f39460a.keyAt(i2);
            if (keyAt > e && this.f39460a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.f39461b.isGooglePlayServicesAvailable(context, e);
        }
        this.f39460a.put(e, i);
        return i;
    }

    /* renamed from: a */
    public final void mo38607a() {
        this.f39460a.clear();
    }
}
