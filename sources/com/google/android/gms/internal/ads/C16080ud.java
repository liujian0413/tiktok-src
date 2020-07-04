package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14772ad;
import com.google.android.gms.ads.internal.C14817bv;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ud */
public final class C16080ud implements C16075tz<ami> {

    /* renamed from: a */
    private agj<ami> f45095a;

    /* renamed from: b */
    private final C15639dv f45096b;

    /* renamed from: c */
    private final Context f45097c;

    /* renamed from: d */
    private final zzbgz f45098d;

    /* renamed from: e */
    private final C14772ad f45099e;

    /* renamed from: f */
    private final bdt f45100f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f45101g;

    public C16080ud(Context context, C14772ad adVar, String str, bdt bdt, zzbgz zzbgz) {
        acd.m45781d("Webview loading for native ads.");
        this.f45097c = context;
        this.f45099e = adVar;
        this.f45100f = bdt;
        this.f45098d = zzbgz;
        this.f45101g = str;
        agj a = amo.m46433a(this.f45097c, this.f45098d, (String) bym.m50299d().mo41272a(C15585bw.f43818bL), this.f45100f, this.f45099e.f38144i);
        this.f45096b = new C15639dv(adVar, str);
        this.f45095a = afy.m45819a(a, (aft<? super A, ? extends B>) new C16081ue<Object,Object>(this), ago.f40190b);
        afw.m45813a(this.f45095a, "WebViewNativeAdsUtil.constructor");
    }

    /* renamed from: a */
    public final agj<JSONObject> mo42002a(JSONObject jSONObject) {
        return afy.m45819a(this.f45095a, (aft<? super A, ? extends B>) new C16082uf<Object,Object>(this, jSONObject), ago.f40189a);
    }

    /* renamed from: b */
    public final agj<JSONObject> mo42006b(JSONObject jSONObject) {
        return afy.m45819a(this.f45095a, (aft<? super A, ? extends B>) new C16083ug<Object,Object>(this, jSONObject), ago.f40189a);
    }

    /* renamed from: c */
    public final agj<JSONObject> mo42008c(JSONObject jSONObject) {
        return afy.m45819a(this.f45095a, (aft<? super A, ? extends B>) new C16084uh<Object,Object>(this, jSONObject), ago.f40189a);
    }

    /* renamed from: d */
    public final agj<JSONObject> mo42009d(JSONObject jSONObject) {
        return afy.m45819a(this.f45095a, (aft<? super A, ? extends B>) new C16085ui<Object,Object>(this, jSONObject), ago.f40189a);
    }

    /* renamed from: a */
    public final void mo42004a(String str, C15742hq<? super ami> hqVar) {
        afy.m45824a(this.f45095a, (afv<? super V>) new C16087uk<Object>(this, str, hqVar), ago.f40189a);
    }

    /* renamed from: b */
    public final void mo42007b(String str, C15742hq<? super ami> hqVar) {
        afy.m45824a(this.f45095a, (afv<? super V>) new C16088ul<Object>(this, str, hqVar), ago.f40189a);
    }

    /* renamed from: a */
    public final void mo42005a(String str, JSONObject jSONObject) {
        afy.m45824a(this.f45095a, (afv<? super V>) new C16089um<Object>(this, str, jSONObject), ago.f40189a);
    }

    /* renamed from: a */
    public final void mo42003a() {
        afy.m45824a(this.f45095a, (afv<? super V>) new C16090un<Object>(this), ago.f40189a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ agj mo42011a(JSONObject jSONObject, ami ami) throws Exception {
        jSONObject.put("ads_id", this.f45101g);
        ami.mo39814b("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return afy.m45817a(new JSONObject());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ agj mo42012b(JSONObject jSONObject, ami ami) throws Exception {
        jSONObject.put("ads_id", this.f45101g);
        ami.mo39814b("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return afy.m45817a(new JSONObject());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ agj mo42013c(JSONObject jSONObject, ami ami) throws Exception {
        jSONObject.put("ads_id", this.f45101g);
        ami.mo39814b("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return afy.m45817a(new JSONObject());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ agj mo42014d(JSONObject jSONObject, ami ami) throws Exception {
        jSONObject.put("ads_id", this.f45101g);
        agu agu = new agu();
        ami.mo39721a("/nativeAdPreProcess", (C15742hq<? super ami>) new C16086uj<Object>(this, ami, agu));
        ami.mo39814b("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return agu;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ agj mo42010a(ami ami) throws Exception {
        acd.m45781d("Javascript has loaded for native ads.");
        ami.mo39761w().mo39775a(this.f45099e, this.f45099e, this.f45099e, this.f45099e, this.f45099e, false, null, new C14817bv(this.f45097c, null, null), null, null);
        ami.mo39721a("/logScionEvent", (C15742hq<? super ami>) this.f45096b);
        return afy.m45817a(ami);
    }
}
