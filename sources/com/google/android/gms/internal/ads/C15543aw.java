package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.aw */
public final class C15543aw extends RemoteCreator<C15466aa> {
    public C15543aw() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof C15466aa) {
            return (C15466aa) queryLocalInterface;
        }
        return new C15469ac(iBinder);
    }
}
