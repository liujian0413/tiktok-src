package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C6505uv
public final class bxw extends RemoteCreator<C15779j> {
    public bxw() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final C15698g mo41427a(Context context, zzyz zzyz, String str, C15931oq oqVar, int i) {
        try {
            IBinder a = ((C15779j) mo38689a(context)).mo41666a(C15349d.m44668a(context), zzyz, str, oqVar, 15302000, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15698g) {
                return (C15698g) queryLocalInterface;
            }
            return new C15752i(a);
        } catch (RemoteException | RemoteCreatorException e) {
            afm.m45775a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof C15779j) {
            return (C15779j) queryLocalInterface;
        }
        return new C15806k(iBinder);
    }
}
