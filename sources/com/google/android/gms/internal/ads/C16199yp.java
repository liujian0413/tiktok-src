package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.C14916b;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.yp */
public final class C16199yp implements C14916b {

    /* renamed from: a */
    private final C16184ya f45431a;

    public C16199yp(C16184ya yaVar) {
        this.f45431a = yaVar;
    }

    /* renamed from: a */
    public final String mo37946a() {
        if (this.f45431a == null) {
            return null;
        }
        try {
            return this.f45431a.mo42078a();
        } catch (RemoteException e) {
            afm.m45780c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    /* renamed from: b */
    public final int mo37947b() {
        if (this.f45431a == null) {
            return 0;
        }
        try {
            return this.f45431a.mo42079b();
        } catch (RemoteException e) {
            afm.m45780c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
