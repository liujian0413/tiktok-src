package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15636ds;
import com.google.android.gms.internal.ads.C16123vu;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.afy;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzyv;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.ag */
final class C14775ag implements Callable<C15636ds> {

    /* renamed from: a */
    private final /* synthetic */ int f38166a;

    /* renamed from: b */
    private final /* synthetic */ JSONArray f38167b;

    /* renamed from: c */
    private final /* synthetic */ int f38168c;

    /* renamed from: d */
    private final /* synthetic */ abk f38169d;

    /* renamed from: e */
    private final /* synthetic */ C14772ad f38170e;

    C14775ag(C14772ad adVar, int i, JSONArray jSONArray, int i2, abk abk) {
        this.f38170e = adVar;
        this.f38166a = i;
        this.f38167b = jSONArray;
        this.f38168c = i2;
        this.f38169d = abk;
    }

    public final /* synthetic */ Object call() throws Exception {
        Bundle bundle;
        if (this.f38166a >= this.f38167b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f38167b.get(this.f38166a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        C14772ad adVar = new C14772ad(this.f38170e.f38140e.f38268c, this.f38170e.f38144i, this.f38170e.f38140e.f38274i, this.f38170e.f38140e.f38267b, this.f38170e.f38298n, this.f38170e.f38140e.f38270e, true);
        C14772ad.m42786a(this.f38170e.f38140e, adVar.f38140e);
        adVar.mo37641F();
        adVar.mo37590a(this.f38170e.f38137b);
        C15600ck ckVar = adVar.f38136a;
        int i = this.f38166a;
        ckVar.mo41458a("num_ads_requested", String.valueOf(this.f38168c));
        ckVar.mo41458a("ad_index", String.valueOf(i));
        zzaxe zzaxe = this.f38169d.f39887a;
        String jSONObject2 = jSONObject.toString();
        if (zzaxe.f45573c.f45779c != null) {
            bundle = new Bundle(zzaxe.f45573c.f45779c);
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("_ad", jSONObject2);
        zzyv zzyv = r5;
        zzyv zzyv2 = new zzyv(zzaxe.f45573c.f45777a, zzaxe.f45573c.f45778b, bundle2, zzaxe.f45573c.f45780d, zzaxe.f45573c.f45781e, zzaxe.f45573c.f45782f, zzaxe.f45573c.f45783g, zzaxe.f45573c.f45784h, zzaxe.f45573c.f45785i, zzaxe.f45573c.f45786j, zzaxe.f45573c.f45787k, zzaxe.f45573c.f45788l, zzaxe.f45573c.f45789m, zzaxe.f45573c.f45790n, zzaxe.f45573c.f45791o, zzaxe.f45573c.f45792p, zzaxe.f45573c.f45793q, zzaxe.f45573c.f45794r, null, zzaxe.f45573c.f45796t, zzaxe.f45573c.f45797u);
        C16123vu vuVar = new C16123vu(zzaxe.f45572b, zzyv, zzaxe.f45574d, zzaxe.f45575e, zzaxe.f45576f, zzaxe.f45577g, zzaxe.f45579i, zzaxe.f45580j, zzaxe.f45581k, zzaxe.f45582l, zzaxe.f45584n, zzaxe.f45596z, zzaxe.f45585o, zzaxe.f45586p, zzaxe.f45587q, zzaxe.f45588r, zzaxe.f45589s, zzaxe.f45590t, zzaxe.f45591u, zzaxe.f45592v, zzaxe.f45593w, zzaxe.f45594x, zzaxe.f45595y, zzaxe.f45539B, zzaxe.f45540C, zzaxe.f45546I, zzaxe.f45541D, zzaxe.f45542E, zzaxe.f45543F, zzaxe.f45544G, afy.m45817a(zzaxe.f45545H), zzaxe.f45547J, zzaxe.f45548K, zzaxe.f45549L, zzaxe.f45550M, zzaxe.f45551N, zzaxe.f45552O, zzaxe.f45553P, zzaxe.f45554Q, zzaxe.f45558U, afy.m45817a(zzaxe.f45578h), zzaxe.f45559V, zzaxe.f45560W, zzaxe.f45561X, 1, zzaxe.f45563Z, zzaxe.f45565aa, zzaxe.f45566ab, zzaxe.f45567ac, zzaxe.f45568ad, zzaxe.f45569ae, zzaxe.f45571ag);
        adVar.mo37725a(vuVar, adVar.f38136a);
        return (C15636ds) adVar.f38153j.get();
    }
}
