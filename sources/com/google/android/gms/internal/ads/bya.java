package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.p743c.C14741a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C6505uv
public final class bya {

    /* renamed from: a */
    public static final bya f44160a = new bya();

    protected bya() {
    }

    /* renamed from: a */
    public static zzyv m50259a(Context context, C15499ar arVar) {
        List list;
        Context context2;
        C15499ar arVar2 = arVar;
        Date date = arVar2.f40930a;
        long time = date != null ? date.getTime() : -1;
        String str = arVar2.f40931b;
        int i = arVar2.f40932c;
        Set<String> set = arVar2.f40933d;
        if (!set.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(set));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a = arVar2.mo39953a(context2);
        int i2 = arVar2.f40941l;
        Location location = arVar2.f40934e;
        Bundle a2 = arVar2.mo39952a(AdMobAdapter.class);
        boolean z = arVar2.f40935f;
        String str2 = arVar2.f40938i;
        C14741a aVar = arVar2.f40940k;
        zzacm zzacm = aVar != null ? new zzacm(aVar) : null;
        Context applicationContext = context.getApplicationContext();
        zzyv zzyv = r3;
        zzyv zzyv2 = new zzyv(8, time, a2, i, list, a, i2, z, str2, zzacm, location, str, arVar2.f40936g, arVar2.f40942m, Collections.unmodifiableList(new ArrayList(arVar2.f40943n)), arVar2.f40939j, applicationContext != null ? afb.m45725a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName()) : null, arVar2.f40944o, null, arVar2.f40945p, arVar2.f40946q);
        return zzyv;
    }
}
