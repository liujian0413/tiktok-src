package com.bytedance.p073ad.symphony.p076b.p077a;

import com.bytedance.common.utility.C6319n;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.p074a.C2092b;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p076b.C2113d;
import com.bytedance.p073ad.symphony.p078c.C2116a;
import com.bytedance.p073ad.symphony.p078c.C2129h;
import com.bytedance.p073ad.symphony.p081e.C2141a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2146e;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p073ad.symphony.provider.C2192a;
import com.bytedance.p073ad.symphony.provider.C2195b;
import com.bytedance.p073ad.symphony.provider.C2197c;
import com.bytedance.p073ad.symphony.provider.InhouseAdProvider;
import com.bytedance.p073ad.symphony.util.C2203f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.b.a.g */
public final class C2109g extends C2096a<C2087d> implements C2113d {

    /* renamed from: j */
    public boolean f7216j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7783a() {
        return "NativeAdManager";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7790c() {
        this.f7188c.put(Integer.valueOf(AbsNativeAdProvider.INHOUSE_PROVIDER_ID * 1000), new InhouseAdProvider(this.f7191f, new C2146e(), this));
    }

    /* renamed from: b */
    public final void mo7807b(List<C2142a> list) {
        mo7787a(list, AbsNativeAdProvider.SUPPORT_NATIVE_AD_PROVIDERS, C2113d.class);
    }

    public C2109g(C2110h hVar) {
        super(hVar, "sp_native_fill_strategy", "{\"display_sort\":[9000,1000,2000],\"preload_sort\":[[9000],[1000],[2000]]}");
        this.f7216j = hVar.f7217e;
    }

    /* renamed from: f */
    private void m9305f(String str) {
        C2159a a = this.f7192g.mo7853a(str);
        if (a != null && a.mo7848b() != null) {
            for (Integer intValue : a.mo7848b()) {
                C2195b bVar = (C2195b) this.f7188c.get(Integer.valueOf(intValue.intValue()));
                if (bVar instanceof AbsNativeAdProvider) {
                    ((AbsNativeAdProvider) bVar).markBidLoss(str);
                }
            }
        }
    }

    /* renamed from: e */
    private List<Integer> m9304e(String str) {
        C2159a a = this.f7192g.mo7853a(str);
        if (a == null || a.mo7848b() == null) {
            return new ArrayList();
        }
        List<Integer> b = a.mo7848b();
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : b) {
            int intValue2 = intValue.intValue();
            if (AbsNativeAdProvider.isHeaderBiddingProvider(intValue2)) {
                arrayList.add(Integer.valueOf(intValue2));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private String m9303c(List<String> list) {
        Iterator it;
        mo7791c("get header bidding info：");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            C2116a aVar = new C2116a();
            if (!C2203f.m9514a(list)) {
                for (String str : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("placement_type", str);
                    C2195b bVar = (C2195b) this.f7188c.get(Integer.valueOf(mo7782a(this.f7192g.mo7853a(str), str, true)));
                    if (bVar != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("placement_id", bVar.getPlacementId(str));
                        jSONObject3.put("provider_id", bVar.getProviderId());
                        m9302a(bVar, jSONObject3, str);
                        jSONObject2.put("preloaded_ad_info", jSONObject3);
                        aVar.f7229b = 1;
                    }
                    List e = m9304e(str);
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = e.iterator();
                    while (it2.hasNext()) {
                        C2195b bVar2 = (C2195b) this.f7188c.get(Integer.valueOf(((Integer) it2.next()).intValue()));
                        if (!(bVar2 instanceof C2197c) || !bVar2.hasValidAd(str)) {
                            it = it2;
                        } else {
                            C2197c cVar = (C2197c) bVar2;
                            JSONObject jSONObject4 = new JSONObject();
                            it = it2;
                            jSONObject4.put("ad_price", cVar.getMaxPrice(str));
                            jSONObject4.put("provider_id", bVar2.getProviderId());
                            jSONObject4.put("placement_id", bVar2.getPlacementId(str));
                            jSONObject4.put("bid_id", cVar.getBidId(str));
                            m9302a(bVar, jSONObject4, str);
                            jSONArray2.put(jSONObject4);
                            aVar.f7228a = 1;
                        }
                        it2 = it;
                    }
                    if (jSONArray2.length() > 0) {
                        jSONObject2.put("header_bidding_info", jSONArray2);
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("ad_info_upload", jSONArray);
            C2129h.m9334a(aVar);
        } catch (Exception e2) {
            C2140e.m9360a(e2);
        }
        new StringBuilder("header bidding info:").append(jSONObject.toString());
        return jSONObject.toString();
    }

    /* renamed from: a */
    public final String mo7805a(String str, boolean z) {
        if (C2203f.m9515a(this.f7194i)) {
            return "";
        }
        List list = (List) this.f7194i.get(str);
        mo7786a(list);
        return m9303c(list);
    }

    /* renamed from: a */
    private static C2141a m9301a(List<C2141a> list, String str) {
        if (C2203f.m9514a(list) || C6319n.m19593a(str)) {
            return null;
        }
        for (C2141a aVar : list) {
            List<String> list2 = aVar.f7273b;
            if (!C2203f.m9514a(list2)) {
                for (String equals : list2) {
                    if (str.equals(equals)) {
                        return aVar;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo7806a(String str, List<C2141a> list) {
        List<String> d = mo7792d(str);
        if (!C2203f.m9514a(d)) {
            for (String str2 : d) {
                C2141a a = m9301a(list, str2);
                if (a == null) {
                    m9305f(str2);
                } else if (!AbsNativeAdProvider.isHeaderBiddingProvider(mo7781a(a))) {
                    m9305f(str2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9302a(C2195b bVar, JSONObject jSONObject, String str) {
        if ((bVar instanceof C2192a) && C2140e.m9361b() != null && C2140e.m9361b().f7296c) {
            C2092b nextAdWithoutFill = ((C2192a) bVar).getNextAdWithoutFill(str);
            if (nextAdWithoutFill instanceof C2087d) {
                try {
                    jSONObject.put("headline", ((C2087d) nextAdWithoutFill).mo7764c());
                    jSONObject.put("body", ((C2087d) nextAdWithoutFill).mo7765d());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
