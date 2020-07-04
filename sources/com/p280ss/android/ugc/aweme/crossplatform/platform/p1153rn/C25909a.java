package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.p717d.C13613j;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.graphic.RNCanvas.RNCanvasPackage;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.business.BusinessModule;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common.ReactCommonModule;
import com.p280ss.android.ugc.aweme.framework.p1273b.C29951b;
import com.p280ss.android.ugc.aweme.p1216fe.registry.p1224rn.AmeRNBridgeModule;
import com.p280ss.android.ugc.aweme.poi.p1472rn.C35226d;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.swmansion.gesturehandler.react.C46382e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.a */
public final class C25909a extends C29951b {
    /* renamed from: d */
    public final boolean mo67295d() {
        return C7213d.m22500a().mo18811k();
    }

    /* renamed from: b */
    public final boolean mo67293b() {
        return ((Boolean) SharePrefCache.inst().getRnPreloadContextOn().mo59877d()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo67294c() {
        return ((Boolean) SharePrefCache.inst().getRnSnapshotOn().mo59877d()).booleanValue();
    }

    /* renamed from: e */
    public final C13594b mo67296e() {
        C13595c cVar = new C13595c();
        cVar.mo33153a(Config.ARGB_8888);
        cVar.mo33154a(false);
        return new C13594b(cVar);
    }

    /* renamed from: a */
    public final List<ReactPackage> mo67289a() {
        ArrayList arrayList = new ArrayList();
        ReactPackage footprintPackageInstance = C24436a.m80356a().getFootprintPackageInstance();
        arrayList.add(new C35226d());
        arrayList.add(new C46382e());
        arrayList.add(new RNCanvasPackage());
        if (footprintPackageInstance != null) {
            arrayList.add(footprintPackageInstance);
        } else if (!C6399b.m19944t()) {
            if (C24436a.m80356a() instanceof EmptyCommerceService) {
                C2077a.m9159a("Service instance is null");
            } else {
                C2077a.m9159a("Footprint instance is null");
            }
        }
        return arrayList;
    }

    public C25909a(C13613j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    public final View mo67288a(Context context) {
        DmtStatusView dmtStatusView = new DmtStatusView(context);
        dmtStatusView.setBuilder(C10803a.m31631a(context));
        dmtStatusView.mo25942f();
        return dmtStatusView;
    }

    /* renamed from: a */
    public final List<NativeModule> mo67290a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new ReactCommonModule(reactApplicationContext), new BusinessModule(reactApplicationContext), new AmeRNBridgeModule(reactApplicationContext)});
    }

    /* renamed from: a */
    public final void mo67291a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith(WebKitApi.SCHEME_HTTP)) {
            super.mo67291a(str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rn_is_ues_fresco", mo67295d());
                jSONObject.put("rn_image_key", str);
                jSONObject.put("rn_image_is_success", 0);
            } catch (JSONException unused) {
            }
            C6893q.m21452b("service_monitor", "rn_fresco_fast_image", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo67292a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.startsWith(WebKitApi.SCHEME_HTTP)) {
            super.mo67292a(str, z);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rn_is_ues_fresco", mo67295d());
                jSONObject.put("rn_image_key", str);
                jSONObject.put("rn_image_is_cache", z);
                jSONObject.put("rn_image_is_success", 1);
            } catch (JSONException unused) {
            }
            C6893q.m21452b("service_monitor", "rn_fresco_fast_image", jSONObject);
        }
    }
}
