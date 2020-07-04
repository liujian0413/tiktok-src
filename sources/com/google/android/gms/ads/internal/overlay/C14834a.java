package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.bym;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.a */
public final class C14834a {
    /* renamed from: a */
    public static boolean m43102a(Context context, zzc zzc, C14853t tVar) {
        int i;
        if (zzc == null) {
            acd.m45783e("No intent data for launcher overlay.");
            return false;
        }
        C15585bw.m50188a(context);
        if (zzc.f38472f != null) {
            return m43101a(context, zzc.f38472f, tVar);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzc.f38467a)) {
            acd.m45783e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.f38468b)) {
            intent.setDataAndType(Uri.parse(zzc.f38467a), zzc.f38468b);
        } else {
            intent.setData(Uri.parse(zzc.f38467a));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.f38469c)) {
            intent.setPackage(zzc.f38469c);
        }
        if (!TextUtils.isEmpty(zzc.f38470d)) {
            String[] split = zzc.f38470d.split("/", 2);
            if (split.length < 2) {
                String str = "Could not parse component name from open GMSG: ";
                String valueOf = String.valueOf(zzc.f38470d);
                acd.m45783e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str2 = zzc.f38471e;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                acd.m45783e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43906cu)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43905ct)).booleanValue()) {
                acl.m45543b(context, intent);
            }
        }
        return m43101a(context, intent, tVar);
    }

    /* renamed from: a */
    private static boolean m43101a(Context context, Intent intent, C14853t tVar) {
        String str = "Launching an intent: ";
        try {
            String valueOf = String.valueOf(intent.toURI());
            acd.m45438a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            acl.m45526a(context, intent);
            if (tVar != null) {
                tVar.mo37580G_();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            acd.m45783e(e.getMessage());
            return false;
        }
    }
}
