package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

@C6505uv
public final class bwp {

    /* renamed from: a */
    bgb f44062a;

    /* renamed from: b */
    boolean f44063b;

    /* renamed from: a */
    public final bwt mo41411a(byte[] bArr) {
        return new bwt(this, bArr);
    }

    public bwp(Context context, String str, String str2) {
        C15585bw.m50188a(context);
        try {
            this.f44062a = (bgb) afn.m45786a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", bwq.f44064a);
            C15349d.m44668a(context);
            this.f44062a.mo40599a(C15349d.m44668a(context), str, null);
            this.f44063b = true;
        } catch (RemoteException | zzbgx | NullPointerException unused) {
            afm.m45777b("Cannot dynamite load clearcut");
        }
    }

    public bwp(Context context) {
        C15585bw.m50188a(context);
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43866cG)).booleanValue()) {
            try {
                this.f44062a = (bgb) afn.m45786a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", bwr.f44065a);
                C15349d.m44668a(context);
                this.f44062a.mo40598a(C15349d.m44668a(context), "GMA_SDK");
                this.f44063b = true;
            } catch (RemoteException | zzbgx | NullPointerException unused) {
                afm.m45777b("Cannot dynamite load clearcut");
            }
        }
    }

    public bwp() {
    }
}
