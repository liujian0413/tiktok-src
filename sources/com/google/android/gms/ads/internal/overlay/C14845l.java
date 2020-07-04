package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.C15333p;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acl;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.l */
public final class C14845l {
    /* renamed from: a */
    public static void m43136a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f38418k == 4 && adOverlayInfoParcel.f38410c == null) {
            if (adOverlayInfoParcel.f38409b != null) {
                adOverlayInfoParcel.f38409b.mo7870v_();
            }
            C14834a.m43102a(context, adOverlayInfoParcel.f38408a, adOverlayInfoParcel.f38416i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f38420m.f45680d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m43100a(intent, adOverlayInfoParcel);
        if (!C15333p.m44600g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        acl.m45526a(context, intent);
    }
}
