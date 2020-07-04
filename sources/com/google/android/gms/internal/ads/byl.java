package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C15181e;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

abstract class byl<T> {

    /* renamed from: a */
    private static final C15995r f44194a = m50289c();

    byl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo41439a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo41440a(C15995r rVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo41441b() throws RemoteException;

    /* renamed from: c */
    private static C15995r m50289c() {
        try {
            Object newInstance = bye.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (!(newInstance instanceof IBinder)) {
                afm.m45783e("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof C15995r) {
                return (C15995r) queryLocalInterface;
            }
            return new C16049t(iBinder);
        } catch (Exception unused) {
            afm.m45783e("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    /* renamed from: d */
    private final T m50290d() {
        if (f44194a == null) {
            afm.m45783e("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo41440a(f44194a);
        } catch (RemoteException e) {
            afm.m45780c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: e */
    private final T m50291e() {
        try {
            return mo41441b();
        } catch (RemoteException e) {
            afm.m45780c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final T mo41442a(Context context, boolean z) {
        T t;
        boolean z2 = true;
        if (!z && !afb.m45738c(context, C15181e.f39276b)) {
            afm.m45777b("Google Play Services is not available.");
            z = true;
        }
        if (DynamiteModule.m44682a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m44690b(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        C15585bw.m50188a(context);
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43872cM)).booleanValue()) {
            z = false;
        }
        if (z) {
            t = m50290d();
            if (t == null) {
                t = m50291e();
            }
        } else {
            T e = m50291e();
            int i = e == null ? 1 : 0;
            if (i != 0) {
                if (bym.m50302g().nextInt(((Integer) bym.m50299d().mo41272a(C15585bw.f43942dd)).intValue()) != 0) {
                    z2 = false;
                }
                if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    bym.m50296a().mo39273a(context, bym.m50301f().f45677a, "gmob-apps", bundle, true);
                }
            }
            t = e == null ? m50290d() : e;
        }
        return t == null ? mo41439a() : t;
    }
}
