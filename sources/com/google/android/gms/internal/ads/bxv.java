package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C6505uv
public final class bxv extends RemoteCreator<C15644e> {
    public bxv() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final C15553b mo41426a(Context context, String str, C15931oq oqVar) {
        try {
            IBinder a = ((C15644e) mo38689a(context)).mo41617a(C15349d.m44668a(context), str, oqVar, 15302000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof C15553b) {
                return (C15553b) queryLocalInterface;
            }
            return new C15616d(a);
        } catch (RemoteException | RemoteCreatorException e) {
            afm.m45780c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof C15644e) {
            return (C15644e) queryLocalInterface;
        }
        return new C15671f(iBinder);
    }
}
