package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rw */
public final class C16018rw extends RemoteCreator<C16023sa> {
    public C16018rw() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final C16019rx mo41962a(Activity activity) {
        try {
            IBinder a = ((C16023sa) mo38689a((Context) activity)).mo41963a(C15349d.m44668a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof C16019rx) {
                return (C16019rx) queryLocalInterface;
            }
            return new C16021rz(a);
        } catch (RemoteException e) {
            afm.m45780c("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreatorException e2) {
            afm.m45780c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38690a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof C16023sa) {
            return (C16023sa) queryLocalInterface;
        }
        return new C16024sb(iBinder);
    }
}
