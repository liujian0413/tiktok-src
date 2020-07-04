package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.gn */
public final class C15712gn extends RemoteCreator<C15666ev> {
    public C15712gn() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final C15663es mo41644a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder a = ((C15666ev) mo38689a(context)).mo41634a(C15349d.m44668a(context), C15349d.m44668a(frameLayout), C15349d.m44668a(frameLayout2), 15302000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof C15663es) {
                return (C15663es) queryLocalInterface;
            }
            return new C15665eu(a);
        } catch (RemoteException | RemoteCreatorException e) {
            afm.m45780c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof C15666ev) {
            return (C15666ev) queryLocalInterface;
        }
        return new C15667ew(iBinder);
    }
}
