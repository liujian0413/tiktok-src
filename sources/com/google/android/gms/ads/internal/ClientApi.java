package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C14850q;
import com.google.android.gms.ads.internal.overlay.C14851r;
import com.google.android.gms.ads.internal.overlay.C14852s;
import com.google.android.gms.ads.internal.overlay.C14857x;
import com.google.android.gms.ads.internal.overlay.C14858y;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15553b;
import com.google.android.gms.internal.ads.C15648ed;
import com.google.android.gms.internal.ads.C15650ef;
import com.google.android.gms.internal.ads.C15663es;
import com.google.android.gms.internal.ads.C15668ex;
import com.google.android.gms.internal.ads.C15698g;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C16019rx;
import com.google.android.gms.internal.ads.C16022s;
import com.google.android.gms.internal.ads.C16030sh;
import com.google.android.gms.internal.ads.C16156x;
import com.google.android.gms.internal.ads.C16179xw;
import com.google.android.gms.internal.ads.C16189yf;
import com.google.android.gms.internal.ads.C16228zr;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;
import java.util.HashMap;

@C6505uv
public class ClientApi extends C16022s {
    /* renamed from: a */
    public final C16156x mo37569a(C15345b bVar) {
        return null;
    }

    /* renamed from: b */
    public final C16030sh mo37573b(C15345b bVar) {
        return null;
    }

    /* renamed from: b */
    public final C16228zr mo37574b(C15345b bVar, String str, C15931oq oqVar, int i) {
        return null;
    }

    /* renamed from: a */
    public final C15698g mo37568a(C15345b bVar, zzyz zzyz, String str, C15931oq oqVar, int i) throws RemoteException {
        Context context = (Context) C15349d.m44669a(bVar);
        C14818bw bwVar = new C14818bw(context, zzyz, str, oqVar, new zzbgz(15302000, i, true, acl.m45566l(context)), C14816bu.m43012a(context));
        return bwVar;
    }

    /* renamed from: a */
    public final C15698g mo37567a(C15345b bVar, zzyz zzyz, String str, int i) throws RemoteException {
        Context context = (Context) C15349d.m44669a(bVar);
        return new C14786ar(context, zzyz, str, new zzbgz(15302000, i, true, acl.m45566l(context)));
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.bt.a(com.google.android.gms.internal.ads.bl):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.bym.m50299d().mo41272a((com.google.android.gms.internal.ads.C15573bl) com.google.android.gms.internal.ads.C15585bw.f43766aM)).booleanValue() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.bym.m50299d().mo41272a((com.google.android.gms.internal.ads.C15573bl) com.google.android.gms.internal.ads.C15585bw.f43767aN)).booleanValue() != false) goto L_0x0049;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C15698g mo37572b(com.google.android.gms.dynamic.C15345b r8, com.google.android.gms.internal.ads.zzyz r9, java.lang.String r10, com.google.android.gms.internal.ads.C15931oq r11, int r12) throws android.os.RemoteException {
        /*
            r7 = this;
            java.lang.Object r8 = com.google.android.gms.dynamic.C15349d.m44669a(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            com.google.android.gms.internal.ads.C15585bw.m50188a(r1)
            com.google.android.gms.internal.ads.zzbgz r5 = new com.google.android.gms.internal.ads.zzbgz
            boolean r8 = com.google.android.gms.internal.ads.acl.m45566l(r1)
            r0 = 1
            r2 = 15302000(0xe97d70, float:2.1442669E-38)
            r5.<init>(r2, r12, r0, r8)
            java.lang.String r8 = "reward_mb"
            java.lang.String r12 = r9.f45798a
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x0033
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.C15585bw.f43766aM
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r12 = r2.mo41272a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0049
        L_0x0033:
            if (r8 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r8 = com.google.android.gms.internal.ads.C15585bw.f43767aN
            com.google.android.gms.internal.ads.bt r12 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r8 = r12.mo41272a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.kz r8 = new com.google.android.gms.internal.ads.kz
            com.google.android.gms.ads.internal.bu r9 = com.google.android.gms.ads.internal.C14816bu.m43012a(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005a:
            com.google.android.gms.ads.internal.n r8 = new com.google.android.gms.ads.internal.n
            com.google.android.gms.ads.internal.bu r6 = com.google.android.gms.ads.internal.C14816bu.m43012a(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.mo37572b(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.zzyz, java.lang.String, com.google.android.gms.internal.ads.oq, int):com.google.android.gms.internal.ads.g");
    }

    /* renamed from: a */
    public final C15553b mo37564a(C15345b bVar, String str, C15931oq oqVar, int i) {
        Context context = (Context) C15349d.m44669a(bVar);
        C14831m mVar = new C14831m(context, str, oqVar, new zzbgz(15302000, i, true, acl.m45566l(context)), C14816bu.m43012a(context));
        return mVar;
    }

    /* renamed from: a */
    public final C16156x mo37570a(C15345b bVar, int i) {
        Context context = (Context) C15349d.m44669a(bVar);
        return C14869z.m43186a(context, new zzbgz(15302000, i, true, acl.m45566l(context)));
    }

    /* renamed from: a */
    public final C15663es mo37565a(C15345b bVar, C15345b bVar2) {
        return new C15648ed((FrameLayout) C15349d.m44669a(bVar), (FrameLayout) C15349d.m44669a(bVar2));
    }

    /* renamed from: a */
    public final C15668ex mo37566a(C15345b bVar, C15345b bVar2, C15345b bVar3) {
        return new C15650ef((View) C15349d.m44669a(bVar), (HashMap) C15349d.m44669a(bVar2), (HashMap) C15349d.m44669a(bVar3));
    }

    /* renamed from: a */
    public final C16189yf mo37571a(C15345b bVar, C15931oq oqVar, int i) {
        Context context = (Context) C15349d.m44669a(bVar);
        return new C16179xw(context, C14816bu.m43012a(context), oqVar, new zzbgz(15302000, i, true, acl.m45566l(context)));
    }

    /* renamed from: c */
    public final C16019rx mo37575c(C15345b bVar) {
        Activity activity = (Activity) C15349d.m44669a(bVar);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.m43099a(activity.getIntent());
        if (a == null) {
            return new C14851r(activity);
        }
        switch (a.f38418k) {
            case 1:
                return new C14850q(activity);
            case 2:
                return new C14857x(activity);
            case 3:
                return new C14858y(activity);
            case 4:
                return new C14852s(activity, a);
            default:
                return new C14851r(activity);
        }
    }
}
