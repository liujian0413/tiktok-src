package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;

@C6505uv
public final class aic extends ahu {
    /* renamed from: a */
    public final aht mo39408a(Context context, aik aik, int i, boolean z, C15600ck ckVar, aij aij) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        boolean z2 = false;
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        ail ail = new ail(context, aik.mo39472k(), aik.mo39469g(), ckVar, aik.mo39465c());
        if (VERSION.SDK_INT < 16) {
            int i2 = i;
        } else if (i == 2) {
            z2 = true;
        }
        if (z2) {
            List asList = Arrays.asList(aij.f40315e.split(","));
            if (asList.contains("3")) {
                ajq ajq = new ajq(context, ail, aik, z, m45923a(aik), aij);
                return ajq;
            } else if (asList.contains("1")) {
                aiw aiw = new aiw(context, ail, aik, i, z, m45923a(aik), aij);
                return aiw;
            }
        } else {
            aij aij2 = aij;
        }
        boolean a = m45923a(aik);
        ail ail2 = new ail(context, aik.mo39472k(), aik.mo39469g(), ckVar, aik.mo39465c());
        ahh ahh = new ahh(context, z, a, aij, ail2);
        return ahh;
    }
}
