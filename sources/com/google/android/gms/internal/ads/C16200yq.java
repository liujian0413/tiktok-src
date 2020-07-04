package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.yq */
public final class C16200yq extends RemoteCreator<C16192yi> {
    public C16200yq() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof C16192yi) {
            return (C16192yi) queryLocalInterface;
        }
        return new C16193yj(iBinder);
    }
}
