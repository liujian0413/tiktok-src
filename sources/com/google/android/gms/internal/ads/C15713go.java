package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.go */
public final class C15713go extends RemoteCreator<C15672fa> {
    public C15713go() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof C15672fa) {
            return (C15672fa) queryLocalInterface;
        }
        return new C15673fb(iBinder);
    }
}
