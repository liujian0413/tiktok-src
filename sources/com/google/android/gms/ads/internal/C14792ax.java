package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.ads.internal.ax */
final class C14792ax {

    /* renamed from: a */
    public final String f38209a;

    /* renamed from: b */
    public final Map<String, String> f38210b = new TreeMap();

    /* renamed from: c */
    public String f38211c;

    /* renamed from: d */
    public String f38212d;

    public C14792ax(String str) {
        this.f38209a = str;
    }

    /* renamed from: a */
    public final void mo37697a(zzyv zzyv, zzbgz zzbgz) {
        this.f38211c = zzyv.f45786j.f45502a;
        Bundle bundle = zzyv.f45789m != null ? zzyv.f45789m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) bym.m50299d().mo41272a(C15585bw.f43890ce);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.f38212d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f38210b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.f38210b.put("SDKVersion", zzbgz.f45677a);
        }
    }
}
